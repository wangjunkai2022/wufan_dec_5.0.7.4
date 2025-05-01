package com.switfpass.pay.activity.zxing.camera;

import android.hardware.Camera;
import android.os.Handler;
/* loaded from: classes5.dex */
final class c implements Camera.AutoFocusCallback {

    /* renamed from: c  reason: collision with root package name */
    private static final String f61636c = c.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private Handler f61637a;

    /* renamed from: b  reason: collision with root package name */
    private int f61638b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Handler handler, int i4) {
        this.f61637a = handler;
        this.f61638b = i4;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z4, Camera camera) {
        Handler handler = this.f61637a;
        if (handler != null) {
            this.f61637a.sendMessageDelayed(handler.obtainMessage(this.f61638b, Boolean.valueOf(z4)), 1500L);
            this.f61637a = null;
        }
    }
}
