package com.airsaid.pickerviewlibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
/* compiled from: OptionsPickerView.java */
/* loaded from: classes2.dex */
public class c<T> extends com.airsaid.pickerviewlibrary.widget.a implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    private Context f4416o;

    /* renamed from: p  reason: collision with root package name */
    private a f4417p;

    /* renamed from: q  reason: collision with root package name */
    private com.airsaid.pickerviewlibrary.widget.b<T> f4418q;

    /* renamed from: r  reason: collision with root package name */
    private Button f4419r;

    /* renamed from: s  reason: collision with root package name */
    private Button f4420s;

    /* renamed from: t  reason: collision with root package name */
    private TextView f4421t;

    /* renamed from: u  reason: collision with root package name */
    private View f4422u;

    /* compiled from: OptionsPickerView.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i4, int i5, int i6);
    }

    public c(Context context) {
        super(context);
        this.f4416o = context;
        o();
    }

    private void o() {
        LayoutInflater.from(this.f4416o).inflate(R.layout.pickerview_options, this.f4425d);
        this.f4418q = new com.airsaid.pickerviewlibrary.widget.b<>(d(R.id.optionspicker));
        this.f4422u = d(R.id.rlt_head_view);
        this.f4421t = (TextView) d(R.id.tvTitle);
        this.f4419r = (Button) d(R.id.btnSubmit);
        this.f4420s = (Button) d(R.id.btnCancel);
        this.f4419r.setOnClickListener(this);
        this.f4420s.setOnClickListener(this);
    }

    public void A(ArrayList<T> arrayList, ArrayList<ArrayList<T>> arrayList2, ArrayList<ArrayList<ArrayList<T>>> arrayList3, boolean z4) {
        this.f4418q.q(arrayList, arrayList2, arrayList3, z4);
    }

    public void B(ArrayList<T> arrayList, ArrayList<ArrayList<T>> arrayList2, boolean z4) {
        this.f4418q.q(arrayList, arrayList2, null, z4);
    }

    public void C(int i4) {
        this.f4418q.j(i4, 0, 0);
    }

    public void D(int i4, int i5) {
        this.f4418q.j(i4, i5, 0);
    }

    public void E(int i4, int i5, int i6) {
        this.f4418q.j(i4, i5, i6);
    }

    public void F(String str) {
        this.f4419r.setText(str);
    }

    public void G(int i4) {
        this.f4419r.setTextColor(i4);
    }

    public void H(float f5) {
        this.f4419r.setTextSize(f5);
    }

    public void I(float f5) {
        this.f4418q.s(f5);
    }

    public void J(String str) {
        this.f4421t.setText(str);
    }

    public void K(int i4) {
        this.f4421t.setTextColor(i4);
    }

    public void L(float f5) {
        this.f4421t.setTextSize(f5);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btnSubmit) {
            if (this.f4417p != null) {
                int[] g4 = this.f4418q.g();
                this.f4417p.a(g4[0], g4[1], g4[2]);
            }
            b();
        } else if (id == R.id.btnCancel) {
            b();
        }
    }

    public void p(String str) {
        this.f4420s.setText(str);
    }

    public void q(int i4) {
        this.f4420s.setTextColor(i4);
    }

    public void r(float f5) {
        this.f4420s.setTextSize(f5);
    }

    public void s(boolean z4) {
        this.f4418q.k(z4);
    }

    public void t(boolean z4, boolean z5, boolean z6) {
        this.f4418q.l(z4, z5, z6);
    }

    public void u(int i4) {
        this.f4422u.setBackgroundColor(i4);
    }

    public void v(String str) {
        this.f4418q.m(str, null, null);
    }

    public void w(String str, String str2) {
        this.f4418q.m(str, str2, null);
    }

    public void x(String str, String str2, String str3) {
        this.f4418q.m(str, str2, str3);
    }

    public void y(a aVar) {
        this.f4417p = aVar;
    }

    public void z(ArrayList<T> arrayList) {
        this.f4418q.q(arrayList, null, null, false);
    }
}
