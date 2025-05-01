package com.kwad.sdk.core.video.videoview;

import java.lang.ref.WeakReference;
import java.util.HashMap;
/* loaded from: classes5.dex */
public final class AdVideoPlayerViewCache {
    private HashMap<String, WeakReference<a>> Cm;

    /* loaded from: classes5.dex */
    enum Holder {
        INSTANCE;
        
        private AdVideoPlayerViewCache mInstance = new AdVideoPlayerViewCache((byte) 0);

        Holder() {
        }

        final AdVideoPlayerViewCache getInstance() {
            return this.mInstance;
        }
    }

    /* synthetic */ AdVideoPlayerViewCache(byte b5) {
        this();
    }

    public static AdVideoPlayerViewCache getInstance() {
        return Holder.INSTANCE.getInstance();
    }

    public final void a(String str, a aVar) {
        this.Cm.put(str, new WeakReference<>(aVar));
    }

    public final a eG(String str) {
        WeakReference<a> weakReference = this.Cm.get(str);
        if (weakReference != null) {
            a aVar = weakReference.get();
            if (aVar != null) {
                return aVar;
            }
            this.Cm.remove(str);
        }
        return null;
    }

    public final void remove(String str) {
        this.Cm.remove(str);
    }

    private AdVideoPlayerViewCache() {
        this.Cm = new HashMap<>(1);
    }
}
