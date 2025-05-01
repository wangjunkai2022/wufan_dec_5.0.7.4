package org.aspectj.internal.lang.reflect;

import java.util.StringTokenizer;
import org.aspectj.lang.reflect.a0;
/* compiled from: DeclarePrecedenceImpl.java */
/* loaded from: classes7.dex */
public class f implements org.aspectj.lang.reflect.j {

    /* renamed from: a  reason: collision with root package name */
    private org.aspectj.lang.reflect.c<?> f72146a;

    /* renamed from: b  reason: collision with root package name */
    private a0[] f72147b;

    /* renamed from: c  reason: collision with root package name */
    private String f72148c;

    public f(String str, org.aspectj.lang.reflect.c cVar) {
        this.f72146a = cVar;
        this.f72148c = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str.startsWith("(") ? str.substring(1, str.length() - 1) : str, ",");
        this.f72147b = new a0[stringTokenizer.countTokens()];
        int i4 = 0;
        while (true) {
            a0[] a0VarArr = this.f72147b;
            if (i4 >= a0VarArr.length) {
                return;
            }
            a0VarArr[i4] = new s(stringTokenizer.nextToken().trim());
            i4++;
        }
    }

    @Override // org.aspectj.lang.reflect.j
    public org.aspectj.lang.reflect.c a() {
        return this.f72146a;
    }

    @Override // org.aspectj.lang.reflect.j
    public a0[] b() {
        return this.f72147b;
    }

    public String toString() {
        return "declare precedence : " + this.f72148c;
    }
}
