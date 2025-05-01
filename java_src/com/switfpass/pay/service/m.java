package com.switfpass.pay.service;

import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class m extends com.switfpass.pay.thread.b {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61794b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f61795c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ com.switfpass.pay.thread.h f61796d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(RequestMsg requestMsg, String str, com.switfpass.pay.thread.h hVar) {
        this.f61794b = requestMsg;
        this.f61795c = str;
        this.f61796d = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.switfpass.pay.thread.b
    /* renamed from: d */
    public OrderBena a() {
        com.switfpass.pay.thread.h hVar;
        String str;
        String unused;
        String unused2;
        String str2 = MainApplication.f61492c;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_id", this.f61794b.s());
        jSONObject.put("trade_type", this.f61795c);
        String str3 = "token_id=" + this.f61794b.s() + "&trade_type=" + this.f61795c + "&device_info=AND_SDK";
        unused = d.f61773a;
        StringBuilder sb = new StringBuilder("createNativeOrder-token_id->");
        sb.append(this.f61794b.s());
        sb.append(",param-->");
        sb.append(str3);
        try {
            com.switfpass.pay.thread.f d5 = com.switfpass.pay.thread.d.c().d(str2, jSONObject, null, null, str3);
            if (d5.c()) {
                int i4 = d5.f61818c;
                if (i4 == -4) {
                    hVar = this.f61796d;
                    str = "请求连接超时，请稍候再试";
                } else if (i4 == -3) {
                    hVar = this.f61796d;
                    str = "请求服务连接失败，请稍候再试";
                } else if (i4 != -1) {
                    return null;
                } else {
                    hVar = this.f61796d;
                    str = "网络连接不可用，请检查你网络连接";
                }
            } else if (Integer.valueOf(Integer.parseInt(d5.f61816a.getString("status"))).intValue() == 0) {
                OrderBena orderBena = new OrderBena();
                orderBena.e0(d5.f61816a.optString("code_url", ""));
                orderBena.M(d5.f61816a.optString("money", ""));
                orderBena.P(d5.f61816a.optString("out_trade_no", ""));
                orderBena.F(d5.f61816a.optString("body", ""));
                orderBena.W(this.f61795c);
                orderBena.b0(this.f61794b.t());
                orderBena.a0(this.f61794b.s());
                orderBena.I(this.f61794b.h());
                orderBena.G(this.f61794b.g());
                orderBena.E(this.f61794b.e());
                if (this.f61794b.m() != null && !"".equals(this.f61794b.m())) {
                    orderBena.R(this.f61794b.m());
                }
                if (this.f61794b.r() != null && !"".equals(this.f61794b.r())) {
                    orderBena.U(this.f61794b.r());
                }
                return orderBena;
            } else {
                hVar = this.f61796d;
                str = d5.f61816a.getString("message");
            }
            hVar.onError(str);
            return null;
        } catch (Exception e5) {
            unused2 = d.f61773a;
            new StringBuilder("createNativeOrder method error ").append(e5.getMessage());
            this.f61796d.onError("生成二维码失败");
            return null;
        }
    }
}
