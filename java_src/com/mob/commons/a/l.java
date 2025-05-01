package com.mob.commons.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mob.commons.c;
import com.mob.commons.v;
import com.mob.commons.z;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
/* loaded from: classes5.dex */
public class l implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private static l f56101a = new l();

    /* renamed from: b  reason: collision with root package name */
    private Handler f56102b;

    private l() {
        String str;
        if (TextUtils.isEmpty("M-")) {
            str = null;
        } else {
            str = z.f56517a + a("004?gdidilig");
        }
        this.f56102b = MobHandlerThread.newHandler(str, this);
    }

    public static l a() {
        return f56101a;
    }

    public Handler b() {
        return this.f56102b;
    }

    public Looper c() {
        Handler handler = this.f56102b;
        if (handler != null) {
            return handler.getLooper();
        }
        return null;
    }

    public boolean d(long j4, Runnable runnable) {
        return b(1005, j4, runnable);
    }

    public void e(long j4, Runnable runnable) {
        if (this.f56102b.hasMessages(1007)) {
            return;
        }
        b(1007, j4, runnable);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        c cVar;
        try {
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        if (!com.mob.commons.b.d()) {
            Message obtain = Message.obtain();
            obtain.copyFrom(message);
            this.f56102b.sendMessageDelayed(obtain, 60000L);
            return false;
        }
        int i4 = message.what;
        if (i4 != 1003 && i4 != 1004 && i4 != 1006) {
            if (i4 == 1002) {
                c.b bVar = (c.b) message.obj;
                if (bVar != null) {
                    if (!bVar.f56255a) {
                        bVar.f56255a = true;
                    }
                    z.f56520d.execute(bVar);
                    int i5 = message.arg1;
                    Message obtain2 = Message.obtain();
                    obtain2.what = 1002;
                    obtain2.obj = bVar;
                    obtain2.arg1 = i5;
                    a(obtain2, i5 * 1000);
                }
            } else {
                if (i4 != 1005 && i4 != 1007) {
                    if ((i4 >= 10000 || i4 < -10000) && (cVar = (c) message.obj) != null) {
                        cVar.h();
                    }
                }
                Runnable runnable = (Runnable) message.obj;
                if (runnable != null) {
                    z.f56519c.execute(runnable);
                }
            }
            return false;
        }
        Runnable runnable2 = (Runnable) message.obj;
        if (runnable2 != null) {
            z.f56520d.execute(runnable2);
        }
        return false;
    }

    public <T extends c> void a(long j4, T t4, int i4) {
        int a5 = a((l) t4);
        if (i4 == 1) {
            this.f56102b.removeMessages(a5);
        } else if (i4 == 2 && this.f56102b.hasMessages(a5)) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = a5;
        obtain.obj = t4;
        a(obtain, j4 * 1000);
    }

    public boolean b(long j4, Runnable runnable) {
        return a(1004, j4 * 1000, runnable);
    }

    public void d() {
        this.f56102b.removeMessages(1002);
    }

    private boolean b(int i4, long j4, Runnable runnable) {
        Message obtain = Message.obtain();
        obtain.what = i4;
        obtain.obj = runnable;
        a(obtain, j4);
        return true;
    }

    public boolean c(long j4, Runnable runnable) {
        return a(1006, j4 * 1000, runnable);
    }

    public boolean a(long j4, Runnable runnable) {
        return a(1003, j4 * 1000, runnable);
    }

    public void a(long j4, int i4, c.b bVar) {
        Message obtain = Message.obtain();
        obtain.what = 1002;
        obtain.arg1 = i4;
        obtain.obj = bVar;
        a(obtain, j4 * 1000);
    }

    private boolean a(int i4, long j4, Runnable runnable) {
        if (this.f56102b.hasMessages(i4)) {
            return false;
        }
        b(i4, j4, runnable);
        return true;
    }

    private <T extends c> int a(T t4) {
        int k4 = t4.k();
        return k4 > 0 ? k4 + 10000 : k4 - 10000;
    }

    private void a(Message message, long j4) {
        if (j4 > 0) {
            this.f56102b.sendMessageDelayed(message, j4);
        } else {
            this.f56102b.sendMessage(message);
        }
    }

    public static String a(String str) {
        return v.a(str, 100);
    }
}
