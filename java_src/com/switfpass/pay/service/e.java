package com.switfpass.pay.service;

import com.switfpass.pay.MainApplication;
import com.switfpass.pay.bean.OrderBena;
import org.json.JSONObject;
/* loaded from: classes5.dex */
final class e extends com.switfpass.pay.thread.b {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f61775b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ com.switfpass.pay.thread.h f61776c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, com.switfpass.pay.thread.h hVar) {
        this.f61775b = str;
        this.f61776c = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.switfpass.pay.thread.b
    /* renamed from: d */
    public OrderBena a() {
        String string;
        JSONObject jSONObject = new JSONObject();
        OrderBena orderBena = new OrderBena();
        jSONObject.put("openid", this.f61775b);
        com.switfpass.pay.thread.d c5 = com.switfpass.pay.thread.d.c();
        com.switfpass.pay.thread.f d5 = c5.d(String.valueOf(MainApplication.f61498i) + "spay/sendRedPack", jSONObject, null, null, null);
        try {
            if (!d5.c() && (string = d5.f61816a.getString("status")) != null) {
                if (Boolean.parseBoolean(string)) {
                    return orderBena;
                }
                return null;
            }
        } catch (Exception unused) {
            this.f61776c.onError("红包发送失败，请稍后再试..");
        }
        return null;
    }
}
