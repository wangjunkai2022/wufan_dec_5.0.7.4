package org.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;
/* compiled from: ConstructorSignatureImpl.java */
/* loaded from: classes7.dex */
class d extends c implements org.aspectj.lang.reflect.g {

    /* renamed from: p  reason: collision with root package name */
    private Constructor f72246p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i4, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i4, "<init>", cls, clsArr, strArr, clsArr2);
    }

    @Override // org.aspectj.runtime.reflect.l, org.aspectj.lang.e
    public String getName() {
        return "<init>";
    }

    @Override // org.aspectj.lang.reflect.g
    public Constructor h() {
        if (this.f72246p == null) {
            try {
                this.f72246p = a().getDeclaredConstructor(c());
            } catch (Exception unused) {
            }
        }
        return this.f72246p;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(e()));
        stringBuffer.append(nVar.f(a(), n()));
        nVar.a(stringBuffer, c());
        nVar.b(stringBuffer, d());
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str) {
        super(str);
    }
}
