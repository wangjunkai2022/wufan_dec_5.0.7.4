package com.kwad.components.ad.reward.k.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.ad.reward.g;
import com.kwad.components.ad.reward.k.l;
import com.kwad.components.ad.reward.k.m;
import com.kwad.components.ad.reward.k.n;
import com.kwad.components.ad.reward.k.o;
import com.kwad.components.ad.reward.k.p;
import com.kwad.components.ad.reward.k.q;
import com.kwad.components.ad.reward.k.r;
import com.kwad.components.ad.reward.k.s;
import com.kwad.components.ad.reward.page.BackPressHandleResult;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.components.core.webview.tachikoma.i;
import com.kwad.components.core.webview.tachikoma.j;
import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes5.dex */
public final class d extends i implements r, w.b {
    @Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private WeakReference<g> qi;
    private n xA;
    private List<AdTemplate> xB;
    @Nullable
    private DialogInterface.OnDismissListener xC;
    private com.kwad.components.ad.reward.c.e xx;
    private m xy;
    private l xz;

    public d(@NonNull g gVar, long j4, Context context) {
        super(j4, context);
        this.xB = null;
        this.qi = new WeakReference<>(gVar);
    }

    @Override // com.kwad.components.core.webview.jshandler.w.b
    public final void N(AdTemplate adTemplate) {
        com.kwad.components.core.i.c cVar = new com.kwad.components.core.i.c(adTemplate, com.kwad.components.core.i.e.AGGREGATION);
        WeakReference<g> weakReference = this.qi;
        g gVar = weakReference != null ? weakReference.get() : null;
        if (gVar != null) {
            gVar.b(cVar);
        }
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final void a(@Nullable Activity activity, AdResultData adResultData, j jVar) {
        super.a(activity, adResultData, jVar);
        WeakReference<g> weakReference = this.qi;
        g gVar = weakReference != null ? weakReference.get() : null;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    @Override // com.kwad.components.ad.reward.k.r
    public final void aa(boolean z4) {
        n nVar = this.xA;
        if (nVar != null) {
            nVar.Z(z4);
        }
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final ak c(com.kwad.sdk.core.webview.b bVar) {
        WeakReference<g> weakReference = this.qi;
        return new p(weakReference != null ? weakReference.get() : null, getTkTemplateId(), this.xt, bVar);
    }

    @Override // com.kwad.components.core.webview.tachikoma.i, com.kwad.components.core.e.e.f
    public final void dismiss() {
        WeakReference<g> weakReference = this.qi;
        if (weakReference != null) {
            weakReference.get().D(false);
        }
        super.dismiss();
    }

    public final BackPressHandleResult go() {
        m mVar = this.xy;
        if (mVar == null) {
            return BackPressHandleResult.NOT_HANDLED;
        }
        mVar.jh();
        return BackPressHandleResult.HANDLED;
    }

    public final void h(List<AdTemplate> list) {
        this.xB = list;
    }

    public final com.kwad.components.ad.reward.c.e jo() {
        return this.xx;
    }

    public final l jp() {
        return this.xz;
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final void jq() {
        super.jq();
        WeakReference<g> weakReference = this.qi;
        g gVar = weakReference != null ? weakReference.get() : null;
        if (gVar != null) {
            gVar.b(this);
        }
    }

    @Override // com.kwad.components.core.webview.tachikoma.i, com.kwad.components.core.e.e.f
    public final void show() {
        super.show();
        WeakReference<g> weakReference = this.qi;
        if (weakReference != null) {
            weakReference.get().D(true);
        }
    }

    public d(g gVar, long j4, Context context, @Nullable DialogInterface.OnDismissListener onDismissListener) {
        super(-1L, context);
        this.xB = null;
        this.xC = onDismissListener;
        this.qi = new WeakReference<>(gVar);
    }

    @Override // com.kwad.components.core.webview.tachikoma.i
    public final void a(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, com.kwad.sdk.components.r rVar, ViewGroup viewGroup) {
        super.a(bVar, cVar, rVar, viewGroup);
        this.mApkDownloadHelper = cVar;
        WeakReference<g> weakReference = this.qi;
        com.kwad.sdk.core.webview.c.a qVar = new q(bVar, cVar, weakReference != null ? weakReference.get() : null, this.xt, this, this.xC);
        com.kwad.components.core.e.e.g.oQ().a(this);
        rVar.c(qVar);
        com.kwad.components.ad.reward.c.e eVar = new com.kwad.components.ad.reward.c.e();
        this.xx = eVar;
        rVar.c(eVar);
        Context context = this.mContext;
        WeakReference<g> weakReference2 = this.qi;
        rVar.c(new s(context, weakReference2 != null ? weakReference2.get() : null));
        WeakReference<g> weakReference3 = this.qi;
        rVar.c(new o(weakReference3 != null ? weakReference3.get() : null));
        m mVar = new m();
        this.xy = mVar;
        rVar.c(mVar);
        l lVar = new l();
        this.xz = lVar;
        rVar.c(lVar);
        List<AdTemplate> list = this.xB;
        if (list != null) {
            this.xz.g(list);
            this.xB = null;
        }
        w wVar = new w(bVar);
        wVar.a(this);
        rVar.c(wVar);
        n nVar = new n();
        this.xA = nVar;
        rVar.c(nVar);
    }
}
