package com.kwad.sdk.collector;

import android.os.Build;
import com.kwad.sdk.utils.m;
import com.kwad.sdk.utils.q;
import java.io.File;
import java.io.IOException;
/* loaded from: classes5.dex */
public final class e {
    public static String cx(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                return new String(com.kwad.sdk.core.a.c.Ec().encode(m.k(q.U(new File(str)))));
            } catch (IOException e5) {
                com.kwad.sdk.core.e.c.printStackTrace(e5);
            }
        }
        return null;
    }
}
