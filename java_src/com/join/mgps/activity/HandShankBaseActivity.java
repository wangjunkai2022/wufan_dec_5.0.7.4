package com.join.mgps.activity;

import android.animation.ValueAnimator;
import android.bluetooth.BluetoothAdapter;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.BaseActivity;
import com.join.mgps.joystick.EaseBreathInterpolator;
import com.papa.controller.core.ControllerManager;
import com.papa.controller.core.PadKeyEvent;
import com.papa.controller.core.PadMotionEvent;
import com.papa.controller.core.PadStateEvent;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class HandShankBaseActivity extends BaseActivity implements com.papa.controller.core.c {

    /* renamed from: b  reason: collision with root package name */
    private boolean f33468b;

    /* renamed from: c  reason: collision with root package name */
    com.papa.controller.core.d f33469c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ControllerManager.d {
        a() {
        }

        @Override // com.papa.controller.core.ControllerManager.d
        public void a(ControllerManager.c cVar) {
            HandShankBaseActivity handShankBaseActivity = HandShankBaseActivity.this;
            handShankBaseActivity.m0(1, handShankBaseActivity.f33469c.q());
        }

        @Override // com.papa.controller.core.ControllerManager.d
        public void b(ControllerManager.c cVar) {
            HandShankBaseActivity handShankBaseActivity = HandShankBaseActivity.this;
            handShankBaseActivity.m0(0, handShankBaseActivity.f33469c.q());
        }
    }

    /* loaded from: classes4.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Integer num = (Integer) valueAnimator.getAnimatedValue();
            HandShankBaseActivity.this.s0(num.intValue(), num.intValue());
        }
    }

    @Override // com.papa.controller.core.c
    public void D(int i4, PadKeyEvent padKeyEvent) {
        n0(i4, padKeyEvent);
    }

    @Override // com.papa.controller.core.c
    public void I(PadStateEvent padStateEvent) {
    }

    @Override // com.papa.controller.core.c
    public void M(int i4, float f5, PadKeyEvent padKeyEvent) {
        n0(i4, padKeyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        com.papa.controller.core.d dVar = this.f33469c;
        return super.dispatchGenericMotionEvent(motionEvent) | (dVar != null ? false | dVar.n(motionEvent) : false);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = false;
        if (this.f33469c != null && keyEvent != null && keyEvent.getDevice() != null) {
            z4 = false | this.f33469c.o(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent) | z4;
    }

    KeyEvent g0(float f5, int i4) {
        return new KeyEvent(i4, f5 < 0.0f ? 21 : f5 > 0.0f ? 22 : 0);
    }

    KeyEvent h0(float f5, int i4) {
        return new KeyEvent(i4, f5 < 0.0f ? 19 : f5 > 0.0f ? 20 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<ControllerManager.c> i0(List<ControllerManager.c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                if (!k0(list.get(i4).d())) {
                    arrayList.add(list.get(i4));
                }
            }
        }
        return arrayList;
    }

    @Override // com.papa.controller.core.c
    public void j(int i4, PadKeyEvent padKeyEvent) {
        n0(i4, padKeyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int j0(List<ControllerManager.c> list) {
        return i0(i0(list)).size();
    }

    protected boolean k0(String str) {
        return com.join.mgps.joystick.map.a.b().f(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l0() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public void m0(int i4, List<ControllerManager.c> list) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean n0(int i4, PadKeyEvent padKeyEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean o0(PadMotionEvent padMotionEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        t0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        v0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyEvent p0(PadKeyEvent padKeyEvent) {
        int e5 = padKeyEvent.e();
        int d5 = padKeyEvent.d();
        padKeyEvent.f();
        padKeyEvent.a();
        padKeyEvent.b();
        return new KeyEvent(d5, e5);
    }

    void q0() {
        com.papa.controller.core.d dVar = this.f33469c;
        if (dVar != null) {
            dVar.v(new a());
        }
    }

    public void r0(boolean z4) {
        this.f33468b = z4;
    }

    public void s0(int i4, int i5) {
        com.papa.controller.core.d dVar = this.f33469c;
        if (dVar != null) {
            dVar.y(i4, i5);
        }
    }

    void t0() {
        try {
            if (this.f33469c == null) {
                this.f33469c = new com.papa.controller.core.d(this);
            }
            com.papa.controller.core.d dVar = this.f33469c;
            if (dVar != null) {
                dVar.w(this, new Handler());
                q0();
                this.f33469c.x(this.f33468b);
                this.f33469c.B();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void u0() {
        EaseBreathInterpolator easeBreathInterpolator = new EaseBreathInterpolator();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(1200L);
        ofInt.setInterpolator(easeBreathInterpolator);
        ofInt.addUpdateListener(new b());
        ofInt.start();
    }

    void v0() {
        com.papa.controller.core.d dVar = this.f33469c;
        if (dVar != null) {
            dVar.F();
        }
    }

    @Override // com.papa.controller.core.c
    public void w(float f5, float f6, PadMotionEvent padMotionEvent) {
        o0(padMotionEvent);
    }

    @Override // com.papa.controller.core.c
    public void x(float f5, float f6, PadMotionEvent padMotionEvent) {
        o0(padMotionEvent);
    }
}
