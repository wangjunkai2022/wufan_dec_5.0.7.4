package com.ss.android.socialbase.downloader.qv;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
/* loaded from: classes5.dex */
public final class o implements Handler.Callback {
    private volatile Handler vv = new Handler(vv.vv, this);

    /* loaded from: classes5.dex */
    public interface m {
        long vv();
    }

    /* loaded from: classes5.dex */
    private static class vv {
        private static final Looper vv;

        static {
            HandlerThread handlerThread = new HandlerThread("DownloadWatchDog");
            handlerThread.start();
            vv = handlerThread.getLooper();
        }
    }

    public static Looper vv() {
        return vv.vv;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what != 0) {
            return true;
        }
        try {
            m mVar = (m) message.obj;
            long vv2 = mVar.vv();
            if (vv2 > 0) {
                vv(mVar, vv2);
                return true;
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public void m() {
        Handler handler = this.vv;
        if (handler == null) {
            return;
        }
        this.vv = null;
        handler.removeCallbacksAndMessages(null);
    }

    public void vv(m mVar, long j4) {
        Handler handler = this.vv;
        if (handler == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = mVar;
        handler.sendMessageDelayed(obtain, j4);
    }
}
