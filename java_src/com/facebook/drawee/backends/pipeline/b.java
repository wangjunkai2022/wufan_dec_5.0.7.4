package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.j;
import javax.annotation.Nullable;
/* compiled from: DefaultDrawableFactory.java */
/* loaded from: classes.dex */
public class b implements t0.a {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f10988a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final t0.a f10989b;

    public b(Resources resources, @Nullable t0.a aVar) {
        this.f10988a = resources;
        this.f10989b = aVar;
    }

    private static boolean c(com.facebook.imagepipeline.image.d dVar) {
        return (dVar.r() == 1 || dVar.r() == 0) ? false : true;
    }

    private static boolean d(com.facebook.imagepipeline.image.d dVar) {
        return (dVar.t() == 0 || dVar.t() == -1) ? false : true;
    }

    @Override // t0.a
    public boolean a(com.facebook.imagepipeline.image.c cVar) {
        return true;
    }

    @Override // t0.a
    @Nullable
    public Drawable b(com.facebook.imagepipeline.image.c cVar) {
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("DefaultDrawableFactory#createDrawable");
            }
            if (cVar instanceof com.facebook.imagepipeline.image.d) {
                com.facebook.imagepipeline.image.d dVar = (com.facebook.imagepipeline.image.d) cVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f10988a, dVar.g());
                if (d(dVar) || c(dVar)) {
                    j jVar = new j(bitmapDrawable, dVar.t(), dVar.r());
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.c();
                    }
                    return jVar;
                }
                return bitmapDrawable;
            }
            t0.a aVar = this.f10989b;
            if (aVar != null && aVar.a(cVar)) {
                Drawable b5 = this.f10989b.b(cVar);
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
                return b5;
            }
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            return null;
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }
}
