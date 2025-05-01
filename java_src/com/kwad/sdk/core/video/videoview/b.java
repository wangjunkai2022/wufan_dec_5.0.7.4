package com.kwad.sdk.core.video.videoview;

import android.content.Context;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
/* loaded from: classes5.dex */
public abstract class b extends RelativeLayout {
    private Runnable UC;
    @NonNull
    protected final c aCR;

    public b(Context context, @NonNull c cVar) {
        super(context);
        this.aCR = cVar;
    }

    public void n(int i4, int i5) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onPlayStateChanged(int i4);

    protected abstract void rU();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void reset();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sa() {
        sb();
        if (this.UC == null) {
            this.UC = new Runnable() { // from class: com.kwad.sdk.core.video.videoview.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.rU();
                    if (b.this.UC != null) {
                        b bVar = b.this;
                        bVar.postDelayed(bVar.UC, 1000L);
                    }
                }
            };
        }
        post(this.UC);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sb() {
        Runnable runnable = this.UC;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.UC = null;
        }
    }
}
