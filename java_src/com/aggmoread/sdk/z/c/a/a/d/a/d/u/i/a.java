package com.aggmoread.sdk.z.c.a.a.d.a.d.u.i;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.aggmoread.sdk.z.c.a.a.c.r.c;
import com.aggmoread.sdk.z.c.a.a.d.a.d.i;
import com.aggmoread.sdk.z.c.a.a.d.a.d.u.i.b;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsRewardVideoAd;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsVideoPlayConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends i implements b.a {

    /* renamed from: s  reason: collision with root package name */
    private static String f3227s = "AMRTAGKS";

    /* renamed from: n  reason: collision with root package name */
    private KsRewardVideoAd f3228n;

    /* renamed from: o  reason: collision with root package name */
    private AtomicBoolean f3229o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3230p;

    /* renamed from: q  reason: collision with root package name */
    private KsVideoPlayConfig f3231q;

    /* renamed from: r  reason: collision with root package name */
    int f3232r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.u.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0139a implements Runnable {
        RunnableC0139a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.a(((i) a.this).f2879k, 2);
            a.this.B();
        }
    }

    /* loaded from: classes2.dex */
    private class b implements InvocationHandler {
        private b() {
        }

        /* synthetic */ b(a aVar, RunnableC0139a runnableC0139a) {
            this();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            if ("onAdClicked".equals(name)) {
                a.this.onAdClicked();
                return null;
            } else if ("onPageDismiss".equals(name)) {
                a.this.x();
                return null;
            } else if ("onVideoPlayError".equals(name)) {
                a.this.c(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
                return null;
            } else if ("onVideoPlayEnd".equals(name)) {
                a.this.z();
                return null;
            } else if ("onVideoSkipToEnd".equals(name)) {
                a.this.a(((Long) objArr[0]).longValue());
                return null;
            } else if ("onVideoPlayStart".equals(name)) {
                a.this.A();
                return null;
            } else if ("onRewardVerify".equals(name)) {
                a.this.y();
                return null;
            } else if ("onRewardStepVerify".equals(name)) {
                a.this.b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
                return null;
            } else if ("onExtraRewardVerify".equals(name)) {
                a.this.e(((Integer) objArr[0]).intValue());
                return null;
            } else {
                return null;
            }
        }
    }

    public a(d dVar, e eVar) {
        super(dVar, eVar);
        this.f3229o = new AtomicBoolean();
        this.f3230p = false;
        this.f3232r = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.f3230p || this.f3232r > 5) {
            return;
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3227s, "find cc ");
        this.f3232r++;
        n.a(new RunnableC0139a(), 500L);
    }

    private void w() {
    }

    public void A() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3227s, "onVideoPlayStart");
        d dVar = this.f3244c;
        l.a(dVar.f3258b, this.f2879k, dVar.f3261e, Integer.valueOf(this.f3245d.f()));
        l.b(this.f3244c.f3258b, this.f3245d.e(), this.f3245d.b());
        if (this.f3244c.d() != null) {
            d dVar2 = this.f3244c;
            l.a(dVar2.f3258b, dVar2.d());
        }
        byte[] b5 = this.f3244c.f3274r.b();
        if (b5 != null) {
            l.a(this.f3244c.f3258b, b5);
        }
        l.a((Object) this.f2879k, true, true);
        l.a(this.f2879k, this.f3245d);
        t();
        s();
    }

    public void a(long j4) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3227s, "onVideoSkipToEnd");
        B();
        a((Map<String, Object>) null);
    }

    public void b(int i4, int i5) {
        String str = f3227s;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "onRewardStepVerify " + i4 + ", " + i5);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3228n, i5);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.i
    public void b(Activity activity) {
        KsRewardVideoAd ksRewardVideoAd = this.f3228n;
        if (ksRewardVideoAd != null && ksRewardVideoAd.isAdEnable() && this.f3229o.compareAndSet(false, true)) {
            w();
            this.f3228n.showRewardVideoAd(activity, this.f3231q);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        super.c(i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(this.f3228n, i4);
    }

    public void c(int i4, int i5) {
        com.aggmoread.sdk.z.c.a.a.e.e.a(f3227s, "onVideoPlayError %s,%s", Integer.valueOf(i4), Integer.valueOf(i5));
        c(new com.aggmoread.sdk.z.c.a.a.d.b.i(i4, i5 + ""));
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.i.b.a
    public void c(@Nullable List<KsRewardVideoAd> list) {
        String str = f3227s;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "onRewardVideoResult " + list);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.i.b.a
    public void d(@Nullable List<KsRewardVideoAd> list) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3227s, "ad loaded");
        if (list != null && list.size() > 0) {
            this.f3228n = list.get(0);
            this.f3228n.setRewardAdInteractionListener((KsRewardVideoAd.RewardAdInteractionListener) Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{KsRewardVideoAd.RewardAdInteractionListener.class}, new b(this, null)));
        }
        int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a((Object) this.f3228n);
        if (com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3245d, a5)) {
            a(a5, 0);
            return;
        }
        b(a5);
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(this.f3243b, a5, this.f3245d);
        d(1);
        u();
    }

    public void e(int i4) {
        String str = f3227s;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "onExtraRewardVerify " + i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a().a(this.f3228n);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        if (!com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3244c.f3260d, this.f3245d.f3309c.a(e.c.X, ""))) {
            b(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002008, "广告加载失败！"));
            return;
        }
        try {
            String c5 = this.f3245d.f3309c.c(e.c.T);
            String trim = c5.replace("L", "").trim();
            long parseLong = Long.parseLong(trim);
            String str = f3227s;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, "slotId = " + c5 + ",slotIdStr = " + trim + ",_slotId = " + parseLong);
            HashMap hashMap = new HashMap();
            c cVar = this.f3244c.f3272p;
            if (cVar != null) {
                hashMap.put("thirdUserId", cVar.c());
                String a5 = m.a(this.f3244c.f3272p.a(), c5);
                String str2 = f3227s;
                com.aggmoread.sdk.z.c.a.a.e.e.b(str2, "_ext " + a5);
                hashMap.put("extraData", a5);
            }
            com.aggmoread.sdk.z.c.a.a.d.a.d.u.i.b bVar = new com.aggmoread.sdk.z.c.a.a.d.a.d.u.i.b(this);
            KsAdSDK.getLoadManager().loadRewardVideoAd(new KsScene.Builder(parseLong).rewardCallbackExtraData(hashMap).build(), bVar.a());
            com.aggmoread.sdk.z.c.a.a.e.e.b(f3227s, "load ad");
            if (this.f3244c.f3275s != null) {
                this.f3231q = new KsVideoPlayConfig.Builder().videoSoundEnable(!this.f3244c.f3275s.d()).build();
            }
            new k(this.f3244c, this.f3245d).a(0).b();
        } catch (Exception unused) {
            b(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002008, "广告ID配置错误，广告加载失败！"));
        }
    }

    public void onAdClicked() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3227s, "onAdClicked");
        q();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.i.b.a
    public void onError(int i4, String str) {
        com.aggmoread.sdk.z.c.a.a.e.e.a(f3227s, "onAdError %s,%s", Integer.valueOf(i4), str);
        b(new com.aggmoread.sdk.z.c.a.a.d.b.i(i4, str));
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.i.b.a
    public void onRequestResult(int i4) {
        com.aggmoread.sdk.z.c.a.a.e.e.a(f3227s, "onRequestResult %s", Integer.valueOf(i4));
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.i
    public void v() {
        Context context = this.f3244c.f3260d;
        if (context instanceof Activity) {
            b((Activity) context);
            return;
        }
        String str = f3227s;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "act = null " + this.f2880l);
        if (this.f2880l) {
            onError(1001002009, "当前传入Activity为空");
        }
    }

    public void x() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3227s, "onPageDismiss");
        r();
    }

    public void y() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3227s, "onRewardVerify");
        l.a(this.f2879k, 1);
        b(this.f2878j);
    }

    public void z() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3227s, "onVideoPlayEnd");
        B();
        a((Map<String, Object>) null);
    }
}
