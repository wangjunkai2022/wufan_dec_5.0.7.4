package org.aspectj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import org.aspectj.lang.reflect.DeclareAnnotation;
import org.aspectj.lang.reflect.a0;
import org.aspectj.lang.reflect.y;
/* compiled from: DeclareAnnotationImpl.java */
/* loaded from: classes7.dex */
public class c implements DeclareAnnotation {

    /* renamed from: a  reason: collision with root package name */
    private Annotation f72128a;

    /* renamed from: b  reason: collision with root package name */
    private String f72129b;

    /* renamed from: c  reason: collision with root package name */
    private org.aspectj.lang.reflect.c<?> f72130c;

    /* renamed from: d  reason: collision with root package name */
    private DeclareAnnotation.Kind f72131d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f72132e;

    /* renamed from: f  reason: collision with root package name */
    private y f72133f;

    /* compiled from: DeclareAnnotationImpl.java */
    /* loaded from: classes7.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f72134a;

        static {
            int[] iArr = new int[DeclareAnnotation.Kind.values().length];
            f72134a = iArr;
            try {
                iArr[DeclareAnnotation.Kind.Type.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72134a[DeclareAnnotation.Kind.Method.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72134a[DeclareAnnotation.Kind.Field.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72134a[DeclareAnnotation.Kind.Constructor.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(org.aspectj.lang.reflect.c<?> cVar, String str, String str2, Annotation annotation, String str3) {
        this.f72130c = cVar;
        if (str.equals("at_type")) {
            this.f72131d = DeclareAnnotation.Kind.Type;
        } else if (str.equals("at_field")) {
            this.f72131d = DeclareAnnotation.Kind.Field;
        } else if (str.equals("at_method")) {
            this.f72131d = DeclareAnnotation.Kind.Method;
        } else if (!str.equals("at_constructor")) {
            throw new IllegalStateException("Unknown declare annotation kind: " + str);
        } else {
            this.f72131d = DeclareAnnotation.Kind.Constructor;
        }
        if (this.f72131d == DeclareAnnotation.Kind.Type) {
            this.f72132e = new s(str2);
        } else {
            this.f72133f = new p(str2);
        }
        this.f72128a = annotation;
        this.f72129b = str3;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public org.aspectj.lang.reflect.c<?> a() {
        return this.f72130c;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public a0 c() {
        return this.f72132e;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public Annotation d() {
        return this.f72128a;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public String e() {
        return this.f72129b;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public y f() {
        return this.f72133f;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public DeclareAnnotation.Kind getKind() {
        return this.f72131d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("declare @");
        int i4 = a.f72134a[getKind().ordinal()];
        if (i4 == 1) {
            stringBuffer.append("type : ");
            stringBuffer.append(c().a());
        } else if (i4 == 2) {
            stringBuffer.append("method : ");
            stringBuffer.append(f().a());
        } else if (i4 == 3) {
            stringBuffer.append("field : ");
            stringBuffer.append(f().a());
        } else if (i4 == 4) {
            stringBuffer.append("constructor : ");
            stringBuffer.append(f().a());
        }
        stringBuffer.append(" : ");
        stringBuffer.append(e());
        return stringBuffer.toString();
    }
}
