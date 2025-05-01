package com.facebook.imagepipeline.animated.factory;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.common.internal.h;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import com.facebook.imagepipeline.bitmaps.f;
import com.facebook.imagepipeline.image.g;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AnimatedImageFactoryImpl.java */
/* loaded from: classes2.dex */
public class e implements d {

    /* renamed from: c  reason: collision with root package name */
    static c f11575c = g("com.facebook.animated.gif.GifImage");

    /* renamed from: d  reason: collision with root package name */
    static c f11576d = g("com.facebook.animated.webp.WebPImage");

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.animated.impl.b f11577a;

    /* renamed from: b  reason: collision with root package name */
    private final f f11578b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedImageFactoryImpl.java */
    /* loaded from: classes2.dex */
    public class a implements AnimatedImageCompositor.b {
        a() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.b
        public void a(int i4, Bitmap bitmap) {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.b
        public com.facebook.common.references.a<Bitmap> b(int i4) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedImageFactoryImpl.java */
    /* loaded from: classes2.dex */
    public class b implements AnimatedImageCompositor.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f11580a;

        b(List list) {
            this.f11580a = list;
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.b
        public void a(int i4, Bitmap bitmap) {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.b
        public com.facebook.common.references.a<Bitmap> b(int i4) {
            return com.facebook.common.references.a.d((com.facebook.common.references.a) this.f11580a.get(i4));
        }
    }

    public e(com.facebook.imagepipeline.animated.impl.b bVar, f fVar) {
        this.f11577a = bVar;
        this.f11578b = fVar;
    }

    @SuppressLint({"NewApi"})
    private com.facebook.common.references.a<Bitmap> c(int i4, int i5, Bitmap.Config config) {
        com.facebook.common.references.a<Bitmap> z4 = this.f11578b.z(i4, i5, config);
        z4.k().eraseColor(0);
        if (Build.VERSION.SDK_INT >= 12) {
            z4.k().setHasAlpha(true);
        }
        return z4;
    }

    private com.facebook.common.references.a<Bitmap> d(com.facebook.imagepipeline.animated.base.d dVar, Bitmap.Config config, int i4) {
        com.facebook.common.references.a<Bitmap> c5 = c(dVar.getWidth(), dVar.getHeight(), config);
        new AnimatedImageCompositor(this.f11577a.a(com.facebook.imagepipeline.animated.base.f.b(dVar), null), new a()).f(i4, c5.k());
        return c5;
    }

    private List<com.facebook.common.references.a<Bitmap>> e(com.facebook.imagepipeline.animated.base.d dVar, Bitmap.Config config) {
        com.facebook.imagepipeline.animated.base.a a5 = this.f11577a.a(com.facebook.imagepipeline.animated.base.f.b(dVar), null);
        ArrayList arrayList = new ArrayList(a5.a());
        AnimatedImageCompositor animatedImageCompositor = new AnimatedImageCompositor(a5, new b(arrayList));
        for (int i4 = 0; i4 < a5.a(); i4++) {
            com.facebook.common.references.a<Bitmap> c5 = c(a5.getWidth(), a5.getHeight(), config);
            animatedImageCompositor.f(i4, c5.k());
            arrayList.add(c5);
        }
        return arrayList;
    }

    private com.facebook.imagepipeline.image.c f(com.facebook.imagepipeline.common.b bVar, com.facebook.imagepipeline.animated.base.d dVar, Bitmap.Config config) {
        List<com.facebook.common.references.a<Bitmap>> list;
        com.facebook.common.references.a<Bitmap> aVar = null;
        try {
            int a5 = bVar.f11709c ? dVar.a() - 1 : 0;
            if (bVar.f11711e) {
                com.facebook.imagepipeline.image.d dVar2 = new com.facebook.imagepipeline.image.d(d(dVar, config, a5), g.f11933d, 0);
                com.facebook.common.references.a.h(null);
                com.facebook.common.references.a.j(null);
                return dVar2;
            }
            if (bVar.f11710d) {
                list = e(dVar, config);
                try {
                    aVar = com.facebook.common.references.a.d(list.get(a5));
                } catch (Throwable th) {
                    th = th;
                    com.facebook.common.references.a.h(aVar);
                    com.facebook.common.references.a.j(list);
                    throw th;
                }
            } else {
                list = null;
            }
            if (bVar.f11708b && aVar == null) {
                aVar = d(dVar, config, a5);
            }
            com.facebook.imagepipeline.image.a aVar2 = new com.facebook.imagepipeline.image.a(com.facebook.imagepipeline.animated.base.f.h(dVar).h(aVar).g(a5).f(list).a());
            com.facebook.common.references.a.h(aVar);
            com.facebook.common.references.a.j(list);
            return aVar2;
        } catch (Throwable th2) {
            th = th2;
            list = null;
        }
    }

    private static c g(String str) {
        try {
            return (c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.animated.factory.d
    public com.facebook.imagepipeline.image.c a(com.facebook.imagepipeline.image.e eVar, com.facebook.imagepipeline.common.b bVar, Bitmap.Config config) {
        com.facebook.imagepipeline.animated.base.d g4;
        if (f11575c != null) {
            com.facebook.common.references.a<PooledByteBuffer> h4 = eVar.h();
            h.i(h4);
            try {
                PooledByteBuffer k4 = h4.k();
                if (k4.e() != null) {
                    g4 = f11575c.h(k4.e());
                } else {
                    g4 = f11575c.g(k4.i(), k4.size());
                }
                return f(bVar, g4, config);
            } finally {
                com.facebook.common.references.a.h(h4);
            }
        }
        throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
    }

    @Override // com.facebook.imagepipeline.animated.factory.d
    public com.facebook.imagepipeline.image.c b(com.facebook.imagepipeline.image.e eVar, com.facebook.imagepipeline.common.b bVar, Bitmap.Config config) {
        com.facebook.imagepipeline.animated.base.d g4;
        if (f11576d != null) {
            com.facebook.common.references.a<PooledByteBuffer> h4 = eVar.h();
            h.i(h4);
            try {
                PooledByteBuffer k4 = h4.k();
                if (k4.e() != null) {
                    g4 = f11576d.h(k4.e());
                } else {
                    g4 = f11576d.g(k4.i(), k4.size());
                }
                return f(bVar, g4, config);
            } finally {
                com.facebook.common.references.a.h(h4);
            }
        }
        throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
    }
}
