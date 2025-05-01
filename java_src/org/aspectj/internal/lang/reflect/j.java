package org.aspectj.internal.lang.reflect;

import com.join.mgps.Util.h0;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
/* compiled from: InterTypeFieldDeclarationImpl.java */
/* loaded from: classes7.dex */
public class j extends i implements org.aspectj.lang.reflect.p {

    /* renamed from: e  reason: collision with root package name */
    private String f72158e;

    /* renamed from: f  reason: collision with root package name */
    private org.aspectj.lang.reflect.c<?> f72159f;

    /* renamed from: g  reason: collision with root package name */
    private Type f72160g;

    public j(org.aspectj.lang.reflect.c<?> cVar, String str, int i4, String str2, org.aspectj.lang.reflect.c<?> cVar2, Type type) {
        super(cVar, str, i4);
        this.f72158e = str2;
        this.f72159f = cVar2;
        this.f72160g = type;
    }

    @Override // org.aspectj.lang.reflect.p
    public Type b() {
        return this.f72160g;
    }

    @Override // org.aspectj.lang.reflect.p
    public String getName() {
        return this.f72158e;
    }

    @Override // org.aspectj.lang.reflect.p
    public org.aspectj.lang.reflect.c<?> getType() {
        return this.f72159f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Modifier.toString(e()));
        stringBuffer.append(" ");
        stringBuffer.append(getType().toString());
        stringBuffer.append(" ");
        stringBuffer.append(this.f72155b);
        stringBuffer.append(h0.f27805a);
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }

    public j(org.aspectj.lang.reflect.c<?> cVar, org.aspectj.lang.reflect.c<?> cVar2, Field field) {
        super(cVar, cVar2, field.getModifiers());
        this.f72158e = field.getName();
        this.f72159f = org.aspectj.lang.reflect.d.a(field.getType());
        Type genericType = field.getGenericType();
        if (genericType instanceof Class) {
            this.f72160g = org.aspectj.lang.reflect.d.a((Class) genericType);
        } else {
            this.f72160g = genericType;
        }
    }
}
