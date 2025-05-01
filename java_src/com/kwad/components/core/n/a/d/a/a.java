package com.kwad.components.core.n.a.d.a;

import com.kwad.sdk.core.response.model.AdResultData;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public final class a {
    private static final Map<Integer, WeakReference<AdResultData>> MY = new HashMap();

    public static void a(int i4, AdResultData adResultData) {
        if (adResultData == null) {
            return;
        }
        MY.put(Integer.valueOf(i4), new WeakReference<>(adResultData));
    }

    public static AdResultData at(int i4) {
        WeakReference<AdResultData> weakReference = MY.get(Integer.valueOf(i4));
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return weakReference.get();
    }
}
