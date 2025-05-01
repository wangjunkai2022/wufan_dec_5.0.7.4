package com.beizi.ad.internal.b;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: GetRequest.java */
/* loaded from: classes2.dex */
class d {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f5781d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f5782e = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a  reason: collision with root package name */
    public final String f5783a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5784b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5785c;

    public d(String str) {
        k.a(str);
        long a5 = a(str);
        this.f5784b = Math.max(0L, a5);
        this.f5785c = a5 >= 0;
        this.f5783a = b(str);
    }

    public static d a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                sb.append(readLine);
                sb.append('\n');
            } else {
                return new d(sb.toString());
            }
        }
    }

    private String b(String str) {
        Matcher matcher = f5782e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public String toString() {
        return "GetRequest{rangeOffset=" + this.f5784b + ", partial=" + this.f5785c + ", uri='" + this.f5783a + "'}";
    }

    private long a(String str) {
        Matcher matcher = f5781d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }
}
