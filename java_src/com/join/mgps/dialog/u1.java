package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.activity.ShareWebActivity_;
import com.join.mgps.dto.OnlineCouponConfigBean;
import com.papa.sim.statistic.Event;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: OnlineCouponDialog.java */
/* loaded from: classes4.dex */
public class u1 extends Dialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private Context f49700b;

    /* renamed from: c  reason: collision with root package name */
    private OnlineCouponConfigBean f49701c;

    /* renamed from: d  reason: collision with root package name */
    private int f49702d;

    /* renamed from: e  reason: collision with root package name */
    private a f49703e;

    /* compiled from: OnlineCouponDialog.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public u1(@NonNull Context context, OnlineCouponConfigBean onlineCouponConfigBean, int i4) {
        super(context);
        this.f49703e = null;
        this.f49700b = context;
        this.f49701c = onlineCouponConfigBean;
        this.f49702d = i4;
    }

    private void a() {
        TextView textView = (TextView) findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) findViewById(R.id.tvDesc);
        ((ImageView) findViewById(R.id.ivClose)).setOnClickListener(this);
        ((TextView) findViewById(R.id.tvGetCoupon)).setOnClickListener(this);
        OnlineCouponConfigBean onlineCouponConfigBean = this.f49701c;
        textView.setText(onlineCouponConfigBean == null ? "" : onlineCouponConfigBean.getRedPacketHint());
        OnlineCouponConfigBean onlineCouponConfigBean2 = this.f49701c;
        textView2.setText(onlineCouponConfigBean2 != null ? onlineCouponConfigBean2.getRedPacketSubHint() : "");
    }

    public void b(a aVar) {
        this.f49703e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.ivClose) {
            dismiss();
        } else if (view.getId() == R.id.tvGetCoupon) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(this.f49701c.getRedPacketJumpUrl());
            ShareWebActivity_.t2(this.f49700b).b(intentDateBean).start();
            com.papa.sim.statistic.p.l(this.f49700b).Q1(Event.clickOpenPopUpRedBag, AccountUtil_.getInstance_(this.f49700b).getAccountData().getUid());
            dismiss();
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_online_coupon);
        setCanceledOnTouchOutside(false);
        getWindow().setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        a();
    }
}
