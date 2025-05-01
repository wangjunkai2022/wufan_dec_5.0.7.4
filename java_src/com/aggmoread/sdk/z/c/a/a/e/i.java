package com.aggmoread.sdk.z.c.a.a.e;

import java.util.Random;
/* loaded from: classes2.dex */
public final class i {
    public static int a(int i4, int i5) {
        if (i4 >= i5) {
            return i5;
        }
        int nextInt = new Random().nextInt((i5 - i4) + 1) + i4;
        e.a("AMGTAG", "ni %s", Integer.valueOf(nextInt));
        return nextInt;
    }

    public static boolean a(double d5) {
        if (d5 > 0.0d) {
            int a5 = a(0, 10000);
            e.a("AMGTAG", "rn %s, v %s", Integer.valueOf(a5), Double.valueOf(d5));
            if (a5 <= Math.floor(d5 * 10000.0d)) {
                return true;
            }
        }
        return false;
    }
}
