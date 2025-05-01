package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* compiled from: LocalExifThumbnailProducer.java */
/* loaded from: classes.dex */
public class w implements x0<com.facebook.imagepipeline.image.e> {

    /* renamed from: d  reason: collision with root package name */
    private static final int f12419d = 512;

    /* renamed from: e  reason: collision with root package name */
    public static final String f12420e = "LocalExifThumbnailProducer";
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    static final String f12421f = "createdThumbnail";

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12422a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.memory.g f12423b;

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f12424c;

    /* compiled from: LocalExifThumbnailProducer.java */
    /* loaded from: classes.dex */
    class a extends r0<com.facebook.imagepipeline.image.e> {

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ImageRequest f12425l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Consumer consumer, m0 m0Var, String str, String str2, ImageRequest imageRequest) {
            super(consumer, m0Var, str, str2);
            this.f12425l = imageRequest;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0, com.facebook.common.executors.h
        /* renamed from: j */
        public void b(com.facebook.imagepipeline.image.e eVar) {
            com.facebook.imagepipeline.image.e.d(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0
        /* renamed from: k */
        public Map<String, String> i(com.facebook.imagepipeline.image.e eVar) {
            return ImmutableMap.of(w.f12421f, Boolean.toString(eVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.common.executors.h
        @Nullable
        /* renamed from: l */
        public com.facebook.imagepipeline.image.e c() throws Exception {
            ExifInterface g4 = w.this.g(this.f12425l.t());
            if (g4 == null || !g4.hasThumbnail()) {
                return null;
            }
            return w.this.e(w.this.f12423b.d(g4.getThumbnail()), g4);
        }
    }

    /* compiled from: LocalExifThumbnailProducer.java */
    /* loaded from: classes2.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f12427a;

        b(r0 r0Var) {
            this.f12427a = r0Var;
        }

        @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
        public void b() {
            this.f12427a.a();
        }
    }

    public w(Executor executor, com.facebook.common.memory.g gVar, ContentResolver contentResolver) {
        this.f12422a = executor;
        this.f12423b = gVar;
        this.f12424c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.imagepipeline.image.e e(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        Pair<Integer, Integer> b5 = com.facebook.imageutils.a.b(new com.facebook.common.memory.h(pooledByteBuffer));
        int h4 = h(exifInterface);
        int intValue = b5 != null ? ((Integer) b5.first).intValue() : -1;
        int intValue2 = b5 != null ? ((Integer) b5.second).intValue() : -1;
        com.facebook.common.references.a u4 = com.facebook.common.references.a.u(pooledByteBuffer);
        try {
            com.facebook.imagepipeline.image.e eVar = new com.facebook.imagepipeline.image.e(u4);
            com.facebook.common.references.a.h(u4);
            eVar.X(com.facebook.imageformat.b.f11528a);
            eVar.Y(h4);
            eVar.b0(intValue);
            eVar.W(intValue2);
            return eVar;
        } catch (Throwable th) {
            com.facebook.common.references.a.h(u4);
            throw th;
        }
    }

    private int h(ExifInterface exifInterface) {
        return com.facebook.imageutils.c.a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
    }

    @Override // com.facebook.imagepipeline.producers.x0
    public boolean a(com.facebook.imagepipeline.common.d dVar) {
        return y0.b(512, 512, dVar);
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        a aVar = new a(consumer, k0Var.getListener(), f12420e, k0Var.getId(), k0Var.a());
        k0Var.c(new b(aVar));
        this.f12422a.execute(aVar);
    }

    @VisibleForTesting
    boolean f(String str) throws IOException {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    @VisibleForTesting
    @Nullable
    ExifInterface g(Uri uri) {
        String a5 = com.facebook.common.util.f.a(this.f12424c, uri);
        try {
            if (f(a5)) {
                return new ExifInterface(a5);
            }
            return null;
        } catch (IOException unused) {
            return null;
        } catch (StackOverflowError unused2) {
            com.facebook.common.logging.a.q(w.class, "StackOverflowError in ExifInterface constructor");
            return null;
        }
    }
}
