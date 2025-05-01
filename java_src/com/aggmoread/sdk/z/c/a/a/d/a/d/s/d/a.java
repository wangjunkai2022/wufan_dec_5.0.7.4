package com.aggmoread.sdk.z.c.a.a.d.a.d.s.d;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.aggmoread.sdk.z.a.r.e;
import com.aggmoread.sdk.z.b.b.a;
import com.aggmoread.sdk.z.c.a.a.d.a.d.j;
import com.aggmoread.sdk.z.c.a.a.d.a.d.s.b;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class a extends j implements e {

    /* renamed from: t  reason: collision with root package name */
    private com.aggmoread.sdk.z.b.b.a f3074t;

    /* renamed from: u  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.a f3075u;

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
            b.a().a(this.f3244c.f3260d);
            this.f3074t = new a.b(this.f3244c.f3260d).b(this.f3244c.f3269m).a(true).c(this.f3244c.f3270n).a(view).a(this.f3245d.f3309c.c(e.c.T)).d();
            new k(this.f3244c, this.f3245d).a(0).b();
            this.f3074t.a(this);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.aggmoread.sdk.z.a.r.e
    public void a(com.aggmoread.sdk.z.a.a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f3075u = aVar;
        arrayList.add(this);
        e(arrayList);
    }

    @Override // com.aggmoread.sdk.z.a.i.b
    public void a(com.aggmoread.sdk.z.a.g.e eVar) {
        b(new i(eVar.a(), eVar.b()));
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.j
    protected void b(ViewGroup viewGroup) {
        if (this.f3075u != null) {
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
                this.f3075u.a(activity, viewGroup);
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
