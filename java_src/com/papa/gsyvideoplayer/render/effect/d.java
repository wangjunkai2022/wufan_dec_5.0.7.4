package com.papa.gsyvideoplayer.render.effect;

import android.opengl.GLSurfaceView;
import com.papa.gsyvideoplayer.render.view.GSYVideoGLView;
/* compiled from: BrightnessEffect.java */
/* loaded from: classes5.dex */
public class d implements GSYVideoGLView.c {

    /* renamed from: a  reason: collision with root package name */
    private float f58283a;

    public d(float f5) {
        f5 = f5 < 0.1f ? 0.1f : f5;
        this.f58283a = f5 > 2.0f ? 2.0f : f5;
    }

    @Override // com.papa.gsyvideoplayer.render.view.GSYVideoGLView.c
    public String a(GLSurfaceView gLSurfaceView) {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nfloat brightness ;\nvarying vec2 vTextureCoord;\nvoid main() {\n  brightness =" + this.f58283a + ";\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = brightness * color;\n}\n";
    }
}
