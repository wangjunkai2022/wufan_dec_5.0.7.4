package com.uc.crashsdk.export;

import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ICrashClient {
    public static final int EVENT_TYPE_ADD_CRASH_STATS = 3;
    public static final int EVENT_TYPE_CLIENT_PROCESS_LOG_GENERATED = 4;
    public static final int EVENT_TYPE_CRASH_RESTARTING = 2;
    public static final int EVENT_TYPE_LOG_GENERATED = 1;

    void onAddCrashStats(String str, int i4, int i5);

    File onBeforeUploadLog(File file);

    void onClientProcessLogGenerated(String str, File file, String str2);

    void onCrashRestarting(boolean z4);

    String onGetCallbackInfo(String str, boolean z4);

    void onLogGenerated(File file, String str);
}
