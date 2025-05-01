package com.aggmoread.sdk.z.c.a.a.d.a.d;

import com.aggmoread.sdk.client.AMConst;
import com.aggmoread.sdk.z.c.a.a.c.o.e;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class d extends com.aggmoread.sdk.z.c.a.a.d.a.a implements com.aggmoread.sdk.z.c.a.a.c.o.e {

    /* renamed from: l  reason: collision with root package name */
    public Map<String, Object> f2840l;

    /* renamed from: m  reason: collision with root package name */
    protected com.aggmoread.sdk.z.c.a.a.d.a.c f2841m;

    public d(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(dVar, eVar);
        this.f2840l = new HashMap();
        if (map != null) {
            map.put(AMConst.ExtrasKey.AD_ID, this.f2796b);
            this.f2840l.putAll(map);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public final void a(int i4) {
        if (com.aggmoread.sdk.z.c.a.a.e.m.g(this.f2799e)) {
            b(i4);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public final void a(int i4, int i5, String str) {
        if (com.aggmoread.sdk.z.c.a.a.e.m.g(this.f2799e)) {
            b(i4, i5, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(e.a aVar) {
        com.aggmoread.sdk.z.c.a.a.e.e.a("exposure");
        d();
        if (com.aggmoread.sdk.z.c.a.a.e.m.e()) {
            com.aggmoread.sdk.z.c.a.a.e.m.a(this.f2840l, getTitle());
        }
        if (com.aggmoread.sdk.z.c.a.a.e.m.b(this.f2799e)) {
            aVar.onAdExposed();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
        this.f2841m = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i4) {
    }

    protected void b(int i4, int i5, String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.aggmoread.sdk.z.c.a.a.d.a.c c() {
        com.aggmoread.sdk.z.c.a.a.d.a.c cVar = this.f2841m;
        return cVar != null ? cVar : this.f2798d.f3276t;
    }

    protected void d() {
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f2798d, this.f2799e).a(6).a(k.b.f3448n, this.f2796b).a(k.b.C, getTitle()).a(k.b.f3451q, com.aggmoread.sdk.z.c.a.a.e.m.a(this.f2798d, this.f2799e, this.f2840l)).b();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void destroy() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public com.aggmoread.sdk.z.c.a.a.c.c g() {
        return null;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public double getAppPrice() {
        return 0.0d;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAppScore() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getAppStatus() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public long getDownloadCount() {
        return 0L;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public String getID() {
        return this.f2796b;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getPictureHeight() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getPictureWidth() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getProgress() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public abstract String getTitle();

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public int getVideoCurrentPosition() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public Map<String, Object> h() {
        return com.aggmoread.sdk.z.c.a.a.e.m.a(this.f2840l);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void pauseVideo() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void resume() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void resumeVideo() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void setVideoMute(boolean z4) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void startVideo() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.e
    public void stopVideo() {
    }
}
