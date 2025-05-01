package com.mingle.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mingle.shapeloading.R;
/* compiled from: ShapeLoadingDialog.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f55999a;

    /* renamed from: b  reason: collision with root package name */
    private Dialog f56000b;

    /* renamed from: c  reason: collision with root package name */
    private LoadingView f56001c;

    /* renamed from: d  reason: collision with root package name */
    private View f56002d;

    public a(Context context) {
        this.f55999a = context;
        c();
    }

    private void c() {
        this.f56000b = new Dialog(this.f55999a, R.style.custom_dialog);
        View inflate = LayoutInflater.from(this.f55999a).inflate(R.layout.layout_dialog, (ViewGroup) null);
        this.f56002d = inflate;
        this.f56001c = (LoadingView) inflate.findViewById(R.id.loadView);
        this.f56000b.setContentView(this.f56002d);
    }

    public void a() {
        this.f56000b.dismiss();
    }

    public Dialog b() {
        return this.f56000b;
    }

    public void d(int i4) {
        ((GradientDrawable) this.f56002d.getBackground()).setColor(i4);
    }

    public void e(boolean z4) {
        this.f56000b.setCanceledOnTouchOutside(z4);
    }

    public void f(CharSequence charSequence) {
        this.f56001c.setLoadingText(charSequence);
    }

    public void g() {
        this.f56000b.show();
    }
}
