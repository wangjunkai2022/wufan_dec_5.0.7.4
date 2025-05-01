package com.kwad.components.ad.reward.model;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.kwad.sdk.core.response.model.AdInfo;
/* loaded from: classes5.dex */
public final class d {
    public static String m(AdInfo adInfo) {
        return com.kwad.sdk.core.response.b.a.cM(adInfo) ? ILivePush.ClickType.LIVE : com.kwad.sdk.core.response.b.a.bc(adInfo) ? "image" : com.kwad.sdk.core.response.b.a.bY(adInfo) ? "reward_preview" : "video";
    }
}
