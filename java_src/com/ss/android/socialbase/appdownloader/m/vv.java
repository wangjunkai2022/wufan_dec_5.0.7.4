package com.ss.android.socialbase.appdownloader.m;

import android.os.Build;
import android.text.TextUtils;
import net.lingala.zip4j.util.e;
/* loaded from: classes5.dex */
public class vv {
    public static final String vv;

    static {
        StringBuilder sb = new StringBuilder();
        String str = Build.VERSION.RELEASE;
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(str);
        boolean z6 = !TextUtils.isEmpty(Build.ID);
        z4 = (!"REL".equals(Build.VERSION.CODENAME) || TextUtils.isEmpty(Build.MODEL)) ? false : false;
        sb.append("AppDownloader");
        if (z5) {
            sb.append(e.F0);
            sb.append(str);
        }
        sb.append(" (Linux; U; Android");
        if (z5) {
            sb.append(" ");
            sb.append(str);
        }
        if (z4 || z6) {
            sb.append(";");
            if (z4) {
                sb.append(" ");
                sb.append(Build.MODEL);
            }
            if (z6) {
                sb.append(" Build/");
                sb.append(Build.ID);
            }
        }
        sb.append(")");
        vv = sb.toString();
    }
}
