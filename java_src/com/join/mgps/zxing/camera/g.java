package com.join.mgps.zxing.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreviewCallback.java */
/* loaded from: classes5.dex */
public final class g implements Camera.PreviewCallback {

    /* renamed from: e  reason: collision with root package name */
    private static final String f55076e = g.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final b f55077a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55078b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f55079c;

    /* renamed from: d  reason: collision with root package name */
    private int f55080d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(b bVar, boolean z4) {
        this.f55077a = bVar;
        this.f55078b = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Handler handler, int i4) {
        this.f55079c = handler;
        this.f55080d = i4;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point c5 = this.f55077a.c();
        if (!this.f55078b) {
            camera.setPreviewCallback(null);
        }
        Handler handler = this.f55079c;
        if (handler != null) {
            handler.obtainMessage(this.f55080d, c5.x, c5.y, bArr).sendToTarget();
            this.f55079c = null;
        }
    }
}
