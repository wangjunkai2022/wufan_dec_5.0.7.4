package com.alipay.android.phone.mrpc.core.a;

import java.lang.reflect.Type;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class d extends a {
    public d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.a.c
    public final Object a() {
        try {
            String str = new String(this.f4527b);
            Thread.currentThread().getId();
            JSONObject jSONObject = new JSONObject(str);
            int i4 = jSONObject.getInt("resultStatus");
            if (i4 == 1000) {
                return this.f4526a == String.class ? jSONObject.optString("result") : com.alipay.a.a.e.b(jSONObject.optString("result"), this.f4526a);
            }
            throw new com.alipay.android.phone.mrpc.core.c(Integer.valueOf(i4), jSONObject.optString("tips"));
        } catch (Exception e5) {
            StringBuilder sb = new StringBuilder("response  =");
            sb.append(new String(this.f4527b));
            sb.append(":");
            sb.append(e5);
            throw new com.alipay.android.phone.mrpc.core.c((Integer) 10, sb.toString() == null ? "" : e5.getMessage());
        }
    }
}
