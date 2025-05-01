package com.aggmoread.sdk.z.c.a.a.d.a.d.o.g;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.aggmoread.sdk.z.a.h.c;
import com.aggmoread.sdk.z.a.r.e;
import com.aggmoread.sdk.z.c.a.a.d.a.d.j;
import com.aggmoread.sdk.z.c.a.a.d.a.d.o.b;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class a extends j implements e {

    /* renamed from: t  reason: collision with root package name */
    private c f2933t;

    /* renamed from: u  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.a f2934u;

    public a(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
    }

    @Override // com.aggmoread.sdk.z.a.r.d
    public void a() {
        r();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j
    protected void a(View view) {
        try {
            com.aggmoread.sdk.z.c.a.a.d.a.d.o.c.a().a(this.f3244c.f3260d);
            this.f2933t = new c.b(this.f3244c.f3260d).b(this.f3244c.f3269m).a(true).c(this.f3244c.f3270n).a(view).b(b.a(this.f3245d)).a(this.f3245d.f3309c.c(e.c.T)).d();
            new k(this.f3244c, this.f3245d).a(0).b();
            this.f2933t.a(this);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.aggmoread.sdk.z.a.r.e
    public void a(com.aggmoread.sdk.z.a.a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f2934u = aVar;
        if (b.a(this.f3245d, aVar.b())) {
            a(aVar.b(), 0);
            return;
        }
        b.b(this.f3243b, aVar.b(), this.f3245d);
        arrayList.add(this);
        e(arrayList);
    }

    @Override // com.aggmoread.sdk.z.a.i.b
    public void a(com.aggmoread.sdk.z.a.g.e eVar) {
        b(new i(eVar.a(), eVar.b()));
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j
    protected void b(ViewGroup viewGroup) {
        if (this.f2934u != null) {
            Activity activity = null;
            if (viewGroup.getContext() instanceof Activity) {
                activity = (Activity) viewGroup.getContext();
            } else {
                Context context = this.f3244c.f3260d;
                if (context instanceof Activity) {
                    activity = (Activity) context;
                }
            }
            if (activity != null) {
                this.f2934u.a(activity, viewGroup);
            } else {
                b(new i(1001001000, "容器页面不可见!"));
            }
        }
    }

    @Override // com.aggmoread.sdk.z.a.r.e
    public void d() {
    }

    @Override // com.aggmoread.sdk.z.a.r.d
    public void e() {
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        com.aggmoread.sdk.z.a.a aVar = this.f2934u;
        return aVar != null ? aVar.a() : super.j();
    }

    @Override // com.aggmoread.sdk.z.a.r.d
    public void onAdClicked() {
        q();
    }

    @Override // com.aggmoread.sdk.z.a.r.d
    public void onAdShow() {
    }

    @Override // com.aggmoread.sdk.z.a.r.e
    public void onAdTick(long j4) {
        a(j4);
    }
}
