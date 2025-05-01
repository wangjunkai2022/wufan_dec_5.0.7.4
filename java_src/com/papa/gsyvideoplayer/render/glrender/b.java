package com.papa.gsyvideoplayer.render.glrender;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import com.papa.gsyvideoplayer.render.effect.q;
import com.papa.gsyvideoplayer.render.view.GSYVideoGLView;
import com.uc.crashsdk.export.LogType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import s2.e;
/* compiled from: GSYVideoGLViewSimpleRender.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public class b extends a {
    private static final int B = 4;
    private static final int C = 20;
    private static final int D = 0;
    private static final int E = 3;
    protected static final int F = 36197;

    /* renamed from: n  reason: collision with root package name */
    private final float[] f58335n;

    /* renamed from: p  reason: collision with root package name */
    private int f58337p;

    /* renamed from: r  reason: collision with root package name */
    private int f58339r;

    /* renamed from: s  reason: collision with root package name */
    private int f58340s;

    /* renamed from: t  reason: collision with root package name */
    private int f58341t;

    /* renamed from: u  reason: collision with root package name */
    private int f58342u;

    /* renamed from: x  reason: collision with root package name */
    private FloatBuffer f58345x;

    /* renamed from: y  reason: collision with root package name */
    private SurfaceTexture f58346y;

    /* renamed from: z  reason: collision with root package name */
    private e f58347z;

    /* renamed from: o  reason: collision with root package name */
    private final String f58336o = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: q  reason: collision with root package name */
    private int[] f58338q = new int[2];

    /* renamed from: v  reason: collision with root package name */
    private boolean f58343v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f58344w = false;
    private GSYVideoGLView.c A = new q();

    public b() {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f58335n = fArr;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f58345x = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(this.f58321e, 0);
        Matrix.setIdentityM(this.f58320d, 0);
    }

    public int A() {
        return this.f58341t;
    }

    public int B() {
        return this.f58342u;
    }

    public int C() {
        return this.f58339r;
    }

    public int D() {
        return this.f58340s;
    }

    public int E() {
        return this.f58337p;
    }

    public float[] F() {
        return this.f58321e;
    }

    public int[] G() {
        return this.f58338q;
    }

    protected String H() {
        return "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    }

    protected void I() {
        if (this.f58326j) {
            this.f58337p = c(H(), z());
            this.f58326j = false;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(LogType.UNEXP_RESTART);
        GLES20.glUseProgram(this.f58337p);
        a("glUseProgram");
    }

    protected void J() {
        this.f58345x.position(0);
        GLES20.glVertexAttribPointer(this.f58341t, 3, 5126, false, 20, (Buffer) this.f58345x);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f58341t);
        a("glEnableVertexAttribArray maPositionHandle");
        this.f58345x.position(3);
        GLES20.glVertexAttribPointer(this.f58342u, 3, 5126, false, 20, (Buffer) this.f58345x);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f58342u);
        a("glEnableVertexAttribArray maTextureHandle");
        GLES20.glUniformMatrix4fv(this.f58339r, 1, false, this.f58320d, 0);
        GLES20.glUniformMatrix4fv(this.f58340s, 1, false, this.f58321e, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
    }

    protected void K(GL10 gl10) {
        if (this.f58344w) {
            this.f58344w = false;
            if (this.f58347z != null) {
                this.f58347z.a(b(0, 0, this.f58319c.getWidth(), this.f58319c.getHeight(), gl10));
            }
        }
    }

    @Override // com.papa.gsyvideoplayer.render.glrender.a
    public GSYVideoGLView.c h() {
        return this.A;
    }

    @Override // com.papa.gsyvideoplayer.render.glrender.a
    public void l() {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            if (this.f58343v) {
                this.f58346y.updateTexImage();
                this.f58346y.getTransformMatrix(this.f58321e);
                this.f58343v = false;
            }
        }
        I();
        y();
        J();
        K(gl10);
        GLES20.glFinish();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f58343v = true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i4, int i5) {
        GLES20.glViewport(0, 0, i4, i5);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int c5 = c(H(), z());
        this.f58337p = c5;
        if (c5 == 0) {
            return;
        }
        this.f58341t = GLES20.glGetAttribLocation(c5, "aPosition");
        a("glGetAttribLocation aPosition");
        if (this.f58341t != -1) {
            this.f58342u = GLES20.glGetAttribLocation(this.f58337p, "aTextureCoord");
            a("glGetAttribLocation aTextureCoord");
            if (this.f58342u != -1) {
                this.f58339r = GLES20.glGetUniformLocation(this.f58337p, "uMVPMatrix");
                a("glGetUniformLocation uMVPMatrix");
                if (this.f58339r != -1) {
                    this.f58340s = GLES20.glGetUniformLocation(this.f58337p, "uSTMatrix");
                    a("glGetUniformLocation uSTMatrix");
                    if (this.f58340s != -1) {
                        GLES20.glGenTextures(2, this.f58338q, 0);
                        GLES20.glBindTexture(F, this.f58338q[0]);
                        a("glBindTexture mTextureID");
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f58338q[0]);
                        this.f58346y = surfaceTexture;
                        surfaceTexture.setOnFrameAvailableListener(this);
                        m(new Surface(this.f58346y));
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

    @Override // com.papa.gsyvideoplayer.render.glrender.a
    public void r(GSYVideoGLView.c cVar) {
        if (cVar != null) {
            this.A = cVar;
        }
        this.f58326j = true;
        this.f58327k = true;
    }

    @Override // com.papa.gsyvideoplayer.render.glrender.a
    public void u(e eVar, boolean z4) {
        this.f58347z = eVar;
        this.f58317a = z4;
    }

    @Override // com.papa.gsyvideoplayer.render.glrender.a
    public void x() {
        this.f58344w = true;
    }

    protected void y() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(F, this.f58338q[0]);
    }

    protected String z() {
        return this.A.a(this.f58319c);
    }
}
