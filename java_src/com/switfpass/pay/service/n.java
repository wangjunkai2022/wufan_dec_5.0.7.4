package com.switfpass.pay.service;

import androidx.core.provider.FontsContractCompat;
import com.join.mgps.dto.Constant;
import com.qq.e.comm.pi.ACTD;
import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.OrderBena;
import com.switfpass.pay.bean.RequestMsg;
import com.umeng.umcrash.UMCrash;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class n extends com.switfpass.pay.thread.b {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RequestMsg f61797b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ com.switfpass.pay.thread.h f61798c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(RequestMsg requestMsg, com.switfpass.pay.thread.h hVar) {
        this.f61797b = requestMsg;
        this.f61798c = hVar;
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
        jSONObject.put("mchId", this.f61797b.h());
        jSONObject.put("money", this.f61797b.i());
        jSONObject.put("body", this.f61797b.f());
        jSONObject.put("notifyUrl", this.f61797b.j());
        jSONObject.put("outTradeNo", this.f61797b.k());
        jSONObject.put("appId", this.f61797b.b());
        jSONObject.put(Constant.MD5, this.f61797b.p());
        String str3 = "token_id=" + this.f61797b.s() + "&trade_type=pay.weixin.app&appid=" + this.f61797b.b() + "&device_info=AND_SDK";
        try {
            unused = d.f61773a;
            StringBuilder sb = new StringBuilder("param-->");
            sb.append(str3);
            sb.append(",url->");
            sb.append(str2);
            com.switfpass.pay.thread.f d5 = com.switfpass.pay.thread.d.c().d(str2, jSONObject, null, null, str3);
            unused2 = d.f61773a;
            new StringBuilder("result.data-->").append(d5.f61816a);
            if (d5.c()) {
                int i4 = d5.f61818c;
                if (i4 == -4) {
                    hVar = this.f61798c;
                    str = "请求连接超时，请稍候再试";
                } else if (i4 == -3) {
                    hVar = this.f61798c;
                    str = "请求服务连接失败，请稍候再试";
                } else if (i4 != -1) {
                    return null;
                } else {
                    hVar = this.f61798c;
                    str = "网络连接不可用，请检查你网络连接";
                }
            } else if (!d5.f61816a.getString("status").equals("0")) {
                this.f61798c.onError(d5.f61816a.getString("message"));
                return null;
            } else if (Integer.valueOf(Integer.parseInt(d5.f61816a.getString(FontsContractCompat.Columns.RESULT_CODE))).intValue() == 0) {
                OrderBena orderBena = new OrderBena();
                JSONObject jSONObject2 = new JSONObject(d5.f61816a.getString("pay_info"));
                orderBena.Q(jSONObject2.optString("partnerid", ""));
                orderBena.S(jSONObject2.optString("prepayid", ""));
                orderBena.X(jSONObject2.optString(Constant.MD5, ""));
                orderBena.D(jSONObject2.optString(ACTD.APPID_KEY, ""));
                orderBena.Z(jSONObject2.optString(UMCrash.SP_KEY_TIMESTAMP, ""));
                orderBena.N(jSONObject2.optString("noncestr", ""));
                MainApplication.B = jSONObject2.optString("mch_id", "");
                MainApplication.C = this.f61797b.s();
                return orderBena;
            } else {
                hVar = this.f61798c;
                str = d5.f61816a.getString("err_msg");
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
