package com.efs.sdk.base.core.e.a;

import com.efs.sdk.base.core.b.a;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
/* loaded from: classes2.dex */
public final class b extends a {
    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        com.efs.sdk.base.core.b.e a5;
        byte[] bArr;
        if (bVar.f10381b.f10384a) {
            b(bVar);
            return;
        }
        com.efs.sdk.base.core.b.a a6 = a.b.a();
        if (!"wa".equals(bVar.f10380a.f10373a) && !com.efs.sdk.base.core.b.c.a().f10291a) {
            if (!a6.f10285a) {
                com.efs.sdk.base.core.f.f a7 = f.a.a();
                int i4 = com.efs.sdk.base.core.config.a.c.a().f10353d.f10341a;
                if (a7.f10408b != null || ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                    a7.f10408b.send(a7.a("disk_limit", i4));
                }
            }
            a6.f10285a = true;
            return;
        }
        com.efs.sdk.base.core.d.a aVar = bVar.f10380a;
        if ((aVar.f10375c == 0 && ((bArr = bVar.f10382c) == null || bArr.length == 0)) || (a5 = a6.f10287c.a(aVar.f10374b)) == null) {
            return;
        }
        a5.a(bVar);
    }
}
