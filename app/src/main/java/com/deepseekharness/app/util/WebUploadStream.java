package com.deepseekharness.app.util;

import java.io.IOException;
import java.io.InputStream;

/** 固定缓冲的上传复制；跨文件累计使用 long，写入前才交给宿主空间与会话门禁。 */
public final class WebUploadStream {
  public static final int BUFFER_BYTES = 65536;

  private WebUploadStream() {}

  public interface Sink {
    void write(byte[] bytes, int count) throws IOException;
  }

  public static final class LimitExceededException extends IOException {
    private static final long serialVersionUID = 1L;

    private LimitExceededException() {
      super("UPLOAD_BATCH_BYTES");
    }
  }

  public static long copy(
      InputStream source,
      long copied,
      long limit,
      Sink target,
      WebUploadSourceRetry.Check cancellation)
      throws IOException {
    if (copied < 0 || limit < 0 || copied > limit)
      throw new IllegalArgumentException("UPLOAD_BYTE_COUNT");
    byte[] buffer = new byte[BUFFER_BYTES];
    for (; ; ) {
      cancellation.check();
      int count = source.read(buffer);
      cancellation.check();
      if (count == -1) return copied;
      if (count == 0) continue;
      if (count < 0 || count > buffer.length) throw new IOException("UPLOAD_SOURCE_READ_COUNT");
      if (count > limit - copied) throw new LimitExceededException();
      target.write(buffer, count);
      copied += count;
    }
  }
}
