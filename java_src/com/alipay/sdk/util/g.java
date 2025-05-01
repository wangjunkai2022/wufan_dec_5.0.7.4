package com.alipay.sdk.util;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.alipay.android.app.IAlixPay;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g implements ServiceConnection {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f f4960b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(f fVar) {
        this.f4960b = fVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        Object obj2;
        obj = this.f4960b.f4955c;
        synchronized (obj) {
            this.f4960b.f4954b = IAlixPay.Stub.asInterface(iBinder);
            obj2 = this.f4960b.f4955c;
            obj2.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f4960b.f4954b = null;
    }
}
