package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
/* compiled from: ModFeedBackDialog.java */
/* loaded from: classes4.dex */
public class h1 extends AlertDialog implements View.OnClickListener, DialogInterface.OnShowListener, DialogInterface.OnDismissListener {

    /* renamed from: b  reason: collision with root package name */
    private TextView f49426b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49427c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f49428d;

    /* renamed from: e  reason: collision with root package name */
    private SimpleDraweeView f49429e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f49430f;

    /* renamed from: g  reason: collision with root package name */
    a f49431g;

    /* compiled from: ModFeedBackDialog.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(h1 h1Var);

        void b(h1 h1Var);
    }

    public h1(@NonNull Context context) {
        super(context, R.style.Dialog);
    }

    public void a(String str, String str2, String str3) {
        com.papa.sim.statistic.p.l(getContext()).O1(Event.showmodRunNormal, new Ext().setGameId(str3));
        MyImageLoader.h(this.f49429e, str);
        this.f49426b.setText(str2);
    }

    public void b(a aVar) {
        this.f49431g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        int id = view.getId();
        if (id == R.id.iv_close) {
            dismiss();
        } else if (id == R.id.tv_opt_1) {
            a aVar2 = this.f49431g;
            if (aVar2 != null) {
                aVar2.b(this);
            }
        } else if (id != R.id.tv_opt_2 || (aVar = this.f49431g) == null) {
        } else {
            aVar.a(this);
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_mod_feed_back);
        this.f49426b = (TextView) findViewById(R.id.tv_name);
        this.f49427c = (TextView) findViewById(R.id.tv_opt_1);
        this.f49428d = (TextView) findViewById(R.id.tv_opt_2);
        this.f49429e = (SimpleDraweeView) findViewById(R.id.sdv_image);
        this.f49430f = (ImageView) findViewById(R.id.iv_close);
        setCanceledOnTouchOutside(false);
        setOnShowListener(this);
        setOnDismissListener(this);
        this.f49430f.setOnClickListener(this);
        this.f49427c.setOnClickListener(this);
        this.f49428d.setOnClickListener(this);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
    }
}
