package com.mob.tools.a;

import android.content.Context;
import android.os.Build;
import com.mob.commons.ab;
import com.mob.commons.m;
import com.xinzhu.overmind.utils.helpers.f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
/* loaded from: classes5.dex */
public class c implements com.mob.tools.a.a {

    /* loaded from: classes5.dex */
    private static class b {

        /* loaded from: classes5.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f56595a;
        }

        /* renamed from: com.mob.tools.a.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0556b {

            /* renamed from: a  reason: collision with root package name */
            private transient ClassLoader f56596a;

            /* renamed from: b  reason: collision with root package name */
            private transient Class<?> f56597b;

            /* renamed from: c  reason: collision with root package name */
            private transient Object f56598c;

            /* renamed from: d  reason: collision with root package name */
            private transient Object f56599d;

            /* renamed from: e  reason: collision with root package name */
            private transient Object[] f56600e;

            /* renamed from: f  reason: collision with root package name */
            private transient String f56601f;

            /* renamed from: g  reason: collision with root package name */
            private transient Class<?> f56602g;

            /* renamed from: h  reason: collision with root package name */
            private transient Object f56603h;

            /* renamed from: i  reason: collision with root package name */
            private transient long f56604i;

            /* renamed from: j  reason: collision with root package name */
            private transient long f56605j;

            /* renamed from: k  reason: collision with root package name */
            private transient long f56606k;

            /* renamed from: l  reason: collision with root package name */
            private transient int f56607l;

            /* renamed from: m  reason: collision with root package name */
            private transient int f56608m;

            /* renamed from: n  reason: collision with root package name */
            private transient int f56609n;

            /* renamed from: o  reason: collision with root package name */
            private transient int f56610o;

            /* renamed from: p  reason: collision with root package name */
            private transient int f56611p;

            /* renamed from: q  reason: collision with root package name */
            private volatile transient int f56612q;

            /* renamed from: r  reason: collision with root package name */
            private transient int f56613r;

            /* renamed from: s  reason: collision with root package name */
            private transient int f56614s;

            /* renamed from: t  reason: collision with root package name */
            private transient int f56615t;

            /* renamed from: u  reason: collision with root package name */
            private transient int f56616u;

            /* renamed from: v  reason: collision with root package name */
            private transient int f56617v;

            /* renamed from: w  reason: collision with root package name */
            private transient int f56618w;

            /* renamed from: x  reason: collision with root package name */
            private transient int f56619x;

            /* renamed from: y  reason: collision with root package name */
            private transient short f56620y;

            /* renamed from: z  reason: collision with root package name */
            private transient short f56621z;
        }

        /* renamed from: com.mob.tools.a.c$b$c  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0557c extends a {

            /* renamed from: a  reason: collision with root package name */
            private C0556b f56622a;

            /* renamed from: b  reason: collision with root package name */
            private C0556b f56623b;

            /* renamed from: c  reason: collision with root package name */
            private Object[] f56624c;

            /* renamed from: d  reason: collision with root package name */
            private long f56625d;

