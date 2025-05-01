package com.aggmoread.sdk.z.c.a.a.d.a.d.p.h;

import android.content.Context;
import com.aggmoread.sdk.z.c.a.a.d.a.c;
import com.aggmoread.sdk.z.c.a.a.d.a.d.i;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.f;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.baidu.mobads.sdk.api.RequestParameters;
import com.baidu.mobads.sdk.api.RewardVideoAd;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends i implements RewardVideoAd.RewardVideoAdListener {

    /* renamed from: n  reason: collision with root package name */
    private RewardVideoAd f3002n;

    /* renamed from: o  reason: collision with root package name */
    private AtomicBoolean f3003o;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0116a implements Runnable {
        RunnableC0116a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.a(((i) a.this).f2879k, 2);
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.a(((i) a.this).f2879k, 2);
        }
    }

    public a(d dVar, e eVar) {
        super(dVar, eVar);
        this.f3003o = new AtomicBoolean();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.i, com.aggmoread.sdk.z.c.a.a.c.a
    public void a(c cVar) {
        this.f3246e = cVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3002n, "203");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        com.aggmoread.sdk.z.c.a.a.e.e.c("win " + i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3002n, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a().a(this.f3002n);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "handle");
        Context a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3244c, this.f3245d, this.f3248g);
        com.aggmoread.sdk.z.c.a.a.c.t.b bVar = this.f3244c.f3275s;
        String a6 = this.f3245d.f3309c.a(e.c.X, "");
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(a5, a6);
        boolean d5 = bVar != null ? bVar.d() : true;
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "mute = " + d5);
        Context applicationContext = a5.getApplicationContext();
        f fVar = this.f3245d.f3309c;
        Object obj = e.c.T;
        RewardVideoAd rewardVideoAd = new RewardVideoAd(applicationContext, fVar.a(obj, ""), this);
        this.f3002n = rewardVideoAd;
        rewardVideoAd.setAppSid(a6);
        this.f2880l = false;
        if (this.f3244c.f3272p != null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "set ssv");
            String c5 = this.f3244c.f3272p.c();
            String a7 = this.f3244c.f3272p.a();
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "u = " + c5 + ", cd = " + a7);
            String a8 = m.a(a7, this.f3245d.f3309c.c(obj));
            StringBuilder sb = new StringBuilder();
            sb.append(" _extrasInfo = ");
            sb.append(a8);
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", sb.toString());
            this.f3002n.setUserId(c5);
            this.f3002n.setExtraInfo(a8);
        }
        new k(this.f3244c, this.f3245d).a(0).b();
        try {
            RequestParameters.Builder builder = new RequestParameters.Builder();
            com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(builder, this.f3244c, this.f3245d);
            com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3002n, builder.build());
        } catch (Exception unused) {
        }
        this.f3002n.load();
    }

    public void onAdClick() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "onADClick");
        q();
    }

    public void onAdClose(float f5) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "onADClose " + f5);
        r();
    }

    public void onAdFailed(String str) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "onAdFailed " + str);
        b(new com.aggmoread.sdk.z.c.a.a.d.b.i(-1000, str));
    }

    public void onAdLoaded() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "onADLoad");
        int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a((Object) this.f3002n);
        if (com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3245d, a5)) {
            a(a5, 0);
            return;
        }
        b(a5);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.b(this.f3243b, a5, this.f3245d);
        d(1);
    }

    public void onAdShow() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "onADShow");
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

    public void onAdSkip(float f5) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "onAdSkip " + f5);
        n.a(new b(), 1000L);
    }

    public void onRewardVerify(boolean z4) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "reward onReward " + z4);
        l.a(this.f2879k, 1);
        b(this.f2878j);
    }

    public void onVideoDownloadFailed() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "onVideoDownloadFailed");
        b(new com.aggmoread.sdk.z.c.a.a.d.b.i(-1000, "视频素材缓存失败"));
    }

    public void onVideoDownloadSuccess() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "onVideoDownloadSuccess");
        u();
    }

    public void playCompletion() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "playCompletion");
        n.a(new RunnableC0116a(), 1000L);
        a((Map<String, Object>) null);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.i
    public void v() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGBD", "showInner " + this.f2880l);
        if (this.f2880l && this.f3002n != null && this.f3003o.compareAndSet(false, true)) {
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(this.f3002n, k());
            this.f3002n.show();
        }
    }
}
