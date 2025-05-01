package com.kwad.library.solder.lib;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.library.solder.lib.a.f;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.library.solder.lib.ext.b;
import com.kwad.library.solder.lib.ext.c;
import com.kwad.sdk.utils.bo;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public final class i {
    private static volatile i akb;
    private static Map<String, Integer> akd = new ConcurrentHashMap(8);
    @Nullable
    private static a ake;
    private e akc;
    private volatile boolean mHasInit = false;

    /* loaded from: classes5.dex */
    public interface a {
        void b(String str, File file);

        void d(String str, Throwable th);

        int getCorePoolSize();

        int getMaxRetryCount();

        boolean xL();
    }

    private i() {
    }

    public static boolean bL(String str) {
        try {
            Map<String, Integer> map = akd;
            if (map != null) {
                return map.containsKey(str);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static ExecutorService bN(int i4) {
        return new ThreadPoolExecutor(i4, 3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.kwad.library.solder.lib.i.1
            private final AtomicInteger poolNumber = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                try {
                    i.akd.put(thread.getName(), 1);
                } catch (Throwable th) {
                    com.kwad.library.solder.lib.a.e("Sodler", Log.getStackTraceString(th));
                }
                return thread;
            }
        });
    }

    private synchronized void init(Context context) {
        if (this.mHasInit) {
            return;
        }
        c.a bT = new c.a().bT("sodler");
        a aVar = ake;
        c.a bh = bT.bQ(aVar != null ? aVar.getMaxRetryCount() : 1).bh(false);
        a aVar2 = ake;
        c.a bi = bh.bi(aVar2 != null && aVar2.xL());
        a aVar3 = ake;
        c.a a5 = bi.a(bN(aVar3 != null ? aVar3.getCorePoolSize() : 0));
        a aVar4 = ake;
        com.kwad.library.solder.lib.ext.c yo = a5.bR(aVar4 != null ? aVar4.getCorePoolSize() : 0).yo();
        d dVar = new d(context);
        c cVar = new c(context, yo);
        f fVar = new f(context);
        fVar.a(new f.a() { // from class: com.kwad.library.solder.lib.i.2
            @Override // com.kwad.library.solder.lib.a.f.a
            public final void a(com.kwad.library.solder.lib.a.e eVar, File file) {
                if (i.ake != null) {
                    try {
                        i.ake.b(eVar.getDownloadUrl(), file);
                    } catch (Throwable th) {
                        i.ake.d(eVar.getDownloadUrl(), th);
                        throw new PluginError.UpdateError(th.getMessage(), (int) PluginError.ERROR_UPD_PLUGIN_CONNECTION);
                    }
                }
            }
        });
        this.akc = new e(dVar, fVar, cVar, yo, new com.kwad.library.solder.lib.ext.a());
        this.mHasInit = true;
    }

    public static i xI() {
        if (akb == null) {
            synchronized (i.class) {
                if (akb == null) {
                    akb = new i();
                }
            }
        }
        return akb;
    }

    public final void k(Context context, final String str) {
        if (!this.mHasInit && context != null) {
            init(context);
        }
        if (xC() == null || xC().ym() == null) {
            return;
        }
        xC().ym().execute(new Runnable() { // from class: com.kwad.library.solder.lib.i.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    i.this.akc.xF().bH(str);
                } catch (Throwable th) {
                    Log.getStackTraceString(th);
                }
            }
        });
    }

    @Nullable
    public final com.kwad.library.solder.lib.a.a l(Context context, String str) {
        if (!this.mHasInit && context != null) {
            init(context);
        }
        e eVar = this.akc;
        if (eVar != null) {
            return eVar.xD().bJ(str);
        }
        return null;
    }

    public final com.kwad.library.solder.lib.ext.c xC() {
        if (this.mHasInit) {
            return this.akc.xC();
        }
        throw new RuntimeException("Sodler has not yet been init.");
    }

    public static void a(a aVar) {
        ake = aVar;
    }

    public final <P extends com.kwad.library.solder.lib.a.a, R extends com.kwad.library.solder.lib.a.e<P>> void a(Context context, @NonNull R r4, com.kwad.library.solder.lib.ext.b<P, R> bVar) {
        init(context);
        r4.bP(this.akc.xC().getRetryCount());
        r4.a(new b<P, R>(bVar, new b.C0505b()) { // from class: com.kwad.library.solder.lib.i.3
            /* JADX WARN: Incorrect types in method signature: (TR;Lcom/kwad/library/solder/lib/ext/PluginError;)V */
            @Override // com.kwad.library.solder.lib.b, com.kwad.library.solder.lib.ext.b
            public final void a(final com.kwad.library.solder.lib.a.e eVar, PluginError pluginError) {
                super.a((AnonymousClass3<P, R>) eVar, pluginError);
                com.kwad.library.solder.lib.a.e("Sodler", "load failed:" + pluginError.getCode() + ":" + pluginError.getMessage());
                i.this.akc.i(eVar);
                bo.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.library.solder.lib.i.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (eVar.xS()) {
                            i.this.akc.a(eVar, 16);
                        }
                    }
                }, eVar.xR() instanceof PluginError.UpdateError ? 1000L : 0L);
            }
        });
        this.akc.a(r4, 16);
    }
}
