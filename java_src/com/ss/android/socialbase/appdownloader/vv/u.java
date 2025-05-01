package com.ss.android.socialbase.appdownloader.vv;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes5.dex */
public class u extends vv {
    public u(Context context) {
        super(context, null, null);
    }

    @Override // com.ss.android.socialbase.appdownloader.vv.o
    public Intent m() {
        Intent intent = new Intent("android.settings.SECURITY_SETTINGS");
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        return intent;
    }
}
