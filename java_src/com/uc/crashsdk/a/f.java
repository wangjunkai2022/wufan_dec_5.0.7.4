package com.uc.crashsdk.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f63078a = true;

    /* renamed from: b  reason: collision with root package name */
    private static volatile HandlerThread f63079b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile HandlerThread f63080c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile HandlerThread f63081d;

    /* renamed from: e  reason: collision with root package name */
    private static Handler f63082e;

    /* renamed from: f  reason: collision with root package name */
    private static Handler f63083f;

    /* renamed from: g  reason: collision with root package name */
    private static Handler f63084g;

    /* renamed from: h  reason: collision with root package name */
    private static Handler f63085h;

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<Object, Object[]> f63086i = new HashMap<>();

    public static Handler a(int i4) {
        if (i4 == 0) {
            if (f63079b == null) {
                a();
            }
            return f63082e;
        } else if (i4 == 1) {
            if (f63080c == null) {
                b();
            }
            return f63083f;
        } else if (i4 == 2) {
            if (f63084g == null) {
                f63084g = new Handler(Looper.getMainLooper());
            }
            return f63084g;
        } else if (i4 == 3) {
            if (f63085h == null) {
                c();
            }
            return f63085h;
        } else {
            throw new RuntimeException("unknown thread type: " + i4);
        }
    }

    public static boolean b(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return false;
        }
        HashMap<Object, Object[]> hashMap = f63086i;
        synchronized (hashMap) {
            objArr = hashMap.get(runnable);
        }
        return objArr != null;
    }

    private static synchronized void c() {
        synchronized (f.class) {
            if (f63081d == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKAnrHandler", 0);
                f63081d = handlerThread;
                handlerThread.start();
                f63085h = new Handler(f63081d.getLooper());
            }
        }
    }

    private static synchronized void b() {
        synchronized (f.class) {
            if (f63080c == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKNormalHandler", 0);
                f63080c = handlerThread;
                handlerThread.start();
                f63083f = new Handler(f63080c.getLooper());
            }
        }
    }

    public static boolean a(int i4, Runnable runnable, long j4) {
        Handler a5;
        if (runnable == null || (a5 = a(i4)) == null) {
            return false;
        }
        e eVar = new e(10, new Object[]{runnable});
        HashMap<Object, Object[]> hashMap = f63086i;
        synchronized (hashMap) {
            hashMap.put(runnable, new Object[]{eVar, Integer.valueOf(i4)});
        }
        return a5.postDelayed(eVar, j4);
    }

    public static void a(int i4, Object[] objArr) {
        if (i4 != 10) {
            if (!f63078a) {
                throw new AssertionError();
            }
        } else if (!f63078a && objArr == null) {
            throw new AssertionError();
        } else {
            Runnable runnable = (Runnable) objArr[0];
            HashMap<Object, Object[]> hashMap = f63086i;
            synchronized (hashMap) {
                if (hashMap.get(runnable) != null) {
                    hashMap.remove(runnable);
                }
            }
            runnable.run();
        }
    }

    public static boolean a(int i4, Runnable runnable) {
        return a(i4, runnable, 0L);
    }

    public static void a(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return;
        }
        HashMap<Object, Object[]> hashMap = f63086i;
        synchronized (hashMap) {
            objArr = hashMap.get(runnable);
        }
        if (objArr == null) {
            return;
        }
        int intValue = ((Integer) objArr[1]).intValue();
        Handler handler = null;
        if (intValue == 0) {
            handler = f63082e;
        } else if (intValue == 1) {
            handler = f63083f;
        } else if (intValue == 2) {
            handler = f63084g;
        }
        if (handler != null) {
            handler.removeCallbacks((Runnable) objArr[0]);
        }
        synchronized (hashMap) {
            if (hashMap.get(runnable) != null) {
                hashMap.remove(runnable);
            }
        }
    }

    private static synchronized void a() {
        synchronized (f.class) {
            if (f63079b == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKBkgdHandler", 10);
                f63079b = handlerThread;
                handlerThread.start();
                f63082e = new Handler(f63079b.getLooper());
            }
        }
    }
}
