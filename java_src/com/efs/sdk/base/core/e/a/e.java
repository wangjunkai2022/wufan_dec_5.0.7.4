package com.efs.sdk.base.core.e.a;

import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.http.HttpResponse;
/* loaded from: classes2.dex */
public final class e extends a {
    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        HttpResponse a5;
        if (!bVar.f10381b.f10384a) {
            b(bVar);
            return;
        }
        com.efs.sdk.base.core.c.d a6 = com.efs.sdk.base.core.c.d.a();
        if (bVar.f10381b.f10385b && !com.efs.sdk.base.core.c.b.a().a(bVar.f10380a.f10373a, bVar.a())) {
            a5 = new HttpResponse();
            a5.data = "flow_limit";
        } else {
            f.a.a().f10409c.b();
            f.a.a().f10409c.c();
            a5 = a6.f10307b.a(bVar, false);
        }
        bVar.f10381b.f10386c = a5;
        b(bVar);
    }
}
