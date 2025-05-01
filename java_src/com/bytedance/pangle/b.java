package com.bytedance.pangle;

import android.os.Build;
import com.bytedance.pangle.flipped.FlippedV2Impl;
import com.bytedance.pangle.log.IZeusReporter;
/* loaded from: classes2.dex */
public final class b {
    public static void a() {
        com.bytedance.pangle.flipped.c aVar;
        GlobalParam.getInstance().getReporter().saveRecord(IZeusReporter.ZEUS_STAGE_FLIPPED, "start");
        int i4 = Build.VERSION.SDK_INT;
        boolean z4 = false;
        if (i4 >= 30 || (i4 == 29 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            aVar = new FlippedV2Impl();
        } else {
            if (i4 >= 28 || (i4 == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                z4 = true;
            }
            if (z4) {
                aVar = new com.bytedance.pangle.flipped.b();
            } else {
                aVar = new com.bytedance.pangle.flipped.a();
            }
        }
        aVar.invokeHiddenApiRestrictions();
        GlobalParam.getInstance().getReporter().saveRecord(IZeusReporter.ZEUS_STAGE_FLIPPED, "finish");
    }
}
