package com.aggmoread.sdk.z.c.a.a.d.a.d.o.e;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes2.dex */
public class b extends com.aggmoread.sdk.z.c.a.a.d.a.d.c {

    /* renamed from: q  reason: collision with root package name */
    private static String f2911q = "AMHTAGGDT";

    /* renamed from: o  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.k.c f2912o;

    /* renamed from: p  reason: collision with root package name */
    private WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> f2913p;

    public b(com.aggmoread.sdk.z.a.k.c cVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, e eVar, Map<String, Object> map) {
        super(dVar, eVar, map);
        this.f2912o = cVar;
        if (cVar != null) {
            com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.b(this.f2831l, cVar.b(), eVar);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.a
    public com.aggmoread.sdk.z.c.a.a.d.b.m.a a() {
        WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference = this.f2913p;
        return weakReference != null ? weakReference.get() : super.a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c, com.aggmoread.sdk.z.c.a.a.c.o.c
    public void a(com.aggmoread.sdk.z.c.a.a.c.o.a aVar) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void destroy() {
        com.aggmoread.sdk.z.a.k.c cVar = this.f2912o;
        if (cVar != null) {
            cVar.g();
            this.f2912o = null;
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.c
    protected String getTitle() {
        return this.f2912o.c();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public View getView() {
        WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference = this.f2913p;
        if (weakReference != null && weakReference.get() != null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(f2911q, "get ");
            return this.f2913p.get();
        }
        com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(this.f2798d.f3260d);
        aVar.addView(this.f2912o.a(), new FrameLayout.LayoutParams(-1, -2));
        this.f2913p = new WeakReference<>(aVar);
        return aVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void render() {
        if (this.f2912o != null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(f2911q, "render");
            this.f2912o.h();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void renderActivity(Activity activity) {
        render();
    }
}
