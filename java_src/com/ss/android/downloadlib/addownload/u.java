package com.ss.android.downloadlib.addownload;

import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.download.api.download.DownloadModel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public class u {

    /* renamed from: m  reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f60581m;
    private final ConcurrentHashMap<String, String> vv;

    /* loaded from: classes5.dex */
    public static class vv {
        private static u vv = new u();
    }

    private String p(String str) {
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String lastPathSegment = parse.getLastPathSegment();
            if (TextUtils.equals("https", scheme) && lastPathSegment.endsWith(".apk")) {
                this.vv.put(str, lastPathSegment);
                return lastPathSegment;
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static u vv() {
        return vv.vv;
    }

    public void m(String str) {
        Iterator<Map.Entry<String, String>> it2 = this.f60581m.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, String> next = it2.next();
            if (TextUtils.equals(next.getValue(), str)) {
                it2.remove();
                this.vv.remove(next.getKey());
            }
        }
    }

    private u() {
        this.vv = new ConcurrentHashMap<>();
        this.f60581m = new ConcurrentHashMap<>();
    }

    public void vv(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || this.f60581m.containsKey(str2)) {
            return;
        }
        this.f60581m.put(str2, str);
    }

    public String vv(String str) {
        if (TextUtils.isEmpty(str) || this.f60581m.isEmpty() || !this.f60581m.containsKey(str)) {
            return null;
        }
        String p4 = p(str);
        if (this.vv.containsValue(p4)) {
            for (Map.Entry<String, String> entry : this.vv.entrySet()) {
                if (TextUtils.equals(entry.getValue(), p4)) {
                    String str2 = this.f60581m.get(entry.getKey());
                    this.f60581m.put(str, str2);
                    if (!this.vv.containsKey(str)) {
                        this.vv.put(str, p4);
                    }
                    return str2;
                }
            }
        }
        return this.f60581m.get(str);
    }

    public String vv(DownloadModel downloadModel) {
        String p4 = p(downloadModel.getDownloadUrl());
        if (p4 == null || TextUtils.isEmpty(p4)) {
            return null;
        }
        String o4 = com.ss.android.socialbase.downloader.wv.u.o(p4 + downloadModel.getPackageName());
        this.f60581m.put(downloadModel.getDownloadUrl(), o4);
        return o4;
    }
}
