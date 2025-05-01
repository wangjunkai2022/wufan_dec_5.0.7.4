package com.ss.android.downloadlib.m;

import android.os.Build;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.addownload.b;
/* loaded from: classes5.dex */
public class wv {
    public static boolean vv(@NonNull com.ss.android.downloadad.api.vv.vv vvVar) {
        return com.ss.android.socialbase.appdownloader.u.o.o() && Build.VERSION.SDK_INT < 29 && b.jh() != null && b.jh().vv() && com.ss.android.downloadlib.n.o.vv(vvVar).m("invoke_app_form_background_switch") == 1 && vvVar.d();
    }
}
