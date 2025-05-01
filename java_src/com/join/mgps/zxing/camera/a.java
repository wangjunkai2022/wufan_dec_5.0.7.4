package com.join.mgps.zxing.camera;

import android.hardware.Camera;
import android.os.Handler;
/* compiled from: AutoFocusCallback.java */
/* loaded from: classes5.dex */
final class a implements Camera.AutoFocusCallback {

    /* renamed from: c  reason: collision with root package name */
    private static final String f55026c = a.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private static final long f55027d = 1500;

    /* renamed from: a  reason: collision with root package name */
    private Handler f55028a;

    /* renamed from: b  reason: collision with root package name */
    private int f55029b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Handler handler, int i4) {
        this.f55028a = handler;
        this.f55029b = i4;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z4, Camera camera) {
        Handler handler = this.f55028a;
        if (handler != null) {
            this.f55028a.sendMessageDelayed(handler.obtainMessage(this.f55029b, Boolean.valueOf(z4)), f55027d);
            this.f55028a = null;
        }
    }
}
