package com.tencent.stat.common;

import java.io.File;
/* loaded from: classes6.dex */
class o {

    /* renamed from: a  reason: collision with root package name */
    private static int f62985a = -1;

    public static boolean a() {
        int i4 = f62985a;
        if (i4 == 1) {
            return true;
        }
        if (i4 == 0) {
            return false;
        }
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i5 = 0; i5 < 6; i5++) {
            try {
                if (new File(strArr[i5] + "su").exists()) {
                    f62985a = 1;
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        f62985a = 0;
        return false;
    }
}
