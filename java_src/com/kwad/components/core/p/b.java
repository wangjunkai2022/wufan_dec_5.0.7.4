package com.kwad.components.core.p;

import androidx.annotation.NonNull;
import com.ksad.annotation.invoker.InvokeBy;
import com.kwad.sdk.api.core.SpeedLimitApi;
import java.io.InputStream;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes5.dex */
public class b {
    private static volatile b SL = null;
    private static volatile int SM = 204800;
    static volatile boolean SN = true;
    static volatile boolean SO;
    static volatile Set<c> SP = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public static synchronized void a(c cVar) {
        synchronized (b.class) {
            if (SP.contains(cVar)) {
                SP.remove(cVar);
            }
        }
    }

    public static void f(boolean z4, int i4) {
        if (i4 > 0) {
            SM = i4 * 1024;
        }
        SN = z4;
    }

    public static b rc() {
        if (SL == null) {
            synchronized (b.class) {
                if (SL == null) {
                    SL = new b();
                }
            }
        }
        return SL;
    }

    public static boolean rd() {
        return SN;
    }

    public static int re() {
        return SM / 1024;
    }

    @InvokeBy(invokerClass = com.kwad.sdk.service.b.class, methodId = "initModeImplForInvoker")
    public static void register() {
        try {
            com.kwad.sdk.service.b.b(SpeedLimitApi.class, a.class);
        } catch (Throwable unused) {
        }
    }

    private static synchronized InputStream wrap(@NonNull InputStream inputStream) {
        c cVar;
        synchronized (b.class) {
            cVar = new c(inputStream, SM / (SP.size() + 1));
            SP.add(cVar);
        }
        return cVar;
    }

    public static InputStream wrapInputStream(InputStream inputStream) {
        return wrap(inputStream);
    }

    public final synchronized int rf() {
        int i4;
        i4 = 0;
        try {
            for (c cVar : SP) {
                i4 += (int) cVar.rg();
            }
        } catch (Exception unused) {
        }
        return i4;
    }
}
