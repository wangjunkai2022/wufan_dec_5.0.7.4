package m0;

import com.facebook.drawee.backends.pipeline.info.d;
import com.facebook.imagepipeline.request.ImageRequest;
/* compiled from: ImagePerfRequestListener.java */
/* loaded from: classes2.dex */
public class c extends v0.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.common.time.c f71511a;

    /* renamed from: b  reason: collision with root package name */
    private final d f71512b;

    public c(com.facebook.common.time.c cVar, d dVar) {
        this.f71511a = cVar;
        this.f71512b = dVar;
    }

    @Override // v0.a, v0.c
    public void a(ImageRequest imageRequest, Object obj, String str, boolean z4) {
        this.f71512b.p(this.f71511a.now());
        this.f71512b.n(imageRequest);
        this.f71512b.c(obj);
        this.f71512b.u(str);
        this.f71512b.t(z4);
    }

    @Override // v0.a, v0.c
    public void c(ImageRequest imageRequest, String str, boolean z4) {
        this.f71512b.o(this.f71511a.now());
        this.f71512b.n(imageRequest);
        this.f71512b.u(str);
        this.f71512b.t(z4);
    }

    @Override // v0.a, v0.c
    public void i(ImageRequest imageRequest, String str, Throwable th, boolean z4) {
        this.f71512b.o(this.f71511a.now());
        this.f71512b.n(imageRequest);
        this.f71512b.u(str);
        this.f71512b.t(z4);
    }

    @Override // v0.a, v0.c
    public void k(String str) {
        this.f71512b.o(this.f71511a.now());
        this.f71512b.u(str);
    }
}
