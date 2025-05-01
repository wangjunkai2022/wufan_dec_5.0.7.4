package com.join.mgps.Util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.HashMap;
/* compiled from: ApkSignUtil.java */
/* loaded from: classes.dex */
public class g {
    public static String a(Context context, String str) {
        try {
            String b5 = b(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
            return b5 == null ? "" : b5;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static String b(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i4 = 0;
            for (byte b5 : digest) {
                int i5 = i4 + 1;
                cArr2[i4] = cArr[(b5 >>> 4) & 15];
                i4 = i5 + 1;
                cArr2[i5] = cArr[b5 & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Signature[] c(Context context, String str) {
        try {
            for (PackageInfo packageInfo : context.getPackageManager().getInstalledPackages(64)) {
                if (packageInfo.packageName.equals(str)) {
                    return packageInfo.signatures;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static HashMap<String, Boolean> d(Context context) {
        String str;
        Signature[] signatureArr;
        HashMap<String, Boolean> hashMap = new HashMap<>();
        try {
            for (PackageInfo packageInfo : context.getPackageManager().getInstalledPackages(64)) {
                try {
                    str = packageInfo.packageName;
                    signatureArr = packageInfo.signatures;
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (signatureArr != null && signatureArr.length != 0) {
                    String b5 = b(signatureArr[0].toByteArray());
                    if ((!TextUtils.isEmpty(b5) && (b5.equals("071276c307390f9b7a48524b3534f53d") || b5.equals("d47e9679b19f1d0fa4aea58f83eda3f7"))) || b5.equals("fc007c2e2c0a43cd1f5f3a561cdca088")) {
                        hashMap.put(str, Boolean.TRUE);
                    }
                }
                hashMap.put(str, Boolean.FALSE);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return hashMap;
    }

    public static boolean e(Context context, String str) {
        try {
            Signature[] c5 = c(context, str);
            if (c5 != null && c5.length != 0) {
                String b5 = b(c5[0].toByteArray());
                if (TextUtils.isEmpty(b5) || (!b5.equals("071276c307390f9b7a48524b3534f53d") && !b5.equals("d47e9679b19f1d0fa4aea58f83eda3f7"))) {
                    if (!b5.equals("fc007c2e2c0a43cd1f5f3a561cdca088")) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }
}
