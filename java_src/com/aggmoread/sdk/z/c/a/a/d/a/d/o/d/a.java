package com.aggmoread.sdk.z.c.a.a.d.a.d.o.d;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.aggmoread.sdk.z.a.f.b;
import com.aggmoread.sdk.z.a.h.c;
import com.aggmoread.sdk.z.c.a.a.d.a.d.o.c;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes2.dex */
public class a extends com.aggmoread.sdk.z.c.a.a.d.a.d.a implements com.aggmoread.sdk.z.a.f.a {

    /* renamed from: n  reason: collision with root package name */
    private b f2909n;

    public a(d dVar, e eVar) {
        super(dVar, eVar);
    }

    private void y() {
        View a5;
        if (this.f2814i && this.f2909n != null && this.f2816k.compareAndSet(false, true)) {
            com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = this.f2818m.get();
            if (aVar == null || (a5 = this.f2909n.a()) == null) {
                b(new i(1001002008, "广告展示失败!"));
                return;
            }
            if (a5.getParent() != null) {
                ((ViewGroup) a5.getParent()).removeView(a5);
            }
            aVar.addView(a5);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.m.a
    public void a(ViewGroup viewGroup) {
        com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(this.f3244c.f3260d);
        this.f2818m = new WeakReference<>(aVar);
        aVar.addOnAttachStateChangeListener(new com.aggmoread.sdk.z.c.a.a.d.b.m.b());
        if (viewGroup != null) {
            ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(aVar);
            }
            viewGroup.addView(aVar, new ViewGroup.LayoutParams(-1, -2));
        }
        y();
    }

    @Override // com.aggmoread.sdk.z.a.f.a
    public void a(b bVar) {
        x();
        a(new View[0]);
        t();
    }

    @Override // com.aggmoread.sdk.z.a.f.a
    public void a(b bVar, com.aggmoread.sdk.z.a.g.e eVar) {
        b(new i(eVar.a(), eVar.b()));
    }

    @Override // com.aggmoread.sdk.z.a.i.b
    public void a(com.aggmoread.sdk.z.a.g.e eVar) {
        b(new i(eVar.a(), eVar.b()));
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.m.a
    public void b() {
        a(this.f3244c.f3266j);
    }

    @Override // com.aggmoread.sdk.z.a.f.a
    public void b(b bVar) {
        q();
    }

    @Override // com.aggmoread.sdk.z.a.f.a
    public void c(b bVar) {
    }

    @Override // com.aggmoread.sdk.z.a.f.a
    public void d(b bVar) {
        r();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.m.a
    public void destroy() {
        b bVar = this.f2909n;
        if (bVar != null) {
            bVar.g();
            this.f2909n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        b bVar = this.f2909n;
        return bVar != null ? bVar.c() : super.j();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        try {
            c.a().a(j.f3429q);
            String c5 = this.f3245d.f3309c.c(e.c.T);
            if (!TextUtils.isEmpty(c5) && c5.contains("ban_")) {
                c5 = c5.replace("ban_", "").trim();
            }
            com.aggmoread.sdk.z.c.a.a.e.e.b("AGBANNERHTAG", "slot id " + c5);
            new c.b(this.f3244c.f3260d).b(this.f3244c.f3269m).a(c5).b(com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.a(this.f3245d)).d().a(this);
            new k(this.f3244c, this.f3245d).a(0).b();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.aggmoread.sdk.z.a.f.a
    public void onAdLoaded(List<b> list) {
        if (list == null || list.size() <= 0) {
            b(new i(-1000, "广告无填充!"));
            return;
        }
        b bVar = list.get(0);
        this.f2909n = bVar;
        int b5 = bVar.b();
        if (com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.a(this.f3245d, b5)) {
            a(b5, 0);
            return;
        }
        b(b5);
        com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.b(this.f3243b, b5, this.f3245d);
        v();
    }
}
