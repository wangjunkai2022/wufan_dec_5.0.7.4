package com.sina.weibo.sdk.net;

import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: q  reason: collision with root package name */
    private HashMap<String, String> f60147q = new HashMap<>();

    public final String g() {
        StringBuilder sb = new StringBuilder();
        boolean z4 = true;
        for (String str : this.f60147q.keySet()) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(m.a.f71490d);
            }
            String str2 = this.f60147q.get(str);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    sb.append(URLEncoder.encode(str, "UTF-8"));
                    sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                    sb.append(URLEncoder.encode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    public final void put(String str, String str2) {
        this.f60147q.put(str, str2);
    }
}
