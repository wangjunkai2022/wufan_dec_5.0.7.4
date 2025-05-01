package com.kwad.sdk.core.imageloader;

import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.b;
/* loaded from: classes5.dex */
public class GlobalImageListener implements OnRenderResultListener<AdTemplate> {
    @Override // com.kwad.sdk.core.imageloader.OnRenderResultListener
    public void onRenderResult(boolean z4, AdTemplate adTemplate, String str, String str2) {
        if (!z4) {
            ((b) ServiceProvider.get(b.class)).H(str, str2);
        }
        if (z4) {
            return;
        }
        ((b) ServiceProvider.get(b.class)).aF(adTemplate);
    }
}
