package com.kwad.framework.filedownloader.a;

import com.join.mgps.Util.v;
import com.kwad.framework.filedownloader.f.c;
/* loaded from: classes5.dex */
public final class a implements c.a {
    @Override // com.kwad.framework.filedownloader.f.c.a
    public final int O(long j4) {
        if (j4 < 1048576) {
            return 1;
        }
        if (j4 < 5242880) {
            return 2;
        }
        if (j4 < 52428800) {
            return 3;
        }
        return j4 < v.f28103c ? 4 : 5;
    }
}
