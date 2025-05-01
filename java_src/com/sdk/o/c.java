package com.sdk.o;

import android.net.Uri;
import com.sdk.f.b;
import com.sdk.r.d;
import io.netty.handler.codec.rtsp.RtspHeaders;
import java.util.List;
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static com.sdk.f.b f60080a;

    public static com.sdk.f.b a() {
        if (f60080a == null) {
            b();
        }
        return f60080a;
    }

    public static void a(String str) {
        if (b.b(str).booleanValue() && b.a(f60080a.f60043c).booleanValue()) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("sequenceNumber");
            String queryParameter2 = parse.getQueryParameter("ret_url");
            if (b.b(queryParameter2).booleanValue()) {
                queryParameter = Uri.parse(d.a(queryParameter2)).getQueryParameter(RtspHeaders.Values.SEQ);
            }
            f60080a.f60043c = queryParameter;
        }
    }

    public static void b() {
        f60080a = new com.sdk.f.b();
    }

    public static void b(String str) {
        try {
            List<String> list = f60080a.f60042b.f60045b;
            list.add(str);
            f60080a.f60042b.f60045b = list;
        } catch (Throwable unused) {
        }
    }

    public static void c(String str) {
        try {
            List<String> list = f60080a.f60042b.f60046c;
            list.add(str);
            f60080a.f60042b.f60046c = list;
        } catch (Throwable unused) {
        }
    }

    public static void d(String str) {
        try {
            f60080a.f60042b.f60047d = str;
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, long j4) {
        try {
            a(str);
            List<b.a.C0603a> list = f60080a.f60042b.f60044a;
            b.a.C0603a c0603a = new b.a.C0603a();
            c0603a.f60048a = str;
            c0603a.f60049b = j4;
            list.add(c0603a);
            f60080a.f60042b.f60044a = list;
        } catch (Throwable unused) {
        }
    }
}
