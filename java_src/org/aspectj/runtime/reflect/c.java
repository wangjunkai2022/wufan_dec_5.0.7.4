package org.aspectj.runtime.reflect;
/* compiled from: CodeSignatureImpl.java */
/* loaded from: classes7.dex */
abstract class c extends j implements org.aspectj.lang.reflect.f {

    /* renamed from: m  reason: collision with root package name */
    Class[] f72243m;

    /* renamed from: n  reason: collision with root package name */
    String[] f72244n;

    /* renamed from: o  reason: collision with root package name */
    Class[] f72245o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i4, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i4, str, cls);
        this.f72243m = clsArr;
        this.f72244n = strArr;
        this.f72245o = clsArr2;
    }

    @Override // org.aspectj.lang.reflect.f
    public Class[] c() {
        if (this.f72243m == null) {
            this.f72243m = w(3);
        }
        return this.f72243m;
    }

    @Override // org.aspectj.lang.reflect.f
    public Class[] d() {
        if (this.f72245o == null) {
            this.f72245o = w(5);
        }
        return this.f72245o;
    }

    @Override // org.aspectj.lang.reflect.f
    public String[] g() {
        if (this.f72244n == null) {
            this.f72244n = u(4);
        }
        return this.f72244n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str) {
        super(str);
    }
}
