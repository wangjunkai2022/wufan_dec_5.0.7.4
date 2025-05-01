package com.kwad.components.ad.splashscreen;

import java.lang.ref.WeakReference;
import java.util.HashMap;
/* loaded from: classes5.dex */
public final class SplashPlayModuleCache {
    private HashMap<String, WeakReference<com.kwad.components.ad.splashscreen.d.a>> Cm;

    /* loaded from: classes5.dex */
    enum Holder {
        INSTANCE;
        
        private SplashPlayModuleCache mInstance = new SplashPlayModuleCache((byte) 0);

        Holder() {
        }

        final SplashPlayModuleCache getInstance() {
            return this.mInstance;
        }
    }

    /* synthetic */ SplashPlayModuleCache(byte b5) {
        this();
    }

    private SplashPlayModuleCache() {
        this.Cm = new HashMap<>(1);
    }
}
