package com.switfpass.pay.utils;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.Toast;
import com.switfpass.pay.activity.QQWapPayWebView;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class q1 extends com.switfpass.pay.thread.h {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ d0 f61942a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61943b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(d0 d0Var, RequestMsg requestMsg) {
        this.f61942a = d0Var;
        this.f61943b = requestMsg;
    }

    @Override // com.switfpass.pay.thread.h, com.switfpass.pay.thread.e
    public final void onError(Object obj) {
        Activity activity;
        super.onError(obj);
        this.f61942a.l();
        if (obj != null) {
            try {
                activity = this.f61942a.f61839b;
                activity.runOnUiThread(new r1(this, obj));
                com.switfpass.pay.handle.a.b(9, -1, obj.toString());
            } catch (Exception e5) {
                new StringBuilder().append(e5);
            }
        }
    }

    @Override // com.switfpass.pay.thread.e
    public final void onPostExecute() {
        super.onPostExecute();
    }

    @Override // com.switfpass.pay.thread.e
    public final void onPreExecute() {
        Activity activity;
        d0 d0Var = this.f61942a;
        activity = d0Var.f61839b;
        d0Var.v(activity, true, "请稍候，正在请求QQ钱包H5支付..");
        super.onPreExecute();
    }

    @Override // com.switfpass.pay.thread.e
    public final /* synthetic */ void onSucceed(Object obj) {
        Activity activity;
        Activity activity2;
        Activity activity3;
        OrderBena orderBena = (OrderBena) obj;
        this.f61942a.l();
        if (orderBena != null) {
            try {
                com.switfpass.pay.handle.a.b(9, 0, "success");
                activity = this.f61942a.f61839b;
                if (!d0.o(activity)) {
                    activity2 = this.f61942a.f61839b;
                    Toast.makeText(activity2, "手机QQ没有安装，请先安装手机QQ", 0).show();
                    return;
                }
                if (!TextUtils.isEmpty(orderBena.l())) {
                    this.f61943b.F(orderBena.l());
                }
                activity3 = this.f61942a.f61839b;
                QQWapPayWebView.startActivity(activity3, orderBena.z(), this.f61943b.s(), this.f61943b.k());
            } catch (Exception e5) {
                new StringBuilder("qqWapPays ").append(e5);
            }
        }
    }
}
