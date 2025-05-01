package org.aspectj.runtime.reflect;

import com.join.mgps.Util.h0;
import java.lang.reflect.Field;
/* compiled from: FieldSignatureImpl.java */
/* loaded from: classes7.dex */
public class f extends j implements org.aspectj.lang.reflect.l {

    /* renamed from: m  reason: collision with root package name */
    Class f72254m;

    /* renamed from: n  reason: collision with root package name */
    private Field f72255n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i4, String str, Class cls, Class cls2) {
        super(i4, str, cls);
        this.f72254m = cls2;
    }

    @Override // org.aspectj.lang.reflect.l
    public Class getFieldType() {
        if (this.f72254m == null) {
            this.f72254m = v(3);
        }
        return this.f72254m;
    }

    @Override // org.aspectj.lang.reflect.l
    public Field k() {
        if (this.f72255n == null) {
            try {
                this.f72255n = a().getDeclaredField(getName());
            } catch (Exception unused) {
            }
        }
        return this.f72255n;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(e()));
        if (nVar.f72289b) {
            stringBuffer.append(nVar.g(getFieldType()));
        }
        if (nVar.f72289b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(nVar.f(a(), n()));
        stringBuffer.append(h0.f27805a);
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(String str) {
        super(str);
    }
}
