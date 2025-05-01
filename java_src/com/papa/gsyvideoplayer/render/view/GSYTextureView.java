package com.papa.gsyvideoplayer.render.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.papa.gsyvideoplayer.render.view.GSYVideoGLView;
import com.papa.gsyvideoplayer.utils.d;
import com.papa.gsyvideoplayer.utils.j;
import java.io.File;
import s2.e;
import s2.f;
import t2.c;
/* loaded from: classes5.dex */
public class GSYTextureView extends TextureView implements TextureView.SurfaceTextureListener, com.papa.gsyvideoplayer.render.view.a, j.a {

    /* renamed from: b  reason: collision with root package name */
    private c f58351b;

    /* renamed from: c  reason: collision with root package name */
    private j.a f58352c;

    /* renamed from: d  reason: collision with root package name */
    private j f58353d;

    /* renamed from: e  reason: collision with root package name */
    private SurfaceTexture f58354e;

    /* renamed from: f  reason: collision with root package name */
    private Surface f58355f;

    /* loaded from: classes5.dex */
    class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f58356a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f58357b;

        a(f fVar, File file) {
            this.f58356a = fVar;
            this.f58357b = file;
        }

        @Override // s2.e
        public void a(Bitmap bitmap) {
            if (bitmap == null) {
                this.f58356a.a(false, this.f58357b);
                return;
            }
            d.e(bitmap, this.f58357b);
            this.f58356a.a(true, this.f58357b);
        }
    }

    public GSYTextureView(Context context) {
        super(context);
        i();
    }

    public static GSYTextureView h(Context context, ViewGroup viewGroup, int i4, c cVar, j.a aVar) {
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        GSYTextureView gSYTextureView = new GSYTextureView(context);
        gSYTextureView.setIGSYSurfaceListener(cVar);
        gSYTextureView.setVideoParamsListener(aVar);
        gSYTextureView.setRotation(i4);
        com.papa.gsyvideoplayer.render.a.a(viewGroup, gSYTextureView);
        return gSYTextureView;
    }

    private void i() {
        this.f58353d = new j(this, this);
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public Bitmap a() {
        Bitmap createBitmap;
        try {
            createBitmap = Bitmap.createBitmap(getSizeW(), getSizeH(), Bitmap.Config.RGB_565);
        } catch (Exception unused) {
            createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.RGB_565);
        }
        return getBitmap(createBitmap);
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void b(e eVar, boolean z4) {
        if (z4) {
            eVar.a(d());
        } else {
            eVar.a(a());
        }
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void c() {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support onRenderResume now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public Bitmap d() {
        return getBitmap(Bitmap.createBitmap(getSizeW(), getSizeH(), Bitmap.Config.ARGB_8888));
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void e(File file, boolean z4, f fVar) {
        a aVar = new a(fVar, file);
        if (z4) {
            aVar.a(d());
        } else {
            aVar.a(a());
        }
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
        j.a aVar = this.f58352c;
        if (aVar != null) {
            return aVar.getCurrentVideoHeight();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getCurrentVideoWidth() {
        j.a aVar = this.f58352c;
        if (aVar != null) {
            return aVar.getCurrentVideoWidth();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public c getIGSYSurfaceListener() {
        return this.f58351b;
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
        j.a aVar = this.f58352c;
        if (aVar != null) {
            return aVar.getVideoSarDen();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getVideoSarNum() {
        j.a aVar = this.f58352c;
        if (aVar != null) {
            return aVar.getVideoSarNum();
        }
        return 0;
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        this.f58353d.e(i4, i5, (int) getRotation());
        setMeasuredDimension(this.f58353d.c(), this.f58353d.b());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
        if (com.papa.gsyvideoplayer.utils.f.i()) {
            SurfaceTexture surfaceTexture2 = this.f58354e;
            if (surfaceTexture2 == null) {
                this.f58354e = surfaceTexture;
                this.f58355f = new Surface(surfaceTexture);
            } else {
                setSurfaceTexture(surfaceTexture2);
            }
            c cVar = this.f58351b;
            if (cVar != null) {
                cVar.onSurfaceAvailable(this.f58355f);
                return;
            }
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        this.f58355f = surface;
        c cVar2 = this.f58351b;
        if (cVar2 != null) {
            cVar2.onSurfaceAvailable(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c cVar = this.f58351b;
        if (cVar != null) {
            cVar.onSurfaceDestroyed(this.f58355f);
        }
        return !com.papa.gsyvideoplayer.utils.f.i() || this.f58354e == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
        c cVar = this.f58351b;
        if (cVar != null) {
            cVar.onSurfaceSizeChanged(this.f58355f, i4, i5);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        c cVar = this.f58351b;
        if (cVar != null) {
            cVar.onSurfaceUpdated(this.f58355f);
        }
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
        setSurfaceTextureListener(this);
        this.f58351b = cVar;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setRenderMode(int i4) {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support setRenderMode now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setRenderTransform(Matrix matrix) {
        setTransform(matrix);
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setVideoParamsListener(j.a aVar) {
        this.f58352c = aVar;
    }

    public GSYTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i();
    }
}