            /* renamed from: e  reason: collision with root package name */
            private int f56626e;
        }

        /* loaded from: classes5.dex */
        public static final class d {

            /* renamed from: a  reason: collision with root package name */
            private final f f56627a = null;

            /* renamed from: b  reason: collision with root package name */
            private final Member f56628b = null;
        }

        /* loaded from: classes5.dex */
        public static class e {
            /* JADX INFO: Access modifiers changed from: private */
            public static Object b(Object... objArr) {
                throw new IllegalStateException("i1");
            }

            private e(Object... objArr) {
                throw new IllegalStateException("i2");
            }
        }

        /* loaded from: classes5.dex */
        public static class f {

            /* renamed from: d  reason: collision with root package name */
            private MethodType f56632d;

            /* renamed from: e  reason: collision with root package name */
            private f f56633e;

            /* renamed from: c  reason: collision with root package name */
            private final MethodType f56631c = null;

            /* renamed from: a  reason: collision with root package name */
            protected final int f56629a = 0;

            /* renamed from: b  reason: collision with root package name */
            protected final long f56630b = 0;
        }

        /* loaded from: classes5.dex */
        public static final class g extends f {

            /* renamed from: c  reason: collision with root package name */
            private final C0556b f56634c = null;
        }

        /* loaded from: classes5.dex */
        public static class h {

            /* renamed from: a  reason: collision with root package name */
            private static int f56635a;

            /* renamed from: b  reason: collision with root package name */
            private static int f56636b;

            /* renamed from: c  reason: collision with root package name */
            private int f56637c;

            /* renamed from: d  reason: collision with root package name */
            private int f56638d;
        }

        /* loaded from: classes5.dex */
        public static class i {
            /* JADX INFO: Access modifiers changed from: private */
            public static void c() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static void d() {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        try {
            b.f fVar = new b.f();
            b.g gVar = new b.g();
            String str = ("" + fVar.f56631c + fVar.f56632d + fVar.f56633e + "00") + "" + gVar.f56634c;
            b.d dVar = new b.d();
            String str2 = str + "" + dVar.f56628b + dVar.f56627a;
            b.C0556b c0556b = new b.C0556b();
            String str3 = str2 + "" + c0556b.f56596a + c0556b.f56597b + c0556b.f56598c + c0556b.f56599d + Arrays.toString(c0556b.f56600e) + c0556b.f56601f + c0556b.f56602g + c0556b.f56603h + c0556b.f56604i + c0556b.f56605j + c0556b.f56606k + c0556b.f56607l + c0556b.f56608m + c0556b.f56609n + c0556b.f56610o + c0556b.f56611p + c0556b.f56612q + c0556b.f56613r + c0556b.f56614s + c0556b.f56615t + c0556b.f56616u + c0556b.f56617v + c0556b.f56618w + c0556b.f56619x + ((int) c0556b.f56620y) + ((int) c0556b.f56621z);
            b.a aVar = new b.a();
            String str4 = str3 + "" + aVar.f56595a;
            b.C0557c c0557c = new b.C0557c();
            String str5 = str4 + "" + c0557c.f56622a + c0557c.f56623b + Arrays.toString(c0557c.f56624c) + c0557c.f56625d + c0557c.f56626e;
            b.h hVar = new b.h();
            String str6 = str5 + "" + hVar.f56637c + hVar.f56638d + b.h.f56635a + b.h.f56636b;
            new b.i();
            b.i.c();
            b.i.d();
            b.e.b(new Object[0]);
            new b.e(new Object[]{str6});
        } catch (Throwable unused) {
        }
    }

    /* loaded from: classes5.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static long f56582a;

        /* renamed from: b  reason: collision with root package name */
        private static long f56583b;

        /* renamed from: c  reason: collision with root package name */
        private static long f56584c;

        /* renamed from: d  reason: collision with root package name */
        private static long f56585d;

        /* renamed from: e  reason: collision with root package name */
        private static long f56586e;

        /* renamed from: f  reason: collision with root package name */
        private static long f56587f;

        /* renamed from: g  reason: collision with root package name */
        private static long f56588g;

        /* renamed from: h  reason: collision with root package name */
        private static long f56589h;

        /* renamed from: i  reason: collision with root package name */
        private static long f56590i;

        /* renamed from: j  reason: collision with root package name */
        private static long f56591j;

        /* renamed from: k  reason: collision with root package name */
        private static long f56592k;

        /* renamed from: l  reason: collision with root package name */
        private static long f56593l;

        /* renamed from: m  reason: collision with root package name */
        private static boolean f56594m;

        private static synchronized void a(int i4) {
            synchronized (a.class) {
                ab.a().a("usf", i4);
            }
        }

        private static synchronized boolean b() {
            synchronized (a.class) {
                int b5 = ab.a().b("usf", -1);
                if (b5 == 1) {
                    d.b("3xu ckFe f");
                    return false;
                } else if (b5 == -1) {
                    a(1);
                    return true;
                } else {
                    return true;
                }
            }
        }

        private static synchronized void c() {
            synchronized (a.class) {
                a(0);
            }
        }

        private static boolean d() {
            try {
                int length = b.f.class.getDeclaredFields().length;
                String str = "" + f.f68332a + length;
                if (length != 5) {
                    d.b("3xu ckHpCz " + str);
                    return false;
                }
                int length2 = b.g.class.getDeclaredFields().length;
                String str2 = str + "|f" + length2;
                if (length2 != 1) {
                    d.b("3xu ckHpCz " + str2);
                    return false;
                }
                int length3 = b.d.class.getDeclaredFields().length;
                String str3 = str2 + "|f" + length3;
                if (length3 != 2) {
                    d.b("3xu ckHpCz " + str3);
                    return false;
                }
                int length4 = b.C0556b.class.getDeclaredFields().length;
                String str4 = str3 + "|f" + length4;
                if (length4 != 26) {
                    d.b("3xu ckHpCz " + str4);
                    return false;
                }
                int length5 = b.a.class.getDeclaredFields().length;
                String str5 = str4 + "|f" + length5;
                if (length5 != 1) {
                    d.b("3xu ckHpCz " + str5);
                    return false;
                }
                int length6 = b.C0557c.class.getDeclaredFields().length;
                String str6 = str5 + "|f" + length6;
                if (length6 != 5) {
                    d.b("3xu ckHpCz " + str6);
                    return false;
                }
                int length7 = b.h.class.getDeclaredFields().length;
                String str7 = str6 + "|f" + length7;
                if (length7 != 4) {
                    d.b("3xu ckHpCz " + str7);
                    return false;
                }
                int length8 = b.i.class.getDeclaredMethods().length;
                String str8 = str7 + "|m" + length8;
                if (length8 < 2) {
                    d.b("3xu ckHpCz " + str8);
                    return false;
                }
                int length9 = b.e.class.getDeclaredMethods().length;
                String str9 = str8 + "|m" + length9;
                if (length9 < 1) {
                    d.b("3xu ckHpCz " + str9);
                    return false;
                }
                return true;
            } catch (Throwable th) {
                d.a(th);
                return false;
            }
        }

        public static synchronized boolean a() throws Throwable {
            Field[] declaredFields;
            long j4;
            synchronized (a.class) {
                d.b("3xu ck");
                if (Build.VERSION.SDK_INT < 29) {
                    return false;
                }
                if (C0558c.a()) {
                    if (!b() || !d()) {
                        return false;
                    }
                    try {
                        declaredFields = b.C0557c.class.getDeclaredFields();
                        int length = declaredFields.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            Field field = declaredFields[i4];
                            if (field.getType() == Long.TYPE) {
                                f56582a = C0558c.a(field);
                                break;
                            }
                            i4++;
                        }
                    } catch (Throwable unused) {
                    }
                    if (a("", f56582a)) {
                        return false;
                    }
                    int length2 = declaredFields.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            break;
                        }
                        Field field2 = declaredFields[i5];
                        if (field2.getType() == b.C0556b.class) {
                            f56583b = C0558c.a(field2);
                            break;
                        }
                        i5++;
                    }
                    if (a("", f56583b)) {
                        return false;
                    }
                    Field[] declaredFields2 = b.f.class.getDeclaredFields();
                    int length3 = declaredFields2.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length3) {
                            break;
                        }
                        Field field3 = declaredFields2[i6];
                        if (field3.getType() == Long.TYPE) {
                            f56584c = C0558c.a(field3);
                            break;
                        }
                        i6++;
                    }
                    if (a("", f56584c)) {
                        return false;
                    }
                    Field[] declaredFields3 = b.g.class.getDeclaredFields();
                    int length4 = declaredFields3.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length4) {
                            break;
                        }
                        Field field4 = declaredFields3[i7];
                        if (field4.getType() == b.C0556b.class) {
                            f56585d = C0558c.a(field4);
                            break;
                        }
                        i7++;
                    }
                    if (a("", f56585d)) {
                        return false;
                    }
                    Field[] declaredFields4 = b.C0556b.class.getDeclaredFields();
                    int length5 = declaredFields4.length;
                    int i8 = 0;
                    int i9 = 1;
                    while (true) {
                        if (i8 >= length5) {
                            break;
                        }
                        Field field5 = declaredFields4[i8];
                        if (field5.getType() == Long.TYPE) {
                            if (i9 == 1) {
                                f56587f = C0558c.a(field5);
                            } else if (i9 == 2) {
                                f56586e = C0558c.a(field5);
                            } else if (i9 == 3) {
                                f56588g = C0558c.a(field5);
                                break;
                            }
                            i9++;
                        }
                        i8++;
                    }
                    if (a("", f56587f)) {
                        return false;
                    }
                    if (a("", f56586e)) {
                        return false;
                    }
                    if (a("", f56588g)) {
                        return false;
                    }
                    Field[] declaredFields5 = b.d.class.getDeclaredFields();
                    int length6 = declaredFields5.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length6) {
                            break;
                        }
                        Field field6 = declaredFields5[i10];
                        if (field6.getType() == Member.class) {
                            f56589h = C0558c.a(field6);
                            break;
                        }
                        i10++;
                    }
                    if (a("", f56589h)) {
                        return false;
                    }
                    Method[] declaredMethods = b.i.class.getDeclaredMethods();
                    int length7 = declaredMethods.length;
                    int i11 = 0;
                    int i12 = 1;
                    long j5 = 0;
                    while (true) {
                        if (i11 >= length7) {
                            j4 = 0;
                            break;
                        }
                        Method method = declaredMethods[i11];
                        if (method.getReturnType() == Void.TYPE) {
                            if (i12 == 1) {
                                method.setAccessible(true);
                                j5 = C0558c.a(MethodHandles.lookup().unreflect(method), f56584c);
                                i12++;
                            } else if (i12 == 2) {
                                method.setAccessible(true);
                                j4 = C0558c.a(MethodHandles.lookup().unreflect(method), f56584c);
                                break;
                            }
                        }
                        i11++;
                    }
                    long j6 = j4 - j5;
                    f56590i = j6;
                    if (a("", j6)) {
                        return false;
                    }
                    long a5 = (j5 - C0558c.a(b.i.class, f56586e)) - f56590i;
                    f56591j = a5;
                    if (a("", a5)) {
                        return false;
                    }
                    Field[] declaredFields6 = b.h.class.getDeclaredFields();
                    int length8 = declaredFields6.length;
                    MethodHandle methodHandle = null;
                    MethodHandle methodHandle2 = null;
                    int i13 = 0;
                    int i14 = 1;
                    while (true) {
                        if (i13 >= length8) {
                            break;
                        }
                        Field field7 = declaredFields6[i13];
                        if (field7.getType() == Integer.TYPE) {
                            if (i14 == 1) {
                                field7.setAccessible(true);
                                methodHandle2 = MethodHandles.lookup().unreflectGetter(field7);
                                i14++;
                            } else if (i14 == 2) {
                                field7.setAccessible(true);
                                methodHandle = MethodHandles.lookup().unreflectGetter(field7);
                                break;
                            }
                        }
                        i13++;
                    }
                    long a6 = C0558c.a(methodHandle2, f56584c);
                    long a7 = C0558c.a(methodHandle, f56584c) - a6;
                    f56592k = a7;
                    if (a("", a7)) {
                        return false;
                    }
                    long a8 = a6 - C0558c.a(b.h.class, f56587f);
                    f56593l = a8;
                    if (a("", a8)) {
                        return false;
                    }
                    c.b();
                    c();
                }
                f56594m = true;
                return true;
            }
        }

        public static synchronized <T> T a(String str, Object... objArr) throws Throwable {
            T t4;
            synchronized (a.class) {
                t4 = (T) a(Class.forName(str), objArr);
            }
            return t4;
        }

        public static synchronized <T> T a(Class<?> cls, Object... objArr) throws Throwable {
            T t4;
            synchronized (a.class) {
                boolean b5 = b();
                if (f56594m && b5) {
                    Method method = null;
                    Method[] declaredMethods = b.e.class.getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        Method method2 = declaredMethods[i4];
                        if (method2.getReturnType() == Object.class) {
                            method = method2;
                            break;
                        }
                        i4++;
                    }
                    if (method != null) {
                        Constructor declaredConstructor = b.e.class.getDeclaredConstructor(Object[].class);
                        declaredConstructor.setAccessible(true);
                        long a5 = C0558c.a(cls, f56586e);
                        if (a5 != 0) {
                            int a6 = C0558c.a(a5);
                            for (int i5 = 0; i5 < a6; i5++) {
                                long j4 = i5;
                                long j5 = f56590i;
                                Long.signum(j4);
                                long j6 = (j4 * j5) + a5 + f56591j;
                                C0558c.a(method, f56582a, j6);
                                if (m.a("006%gcbg c]bg'g[ge").equals(method.getName())) {
                                    C0558c.a(declaredConstructor, f56582a, j6);
                                    C0558c.a(declaredConstructor, f56583b, cls);
                                    if (a(declaredConstructor.getParameterTypes(), objArr)) {
                                        try {
                                            t4 = (T) declaredConstructor.newInstance(objArr);
                                            c();
                                        } catch (Throwable unused) {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        c();
                        throw new NoSuchMethodException("n1");
                    }
                    throw new Throwable("x22");
                }
                throw new Throwable("x1 " + f56594m + "|" + b5);
            }
            return t4;
        }

        public static synchronized <T> T a(String str, Object obj, String str2, Object... objArr) throws Throwable {
            T t4;
            synchronized (a.class) {
                t4 = (T) a(Class.forName(str), obj, str2, objArr);
            }
            return t4;
        }

        public static synchronized <T> T a(Class<?> cls, Object obj, String str, Object... objArr) throws Throwable {
            T t4;
            synchronized (a.class) {
                boolean b5 = b();
                if (f56594m && b5) {
                    Method method = null;
                    Method[] declaredMethods = b.e.class.getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        Method method2 = declaredMethods[i4];
                        if (method2.getReturnType() == Object.class) {
                            method = method2;
                            break;
                        }
                        i4++;
                    }
                    if (method != null) {
                        method.setAccessible(true);
                        long a5 = C0558c.a(cls, f56586e);
                        if (a5 != 0) {
                            int a6 = C0558c.a(a5);
                            for (int i5 = 0; i5 < a6; i5++) {
                                long j4 = i5;
                                long j5 = f56590i;
                                Long.signum(j4);
                                C0558c.a(method, f56582a, (j4 * j5) + a5 + f56591j);
                                if (str.equals(method.getName()) && a(method.getParameterTypes(), objArr)) {
                                    try {
                                        t4 = (T) method.invoke(obj, objArr);
                                        c();
                                    } catch (Throwable unused) {
                                        continue;
                                    }
                                }
                            }
                        }
                        c();
                        throw new NoSuchMethodException("n2");
                    }
                    throw new Throwable("x22");
                }
                throw new Throwable("x2 " + f56594m + "|" + b5);
            }
            return t4;
        }

        public static synchronized <T> T a(String str, String str2, Object obj) throws Throwable {
            T t4;
            synchronized (a.class) {
                t4 = (T) a(Class.forName(str), str2, obj);
            }
            return t4;
        }

        public static synchronized <T> T a(Class<?> cls, String str, Object obj) throws Throwable {
            Field[] declaredFields;
            MethodHandle methodHandle;
            T t4;
            synchronized (a.class) {
                boolean b5 = b();
                if (f56594m && b5) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        for (Field field : b.h.class.getDeclaredFields()) {
                            if (field.getType() == Integer.TYPE && (obj != null || (field.getModifiers() & 8) != 0)) {
                                field.setAccessible(true);
                                methodHandle = MethodHandles.lookup().unreflectGetter(field);
                                break;
                            }
                        }
                        methodHandle = null;
                        if (methodHandle != null) {
                            long a5 = C0558c.a(cls, obj == null ? f56588g : f56587f);
                            if (a5 != 0) {
                                int a6 = C0558c.a(a5);
                                for (int i4 = 0; i4 < a6; i4++) {
                                    long j4 = i4;
                                    long j5 = f56592k;
                                    Long.signum(j4);
                                    C0558c.a(methodHandle, f56584c, (j4 * j5) + a5 + f56593l);
                                    C0558c.a(methodHandle, f56585d, (Object) null);
                                    try {
                                        MethodHandles.Lookup lookup = MethodHandles.lookup();
                                        Method method = lookup.getClass().getMethod(m.a("012'bh:dKbbKdbe0djbgbhOdag"), MethodHandle.class);
                                        method.setAccessible(true);
                                        method.invoke(lookup, methodHandle);
                                    } catch (Throwable unused) {
                                    }
                                    Field field2 = (Field) C0558c.b(C0558c.b(methodHandle, f56585d), f56589h);
                                    if (field2.getName().equals(str)) {
                                        field2.setAccessible(true);
                                        try {
                                            t4 = (T) field2.get(obj);
                                            c();
                                        } catch (Throwable unused2) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            c();
                            throw new NoSuchMethodException("n3");
                        }
                        throw new Throwable("x34");
                    }
                    throw new Throwable("x33");
                }
                throw new Throwable("x3 " + f56594m + "|" + b5);
            }
            return t4;
        }

        private static boolean a(String str, long j4) {
            if (j4 == 0) {
                try {
                    String str2 = str + j4 + "|";
                    d.b("3xu ckZr " + str2.substring(0, str2.length() - 1));
                } catch (Throwable unused) {
                }
                return true;
            }
            return false;
        }

        private static boolean a(Class<?>[] clsArr, Object[] objArr) {
            if ((clsArr != null && clsArr.length != 0) || (objArr != null && objArr.length != 0)) {
                if (clsArr.length != objArr.length) {
                    return false;
                }
                for (int i4 = 0; i4 < clsArr.length; i4++) {
                    if (clsArr[i4].isPrimitive()) {
                        if (clsArr[i4] == Integer.TYPE && !(objArr[i4] instanceof Integer)) {
                            return false;
                        }
                        if (clsArr[i4] == Byte.TYPE && !(objArr[i4] instanceof Byte)) {
                            return false;
                        }
                        if (clsArr[i4] == Character.TYPE && !(objArr[i4] instanceof Character)) {
                            return false;
                        }
                        if (clsArr[i4] == Boolean.TYPE && !(objArr[i4] instanceof Boolean)) {
                            return false;
                        }
                        if (clsArr[i4] == Double.TYPE && !(objArr[i4] instanceof Double)) {
                            return false;
                        }
                        if (clsArr[i4] == Float.TYPE && !(objArr[i4] instanceof Float)) {
                            return false;
                        }
                        if (clsArr[i4] == Long.TYPE && !(objArr[i4] instanceof Long)) {
                            return false;
                        }
                        if (clsArr[i4] == Short.TYPE && !(objArr[i4] instanceof Short)) {
                            return false;
                        }
                    } else if (objArr[i4] != null && !clsArr[i4].isInstance(objArr[i4])) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public boolean a(Context context) {
        try {
            return a.a();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mob.tools.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0558c {

        /* renamed from: a  reason: collision with root package name */
        private static Object f56639a;

        /* renamed from: b  reason: collision with root package name */
        private static Method f56640b;

        public static boolean a() throws Throwable {
            Object invoke = a(Class.forName(m.a("015]dgbeUcBbjbdbgdgRaMbjciQcEdg3b6cdNd")), m.a("009Cch0dg'ciAc!dgJb-cdBd"), new Class[0]).invoke(null, new Object[0]);
            f56639a = invoke;
            return invoke != null;
        }

        public static Object b(Object obj, long j4) throws Throwable {
            return a(f56639a.getClass(), m.a("009_ch%dg'efddfe^dag"), Object.class, Long.TYPE).invoke(f56639a, obj, Long.valueOf(j4));
        }

        public static long a(Object obj, long j4) throws Throwable {
            return ((Long) a(f56639a.getClass(), m.a("007%ch[dgYdcbi,cOch"), Object.class, Long.TYPE).invoke(f56639a, obj, Long.valueOf(j4))).longValue();
        }

        public static void a(Object obj, long j4, long j5) throws Throwable {
            Class<?> cls = f56639a.getClass();
            String a5 = m.a("007h4be3g3dcbiVc<ch");
            Class cls2 = Long.TYPE;
            a(cls, a5, Object.class, cls2, cls2).invoke(f56639a, obj, Long.valueOf(j4), Long.valueOf(j5));
        }

        public static void a(Object obj, long j4, Object obj2) throws Throwable {
            a(f56639a.getClass(), m.a("009hMbe8gLefddfe=dag"), Object.class, Long.TYPE, Object.class).invoke(f56639a, obj, Long.valueOf(j4), obj2);
        }

        public static int a(long j4) throws Throwable {
            return ((Integer) a(f56639a.getClass(), m.a("006-ch$dg]cc cg"), Long.TYPE).invoke(f56639a, Long.valueOf(j4))).intValue();
        }

        public static long a(Field field) throws Throwable {
            return ((Long) a(f56639a.getClass(), m.a("017+biddfeXdagDeabgCde7baefcdcddgXdg"), Field.class).invoke(f56639a, field)).longValue();
        }

        private static Method a(Class cls, String str, Class... clsArr) throws Throwable {
            try {
                if (f56640b == null) {
                    f56640b = Class.class.getDeclaredMethod(m.a("017UchUdgWdjEdaeb@bh5d%bafa<dgfGbiba"), String.class, Class[].class);
                }
                Method method = (Method) f56640b.invoke(cls, str, clsArr);
                method.setAccessible(true);
                return method;
            } catch (Throwable unused) {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            }
        }
    }

    @Override // com.mob.tools.a.a
    public <T> T a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) throws Throwable {
        return (T) a.a(cls, obj, str, objArr);
    }

    @Override // com.mob.tools.a.a
    public <T> T a(String str, Object obj, String str2, Class[] clsArr, Object[] objArr) throws Throwable {
        return (T) a.a(str, obj, str2, objArr);
    }

    @Override // com.mob.tools.a.a
    public <T> T a(String str) throws Throwable {
        return (T) a.a(str, new Object[0]);
    }

    @Override // com.mob.tools.a.a
    public <T> T a(String str, String str2, Object obj) throws Throwable {
        return (T) a.a(str, str2, obj);
    }

    @Override // com.mob.tools.a.a
    public <T> T a(String str, Class[] clsArr, Object[] objArr) throws Throwable {
        return (T) a.a(str, objArr);
    }
}
