package com.aggmoread.sdk.z.a.o;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.aggmoread.sdk.z.a.d;
import com.aggmoread.sdk.z.a.g.b;
import com.aggmoread.sdk.z.a.g.e;
import com.aggmoread.sdk.z.a.g.g;
import com.aggmoread.sdk.z.a.m.l;
import com.aggmoread.sdk.z.a.o.a;
import com.aggmoread.sdk.z.a.r.c;
import com.xinzhu.overmind.server.user.MindUserHandle;
/* loaded from: classes2.dex */
public class b implements com.aggmoread.sdk.z.a.a {

    /* renamed from: a  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.g.b f2358a;

    /* renamed from: b  reason: collision with root package name */
    private c f2359b;

    /* renamed from: c  reason: collision with root package name */
    private b.a.C0056a f2360c;

    /* renamed from: d  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.r.a f2361d;

    /* renamed from: e  reason: collision with root package name */
    private Activity f2362e;

    /* renamed from: f  reason: collision with root package name */
    private Context f2363f;

    /* renamed from: h  reason: collision with root package name */
    private String f2365h;

    /* renamed from: j  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.o.a f2367j;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2364g = false;

    /* renamed from: i  reason: collision with root package name */
    private int f2366i = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f2368a;

        a(c cVar) {
            this.f2368a = cVar;
        }

        @Override // com.aggmoread.sdk.z.a.o.a.d
        public void a() {
            b.this.e();
        }

        @Override // com.aggmoread.sdk.z.a.o.a.d
        public void a(int i4, String str) {
            com.aggmoread.sdk.z.a.r.b.a(this.f2368a, new e(i4, str));
        }

        @Override // com.aggmoread.sdk.z.a.o.a.d
        public void a(Activity activity) {
            b.this.a(activity);
        }

        @Override // com.aggmoread.sdk.z.a.o.a.d
        public void a(com.aggmoread.sdk.z.a.r.a aVar) {
            b.this.f2361d = aVar;
            b.this.g();
            b.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        d();
        if (com.aggmoread.sdk.z.a.m.a.a(activity)) {
            com.aggmoread.sdk.z.a.r.b.a(this.f2359b, e.f2108c);
        } else {
            l.a(this.f2358a, this.f2360c, c(), this.f2359b);
        }
    }

    private void b(Activity activity) {
        d.c("JHInterHandler_dsp", "showAD enter ");
        if (activity == null) {
            com.aggmoread.sdk.z.a.r.b.a(this.f2359b, new e(50003, "广告展示失败,Activity缺失!"));
            return;
        }
        try {
            com.aggmoread.sdk.z.a.t.a.a(this.f2367j);
            com.aggmoread.sdk.z.a.t.a.a(activity, null);
        } catch (Exception e5) {
            e5.printStackTrace();
            com.aggmoread.sdk.z.a.r.b.a(this.f2359b, new e(50003, "广告展示失败!"));
        }
    }

    private com.aggmoread.sdk.z.a.g.c c() {
        com.aggmoread.sdk.z.a.r.a aVar = this.f2361d;
        return aVar != null ? aVar.a() : new com.aggmoread.sdk.z.a.g.c();
    }

    private void d() {
        d.c("JHInterHandler_dsp", "onAdClick = " + c());
        com.aggmoread.sdk.z.a.q.a.a("onAdClick", this.f2360c.p(), c());
        this.f2359b.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f2359b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        com.aggmoread.sdk.z.a.q.a.a("onAdExposure", this.f2360c.q());
        this.f2359b.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f2359b.onAdShow();
    }

    @Override // com.aggmoread.sdk.z.a.a
    public String a() {
        b.a.C0056a c0056a = this.f2360c;
        if (c0056a != null) {
            return TextUtils.isEmpty(c0056a.a()) ? this.f2360c.f() : this.f2360c.a();
        }
        return null;
    }

    public void a(com.aggmoread.sdk.z.a.g.b bVar, c cVar) {
        d.c("JHInterHandler_dsp", "handle   enter");
        this.f2358a = bVar;
        this.f2359b = cVar;
        this.f2362e = bVar.d().e();
        Context j4 = bVar.d().j();
        this.f2363f = j4;
        if (this.f2362e == null && (j4 instanceof Activity)) {
            this.f2362e = (Activity) j4;
        }
        b.a.C0056a a5 = bVar.f2058e.get(0).a();
        if (a5 == null) {
            com.aggmoread.sdk.z.a.r.b.a(cVar, new e(MindUserHandle.f68252v, "广告数据异常"));
            return;
        }
        this.f2360c = a5;
        this.f2366i = a5.f2078s;
        this.f2365h = a5.i();
        d.c("JHInterHandler_dsp", "clickUrl = " + this.f2365h);
        g gVar = new g();
        gVar.f2120a = a5.j();
        gVar.f2123d = a5.a();
        gVar.f2124e = a5.f();
        com.aggmoread.sdk.z.a.o.a aVar = new com.aggmoread.sdk.z.a.o.a();
        this.f2367j = aVar;
        aVar.a(gVar);
        this.f2364g = true;
        c cVar2 = this.f2359b;
        if (cVar2 != null) {
            cVar2.a(this);
        }
        this.f2367j.a(new a(cVar));
        if (bVar.d().n()) {
            return;
        }
        b(this.f2362e);
    }

    @Override // com.aggmoread.sdk.z.a.a
    public boolean a(Activity activity, ViewGroup viewGroup) {
        if (this.f2358a.d().n() && this.f2364g) {
            b(activity);
            return true;
        }
        return false;
    }

    @Override // com.aggmoread.sdk.z.a.a
    public int b() {
        return this.f2366i;
    }
}
