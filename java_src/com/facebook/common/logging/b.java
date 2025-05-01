package com.facebook.common.logging;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: FLogDefaultLoggingDelegate.java */
/* loaded from: classes2.dex */
public class b implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final b f10867c = new b();

    /* renamed from: a  reason: collision with root package name */
    private String f10868a = "unknown";

    /* renamed from: b  reason: collision with root package name */
    private int f10869b = 5;

    private b() {
    }

    public static b k() {
        return f10867c;
    }

    private static String l(String str, Throwable th) {
        return str + '\n' + m(th);
    }

    private static String m(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private String n(String str) {
        if (this.f10868a != null) {
            return this.f10868a + ":" + str;
        }
        return str;
    }

    private void o(int i4, String str, String str2) {
        Log.println(i4, n(str), str2);
    }

    private void p(int i4, String str, String str2, Throwable th) {
        Log.println(i4, n(str), l(str2, th));
    }

    @Override // com.facebook.common.logging.c
    public int a() {
        return this.f10869b;
    }

    @Override // com.facebook.common.logging.c
    public void b(String str, String str2) {
        o(6, str, str2);
    }

    @Override // com.facebook.common.logging.c
    public void c(String str, String str2, Throwable th) {
        p(3, str, str2, th);
    }

    @Override // com.facebook.common.logging.c
    public void d(String str, String str2) {
        o(3, str, str2);
    }

    @Override // com.facebook.common.logging.c
    public void e(String str, String str2) {
        o(6, str, str2);
    }

    @Override // com.facebook.common.logging.c
    public void f(String str, String str2, Throwable th) {
        p(6, str, str2, th);
    }

    @Override // com.facebook.common.logging.c
    public void g(String str, String str2, Throwable th) {
        p(2, str, str2, th);
    }

    @Override // com.facebook.common.logging.c
    public boolean h(int i4) {
        return this.f10869b <= i4;
    }

    @Override // com.facebook.common.logging.c
    public void i(int i4) {
        this.f10869b = i4;
    }

    @Override // com.facebook.common.logging.c
    public void j(String str, String str2, Throwable th) {
        p(4, str, str2, th);
    }

    public void q(String str) {
        this.f10868a = str;
    }

    @Override // com.facebook.common.logging.c
    public void v(String str, String str2) {
        o(2, str, str2);
    }

    @Override // com.facebook.common.logging.c
    public void w(String str, String str2) {
        o(5, str, str2);
    }

    @Override // com.facebook.common.logging.c
    public void d(int i4, String str, String str2) {
        o(i4, str, str2);
    }

    @Override // com.facebook.common.logging.c
    public void e(String str, String str2, Throwable th) {
        p(6, str, str2, th);
    }

    @Override // com.facebook.common.logging.c
    public void i(String str, String str2) {
        o(4, str, str2);
    }

    @Override // com.facebook.common.logging.c
    public void w(String str, String str2, Throwable th) {
        p(5, str, str2, th);
    }
}
