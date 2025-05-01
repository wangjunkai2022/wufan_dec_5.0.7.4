package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.h;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import javax.annotation.Nullable;
/* compiled from: PipelineDraweeControllerBuilder.java */
/* loaded from: classes.dex */
public class e extends AbstractDraweeControllerBuilder<e, ImageRequest, com.facebook.common.references.a<com.facebook.imagepipeline.image.c>, com.facebook.imagepipeline.image.f> {

    /* renamed from: s  reason: collision with root package name */
    private final com.facebook.imagepipeline.core.g f11000s;

    /* renamed from: t  reason: collision with root package name */
    private final g f11001t;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private ImmutableList<t0.a> f11002u;
    @Nullable

    /* renamed from: v  reason: collision with root package name */
    private l0.b f11003v;
    @Nullable

    /* renamed from: w  reason: collision with root package name */
    private l0.d f11004w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PipelineDraweeControllerBuilder.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11005a;

        static {
            int[] iArr = new int[AbstractDraweeControllerBuilder.CacheLevel.values().length];
            f11005a = iArr;
            try {
                iArr[AbstractDraweeControllerBuilder.CacheLevel.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11005a[AbstractDraweeControllerBuilder.CacheLevel.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11005a[AbstractDraweeControllerBuilder.CacheLevel.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(Context context, g gVar, com.facebook.imagepipeline.core.g gVar2, Set<com.facebook.drawee.controller.c> set) {
        super(context, set);
        this.f11000s = gVar2;
        this.f11001t = gVar;
    }

    public static ImageRequest.RequestLevel S(AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        int i4 = a.f11005a[cacheLevel.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
                }
                throw new RuntimeException("Cache level" + cacheLevel + "is not supported. ");
            }
            return ImageRequest.RequestLevel.DISK_CACHE;
        }
        return ImageRequest.RequestLevel.FULL_FETCH;
    }

    @Nullable
    private com.facebook.cache.common.c T() {
        ImageRequest r4 = r();
        com.facebook.imagepipeline.cache.f s4 = this.f11000s.s();
        if (s4 == null || r4 == null) {
            return null;
        }
        if (r4.j() != null) {
            return s4.c(r4, h());
        }
        return s4.a(r4, h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* renamed from: U */
    public com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> l(o0.a aVar, String str, ImageRequest imageRequest, Object obj, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        return this.f11000s.k(imageRequest, obj, S(cacheLevel), V(aVar));
    }

    @Nullable
    protected v0.c V(o0.a aVar) {
        if (aVar instanceof d) {
            return ((d) aVar).a0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* renamed from: W */
    public d B() {
        d c5;
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            o0.a t4 = t();
            String f5 = AbstractDraweeControllerBuilder.f();
            if (t4 instanceof d) {
                c5 = (d) t4;
            } else {
                c5 = this.f11001t.c();
            }
            c5.c0(C(c5, f5), f5, T(), h(), this.f11002u, this.f11003v);
            c5.d0(this.f11004w);
            return c5;
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    public e X(@Nullable ImmutableList<t0.a> immutableList) {
        this.f11002u = immutableList;
        return w();
    }

    public e Y(t0.a... aVarArr) {
        h.i(aVarArr);
        return X(ImmutableList.b(aVarArr));
    }

    public e Z(t0.a aVar) {
        h.i(aVar);
        return X(ImmutableList.b(aVar));
    }

    public e a0(@Nullable l0.b bVar) {
        this.f11003v = bVar;
        return w();
    }

    public e b0(@Nullable l0.d dVar) {
        this.f11004w = dVar;
        return w();
    }

    @Override // o0.d
    /* renamed from: c0 */
    public e a(@Nullable Uri uri) {
        if (uri == null) {
            return (e) super.M(null);
        }
        return (e) super.M(ImageRequestBuilder.u(uri).H(RotationOptions.b()).a());
    }

    @Override // o0.d
    /* renamed from: d0 */
    public e setUri(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            return a(Uri.parse(str));
        }
        return (e) super.M(ImageRequest.c(str));
    }
}
