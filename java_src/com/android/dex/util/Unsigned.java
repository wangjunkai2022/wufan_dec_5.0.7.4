package com.android.dex.util;

import kotlin.UShort;
/* loaded from: classes2.dex */
public final class Unsigned {
    private Unsigned() {
    }

    public static int compare(int i4, int i5) {
        if (i4 == i5) {
            return 0;
        }
        return (((long) i4) & 4294967295L) < (((long) i5) & 4294967295L) ? -1 : 1;
    }

    public static int compare(short s4, short s5) {
        if (s4 == s5) {
            return 0;
        }
        return (s4 & UShort.MAX_VALUE) < (s5 & UShort.MAX_VALUE) ? -1 : 1;
    }
}
