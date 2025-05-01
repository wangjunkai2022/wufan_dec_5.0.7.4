package com.uc.crashsdk;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.join.mgps.activity.QuarkInstallAppActivity_;
import com.uc.crashsdk.export.ICrashClient;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static ICrashClient f63143a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f63144b = 3;

    /* renamed from: c  reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f63145c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f63146d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f63147e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f63148f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f63149g = new Object();

    public static void a(ICrashClient iCrashClient) {
        f63143a = iCrashClient;
    }

    public static boolean b(ValueCallback<Bundle> valueCallback) {
        if (f63146d == null) {
            synchronized (f63149g) {
                if (f63146d == null) {
                    f63146d = new ArrayList();
                }
            }
        }
        synchronized (f63146d) {
            if (f63146d.size() >= f63144b) {
                return false;
            }
            f63146d.add(valueCallback);
            return true;
        }
    }

    public static boolean c(ValueCallback<Bundle> valueCallback) {
        if (f63147e == null) {
            synchronized (f63149g) {
                if (f63147e == null) {
                    f63147e = new ArrayList();
                }
            }
        }
        synchronized (f63147e) {
            if (f63147e.size() >= f63144b) {
                return false;
            }
            f63147e.add(valueCallback);
            return true;
        }
    }

    public static boolean d(ValueCallback<Bundle> valueCallback) {
        if (f63148f == null) {
            synchronized (f63149g) {
                if (f63148f == null) {
                    f63148f = new ArrayList();
                }
            }
        }
        synchronized (f63148f) {
            if (f63148f.size() >= f63144b) {
                return false;
            }
            f63148f.add(valueCallback);
            return true;
        }
    }

    public static void a(String str, String str2, String str3) {
        if (com.uc.crashsdk.a.g.a(str)) {
            com.uc.crashsdk.a.a.a("crashsdk", "onLogGenerated file name is null!", null);
            return;
        }
        boolean equals = e.h().equals(str2);
        if (f63143a != null) {
            File file = new File(str);
            try {
                if (equals) {
                    f63143a.onLogGenerated(file, str3);
                } else {
                    f63143a.onClientProcessLogGenerated(str2, file, str3);
                }
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
        List<ValueCallback<Bundle>> list = f63145c;
        if (!equals) {
            list = f63146d;
        }
        if (list != null) {
            synchronized (list) {
                for (ValueCallback<Bundle> valueCallback : list) {
                    Bundle bundle = new Bundle();
                    bundle.putString("filePathName", str);
                    if (!equals) {
                        bundle.putString("processName", str2);
                    }
                    bundle.putString("logType", str3);
                    valueCallback.onReceiveValue(bundle);
                }
            }
        }
    }

    public static File a(File file) {
        ICrashClient iCrashClient = f63143a;
        if (iCrashClient != null) {
            try {
                return iCrashClient.onBeforeUploadLog(file);
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
        return file;
    }

    public static void a(boolean z4) {
        ICrashClient iCrashClient = f63143a;
        if (iCrashClient != null) {
            try {
                iCrashClient.onCrashRestarting(z4);
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
        if (f63147e != null) {
            synchronized (f63147e) {
                for (ValueCallback<Bundle> valueCallback : f63147e) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("isJava", z4);
                    valueCallback.onReceiveValue(bundle);
                }
            }
        }
    }

    public static void a(String str, int i4, int i5) {
        ICrashClient iCrashClient = f63143a;
        if (iCrashClient != null) {
            iCrashClient.onAddCrashStats(str, i4, i5);
        }
        if (f63148f != null) {
            synchronized (f63148f) {
                for (ValueCallback<Bundle> valueCallback : f63148f) {
                    Bundle bundle = new Bundle();
                    bundle.putString("processName", str);
                    bundle.putInt("key", i4);
                    bundle.putInt(QuarkInstallAppActivity_.f36990i, i5);
                    valueCallback.onReceiveValue(bundle);
                }
            }
        }
    }

    public static String a(String str, boolean z4) {
        ICrashClient iCrashClient = f63143a;
        return iCrashClient != null ? iCrashClient.onGetCallbackInfo(str, z4) : "";
    }

    public static boolean a(ValueCallback<Bundle> valueCallback) {
        if (f63145c == null) {
            synchronized (f63149g) {
                if (f63145c == null) {
                    f63145c = new ArrayList();
                }
            }
        }
        synchronized (f63145c) {
            if (f63145c.size() >= f63144b) {
                return false;
            }
            f63145c.add(valueCallback);
            return true;
        }
    }
}
