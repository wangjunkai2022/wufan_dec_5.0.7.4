package com.kwad.components.core.e.b;

import com.j256.ormlite.stmt.query.SimpleComparison;
/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.core.e.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0454a {
        private static final c KC = c.a(new int[]{7, 8, 4, 2, 0, 3, 6, 9, 1, 8});
    }

    public static long ad(String str) {
        return nM().ae(str);
    }

    private static c nM() {
        return C0454a.KC;
    }

    public static String t(long j4) {
        String u4 = nM().u(j4);
        return u4.endsWith(SimpleComparison.EQUAL_TO_OPERATION) ? u4.replace(SimpleComparison.EQUAL_TO_OPERATION, "") : u4;
    }
}
