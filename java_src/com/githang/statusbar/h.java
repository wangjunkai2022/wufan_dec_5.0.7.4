package com.githang.statusbar;

import android.annotation.TargetApi;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.TTAdConstant;
/* compiled from: StatusBarMImpl.java */
/* loaded from: classes3.dex */
class h implements b {
    @Override // com.githang.statusbar.b
    @TargetApi(23)
    public void a(Window window, int i4, boolean z4) {
        window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i4);
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z4 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        View findViewById = window.findViewById(16908290);
        if (findViewById != null) {
            findViewById.setForeground(null);
        }
    }
}
