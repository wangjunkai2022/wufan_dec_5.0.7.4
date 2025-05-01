package com.umeng.commonsdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.aw;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.utils.onMessageSendListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public class UMConfigureImpl {

    /* renamed from: e  reason: collision with root package name */
    private static final int f64091e = 1000;

    /* renamed from: f  reason: collision with root package name */
    private static ScheduledExecutorService f64092f;

    /* renamed from: g  reason: collision with root package name */
    private static Context f64093g;

    /* renamed from: a  reason: collision with root package name */
    private static String f64087a = aw.b().b(aw.f63384o);

    /* renamed from: b  reason: collision with root package name */
    private static CopyOnWriteArrayList<onMessageSendListener> f64088b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private static int f64089c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f64090d = false;

    /* renamed from: h  reason: collision with root package name */
    private static int f64094h = 0;

    /* renamed from: i  reason: collision with root package name */
    private static Runnable f64095i = new Runnable() { // from class: com.umeng.commonsdk.UMConfigureImpl.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (UMConfigureImpl.f64089c == 0 || UMConfigureImpl.f64094h >= 10) {
                    if (!UMConfigureImpl.f64090d) {
                        boolean unused = UMConfigureImpl.f64090d = true;
                        UMConfigureImpl.b(UMConfigureImpl.f64093g);
                    }
                    if (UMConfigureImpl.f64092f != null) {
                        UMConfigureImpl.f64092f.shutdown();
                        ScheduledExecutorService unused2 = UMConfigureImpl.f64092f = null;
                    }
                }
                UMConfigureImpl.f();
            } catch (Exception unused3) {
            }
        }
    };

    static /* synthetic */ int f() {
        int i4 = f64094h;
        f64094h = i4 + 1;
        return i4;
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        f64093g = context;
        try {
            if (f64089c >= 1) {
                if (!d(context)) {
                    UMEnvelopeBuild.setTransmissionSendFlag(false);
                    c(context);
                    if (f64092f == null) {
                        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
                        f64092f = newScheduledThreadPool;
                        newScheduledThreadPool.scheduleAtFixedRate(f64095i, 0L, 100L, TimeUnit.MILLISECONDS);
                    }
                } else {
                    UMEnvelopeBuild.setTransmissionSendFlag(true);
                }
            } else {
                UMEnvelopeBuild.setTransmissionSendFlag(true);
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void registerInterruptFlag() {
        synchronized (UMConfigureImpl.class) {
            try {
                f64089c++;
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void registerMessageSendListener(onMessageSendListener onmessagesendlistener) {
        CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList;
        synchronized (UMConfigureImpl.class) {
            try {
                CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList2 = f64088b;
                if (copyOnWriteArrayList2 != null) {
                    copyOnWriteArrayList2.add(onmessagesendlistener);
                }
                if (UMEnvelopeBuild.getTransmissionSendFlag() && (copyOnWriteArrayList = f64088b) != null && copyOnWriteArrayList.size() > 0) {
                    Iterator<onMessageSendListener> it2 = f64088b.iterator();
                    while (it2.hasNext()) {
                        it2.next().onMessageSend();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void removeInterruptFlag() {
        synchronized (UMConfigureImpl.class) {
            try {
                f64089c--;
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void removeMessageSendListener(onMessageSendListener onmessagesendlistener) {
        synchronized (UMConfigureImpl.class) {
            try {
                CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f64088b;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(onmessagesendlistener);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void b(Context context) {
        synchronized (UMConfigureImpl.class) {
            try {
                UMEnvelopeBuild.setTransmissionSendFlag(true);
                CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f64088b;
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    Iterator<onMessageSendListener> it2 = f64088b.iterator();
                    while (it2.hasNext()) {
                        it2.next().onMessageSend();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private static void c(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f64087a, 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean(f64087a, true);
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean d(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f64087a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(f64087a, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
