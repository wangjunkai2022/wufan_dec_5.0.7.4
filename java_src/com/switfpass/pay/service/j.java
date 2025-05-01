package com.switfpass.pay.service;

import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
import org.json.JSONObject;
/* loaded from: classes5.dex */
final class j extends com.switfpass.pay.thread.b {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61787b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ com.switfpass.pay.thread.h f61788c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(RequestMsg requestMsg, com.switfpass.pay.thread.h hVar) {
        this.f61787b = requestMsg;
        this.f61788c = hVar;
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
        jSONObject.put("token_id", this.f61787b.s());
        jSONObject.put("out_trade_no", this.f61787b.k());
        jSONObject.put("trade_type", "unified.micropay.reverse");
        String str3 = "token_id=" + this.f61787b.s() + "&trade_type=unified.micropay.reverse&out_trade_no=" + this.f61787b.k() + "&device_info=AND_SDK";
        try {
            unused = d.f61773a;
            new StringBuilder("unifiedReverse params-->").append(str3);
            com.switfpass.pay.thread.f d5 = com.switfpass.pay.thread.d.c().d(str2, jSONObject, null, null, str3);
            if (d5.c()) {
                int i4 = d5.f61818c;
                if (i4 == -4) {
                    hVar = this.f61788c;
                    str = "请求连接超时，请稍候再试";
                } else if (i4 == -3) {
                    hVar = this.f61788c;
                    str = "请求服务连接失败，请稍候再试";
                } else if (i4 == -1) {
                    hVar = this.f61788c;
                    str = "网络连接不可用，请检查你网络连接";
                }
                hVar.onError(str);
            } else if (Integer.valueOf(Integer.parseInt(d5.f61816a.getString("status"))).intValue() == 0) {
                OrderBena orderBena = new OrderBena();
                unused2 = d.f61773a;
                new StringBuilder("unifiedReverse result data-->").append(d5.f61816a);
                return orderBena;
            } else {
                this.f61788c.onError(d5.f61816a.getString("message"));
            }
            return null;
        } catch (Exception e5) {
            unused3 = d.f61773a;
            new StringBuilder("unifiedReverse method error ").append(e5.getMessage());
            return null;
        }
    }
}
