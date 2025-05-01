package com.switfpass.pay.service;

import com.beizi.ad.alipay.RedPackageManager;
import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
import org.json.JSONObject;
/* loaded from: classes5.dex */
final class i extends com.switfpass.pay.thread.b {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61785b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ com.switfpass.pay.thread.h f61786c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(RequestMsg requestMsg, com.switfpass.pay.thread.h hVar) {
        this.f61785b = requestMsg;
        this.f61786c = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.switfpass.pay.thread.b
    /* renamed from: d */
    public OrderBena a() {
        com.switfpass.pay.thread.h hVar;
        String str;
        String unused;
        String unused2;
        String unused3;
        String str2 = MainApplication.f61495f;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_id", this.f61785b.s());
        jSONObject.put(RedPackageManager.AUTH_CODE_KEY, this.f61785b.d());
        jSONObject.put("trade_type", "unified.trade.micropay");
        String str3 = "token_id=" + this.f61785b.s() + "&trade_type=unified.trade.micropay&auth_code=" + this.f61785b.d() + "&device_info=AND_SDK";
        try {
            unused = d.f61773a;
            new StringBuilder("unifiedMicroPay params-->").append(str3);
            com.switfpass.pay.thread.f d5 = com.switfpass.pay.thread.d.c().d(str2, jSONObject, null, null, str3);
            if (d5.c()) {
                int i4 = d5.f61818c;
                if (i4 == -4) {
                    hVar = this.f61786c;
                    str = "请求连接超时，请稍候再试";
                } else if (i4 == -3) {
                    hVar = this.f61786c;
                    str = "请求服务连接失败，请稍候再试";
                } else if (i4 != -1) {
                    return null;
                } else {
                    hVar = this.f61786c;
                    str = "网络连接不可用，请检查你网络连接";
                }
            } else {
                Integer valueOf = Integer.valueOf(Integer.parseInt(d5.f61816a.getString("status")));
                OrderBena orderBena = new OrderBena();
                if (valueOf.intValue() == 0) {
                    unused2 = d.f61773a;
                    new StringBuilder("unifiedMicroPay result data-->").append(d5.f61816a);
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
                    return orderBena;
                } else if (d5.f61816a.optString("need_query", "").equalsIgnoreCase("Y")) {
                    orderBena.P(d5.f61816a.optString("out_trade_no", ""));
                    return orderBena;
                } else {
                    hVar = this.f61786c;
                    str = d5.f61816a.getString("message");
                }
            }
            hVar.onError(str);
            return null;
        } catch (Exception e5) {
            unused3 = d.f61773a;
            new StringBuilder("createNativeOrder method error ").append(e5.getMessage());
            return null;
        }
    }
}
