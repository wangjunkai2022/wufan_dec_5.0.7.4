package m0;

import com.facebook.drawee.backends.pipeline.info.d;
/* compiled from: ImagePerfImageOriginListener.java */
/* loaded from: classes2.dex */
public class b implements l0.b {

    /* renamed from: a  reason: collision with root package name */
    private final d f71509a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.drawee.backends.pipeline.info.c f71510b;

    public b(d dVar, com.facebook.drawee.backends.pipeline.info.c cVar) {
        this.f71509a = dVar;
        this.f71510b = cVar;
    }

    @Override // l0.b
    public void a(String str, int i4, boolean z4) {
        this.f71509a.m(i4);
        this.f71510b.e(this.f71509a, 1);
    }
}
