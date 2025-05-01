package com.papa.gsyvideoplayer.render.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.papa.gsyvideoplayer.render.view.GSYVideoGLView;
import com.papa.gsyvideoplayer.utils.j;
import java.io.File;
import s2.e;
import s2.f;
import t2.c;
/* loaded from: classes5.dex */
public class GSYSurfaceView extends SurfaceView implements SurfaceHolder.Callback2, a, j.a {

    /* renamed from: b  reason: collision with root package name */
    private c f58348b;

    /* renamed from: c  reason: collision with root package name */
    private j.a f58349c;

    /* renamed from: d  reason: collision with root package name */
    private j f58350d;

    public GSYSurfaceView(Context context) {
        super(context);
        i();
    }

    public static GSYSurfaceView h(Context context, ViewGroup viewGroup, int i4, c cVar, j.a aVar) {
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        GSYSurfaceView gSYSurfaceView = new GSYSurfaceView(context);
        gSYSurfaceView.setIGSYSurfaceListener(cVar);
        gSYSurfaceView.setVideoParamsListener(aVar);
        gSYSurfaceView.setRotation(i4);
        com.papa.gsyvideoplayer.render.a.a(viewGroup, gSYSurfaceView);
        return gSYSurfaceView;
    }

    private void i() {
        this.f58350d = new j(this, this);
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public Bitmap a() {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support initCover now");
        return null;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void b(e eVar, boolean z4) {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support taskShotPic now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void c() {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support onRenderResume now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public Bitmap d() {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support initCoverHigh now");
        return null;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void e(File file, boolean z4, f fVar) {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support saveFrame now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void f() {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support releaseRenderAll now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void g() {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support onRenderPause now");
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getCurrentVideoHeight() {
        j.a aVar = this.f58349c;
        if (aVar != null) {
            return aVar.getCurrentVideoHeight();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getCurrentVideoWidth() {
        j.a aVar = this.f58349c;
        if (aVar != null) {
            return aVar.getCurrentVideoWidth();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public c getIGSYSurfaceListener() {
        return this.f58348b;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public View getRenderView() {
        return this;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public int getSizeH() {
        return getHeight();
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public int getSizeW() {
        return getWidth();
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getVideoSarDen() {
        j.a aVar = this.f58349c;
        if (aVar != null) {
            return aVar.getVideoSarDen();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getVideoSarNum() {
        j.a aVar = this.f58349c;
        if (aVar != null) {
            return aVar.getVideoSarNum();
        }
        return 0;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i4, int i5) {
        this.f58350d.e(i4, i5, (int) getRotation());
        setMeasuredDimension(this.f58350d.c(), this.f58350d.b());
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setGLEffectFilter(GSYVideoGLView.c cVar) {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support setGLEffectFilter now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setGLMVPMatrix(float[] fArr) {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support setGLMVPMatrix now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setGLRenderer(com.papa.gsyvideoplayer.render.glrender.a aVar) {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support setGLRenderer now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setIGSYSurfaceListener(c cVar) {
        getHolder().addCallback(this);
        this.f58348b = cVar;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setRenderMode(int i4) {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support setRenderMode now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setRenderTransform(Matrix matrix) {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support setRenderTransform now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setVideoParamsListener(j.a aVar) {
        this.f58349c = aVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        c cVar = this.f58348b;
        if (cVar != null) {
            cVar.onSurfaceSizeChanged(surfaceHolder.getSurface(), i5, i6);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        c cVar = this.f58348b;
        if (cVar != null) {
            cVar.onSurfaceAvailable(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        c cVar = this.f58348b;
        if (cVar != null) {
            cVar.onSurfaceDestroyed(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    public GSYSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i();
    }
}
