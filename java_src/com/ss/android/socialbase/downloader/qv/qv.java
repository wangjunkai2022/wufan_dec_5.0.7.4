package com.ss.android.socialbase.downloader.qv;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes5.dex */
public class qv extends Handler {
    private final WeakReference<vv> vv;

    /* loaded from: classes5.dex */
    public interface vv {
        void vv(Message message);
    }

    public qv(Looper looper, vv vvVar) {
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
