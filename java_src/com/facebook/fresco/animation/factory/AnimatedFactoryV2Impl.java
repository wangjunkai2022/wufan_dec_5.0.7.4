package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.executors.i;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.k;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.cache.h;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;
@DoNotStrip
@NotThreadSafe
/* loaded from: classes.dex */
public class AnimatedFactoryV2Impl implements com.facebook.imagepipeline.animated.factory.a {

    /* renamed from: h  reason: collision with root package name */
    private static final int f11476h = 3;

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.bitmaps.f f11477a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.core.e f11478b;

    /* renamed from: c  reason: collision with root package name */
    private final h<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f11479c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.imagepipeline.animated.factory.d f11480d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.imagepipeline.animated.impl.b f11481e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private s0.a f11482f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private t0.a f11483g;

    /* loaded from: classes2.dex */
    class a implements com.facebook.imagepipeline.decoder.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bitmap.Config f11484a;

        a(Bitmap.Config config) {
            this.f11484a = config;
        }

        @Override // com.facebook.imagepipeline.decoder.b
        public com.facebook.imagepipeline.image.c a(com.facebook.imagepipeline.image.e eVar, int i4, com.facebook.imagepipeline.image.h hVar, com.facebook.imagepipeline.common.b bVar) {
            return AnimatedFactoryV2Impl.this.j().a(eVar, bVar, this.f11484a);
        }
    }

    /* loaded from: classes2.dex */
    class b implements com.facebook.imagepipeline.decoder.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bitmap.Config f11486a;

        b(Bitmap.Config config) {
            this.f11486a = config;
        }

        @Override // com.facebook.imagepipeline.decoder.b
        public com.facebook.imagepipeline.image.c a(com.facebook.imagepipeline.image.e eVar, int i4, com.facebook.imagepipeline.image.h hVar, com.facebook.imagepipeline.common.b bVar) {
            return AnimatedFactoryV2Impl.this.j().b(eVar, bVar, this.f11486a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements k<Integer> {
        c() {
        }

        @Override // com.facebook.common.internal.k
        /* renamed from: a */
        public Integer get() {
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements k<Integer> {
        d() {
        }

        @Override // com.facebook.common.internal.k
        /* renamed from: a */
        public Integer get() {
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements com.facebook.imagepipeline.animated.impl.b {
        e() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.b
        public com.facebook.imagepipeline.animated.base.a a(com.facebook.imagepipeline.animated.base.f fVar, Rect rect) {
            return new com.facebook.imagepipeline.animated.impl.a(AnimatedFactoryV2Impl.this.i(), fVar, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements com.facebook.imagepipeline.animated.impl.b {
        f() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.b
        public com.facebook.imagepipeline.animated.base.a a(com.facebook.imagepipeline.animated.base.f fVar, Rect rect) {
            return new com.facebook.imagepipeline.animated.impl.a(AnimatedFactoryV2Impl.this.i(), fVar, rect);
        }
    }

    @DoNotStrip
    public AnimatedFactoryV2Impl(com.facebook.imagepipeline.bitmaps.f fVar, com.facebook.imagepipeline.core.e eVar, h<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> hVar) {
        this.f11477a = fVar;
        this.f11478b = eVar;
        this.f11479c = hVar;
    }

    private com.facebook.imagepipeline.animated.factory.d f() {
        return new com.facebook.imagepipeline.animated.factory.e(new f(), this.f11477a);
    }

    private com.facebook.fresco.animation.factory.a g() {
        c cVar = new c();
        return new com.facebook.fresco.animation.factory.a(h(), i.f(), new com.facebook.common.executors.c(this.f11478b.c()), RealtimeSinceBootClock.get(), this.f11477a, this.f11479c, cVar, new d());
    }

    private com.facebook.imagepipeline.animated.impl.b h() {
        if (this.f11481e == null) {
            this.f11481e = new e();
        }
        return this.f11481e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public s0.a i() {
        if (this.f11482f == null) {
            this.f11482f = new s0.a();
        }
        return this.f11482f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.imagepipeline.animated.factory.d j() {
        if (this.f11480d == null) {
            this.f11480d = f();
        }
        return this.f11480d;
    }

    @Override // com.facebook.imagepipeline.animated.factory.a
    @Nullable
    public t0.a a(Context context) {
        if (this.f11483g == null) {
            this.f11483g = g();
        }
        return this.f11483g;
    }

    @Override // com.facebook.imagepipeline.animated.factory.a
    public com.facebook.imagepipeline.decoder.b b(Bitmap.Config config) {
        return new a(config);
    }

    @Override // com.facebook.imagepipeline.animated.factory.a
    public com.facebook.imagepipeline.decoder.b c(Bitmap.Config config) {
        return new b(config);
    }
}
