package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: HandShankDialog.java */
/* loaded from: classes4.dex */
public class z0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49842b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49843c;

    /* renamed from: d  reason: collision with root package name */
    Button f49844d;

    /* renamed from: e  reason: collision with root package name */
    TextView f49845e;

    public z0(Context context, int i4) {
        super(context, i4);
        this.f49842b = context;
    }

    public void a(View.OnClickListener onClickListener) {
        this.f49845e.setOnClickListener(onClickListener);
    }

    public void b(View.OnClickListener onClickListener) {
        this.f49844d.setOnClickListener(onClickListener);
    }

    public void c(String str) {
        this.f49843c.setText(str);
    }

    public z0(Context context) {
        super(context, R.style.dialog_error);
        this.f49842b = context;
        setContentView(LayoutInflater.from(context).inflate(R.layout.dialog_handshank, (ViewGroup) null));
        this.f49843c = (TextView) findViewById(R.id.name_tv);
        this.f49845e = (TextView) findViewById(R.id.cancel_tv);
        this.f49844d = (Button) findViewById(R.id.check_btn);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
