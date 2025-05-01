package com.ss.android.socialbase.appdownloader.vv;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes5.dex */
public class k extends vv {
    public k(Context context, com.ss.android.socialbase.downloader.n.vv vvVar, String str) {
        super(context, vvVar, str);
    }

    @Override // com.ss.android.socialbase.appdownloader.vv.o
    public Intent m() {
        Intent intent = new Intent("com.android.filemanager.FILE_OPEN");
        intent.putExtra("FilePathToBeOpenAfterScan", this.f60931p);
        intent.putExtra("com.iqoo.secure", true);
        intent.putExtra("OpenParentAndLocationDestFile", true);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        intent.addFlags(1073741824);
        return intent;
    }
}
