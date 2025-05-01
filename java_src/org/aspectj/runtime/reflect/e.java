package org.aspectj.runtime.reflect;

import com.swift.sandhook.annotation.MethodReflectParams;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.aspectj.lang.c;
import org.aspectj.lang.reflect.c0;
import org.aspectj.lang.reflect.r;
import org.aspectj.lang.reflect.t;
import org.aspectj.lang.reflect.z;
import org.aspectj.runtime.reflect.h;
/* compiled from: Factory.java */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    static Hashtable f72247e;

    /* renamed from: f  reason: collision with root package name */
    private static Object[] f72248f;

    /* renamed from: g  reason: collision with root package name */
    static /* synthetic */ Class f72249g;

    /* renamed from: a  reason: collision with root package name */
    Class f72250a;

    /* renamed from: b  reason: collision with root package name */
    ClassLoader f72251b;

    /* renamed from: c  reason: collision with root package name */
    String f72252c;

    /* renamed from: d  reason: collision with root package name */
    int f72253d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f72247e = hashtable;
        hashtable.put("void", Void.TYPE);
        f72247e.put("boolean", Boolean.TYPE);
        f72247e.put(MethodReflectParams.BYTE, Byte.TYPE);
        f72247e.put(MethodReflectParams.CHAR, Character.TYPE);
        f72247e.put(MethodReflectParams.SHORT, Short.TYPE);
        f72247e.put(MethodReflectParams.INT, Integer.TYPE);
        f72247e.put(MethodReflectParams.LONG, Long.TYPE);
        f72247e.put("float", Float.TYPE);
        f72247e.put(MethodReflectParams.DOUBLE, Double.TYPE);
        f72248f = new Object[0];
    }

    public e(String str, Class cls) {
        this.f72252c = str;
        this.f72250a = cls;
        this.f72251b = cls.getClassLoader();
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e5) {
            throw new NoClassDefFoundError(e5.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class h(String str, ClassLoader classLoader) {
        if (str.equals(WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD)) {
            return null;
        }
        Class cls = (Class) f72247e.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            if (classLoader == null) {
                return Class.forName(str);
            }
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class cls2 = f72249g;
            if (cls2 == null) {
                Class a5 = a("java.lang.ClassNotFoundException");
                f72249g = a5;
                return a5;
            }
            return cls2;
        }
    }

    public static c.b o(Member member) {
        org.aspectj.lang.e dVar;
        String str;
        if (member instanceof Method) {
            Method method = (Method) member;
            dVar = new k(method.getModifiers(), method.getName(), method.getDeclaringClass(), method.getParameterTypes(), new String[method.getParameterTypes().length], method.getExceptionTypes(), method.getReturnType());
            str = org.aspectj.lang.c.f72200a;
        } else if (member instanceof Constructor) {
            Constructor constructor = (Constructor) member;
            dVar = new d(constructor.getModifiers(), constructor.getDeclaringClass(), constructor.getParameterTypes(), new String[constructor.getParameterTypes().length], constructor.getExceptionTypes());
            str = org.aspectj.lang.c.f72202c;
        } else {
            throw new IllegalArgumentException("member must be either a method or constructor");
        }
        return new h.a(-1, str, dVar, null);
    }

    public static org.aspectj.lang.c v(c.b bVar, Object obj, Object obj2) {
        return new h(bVar, obj, obj2, f72248f);
    }

    public static org.aspectj.lang.c w(c.b bVar, Object obj, Object obj2, Object obj3) {
        return new h(bVar, obj, obj2, new Object[]{obj3});
    }

    public static org.aspectj.lang.c x(c.b bVar, Object obj, Object obj2, Object obj3, Object obj4) {
        return new h(bVar, obj, obj2, new Object[]{obj3, obj4});
    }

    public static org.aspectj.lang.c y(c.b bVar, Object obj, Object obj2, Object[] objArr) {
        return new h(bVar, obj, obj2, objArr);
    }

    public r A(Class cls) {
        i iVar = new i(cls);
        iVar.A(this.f72251b);
        return iVar;
    }

    public r B(String str) {
        i iVar = new i(str);
        iVar.A(this.f72251b);
        return iVar;
    }

    public t C(int i4, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        k kVar = new k(i4, str, cls, clsArr, strArr, clsArr2, cls2);
        kVar.A(this.f72251b);
        return kVar;
    }

    public t D(String str) {
        k kVar = new k(str);
        kVar.A(this.f72251b);
        return kVar;
    }

    public t E(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int parseInt = Integer.parseInt(str, 16);
        Class h4 = h(str3, this.f72251b);
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i4 = 0; i4 < countTokens; i4++) {
            clsArr[i4] = h(stringTokenizer.nextToken(), this.f72251b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i5 = 0; i5 < countTokens2; i5++) {
            strArr[i5] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i6 = 0; i6 < countTokens3; i6++) {
            clsArr2[i6] = h(stringTokenizer3.nextToken(), this.f72251b);
        }
        return new k(parseInt, str2, h4, clsArr, strArr, clsArr2, h(str7, this.f72251b));
    }

    public c.b F(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i4) {
        t E = E(str2, str3, str4, str5, str6, "", str7);
        int i5 = this.f72253d;
        this.f72253d = i5 + 1;
        return new h.b(i5, str, E, K(i4, -1));
    }

    public c.b G(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i4) {
        t E = E(str2, str3, str4, str5, str6, str7, str8);
        int i5 = this.f72253d;
        this.f72253d = i5 + 1;
        return new h.b(i5, str, E, K(i4, -1));
    }

    public c.b H(String str, org.aspectj.lang.e eVar, int i4) {
        int i5 = this.f72253d;
        this.f72253d = i5 + 1;
        return new h.b(i5, str, eVar, K(i4, -1));
    }

    public c.b I(String str, org.aspectj.lang.e eVar, int i4, int i5) {
        int i6 = this.f72253d;
        this.f72253d = i6 + 1;
        return new h.b(i6, str, eVar, K(i4, i5));
    }

    public c.b J(String str, org.aspectj.lang.e eVar, z zVar) {
        int i4 = this.f72253d;
        this.f72253d = i4 + 1;
        return new h.b(i4, str, eVar, zVar);
    }

    public z K(int i4, int i5) {
        return new m(this.f72250a, this.f72252c, i4);
    }

    public c0 L() {
        o oVar = new o(h("Ljava/lang/Object;", this.f72251b));
        oVar.A(this.f72251b);
        return oVar;
    }

    public c0 M(Class cls) {
        o oVar = new o(cls);
        oVar.A(this.f72251b);
        return oVar;
    }

    public c0 N(String str) {
        o oVar = new o(str);
        oVar.A(this.f72251b);
        return oVar;
    }

    public org.aspectj.lang.reflect.b b(int i4, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        a aVar = new a(i4, str, cls, clsArr, strArr, clsArr2, cls2);
        aVar.A(this.f72251b);
        return aVar;
    }

    public org.aspectj.lang.reflect.b c(String str) {
        a aVar = new a(str);
        aVar.A(this.f72251b);
        return aVar;
    }

    public org.aspectj.lang.reflect.b d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int parseInt = Integer.parseInt(str, 16);
        Class h4 = h(str3, this.f72251b);
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i4 = 0; i4 < countTokens; i4++) {
            clsArr[i4] = h(stringTokenizer.nextToken(), this.f72251b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i5 = 0; i5 < countTokens2; i5++) {
            strArr[i5] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i6 = 0; i6 < countTokens3; i6++) {
            clsArr2[i6] = h(stringTokenizer3.nextToken(), this.f72251b);
        }
        a aVar = new a(parseInt, str2, h4, clsArr, strArr, clsArr2, h(str7, this.f72251b));
        aVar.A(this.f72251b);
        return aVar;
    }

    public org.aspectj.lang.reflect.e e(Class cls, Class cls2, String str) {
        b bVar = new b(cls, cls2, str);
        bVar.A(this.f72251b);
        return bVar;
    }

    public org.aspectj.lang.reflect.e f(String str) {
        b bVar = new b(str);
        bVar.A(this.f72251b);
        return bVar;
    }

    public org.aspectj.lang.reflect.e g(String str, String str2, String str3) {
        b bVar = new b(h(str, this.f72251b), h(new StringTokenizer(str2, ":").nextToken(), this.f72251b), new StringTokenizer(str3, ":").nextToken());
        bVar.A(this.f72251b);
        return bVar;
    }

    public org.aspectj.lang.reflect.g i(int i4, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        d dVar = new d(i4, cls, clsArr, strArr, clsArr2);
        dVar.A(this.f72251b);
        return dVar;
    }

    public org.aspectj.lang.reflect.g j(String str) {
        d dVar = new d(str);
        dVar.A(this.f72251b);
        return dVar;
    }

    public org.aspectj.lang.reflect.g k(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt(str, 16);
        Class h4 = h(str2, this.f72251b);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i4 = 0; i4 < countTokens; i4++) {
            clsArr[i4] = h(stringTokenizer.nextToken(), this.f72251b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i5 = 0; i5 < countTokens2; i5++) {
            strArr[i5] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str5, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i6 = 0; i6 < countTokens3; i6++) {
            clsArr2[i6] = h(stringTokenizer3.nextToken(), this.f72251b);
        }
        d dVar = new d(parseInt, h4, clsArr, strArr, clsArr2);
        dVar.A(this.f72251b);
        return dVar;
    }

    public c.a l(String str, org.aspectj.lang.e eVar, int i4) {
        int i5 = this.f72253d;
        this.f72253d = i5 + 1;
        return new h.a(i5, str, eVar, K(i4, -1));
    }

    public c.a m(String str, org.aspectj.lang.e eVar, int i4, int i5) {
        int i6 = this.f72253d;
        this.f72253d = i6 + 1;
        return new h.a(i6, str, eVar, K(i4, i5));
    }

    public c.a n(String str, org.aspectj.lang.e eVar, z zVar) {
        int i4 = this.f72253d;
        this.f72253d = i4 + 1;
        return new h.a(i4, str, eVar, zVar);
    }

    public org.aspectj.lang.reflect.l p(int i4, String str, Class cls, Class cls2) {
        f fVar = new f(i4, str, cls, cls2);
        fVar.A(this.f72251b);
        return fVar;
    }

    public org.aspectj.lang.reflect.l q(String str) {
        f fVar = new f(str);
        fVar.A(this.f72251b);
        return fVar;
    }

    public org.aspectj.lang.reflect.l r(String str, String str2, String str3, String str4) {
        f fVar = new f(Integer.parseInt(str, 16), str2, h(str3, this.f72251b), h(str4, this.f72251b));
        fVar.A(this.f72251b);
        return fVar;
    }

    public org.aspectj.lang.reflect.m s(int i4, Class cls) {
        g gVar = new g(i4, cls);
        gVar.A(this.f72251b);
        return gVar;
    }

    public org.aspectj.lang.reflect.m t(String str) {
        g gVar = new g(str);
        gVar.A(this.f72251b);
        return gVar;
    }

    public org.aspectj.lang.reflect.m u(String str, String str2) {
        g gVar = new g(Integer.parseInt(str, 16), h(str2, this.f72251b));
        gVar.A(this.f72251b);
        return gVar;
    }

    public r z() {
        i iVar = new i(h("Ljava/lang/Object;", this.f72251b));
        iVar.A(this.f72251b);
        return iVar;
    }
}
