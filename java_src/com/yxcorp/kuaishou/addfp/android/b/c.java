package com.yxcorp.kuaishou.addfp.android.b;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    boolean f68586a;

    /* renamed from: b  reason: collision with root package name */
    int f68587b;

    /* renamed from: c  reason: collision with root package name */
    boolean f68588c;

    /* renamed from: d  reason: collision with root package name */
    String f68589d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str) {
        this.f68586a = true;
        if (TextUtils.isEmpty(str)) {
            this.f68586a = false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f68587b = jSONObject.optInt(MediationConstant.KEY_ERROR_CODE, 2);
            this.f68588c = jSONObject.optBoolean("userSet", true);
            this.f68589d = jSONObject.optString("value", "KWE_OTHER");
        } catch (JSONException e5) {
            this.f68586a = false;
            e5.printStackTrace();
        }
    }

    public String a(boolean z4) {
        if (this.f68586a) {
            if (z4 != this.f68588c) {
                return "KWE_NPN";
            }
            int i4 = this.f68587b;
            return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "KWE_OTHER" : "KWE_NS" : "KWE_N" : "KWE_PE" : "KWE_PN" : !TextUtils.isEmpty(this.f68589d) ? this.f68589d : "KWE_N";
        }
        return "KWE_OTHER";
    }
}
