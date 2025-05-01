package com.switfpass.pay.service;

import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class l extends com.switfpass.pay.thread.b {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61791b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f61792c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ com.switfpass.pay.thread.h f61793d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(RequestMsg requestMsg, String str, com.switfpass.pay.thread.h hVar) {
        this.f61791b = requestMsg;
        this.f61792c = str;
        this.f61793d = hVar;
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
        String str2 = MainApplication.f61492c;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_id", this.f61791b.s());
        jSONObject.put("trade_type", this.f61792c);
        String str3 = "token_id=" + this.f61791b.s() + "&trade_type=" + this.f61792c + "&device_info=AND_SDK";
        unused = d.f61773a;
        StringBuilder sb = new StringBuilder("WapPay-token_id->");
        sb.append(this.f61791b.s());
        sb.append(",param-->");
        sb.append(str3);
        try {
            com.switfpass.pay.thread.f d5 = com.switfpass.pay.thread.d.c().d(str2, jSONObject, null, null, str3);
            if (d5.c()) {
                int i4 = d5.f61818c;
                if (i4 == -4) {
                    hVar = this.f61793d;
                    str = "请求连接超时，请稍候再试";
                } else if (i4 == -3) {
                    hVar = this.f61793d;
                    str = "请求服务连接失败，请稍候再试";
                } else if (i4 != -1) {
                    return null;
                } else {
                    hVar = this.f61793d;
                    str = "网络连接不可用，请检查你网络连接";
                }
            } else {
                unused2 = d.f61773a;
                new StringBuilder("WapPay-result.data->").append(d5.f61816a);
                if (Integer.valueOf(Integer.parseInt(d5.f61816a.getString("status"))).intValue() == 0) {
                    OrderBena orderBena = new OrderBena();
                    orderBena.e0(d5.f61816a.optString("code_img_url", ""));
                    orderBena.P(d5.f61816a.optString("out_trade_no", ""));
                    return orderBena;
                }
                hVar = this.f61793d;
                str = d5.f61816a.getString("message");
            }
            hVar.onError(str);
            return null;
        } catch (Exception e5) {
            unused3 = d.f61773a;
            new StringBuilder("createNativeOrder method error ").append(e5.getMessage());
            this.f61793d.onError("生成二维码失败");
            return null;
        }
    }
}
