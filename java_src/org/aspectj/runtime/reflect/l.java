package org.aspectj.runtime.reflect;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
/* compiled from: SignatureImpl.java */
/* loaded from: classes7.dex */
abstract class l implements org.aspectj.lang.e {

    /* renamed from: h  reason: collision with root package name */
    private static boolean f72269h = true;

    /* renamed from: i  reason: collision with root package name */
    static final char f72270i = '-';

    /* renamed from: j  reason: collision with root package name */
    static String[] f72271j = new String[0];

    /* renamed from: k  reason: collision with root package name */
    static Class[] f72272k = new Class[0];

    /* renamed from: l  reason: collision with root package name */
    static final String f72273l = ":";

    /* renamed from: a  reason: collision with root package name */
    int f72274a;

    /* renamed from: b  reason: collision with root package name */
    String f72275b;

    /* renamed from: c  reason: collision with root package name */
    String f72276c;

    /* renamed from: d  reason: collision with root package name */
    Class f72277d;

    /* renamed from: e  reason: collision with root package name */
    a f72278e;

    /* renamed from: f  reason: collision with root package name */
    private String f72279f;

    /* renamed from: g  reason: collision with root package name */
    ClassLoader f72280g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SignatureImpl.java */
    /* loaded from: classes7.dex */
    public interface a {
        void a(int i4, String str);

        String get(int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SignatureImpl.java */
    /* loaded from: classes7.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private SoftReference f72281a;

        public b() {
            c();
        }

        private String[] b() {
            return (String[]) this.f72281a.get();
        }

        private String[] c() {
            String[] strArr = new String[3];
            this.f72281a = new SoftReference(strArr);
            return strArr;
        }

        @Override // org.aspectj.runtime.reflect.l.a
        public void a(int i4, String str) {
            String[] b5 = b();
            if (b5 == null) {
                b5 = c();
            }
            b5[i4] = str;
        }

        @Override // org.aspectj.runtime.reflect.l.a
        public String get(int i4) {
            String[] b5 = b();
            if (b5 == null) {
                return null;
            }
            return b5[i4];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i4, String str, Class cls) {
        this.f72274a = -1;
        this.f72280g = null;
        this.f72274a = i4;
        this.f72275b = str;
        this.f72277d = cls;
    }

    static void B(boolean z4) {
        f72269h = z4;
    }

    private ClassLoader y() {
        if (this.f72280g == null) {
            this.f72280g = getClass().getClassLoader();
        }
        return this.f72280g;
    }

    static boolean z() {
        return f72269h;
    }

    public void A(ClassLoader classLoader) {
        this.f72280g = classLoader;
    }

    String C(Class cls) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C(cls.getComponentType()));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        }
        return D(cls.getName()).replace('$', external.org.apache.commons.lang3.d.f68897a);
    }

    String D(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String E(org.aspectj.runtime.reflect.n r3) {
        /*
            r2 = this;
            boolean r0 = org.aspectj.runtime.reflect.l.f72269h
            if (r0 == 0) goto L1b
            org.aspectj.runtime.reflect.l$a r0 = r2.f72278e
            if (r0 != 0) goto L14
            org.aspectj.runtime.reflect.l$b r0 = new org.aspectj.runtime.reflect.l$b     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            r2.f72278e = r0     // Catch: java.lang.Throwable -> L10
            goto L1b
        L10:
            r0 = 0
            org.aspectj.runtime.reflect.l.f72269h = r0
            goto L1b
        L14:
            int r1 = r3.f72296i
            java.lang.String r0 = r0.get(r1)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L22
            java.lang.String r0 = r2.r(r3)
        L22:
            boolean r1 = org.aspectj.runtime.reflect.l.f72269h
            if (r1 == 0) goto L2d
            org.aspectj.runtime.reflect.l$a r1 = r2.f72278e
            int r3 = r3.f72296i
            r1.a(r3, r0)
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.aspectj.runtime.reflect.l.E(org.aspectj.runtime.reflect.n):java.lang.String");
    }

    @Override // org.aspectj.lang.e
    public Class a() {
        if (this.f72277d == null) {
            this.f72277d = v(2);
        }
        return this.f72277d;
    }

    @Override // org.aspectj.lang.e
    public final String b() {
        return E(n.f72285j);
    }

    @Override // org.aspectj.lang.e
    public int e() {
        if (this.f72274a == -1) {
            this.f72274a = s(0);
        }
        return this.f72274a;
    }

    @Override // org.aspectj.lang.e
    public final String f() {
        return E(n.f72287l);
    }

    @Override // org.aspectj.lang.e
    public String getName() {
        if (this.f72275b == null) {
            this.f72275b = t(1);
        }
        return this.f72275b;
    }

    @Override // org.aspectj.lang.e
    public String n() {
        if (this.f72276c == null) {
            this.f72276c = a().getName();
        }
        return this.f72276c;
    }

    void o(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(x(clsArr[i4]));
        }
    }

    void p(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(C(clsArr[i4]));
        }
    }

    void q(StringBuffer stringBuffer, Class[] clsArr) {
        o(stringBuffer, clsArr);
    }

    protected abstract String r(n nVar);

    int s(int i4) {
        return Integer.parseInt(t(i4), 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String t(int i4) {
        int indexOf = this.f72279f.indexOf(45);
        int i5 = 0;
        while (true) {
            int i6 = i4 - 1;
            if (i4 <= 0) {
                break;
            }
            i5 = indexOf + 1;
            indexOf = this.f72279f.indexOf(45, i5);
            i4 = i6;
        }
        if (indexOf == -1) {
            indexOf = this.f72279f.length();
        }
        return this.f72279f.substring(i5, indexOf);
    }

    @Override // org.aspectj.lang.e
    public final String toString() {
        return E(n.f72286k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String[] u(int i4) {
        StringTokenizer stringTokenizer = new StringTokenizer(t(i4), f72273l);
        int countTokens = stringTokenizer.countTokens();
        String[] strArr = new String[countTokens];
        for (int i5 = 0; i5 < countTokens; i5++) {
            strArr[i5] = stringTokenizer.nextToken();
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class v(int i4) {
        return e.h(t(i4), y());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class[] w(int i4) {
        StringTokenizer stringTokenizer = new StringTokenizer(t(i4), f72273l);
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i5 = 0; i5 < countTokens; i5++) {
            clsArr[i5] = e.h(stringTokenizer.nextToken(), y());
        }
        return clsArr;
    }

    String x(Class cls) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(x(cls.getComponentType()));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        }
        return cls.getName().replace('$', external.org.apache.commons.lang3.d.f68897a);
    }

    public l(String str) {
        this.f72274a = -1;
        this.f72280g = null;
        this.f72279f = str;
    }
}
