package com.kwad.components.ad.splashscreen.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.n.l;
import com.kwad.sdk.utils.ad;
/* loaded from: classes5.dex */
public class CloseCountDownView extends LinearLayout {
    private a EL;
    private String Ge;
    private int Gf;
    private TextView Gg;
    private TextView Gh;
    private ImageView Gi;
    private com.kwad.components.ad.splashscreen.widget.a Gj;
    private Runnable Gk;
    private boolean nE;

    /* loaded from: classes5.dex */
    public interface a {
        void dg();

        void lc();
    }

    public CloseCountDownView(Context context) {
        super(context);
        this.Ge = "%ss";
        this.Gf = 5;
        this.nE = false;
        this.Gk = new Runnable() { // from class: com.kwad.components.ad.splashscreen.widget.CloseCountDownView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!CloseCountDownView.this.nE) {
                    if (CloseCountDownView.this.Gf <= 0) {
                        if (CloseCountDownView.this.EL != null) {
                            CloseCountDownView.this.EL.lc();
                            return;
                        }
                        return;
                    }
                    CloseCountDownView.this.postDelayed(this, 1000L);
                    CloseCountDownView closeCountDownView = CloseCountDownView.this;
                    closeCountDownView.ab(closeCountDownView.Gf);
                    CloseCountDownView.d(CloseCountDownView.this);
                    return;
                }
                CloseCountDownView.this.postDelayed(this, 300L);
            }
        };
        ae(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab(int i4) {
        this.Gg.setText(String.format(this.Ge, Integer.valueOf(i4)));
    }

    private void ae(Context context) {
        setOrientation(0);
        l.inflate(context, R.layout.ksad_endcard_close_view, this);
        this.Gg = (TextView) findViewById(R.id.ksad_ad_endcard_second);
        this.Gh = (TextView) findViewById(R.id.ksad_ad_endcard_line);
        ImageView imageView = (ImageView) findViewById(R.id.ksad_splash_endcard_close_img);
        this.Gi = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.splashscreen.widget.CloseCountDownView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (CloseCountDownView.this.EL != null) {
                    CloseCountDownView.this.EL.dg();
                }
            }
        });
    }

    static /* synthetic */ int d(CloseCountDownView closeCountDownView) {
        int i4 = closeCountDownView.Gf;
        closeCountDownView.Gf = i4 - 1;
        return i4;
    }

    private void eG() {
        post(this.Gk);
    }

    private void eH() {
        this.nE = true;
    }

    private void eI() {
        this.nE = false;
    }

    private void mk() {
        ad.a(this, this.Gj.lO());
        ad.a(this.Gh, this.Gj.mn());
        ad.a(this.Gi, this.Gj.mq());
        this.Gg.setTextSize(0, this.Gj.mo());
        this.Gh.setTextSize(0, this.Gj.mo());
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(this.Gj.mp());
        }
    }

    public final void aM() {
        eI();
    }

    public final void aN() {
        eH();
    }

    public final void bf() {
        if (getHandler() != null) {
            getHandler().removeCallbacksAndMessages(null);
        }
    }

    public void setOnViewClickListener(a aVar) {
        this.EL = aVar;
    }

    public final void a(AdInfo adInfo, float f5) {
        com.kwad.components.ad.splashscreen.widget.a af;
        boolean dg = com.kwad.sdk.core.response.b.a.dg(adInfo);
        if (dg) {
            af = com.kwad.components.ad.splashscreen.widget.a.ag(getContext());
        } else {
            af = com.kwad.components.ad.splashscreen.widget.a.af(getContext());
        }
        this.Gj = af;
        af.d(f5);
        boolean cn2 = com.kwad.sdk.core.response.b.a.cn(adInfo);
        this.Gf = com.kwad.sdk.core.response.b.a.cm(adInfo);
        if (dg) {
            mk();
        }
        if (cn2) {
            this.Gg.setVisibility(0);
            this.Gh.setVisibility(0);
            ab(this.Gf);
            float mm = this.Gj.mm();
            setPadding(com.kwad.sdk.c.a.a.a(getContext(), mm), 0, com.kwad.sdk.c.a.a.a(getContext(), mm), 0);
        } else {
            float ml = this.Gj.ml();
            setPadding(com.kwad.sdk.c.a.a.a(getContext(), ml), 0, com.kwad.sdk.c.a.a.a(getContext(), ml), 0);
        }
        eG();
    }

    public CloseCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Ge = "%ss";
        this.Gf = 5;
        this.nE = false;
        this.Gk = new Runnable() { // from class: com.kwad.components.ad.splashscreen.widget.CloseCountDownView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!CloseCountDownView.this.nE) {
                    if (CloseCountDownView.this.Gf <= 0) {
                        if (CloseCountDownView.this.EL != null) {
                            CloseCountDownView.this.EL.lc();
                            return;
                        }
                        return;
                    }
                    CloseCountDownView.this.postDelayed(this, 1000L);
                    CloseCountDownView closeCountDownView = CloseCountDownView.this;
                    closeCountDownView.ab(closeCountDownView.Gf);
                    CloseCountDownView.d(CloseCountDownView.this);
                    return;
                }
                CloseCountDownView.this.postDelayed(this, 300L);
            }
        };
        ae(context);
    }

    public CloseCountDownView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.Ge = "%ss";
        this.Gf = 5;
        this.nE = false;
        this.Gk = new Runnable() { // from class: com.kwad.components.ad.splashscreen.widget.CloseCountDownView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!CloseCountDownView.this.nE) {
                    if (CloseCountDownView.this.Gf <= 0) {
                        if (CloseCountDownView.this.EL != null) {
                            CloseCountDownView.this.EL.lc();
                            return;
                        }
                        return;
                    }
                    CloseCountDownView.this.postDelayed(this, 1000L);
                    CloseCountDownView closeCountDownView = CloseCountDownView.this;
                    closeCountDownView.ab(closeCountDownView.Gf);
                    CloseCountDownView.d(CloseCountDownView.this);
                    return;
                }
                CloseCountDownView.this.postDelayed(this, 300L);
            }
        };
        ae(context);
    }

    @RequiresApi(api = 21)
    public CloseCountDownView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.Ge = "%ss";
        this.Gf = 5;
        this.nE = false;
        this.Gk = new Runnable() { // from class: com.kwad.components.ad.splashscreen.widget.CloseCountDownView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!CloseCountDownView.this.nE) {
                    if (CloseCountDownView.this.Gf <= 0) {
                        if (CloseCountDownView.this.EL != null) {
                            CloseCountDownView.this.EL.lc();
                            return;
                        }
                        return;
                    }
                    CloseCountDownView.this.postDelayed(this, 1000L);
                    CloseCountDownView closeCountDownView = CloseCountDownView.this;
                    closeCountDownView.ab(closeCountDownView.Gf);
                    CloseCountDownView.d(CloseCountDownView.this);
                    return;
                }
                CloseCountDownView.this.postDelayed(this, 300L);
            }
        };
        ae(context);
    }
}
