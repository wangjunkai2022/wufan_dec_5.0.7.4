package com.zxing.android.decoding;

import android.app.Activity;
import android.content.DialogInterface;
/* compiled from: FinishListener.java */
/* loaded from: classes6.dex */
public final class g implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Activity f68761b;

    public g(Activity activity) {
        this.f68761b = activity;
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
        this.f68761b.finish();
    }
}
