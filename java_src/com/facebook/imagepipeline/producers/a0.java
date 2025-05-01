package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.annotation.Nullable;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: LocalVideoThumbnailProducer.java */
/* loaded from: classes2.dex */
public class a0 implements i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

    /* renamed from: c  reason: collision with root package name */
    public static final String f12135c = "VideoThumbnailProducer";
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    static final String f12136d = "createdThumbnail";

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12137a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f12138b;

    /* compiled from: LocalVideoThumbnailProducer.java */
    /* loaded from: classes2.dex */
    class a extends r0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ m0 f12139l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f12140m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ImageRequest f12141n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Consumer consumer, m0 m0Var, String str, String str2, m0 m0Var2, String str3, ImageRequest imageRequest) {
            super(consumer, m0Var, str, str2);
            this.f12139l = m0Var2;
            this.f12140m = str3;
            this.f12141n = imageRequest;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0, com.facebook.common.executors.h
        public void e(Exception exc) {
            super.e(exc);
            this.f12139l.h(this.f12140m, a0.f12135c, false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0, com.facebook.common.executors.h
        /* renamed from: j */
        public void b(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
            com.facebook.common.references.a.h(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0
        /* renamed from: k */
        public Map<String, String> i(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
            return ImmutableMap.of(a0.f12136d, String.valueOf(aVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.common.executors.h
        @Nullable
        /* renamed from: l */
        public com.facebook.common.references.a<com.facebook.imagepipeline.image.c> c() throws Exception {
            Bitmap createVideoThumbnail;
            String f5 = a0.this.f(this.f12141n);
            if (f5 == null || (createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(f5, a0.e(this.f12141n))) == null) {
                return null;
            }
            return com.facebook.common.references.a.u(new com.facebook.imagepipeline.image.d(createVideoThumbnail, com.facebook.imagepipeline.bitmaps.h.a(), com.facebook.imagepipeline.image.g.f11933d, 0));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0, com.facebook.common.executors.h
        /* renamed from: m */
        public void f(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
            super.f(aVar);
            this.f12139l.h(this.f12140m, a0.f12135c, aVar != null);
        }
    }

    /* compiled from: LocalVideoThumbnailProducer.java */
    /* loaded from: classes2.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f12143a;

        b(r0 r0Var) {
            this.f12143a = r0Var;
        }

        @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
        public void b() {
            this.f12143a.a();
        }
    }

    public a0(Executor executor, ContentResolver contentResolver) {
        this.f12137a = executor;
        this.f12138b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(ImageRequest imageRequest) {
        return (imageRequest.l() > 96 || imageRequest.k() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public String f(ImageRequest imageRequest) {
        Uri uri;
        String str;
        String[] strArr;
        Uri t4 = imageRequest.t();
        if (com.facebook.common.util.f.k(t4)) {
            return imageRequest.s().getPath();
        }
        if (com.facebook.common.util.f.j(t4)) {
            if (Build.VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(t4.getAuthority())) {
                uri = t4;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(t4);
                str = "_id=?";
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
            }
            Cursor query = this.f12138b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (query != null) {
            }
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, k0 k0Var) {
        m0 listener = k0Var.getListener();
        String id = k0Var.getId();
        a aVar = new a(consumer, listener, f12135c, id, listener, id, k0Var.a());
        k0Var.c(new b(aVar));
        this.f12137a.execute(aVar);
    }
}
