package com.xinzhu.overmind.utils;

import android.content.pm.ActivityInfo;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* compiled from: PackageUtils.java */
/* loaded from: classes6.dex */
public final class s {
    private s() {
    }

    public static String a(@NonNull byte[] bArr) {
        byte[] b5 = b(bArr);
        if (b5 == null) {
            return null;
        }
        return l.k(b5, true);
    }

    public static byte[] b(@NonNull byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @NonNull
    public static String c(@NonNull Signature[] signatureArr) {
        if (signatureArr.length == 1) {
            return a(signatureArr[0].toByteArray());
        }
        return d(e(signatureArr));
    }

    @NonNull
    public static String d(@NonNull String[] strArr) {
        if (strArr.length == 1) {
            return strArr[0];
        }
        Arrays.sort(strArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String str : strArr) {
            try {
                byteArrayOutputStream.write(str.getBytes());
            } catch (IOException unused) {
            }
        }
        return a(byteArrayOutputStream.toByteArray());
    }

    @NonNull
    public static String[] e(@NonNull Signature[] signatureArr) {
        int length = signatureArr.length;
        String[] strArr = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            strArr[i4] = a(signatureArr[i4].toByteArray());
        }
        return strArr;
    }

    public static String f(ActivityInfo activityInfo) {
        if (activityInfo.launchMode == 3) {
            return "SINGLE_INSTANCE_" + activityInfo.packageName + "_" + activityInfo.name;
        }
        String str = activityInfo.taskAffinity;
        if (str == null && activityInfo.applicationInfo.taskAffinity == null) {
            return activityInfo.packageName;
        }
        return str != null ? str : activityInfo.applicationInfo.taskAffinity;
    }
}
