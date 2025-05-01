package com.ss.android.socialbase.appdownloader.vv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RequiresApi;
@RequiresApi(api = 26)
/* loaded from: classes5.dex */
public class m extends vv {
    public m(Context context) {
        super(context, null, null);
    }

    @Override // com.ss.android.socialbase.appdownloader.vv.o
    public Intent m() {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + this.vv.getPackageName()));
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        intent.addFlags(268435456);
        return intent;
    }
}
