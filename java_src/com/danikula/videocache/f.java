package com.danikula.videocache;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: GetRequest.java */
/* loaded from: classes2.dex */
class f {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f10060d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f10061e = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a  reason: collision with root package name */
    public final String f10062a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10063b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10064c;

    public f(String str) {
        n.d(str);
        long a5 = a(str);
        this.f10063b = Math.max(0L, a5);
        this.f10064c = a5 >= 0;
        this.f10062a = b(str);
    }

    private long a(String str) {
        Matcher matcher = f10060d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    private String b(String str) {
        Matcher matcher = f10061e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public static f c(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                sb.append(readLine);
                sb.append('\n');
            } else {
                return new f(sb.toString());
            }
        }
    }

    public String toString() {
        return "GetRequest{rangeOffset=" + this.f10063b + ", partial=" + this.f10064c + ", uri='" + this.f10062a + "'}";
    }
}
