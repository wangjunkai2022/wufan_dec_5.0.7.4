package com.kwad.sdk.a.a;

import android.text.TextUtils;
import com.kwad.sdk.core.response.model.AdInfo;
/* loaded from: classes5.dex */
public final class d {
    public static String AA() {
        String Dk = com.kwad.sdk.core.config.d.Dk();
        return TextUtils.isEmpty(Dk) ? "安装" : Dk;
    }

    public static String AB() {
        String Dl = com.kwad.sdk.core.config.d.Dl();
        return TextUtils.isEmpty(Dl) ? "取消" : Dl;
    }

    public static String F(AdInfo adInfo) {
        return com.kwad.sdk.core.config.d.Dj().replace("[appname]", adInfo.adBaseInfo.appName).replace("[appsize]", com.kwad.components.core.s.e.a(adInfo.adBaseInfo.packageSize, true)).replace("[appver]", adInfo.adBaseInfo.appVersion);
    }
}
