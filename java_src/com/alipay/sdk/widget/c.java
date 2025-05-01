package com.alipay.sdk.widget;

import com.alipay.sdk.widget.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f4978b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a aVar) {
        this.f4978b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.AlertDialogC0159a alertDialogC0159a;
        a.AlertDialogC0159a alertDialogC0159a2;
        alertDialogC0159a = this.f4978b.f4973a;
        if (alertDialogC0159a != null) {
            try {
                alertDialogC0159a2 = this.f4978b.f4973a;
                alertDialogC0159a2.dismiss();
            } catch (Exception unused) {
            }
        }
    }
}
