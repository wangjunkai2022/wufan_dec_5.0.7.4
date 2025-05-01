package org.aspectj.runtime.reflect;

import com.join.mgps.Util.h0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
/* compiled from: InitializerSignatureImpl.java */
/* loaded from: classes7.dex */
class g extends c implements org.aspectj.lang.reflect.m {

    /* renamed from: p  reason: collision with root package name */
    private Constructor f72256p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(int r9, java.lang.Class r10) {
        /*
            r8 = this;
            boolean r0 = java.lang.reflect.Modifier.isStatic(r9)
            if (r0 == 0) goto L9
            java.lang.String r0 = "<clinit>"
            goto Lb
        L9:
            java.lang.String r0 = "<init>"
        Lb:
            r3 = r0
            java.lang.Class[] r7 = org.aspectj.runtime.reflect.l.f72272k
            java.lang.String[] r6 = org.aspectj.runtime.reflect.l.f72271j
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.aspectj.runtime.reflect.g.<init>(int, java.lang.Class):void");
    }

    @Override // org.aspectj.runtime.reflect.l, org.aspectj.lang.e
    public String getName() {
        return Modifier.isStatic(e()) ? "<clinit>" : "<init>";
    }

    @Override // org.aspectj.lang.reflect.m
    public Constructor m() {
        if (this.f72256p == null) {
            try {
                this.f72256p = a().getDeclaredConstructor(c());
            } catch (Exception unused) {
            }
        }
        return this.f72256p;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(e()));
        stringBuffer.append(nVar.f(a(), n()));
        stringBuffer.append(h0.f27805a);
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(String str) {
        super(str);
    }
}
