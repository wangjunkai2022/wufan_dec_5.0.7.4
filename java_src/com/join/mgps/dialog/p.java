package com.join.mgps.dialog;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: BaseDialog.java */
/* loaded from: classes4.dex */
public class p extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private String f49576b;

    /* renamed from: c  reason: collision with root package name */
    private DialogInterface.OnDismissListener f49577c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f49578d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f49579e;

    /* renamed from: f  reason: collision with root package name */
    private int f49580f;

    /* renamed from: g  reason: collision with root package name */
    private float f49581g;

    /* renamed from: h  reason: collision with root package name */
    private int f49582h;

    /* renamed from: i  reason: collision with root package name */
    private int f49583i;

    /* renamed from: j  reason: collision with root package name */
    private int f49584j;

    public p(@NonNull Context context) {
        this(context, R.style.Dialog);
    }

    private void a() {
        try {
            Window window = getWindow();
            window.setFlags(1024, 1024);
            window.getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? 5894 : 1799);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void b(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setSystemUiVisibility(5894);
        }
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(14)
    private void j() {
        boolean l4 = l();
        int i4 = l4;
        if (k()) {
            i4 = (l4 ? 1 : 0) | 5126;
        }
        if (getWindow().getDecorView() != null) {
            getWindow().getDecorView().setSystemUiVisibility(i4);
        }
    }

    private boolean k() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public int c() {
        return this.f49584j;
    }

    public int d() {
        return this.f49583i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        j();
        DialogInterface.OnDismissListener onDismissListener = this.f49577c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
    }

    public void e(int i4) {
        this.f49582h = i4;
    }

    public void f(float f5) {
        this.f49581g = f5;
    }

    public void g(boolean z4) {
        this.f49579e = z4;
    }

    public void h(int i4) {
        this.f49584j = i4;
    }

    public void i(int i4) {
        this.f49583i = i4;
    }

    public boolean l() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        a();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
        if (Build.VERSION.SDK_INT <= 29) {
            j();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z4) {
        if (getWindow() != null) {
            getWindow().setFlags(8, 8);
            b(getWindow().getDecorView());
            getWindow().clearFlags(8);
        }
        super.onWindowFocusChanged(z4);
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.f49577c = onDismissListener;
    }

    @Override // android.app.Dialog
    public void show() {
        if (getWindow() != null) {
            getWindow().setFlags(8, 8);
        }
        super.show();
        b(getWindow().getDecorView());
        getWindow().clearFlags(8);
    }

    public p(@NonNull Context context, int i4) {
        super(context, i4);
        this.f49576b = getClass().getSimpleName();
        this.f49579e = false;
        this.f49580f = 0;
        this.f49581g = 0.5f;
        this.f49582h = R.style.AlphaAnimStyle;
        this.f49583i = -1;
        this.f49584j = -1;
        this.f49578d = context;
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = this.f49583i;
            attributes.height = this.f49584j;
            attributes.gravity = this.f49580f;
            attributes.windowAnimations = this.f49582h;
            window.setAttributes(attributes);
            if (this.f49579e) {
                window.addFlags(2);
                window.setDimAmount(this.f49581g);
                return;
            }
            window.clearFlags(2);
        }
    }
}
