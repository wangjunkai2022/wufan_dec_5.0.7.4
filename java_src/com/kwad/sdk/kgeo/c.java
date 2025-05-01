package com.kwad.sdk.kgeo;

import android.content.Context;
import android.os.Build;
import com.kwad.library.solder.lib.a.e;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.library.solder.lib.ext.b;
import com.kwad.sdk.utils.AbiUtil;
import com.kwad.sdk.utils.av;
import com.kwad.sdk.utils.o;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public final class c {
    private static final AtomicBoolean sHasInit = new AtomicBoolean(false);

    /* loaded from: classes5.dex */
    public interface a {
        void HZ();

        void onSuccess(String str);
    }

    public static void a(final Context context, final a aVar) {
        if (av.MY()) {
            aVar.HZ();
        } else if (!o.LR()) {
            aVar.HZ();
        } else if (Build.VERSION.SDK_INT < 23) {
            aVar.HZ();
        } else {
            AtomicBoolean atomicBoolean = sHasInit;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            boolean isArm64 = AbiUtil.isArm64(context);
            com.kwad.library.solder.lib.c.b bVar = new com.kwad.library.solder.lib.c.b();
            bVar.version = p2.a.f73125f;
            bVar.akV = isArm64 ? "kmc-v8a" : "kmc-v7a";
            bVar.akW = com.kwad.sdk.core.network.idc.a.EE().ee(isArm64 ? "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/kmac/ks_kmac64" : "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/kmac/ks_kmac32");
            bVar.akY = isArm64 ? "db9a8da62a0354ec5710ec03e2743f07" : "2440a8221230913d4287c6b1e02b49f1";
            bVar.JE = true;
            com.kwad.library.solder.a.a.a(context, bVar, new b.c() { // from class: com.kwad.sdk.kgeo.c.1
                private void uk() {
                    com.kwad.sdk.core.e.c.d("KGeoSoHelper", "onPostLoad");
                    try {
                        System.loadLibrary("ipneigh-android");
                        a.this.onSuccess(com.kwai.library.ipneigh.c.dK(context).aVF);
                    } catch (Throwable unused) {
                        com.kwad.sdk.core.e.c.d("KGeoSoHelper", "loadLibrary fail");
                        a.this.HZ();
                    }
                }

                @Override // com.kwad.library.solder.lib.ext.b.C0505b, com.kwad.library.solder.lib.ext.b
                public final /* synthetic */ void a(e eVar, com.kwad.library.solder.lib.a.a aVar2) {
                    uk();
                }

                @Override // com.kwad.library.solder.lib.ext.b.C0505b, com.kwad.library.solder.lib.ext.b
                public final /* bridge */ /* synthetic */ void a(e eVar, PluginError pluginError) {
                    a(pluginError);
                }

                private void a(PluginError pluginError) {
                    com.kwad.sdk.core.e.c.d("KGeoSoHelper", "onFail error:" + pluginError.getMessage());
                    a.this.HZ();
                }
            });
        }
    }
}
