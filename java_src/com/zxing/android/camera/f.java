package com.zxing.android.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
/* compiled from: PreviewCallback.java */
/* loaded from: classes6.dex */
final class f implements Camera.PreviewCallback {

    /* renamed from: d  reason: collision with root package name */
    private static final String f68727d = f.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final b f68728a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f68729b;

    /* renamed from: c  reason: collision with root package name */
    private int f68730c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(b bVar) {
        this.f68728a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Handler handler, int i4) {
        this.f68729b = handler;
        this.f68730c = i4;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point d5 = this.f68728a.d();
        Handler handler = this.f68729b;
        if (handler != null) {
            handler.obtainMessage(this.f68730c, d5.x, d5.y, bArr).sendToTarget();
            this.f68729b = null;
        }
    }
}
