package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.z;
/* compiled from: SourceLocationImpl.java */
/* loaded from: classes7.dex */
class m implements z {

    /* renamed from: a  reason: collision with root package name */
    Class f72282a;

    /* renamed from: b  reason: collision with root package name */
    String f72283b;

    /* renamed from: c  reason: collision with root package name */
    int f72284c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Class cls, String str, int i4) {
        this.f72282a = cls;
        this.f72283b = str;
        this.f72284c = i4;
    }

    @Override // org.aspectj.lang.reflect.z
    public int a() {
        return this.f72284c;
    }

    @Override // org.aspectj.lang.reflect.z
    public int b() {
        return -1;
    }

    @Override // org.aspectj.lang.reflect.z
    public Class c() {
        return this.f72282a;
    }

    @Override // org.aspectj.lang.reflect.z
    public String getFileName() {
        return this.f72283b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getFileName());
        stringBuffer.append(":");
        stringBuffer.append(a());
        return stringBuffer.toString();
    }
}
