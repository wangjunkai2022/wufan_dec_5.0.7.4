package com.kwad.sdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.service.ServiceProvider;
import java.io.InputStream;
/* loaded from: classes5.dex */
public class p {
    private static String aPO = "";
    private static String aPP = "";
    private static String aPQ = "";

    private static String a(String str, InputStream inputStream) {
        String gw;
        synchronized (p.class) {
            com.kwad.sdk.pngencrypt.o oVar = new com.kwad.sdk.pngencrypt.o(inputStream, true);
            oVar.KP();
            gw = oVar.KO().gw(str);
            oVar.end();
        }
        return gw;
    }

    public static String dY(int i4) {
        Context Lw = ServiceProvider.Lw();
        String str = aPO;
        if (TextUtils.isEmpty(str)) {
            TextUtils.isEmpty("aes_key");
            try {
                InputStream open = Lw.getResources().getAssets().open("ksad_common_encrypt_image.png");
                if (open == null) {
                    open = Lw.getAssets().open("ksad_common_encrypt_image.png");
                }
                String a5 = a("aes_key", open);
                TextUtils.isEmpty(a5);
                aPO = a5;
                return a5;
            }
        }
        return str;
    }
}
