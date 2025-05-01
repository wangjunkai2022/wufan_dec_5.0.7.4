package com.join.mgps.customview.popup;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.StyleRes;
import com.join.mgps.Util.u1;
/* compiled from: BasicPopup.java */
/* loaded from: classes4.dex */
public abstract class a<V extends View> implements DialogInterface.OnKeyListener, DialogInterface.OnDismissListener {

    /* renamed from: h  reason: collision with root package name */
    public static final int f48587h = -1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f48588i = -2;

    /* renamed from: b  reason: collision with root package name */
    protected Activity f48589b;

    /* renamed from: c  reason: collision with root package name */
    protected int f48590c;

    /* renamed from: d  reason: collision with root package name */
    protected int f48591d;

    /* renamed from: e  reason: collision with root package name */
    private Dialog f48592e;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f48593f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f48594g = false;

    /* compiled from: BasicPopup.java */
    /* renamed from: com.join.mgps.customview.popup.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class DialogInterface$OnDismissListenerC0360a implements DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DialogInterface.OnDismissListener f48595b;

        DialogInterface$OnDismissListenerC0360a(DialogInterface.OnDismissListener onDismissListener) {
            this.f48595b = onDismissListener;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            a.this.onDismiss(dialogInterface);
            this.f48595b.onDismiss(dialogInterface);
        }
    }

    /* compiled from: BasicPopup.java */
    /* loaded from: classes4.dex */
    class b implements DialogInterface.OnKeyListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DialogInterface.OnKeyListener f48597b;

        b(DialogInterface.OnKeyListener onKeyListener) {
            this.f48597b = onKeyListener;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
            a.this.onKey(dialogInterface, i4, keyEvent);
            return this.f48597b.onKey(dialogInterface, i4, keyEvent);
        }
    }

    public a(Activity activity) {
        this.f48589b = activity;
        DisplayMetrics c5 = u1.c(activity);
        this.f48590c = c5.widthPixels;
        this.f48591d = c5.heightPixels;
        h();
    }

    private void h() {
        FrameLayout frameLayout = new FrameLayout(this.f48589b);
        this.f48593f = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f48593f.setFocusable(true);
        this.f48593f.setFocusableInTouchMode(true);
        Dialog dialog = new Dialog(this.f48589b);
        this.f48592e = dialog;
        dialog.setCanceledOnTouchOutside(true);
        this.f48592e.setCancelable(true);
        this.f48592e.setOnKeyListener(this);
        this.f48592e.setOnDismissListener(this);
        Window window = this.f48592e.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.requestFeature(1);
            window.setContentView(this.f48593f);
        }
        z(this.f48590c, -2);
    }

    public void A(int i4) {
        z(i4, 0);
    }

    public final void B() {
        if (this.f48594g) {
            this.f48592e.show();
            C();
            return;
        }
        q();
        V j4 = j();
        o(j4);
        p(j4);
        this.f48594g = true;
        this.f48592e.show();
        C();
    }

    protected void C() {
    }

    public void a() {
        b();
    }

    protected final void b() {
        this.f48592e.dismiss();
    }

    public View c() {
        return this.f48593f.getChildAt(0);
    }

    public ViewGroup d() {
        return this.f48593f;
    }

    public int e() {
        return this.f48591d;
    }

    public int f() {
        return this.f48590c;
    }

    public Window g() {
        return this.f48592e.getWindow();
    }

    public Context getContext() {
        return this.f48592e.getContext();
    }

    public boolean i() {
        return this.f48592e.isShowing();
    }

    protected abstract V j();

    public boolean k() {
        a();
        return false;
    }

    public void l(@StyleRes int i4) {
        Window window = this.f48592e.getWindow();
        if (window != null) {
            window.setWindowAnimations(i4);
        }
    }

    public void m(boolean z4) {
        this.f48592e.setCancelable(z4);
    }

    public void n(boolean z4) {
        this.f48592e.setCanceledOnTouchOutside(z4);
    }

    public void o(View view) {
        this.f48593f.removeAllViews();
        this.f48593f.addView(view);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        a();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i4 == 4) {
            k();
            return false;
        }
        return false;
    }

    protected void p(V v2) {
    }

    protected void q() {
    }

    public void r(boolean z4) {
        if (z4) {
            z(this.f48590c, (int) (this.f48591d * 0.85f));
        }
    }

    public void s(boolean z4) {
        this.f48593f.setFitsSystemWindows(z4);
    }

    public void t(int i4) {
        Window window = this.f48592e.getWindow();
        if (window != null) {
            window.setGravity(i4);
        }
        if (i4 == 17) {
            A((int) (this.f48590c * 0.7f));
        }
    }

    public void u(boolean z4) {
        if (z4) {
            z(this.f48590c, this.f48591d / 2);
        }
    }

    public void v(int i4) {
        z(0, i4);
    }

    public void w(DialogInterface.OnDismissListener onDismissListener) {
        this.f48592e.setOnDismissListener(new DialogInterface$OnDismissListenerC0360a(onDismissListener));
    }

    public void x(DialogInterface.OnKeyListener onKeyListener) {
        this.f48592e.setOnKeyListener(new b(onKeyListener));
    }

    public void y(boolean z4) {
        this.f48594g = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0013, code lost:
        if (r3 == 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(int r2, int r3) {
        /*
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L5
            int r2 = r1.f48590c
        L5:
            r0 = -2
            if (r2 != 0) goto Le
            if (r3 != 0) goto Le
            int r2 = r1.f48590c
        Lc:
            r3 = -2
            goto L16
        Le:
            if (r2 != 0) goto L13
            int r2 = r1.f48590c
            goto L16
        L13:
            if (r3 != 0) goto L16
            goto Lc
        L16:
            android.widget.FrameLayout r0 = r1.f48593f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L24
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r2, r3)
            goto L28
        L24:
            r0.width = r2
            r0.height = r3
        L28:
            android.widget.FrameLayout r2 = r1.f48593f
            r2.setLayoutParams(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.popup.a.z(int, int):void");
    }
}
