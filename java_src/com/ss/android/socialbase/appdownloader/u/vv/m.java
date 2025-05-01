package com.ss.android.socialbase.appdownloader.u.vv;

import com.join.mgps.Util.h0;
import java.io.IOException;
/* loaded from: classes5.dex */
public class m {
    public static final void vv(i iVar, int i4) throws IOException {
        int m4 = iVar.m();
        if (m4 == i4) {
            return;
        }
        throw new IOException("Expected chunk of type 0x" + Integer.toHexString(i4) + ", read 0x" + Integer.toHexString(m4) + h0.f27805a);
    }
}
