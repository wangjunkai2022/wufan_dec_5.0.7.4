package com.vincent.videocompressor;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
/* compiled from: OutputSurface.java */
@TargetApi(16)
/* loaded from: classes6.dex */
public class d implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: n  reason: collision with root package name */
    private static final int f64779n = 4;

    /* renamed from: o  reason: collision with root package name */
    private static final int f64780o = 12440;

    /* renamed from: a  reason: collision with root package name */
    private EGL10 f64781a;

    /* renamed from: b  reason: collision with root package name */
    private EGLDisplay f64782b;

    /* renamed from: c  reason: collision with root package name */
    private EGLContext f64783c;

    /* renamed from: d  reason: collision with root package name */
    private EGLSurface f64784d;

    /* renamed from: e  reason: collision with root package name */
    private SurfaceTexture f64785e;

    /* renamed from: f  reason: collision with root package name */
    private Surface f64786f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f64787g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f64788h;

    /* renamed from: i  reason: collision with root package name */
    private f f64789i;

    /* renamed from: j  reason: collision with root package name */
    private int f64790j;

    /* renamed from: k  reason: collision with root package name */
    private int f64791k;

    /* renamed from: l  reason: collision with root package name */
    private int f64792l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f64793m;

    public d(int i4, int i5, int i6) {
        this.f64782b = null;
        this.f64783c = null;
        this.f64784d = null;
        this.f64787g = new Object();
        this.f64792l = 0;
        if (i4 > 0 && i5 > 0) {
            this.f64790j = i4;
            this.f64791k = i5;
            this.f64792l = i6;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i4 * i5 * 4);
            this.f64793m = allocateDirect;
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            e(i4, i5);
            h();
            j();
            return;
        }
        throw new IllegalArgumentException();
    }

    private void c(String str) {
        if (this.f64781a.eglGetError() != 12288) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    private void e(int i4, int i5) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f64781a = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f64782b = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (!this.f64781a.eglInitialize(eglGetDisplay, null)) {
                this.f64782b = null;
                throw new RuntimeException("unable to initialize EGL10");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (this.f64781a.eglChooseConfig(this.f64782b, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12339, 1, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                this.f64783c = this.f64781a.eglCreateContext(this.f64782b, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{f64780o, 2, 12344});
                c("eglCreateContext");
                if (this.f64783c != null) {
                    this.f64784d = this.f64781a.eglCreatePbufferSurface(this.f64782b, eGLConfigArr[0], new int[]{12375, i4, 12374, i5, 12344});
                    c("eglCreatePbufferSurface");
                    if (this.f64784d == null) {
                        throw new RuntimeException("surface was null");
                    }
                    return;
                }
                throw new RuntimeException("null context");
            }
            throw new RuntimeException("unable to find RGB888+pbuffer EGL config");
        }
        throw new RuntimeException("unable to get EGL10 display");
    }

    private void j() {
        f fVar = new f(this.f64792l);
        this.f64789i = fVar;
        fVar.g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f64789i.e());
        this.f64785e = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f64786f = new Surface(this.f64785e);
    }

    public void a() {
        synchronized (this.f64787g) {
            while (!this.f64788h) {
                try {
                    this.f64787g.wait(5000L);
                    if (!this.f64788h) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e5) {
                    throw new RuntimeException(e5);
                }
            }
            this.f64788h = false;
        }
        this.f64789i.b("before updateTexImage");
        this.f64785e.updateTexImage();
    }

    public void b(String str) {
        this.f64789i.a(str);
    }

    public void d(boolean z4) {
        this.f64789i.d(this.f64785e, z4);
    }

    public ByteBuffer f() {
        this.f64793m.rewind();
        GLES20.glReadPixels(0, 0, this.f64790j, this.f64791k, 6408, 5121, this.f64793m);
        return this.f64793m;
    }

    public Surface g() {
        return this.f64786f;
    }

    public void h() {
        if (this.f64781a != null) {
            c("before makeCurrent");
            EGL10 egl10 = this.f64781a;
            EGLDisplay eGLDisplay = this.f64782b;
            EGLSurface eGLSurface = this.f64784d;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f64783c)) {
                throw new RuntimeException("eglMakeCurrent failed");
            }
            return;
        }
        throw new RuntimeException("not configured for makeCurrent");
    }

    public void i() {
        EGL10 egl10 = this.f64781a;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.f64783c)) {
                EGL10 egl102 = this.f64781a;
                EGLDisplay eGLDisplay = this.f64782b;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.f64781a.eglDestroySurface(this.f64782b, this.f64784d);
            this.f64781a.eglDestroyContext(this.f64782b, this.f64783c);
        }
        this.f64786f.release();
        this.f64782b = null;
        this.f64783c = null;
        this.f64784d = null;
        this.f64781a = null;
        this.f64789i = null;
        this.f64786f = null;
        this.f64785e = null;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f64787g) {
            if (!this.f64788h) {
                this.f64788h = true;
                this.f64787g.notifyAll();
            } else {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
        }
    }

    public d() {
        this.f64782b = null;
        this.f64783c = null;
        this.f64784d = null;
        this.f64787g = new Object();
        this.f64792l = 0;
        j();
    }
}
