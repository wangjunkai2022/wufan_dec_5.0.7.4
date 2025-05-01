package com.vincent.videocompressor;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: TextureRenderer.java */
@TargetApi(16)
/* loaded from: classes6.dex */
public class f {

    /* renamed from: k  reason: collision with root package name */
    private static final int f64796k = 4;

    /* renamed from: l  reason: collision with root package name */
    private static final int f64797l = 20;

    /* renamed from: m  reason: collision with root package name */
    private static final int f64798m = 0;

    /* renamed from: n  reason: collision with root package name */
    private static final int f64799n = 3;

    /* renamed from: o  reason: collision with root package name */
    private static final float[] f64800o = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p  reason: collision with root package name */
    private static final String f64801p = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: q  reason: collision with root package name */
    private static final String f64802q = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";

    /* renamed from: a  reason: collision with root package name */
    private FloatBuffer f64803a;

    /* renamed from: d  reason: collision with root package name */
    private int f64806d;

    /* renamed from: f  reason: collision with root package name */
    private int f64808f;

    /* renamed from: g  reason: collision with root package name */
    private int f64809g;

    /* renamed from: h  reason: collision with root package name */
    private int f64810h;

    /* renamed from: i  reason: collision with root package name */
    private int f64811i;

    /* renamed from: j  reason: collision with root package name */
    private int f64812j;

    /* renamed from: b  reason: collision with root package name */
    private float[] f64804b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private float[] f64805c = new float[16];

    /* renamed from: e  reason: collision with root package name */
    private int f64807e = -12345;

    public f(int i4) {
        this.f64812j = 0;
        this.f64812j = i4;
        float[] fArr = f64800o;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f64803a = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(this.f64805c, 0);
    }

    private int c(String str, String str2) {
        int f5;
        int f6 = f(35633, str);
        if (f6 == 0 || (f5 = f(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        b("glCreateProgram");
        if (glCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, f6);
        b("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, f5);
        b("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        }
        return glCreateProgram;
    }

    private int f(int i4, String str) {
        int glCreateShader = GLES20.glCreateShader(i4);
        b("glCreateShader type=" + i4);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public void a(String str) {
        GLES20.glDeleteProgram(this.f64806d);
        int c5 = c(f64801p, str);
        this.f64806d = c5;
        if (c5 == 0) {
            throw new RuntimeException("failed creating program");
        }
    }

    public void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new RuntimeException(str + ": glError " + glGetError);
    }

    public void d(SurfaceTexture surfaceTexture, boolean z4) {
        b("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.f64805c);
        if (z4) {
            float[] fArr = this.f64805c;
            fArr[5] = -fArr[5];
            fArr[13] = 1.0f - fArr[13];
        }
        GLES20.glUseProgram(this.f64806d);
        b("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f64807e);
        this.f64803a.position(0);
        GLES20.glVertexAttribPointer(this.f64810h, 3, 5126, false, 20, (Buffer) this.f64803a);
        b("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f64810h);
        b("glEnableVertexAttribArray maPositionHandle");
        this.f64803a.position(3);
        GLES20.glVertexAttribPointer(this.f64811i, 2, 5126, false, 20, (Buffer) this.f64803a);
        b("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f64811i);
        b("glEnableVertexAttribArray maTextureHandle");
        GLES20.glUniformMatrix4fv(this.f64809g, 1, false, this.f64805c, 0);
        GLES20.glUniformMatrix4fv(this.f64808f, 1, false, this.f64804b, 0);
        GLES20.glDrawArrays(5, 0, 4);
        b("glDrawArrays");
        GLES20.glFinish();
    }

    public int e() {
        return this.f64807e;
    }

    public void g() {
        int c5 = c(f64801p, f64802q);
        this.f64806d = c5;
        if (c5 != 0) {
            this.f64810h = GLES20.glGetAttribLocation(c5, "aPosition");
            b("glGetAttribLocation aPosition");
            if (this.f64810h != -1) {
                this.f64811i = GLES20.glGetAttribLocation(this.f64806d, "aTextureCoord");
                b("glGetAttribLocation aTextureCoord");
                if (this.f64811i != -1) {
                    this.f64808f = GLES20.glGetUniformLocation(this.f64806d, "uMVPMatrix");
                    b("glGetUniformLocation uMVPMatrix");
                    if (this.f64808f != -1) {
                        this.f64809g = GLES20.glGetUniformLocation(this.f64806d, "uSTMatrix");
                        b("glGetUniformLocation uSTMatrix");
                        if (this.f64809g != -1) {
                            int[] iArr = new int[1];
                            GLES20.glGenTextures(1, iArr, 0);
                            int i4 = iArr[0];
                            this.f64807e = i4;
                            GLES20.glBindTexture(36197, i4);
                            b("glBindTexture mTextureID");
                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            b("glTexParameter");
                            Matrix.setIdentityM(this.f64804b, 0);
                            int i5 = this.f64812j;
                            if (i5 != 0) {
                                Matrix.rotateM(this.f64804b, 0, i5, 0.0f, 0.0f, 1.0f);
                                return;
                            }
                            return;
                        }
                        throw new RuntimeException("Could not get attrib location for uSTMatrix");
                    }
                    throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                }
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        throw new RuntimeException("failed creating program");
    }
}
