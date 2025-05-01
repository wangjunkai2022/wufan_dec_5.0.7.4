package com.aggmoread.sdk.z.c.a.a.d.a.d.p.i;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.aggmoread.sdk.z.c.a.a.d.a.d.j;
import com.aggmoread.sdk.z.c.a.a.d.a.d.p.c;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.baidu.mobads.sdk.api.RequestParameters;
import com.baidu.mobads.sdk.api.SplashAd;
import com.tencent.bugly.Bugly;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends j {

    /* renamed from: t  reason: collision with root package name */
    private SplashAd f3006t;

    /* renamed from: u  reason: collision with root package name */
    private AtomicBoolean f3007u;

    /* renamed from: v  reason: collision with root package name */
    private AtomicBoolean f3008v;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0117a implements c.k {
        C0117a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.k
        public void a() {
            e.b("AMSTAGBD", "onAdDismissed");
            a.this.r();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.k
        public void b() {
            e.b("AMSTAGBD", "onAdCacheFailed");
            a.this.b(new i(-1000, "广告素材加载失败！"));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.k
        public void c() {
            e.b("AMSTAGBD", "onLpClosed");
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.k
        public void d() {
            e.b("AMSTAGBD", "onAdSkip");
            a.this.t();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.k
        public void e() {
            e.b("AMSTAGBD", "onAdCacheSuccess");
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.k
        public void f() {
            e.b("AMSTAGBD", "onADLoaded");
            int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a((Object) a.this.f3006t);
            if (com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(a.this.f3245d, a5)) {
                a.this.a(a5, 0);
                return;
            }
            a.this.b(a5);
            a aVar = a.this;
            com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.b(aVar.f3243b, a5, aVar.f3245d);
            ArrayList arrayList = new ArrayList();
            arrayList.add(a.this);
            a.this.e(arrayList);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.k
        public void g() {
            e.b("AMSTAGBD", "onAdPresent");
            if (a.this.f3008v.compareAndSet(false, true)) {
                a.this.s();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.k
        public void onAdClick() {
            e.b("AMSTAGBD", "onAdClick");
            a.this.q();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.k
        public void onAdExposed() {
            e.b("AMSTAGBD", "onAdExposed");
            if (a.this.f3008v.compareAndSet(false, true)) {
                a.this.s();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.k
        public void onAdFailed(String str) {
            a.this.b(new i(-1000, str));
        }
    }

    public a(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f3007u = new AtomicBoolean();
        this.f3008v = new AtomicBoolean();
    }

    private void a(ViewGroup viewGroup, SplashAd splashAd) {
        if (splashAd != null) {
            splashAd.show(viewGroup);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j
    public void a(View view) {
        this.f2893n = false;
        String a5 = this.f3245d.f3309c.a(e.c.X, "");
        Context a6 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3244c, this.f3245d, this.f3248g);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(a6.getApplicationContext(), a5);
        RequestParameters.Builder builder = new RequestParameters.Builder();
        builder.addExtra("timeout", String.valueOf(this.f3244c.f3270n));
        builder.addExtra("displayDownloadInfo", "true");
        builder.addExtra("use_dialog_frame", Bugly.SDK_IS_DEV);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(builder, this.f3244c, this.f3245d);
        SplashAd splashAd = new SplashAd(a6.getApplicationContext(), this.f3245d.f3309c.c(e.c.T), builder.build(), c.a().a(new C0117a()));
        this.f3006t = splashAd;
        splashAd.setAppSid(a5);
        new k(this.f3244c, this.f3245d).a(0).b();
        this.f3006t.load();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j, com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3006t, "203");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j
    public void b(ViewGroup viewGroup) {
        if (viewGroup == null || this.f3006t == null || !this.f3007u.compareAndSet(false, true)) {
            return;
        }
        a(viewGroup, this.f3006t);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j, com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        com.aggmoread.sdk.z.c.a.a.e.e.c("win " + i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3006t, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a().a(this.f3006t);
    }
}
