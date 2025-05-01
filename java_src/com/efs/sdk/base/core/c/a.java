package com.efs.sdk.base.core.c;

import androidx.annotation.NonNull;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class a implements c {
    @Override // com.efs.sdk.base.core.c.c
    @NonNull
    public final HttpResponse a(com.efs.sdk.base.core.d.b bVar, boolean z4) {
        HttpResponse httpResponse;
        com.efs.sdk.base.core.a.c a5 = com.efs.sdk.base.core.a.c.a();
        com.efs.sdk.base.core.d.a aVar = bVar.f10380a;
        a5.f10274d = aVar.f10376d;
        a5.f10275e = aVar.f10377e;
        a5.f10277g = aVar.f10374b;
        a5.f10278h = aVar.f10373a;
        a5.f10283m = bVar.a();
        String a6 = com.efs.sdk.base.core.config.a.c.a().a(false);
        int i4 = bVar.f10380a.f10375c;
        if (i4 == 0) {
            com.efs.sdk.base.core.a.a a7 = com.efs.sdk.base.core.a.a.a();
            byte[] bArr = bVar.f10382c;
            boolean z5 = bVar.f10381b.f10385b;
            String b5 = a5.b();
            String a8 = com.efs.sdk.base.core.a.a.a(a6, a5);
            if (a7.f10268a) {
                Log.i("efs.px.api", "upload buffer file, url is ".concat(String.valueOf(a8)));
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("wpk-header", b5);
            com.efs.sdk.base.core.util.a.d a9 = new com.efs.sdk.base.core.util.a.d(a8).a(hashMap);
            com.efs.sdk.base.core.util.a.b bVar2 = a9.f10431a;
            bVar2.f10425c = bArr;
            bVar2.f10429g = true;
            com.efs.sdk.base.core.util.a.d a10 = a9.a("type", a5.f10278h);
            StringBuilder sb = new StringBuilder();
            sb.append(a5.f10283m);
            httpResponse = a10.a("size", sb.toString()).a("flow_limit", Boolean.toString(z5)).a(com.efs.sdk.base.core.a.d.a()).a().b();
        } else if (1 == i4) {
            httpResponse = com.efs.sdk.base.core.a.a.a().a(a6, a5, bVar.f10383d, bVar.f10381b.f10385b);
        } else {
            httpResponse = new HttpResponse();
        }
        if (httpResponse.succ && z4) {
            com.efs.sdk.base.core.util.b.b(bVar.f10383d);
        }
        return httpResponse;
    }
}
