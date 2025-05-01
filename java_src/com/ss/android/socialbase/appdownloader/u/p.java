package com.ss.android.socialbase.appdownloader.u;

import android.text.TextUtils;
import android.util.Base64;
/* loaded from: classes5.dex */
public class p {
    public static String vv(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        byte[] decode = Base64.decode(com.ss.android.socialbase.downloader.wv.u.vv(str), 0);
        int length = str2.length();
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (byte b5 : decode) {
            if (i4 >= length) {
                i4 %= length;
            }
            sb.append((char) (b5 ^ str2.charAt(i4)));
            i4++;
        }
        return sb.toString();
    }

    public static String vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String(Base64.decode(com.ss.android.socialbase.downloader.wv.u.vv(str), 0));
    }
}
