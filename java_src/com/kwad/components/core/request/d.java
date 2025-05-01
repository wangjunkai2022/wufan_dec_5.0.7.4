package com.kwad.components.core.request;

import androidx.annotation.NonNull;
import com.kwad.sdk.core.response.model.AdResultData;
/* loaded from: classes5.dex */
public class d extends c {
    @Override // com.kwad.components.core.request.k
    public void a(@NonNull AdResultData adResultData) {
    }

    @Override // com.kwad.components.core.request.c
    public void a(@NonNull AdResultData adResultData, boolean z4) {
        a(adResultData);
    }

    @Override // com.kwad.components.core.request.k
    public void onError(int i4, String str) {
    }

    @Override // com.kwad.components.core.request.c
    public void a(int i4, String str, boolean z4) {
        onError(i4, str);
    }
}
