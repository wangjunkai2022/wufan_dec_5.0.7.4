package com.kwad.components.ad.reward.monitor;

import com.kwad.components.core.webview.tachikoma.TKRenderFailReason;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes5.dex */
public final class b {
    public static void a(boolean z4, AdTemplate adTemplate) {
        a(z4, z4 ? "ad_sdk_neo_video_cache_monitor" : "ad_sdk_fullscreen_video_cache_monitor", adTemplate, z4 ? 102001 : 103001);
    }

    public static void b(boolean z4, AdTemplate adTemplate) {
        a(z4, z4 ? "ad_sdk_neo_page_enter_monitor" : "ad_sdk_fullscreen_page_enter_monitor", adTemplate, z4 ? 102002 : 103002);
    }

    public static void c(boolean z4, int i4) {
        a(z4, z4 ? "ad_sdk_neo_request_monitor" : "ad_sdk_fullscreen_request_monitor", null, i4);
    }

    public static void a(AdTemplate adTemplate, TKRenderFailReason tKRenderFailReason) {
        int i4;
        boolean z4 = e.dM(adTemplate) == 2;
        String str = z4 ? "ad_sdk_neo_page_native_monitor" : "ad_sdk_fullscreen_page_native_monitor";
        if (TKRenderFailReason.SWITCH_CLOSE.equals(tKRenderFailReason)) {
            i4 = z4 ? 102003 : 103003;
        } else {
            i4 = TKRenderFailReason.TK_FILE_LOAD_ERROR.equals(tKRenderFailReason) ? z4 ? 102004 : 103004 : 102005;
        }
        a(z4, str, adTemplate, i4);
    }

    public static void c(boolean z4, AdTemplate adTemplate) {
        a(z4, z4 ? "ad_sdk_neo_video_play_monitor" : "ad_sdk_fullscreen_video_play_monitor", adTemplate, z4 ? 102007 : 103007);
    }

    private static void a(boolean z4, String str, AdTemplate adTemplate, int i4) {
        AdInfo dS;
        com.kwad.sdk.commercial.b.a(z4, str, new RewardMonitorInfo().setErrorCode(i4).setCreativeId((adTemplate == null || (dS = e.dS(adTemplate)) == null) ? 0L : com.kwad.sdk.core.response.b.a.J(dS)).setAdTemplate(adTemplate));
    }
}
