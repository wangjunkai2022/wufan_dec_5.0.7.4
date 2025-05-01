package com.facebook.imagepipeline.platform;

import android.os.Build;
import androidx.core.util.Pools;
import com.facebook.imagepipeline.memory.d0;
/* compiled from: PlatformDecoderFactory.java */
/* loaded from: classes2.dex */
public class g {
    public static f a(d0 d0Var, boolean z4) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            int d5 = d0Var.d();
            return new e(d0Var.a(), d5, new Pools.SynchronizedPool(d5));
        } else if (i4 >= 21) {
            int d6 = d0Var.d();
            return new a(d0Var.a(), d6, new Pools.SynchronizedPool(d6));
        } else if (z4 && i4 < 19) {
            return new c();
        } else {
            return new d(d0Var.c());
        }
    }
}
