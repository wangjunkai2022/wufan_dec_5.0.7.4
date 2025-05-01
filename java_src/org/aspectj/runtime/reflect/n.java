package org.aspectj.runtime.reflect;

import java.lang.reflect.Modifier;
/* compiled from: StringMaker.java */
/* loaded from: classes7.dex */
class n {

    /* renamed from: j  reason: collision with root package name */
    static n f72285j;

    /* renamed from: k  reason: collision with root package name */
    static n f72286k;

    /* renamed from: l  reason: collision with root package name */
    static n f72287l;

    /* renamed from: a  reason: collision with root package name */
    boolean f72288a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f72289b = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f72290c = false;

    /* renamed from: d  reason: collision with root package name */
    boolean f72291d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f72292e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f72293f = true;

    /* renamed from: g  reason: collision with root package name */
    boolean f72294g = true;

    /* renamed from: h  reason: collision with root package name */
    boolean f72295h = true;

    /* renamed from: i  reason: collision with root package name */
    int f72296i;

    static {
        n nVar = new n();
        f72285j = nVar;
        nVar.f72288a = true;
        nVar.f72289b = false;
        nVar.f72290c = false;
        nVar.f72291d = false;
        nVar.f72292e = true;
        nVar.f72293f = false;
        nVar.f72294g = false;
        nVar.f72296i = 0;
        n nVar2 = new n();
        f72286k = nVar2;
        nVar2.f72288a = true;
        nVar2.f72289b = true;
        nVar2.f72290c = false;
        nVar2.f72291d = false;
        nVar2.f72292e = false;
        f72285j.f72296i = 1;
        n nVar3 = new n();
        f72287l = nVar3;
        nVar3.f72288a = false;
        nVar3.f72289b = true;
        nVar3.f72290c = false;
        nVar3.f72291d = true;
        nVar3.f72292e = false;
        nVar3.f72295h = false;
        nVar3.f72296i = 2;
    }

    n() {
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr == null) {
            return;
        }
        if (!this.f72289b) {
            if (clsArr.length == 0) {
                stringBuffer.append("()");
                return;
            } else {
                stringBuffer.append("(..)");
                return;
            }
        }
        stringBuffer.append("(");
        c(stringBuffer, clsArr);
        stringBuffer.append(")");
    }

    public void b(StringBuffer stringBuffer, Class[] clsArr) {
        if (!this.f72290c || clsArr == null || clsArr.length == 0) {
            return;
        }
        stringBuffer.append(" throws ");
        c(stringBuffer, clsArr);
    }

    public void c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(g(clsArr[i4]));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d(String str) {
        int lastIndexOf = str.lastIndexOf(45);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e(int i4) {
        if (this.f72291d) {
            String modifier = Modifier.toString(i4);
            if (modifier.length() == 0) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(modifier);
            stringBuffer.append(" ");
            return stringBuffer.toString();
        }
        return "";
    }

    public String f(Class cls, String str) {
        return h(cls, str, this.f72292e);
    }

    public String g(Class cls) {
        return h(cls, cls.getName(), this.f72288a);
    }

    String h(Class cls, String str, boolean z4) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            if (z4) {
                return i(str).replace('$', external.org.apache.commons.lang3.d.f68897a);
            }
            return str.replace('$', external.org.apache.commons.lang3.d.f68897a);
        }
        Class<?> componentType = cls.getComponentType();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(componentType, componentType.getName(), z4));
        stringBuffer.append("[]");
        return stringBuffer.toString();
    }

    String i(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }
}
