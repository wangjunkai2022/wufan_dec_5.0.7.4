package com.efs.sdk.base.core.e.a;
/* loaded from: classes2.dex */
public final class f extends a {
    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        Double d5;
        com.efs.sdk.base.core.config.a.c a5 = com.efs.sdk.base.core.config.a.c.a();
        String str = bVar.f10380a.f10373a;
        com.efs.sdk.base.core.config.a.b bVar2 = a5.f10353d;
        if (com.efs.sdk.base.core.config.a.c.f10350a.nextDouble() * 100.0d <= ((!bVar2.f10346f.containsKey(str) || (d5 = bVar2.f10346f.get(str)) == null) ? 100.0d : d5.doubleValue())) {
            b(bVar);
        }
    }
}
