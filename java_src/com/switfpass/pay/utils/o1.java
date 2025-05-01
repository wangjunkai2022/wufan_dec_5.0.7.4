package com.switfpass.pay.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.text.TextUtils;
import android.widget.Toast;
import com.switfpass.pay.activity.QQWapPayWebView;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class o1 extends com.switfpass.pay.thread.h {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ d0 f61933a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61934b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o1(d0 d0Var, RequestMsg requestMsg) {
        this.f61933a = d0Var;
        this.f61934b = requestMsg;
    }

    @Override // com.switfpass.pay.thread.h, com.switfpass.pay.thread.e
    public final void onError(Object obj) {
        g0 g0Var;
        AlertDialog alertDialog;
        boolean z4;
        Activity activity;
        AlertDialog alertDialog2;
        g0Var = this.f61933a.f61849l;
        g0Var.dismiss();
        alertDialog = this.f61933a.f61855r;
        if (alertDialog != null) {
            alertDialog2 = this.f61933a.f61855r;
            alertDialog2.dismiss();
        }
        z4 = this.f61933a.f61856s;
        if (z4) {
            this.f61933a.f61856s = true;
            super.onError(obj);
            if (obj != null) {
                activity = this.f61933a.f61839b;
                activity.runOnUiThread(new p1(this, obj));
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
        g0 g0Var;
        g0 g0Var2;
        super.onPreExecute();
        activity = this.f61933a.f61839b;
        g0Var = this.f61933a.f61849l;
        h.e(activity, g0Var);
        g0Var2 = this.f61933a.f61849l;
        g0Var2.show();
    }

    @Override // com.switfpass.pay.thread.e
    public final /* synthetic */ void onSucceed(Object obj) {
        g0 g0Var;
        AlertDialog alertDialog;
        boolean z4;
        Activity activity;
        Activity activity2;
        Activity activity3;
        AlertDialog alertDialog2;
        OrderBena orderBena = (OrderBena) obj;
        g0Var = this.f61933a.f61849l;
        g0Var.dismiss();
        alertDialog = this.f61933a.f61855r;
        if (alertDialog != null) {
            alertDialog2 = this.f61933a.f61855r;
            alertDialog2.dismiss();
        }
        if (orderBena != null) {
            z4 = this.f61933a.f61856s;
            if (z4) {
                if (!TextUtils.isEmpty(orderBena.l())) {
                    this.f61934b.F(orderBena.l());
                }
                activity = this.f61933a.f61839b;
                if (d0.i(activity)) {
                    activity3 = this.f61933a.f61839b;
                    QQWapPayWebView.startActivity(activity3, orderBena.z(), this.f61934b.s(), this.f61934b.k());
                    return;
                }
                activity2 = this.f61933a.f61839b;
                Toast.makeText(activity2, "手机没有安装微信，请先安装微信", 0).show();
                return;
            }
        }
        this.f61933a.f61856s = true;
    }
}
