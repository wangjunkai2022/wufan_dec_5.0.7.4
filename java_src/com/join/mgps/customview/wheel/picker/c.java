package com.join.mgps.customview.wheel.picker;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.join.mgps.customview.wheel.picker.WheelView;
/* compiled from: WheelPicker.java */
/* loaded from: classes4.dex */
public abstract class c extends com.join.mgps.customview.popup.b<View> {
    protected float J;
    protected int K;
    protected int L;
    protected Typeface M;
    protected int N;
    protected int O;
    protected int P;
    protected int Q;
    protected boolean R;
    protected boolean S;
    protected boolean T;
    protected WheelView.c U;

    public c(Activity activity) {
        super(activity);
        this.J = 2.0f;
        this.K = -1;
        this.L = 16;
        this.M = Typeface.DEFAULT;
        this.N = WheelView.f48848p0;
        this.O = WheelView.W;
        this.P = WheelView.W;
        this.Q = 3;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = new WheelView.c();
    }

    public void A0(boolean z4) {
        if (this.U == null) {
            this.U = new WheelView.c();
        }
        this.U.f(z4);
    }

    public void B0(@ColorInt int i4) {
        this.O = i4;
    }

    public void C0(@ColorInt int i4, @ColorInt int i5) {
        this.O = i4;
        this.N = i5;
    }

    public void D0(int i4) {
        this.K = i4;
    }

    public void E0(int i4) {
        this.L = i4;
    }

    public void F0(boolean z4) {
        this.T = z4;
    }

    public void G0(boolean z4) {
        this.S = z4;
    }

    @Override // com.join.mgps.customview.popup.a
    public View c() {
        if (this.H == null) {
            this.H = G();
        }
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TextView k0() {
        TextView textView = new TextView(this.f48589b);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setTextColor(this.P);
        textView.setTextSize(this.L);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WheelView l0() {
        WheelView wheelView = new WheelView(this.f48589b);
        wheelView.setLineSpaceMultiplier(this.J);
        wheelView.setTextPadding(this.K);
        wheelView.setTextSize(this.L);
        wheelView.setTypeface(this.M);
        wheelView.setTextColor(this.N, this.O);
        wheelView.setDividerConfig(this.U);
        wheelView.setOffset(this.Q);
        wheelView.setCycleDisable(this.R);
        wheelView.setUseWeight(this.S);
        wheelView.setTextSizeAutoFit(this.T);
        return wheelView;
    }

    public void m0(boolean z4) {
        this.R = z4;
    }

    public void n0(@ColorInt int i4) {
        if (this.U == null) {
            this.U = new WheelView.c();
        }
        this.U.h(true);
        this.U.b(i4);
    }

    public void o0(@Nullable WheelView.c cVar) {
        if (cVar == null) {
            WheelView.c cVar2 = new WheelView.c();
            this.U = cVar2;
            cVar2.h(false);
            this.U.f(false);
            return;
        }
        this.U = cVar;
    }

    public void p0(float f5) {
        if (this.U == null) {
            this.U = new WheelView.c();
        }
        this.U.c(f5);
    }

    public void q0(boolean z4) {
        if (this.U == null) {
            this.U = new WheelView.c();
        }
        this.U.h(z4);
    }

    public void r0(int i4) {
        this.P = i4;
    }

    @Deprecated
    public void s0(@ColorInt int i4) {
        n0(i4);
    }

    @Deprecated
    public void t0(WheelView.c cVar) {
        o0(cVar);
    }

    public final void u0(@FloatRange(from = 2.0d, to = 4.0d) float f5) {
        this.J = f5;
    }

    @Deprecated
    public void v0(boolean z4) {
        q0(z4);
    }

    public void w0(@IntRange(from = 1, to = 5) int i4) {
        this.Q = i4;
    }

    @Deprecated
    public void x0(int i4) {
        this.K = i4;
    }

    public void y0(@ColorInt int i4) {
        z0(i4, 100);
    }

    public void z0(@ColorInt int i4, @IntRange(from = 1, to = 255) int i5) {
        if (this.U == null) {
            this.U = new WheelView.c();
        }
        this.U.e(i4);
        this.U.d(i5);
    }
}
