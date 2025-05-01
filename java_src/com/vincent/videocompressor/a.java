package com.vincent.videocompressor;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import java.util.Objects;
/* compiled from: InputSurface.java */
@TargetApi(18)
/* loaded from: classes6.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f64754e = false;

    /* renamed from: f  reason: collision with root package name */
    private static final int f64755f = 12610;

    /* renamed from: g  reason: collision with root package name */
    private static final int f64756g = 4;

    /* renamed from: a  reason: collision with root package name */
    private EGLDisplay f64757a;

    /* renamed from: b  reason: collision with root package name */
    private EGLContext f64758b;

    /* renamed from: c  reason: collision with root package name */
    private EGLSurface f64759c;

    /* renamed from: d  reason: collision with root package name */
    private Surface f64760d;

    public a(Surface surface) {
        Objects.requireNonNull(surface);
        this.f64760d = surface;
        b();
    }

    private void a(String str) {
        boolean z4 = false;
        while (EGL14.eglGetError() != 12288) {
            z4 = true;
        }
        if (z4) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    private void b() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f64757a = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                this.f64757a = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(this.f64757a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, f64755f, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                this.f64758b = EGL14.eglCreateContext(this.f64757a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                a("eglCreateContext");
                if (this.f64758b != null) {
                    this.f64759c = EGL14.eglCreateWindowSurface(this.f64757a, eGLConfigArr[0], this.f64760d, new int[]{12344}, 0);
                    a("eglCreateWindowSurface");
                    if (this.f64759c == null) {
                        throw new RuntimeException("surface was null");
                    }
                    return;
                }
                throw new RuntimeException("null context");
            }
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    public Surface c() {
        return this.f64760d;
    }

    public void d() {
        EGLDisplay eGLDisplay = this.f64757a;
        EGLSurface eGLSurface = this.f64759c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f64758b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void e() {
        if (EGL14.eglGetCurrentContext().equals(this.f64758b)) {
            EGLDisplay eGLDisplay = this.f64757a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.f64757a, this.f64759c);
        EGL14.eglDestroyContext(this.f64757a, this.f64758b);
        this.f64760d.release();
        this.f64757a = null;
        this.f64758b = null;
        this.f64759c = null;
        this.f64760d = null;
    }

    public void f(long j4) {
        EGLExt.eglPresentationTimeANDROID(this.f64757a, this.f64759c, j4);
    }

    public boolean g() {
        return EGL14.eglSwapBuffers(this.f64757a, this.f64759c);
    }
}
