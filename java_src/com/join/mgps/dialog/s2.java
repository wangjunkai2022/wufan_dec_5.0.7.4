package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: WifiFightMismatchDialog.java */
/* loaded from: classes4.dex */
public class s2 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49652b;

    /* renamed from: c  reason: collision with root package name */
    Button f49653c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f49654d;

    /* renamed from: e  reason: collision with root package name */
    String f49655e;

    /* renamed from: f  reason: collision with root package name */
    String f49656f;

    /* renamed from: g  reason: collision with root package name */
    TextView f49657g;

    /* renamed from: h  reason: collision with root package name */
    TextView f49658h;

    /* compiled from: WifiFightMismatchDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s2.this.dismiss();
        }
    }

    /* compiled from: WifiFightMismatchDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s2.this.dismiss();
            ((Activity) s2.this.f49652b).finish();
        }
    }

    public s2(Context context, int i4, String str, String str2) {
        super(context, i4);
        this.f49652b = context;
        this.f49655e = str;
        this.f49656f = str2;
    }

    public void a(int i4) {
        this.f49653c.setVisibility(i4);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        requestWindowFeature(-1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View inflate = LayoutInflater.from(this.f49652b).inflate(R.layout.dialog_fight_mismatch, (ViewGroup) null);
        this.f49653c = (Button) inflate.findViewById(R.id.cancel);
        this.f49654d = (ImageView) inflate.findViewById(R.id.back);
        TextView textView = (TextView) inflate.findViewById(R.id.info);
        this.f49658h = textView;
        this.f49658h.setText(textView.getText().toString().replace("$1", this.f49656f));
        this.f49653c.setOnClickListener(new a());
        this.f49654d.setOnClickListener(new b());
        setContentView(inflate);
    }

    public s2(Context context) {
        super(context);
        this.f49652b = context;
    }
}
