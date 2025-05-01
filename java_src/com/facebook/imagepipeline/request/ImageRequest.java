package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.common.internal.g;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.RotationOptions;
import java.io.File;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
@Immutable
/* loaded from: classes.dex */
public class ImageRequest {

    /* renamed from: a  reason: collision with root package name */
    private final CacheChoice f12458a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f12459b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12460c;

    /* renamed from: d  reason: collision with root package name */
    private File f12461d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12462e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12463f;

    /* renamed from: g  reason: collision with root package name */
    private final com.facebook.imagepipeline.common.b f12464g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private final com.facebook.imagepipeline.common.d f12465h;

    /* renamed from: i  reason: collision with root package name */
    private final RotationOptions f12466i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final com.facebook.imagepipeline.common.a f12467j;

    /* renamed from: k  reason: collision with root package name */
    private final Priority f12468k;

    /* renamed from: l  reason: collision with root package name */
    private final RequestLevel f12469l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f12470m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f12471n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private final Boolean f12472o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private final d f12473p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    private final v0.c f12474q;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private final Boolean f12475r;

    /* loaded from: classes2.dex */
    public enum CacheChoice {
        SMALL,
        DEFAULT
    }

    /* loaded from: classes2.dex */
    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        private int mValue;

        RequestLevel(int i4) {
            this.mValue = i4;
        }

        public static RequestLevel getMax(RequestLevel requestLevel, RequestLevel requestLevel2) {
            return requestLevel.getValue() > requestLevel2.getValue() ? requestLevel : requestLevel2;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        this.f12458a = imageRequestBuilder.f();
        Uri o4 = imageRequestBuilder.o();
        this.f12459b = o4;
        this.f12460c = v(o4);
        this.f12462e = imageRequestBuilder.s();
        this.f12463f = imageRequestBuilder.q();
        this.f12464g = imageRequestBuilder.g();
        this.f12465h = imageRequestBuilder.l();
        this.f12466i = imageRequestBuilder.n() == null ? RotationOptions.a() : imageRequestBuilder.n();
        this.f12467j = imageRequestBuilder.e();
        this.f12468k = imageRequestBuilder.k();
        this.f12469l = imageRequestBuilder.h();
        this.f12470m = imageRequestBuilder.p();
        this.f12471n = imageRequestBuilder.r();
        this.f12472o = imageRequestBuilder.K();
        this.f12473p = imageRequestBuilder.i();
        this.f12474q = imageRequestBuilder.j();
        this.f12475r = imageRequestBuilder.m();
    }

    @Nullable
    public static ImageRequest a(@Nullable File file) {
        if (file == null) {
            return null;
        }
        return b(com.facebook.common.util.f.c(file));
    }

    @Nullable
    public static ImageRequest b(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.u(uri).a();
    }

    @Nullable
    public static ImageRequest c(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return b(Uri.parse(str));
    }

    private static int v(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (com.facebook.common.util.f.m(uri)) {
            return 0;
        }
        if (com.facebook.common.util.f.k(uri)) {
            return com.facebook.common.media.a.f(com.facebook.common.media.a.b(uri.getPath())) ? 2 : 3;
        } else if (com.facebook.common.util.f.j(uri)) {
            return 4;
        } else {
            if (com.facebook.common.util.f.g(uri)) {
                return 5;
            }
            if (com.facebook.common.util.f.l(uri)) {
                return 6;
            }
            if (com.facebook.common.util.f.f(uri)) {
                return 7;
            }
            return com.facebook.common.util.f.n(uri) ? 8 : -1;
        }
    }

    @Deprecated
    public boolean d() {
        return this.f12466i.h();
    }

    @Nullable
    public com.facebook.imagepipeline.common.a e() {
        return this.f12467j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ImageRequest) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (g.a(this.f12459b, imageRequest.f12459b) && g.a(this.f12458a, imageRequest.f12458a) && g.a(this.f12461d, imageRequest.f12461d) && g.a(this.f12467j, imageRequest.f12467j) && g.a(this.f12464g, imageRequest.f12464g) && g.a(this.f12465h, imageRequest.f12465h) && g.a(this.f12466i, imageRequest.f12466i)) {
                d dVar = this.f12473p;
                com.facebook.cache.common.c a5 = dVar != null ? dVar.a() : null;
                d dVar2 = imageRequest.f12473p;
                return g.a(a5, dVar2 != null ? dVar2.a() : null);
            }
            return false;
        }
        return false;
    }

    public CacheChoice f() {
        return this.f12458a;
    }

    public com.facebook.imagepipeline.common.b g() {
        return this.f12464g;
    }

    public boolean h() {
        return this.f12463f;
    }

    public int hashCode() {
        d dVar = this.f12473p;
        return g.c(this.f12458a, this.f12459b, this.f12461d, this.f12467j, this.f12464g, this.f12465h, this.f12466i, dVar != null ? dVar.a() : null, this.f12475r);
    }

    public RequestLevel i() {
        return this.f12469l;
    }

    @Nullable
    public d j() {
        return this.f12473p;
    }

    public int k() {
        com.facebook.imagepipeline.common.d dVar = this.f12465h;
        if (dVar != null) {
            return dVar.f11727b;
        }
        return 2048;
    }

    public int l() {
        com.facebook.imagepipeline.common.d dVar = this.f12465h;
        if (dVar != null) {
            return dVar.f11726a;
        }
        return 2048;
    }

    public Priority m() {
        return this.f12468k;
    }

    public boolean n() {
        return this.f12462e;
    }

    @Nullable
    public v0.c o() {
        return this.f12474q;
    }

    @Nullable
    public com.facebook.imagepipeline.common.d p() {
        return this.f12465h;
    }

    @Nullable
    public Boolean q() {
        return this.f12475r;
    }

    public RotationOptions r() {
        return this.f12466i;
    }

    public synchronized File s() {
        if (this.f12461d == null) {
            this.f12461d = new File(this.f12459b.getPath());
        }
        return this.f12461d;
    }

    public Uri t() {
        return this.f12459b;
    }

    public String toString() {
        return g.f(this).f("uri", this.f12459b).f("cacheChoice", this.f12458a).f("decodeOptions", this.f12464g).f("postprocessor", this.f12473p).f("priority", this.f12468k).f("resizeOptions", this.f12465h).f("rotationOptions", this.f12466i).f("bytesRange", this.f12467j).f("resizingAllowedOverride", this.f12475r).toString();
    }

    public int u() {
        return this.f12460c;
    }

    public boolean w() {
        return this.f12470m;
    }

    public boolean x() {
        return this.f12471n;
    }

    @Nullable
    public Boolean y() {
        return this.f12472o;
    }
}
