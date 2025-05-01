package com.zxing.android.camera;

import android.hardware.Camera;
import android.os.Handler;
/* compiled from: AutoFocusCallback.java */
/* loaded from: classes6.dex */
final class a implements Camera.AutoFocusCallback {

    /* renamed from: c  reason: collision with root package name */
    private static final String f68690c = a.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private static final long f68691d = 1500;

    /* renamed from: a  reason: collision with root package name */
    private Handler f68692a;

    /* renamed from: b  reason: collision with root package name */
    private int f68693b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Handler handler, int i4) {
        this.f68692a = handler;
        this.f68693b = i4;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z4, Camera camera) {
        Handler handler = this.f68692a;
        if (handler != null) {
            this.f68692a.sendMessageDelayed(handler.obtainMessage(this.f68693b, Boolean.valueOf(z4)), f68691d);
            this.f68692a = null;
        }
    }
}
