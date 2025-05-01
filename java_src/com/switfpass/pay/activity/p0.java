package com.switfpass.pay.activity;

import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
/* loaded from: classes5.dex */
final class p0 extends com.switfpass.pay.thread.h {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ PaySDKCaptureActivity f61582a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61583b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f61584c;

    p0(PaySDKCaptureActivity paySDKCaptureActivity, RequestMsg requestMsg, boolean z4) {
        this.f61582a = paySDKCaptureActivity;
        this.f61583b = requestMsg;
        this.f61584c = z4;
    }

    @Override // com.switfpass.pay.thread.h, com.switfpass.pay.thread.e
    public final void onError(Object obj) {
        super.onError(obj);
        if (this.f61582a.V != null) {
            this.f61582a.V.dismiss();
        }
        if (PaySDKCaptureActivity.f(this.f61582a)) {
            PaySDKCaptureActivity.a(this.f61582a, true);
            this.f61582a.runOnUiThread(new q0(this, obj));
        }
    }

    @Override // com.switfpass.pay.thread.e
    public final void onPostExecute() {
        super.onPostExecute();
    }

    @Override // com.switfpass.pay.thread.e
    public final void onPreExecute() {
        super.onPreExecute();
        PaySDKCaptureActivity paySDKCaptureActivity = this.f61582a;
        com.switfpass.pay.utils.h.e(paySDKCaptureActivity, paySDKCaptureActivity.U);
        this.f61582a.V.show();
    }

    @Override // com.switfpass.pay.thread.e
    public final /* synthetic */ void onSucceed(Object obj) {
        OrderBena orderBena = (OrderBena) obj;
        super.onSucceed(orderBena);
        if (this.f61582a.V != null) {
            this.f61582a.V.dismiss();
        }
        if (orderBena != null) {
            if (orderBena.i() != null) {
                PaySDKCaptureActivity.a(this.f61582a, com.switfpass.pay.utils.o0.d(Double.parseDouble(orderBena.i())));
            }
            this.f61583b.F(orderBena.l());
            if (PaySDKCaptureActivity.f(this.f61582a)) {
                PaySDKCaptureActivity.a(this.f61582a, true);
                if (orderBena.t().equalsIgnoreCase("SUCCESS") && this.f61582a.ae) {
                    this.f61582a.ae = false;
                    this.f61582a.V.dismiss();
                    orderBena.H(true);
                    PayResultActivity.startActivity(orderBena, PaySDKCaptureActivity.g(this.f61582a));
                    this.f61582a.finish();
                } else if (this.f61584c) {
                    if (this.f61582a.V != null) {
                        this.f61582a.V.dismiss();
                    }
                    if (!orderBena.t().equalsIgnoreCase("SUCCESS")) {
                        this.f61582a.V.dismiss();
                        this.f61582a.showToastInfo("该笔订单状态：未支付，请冲正该笔订单或者继续查询确认该笔订单是否已经支付成功!");
                        PaySDKCaptureActivity.h(this.f61582a);
                        return;
                    }
                    this.f61582a.V.dismiss();
                    orderBena.H(true);
                    PayResultActivity.startActivity(orderBena, PaySDKCaptureActivity.g(this.f61582a));
                    this.f61582a.finish();
                } else if (this.f61582a.count >= 4) {
                    PaySDKCaptureActivity.d();
                    new StringBuilder("result.state-->").append(orderBena.t());
                    if (orderBena.t().equalsIgnoreCase("SUCCESS")) {
                        this.f61582a.V.dismiss();
                        return;
                    }
                    PaySDKCaptureActivity.b(this.f61582a, orderBena.l());
                    this.f61582a.V.dismiss();
                    PaySDKCaptureActivity.h(this.f61582a);
                } else {
                    this.f61582a.V.dismiss();
                    PaySDKCaptureActivity.a(this.f61582a, 5L);
                    this.f61582a.count++;
                    PaySDKCaptureActivity paySDKCaptureActivity = this.f61582a;
                    PaySDKCaptureActivity paySDKCaptureActivity2 = this.f61582a;
                    PaySDKCaptureActivity.a(paySDKCaptureActivity, new com.switfpass.pay.utils.l(paySDKCaptureActivity2, paySDKCaptureActivity2.getString((int) com.join.android.app.mgsim.wufun.R.drawable.abc_btn_colored_material), "", this.f61582a.getString((int) com.join.android.app.mgsim.wufun.R.drawable.abc_ic_clear_material), 11, null));
                    PaySDKCaptureActivity paySDKCaptureActivity3 = this.f61582a;
                    com.switfpass.pay.utils.h.e(paySDKCaptureActivity3, PaySDKCaptureActivity.b(paySDKCaptureActivity3));
                    PaySDKCaptureActivity.b(this.f61582a).setOnKeyListener(new r0());
                    PaySDKCaptureActivity.b(this.f61582a).show();
                    PaySDKCaptureActivity.b(this.f61582a, PaySDKCaptureActivity.c());
                    PaySDKCaptureActivity.c(this.f61582a).post(PaySDKCaptureActivity.i(this.f61582a));
                }
            }
        }
    }
}
