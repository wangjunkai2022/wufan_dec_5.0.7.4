package com.switfpass.pay.activity.zxing.decoding;

import android.app.Activity;
import android.content.DialogInterface;
/* loaded from: classes5.dex */
public final class b implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener, Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Activity f61659b;

    public b(Activity activity) {
        this.f61659b = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f61659b.finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        this.f61659b.finish();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61659b.finish();
    }
}
