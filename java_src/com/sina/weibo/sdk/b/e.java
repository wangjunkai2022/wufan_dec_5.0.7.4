package com.sina.weibo.sdk.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import okio.Utf8;
/* loaded from: classes5.dex */
public final class e {
    private static char[] ak = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
    private static byte[] al = new byte[256];

    static {
        for (int i4 = 0; i4 < 256; i4++) {
            al[i4] = -1;
        }
        for (int i5 = 65; i5 <= 90; i5++) {
            al[i5] = (byte) (i5 - 65);
        }
        for (int i6 = 97; i6 <= 122; i6++) {
            al[i6] = (byte) ((i6 + 26) - 97);
        }
        for (int i7 = 48; i7 <= 57; i7++) {
            al[i7] = (byte) ((i7 + 52) - 48);
        }
        byte[] bArr = al;
        bArr[43] = 62;
        bArr[47] = Utf8.REPLACEMENT_BYTE;
    }

    public static int a(int i4, Context context) {
        return (int) ((i4 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String b(Context context, String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return null;
            }
            return d.a(signatureArr[0].toByteArray());
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return null;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static Bundle g(String str) {
        try {
            return i(new URL(str).getQuery());
        } catch (MalformedURLException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static Bundle h(String str) {
        try {
            return i(new URI(str).getQuery());
        } catch (URISyntaxException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static Bundle i(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split(m.a.f71490d)) {
                String[] split = str2.split(SimpleComparison.EQUAL_TO_OPERATION);
                try {
                    if (split.length == 2) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                    } else if (split.length == 1) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return bundle;
    }

    public static String o() {
        return Build.MANUFACTURER + "-" + Build.MODEL + "_" + Build.VERSION.RELEASE + "_weibosdk_0041005000_android";
    }

    public static byte[] b(byte[] bArr) {
        boolean z4;
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = (bArr[i4] & 255) << 8;
            int i7 = i4 + 1;
            boolean z5 = true;
            if (i7 < bArr.length) {
                i6 |= bArr[i7] & 255;
                z4 = true;
            } else {
                z4 = false;
            }
            int i8 = i6 << 8;
            int i9 = i4 + 2;
            if (i9 < bArr.length) {
                i8 |= bArr[i9] & 255;
            } else {
                z5 = false;
            }
            int i10 = i5 + 3;
            char[] cArr = ak;
            int i11 = 64;
            bArr2[i10] = (byte) cArr[z5 ? i8 & 63 : 64];
            int i12 = i8 >> 6;
            int i13 = i5 + 2;
            if (z4) {
                i11 = i12 & 63;
            }
            bArr2[i13] = (byte) cArr[i11];
            int i14 = i12 >> 6;
            bArr2[i5 + 1] = (byte) cArr[i14 & 63];
            bArr2[i5 + 0] = (byte) cArr[(i14 >> 6) & 63];
            i4 += 3;
            i5 += 4;
        }
        return bArr2;
    }
}
