package com.join.mgps.Util;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.URLUtil;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.File;
import java.util.UUID;
/* compiled from: FrescoUtil.java */
/* loaded from: classes3.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f27918a = "frescocache";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrescoUtil.java */
    /* loaded from: classes3.dex */
    public class a implements com.facebook.common.memory.b {
        a() {
        }

        @Override // com.facebook.common.memory.b
        public void d(MemoryTrimType memoryTrimType) {
            double suggestedTrimRatio = memoryTrimType.getSuggestedTrimRatio();
            if (MemoryTrimType.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio() == suggestedTrimRatio || MemoryTrimType.OnSystemLowMemoryWhileAppInBackground.getSuggestedTrimRatio() == suggestedTrimRatio || MemoryTrimType.OnSystemLowMemoryWhileAppInForeground.getSuggestedTrimRatio() == suggestedTrimRatio) {
                com.facebook.imagepipeline.core.i.j().h().d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrescoUtil.java */
    /* loaded from: classes3.dex */
    public class b implements com.facebook.common.internal.k<File> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27919a;

        b(Context context) {
            this.f27919a = context;
        }

        @Override // com.facebook.common.internal.k
        /* renamed from: a */
        public File get() {
            return this.f27919a.getCacheDir();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrescoUtil.java */
    /* loaded from: classes3.dex */
    public class c extends com.facebook.datasource.b<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27920a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f27921b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f27922c;

        c(String str, File file, f fVar) {
            this.f27920a = str;
            this.f27921b = file;
            this.f27922c = fVar;
        }

        @Override // com.facebook.datasource.b, com.facebook.datasource.e
        public void d(com.facebook.datasource.c<Void> cVar) {
            super.d(cVar);
            f fVar = this.f27922c;
            if (fVar != null) {
                fVar.onProgress(cVar.getProgress());
            }
        }

        @Override // com.facebook.datasource.b
        protected void e(com.facebook.datasource.c<Void> cVar) {
            f fVar = this.f27922c;
            if (fVar != null) {
                fVar.onFail();
            }
        }

        @Override // com.facebook.datasource.b
        protected void f(com.facebook.datasource.c<Void> cVar) {
            try {
                File e5 = l0.e(this.f27920a, this.f27921b);
                if (e5 != null && e5.exists()) {
                    f fVar = this.f27922c;
                    if (fVar != null) {
                        fVar.onSuccess(e5);
                    }
                }
                f fVar2 = this.f27922c;
                if (fVar2 != null) {
                    fVar2.onFail();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrescoUtil.java */
    /* loaded from: classes3.dex */
    public class d extends com.facebook.imagepipeline.datasource.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f27923a;

        d(e eVar) {
            this.f27923a = eVar;
        }

        @Override // com.facebook.datasource.b
        protected void e(com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> cVar) {
            this.f27923a.onFail();
        }

        @Override // com.facebook.imagepipeline.datasource.b
        protected void g(Bitmap bitmap) {
            this.f27923a.a(bitmap);
        }
    }

    /* compiled from: FrescoUtil.java */
    /* loaded from: classes3.dex */
    public interface e {
        void a(Bitmap bitmap);

        void onFail();
    }

    /* compiled from: FrescoUtil.java */
    /* loaded from: classes3.dex */
    public interface f {
        void onFail();

        void onProgress(float f5);

        void onSuccess(File file);
    }

    /* compiled from: FrescoUtil.java */
    /* loaded from: classes3.dex */
    public static class g implements com.facebook.imagepipeline.cache.n {
        @Override // com.facebook.imagepipeline.cache.n
        public void a(com.facebook.imagepipeline.cache.h<?, ?> hVar) {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void b() {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void c() {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void d() {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void e() {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void f(com.facebook.cache.common.c cVar) {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void g(com.facebook.cache.common.c cVar) {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void h(com.facebook.cache.common.c cVar) {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void i(com.facebook.cache.common.c cVar) {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void j(com.facebook.imagepipeline.cache.h<?, ?> hVar) {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void k() {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void l() {
        }

        @Override // com.facebook.imagepipeline.cache.n
        public void m() {
        }
    }

    public static void a(String str) {
        Fresco.getImagePipeline().f(Uri.parse(str));
    }

    public static void b() {
        Fresco.getImagePipeline().c();
    }

    public static boolean c(String str, File file) {
        File i4;
        if (file == null || (i4 = i(str)) == null) {
            return false;
        }
        return h0.c(i4 + "", file + "");
    }

    public static boolean d(String str, File file, String str2) {
        return c(str, new File(file, str2));
    }

    public static File e(String str, File file) {
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        if (g2.h(URLUtil.guessFileName(str, "", ""))) {
            UUID.randomUUID().toString();
        }
        File file2 = new File(file, h0.o(str));
        if (c(str, file2)) {
            return file2;
        }
        return null;
    }

    public static void f(String str, Context context, File file, f fVar) {
        try {
            Fresco.getImagePipeline().M(ImageRequestBuilder.u(Uri.parse(str)).a(), context, Priority.HIGH).e(new c(str, file, fVar), com.facebook.common.executors.a.a());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void g(String str, Context context, int i4, int i5, e eVar) {
        h(str, context, i4, i5, null, eVar);
    }

    public static void h(String str, Context context, int i4, int i5, com.facebook.imagepipeline.request.a aVar, e eVar) {
        Fresco.getImagePipeline().i(ImageRequestBuilder.u(Uri.parse(str)).C(false).B(aVar).F((i4 == 0 || i5 == 0) ? null : new com.facebook.imagepipeline.common.d(i4, i5)).a(), context).e(new d(eVar), com.facebook.common.executors.a.a());
    }

    public static File i(String str) {
        if (g2.h(str)) {
            return null;
        }
        com.facebook.cache.common.c d5 = com.facebook.imagepipeline.cache.j.f().d(ImageRequest.c(str), null);
        if (com.facebook.imagepipeline.core.i.j().l().i(d5)) {
            return ((e0.c) com.facebook.imagepipeline.core.i.j().l().c(d5)).c();
        }
        if (com.facebook.imagepipeline.core.i.j().r().i(d5)) {
            return ((e0.c) com.facebook.imagepipeline.core.i.j().r().c(d5)).c();
        }
        return null;
    }

    public static Uri j(File file) {
        return Uri.fromFile(file);
    }

    public static Uri k(String str) {
        return Uri.fromFile(new File(str));
    }

    public static Uri l(int i4) {
        return Uri.parse("res://xxyy/" + i4);
    }

    public static void m(Context context, int i4) {
        com.facebook.common.memory.d c5 = com.facebook.common.memory.d.c();
        c5.a(new a());
        com.facebook.cache.disk.b m4 = com.facebook.cache.disk.b.l(context).v(i4 * 1024 * 1024).n(f27918a).p(new b(context)).m();
        Fresco.initialize(context, ImagePipelineConfig.newBuilder(context).setMainDiskCacheConfig(m4).setImageCacheStatsTracker(new g()).setDownsampleEnabled(true).setBitmapsConfig(Bitmap.Config.RGB_565).setMemoryTrimmableRegistry(c5).build());
    }

    public static boolean n(String str) {
        return com.facebook.imagepipeline.core.i.j().l().i(com.facebook.imagepipeline.cache.j.f().d(ImageRequest.c(str), null));
    }

    public static void o(Uri uri, SimpleDraweeView simpleDraweeView, com.facebook.imagepipeline.request.a aVar, int i4, int i5, com.facebook.drawee.controller.b bVar) {
        simpleDraweeView.setController((com.facebook.drawee.backends.pipeline.d) Fresco.newDraweeControllerBuilder().M(ImageRequestBuilder.u(uri).B(aVar).F(new com.facebook.imagepipeline.common.d(i4, i5)).C(true).v(true).a()).H(bVar).c(simpleDraweeView.getController()).E(true).build());
    }

    public static void p(File file, SimpleDraweeView simpleDraweeView, com.facebook.imagepipeline.request.a aVar, int i4, int i5, com.facebook.drawee.controller.b bVar) {
        o(j(file), simpleDraweeView, aVar, i4, i5, bVar);
    }

    public static void q(String str, SimpleDraweeView simpleDraweeView, com.facebook.imagepipeline.request.a aVar, int i4, int i5, com.facebook.drawee.controller.b bVar) {
        o(k(str), simpleDraweeView, aVar, i4, i5, bVar);
    }

    public static void r(int i4, SimpleDraweeView simpleDraweeView, com.facebook.imagepipeline.request.a aVar, int i5, int i6, com.facebook.drawee.controller.b bVar) {
        o(l(i4), simpleDraweeView, aVar, i5, i6, bVar);
    }

    public static void s(String str, SimpleDraweeView simpleDraweeView, com.facebook.imagepipeline.request.a aVar, int i4, int i5, com.facebook.drawee.controller.b bVar) {
        o(Uri.parse(str), simpleDraweeView, aVar, i4, i5, bVar);
    }

    public static void t() {
        Fresco.getImagePipeline().I();
    }

    public static void u() {
        Fresco.getImagePipeline().N();
    }

    public static void v(SimpleDraweeView simpleDraweeView, int i4) {
        RoundingParams a5 = RoundingParams.a();
        a5.t(i4);
        simpleDraweeView.getHierarchy().V(a5);
    }
}
