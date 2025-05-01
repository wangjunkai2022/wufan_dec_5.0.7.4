package com.ss.android.socialbase.appdownloader.vv;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes5.dex */
public class jh extends vv {
    public jh(Context context, com.ss.android.socialbase.downloader.n.vv vvVar, String str) {
        super(context, vvVar, str);
    }

    @Override // com.ss.android.socialbase.appdownloader.vv.o
    public Intent m() {
        String p4 = this.f60930m.p("s");
        String vv = com.ss.android.socialbase.appdownloader.u.p.vv(this.f60930m.p("ag"), p4);
        String vv2 = com.ss.android.socialbase.appdownloader.u.p.vv(this.f60930m.p("ah"), p4);
        String vv3 = com.ss.android.socialbase.appdownloader.u.p.vv(this.f60930m.p("ai"), p4);
        String vv4 = com.ss.android.socialbase.appdownloader.u.p.vv(this.f60930m.p("aj"), p4);
        Intent intent = new Intent();
        intent.putExtra(vv, this.f60931p);
        intent.putExtra(vv2, "*/*");
        intent.putExtra(vv3, true);
        intent.setAction(vv4);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        return intent;
    }
}
