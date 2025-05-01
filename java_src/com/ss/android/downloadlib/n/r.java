package com.ss.android.downloadlib.n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes5.dex */
public class r extends Handler {
    WeakReference<vv> vv;

    /* loaded from: classes5.dex */
    public interface vv {
        void vv(Message message);
    }

    public r(Looper looper, vv vvVar) {
        super(looper);
        this.vv = new WeakReference<>(vvVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        vv vvVar = this.vv.get();
        if (vvVar == null || message == null) {
            return;
        }
        vvVar.vv(message);
    }
}
