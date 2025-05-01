package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.reflect.AdviceKind;
import org.aspectj.lang.reflect.x;
/* compiled from: AdviceImpl.java */
/* loaded from: classes7.dex */
public class a implements org.aspectj.lang.reflect.a {

    /* renamed from: h  reason: collision with root package name */
    private static final String f72107h = "org.aspectj.runtime.internal";

    /* renamed from: a  reason: collision with root package name */
    private final AdviceKind f72108a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f72109b;

    /* renamed from: c  reason: collision with root package name */
    private x f72110c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f72111d;

    /* renamed from: e  reason: collision with root package name */
    private Type[] f72112e;

    /* renamed from: f  reason: collision with root package name */
    private org.aspectj.lang.reflect.c[] f72113f;

    /* renamed from: g  reason: collision with root package name */
    private org.aspectj.lang.reflect.c[] f72114g;

    /* compiled from: AdviceImpl.java */
    /* renamed from: org.aspectj.internal.lang.reflect.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C0794a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f72115a;

        static {
            int[] iArr = new int[AdviceKind.values().length];
            f72115a = iArr;
            try {
                iArr[AdviceKind.AFTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72115a[AdviceKind.AFTER_RETURNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72115a[AdviceKind.AFTER_THROWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72115a[AdviceKind.AROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72115a[AdviceKind.BEFORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Method method, String str, AdviceKind adviceKind) {
        this.f72111d = false;
        this.f72108a = adviceKind;
        this.f72109b = method;
        this.f72110c = new n(str);
    }

    @Override // org.aspectj.lang.reflect.a
    public org.aspectj.lang.reflect.c a() {
        return org.aspectj.lang.reflect.d.a(this.f72109b.getDeclaringClass());
    }

    @Override // org.aspectj.lang.reflect.a
    public x b() {
        return this.f72110c;
    }

    @Override // org.aspectj.lang.reflect.a
    public org.aspectj.lang.reflect.c<?>[] c() {
        if (this.f72113f == null) {
            Class<?>[] parameterTypes = this.f72109b.getParameterTypes();
            int i4 = 0;
            int i5 = 0;
            for (Class<?> cls : parameterTypes) {
                if (cls.getPackage().getName().equals(f72107h)) {
                    i5++;
                }
            }
            this.f72113f = new org.aspectj.lang.reflect.c[parameterTypes.length - i5];
            while (true) {
                org.aspectj.lang.reflect.c[] cVarArr = this.f72113f;
                if (i4 >= cVarArr.length) {
                    break;
                }
                cVarArr[i4] = org.aspectj.lang.reflect.d.a(parameterTypes[i4]);
                i4++;
            }
        }
        return this.f72113f;
    }

    @Override // org.aspectj.lang.reflect.a
    public org.aspectj.lang.reflect.c<?>[] d() {
        if (this.f72114g == null) {
            Class<?>[] exceptionTypes = this.f72109b.getExceptionTypes();
            this.f72114g = new org.aspectj.lang.reflect.c[exceptionTypes.length];
            for (int i4 = 0; i4 < exceptionTypes.length; i4++) {
                this.f72114g[i4] = org.aspectj.lang.reflect.d.a(exceptionTypes[i4]);
            }
        }
        return this.f72114g;
    }

    @Override // org.aspectj.lang.reflect.a
    public Type[] f() {
        if (this.f72112e == null) {
            Type[] genericParameterTypes = this.f72109b.getGenericParameterTypes();
            int i4 = 0;
            int i5 = 0;
            for (Type type : genericParameterTypes) {
                if ((type instanceof Class) && ((Class) type).getPackage().getName().equals(f72107h)) {
                    i5++;
                }
            }
            this.f72112e = new Type[genericParameterTypes.length - i5];
            while (true) {
                Type[] typeArr = this.f72112e;
                if (i4 >= typeArr.length) {
                    break;
                }
                if (genericParameterTypes[i4] instanceof Class) {
                    typeArr[i4] = org.aspectj.lang.reflect.d.a((Class) genericParameterTypes[i4]);
                } else {
                    typeArr[i4] = genericParameterTypes[i4];
                }
                i4++;
            }
        }
        return this.f72112e;
    }

    @Override // org.aspectj.lang.reflect.a
    public AdviceKind getKind() {
        return this.f72108a;
    }

    @Override // org.aspectj.lang.reflect.a
    public String getName() {
        String name = this.f72109b.getName();
        if (name.startsWith("ajc$")) {
            AdviceName adviceName = (AdviceName) this.f72109b.getAnnotation(AdviceName.class);
            return adviceName != null ? adviceName.value() : "";
        }
        return name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
        if (r10 != 3) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.aspectj.internal.lang.reflect.a.toString():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Method method, String str, AdviceKind adviceKind, String str2) {
        this(method, str, adviceKind);
        this.f72111d = true;
    }
}
