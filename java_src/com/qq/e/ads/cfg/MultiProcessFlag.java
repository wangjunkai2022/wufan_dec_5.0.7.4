package com.qq.e.ads.cfg;

import com.qq.e.comm.util.GDTLogger;
/* loaded from: classes5.dex */
public class MultiProcessFlag {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f59680a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f59681b;

    public static boolean isMultiProcess() {
        return f59680a;
    }

    public static void setMultiProcess(boolean z4) {
        if (f59681b) {
            GDTLogger.w("MultiProcessFlag已经设置过，再次设置无效");
            return;
        }
        f59681b = true;
        f59680a = z4;
    }
}
