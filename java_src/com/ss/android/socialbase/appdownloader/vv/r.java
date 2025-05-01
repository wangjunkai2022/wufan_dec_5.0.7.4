package com.ss.android.socialbase.appdownloader.vv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import m.a;
/* loaded from: classes5.dex */
public class r extends vv {
    public r(Context context, com.ss.android.socialbase.downloader.n.vv vvVar, String str) {
        super(context, vvVar, str);
    }

    public static String vv(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            stringBuffer.append(entry.getKey());
            stringBuffer.append(SimpleComparison.EQUAL_TO_OPERATION);
            stringBuffer.append(URLEncoder.encode(entry.getValue()));
            stringBuffer.append(a.f71490d);
        }
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.endsWith(a.f71490d) ? stringBuffer2.substring(0, stringBuffer2.length() - 1) : stringBuffer2;
    }

    @Override // com.ss.android.socialbase.appdownloader.vv.o
    public Intent m() {
        String p4 = this.f60930m.p("s");
        String vv = com.ss.android.socialbase.appdownloader.u.p.vv(this.f60930m.p("bb"), p4);
        if (!TextUtils.isEmpty(vv) && vv.split(",").length == 2) {
            String vv2 = com.ss.android.socialbase.appdownloader.u.p.vv(this.f60930m.p("bc"), p4);
            if (!TextUtils.isEmpty(vv2) && vv2.split(",").length == 2) {
                String[] split = vv.split(",");
                String[] split2 = vv2.split(",");
                String vv3 = com.ss.android.socialbase.appdownloader.u.p.vv(this.f60930m.p("bd"), p4);
                String vv4 = com.ss.android.socialbase.appdownloader.u.p.vv(this.f60930m.p("be"), p4);
                String vv5 = com.ss.android.socialbase.appdownloader.u.p.vv(this.f60930m.p("bf"), p4);
                HashMap hashMap = new HashMap();
                hashMap.put(split[0], split[1]);
                hashMap.put(split2[0], split2[1]);
                hashMap.put(vv3, this.f60931p);
                Intent intent = new Intent();
                intent.setAction(vv5);
                intent.setData(Uri.parse(vv4 + vv(hashMap)));
                intent.addFlags(268468224);
                return intent;
            }
        }
        return null;
    }
}
