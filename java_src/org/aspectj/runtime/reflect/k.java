package org.aspectj.runtime.reflect;

import com.join.mgps.Util.h0;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import org.aspectj.lang.reflect.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MethodSignatureImpl.java */
/* loaded from: classes7.dex */
public class k extends c implements t {

    /* renamed from: p  reason: collision with root package name */
    private Method f72267p;

    /* renamed from: q  reason: collision with root package name */
    Class f72268q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(int i4, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i4, str, cls, clsArr, strArr, clsArr2);
        this.f72268q = cls2;
    }

    private Method F(Class cls, String str, Class[] clsArr, Set set) {
        if (cls == null) {
            return null;
        }
        if (!set.contains(cls)) {
            set.add(cls);
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
        }
        Method F = F(cls.getSuperclass(), str, clsArr, set);
        if (F != null) {
            return F;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces != null) {
            for (Class<?> cls2 : interfaces) {
                Method F2 = F(cls2, str, clsArr, set);
                if (F2 != null) {
                    return F2;
                }
            }
        }
        return null;
    }

    @Override // org.aspectj.lang.reflect.t
    public Method getMethod() {
        if (this.f72267p == null) {
            Class a5 = a();
            try {
                this.f72267p = a5.getDeclaredMethod(getName(), c());
            } catch (NoSuchMethodException unused) {
                HashSet hashSet = new HashSet();
                hashSet.add(a5);
                this.f72267p = F(a5, getName(), c(), hashSet);
            }
        }
        return this.f72267p;
    }

    @Override // org.aspectj.lang.reflect.t
    public Class getReturnType() {
        if (this.f72268q == null) {
            this.f72268q = v(6);
        }
        return this.f72268q;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(e()));
        if (nVar.f72289b) {
            stringBuffer.append(nVar.g(getReturnType()));
        }
        if (nVar.f72289b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(nVar.f(a(), n()));
        stringBuffer.append(h0.f27805a);
        stringBuffer.append(getName());
        nVar.a(stringBuffer, c());
        nVar.b(stringBuffer, d());
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str) {
        super(str);
    }
}
