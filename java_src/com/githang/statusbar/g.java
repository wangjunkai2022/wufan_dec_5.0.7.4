package com.githang.statusbar;

import android.annotation.TargetApi;
import android.view.Window;
import com.bytedance.sdk.openadsdk.TTAdConstant;
/* compiled from: StatusBarLollipopImpl.java */
/* loaded from: classes3.dex */
class g implements b {
    @Override // com.githang.statusbar.b
    @TargetApi(21)
    public void a(Window window, int i4, boolean z4) {
        window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i4);
        d.a(window, z4);
    }
}
