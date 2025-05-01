package org.ppsspp.ppsspp;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* loaded from: classes7.dex */
public class NativeRenderer implements GLSurfaceView.Renderer {

    /* renamed from: c  reason: collision with root package name */
    private static String f72889c = "NativeRenderer";

    /* renamed from: a  reason: collision with root package name */
    private NativeActivity f72890a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f72891b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeRenderer(NativeActivity nativeActivity) {
        this.f72890a = nativeActivity;
    }

    public boolean a() {
        return this.f72891b;
    }

    public native void displayInit();

    public native void displayRender();

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        this.f72891b = true;
        displayRender();
        this.f72891b = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i4, int i5) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        displayInit();
    }
}
