package cn.sharesdk.framework.utils;

import cn.sharesdk.framework.ShareSDK;
import com.mob.tools.log.NLog;
/* loaded from: classes2.dex */
public class SSDKLog {

    /* renamed from: a  reason: collision with root package name */
    private static SSDKLog f1032a;

    /* renamed from: b  reason: collision with root package name */
    private static NLog f1033b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1034c = -1;

    private SSDKLog() {
        a();
    }

    public static NLog a() {
        try {
            try {
                NLog nLog = NLog.getInstance(ShareSDK.SDK_TAG, ShareSDK.SDK_VERSION_CODE, "cn.sharesdk");
                f1033b = nLog;
                return nLog;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            NLog nLog2 = NLog.getInstance(ShareSDK.SDK_TAG);
            f1033b = nLog2;
            return nLog2;
        }
    }

    private boolean a(NLog nLog) {
        return nLog != null;
    }

    public static SSDKLog b() {
        if (f1032a == null) {
            f1032a = new SSDKLog();
        }
        return f1032a;
    }

    public final int c(Throwable th) {
        try {
            if (a(f1033b)) {
                return f1033b.log(4, th);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int d(Throwable th) {
        try {
            if (a(f1033b)) {
                return f1033b.log(6, th);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int a(Throwable th) {
        try {
            if (a(f1033b)) {
                return f1033b.log(3, th);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int c(Object obj, Object... objArr) {
        try {
            if (a(f1033b)) {
                return f1033b.log(4, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int d(Object obj, Object... objArr) {
        try {
            if (a(f1033b)) {
                return f1033b.log(6, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(Throwable th) {
        try {
            if (a(f1033b)) {
                return f1033b.log(5, th);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int a(Object obj, Object... objArr) {
        try {
            if (a(f1033b)) {
                return f1033b.log(3, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(Object obj, Object... objArr) {
        try {
            if (a(f1033b)) {
                return f1033b.log(5, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int a(Throwable th, Object obj, Object... objArr) {
        try {
            if (a(f1033b)) {
                return f1033b.log(3, th, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(Throwable th, Object obj, Object... objArr) {
        try {
            if (a(f1033b)) {
                return f1033b.log(5, th, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int a(String str) {
        try {
            if (a(f1033b)) {
                return f1033b.log(5, str, new Object[0]);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(String str) {
        try {
            if (a(f1033b)) {
                return f1033b.log(4, str, new Object[0]);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
