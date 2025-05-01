package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: CloudPassDialog.java */
/* loaded from: classes4.dex */
public class z extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49837b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f49838c;

    /* renamed from: d  reason: collision with root package name */
    TextView f49839d;

    /* renamed from: e  reason: collision with root package name */
    TextView f49840e;

    /* renamed from: f  reason: collision with root package name */
    TextView f49841f;

    public z(Context context) {
        super(context);
        this.f49837b = context;
    }

    public void a(String str) {
        this.f49839d.setText(str);
    }

    public void b(int i4) {
        this.f49839d.setVisibility(i4);
    }

    public void c(int i4) {
        this.f49838c.setImageResource(i4);
    }

    public void d(String str) {
        this.f49841f.setText(str);
    }

    public void e(View.OnClickListener onClickListener) {
        this.f49841f.setOnClickListener(onClickListener);
    }

    public void f(String str) {
        this.f49840e.setText(str);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f49837b).inflate(R.layout.dialog_cloud_pass, (ViewGroup) null);
        this.f49838c = (ImageView) inflate.findViewById(R.id.status_icon);
        this.f49839d = (TextView) inflate.findViewById(R.id.per);
        this.f49840e = (TextView) inflate.findViewById(R.id.txt);
        this.f49841f = (TextView) inflate.findViewById(R.id.sub);
        setContentView(inflate);
    }

    protected z(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49837b = context;
    }

    public z(Context context, int i4) {
        super(context, i4);
        this.f49837b = context;
    }
}
