package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.c0;
/* compiled from: UnlockSignatureImpl.java */
/* loaded from: classes7.dex */
class o extends l implements c0 {

    /* renamed from: m  reason: collision with root package name */
    private Class f72297m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Class cls) {
        super(8, org.aspectj.lang.c.f72211l, cls);
        this.f72297m = cls;
    }

    public Class l() {
        if (this.f72297m == null) {
            this.f72297m = v(3);
        }
        return this.f72297m;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        if (this.f72297m == null) {
            this.f72297m = v(3);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unlock(");
        stringBuffer.append(nVar.g(this.f72297m));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(String str) {
        super(str);
    }
}
