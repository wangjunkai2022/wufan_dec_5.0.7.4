package com.kwad.components.ad.reward.k.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.join.mgps.activity.CollectionModuleSevenActivity_;
import com.kwad.components.ad.reward.g;
import com.kwad.components.core.webview.tachikoma.c.e;
import java.lang.ref.WeakReference;
/* loaded from: classes5.dex */
public final class b extends com.kwad.components.core.webview.tachikoma.c.e {
    private static WeakReference<b> xu;
    private g xr;
    private long xt;

    public static b a(g gVar, e.b bVar) {
        b bVar2 = new b();
        bVar2.xr = gVar;
        bVar2.mAdResultData = bVar.hl();
        bVar2.xo = bVar.getTemplateId();
        bVar2.abo = bVar.kf();
        bVar2.aby = bVar.tB();
        Bundle bundle = new Bundle();
        bundle.putString(CollectionModuleSevenActivity_.f29120u, bVar.getTemplateId());
        bVar2.setArguments(bundle);
        return bVar2;
    }

    private static boolean jk() {
        WeakReference<b> weakReference = xu;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    private void l(long j4) {
        this.xt = j4;
        com.kwad.components.core.webview.tachikoma.c.b bVar = this.abk;
        if (bVar != null) {
            bVar.xt = j4;
        }
    }

    @Override // com.kwad.components.core.webview.tachikoma.c.e
    public final com.kwad.components.core.webview.tachikoma.c.b jl() {
        return new a(this.xr);
    }

    @Override // com.kwad.components.core.webview.tachikoma.c.e
    public final com.kwad.components.core.webview.tachikoma.c.c jm() {
        return new c();
    }

    @Override // com.kwad.components.core.webview.tachikoma.c.e
    public final void jn() {
        super.jn();
        this.abk.xt = this.xt;
    }

    @Override // com.kwad.components.core.webview.tachikoma.c.e, android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.xr = null;
        xu = null;
    }

    @Nullable
    public static b a(b bVar, Activity activity, long j4, com.kwad.components.core.webview.tachikoma.e.c cVar, e.a aVar) {
        if (activity == null || activity.isFinishing() || jk()) {
            return null;
        }
        bVar.Tf = cVar;
        bVar.abp = aVar;
        bVar.show(activity.getFragmentManager(), "tkCloseDialog");
        if (j4 > 0) {
            bVar.l(j4);
        }
        xu = new WeakReference<>(bVar);
        return bVar;
    }

    @Nullable
    public static b a(g gVar, Activity activity, long j4, DialogInterface.OnDismissListener onDismissListener, com.kwad.components.core.webview.tachikoma.e.c cVar) {
        if (activity == null || activity.isFinishing() || jk()) {
            return null;
        }
        e.b bVar = new e.b();
        bVar.d(gVar.mAdResultData);
        bVar.aX(com.kwad.sdk.core.response.b.b.dx(gVar.mAdTemplate));
        b a5 = a(gVar, bVar);
        a5.Tf = cVar;
        a5.d(onDismissListener);
        a5.l(j4);
        a5.show(activity.getFragmentManager(), "tkExtraReward");
        xu = new WeakReference<>(a5);
        return a5;
    }
}
