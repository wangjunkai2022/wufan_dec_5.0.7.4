package com.aggmoread.sdk.z.c.a.a.d.a.d;

import com.aggmoread.sdk.client.AMConst;
import java.util.Map;
/* loaded from: classes2.dex */
public class l {
    public void a(Map<String, Object> map, int i4, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        if (map != null) {
            int a5 = com.aggmoread.sdk.z.c.a.a.e.m.a(i4, eVar);
            com.aggmoread.sdk.z.c.a.a.e.e.a("add extras  e " + i4 + ", expose  " + a5);
            map.put(AMConst.ExtrasKey.AD_PRICE, String.valueOf(a5));
        }
    }
}
