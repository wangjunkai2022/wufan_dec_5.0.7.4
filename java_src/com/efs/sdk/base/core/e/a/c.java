package com.efs.sdk.base.core.e.a;

import com.efs.sdk.base.core.util.Log;
/* loaded from: classes2.dex */
public final class c extends a {
    private static boolean c(com.efs.sdk.base.core.d.b bVar) {
        if (!bVar.b()) {
            com.efs.sdk.base.core.d.a aVar = bVar.f10380a;
            if ((1 != aVar.f10374b || bVar.f10381b.f10384a) && 1 != aVar.f10375c) {
                return false;
            }
        }
        return true;
    }

    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        if (c(bVar)) {
            b(bVar);
            return;
        }
        byte[] a5 = com.efs.sdk.base.core.util.c.a(bVar.f10382c);
        if (a5 == null) {
            Log.w("efs.base", "gzip error");
            b(bVar);
            return;
        }
        bVar.a(a5);
        bVar.a("gzip");
        b(bVar);
    }
}
