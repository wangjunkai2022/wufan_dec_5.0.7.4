package com.kwad.sdk.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.Nullable;
/* loaded from: classes5.dex */
public final class bd {
    private static String TAG = "plugin.signature";
    public static Signature[] aRg = new Signature[0];

    @Nullable
    @SuppressLint({"PackageManagerGetSignatures"})
    private static Signature[] dg(Context context) {
        Signature[] signatureArr = aRg;
        if (signatureArr == null || signatureArr.length <= 0) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if (packageInfo != null) {
                    aRg = packageInfo.signatures;
                }
            } catch (PackageManager.NameNotFoundException e5) {
                String str = TAG;
                com.kwad.sdk.core.e.c.w(str, "Can not get signature, error = " + e5.getLocalizedMessage());
                com.kwad.sdk.core.e.c.w(TAG, e5);
            }
            return aRg;
        }
        return signatureArr;
    }

    public static String dh(Context context) {
        try {
            Signature[] dg = dg(context);
            if (dg != null && dg.length > 0) {
                return ae.l(dg[0].toByteArray());
            }
            return "";
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.w(TAG, e5);
            return "";
        }
    }
}
