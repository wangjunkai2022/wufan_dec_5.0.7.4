package com.papa.gsyvideoplayer.render.glrender;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.view.Surface;
import com.papa.gsyvideoplayer.render.view.GSYVideoGLView;
import com.papa.gsyvideoplayer.utils.c;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;
import s2.e;
/* compiled from: GSYVideoGLViewBaseRender.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public abstract class a implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: b  reason: collision with root package name */
    protected t2.a f58318b;

    /* renamed from: c  reason: collision with root package name */
    protected GLSurfaceView f58319c;

    /* renamed from: l  reason: collision with root package name */
    protected t2.b f58328l;

    /* renamed from: a  reason: collision with root package name */
    protected boolean f58317a = false;

    /* renamed from: d  reason: collision with root package name */
    protected float[] f58320d = new float[16];

    /* renamed from: e  reason: collision with root package name */
    protected float[] f58321e = new float[16];

    /* renamed from: f  reason: collision with root package name */
    protected int f58322f = 0;

    /* renamed from: g  reason: collision with root package name */
    protected int f58323g = 0;

    /* renamed from: h  reason: collision with root package name */
    protected int f58324h = 0;

    /* renamed from: i  reason: collision with root package name */
    protected int f58325i = 0;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f58326j = false;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f58327k = false;

    /* renamed from: m  reason: collision with root package name */
    protected Handler f58329m = new Handler();

    /* compiled from: GSYVideoGLViewBaseRender.java */
    /* renamed from: com.papa.gsyvideoplayer.render.glrender.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class RunnableC0588a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Surface f58330b;

        RunnableC0588a(Surface surface) {
            this.f58330b = surface;
        }

        @Override // java.lang.Runnable
        public void run() {
            t2.a aVar = a.this.f58318b;
            if (aVar != null) {
                aVar.onSurfaceAvailable(this.f58330b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GSYVideoGLViewBaseRender.java */
    /* loaded from: classes5.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58332b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58333c;

        b(String str, int i4) {
            this.f58332b = str;
            this.f58333c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            t2.b bVar = aVar.f58328l;
            if (bVar != null) {
                bVar.a(aVar, this.f58332b + ": glError " + this.f58333c, this.f58333c, a.this.f58327k);
            }
            a.this.f58327k = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            c.e(str + ": glError " + glGetError);
            this.f58329m.post(new b(str, glGetError));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bitmap b(int i4, int i5, int i6, int i7, GL10 gl10) {
        int i8 = i6 * i7;
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        try {
            gl10.glReadPixels(i4, i5, i6, i7, 6408, 5121, wrap);
            for (int i9 = 0; i9 < i7; i9++) {
                int i10 = i9 * i6;
                int i11 = ((i7 - i9) - 1) * i6;
                for (int i12 = 0; i12 < i6; i12++) {
                    int i13 = iArr[i10 + i12];
                    iArr2[i11 + i12] = (i13 & (-16711936)) | ((i13 << 16) & 16711680) | ((i13 >> 16) & 255);
                }
            }
            if (this.f58317a) {
                return Bitmap.createBitmap(iArr2, i6, i7, Bitmap.Config.ARGB_8888);
            }
            return Bitmap.createBitmap(iArr2, i6, i7, Bitmap.Config.RGB_565);
        } catch (GLException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(String str, String str2) {
        int k4;
        int k5 = k(35633, str);
        if (k5 == 0 || (k4 = k(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, k5);
            a("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, k4);
            a("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                c.e("Could not link program: ");
                c.e(GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
                return 0;
            }
        }
        return glCreateProgram;
    }

    public int d() {
        return this.f58325i;
    }

    public int e() {
        return this.f58324h;
    }

    public int f() {
        return this.f58323g;
    }

    public int g() {
        return this.f58322f;
    }

    public GSYVideoGLView.c h() {
        return null;
    }

    public float[] i() {
        return this.f58320d;
    }

    public void j() {
        int i4 = this.f58322f;
        if (i4 == 0 || this.f58323g == 0) {
            return;
        }
        Matrix.scaleM(this.f58320d, 0, i4 / this.f58319c.getWidth(), this.f58323g / this.f58319c.getHeight(), 1.0f);
    }

    protected int k(int i4, String str) {
        int glCreateShader = GLES20.glCreateShader(i4);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                c.e("Could not compile shader " + i4 + ":");
                c.e(GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                return 0;
            }
            return glCreateShader;
        }
        return glCreateShader;
    }

    public abstract void l();

    public void m(Surface surface) {
        this.f58329m.post(new RunnableC0588a(surface));
    }

    public void n(int i4) {
        this.f58325i = i4;
    }

    public void o(int i4) {
        this.f58324h = i4;
    }

    public void p(int i4) {
        this.f58323g = i4;
    }

    public void q(int i4) {
        this.f58322f = i4;
    }

    public void r(GSYVideoGLView.c cVar) {
    }

    public void s(t2.a aVar) {
        this.f58318b = aVar;
    }

    public void t(t2.b bVar) {
        this.f58328l = bVar;
    }

    public void u(e eVar, boolean z4) {
    }

    public void v(float[] fArr) {
        this.f58320d = fArr;
    }

    public void w(GLSurfaceView gLSurfaceView) {
        this.f58319c = gLSurfaceView;
    }

    public void x() {
    }
}
