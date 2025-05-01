package org.aspectj.runtime.reflect;
/* compiled from: CatchClauseSignatureImpl.java */
/* loaded from: classes7.dex */
class b extends l implements org.aspectj.lang.reflect.e {

    /* renamed from: m  reason: collision with root package name */
    Class f72241m;

    /* renamed from: n  reason: collision with root package name */
    String f72242n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Class cls, Class cls2, String str) {
        super(0, "catch", cls);
        this.f72241m = cls2;
        this.f72242n = str;
    }

    @Override // org.aspectj.lang.reflect.e
    public String i() {
        if (this.f72242n == null) {
            this.f72242n = t(4);
        }
        return this.f72242n;
    }

    @Override // org.aspectj.lang.reflect.e
    public Class l() {
        if (this.f72241m == null) {
            this.f72241m = v(3);
        }
        return this.f72241m;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("catch(");
        stringBuffer.append(nVar.g(l()));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str) {
        super(str);
    }
}
