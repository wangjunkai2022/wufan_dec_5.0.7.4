package com.kwad.components.ad.reward.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.kwad.sdk.R;
import com.kwad.sdk.n.l;
/* loaded from: classes5.dex */
public class KsToastView extends LinearLayout {
    TextView Be;
    private String Bf;
    private Runnable Bg;
    private int countDown;

    public KsToastView(Context context) {
        super(context);
        this.countDown = 3;
        this.Bf = "%ss后自动进入";
        this.Bg = null;
        init(context);
    }

    static /* synthetic */ int b(KsToastView ksToastView) {
        int i4 = ksToastView.countDown;
        ksToastView.countDown = i4 - 1;
        return i4;
    }

    private void init(Context context) {
        l.inflate(context, R.layout.ksad_interstitial_toast_layout, this);
        this.Be = (TextView) findViewById(R.id.ksad_total_count_down_text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i4) {
        this.Be.setText(String.format(this.Bf, Integer.valueOf(i4)));
    }

    public final void U(int i4) {
        if (this.Bg == null) {
            this.Bg = new Runnable() { // from class: com.kwad.components.ad.reward.widget.KsToastView.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (KsToastView.this.countDown == 0) {
                        return;
                    }
                    KsToastView ksToastView = KsToastView.this;
                    ksToastView.x(ksToastView.countDown);
                    KsToastView.b(KsToastView.this);
                    KsToastView.this.postDelayed(this, 1000L);
                }
            };
        }
        this.countDown = 3;
        post(this.Bg);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Bg);
    }

    public KsToastView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.countDown = 3;
        this.Bf = "%ss后自动进入";
        this.Bg = null;
        init(context);
    }

    public KsToastView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.countDown = 3;
        this.Bf = "%ss后自动进入";
        this.Bg = null;
        init(context);
    }

    public KsToastView(Context context, boolean z4) {
        super(context);
        this.countDown = 3;
        this.Bf = "%ss后自动进入";
        this.Bg = null;
        init(context);
    }
}
