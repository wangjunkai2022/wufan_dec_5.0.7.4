package com.vuaukou.vco.hykiiuy;

import android.content.Context;
import android.widget.Toast;
/* loaded from: classes8.dex */
final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f64849a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f64850b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, String str) {
        this.f64849a = context;
        this.f64850b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.f64849a, this.f64850b, 0).show();
    }
}
