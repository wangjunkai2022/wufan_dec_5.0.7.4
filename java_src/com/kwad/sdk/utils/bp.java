package com.kwad.sdk.utils;

import android.text.TextUtils;
/* loaded from: classes5.dex */
public final class bp {
    public static boolean ay(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            for (int i4 = 0; i4 < split.length && i4 < split2.length; i4++) {
                try {
                    int parseInt = Integer.parseInt(split[i4]) - Integer.parseInt(split2[i4]);
                    if (parseInt > 0) {
                        return true;
                    }
                    if (parseInt < 0) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                    return false;
                }
            }
            if (split.length >= split2.length) {
                return true;
            }
        }
        return false;
    }
}
