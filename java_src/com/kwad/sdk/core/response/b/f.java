package com.kwad.sdk.core.response.b;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ax;
import com.kwad.sdk.utils.bh;
import com.kwad.sdk.utils.q;
import java.io.File;
import java.nio.charset.Charset;
/* loaded from: classes5.dex */
public class f {
    private static volatile f aBg;
    private String aBh = FU();

    private f() {
    }

    public static f FS() {
        if (aBg == null) {
            synchronized (f.class) {
                if (aBg == null) {
                    aBg = new f();
                }
            }
        }
        return aBg;
    }

    @Nullable
    @WorkerThread
    private static String FU() {
        try {
            return q.a(new File(ax.dd(((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getContext())), Charset.forName("UTF-8"));
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
            return null;
        }
    }

    @WorkerThread
    private static void eB(String str) {
        try {
            q.a(new File(ax.dd(((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getContext())), str, Charset.forName("UTF-8"), false);
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
        }
    }

    @Nullable
    @WorkerThread
    public final String FT() {
        return this.aBh;
    }

    @WorkerThread
    public final void eA(String str) {
        if (bh.isEquals(this.aBh, str)) {
            return;
        }
        this.aBh = str;
        eB(str);
    }
}
