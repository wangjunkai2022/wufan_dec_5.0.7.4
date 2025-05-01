package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.common.internal.h;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class ImageRequestBuilder {
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private v0.c f12489n;

    /* renamed from: a  reason: collision with root package name */
    private Uri f12476a = null;

    /* renamed from: b  reason: collision with root package name */
    private ImageRequest.RequestLevel f12477b = ImageRequest.RequestLevel.FULL_FETCH;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.imagepipeline.common.d f12478c = null;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private RotationOptions f12479d = null;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.imagepipeline.common.b f12480e = com.facebook.imagepipeline.common.b.a();

    /* renamed from: f  reason: collision with root package name */
    private ImageRequest.CacheChoice f12481f = ImageRequest.CacheChoice.DEFAULT;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12482g = ImagePipelineConfig.getDefaultImageRequestConfig().isProgressiveRenderingEnabled();

    /* renamed from: h  reason: collision with root package name */
    private boolean f12483h = false;

    /* renamed from: i  reason: collision with root package name */
    private Priority f12484i = Priority.HIGH;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private d f12485j = null;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12486k = true;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12487l = true;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private Boolean f12488m = null;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private com.facebook.imagepipeline.common.a f12490o = null;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private Boolean f12491p = null;

    /* loaded from: classes2.dex */
    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private ImageRequestBuilder() {
    }

    public static ImageRequestBuilder d(ImageRequest imageRequest) {
        return u(imageRequest.t()).y(imageRequest.g()).w(imageRequest.e()).x(imageRequest.f()).z(imageRequest.h()).A(imageRequest.i()).B(imageRequest.j()).C(imageRequest.n()).E(imageRequest.m()).F(imageRequest.p()).D(imageRequest.o()).H(imageRequest.r()).I(imageRequest.y());
    }

    public static ImageRequestBuilder t(int i4) {
        return u(com.facebook.common.util.f.e(i4));
    }

    public static ImageRequestBuilder u(Uri uri) {
        return new ImageRequestBuilder().J(uri);
    }

    public ImageRequestBuilder A(ImageRequest.RequestLevel requestLevel) {
        this.f12477b = requestLevel;
        return this;
    }

    public ImageRequestBuilder B(d dVar) {
        this.f12485j = dVar;
        return this;
    }

    public ImageRequestBuilder C(boolean z4) {
        this.f12482g = z4;
        return this;
    }

    public ImageRequestBuilder D(v0.c cVar) {
        this.f12489n = cVar;
        return this;
    }

    public ImageRequestBuilder E(Priority priority) {
        this.f12484i = priority;
        return this;
    }

    public ImageRequestBuilder F(@Nullable com.facebook.imagepipeline.common.d dVar) {
        this.f12478c = dVar;
        return this;
    }

    public ImageRequestBuilder G(@Nullable Boolean bool) {
        this.f12491p = bool;
        return this;
    }

    public ImageRequestBuilder H(@Nullable RotationOptions rotationOptions) {
        this.f12479d = rotationOptions;
        return this;
    }

    public ImageRequestBuilder I(@Nullable Boolean bool) {
        this.f12488m = bool;
        return this;
    }

    public ImageRequestBuilder J(Uri uri) {
        h.i(uri);
        this.f12476a = uri;
        return this;
    }

    @Nullable
    public Boolean K() {
        return this.f12488m;
    }

    protected void L() {
        Uri uri = this.f12476a;
        if (uri != null) {
            if (com.facebook.common.util.f.l(uri)) {
                if (this.f12476a.isAbsolute()) {
                    if (!this.f12476a.getPath().isEmpty()) {
                        try {
                            Integer.parseInt(this.f12476a.getPath().substring(1));
                        } catch (NumberFormatException unused) {
                            throw new BuilderException("Resource URI path must be a resource id.");
                        }
                    } else {
                        throw new BuilderException("Resource URI must not be empty");
                    }
                } else {
                    throw new BuilderException("Resource URI path must be absolute.");
                }
            }
            if (com.facebook.common.util.f.g(this.f12476a) && !this.f12476a.isAbsolute()) {
                throw new BuilderException("Asset URI path must be absolute.");
            }
            return;
        }
        throw new BuilderException("Source must be set!");
    }

    public ImageRequest a() {
        L();
        return new ImageRequest(this);
    }

    public ImageRequestBuilder b() {
        this.f12486k = false;
        return this;
    }

    public ImageRequestBuilder c() {
        this.f12487l = false;
        return this;
    }

    @Nullable
    public com.facebook.imagepipeline.common.a e() {
        return this.f12490o;
    }

    public ImageRequest.CacheChoice f() {
        return this.f12481f;
    }

    public com.facebook.imagepipeline.common.b g() {
        return this.f12480e;
    }

    public ImageRequest.RequestLevel h() {
        return this.f12477b;
    }

    @Nullable
    public d i() {
        return this.f12485j;
    }

    @Nullable
    public v0.c j() {
        return this.f12489n;
    }

    public Priority k() {
        return this.f12484i;
    }

    @Nullable
    public com.facebook.imagepipeline.common.d l() {
        return this.f12478c;
    }

    @Nullable
    public Boolean m() {
        return this.f12491p;
    }

    @Nullable
    public RotationOptions n() {
        return this.f12479d;
    }

    public Uri o() {
        return this.f12476a;
    }

    public boolean p() {
        return this.f12486k && com.facebook.common.util.f.m(this.f12476a);
    }

    public boolean q() {
        return this.f12483h;
    }

    public boolean r() {
        return this.f12487l;
    }

    public boolean s() {
        return this.f12482g;
    }

    @Deprecated
    public ImageRequestBuilder v(boolean z4) {
        if (z4) {
            return H(RotationOptions.a());
        }
        return H(RotationOptions.d());
    }

    public ImageRequestBuilder w(@Nullable com.facebook.imagepipeline.common.a aVar) {
        this.f12490o = aVar;
        return this;
    }

    public ImageRequestBuilder x(ImageRequest.CacheChoice cacheChoice) {
        this.f12481f = cacheChoice;
        return this;
    }

    public ImageRequestBuilder y(com.facebook.imagepipeline.common.b bVar) {
        this.f12480e = bVar;
        return this;
    }

    public ImageRequestBuilder z(boolean z4) {
        this.f12483h = z4;
        return this;
    }
}
