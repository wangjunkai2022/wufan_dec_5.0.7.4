package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: CloudNoticeProgressDialog.java */
/* loaded from: classes4.dex */
public class x extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49766b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49767c;

    /* renamed from: d  reason: collision with root package name */
    ProgressBar f49768d;

    /* renamed from: e  reason: collision with root package name */
    TextView f49769e;

    /* renamed from: f  reason: collision with root package name */
    TextView f49770f;

    /* renamed from: g  reason: collision with root package name */
    TextView f49771g;

    /* renamed from: h  reason: collision with root package name */
    TextView f49772h;

    /* renamed from: i  reason: collision with root package name */
    String f49773i;

    /* renamed from: j  reason: collision with root package name */
    String f49774j;

    /* renamed from: k  reason: collision with root package name */
    String f49775k;

    /* renamed from: l  reason: collision with root package name */
    String f49776l;

    /* renamed from: m  reason: collision with root package name */
    c f49777m;

    /* renamed from: n  reason: collision with root package name */
    c f49778n;

    /* renamed from: o  reason: collision with root package name */
    CompoundButton.OnCheckedChangeListener f49779o;

    /* compiled from: CloudNoticeProgressDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x xVar = x.this;
            xVar.f49777m.a(xVar);
        }
    }

    /* compiled from: CloudNoticeProgressDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x xVar = x.this;
            xVar.f49778n.a(xVar);
        }
    }

    /* compiled from: CloudNoticeProgressDialog.java */
    /* loaded from: classes4.dex */
    public interface c {
        void a(x xVar);
    }

    public x(Context context) {
        super(context);
        this.f49766b = context;
    }

    public x a(c cVar) {
        this.f49778n = cVar;
        return this;
    }

    public x b(String str) {
        this.f49776l = str;
        return this;
    }

    public x c(String str, String str2, int i4) {
        this.f49771g.setText(str);
        this.f49772h.setText(str2);
        this.f49768d.setProgress(i4);
        return this;
    }

    public x d(c cVar) {
        this.f49777m = cVar;
        return this;
    }

    public x e(String str) {
        this.f49773i = str;
        return this;
    }

    public x f(String str) {
        this.f49774j = str;
        return this;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f49766b).inflate(R.layout.dialog_cloud_progress_notice, (ViewGroup) null));
        setCancelable(false);
        this.f49769e = (TextView) findViewById(R.id.ok);
        this.f49767c = (TextView) findViewById(R.id.cancle);
        this.f49770f = (TextView) findViewById(R.id.title);
        this.f49772h = (TextView) findViewById(R.id.downSpeed);
        this.f49771g = (TextView) findViewById(R.id.downsize);
        this.f49768d = (ProgressBar) findViewById(R.id.progress);
        this.f49770f.setText(this.f49774j);
        this.f49769e.setText(this.f49773i);
        this.f49769e.setOnClickListener(new a());
        this.f49767c.setText(this.f49776l);
        this.f49767c.setOnClickListener(new b());
    }

    protected x(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49766b = context;
    }

    public x(Context context, int i4) {
        super(context, i4);
        this.f49766b = context;
    }
}
