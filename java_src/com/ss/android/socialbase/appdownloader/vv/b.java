package com.ss.android.socialbase.appdownloader.vv;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes5.dex */
public class b extends vv {
    public b(Context context, com.ss.android.socialbase.downloader.n.vv vvVar, String str) {
        super(context, vvVar, str);
    }

    @Override // com.ss.android.socialbase.appdownloader.vv.o
    public Intent m() {
        Intent intent = new Intent("com.android.filemanager.OPEN_FOLDER");
        intent.putExtra("com.android.filemanager.OPEN_FOLDER", this.f60931p);
        intent.putExtra("com.iqoo.secure", true);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        intent.addFlags(1073741824);
        return intent;
    }
}
