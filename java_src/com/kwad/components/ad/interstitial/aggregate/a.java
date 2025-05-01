package com.kwad.components.ad.interstitial.aggregate;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import com.kwad.components.ad.interstitial.e.c;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdResultData;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class a extends PagerAdapter {
    private final KsAdVideoPlayConfig dU;
    private final KsInterstitialAd.AdInteractionListener ie;
    private final List<AdResultData> im = new ArrayList();

    /* renamed from: io  reason: collision with root package name */
    private final com.kwad.components.ad.interstitial.d f55890io;
    private final boolean iq;
    private b ir;
    private InterfaceC0408a is;

    /* renamed from: com.kwad.components.ad.interstitial.aggregate.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0408a {
        void cp();
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(com.kwad.components.ad.interstitial.g.c cVar, int i4);
    }

    public a(AdResultData adResultData, com.kwad.components.ad.interstitial.d dVar, KsAdVideoPlayConfig ksAdVideoPlayConfig, KsInterstitialAd.AdInteractionListener adInteractionListener) {
        this.f55890io = dVar;
        this.dU = ksAdVideoPlayConfig;
        this.ie = adInteractionListener;
        this.iq = com.kwad.sdk.core.response.b.a.ct(e.dS(com.kwad.sdk.core.response.b.c.n(adResultData))) == 1;
    }

    public final void d(List<AdResultData> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.im.clear();
        this.im.addAll(list);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(@NonNull ViewGroup viewGroup, int i4, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.im.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public final Object instantiateItem(@NonNull ViewGroup viewGroup, final int i4) {
        com.kwad.components.ad.interstitial.g.c cVar = new com.kwad.components.ad.interstitial.g.c(viewGroup.getContext());
        viewGroup.addView(cVar);
        cVar.setAggregateAdView(i4 > 0);
        if (i4 == 0) {
            cVar.setAdConvertListener(new c.a() { // from class: com.kwad.components.ad.interstitial.aggregate.a.1
                @Override // com.kwad.components.ad.interstitial.e.c.a
                public final void b(long j4, long j5) {
                    AdResultData adResultData = (AdResultData) a.this.im.get(i4);
                    if (adResultData == null) {
                        return;
                    }
                    com.kwad.components.ad.interstitial.report.a.dN().b(com.kwad.sdk.core.response.b.c.n(adResultData), j4, j5);
                    if (a.this.is != null) {
                        a.this.is.cp();
                    }
                }
            });
        }
        if (i4 > 0) {
            if (i4 == 1) {
                cVar.setAggregateShowTriggerType(this.iq ? 8 : 7);
            } else {
                cVar.setAggregateShowTriggerType(7);
            }
        }
        cVar.a(this.im.get(i4), this.f55890io, this.dU, this.ie);
        b bVar = this.ir;
        if (bVar != null) {
            bVar.a(cVar, i4);
        }
        return cVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    public final void a(b bVar) {
        this.ir = bVar;
    }

    public final void a(InterfaceC0408a interfaceC0408a) {
        this.is = interfaceC0408a;
    }
}
