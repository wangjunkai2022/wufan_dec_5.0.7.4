package com.papa.gsyvideoplayer.render.effect;

import android.opengl.GLSurfaceView;
import com.papa.gsyvideoplayer.render.view.GSYVideoGLView;
/* compiled from: VignetteEffect.java */
/* loaded from: classes5.dex */
public class z implements GSYVideoGLView.c {

    /* renamed from: c  reason: collision with root package name */
    private float f58315c;

    /* renamed from: a  reason: collision with root package name */
    private int f58313a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f58314b = 0;

    /* renamed from: d  reason: collision with root package name */
    private final float f58316d = 0.85f;

    public z(float f5) {
        this.f58315c = 0.0f;
        f5 = f5 < 0.0f ? 0.0f : f5;
        this.f58315c = f5 > 1.0f ? 1.0f : f5;
    }

    private void b(GLSurfaceView gLSurfaceView) {
        this.f58313a = gLSurfaceView.getWidth();
        this.f58314b = gLSurfaceView.getHeight();
    }

    @Override // com.papa.gsyvideoplayer.render.view.GSYVideoGLView.c
    public String a(GLSurfaceView gLSurfaceView) {
        b(gLSurfaceView);
        float[] fArr = new float[2];
        int i4 = this.f58313a;
        int i5 = this.f58314b;
        if (i4 > i5) {
            fArr[0] = 1.0f;
            fArr[1] = i5 / i4;
        } else {
            fArr[0] = i4 / i5;
            fArr[1] = 1.0f;
        }
        String[] strArr = {"scale[0] = " + fArr[0] + ";\n", "scale[1] = " + fArr[1] + ";\n"};
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\n float range;\n float inv_max_dist;\n float shade;\n vec2 scale;\nvarying vec2 vTextureCoord;\nvoid main() {\n" + strArr[0] + strArr[1] + ("inv_max_dist = " + (1.0f / (((float) Math.sqrt((fArr[0] * fArr[0]) + (fArr[1] * fArr[1]))) * 0.5f)) + ";\n") + "shade = 0.85;\n" + ("range = " + (1.3f - (((float) Math.sqrt((double) this.f58315c)) * 0.7f)) + ";\n") + "  const float slope = 20.0;\n  vec2 coord = vTextureCoord - vec2(0.5, 0.5);\n  float dist = length(coord * scale);\n  float lumen = shade / (1.0 + exp((dist * inv_max_dist - range) * slope)) + (1.0 - shade);\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = vec4(color.rgb * lumen, color.a);\n}\n";
    }
}
