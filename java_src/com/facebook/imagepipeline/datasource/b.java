package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;
import javax.annotation.Nullable;
/* compiled from: BaseBitmapDataSubscriber.java */
/* loaded from: classes.dex */
public abstract class b extends com.facebook.datasource.b<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {
    @Override // com.facebook.datasource.b
    public void f(com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> cVar) {
        if (cVar.c()) {
            com.facebook.common.references.a<com.facebook.imagepipeline.image.c> g4 = cVar.g();
            Bitmap bitmap = null;
            if (g4 != null && (g4.k() instanceof com.facebook.imagepipeline.image.b)) {
                bitmap = ((com.facebook.imagepipeline.image.b) g4.k()).g();
            }
            try {
                g(bitmap);
            } finally {
                com.facebook.common.references.a.h(g4);
            }
        }
    }

    protected abstract void g(@Nullable Bitmap bitmap);
}
