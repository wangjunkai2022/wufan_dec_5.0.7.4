package com.kwad.sdk.core.config;

import android.text.TextUtils;
import java.net.URI;
/* loaded from: classes5.dex */
public final class a {
    private static final String[] ary = {"gifshow.com", "kuaishou.com", "static.yximgs.com"};

    public static boolean ca(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String host = new URI(str).getHost();
            if (dq(host)) {
                return true;
            }
            return dr(host);
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean dq(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : ary) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean dr(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : d.Cn()) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
