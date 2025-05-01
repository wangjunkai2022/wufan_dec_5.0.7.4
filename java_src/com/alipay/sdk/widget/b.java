package com.alipay.sdk.widget;

import com.alipay.sdk.widget.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f4977b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.f4977b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.AlertDialogC0159a alertDialogC0159a;
        a.AlertDialogC0159a alertDialogC0159a2;
        a.AlertDialogC0159a alertDialogC0159a3;
        alertDialogC0159a = this.f4977b.f4973a;
        if (alertDialogC0159a == null) {
            a aVar = this.f4977b;
            a aVar2 = this.f4977b;
            aVar.f4973a = new a.AlertDialogC0159a(aVar2.f4974b);
        }
        try {
            alertDialogC0159a2 = this.f4977b.f4973a;
            if (alertDialogC0159a2.isShowing()) {
                return;
            }
            alertDialogC0159a3 = this.f4977b.f4973a;
            alertDialogC0159a3.show();
        } catch (Exception unused) {
        }
    }
}
