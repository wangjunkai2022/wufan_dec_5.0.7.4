package com.papa.gsyvideoplayer.render.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.papa.gsyvideoplayer.render.effect.q;
import com.papa.gsyvideoplayer.utils.d;
import com.papa.gsyvideoplayer.utils.j;
import java.io.File;
import s2.e;
import s2.f;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public class GSYVideoGLView extends GLSurfaceView implements t2.a, com.papa.gsyvideoplayer.render.view.a, j.a {

    /* renamed from: k  reason: collision with root package name */
    private static final String f58359k = GSYVideoGLView.class.getName();

    /* renamed from: l  reason: collision with root package name */
    public static final int f58360l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f58361m = 1;

    /* renamed from: b  reason: collision with root package name */
    private com.papa.gsyvideoplayer.render.glrender.a f58362b;

    /* renamed from: c  reason: collision with root package name */
    private Context f58363c;

    /* renamed from: d  reason: collision with root package name */
    private c f58364d;

    /* renamed from: e  reason: collision with root package name */
    private j.a f58365e;

    /* renamed from: f  reason: collision with root package name */
    private j f58366f;

    /* renamed from: g  reason: collision with root package name */
    private t2.a f58367g;

    /* renamed from: h  reason: collision with root package name */
    private t2.c f58368h;

    /* renamed from: i  reason: collision with root package name */
    private float[] f58369i;

    /* renamed from: j  reason: collision with root package name */
    private int f58370j;

    /* loaded from: classes5.dex */
    class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f58371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f58372b;

        a(f fVar, File file) {
            this.f58371a = fVar;
            this.f58372b = file;
        }

        @Override // s2.e
        public void a(Bitmap bitmap) {
            if (bitmap == null) {
                this.f58371a.a(false, this.f58372b);
                return;
            }
            d.e(bitmap, this.f58372b);
            this.f58371a.a(true, this.f58372b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b implements t2.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f58374a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f58375b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58376c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t2.c f58377d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j.a f58378e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f58379f;

        b(Context context, ViewGroup viewGroup, int i4, t2.c cVar, j.a aVar, int i5) {
            this.f58374a = context;
            this.f58375b = viewGroup;
            this.f58376c = i4;
            this.f58377d = cVar;
            this.f58378e = aVar;
            this.f58379f = i5;
        }

        @Override // t2.b
        public void a(com.papa.gsyvideoplayer.render.glrender.a aVar, String str, int i4, boolean z4) {
            if (z4) {
                GSYVideoGLView.h(this.f58374a, this.f58375b, this.f58376c, this.f58377d, this.f58378e, aVar.h(), aVar.i(), aVar, this.f58379f);
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface c {
        String a(GLSurfaceView gLSurfaceView);
    }

    public GSYVideoGLView(Context context) {
        super(context);
        this.f58364d = new q();
        this.f58370j = 0;
        i(context);
    }

    public static GSYVideoGLView h(Context context, ViewGroup viewGroup, int i4, t2.c cVar, j.a aVar, c cVar2, float[] fArr, com.papa.gsyvideoplayer.render.glrender.a aVar2, int i5) {
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        GSYVideoGLView gSYVideoGLView = new GSYVideoGLView(context);
        if (aVar2 != null) {
            gSYVideoGLView.setCustomRenderer(aVar2);
        }
        gSYVideoGLView.setEffect(cVar2);
        gSYVideoGLView.setVideoParamsListener(aVar);
        gSYVideoGLView.setRenderMode(i5);
        gSYVideoGLView.setIGSYSurfaceListener(cVar);
        gSYVideoGLView.setRotation(i4);
        gSYVideoGLView.j();
        gSYVideoGLView.setGSYVideoGLRenderErrorListener(new b(context, viewGroup, i4, cVar, aVar, i5));
        if (fArr != null && fArr.length == 16) {
            gSYVideoGLView.setMVPMatrix(fArr);
        }
        com.papa.gsyvideoplayer.render.a.a(viewGroup, gSYVideoGLView);
        return gSYVideoGLView;
    }

    private void i(Context context) {
        this.f58363c = context;
        setEGLContextClientVersion(2);
        this.f58362b = new com.papa.gsyvideoplayer.render.glrender.b();
        this.f58366f = new j(this, this);
        this.f58362b.w(this);
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public Bitmap a() {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support initCover now");
        return null;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void b(e eVar, boolean z4) {
        if (eVar != null) {
            setGSYVideoShotListener(eVar, z4);
            m();
        }
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void c() {
        requestLayout();
        onResume();
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public Bitmap d() {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support initCoverHigh now");
        return null;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void e(File file, boolean z4, f fVar) {
        setGSYVideoShotListener(new a(fVar, file), z4);
        m();
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void f() {
        requestLayout();
        l();
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void g() {
        requestLayout();
        onPause();
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getCurrentVideoHeight() {
        j.a aVar = this.f58365e;
        if (aVar != null) {
            return aVar.getCurrentVideoHeight();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getCurrentVideoWidth() {
        j.a aVar = this.f58365e;
        if (aVar != null) {
            return aVar.getCurrentVideoWidth();
        }
        return 0;
    }

    public c getEffect() {
        return this.f58364d;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public t2.c getIGSYSurfaceListener() {
        return this.f58368h;
    }

    public float[] getMVPMatrix() {
        return this.f58369i;
    }

    public int getMode() {
        return this.f58370j;
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public View getRenderView() {
        return this;
    }

    public com.papa.gsyvideoplayer.render.glrender.a getRenderer() {
        return this.f58362b;
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
        j.a aVar = this.f58365e;
        if (aVar != null) {
            return aVar.getVideoSarDen();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.utils.j.a
    public int getVideoSarNum() {
        j.a aVar = this.f58365e;
        if (aVar != null) {
            return aVar.getVideoSarNum();
        }
        return 0;
    }

    public void j() {
        setRenderer(this.f58362b);
    }

    protected void k() {
        j.a aVar = this.f58365e;
        if (aVar == null || this.f58370j != 1) {
            return;
        }
        try {
            int currentVideoWidth = aVar.getCurrentVideoWidth();
            int currentVideoHeight = this.f58365e.getCurrentVideoHeight();
            com.papa.gsyvideoplayer.render.glrender.a aVar2 = this.f58362b;
            if (aVar2 != null) {
                aVar2.q(this.f58366f.c());
                this.f58362b.p(this.f58366f.b());
                this.f58362b.o(currentVideoWidth);
                this.f58362b.n(currentVideoHeight);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void l() {
        com.papa.gsyvideoplayer.render.glrender.a aVar = this.f58362b;
        if (aVar != null) {
            aVar.l();
        }
    }

    public void m() {
        this.f58362b.x();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f58370j == 1) {
            super.onMeasure(i4, i5);
            this.f58366f.e(i4, i5, (int) getRotation());
            k();
            return;
        }
        this.f58366f.e(i4, i5, (int) getRotation());
        setMeasuredDimension(this.f58366f.c(), this.f58366f.b());
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        com.papa.gsyvideoplayer.render.glrender.a aVar = this.f58362b;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // t2.a
    public void onSurfaceAvailable(Surface surface) {
        t2.c cVar = this.f58368h;
        if (cVar != null) {
            cVar.onSurfaceAvailable(surface);
        }
    }

    public void setCustomRenderer(com.papa.gsyvideoplayer.render.glrender.a aVar) {
        this.f58362b = aVar;
        aVar.w(this);
        k();
    }

    public void setEffect(c cVar) {
        if (cVar != null) {
            this.f58364d = cVar;
            this.f58362b.r(cVar);
        }
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setGLEffectFilter(c cVar) {
        setEffect(cVar);
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setGLMVPMatrix(float[] fArr) {
        setMVPMatrix(fArr);
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setGLRenderer(com.papa.gsyvideoplayer.render.glrender.a aVar) {
        setCustomRenderer(aVar);
    }

    public void setGSYVideoGLRenderErrorListener(t2.b bVar) {
        this.f58362b.t(bVar);
    }

    public void setGSYVideoShotListener(e eVar, boolean z4) {
        this.f58362b.u(eVar, z4);
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setIGSYSurfaceListener(t2.c cVar) {
        setOnGSYSurfaceListener(this);
        this.f58368h = cVar;
    }

    public void setMVPMatrix(float[] fArr) {
        if (fArr != null) {
            this.f58369i = fArr;
            this.f58362b.v(fArr);
        }
    }

    public void setMode(int i4) {
        this.f58370j = i4;
    }

    public void setOnGSYSurfaceListener(t2.a aVar) {
        this.f58367g = aVar;
        this.f58362b.s(aVar);
    }

    @Override // android.opengl.GLSurfaceView, com.papa.gsyvideoplayer.render.view.a
    public void setRenderMode(int i4) {
        setMode(i4);
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setRenderTransform(Matrix matrix) {
        com.papa.gsyvideoplayer.utils.c.h(getClass().getSimpleName() + " not support setRenderTransform now");
    }

    @Override // com.papa.gsyvideoplayer.render.view.a
    public void setVideoParamsListener(j.a aVar) {
        this.f58365e = aVar;
    }

    public GSYVideoGLView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58364d = new q();
        this.f58370j = 0;
        i(context);
    }
}
