package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.r;
/* compiled from: LockSignatureImpl.java */
/* loaded from: classes7.dex */
class i extends l implements r {

    /* renamed from: m  reason: collision with root package name */
    private Class f72266m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Class cls) {
        super(8, org.aspectj.lang.c.f72210k, cls);
        this.f72266m = cls;
    }

    public Class l() {
        if (this.f72266m == null) {
            this.f72266m = v(3);
        }
        return this.f72266m;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        if (this.f72266m == null) {
            this.f72266m = v(3);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("lock(");
        stringBuffer.append(nVar.g(this.f72266m));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(String str) {
        super(str);
    }
}
