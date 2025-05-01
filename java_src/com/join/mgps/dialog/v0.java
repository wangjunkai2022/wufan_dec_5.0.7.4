package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: ForumDialog.java */
/* loaded from: classes4.dex */
public class v0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49707b;

    /* renamed from: c  reason: collision with root package name */
    Button f49708c;

    /* renamed from: d  reason: collision with root package name */
    Button f49709d;

    /* renamed from: e  reason: collision with root package name */
    TextView f49710e;

    /* renamed from: f  reason: collision with root package name */
    TextView f49711f;

    public v0(Context context, int i4) {
        super(context, i4);
        this.f49707b = context;
    }

    public v0 a(String str) {
        this.f49711f.setText(str);
        return this;
    }

    public void b(int i4) {
        this.f49711f.setVisibility(i4);
    }

    public v0 c(View.OnClickListener onClickListener) {
        this.f49709d.setOnClickListener(onClickListener);
        return this;
    }

    public void d(String str) {
        this.f49709d.setText(str);
    }

    public v0 e(View.OnClickListener onClickListener) {
        this.f49708c.setOnClickListener(onClickListener);
        return this;
    }

    public void f(String str) {
        this.f49708c.setText(str);
    }

    public v0 g(String str) {
        this.f49710e.setText(str);
        return this;
    }

    public v0(Context context) {
        super(context, R.style.dialog_error);
        this.f49707b = context;
        setContentView(LayoutInflater.from(context).inflate(R.layout.dialog_forum, (ViewGroup) null));
        this.f49708c = (Button) findViewById(R.id.positive_btn);
        this.f49709d = (Button) findViewById(R.id.negative_btn);
        this.f49710e = (TextView) findViewById(R.id.tip_title);
        this.f49711f = (TextView) findViewById(R.id.tip_content);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
