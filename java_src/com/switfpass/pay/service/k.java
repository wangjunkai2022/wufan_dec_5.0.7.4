package com.switfpass.pay.service;

import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.MchBean;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
final class k extends com.switfpass.pay.thread.b {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f61789b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ com.switfpass.pay.thread.h f61790c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, com.switfpass.pay.thread.h hVar) {
        this.f61789b = str;
        this.f61790c = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.switfpass.pay.thread.b
    /* renamed from: d */
    public List a() {
        com.switfpass.pay.thread.h hVar;
        String str;
        String unused;
        String str2 = String.valueOf(MainApplication.f61492c) + "/spay/queryByMchId";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mchId", this.f61789b);
        try {
            com.switfpass.pay.thread.f d5 = com.switfpass.pay.thread.d.c().d(str2, jSONObject, null, null, null);
            if (d5.c()) {
                int i4 = d5.f61818c;
                if (i4 == -4) {
                    hVar = this.f61790c;
                    str = "请求连接超时，请稍候再试";
                } else if (i4 == -3) {
                    hVar = this.f61790c;
                    str = "请求服务连接失败，请稍候再试";
                } else if (i4 == -1) {
                    hVar = this.f61790c;
                    str = "网络连接不可用，请检查你网络连接";
                }
                hVar.onError(str);
            } else if (Integer.valueOf(Integer.parseInt(d5.f61816a.getString("result"))).intValue() == 200) {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = new JSONArray(d5.f61816a.getString("message"));
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    MchBean mchBean = new MchBean();
                    mchBean.w(jSONArray.getJSONObject(i5).optString("tradeType", ""));
                    arrayList.add(mchBean);
                }
                return arrayList;
            } else {
                this.f61790c.onError(d5.f61816a.getString("message"));
            }
            return null;
        } catch (Exception e5) {
            unused = d.f61773a;
            new StringBuilder("createNativeOrder method error ").append(e5.getMessage());
            return null;
        }
    }
}
