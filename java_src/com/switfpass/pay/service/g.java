package com.switfpass.pay.service;

import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class g extends com.switfpass.pay.thread.b {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61780b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ com.switfpass.pay.thread.h f61781c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(RequestMsg requestMsg, com.switfpass.pay.thread.h hVar) {
        this.f61780b = requestMsg;
        this.f61781c = hVar;
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
        String str3 = "token_id=" + this.f61780b.s() + "&trade_type=unified.trade.query&out_trade_no=" + this.f61780b.k();
        unused = d.f61773a;
        new StringBuilder("unfiedQueryOrder params-->").append(str3);
        try {
            com.switfpass.pay.thread.f d5 = com.switfpass.pay.thread.d.c().d(str2, jSONObject, null, null, str3);
            if (d5.c()) {
                int i4 = d5.f61818c;
                if (i4 == -4) {
                    hVar = this.f61781c;
                    str = "请求连接超时，请稍候再试";
                } else if (i4 == -3) {
                    hVar = this.f61781c;
                    str = "请求服务连接失败，请稍候再试";
                } else if (i4 != -1) {
                    return null;
                } else {
                    hVar = this.f61781c;
                    str = "网络连接不可用，请检查你网络连接";
                }
            } else {
                unused2 = d.f61773a;
                new StringBuilder("unfiedQueryOrder result data-->").append(d5.f61816a);
                if (Integer.valueOf(Integer.parseInt(d5.f61816a.getString("status"))).intValue() == 0) {
                    OrderBena orderBena = new OrderBena();
                    orderBena.M(d5.f61816a.optString("money", ""));
                    orderBena.P(d5.f61816a.optString("out_trade_no", ""));
                    orderBena.Y(d5.f61816a.optString("trade_state", ""));
                    orderBena.W(d5.f61816a.optString("trade_type", ""));
                    orderBena.b0(d5.f61816a.optString("trade_name", ""));
                    orderBena.c0(d5.f61816a.optString("trade_time", ""));
                    orderBena.d0(d5.f61816a.optString("transaction_id", ""));
                    orderBena.F(d5.f61816a.optString("body", ""));
                    orderBena.K(d5.f61816a.optString("order_no", ""));
                    orderBena.J(d5.f61816a.optString("mch_name", ""));
                    orderBena.O(d5.f61816a.optString("sub_openid", ""));
                    orderBena.L(d5.f61816a.optString("message", ""));
                    orderBena.V(d5.f61816a.optString("status", ""));
                    return orderBena;
                }
                hVar = this.f61781c;
                str = d5.f61816a.getString("message");
            }
            hVar.onError(str);
            return null;
        } catch (Exception e5) {
            unused3 = d.f61773a;
            new StringBuilder("createNativeOrder method error ").append(e5.getMessage());
            this.f61781c.onError("查询确认结果失败");
            return null;
        }
    }
}
