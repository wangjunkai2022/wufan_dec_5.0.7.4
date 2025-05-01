package m0;

import android.graphics.drawable.Animatable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.backends.pipeline.info.d;
import com.facebook.imagepipeline.image.f;
import javax.annotation.Nullable;
/* compiled from: ImagePerfControllerListener.java */
/* loaded from: classes.dex */
public class a extends com.facebook.drawee.controller.b<f> {

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.time.c f71506b;

    /* renamed from: c  reason: collision with root package name */
    private final d f71507c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.drawee.backends.pipeline.info.c f71508d;

    public a(com.facebook.common.time.c cVar, d dVar, com.facebook.drawee.backends.pipeline.info.c cVar2) {
        this.f71506b = cVar;
        this.f71507c = dVar;
        this.f71508d = cVar2;
    }

    @VisibleForTesting
    private void d(long j4) {
        this.f71507c.w(false);
        this.f71507c.q(j4);
        this.f71508d.d(this.f71507c, 2);
    }

    @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
    /* renamed from: b */
    public void onFinalImageSet(String str, @Nullable f fVar, @Nullable Animatable animatable) {
        long now = this.f71506b.now();
        this.f71507c.g(now);
        this.f71507c.o(now);
        this.f71507c.h(str);
        this.f71507c.k(fVar);
        this.f71508d.e(this.f71507c, 3);
    }

    @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
    /* renamed from: c */
    public void onIntermediateImageSet(String str, @Nullable f fVar) {
        this.f71507c.i(this.f71506b.now());
        this.f71507c.h(str);
        this.f71507c.k(fVar);
        this.f71508d.e(this.f71507c, 2);
    }

    @VisibleForTesting
    public void e(long j4) {
        this.f71507c.w(true);
        this.f71507c.v(j4);
        this.f71508d.d(this.f71507c, 1);
    }

    @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
    public void onFailure(String str, Throwable th) {
        long now = this.f71506b.now();
        this.f71507c.f(now);
        this.f71507c.h(str);
        this.f71508d.e(this.f71507c, 5);
        d(now);
    }

    @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
    public void onRelease(String str) {
        super.onRelease(str);
        long now = this.f71506b.now();
        int a5 = this.f71507c.a();
        if (a5 != 3 && a5 != 5) {
            this.f71507c.e(now);
            this.f71507c.h(str);
            this.f71508d.e(this.f71507c, 4);
        }
        d(now);
    }

    @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
    public void onSubmit(String str, Object obj) {
        long now = this.f71506b.now();
        this.f71507c.j(now);
        this.f71507c.h(str);
        this.f71507c.c(obj);
        this.f71508d.e(this.f71507c, 0);
        e(now);
    }
}
