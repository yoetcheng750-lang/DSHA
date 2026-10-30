package com.deepseekharness.app.util;

/** Product identity for the production application. */
public final class AppIdentity {
  private AppIdentity() {}

  public static String applicationId() {
    return "com.huanlab.dshamod";
  }

  public static String displayName() {
    return "DSHA 魔改版";
  }

  public static String publicDirectoryName() {
    return "DSHA-Mod";
  }

  public static String defaultUpdateFeed() {
    return "";
  }

  public static boolean isExperimental() {
    return false;
  }
}
