package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: FightClientLoadingDialog2.java */
/* loaded from: classes4.dex */
public class o0 extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49559b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49560c;

    public o0(Context context, int i4) {
        super(context, i4);
        this.f49559b = context;
    }

    public void a(String str) {
        TextView textView = this.f49560c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f49559b).inflate(R.layout.dialog_fight_connect_server2, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.fightLoadingIcon);
        AnimationDrawable animationDrawable = (AnimationDrawable) this.f49559b.getResources().getDrawable(R.drawable.net_invite_dialog_loading);
        if (Build.VERSION.SDK_INT >= 16) {
            imageView.setBackground(animationDrawable);
        } else {
            imageView.setBackgroundDrawable(animationDrawable);
        }
        animationDrawable.start();
        this.f49560c = (TextView) inflate.findViewById(R.id.hint);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setContentView(inflate);
    }

    public o0(Context context) {
        super(context);
        this.f49559b = context;
    }
}
