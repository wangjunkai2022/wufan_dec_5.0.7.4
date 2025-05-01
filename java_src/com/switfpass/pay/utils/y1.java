package com.switfpass.pay.utils;

import android.app.Activity;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y1 extends com.switfpass.pay.thread.h {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ d0 f61975a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61976b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y1(d0 d0Var, RequestMsg requestMsg) {
        this.f61975a = d0Var;
        this.f61976b = requestMsg;
    }

    @Override // com.switfpass.pay.thread.h, com.switfpass.pay.thread.e
    public final void onError(Object obj) {
        Activity activity;
        super.onError(obj);
        this.f61975a.l();
        if (obj != null) {
            activity = this.f61975a.f61839b;
            activity.runOnUiThread(new z1(this, obj));
        }
    }

    @Override // com.switfpass.pay.thread.e
    public final void onPostExecute() {
        super.onPostExecute();
    }

    @Override // com.switfpass.pay.thread.e
    public final void onPreExecute() {
        Activity activity;
        super.onPreExecute();
        d0 d0Var = this.f61975a;
        activity = d0Var.f61839b;
        d0Var.v(activity, true, "请稍候，正在请求微信支付...");
    }

    @Override // com.switfpass.pay.thread.e
    public final /* synthetic */ void onSucceed(Object obj) {
        boolean z4;
        OrderBena orderBena = (OrderBena) obj;
        this.f61975a.l();
        if (orderBena != null) {
            z4 = this.f61975a.f61856s;
            if (z4) {
                d0.c(this.f61975a, orderBena, this.f61976b);
            }
        }
    }
}
