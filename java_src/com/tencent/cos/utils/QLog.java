package com.tencent.cos.utils;

import com.kuaishou.weapon.p0.t;
import com.kwad.sdk.m.e;
import com.tencent.cos.COSClient;
/* loaded from: classes6.dex */
public class QLog {
    public static void d(String str, String str2) {
        d(str, str2, null);
    }

    public static void e(String str, String str2) {
        e(str, str2, null);
    }

    public static void i(String str, String str2) {
        i(str, str2, null);
    }

    public static void w(String str, String str2) {
        w(str, str2, null);
    }

    public static void d(String str, String str2, Throwable th) {
        if (COSClient.isEnableLog()) {
            RecordLog.getInstance(COSClient.getContext(), "COS").appendRecord(str, t.f55701t, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (COSClient.isEnableLog()) {
            RecordLog.getInstance(COSClient.getContext(), "COS").appendRecord(str, e.TAG, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (COSClient.isEnableLog()) {
            RecordLog.getInstance(COSClient.getContext(), "COS").appendRecord(str, "i", str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (COSClient.isEnableLog()) {
            RecordLog.getInstance(COSClient.getContext(), "COS").appendRecord(str, "w", str2, th);
        }
    }
}
