package com.join.mgps.zxing.decoding;

import android.app.Activity;
import android.content.DialogInterface;
/* compiled from: FinishListener.java */
/* loaded from: classes5.dex */
public final class f implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Activity f55110b;

    public f(Activity activity) {
        this.f55110b = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        run();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i4) {
        run();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f55110b.finish();
    }
}
