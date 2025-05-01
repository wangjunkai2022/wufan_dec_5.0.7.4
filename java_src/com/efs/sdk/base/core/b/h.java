package com.efs.sdk.base.core.b;

import com.efs.sdk.base.core.b.a;
import java.io.File;
/* loaded from: classes2.dex */
public final class h implements f {
    @Override // com.efs.sdk.base.core.b.f
    public final boolean a(File file) {
        a unused;
        com.efs.sdk.base.core.d.b b5 = com.efs.sdk.base.core.util.b.b(file.getName());
        if (b5 != null) {
            return ("wa".equals(b5.f10380a.f10373a) || com.efs.sdk.base.core.c.b.a().a(b5.f10380a.f10373a, file.length())) ? false : true;
        }
        unused = a.b.f10289a;
        a.b(file);
        return true;
    }
}
