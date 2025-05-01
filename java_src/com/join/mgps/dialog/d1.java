package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: LodingDialog.java */
/* loaded from: classes4.dex */
public class d1 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    boolean f49314b;

    /* renamed from: c  reason: collision with root package name */
    String f49315c;

    /* renamed from: d  reason: collision with root package name */
    TextView f49316d;

    protected d1(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49314b = false;
    }

    public Dialog a(String str) {
        TextView textView = this.f49316d;
        if (textView != null) {
            textView.setText(str);
        }
        this.f49315c = str;
        return this;
    }

    public void b() {
        try {
            if (isShowing()) {
                return;
            }
            show();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.loding_layout);
        setCancelable(this.f49314b);
        this.f49316d = (TextView) findViewById(R.id.textView);
        if (TextUtils.isEmpty(this.f49315c)) {
            return;
        }
        this.f49316d.setText(this.f49315c);
    }

    public d1(Context context) {
        super(context);
        this.f49314b = false;
    }

    public d1(Context context, int i4) {
        super(context, i4);
        this.f49314b = false;
    }

    public d1(Context context, int i4, boolean z4) {
        super(context, i4);
        this.f49314b = false;
        this.f49314b = z4;
    }

    public d1(Context context, int i4, String str) {
        super(context, i4);
        this.f49314b = false;
        this.f49314b = false;
        this.f49315c = str;
    }

    public d1(Context context, int i4, String str, boolean z4) {
        super(context, i4);
        this.f49314b = false;
        this.f49314b = z4;
        this.f49315c = str;
    }
}
