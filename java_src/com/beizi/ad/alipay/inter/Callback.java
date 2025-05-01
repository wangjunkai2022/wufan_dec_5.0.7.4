package com.beizi.ad.alipay.inter;

import org.json.JSONObject;
/* loaded from: classes2.dex */
public interface Callback {
    void failCallback(int i4, String str);

    void successCallback(JSONObject jSONObject);
}
