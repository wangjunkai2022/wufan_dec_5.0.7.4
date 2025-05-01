package org.aspectj.runtime.reflect;

import com.join.mgps.Util.h0;
import java.lang.reflect.Method;
/* compiled from: AdviceSignatureImpl.java */
/* loaded from: classes7.dex */
class a extends c implements org.aspectj.lang.reflect.b {

    /* renamed from: p  reason: collision with root package name */
    Class f72239p;

    /* renamed from: q  reason: collision with root package name */
    private Method f72240q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i4, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i4, str, cls, clsArr, strArr, clsArr2);
        this.f72240q = null;
        this.f72239p = cls2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String F(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 36
            int r0 = r4.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto La
            return r4
        La:
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = "$"
            r0.<init>(r4, r1)
        L11:
            boolean r1 = r0.hasMoreTokens()
            if (r1 == 0) goto L34
            java.lang.String r1 = r0.nextToken()
            java.lang.String r2 = "before"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L33
            java.lang.String r2 = "after"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L33
            java.lang.String r2 = "around"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L11
        L33:
            return r1
        L34:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.aspectj.runtime.reflect.a.F(java.lang.String):java.lang.String");
    }

    @Override // org.aspectj.lang.reflect.b
    public Class getReturnType() {
        if (this.f72239p == null) {
            this.f72239p = v(6);
        }
        return this.f72239p;
    }

    @Override // org.aspectj.lang.reflect.b
    public Method j() {
        if (this.f72240q == null) {
            try {
                this.f72240q = a().getDeclaredMethod(getName(), c());
            } catch (Exception unused) {
            }
        }
        return this.f72240q;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (nVar.f72289b) {
            stringBuffer.append(nVar.g(getReturnType()));
        }
        if (nVar.f72289b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(nVar.f(a(), n()));
        stringBuffer.append(h0.f27805a);
        stringBuffer.append(F(getName()));
        nVar.a(stringBuffer, c());
        nVar.b(stringBuffer, d());
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str) {
        super(str);
        this.f72240q = null;
    }
}
