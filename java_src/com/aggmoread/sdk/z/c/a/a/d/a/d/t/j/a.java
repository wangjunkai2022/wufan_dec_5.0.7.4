package com.aggmoread.sdk.z.c.a.a.d.a.d.t.j;

import android.app.Activity;
import android.content.Context;
import com.aggmoread.sdk.z.c.a.a.d.a.c;
import com.aggmoread.sdk.z.c.a.a.d.a.d.i;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.b;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.d;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.f;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.util.AdError;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends i implements RewardVideoADListener {

    /* renamed from: n  reason: collision with root package name */
    private RewardVideoAD f3157n;

    /* renamed from: o  reason: collision with root package name */
    private AtomicBoolean f3158o;

    public a(d dVar, e eVar) {
        super(dVar, eVar);
        this.f3158o = new AtomicBoolean();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.i, com.aggmoread.sdk.z.c.a.a.c.a
    public void a(c cVar) {
        this.f3246e = cVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3157n, i5, i4, str);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.i
    public void b(Activity activity) {
        RewardVideoAD rewardVideoAD;
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "showInner ac");
        if (!this.f2880l || (rewardVideoAD = this.f3157n) == null || rewardVideoAD.hasShown() || !this.f3158o.compareAndSet(false, true)) {
            return;
        }
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(this.f3157n, k());
        this.f3157n.showAD(activity);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3157n, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return b.a().a(this.f3244c);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "handle");
        d dVar = this.f3244c;
        com.aggmoread.sdk.z.c.a.a.c.t.b bVar = dVar.f3275s;
        Context context = dVar.f3260d;
        f fVar = this.f3245d.f3309c;
        Object obj = e.c.X;
        b.a(context, fVar.a(obj, ""));
        boolean d5 = bVar != null ? bVar.d() : true;
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "mute = " + d5);
        b.a().a(this.f3245d, this.f3244c);
        Context applicationContext = this.f3244c.f3260d.getApplicationContext();
        String a5 = this.f3245d.f3309c.a(obj, "");
        f fVar2 = this.f3245d.f3309c;
        Object obj2 = e.c.T;
        this.f3157n = (RewardVideoAD) com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(applicationContext, a5, fVar2.a(obj2, ""), d.e.REWARD, this.f3247f, this, Boolean.valueOf(true ^ d5));
        this.f2880l = false;
        if (this.f3244c.f3272p != null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "set ssv");
            String c5 = this.f3244c.f3272p.c();
            String a6 = this.f3244c.f3272p.a();
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "u = " + c5 + ", cd = " + a6);
            String a7 = m.a(a6, this.f3245d.f3309c.c(obj2));
            StringBuilder sb = new StringBuilder();
            sb.append(" _extrasInfo = ");
            sb.append(a7);
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", sb.toString());
            this.f3157n.setServerSideVerificationOptions(new ServerSideVerificationOptions.Builder().setUserId(c5).setCustomData(a7).build());
        }
        new k(this.f3244c, this.f3245d).a(0).b();
        this.f3157n.loadAD();
    }

    @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
    public void onADClick() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "onADClick");
        q();
    }

    @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
    public void onADClose() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "onADClose");
        r();
    }

    @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
    public void onADExpose() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "onADExpose");
        s();
    }

    @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
    public void onADLoad() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "onADLoad");
        if (o()) {
            int a5 = b.a(this.f3157n);
            if (b.a(this.f3245d, a5)) {
                a(a5, 0);
                return;
            }
            b(a5);
        }
        b.a(this.f3243b, this.f3157n, this.f3245d);
        d(1);
    }

    @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
    public void onADShow() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "onADShow");
        com.aggmoread.sdk.z.c.a.a.d.b.d dVar = this.f3244c;
        l.a(dVar.f3258b, this.f2879k, dVar.f3261e, Integer.valueOf(this.f3245d.f()));
        l.b(this.f3244c.f3258b, this.f3245d.e(), this.f3245d.b());
        if (this.f3244c.d() != null) {
            com.aggmoread.sdk.z.c.a.a.d.b.d dVar2 = this.f3244c;
            l.a(dVar2.f3258b, dVar2.d());
        }
        byte[] b5 = this.f3244c.f3274r.b();
        if (b5 != null) {
            l.a(this.f3244c.f3258b, b5);
        }
        l.a((Object) this.f2879k, true, true);
        l.a(this.f2879k, this.f3245d);
        t();
    }

    @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
    public void onError(AdError adError) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "onError " + adError.getErrorCode() + ", " + adError.getErrorMsg());
        b(new com.aggmoread.sdk.z.c.a.a.d.b.i(adError.getErrorCode(), adError.getErrorMsg()));
    }

    @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
    public void onReward(Map<String, Object> map) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "reward onReward map");
        l.a(this.f2879k, 1);
        if (map != null) {
            this.f2878j.putAll(map);
        }
        b(this.f2878j);
    }

    @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
    public void onVideoCached() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "onVideoCached");
        u();
    }

    @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
    public void onVideoComplete() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "onVideoComplete");
        l.a(this.f2879k, 2);
        a((Map<String, Object>) null);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.i
    public void v() {
        RewardVideoAD rewardVideoAD;
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMRTAGGDT", "showInner ");
        if (!this.f2880l || (rewardVideoAD = this.f3157n) == null || rewardVideoAD.hasShown() || !this.f3158o.compareAndSet(false, true)) {
            return;
        }
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(this.f3157n, k());
        this.f3157n.showAD();
    }
}
