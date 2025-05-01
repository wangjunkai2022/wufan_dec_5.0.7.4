package com.kwad.components.ad.draw.b.b;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes5.dex */
public final class a {
    private InterfaceC0396a cF;
    @Nullable
    private b cG;
    private boolean cH = false;
    private AdTemplate mAdTemplate;

    /* renamed from: com.kwad.components.ad.draw.b.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0396a {
        void aq();
    }

    /* loaded from: classes5.dex */
    public interface b {
        boolean ar();
    }

    public a(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
    }

    @MainThread
    public final void a(InterfaceC0396a interfaceC0396a) {
        this.cF = interfaceC0396a;
    }

    public final void ap() {
        InterfaceC0396a interfaceC0396a;
        if (this.cH) {
            return;
        }
        this.cH = true;
        if (e.dS(this.mAdTemplate).status == 1 || e.dS(this.mAdTemplate).status == 2 || e.dS(this.mAdTemplate).status == 3) {
            return;
        }
        b bVar = this.cG;
        if ((bVar == null || !bVar.ar()) && (interfaceC0396a = this.cF) != null) {
            interfaceC0396a.aq();
        }
    }

    @MainThread
    public final void a(b bVar) {
        this.cG = bVar;
    }
}
