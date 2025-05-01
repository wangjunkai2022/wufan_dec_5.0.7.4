package com.kwad.components.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.sdk.utils.br;
import com.kwad.sdk.utils.bs;
import com.kwad.sdk.widget.KSFrameLayout;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class a extends KSFrameLayout implements bs.a {
    private final View Vt;
    private InterfaceC0487a abP;
    private boolean abQ;
    private boolean abR;
    private int abS;
    private boolean abT;
    private long abU;
    private boolean abV;
    private final float abW;
    private final int abX;
    private final bs hh;

    /* renamed from: com.kwad.components.core.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0487a {
        void ac();

        void ad();

        void eq();

        void k(View view);
    }

    public a(Context context, View view) {
        super(context, view);
        this.hh = new bs(this);
        this.abS = 5;
        this.Vt = view;
        setLayoutParams(new ViewGroup.LayoutParams(1, 1));
        float CV = com.kwad.sdk.core.config.d.CV();
        this.abW = CV;
        setVisiblePercent(CV);
        float CW = com.kwad.sdk.core.config.d.CW();
        this.abX = (int) ((CW < 0.0f ? 1.0f : CW) * 1000.0f);
    }

    private void tJ() {
        InterfaceC0487a interfaceC0487a;
        if (this.abX == 0 && (interfaceC0487a = this.abP) != null) {
            interfaceC0487a.k(this.Vt);
            return;
        }
        Message obtainMessage = this.hh.obtainMessage();
        obtainMessage.what = 2;
        this.hh.sendMessageDelayed(obtainMessage, this.abX);
    }

    private void tK() {
        this.hh.removeCallbacksAndMessages(null);
        this.abR = false;
    }

    private void tL() {
        if (this.abR) {
            return;
        }
        this.abR = true;
        this.hh.sendEmptyMessage(1);
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, com.kwad.sdk.widget.i
    public final void A(View view) {
        InterfaceC0487a interfaceC0487a;
        InterfaceC0487a interfaceC0487a2;
        super.A(view);
        if (this.abX == 0 && (interfaceC0487a2 = this.abP) != null) {
            interfaceC0487a2.k(view);
        } else if (!this.abT) {
            this.abT = true;
            this.abU = System.currentTimeMillis();
            tK();
            tJ();
        } else if (System.currentTimeMillis() - this.abU <= this.abX || (interfaceC0487a = this.abP) == null) {
        } else {
            interfaceC0487a.k(view);
            tK();
        }
    }

    @Override // com.kwad.sdk.utils.bs.a
    public final void a(Message message) {
        if (this.abQ) {
            return;
        }
        int i4 = message.what;
        if (i4 != 1) {
            if (i4 != 2) {
                return;
            }
            if (br.a(this.Vt, (int) (this.abW * 100.0f), false)) {
                InterfaceC0487a interfaceC0487a = this.abP;
                if (interfaceC0487a != null) {
                    interfaceC0487a.k(this.Vt);
                    return;
                }
                return;
            }
            this.abS = 5;
            this.hh.sendEmptyMessage(1);
            return;
        }
        if (br.a(this.Vt, (int) (this.abW * 100.0f), false)) {
            tK();
            if (this.abT) {
                InterfaceC0487a interfaceC0487a2 = this.abP;
                if (interfaceC0487a2 != null) {
                    interfaceC0487a2.k(this.Vt);
                }
            } else {
                this.abT = true;
                this.abU = System.currentTimeMillis();
                tJ();
            }
            this.abV = false;
            bs bsVar = this.hh;
            int i5 = this.abS;
            this.abS = i5 - 1;
            bsVar.sendEmptyMessageDelayed(1, i5 <= 0 ? 500L : 100L);
            return;
        }
        InterfaceC0487a interfaceC0487a3 = this.abP;
        if (interfaceC0487a3 != null && !this.abV) {
            interfaceC0487a3.eq();
        }
        this.abV = true;
        bs bsVar2 = this.hh;
        int i6 = this.abS;
        this.abS = i6 - 1;
        bsVar2.sendEmptyMessageDelayed(1, i6 <= 0 ? 500L : 100L);
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ac() {
        super.ac();
        this.abS = 5;
        this.abQ = false;
        this.abT = false;
        tL();
        InterfaceC0487a interfaceC0487a = this.abP;
        if (interfaceC0487a != null) {
            interfaceC0487a.ac();
        }
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ad() {
        super.ad();
        tK();
        this.abS = 0;
        this.abU = 0L;
        this.abQ = true;
        InterfaceC0487a interfaceC0487a = this.abP;
        if (interfaceC0487a != null) {
            interfaceC0487a.ad();
        }
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        com.kwad.sdk.core.e.c.d("AdExposureView", "onWindowFocusChanged hasWindowFocus:" + z4);
    }

    public final void setViewCallback(InterfaceC0487a interfaceC0487a) {
        this.abP = interfaceC0487a;
    }

    public final void tM() {
        tL();
    }
}
