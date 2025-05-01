package com.facebook.imagepipeline.decoder;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.imagepipeline.image.g;
import com.facebook.imagepipeline.image.h;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: DefaultImageDecoder.java */
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f11883a;

    /* renamed from: b  reason: collision with root package name */
    private final b f11884b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.platform.f f11885c;

    /* renamed from: d  reason: collision with root package name */
    private final b f11886d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private final Map<com.facebook.imageformat.c, b> f11887e;

    /* compiled from: DefaultImageDecoder.java */
    /* renamed from: com.facebook.imagepipeline.decoder.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0271a implements b {
        C0271a() {
        }

        @Override // com.facebook.imagepipeline.decoder.b
        public com.facebook.imagepipeline.image.c a(com.facebook.imagepipeline.image.e eVar, int i4, h hVar, com.facebook.imagepipeline.common.b bVar) {
            com.facebook.imageformat.c t4 = eVar.t();
            if (t4 == com.facebook.imageformat.b.f11528a) {
                return a.this.d(eVar, i4, hVar, bVar);
            }
            if (t4 == com.facebook.imageformat.b.f11530c) {
                return a.this.c(eVar, i4, hVar, bVar);
            }
            if (t4 == com.facebook.imageformat.b.f11537j) {
                return a.this.b(eVar, i4, hVar, bVar);
            }
            if (t4 != com.facebook.imageformat.c.f11540c) {
                return a.this.e(eVar, bVar);
            }
            throw new DecodeException("unknown image format", eVar);
        }
    }

    public a(b bVar, b bVar2, com.facebook.imagepipeline.platform.f fVar) {
        this(bVar, bVar2, fVar, null);
    }

    private void f(@Nullable w0.a aVar, com.facebook.common.references.a<Bitmap> aVar2) {
        if (aVar == null) {
            return;
        }
        Bitmap k4 = aVar2.k();
        if (Build.VERSION.SDK_INT >= 12 && aVar.a()) {
            k4.setHasAlpha(true);
        }
        aVar.b(k4);
    }

    @Override // com.facebook.imagepipeline.decoder.b
    public com.facebook.imagepipeline.image.c a(com.facebook.imagepipeline.image.e eVar, int i4, h hVar, com.facebook.imagepipeline.common.b bVar) {
        b bVar2;
        b bVar3 = bVar.f11714h;
        if (bVar3 != null) {
            return bVar3.a(eVar, i4, hVar, bVar);
        }
        com.facebook.imageformat.c t4 = eVar.t();
        if (t4 == null || t4 == com.facebook.imageformat.c.f11540c) {
            t4 = com.facebook.imageformat.d.d(eVar.u());
            eVar.X(t4);
        }
        Map<com.facebook.imageformat.c, b> map = this.f11887e;
        if (map != null && (bVar2 = map.get(t4)) != null) {
            return bVar2.a(eVar, i4, hVar, bVar);
        }
        return this.f11886d.a(eVar, i4, hVar, bVar);
    }

    public com.facebook.imagepipeline.image.c b(com.facebook.imagepipeline.image.e eVar, int i4, h hVar, com.facebook.imagepipeline.common.b bVar) {
        return this.f11884b.a(eVar, i4, hVar, bVar);
    }

    public com.facebook.imagepipeline.image.c c(com.facebook.imagepipeline.image.e eVar, int i4, h hVar, com.facebook.imagepipeline.common.b bVar) {
        b bVar2;
        if (!bVar.f11711e && (bVar2 = this.f11883a) != null) {
            return bVar2.a(eVar, i4, hVar, bVar);
        }
        return e(eVar, bVar);
    }

    public com.facebook.imagepipeline.image.d d(com.facebook.imagepipeline.image.e eVar, int i4, h hVar, com.facebook.imagepipeline.common.b bVar) {
        com.facebook.common.references.a<Bitmap> c5 = this.f11885c.c(eVar, bVar.f11713g, null, i4, bVar.f11712f);
        try {
            f(bVar.f11715i, c5);
            return new com.facebook.imagepipeline.image.d(c5, hVar, eVar.v(), eVar.l());
        } finally {
            c5.close();
        }
    }

    public com.facebook.imagepipeline.image.d e(com.facebook.imagepipeline.image.e eVar, com.facebook.imagepipeline.common.b bVar) {
        com.facebook.common.references.a<Bitmap> b5 = this.f11885c.b(eVar, bVar.f11713g, null, bVar.f11712f);
        try {
            f(bVar.f11715i, b5);
            return new com.facebook.imagepipeline.image.d(b5, g.f11933d, eVar.v(), eVar.l());
        } finally {
            b5.close();
        }
    }

    public a(b bVar, b bVar2, com.facebook.imagepipeline.platform.f fVar, @Nullable Map<com.facebook.imageformat.c, b> map) {
        this.f11886d = new C0271a();
        this.f11883a = bVar;
        this.f11884b = bVar2;
        this.f11885c = fVar;
        this.f11887e = map;
    }
}
