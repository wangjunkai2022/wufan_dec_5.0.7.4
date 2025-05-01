package com.papa.gsyvideoplayer.render.view;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import com.papa.gsyvideoplayer.render.view.GSYVideoGLView;
import com.papa.gsyvideoplayer.utils.j;
import java.io.File;
import s2.e;
import s2.f;
import t2.c;
/* compiled from: IGSYRenderView.java */
/* loaded from: classes5.dex */
public interface a {
    Bitmap a();

    void b(e eVar, boolean z4);

    void c();

    Bitmap d();

    void e(File file, boolean z4, f fVar);

    void f();

    void g();

    c getIGSYSurfaceListener();

    View getRenderView();

    int getSizeH();

    int getSizeW();

    void setGLEffectFilter(GSYVideoGLView.c cVar);

    void setGLMVPMatrix(float[] fArr);

    void setGLRenderer(com.papa.gsyvideoplayer.render.glrender.a aVar);

    void setIGSYSurfaceListener(c cVar);

    void setRenderMode(int i4);

    void setRenderTransform(Matrix matrix);

    void setVideoParamsListener(j.a aVar);
}
