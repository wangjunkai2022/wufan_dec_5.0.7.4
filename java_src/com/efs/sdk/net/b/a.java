package com.efs.sdk.net.b;

import android.util.Base64;
import com.efs.sdk.base.core.util.Log;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
/* loaded from: classes2.dex */
public final class a {
    public static long a(Map<String, Long> map, String str, String str2) {
        if (map.containsKey(str) && map.containsKey(str2)) {
            return map.get(str2).longValue() - map.get(str).longValue();
        }
        return 0L;
    }

    public static boolean a(int i4) {
        if (i4 == 0) {
            return false;
        }
        return i4 == 100 || new Random().nextInt(100) <= i4;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr3[i4] = (byte) ((bArr[i4] ^ bArr2[i4 % bArr2.length]) ^ (i4 & 255));
        }
        return bArr3;
    }

    public static String a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11));
    }

    public static String a(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        try {
            return String.format(Locale.CHINA, "%032x", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e5) {
            Log.e("efs.base", "md5 error", e5);
            return "";
        }
    }
}
