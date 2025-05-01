package com.papa.gsyvideoplayer.render.effect;

import android.opengl.GLSurfaceView;
import com.papa.gsyvideoplayer.render.view.GSYVideoGLView;
/* compiled from: SharpnessEffect.java */
/* loaded from: classes5.dex */
public class w implements GSYVideoGLView.c {

    /* renamed from: a  reason: collision with root package name */
    private int f58308a;

    /* renamed from: b  reason: collision with root package name */
    private int f58309b;

    /* renamed from: c  reason: collision with root package name */
    private float f58310c;

    public w(float f5) {
        this.f58310c = 0.0f;
        f5 = f5 < 0.0f ? 0.0f : f5;
        this.f58310c = f5 > 1.0f ? 1.0f : f5;
    }

    private void b(GLSurfaceView gLSurfaceView) {
        this.f58308a = gLSurfaceView.getWidth();
        this.f58309b = gLSurfaceView.getHeight();
    }

    @Override // com.papa.gsyvideoplayer.render.view.GSYVideoGLView.c
    public String a(GLSurfaceView gLSurfaceView) {
        b(gLSurfaceView);
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\n float scale;\n float stepsizeX;\n float stepsizeY;\nvarying vec2 vTextureCoord;\nvoid main() {\n" + ("stepsizeX = " + (1.0f / this.f58308a) + ";\n") + ("stepsizeY = " + (1.0f / this.f58309b) + ";\n") + ("scale = " + this.f58310c + ";\n") + "  vec3 nbr_color = vec3(0.0, 0.0, 0.0);\n  vec2 coord;\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  coord.x = vTextureCoord.x - 0.5 * stepsizeX;\n  coord.y = vTextureCoord.y - stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  coord.x = vTextureCoord.x - stepsizeX;\n  coord.y = vTextureCoord.y + 0.5 * stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  coord.x = vTextureCoord.x + stepsizeX;\n  coord.y = vTextureCoord.y - 0.5 * stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  coord.x = vTextureCoord.x + stepsizeX;\n  coord.y = vTextureCoord.y + 0.5 * stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  gl_FragColor = vec4(color.rgb - 2.0 * scale * nbr_color, color.a);\n}\n";
    }
}
