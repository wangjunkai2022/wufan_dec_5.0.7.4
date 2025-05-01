package com.switfpass.pay.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.switfpass.pay.lib.Resourcemap;
/* loaded from: classes5.dex */
public class l extends Dialog {
    public static final int A = 9;
    public static final int B = 10;
    public static final int C = 11;
    public static final int D = 12;

    /* renamed from: q  reason: collision with root package name */
    public static final int f61893q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f61894r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f61895s = 2;

    /* renamed from: t  reason: collision with root package name */
    public static final int f61896t = 3;

    /* renamed from: u  reason: collision with root package name */
    public static final int f61897u = 4;

    /* renamed from: v  reason: collision with root package name */
    public static final int f61898v = 5;

    /* renamed from: w  reason: collision with root package name */
    public static final int f61899w = 8;

    /* renamed from: x  reason: collision with root package name */
    public static final int f61900x = 6;

    /* renamed from: y  reason: collision with root package name */
    public static final int f61901y = 7;

    /* renamed from: z  reason: collision with root package name */
    public static final int f61902z = 8;

    /* renamed from: b  reason: collision with root package name */
    private Context f61903b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f61904c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f61905d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f61906e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f61907f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f61908g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f61909h;

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup f61910i;

    /* renamed from: j  reason: collision with root package name */
    private i f61911j;

    /* renamed from: k  reason: collision with root package name */
    private View f61912k;

    /* renamed from: l  reason: collision with root package name */
    private View f61913l;

    /* renamed from: m  reason: collision with root package name */
    private EditText f61914m;

    /* renamed from: n  reason: collision with root package name */
    private LinearLayout f61915n;

    /* renamed from: o  reason: collision with root package name */
    private String f61916o;

    /* renamed from: p  reason: collision with root package name */
    private String f61917p;

    public l(Context context, int i4, String str, String str2, String str3, String str4, i iVar) {
        super(context);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(Resourcemap.getLayout_dialog_info(), (ViewGroup) null);
        this.f61910i = viewGroup;
        setContentView(viewGroup);
        k(str3);
        j(str4);
        this.f61903b = context;
        this.f61911j = iVar;
        c(str, str2, i4);
        b(i4);
    }

    public l(Context context, String str, String str2, String str3, int i4, i iVar) {
        super(context);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(Resourcemap.getLayout_dialog_info(), (ViewGroup) null);
        this.f61910i = viewGroup;
        setContentView(viewGroup);
        this.f61903b = context;
        this.f61911j = iVar;
        c(str, str2, i4);
        b(i4);
    }

    private void b(int i4) {
        this.f61909h.setOnClickListener(new h1(this, i4));
        this.f61908g.setOnClickListener(new i1(this, i4));
    }

    private void c(String str, String str2, int i4) {
        TextView textView;
        String str3;
        this.f61904c = (TextView) findViewById(Resourcemap.getById_title());
        this.f61905d = (TextView) findViewById(Resourcemap.getById_content());
        this.f61908g = (TextView) findViewById(Resourcemap.getById_btnOk());
        this.f61909h = (TextView) findViewById(Resourcemap.getById_btnCancel());
        this.f61912k = findViewById(Resourcemap.getById_line_img());
        this.f61914m = (EditText) findViewById(Resourcemap.getById_et_content());
        this.f61915n = (LinearLayout) findViewById(Resourcemap.getById_pay_lay_revers());
        this.f61906e = (TextView) findViewById(Resourcemap.getById_pay_money());
        this.f61907f = (TextView) findViewById(Resourcemap.getById_pay_order_no());
        this.f61913l = findViewById(Resourcemap.getById_pay_img());
        if (i4 != 3 && i4 != 4) {
            switch (i4) {
                case 8:
                    this.f61909h.setVisibility(8);
                    this.f61912k.setVisibility(8);
                    textView = this.f61908g;
                    str3 = "确定";
                    textView.setText(str3);
                    break;
                case 9:
                    this.f61914m.setVisibility(0);
                    this.f61905d.setVisibility(8);
                    this.f61909h.setVisibility(0);
                    this.f61912k.setVisibility(0);
                    break;
                case 10:
                    this.f61907f.setText(g());
                    this.f61906e.setText(f());
                    this.f61915n.setVisibility(0);
                    this.f61905d.setVisibility(8);
                    this.f61908g.setText("冲正");
                    textView = this.f61909h;
                    str3 = "继续查询";
                    textView.setText(str3);
                    break;
                case 11:
                    this.f61909h.setVisibility(8);
                    this.f61912k.setVisibility(8);
                    this.f61908g.setVisibility(8);
                    this.f61913l.setVisibility(8);
                    this.f61915n.setVisibility(8);
                    break;
                case 12:
                    textView = this.f61908g;
                    str3 = "继续支付";
                    textView.setText(str3);
                    break;
            }
        } else {
            this.f61908g.setTextColor(-16776961);
        }
        this.f61904c.setText(str);
        this.f61905d.setText(str2);
    }

    public String f() {
        return this.f61917p;
    }

    public String g() {
        return this.f61916o;
    }

    public void h(String str) {
        TextView textView = this.f61908g;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void i(String str) {
        this.f61905d.setText(str);
    }

    public void j(String str) {
        this.f61917p = str;
    }

    public void k(String str) {
        this.f61916o = str;
    }

    public void l(j jVar, int i4) {
    }

    public void m(k kVar) {
    }

    public void n(Class cls) {
        this.f61903b.startActivity(new Intent(this.f61903b, cls));
    }
}
