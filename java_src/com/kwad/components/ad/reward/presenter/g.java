package com.kwad.components.ad.reward.presenter;

import androidx.annotation.Nullable;
import com.kwad.components.core.i.a;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import java.util.List;
/* loaded from: classes5.dex */
public final class g extends b implements a.InterfaceC0462a {
    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void aj() {
        super.aj();
        boolean Eq = com.kwad.sdk.core.d.a.Eq();
        com.kwad.sdk.core.e.c.d("RewardInnerAdLoadPresenter", "onBind localCheckResult: " + Eq);
        SceneImpl sceneImpl = this.mAdTemplate.mAdScene;
        if (sceneImpl == null || !Eq) {
            return;
        }
        com.kwad.components.core.i.a.a(sceneImpl, this);
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0462a
    public final void e(@Nullable List<com.kwad.components.core.i.c> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.kwad.sdk.core.e.c.d("RewardInnerAdLoadPresenter", "onInnerAdLoad: " + list.size());
        AdTemplate adTemplate = list.get(0).getAdTemplate();
        boolean cw = com.kwad.sdk.core.response.b.b.cw(adTemplate);
        List<a.InterfaceC0462a> fJ = this.qp.fJ();
        if (cw) {
            com.kwad.sdk.core.d.a.e(com.kwad.sdk.core.response.b.b.ct(adTemplate), com.kwad.sdk.core.response.b.b.cu(adTemplate));
            if (fJ != null) {
                for (a.InterfaceC0462a interfaceC0462a : fJ) {
                    interfaceC0462a.e(list);
                }
            }
        }
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0462a
    public final void onError(int i4, String str) {
        List<a.InterfaceC0462a> fJ = this.qp.fJ();
        if (fJ != null) {
            for (a.InterfaceC0462a interfaceC0462a : fJ) {
                interfaceC0462a.onError(i4, str);
            }
        }
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0462a
    public final void onRequestResult(int i4) {
        List<a.InterfaceC0462a> fJ = this.qp.fJ();
        if (fJ != null) {
            for (a.InterfaceC0462a interfaceC0462a : fJ) {
                interfaceC0462a.onRequestResult(i4);
            }
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
    }
}
