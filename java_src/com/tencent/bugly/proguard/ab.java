package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class ab extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private boolean f62501a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f62502b = false;

    /* renamed from: c  reason: collision with root package name */
    private List<aa> f62503c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private List<ac> f62504d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<aa> f62505e = new ArrayList<>();

    private int e() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f62503c.size(); i5++) {
            try {
                i4 = Math.max(i4, this.f62503c.get(i5).c());
            } catch (Exception e5) {
                x.b(e5);
            }
        }
        return i4;
    }

    public final void a() {
        a(new Handler(Looper.getMainLooper()), 5000L);
    }

    public final void b() {
        for (int i4 = 0; i4 < this.f62503c.size(); i4++) {
            try {
                if (this.f62503c.get(i4).d().equals(Looper.getMainLooper().getThread().getName())) {
                    x.c("remove handler::%s", this.f62503c.get(i4));
                    this.f62503c.remove(i4);
                }
            } catch (Exception e5) {
                x.b(e5);
                return;
            }
        }
    }

    public final boolean c() {
        this.f62501a = true;
        if (isAlive()) {
            try {
                interrupt();
            } catch (Exception e5) {
                x.b(e5);
            }
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (isAlive()) {
            return false;
        }
        try {
            start();
            return true;
        } catch (Exception e5) {
            x.b(e5);
            return false;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!this.f62501a) {
            for (int i4 = 0; i4 < this.f62503c.size(); i4++) {
                try {
                    this.f62503c.get(i4).a();
                } catch (Exception e5) {
                    x.b(e5);
                } catch (OutOfMemoryError e6) {
                    x.b(e6);
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            for (long j4 = 2000; j4 > 0 && !isInterrupted(); j4 = 2000 - (SystemClock.uptimeMillis() - uptimeMillis)) {
                Thread.sleep(j4);
            }
            int e7 = e();
            if (e7 != 0 && e7 != 1) {
                this.f62505e.clear();
                for (int i5 = 0; i5 < this.f62503c.size(); i5++) {
                    aa aaVar = this.f62503c.get(i5);
                    if (aaVar.b()) {
                        this.f62505e.add(aaVar);
                        aaVar.a(Long.MAX_VALUE);
                    }
                }
                NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
                if (nativeCrashHandler != null && nativeCrashHandler.isEnableCatchAnrTrace()) {
                    nativeCrashHandler.dumpAnrNativeStack();
                    x.c("jni mannual dump anr trace", new Object[0]);
                } else {
                    x.c("do not enable jni mannual dump anr trace", new Object[0]);
                }
                int i6 = 0;
                while (true) {
                    if (this.f62502b) {
                        break;
                    }
                    x.c("do not enable anr continue check", new Object[0]);
                    Thread.sleep(2000L);
                    i6++;
                    if (i6 == 15) {
                        this.f62505e.clear();
                        break;
                    }
                }
                for (int i7 = 0; i7 < this.f62505e.size(); i7++) {
                    aa aaVar2 = this.f62505e.get(i7);
                    for (int i8 = 0; i8 < this.f62504d.size(); i8++) {
                        x.e("main thread blocked,now begin to upload anr stack", new Object[0]);
                        this.f62504d.get(i8).a(aaVar2);
                        this.f62502b = false;
                    }
                }
            }
        }
    }

    private void a(Handler handler, long j4) {
        if (handler == null) {
            x.e("addThread handler should not be null", new Object[0]);
            return;
        }
        String name = handler.getLooper().getThread().getName();
        for (int i4 = 0; i4 < this.f62503c.size(); i4++) {
            try {
                if (this.f62503c.get(i4).d().equals(handler.getLooper().getThread().getName())) {
                    x.e("addThread fail ,this thread has been added in monitor queue", new Object[0]);
                    return;
                }
            } catch (Exception e5) {
                x.b(e5);
            }
        }
        this.f62503c.add(new aa(handler, name, 5000L));
    }

    public final void b(ac acVar) {
        this.f62504d.remove(acVar);
    }

    public final void a(ac acVar) {
        if (this.f62504d.contains(acVar)) {
            x.c("addThreadMonitorListeners fail ,this threadMonitorListener has been added in monitor queue", new Object[0]);
        } else {
            this.f62504d.add(acVar);
        }
    }

    public final void a(boolean z4) {
        this.f62502b = true;
    }
}
