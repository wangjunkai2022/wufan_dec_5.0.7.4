package com.switfpass.pay.activity.zxing.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class f implements Camera.PreviewCallback {

    /* renamed from: e  reason: collision with root package name */
    private static final String f61649e = f.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final d f61650a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f61651b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f61652c;

    /* renamed from: d  reason: collision with root package name */
    private int f61653d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(d dVar, boolean z4) {
        this.f61650a = dVar;
        this.f61651b = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Handler handler, int i4) {
        this.f61652c = handler;
        this.f61653d = i4;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        Point f5 = this.f61650a.f();
        if (!this.f61651b) {
            camera.setPreviewCallback(null);
        }
        Handler handler = this.f61652c;
        if (handler != null) {
            handler.obtainMessage(this.f61653d, f5.x, f5.y, bArr).sendToTarget();
            this.f61652c = null;
        }
    }
}
