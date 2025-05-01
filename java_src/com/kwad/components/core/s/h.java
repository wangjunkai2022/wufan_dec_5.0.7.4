package com.kwad.components.core.s;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
/* loaded from: classes5.dex */
public final class h {
    private long Bn;
    private a TP;
    private long TN = 100;
    private long TO = 0;
    private boolean Md = false;
    @Nullable
    private Handler TQ = new Handler(Looper.getMainLooper());
    private Runnable TR = new Runnable() { // from class: com.kwad.components.core.s.h.1
        @Override // java.lang.Runnable
        public final void run() {
            if (h.this.TQ == null) {
                return;
            }
            if (h.this.Md) {
                h.this.TQ.postDelayed(this, h.this.TN / 2);
                return;
            }
            h.this.rH();
            if (h.this.TQ != null) {
                h.this.TQ.postDelayed(this, h.this.TN);
            }
        }
    };

    /* loaded from: classes5.dex */
    public interface a {
        void onProgress(long j4, long j5);
    }

    public h(long j4) {
        this.Bn = j4;
    }

    public final void pause() {
        this.Md = true;
    }

    protected final void rH() {
        a aVar = this.TP;
        if (aVar != null) {
            long j4 = this.Bn;
            long j5 = j4 - this.TO;
            aVar.onProgress(j5, j4);
            if (j5 <= 0) {
                stop();
            }
        }
        this.TO += this.TN;
    }

    public final void resume() {
        this.Md = false;
    }

    public final void start() {
        Handler handler = this.TQ;
        if (handler == null) {
            return;
        }
        handler.post(this.TR);
    }

    public final void stop() {
        Handler handler = this.TQ;
        if (handler != null) {
            handler.removeCallbacks(this.TR);
            this.TQ = null;
        }
    }

    public final void a(a aVar) {
        this.TP = aVar;
    }
}
