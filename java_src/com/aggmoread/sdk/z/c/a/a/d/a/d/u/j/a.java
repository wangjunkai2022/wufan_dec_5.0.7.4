package com.aggmoread.sdk.z.c.a.a.d.a.d.u.j;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.aggmoread.sdk.z.c.a.a.d.a.d.j;
import com.aggmoread.sdk.z.c.a.a.d.a.d.u.b;
import com.aggmoread.sdk.z.c.a.a.d.a.d.u.c;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsSplashScreenAd;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends j implements KsLoadManager.SplashScreenAdListener, KsSplashScreenAd.SplashScreenAdInteractionListener {

    /* renamed from: t  reason: collision with root package name */
    private String f3236t;

    /* renamed from: u  reason: collision with root package name */
    private AtomicBoolean f3237u;

    /* renamed from: v  reason: collision with root package name */
    private KsSplashScreenAd f3238v;

    /* renamed from: w  reason: collision with root package name */
    int f3239w;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.u.j.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0140a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.m.a f3240b;

        RunnableC0140a(com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar) {
            this.f3240b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.super.a(this.f3240b);
        }
    }

    public a(d dVar, e eVar) {
        super(dVar, eVar);
        this.f3236t = "AMSTAGKS";
        this.f3237u = new AtomicBoolean();
        this.f3239w = -1;
    }

    private void u() {
    }

    private void v() {
        r();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j
    public void a(View view) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3236t, "handle");
        this.f2893n = false;
        if (!b.a(this.f3244c.f3260d, this.f3245d.f3309c.a(e.c.X, ""))) {
            b(new i(1001002008, "广告加载失败！"));
            return;
        }
        String str = this.f3236t;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "s = " + view + ",f = " + this.f3244c.f3270n);
        String c5 = this.f3245d.f3309c.c(e.c.T);
        String trim = c5.replace("L", "").trim();
        long parseLong = Long.parseLong(trim);
        String str2 = this.f3236t;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str2, "slotId = " + c5 + ",slotIdStr = " + trim + ",_slotId = " + parseLong);
        KsAdSDK.getLoadManager().loadSplashScreenAd(c.a().a(new KsScene.Builder(parseLong)).build(), this);
        new k(this.f3244c, this.f3245d).a(0).b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j
    public void a(com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar) {
        n.a(new RunnableC0140a(aVar), 500L);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j, com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        b.a(this.f3238v, i5);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j
    public void b(ViewGroup viewGroup) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3236t, "showAd");
        if (this.f3237u.compareAndSet(false, true)) {
            u();
            if (viewGroup == null || this.f3238v == null) {
                return;
            }
            com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3236t, "showAd show");
            View view = this.f3238v.getView(viewGroup.getContext(), this);
            if (view != null) {
                viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j, com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        super.c(i4);
        b.b(this.f3238v, this.f3239w);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j, com.aggmoread.sdk.z.c.a.a.c.a
    public Map<String, Object> h() {
        return this.f3243b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return b.a().a(this.f3238v);
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
    public void onAdClicked() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3236t, "onAdClicked");
        q();
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
    public void onAdShowEnd() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3236t, "onAdShowEnd");
        v();
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
    public void onAdShowError(int i4, String str) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3236t, "onAdShowError");
        b(new i(i4, str));
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
    public void onAdShowStart() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3236t, "onAdShowStart");
        s();
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
    public void onDownloadTipsDialogCancel() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3236t, "onDownloadTipsDialogCancel");
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
    public void onDownloadTipsDialogDismiss() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3236t, "onDownloadTipsDialogDismiss");
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
    public void onDownloadTipsDialogShow() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3236t, "onDownloadTipsDialogShow");
    }

    @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
    public void onError(int i4, String str) {
        String str2 = this.f3236t;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str2, "onError i " + i4 + ", s = " + str);
        b(new i(i4, str));
    }

    @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
    public void onRequestResult(int i4) {
        String str = this.f3236t;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "onRequestResult " + i4);
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
    public void onSkippedAd() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f3236t, "onSkippedAd");
        v();
    }

    @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
    public void onSplashScreenAdLoad(@Nullable KsSplashScreenAd ksSplashScreenAd) {
        String str = this.f3236t;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "onSplashScreenAdLoad " + ksSplashScreenAd);
        if (ksSplashScreenAd == null) {
            b(new i(1001004001, "广告无填充"));
            return;
        }
        int a5 = b.a((Object) ksSplashScreenAd);
        if (b.a(this.f3245d, a5)) {
            a(a5, 0);
            return;
        }
        b(a5);
        this.f3238v = ksSplashScreenAd;
        this.f3239w = a5;
        b.b(this.f3243b, a5, this.f3245d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        e(arrayList);
    }
}
