package com.switfpass.pay.service;

import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.OrderBena;
import org.json.JSONObject;
/* loaded from: classes5.dex */
final class h extends com.switfpass.pay.thread.b {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f61782b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f61783c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ com.switfpass.pay.thread.h f61784d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str, String str2, com.switfpass.pay.thread.h hVar) {
        this.f61782b = str;
        this.f61783c = str2;
        this.f61784d = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.switfpass.pay.thread.b
    /* renamed from: d */
    public OrderBena a() {
        com.switfpass.pay.thread.h hVar;
        String str;
        String unused;
        String unused2;
        String str2 = MainApplication.f61496g;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mchId", this.f61782b);
        try {
            com.switfpass.pay.thread.d c5 = com.switfpass.pay.thread.d.c();
            com.switfpass.pay.thread.f d5 = c5.d(str2, jSONObject, null, null, "uuid=" + this.f61783c);
            if (d5.c()) {
                int i4 = d5.f61818c;
                if (i4 == -4) {
                    hVar = this.f61784d;
                    str = "请求连接超时，请稍候再试";
                } else if (i4 == -3) {
                    hVar = this.f61784d;
                    str = "请求服务连接失败，请稍候再试";
                } else if (i4 != -1) {
                    return null;
                } else {
                    hVar = this.f61784d;
                    str = "网络连接不可用，请检查你网络连接";
                }
                hVar.onError(str);
                return null;
            }
            OrderBena orderBena = new OrderBena();
            unused = d.f61773a;
            new StringBuilder("result data-->").append(d5.f61816a);
            orderBena.M(d5.f61816a.optString("money", ""));
            orderBena.P(d5.f61816a.optString("out_trade_no", ""));
            orderBena.Y(d5.f61816a.optString("status", ""));
            orderBena.W(d5.f61816a.optString("trade_type", ""));
            orderBena.b0(d5.f61816a.optString("trade_name", ""));
            orderBena.c0(d5.f61816a.optString("trade_time", ""));
            orderBena.d0(d5.f61816a.optString("transaction_id", ""));
            orderBena.F(d5.f61816a.optString("body", ""));
            orderBena.K(d5.f61816a.optString("order_no", ""));
            orderBena.J(d5.f61816a.optString("mch_name", ""));
            orderBena.O(d5.f61816a.optString("sub_openid", ""));
            return orderBena;
        } catch (Exception e5) {
            unused2 = d.f61773a;
            new StringBuilder("createNativeOrder method error ").append(e5.getMessage());
            return null;
        }
    }
}
