package com.papa.gsyvideoplayer.render;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.papa.gsyvideoplayer.render.view.GSYSurfaceView;
import com.papa.gsyvideoplayer.render.view.GSYTextureView;
import com.papa.gsyvideoplayer.render.view.GSYVideoGLView;
import com.papa.gsyvideoplayer.utils.f;
import com.papa.gsyvideoplayer.utils.j;
import java.io.File;
import s2.e;
import t2.c;
/* compiled from: GSYRenderView.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    protected com.papa.gsyvideoplayer.render.view.a f58280a;

    public static void a(ViewGroup viewGroup, View view) {
        int g4 = g();
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(g4, g4);
            layoutParams.addRule(13);
            viewGroup.addView(view, layoutParams);
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(g4, g4);
            layoutParams2.gravity = 17;
            viewGroup.addView(view, layoutParams2);
        }
    }

    public static int g() {
        return f.g() != 0 ? -2 : -1;
    }

    public void b(Context context, ViewGroup viewGroup, int i4, c cVar, j.a aVar, GSYVideoGLView.c cVar2, float[] fArr, com.papa.gsyvideoplayer.render.glrender.a aVar2, int i5) {
        if (f.e() == 1) {
            this.f58280a = GSYSurfaceView.h(context, viewGroup, i4, cVar, aVar);
        } else if (f.e() == 2) {
            this.f58280a = GSYVideoGLView.h(context, viewGroup, i4, cVar, aVar, cVar2, fArr, aVar2, i5);
        } else {
            this.f58280a = GSYTextureView.h(context, viewGroup, i4, cVar, aVar);
        }
    }

    public int c() {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            return aVar.getRenderView().getHeight();
        }
        return 0;
    }

    public ViewGroup.LayoutParams d() {
        return this.f58280a.getRenderView().getLayoutParams();
    }

    public float e() {
        return this.f58280a.getRenderView().getRotation();
    }

    public View f() {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            return aVar.getRenderView();
        }
        return null;
    }

    public int h() {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            return aVar.getRenderView().getWidth();
        }
        return 0;
    }

    public Bitmap i() {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public Bitmap j() {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    public void k() {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.getRenderView().invalidate();
        }
    }

    public void l() {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.g();
        }
    }

    public void m() {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void n() {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.f();
        }
    }

    public void o() {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.getRenderView().requestLayout();
        }
    }

    public void p(File file, s2.f fVar) {
        q(file, false, fVar);
    }

    public void q(File file, boolean z4, s2.f fVar) {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.e(file, z4, fVar);
        }
    }

    public void r(GSYVideoGLView.c cVar) {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.setGLEffectFilter(cVar);
        }
    }

    public void s(int i4) {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.setRenderMode(i4);
        }
    }

    public void t(com.papa.gsyvideoplayer.render.glrender.a aVar) {
        com.papa.gsyvideoplayer.render.view.a aVar2 = this.f58280a;
        if (aVar2 != null) {
            aVar2.setGLRenderer(aVar);
        }
    }

    public void u(ViewGroup.LayoutParams layoutParams) {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.getRenderView().setLayoutParams(layoutParams);
        }
    }

    public void v(float[] fArr) {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.setGLMVPMatrix(fArr);
        }
    }

    public void w(float f5) {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.getRenderView().setRotation(f5);
        }
    }

    public void x(Matrix matrix) {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.setRenderTransform(matrix);
        }
    }

    public void y(e eVar) {
        z(eVar, false);
    }

    public void z(e eVar, boolean z4) {
        com.papa.gsyvideoplayer.render.view.a aVar = this.f58280a;
        if (aVar != null) {
            aVar.b(eVar, z4);
        }
    }
}
