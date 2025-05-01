package com.vuaukou.vco.hykiiuy;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Looper;
import com.kwad.library.solder.lib.ext.PluginError;
/* loaded from: classes8.dex */
final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f64846a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f64847b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, String str) {
        this.f64846a = context;
        this.f64847b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.prepare();
        AlertDialog create = new AlertDialog.Builder(this.f64846a).setMessage(this.f64847b).setCancelable(false).setPositiveButton(a.auu.a.c("qcTagM/p"), new d(this)).create();
        create.getWindow().setType(PluginError.ERROR_UPD_CAPACITY);
        create.show();
        Looper.loop();
    }
}
