package com.ss.android.socialbase.appdownloader.vv;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes5.dex */
public class qv extends vv {
    public qv(Context context, com.ss.android.socialbase.downloader.n.vv vvVar, String str) {
        super(context, vvVar, str);
    }

    @Override // com.ss.android.socialbase.appdownloader.vv.o
    public Intent m() {
        Intent intent = new Intent(com.ss.android.socialbase.downloader.constants.o.f60949p + ".intent.action.OPEN_FILEMANAGER");
        intent.putExtra("CurrentDir", this.f60931p);
        intent.putExtra("first_position", 1);
        intent.putExtra("CurrentMode", 1);
        intent.putExtra("com.iqoo.secure", true);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        intent.addFlags(1073741824);
        return intent;
    }
}
