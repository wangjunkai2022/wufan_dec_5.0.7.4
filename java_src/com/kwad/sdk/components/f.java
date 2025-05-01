package com.kwad.sdk.components;

import com.kwad.sdk.components.DevelopMangerComponents;
/* loaded from: classes5.dex */
public final class f {
    public static boolean cZ(String str) {
        DevelopMangerComponents.DevelopValue cY = c.cY(str);
        return cY != null && ((Boolean) cY.getValue()).booleanValue();
    }

    public static boolean encryptDisable() {
        return cZ("KEY_HOST_ENCRYPT_DISABLE");
    }
}
