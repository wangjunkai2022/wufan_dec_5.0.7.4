package com.nineoldandroids.util;
/* compiled from: FloatProperty.java */
/* loaded from: classes5.dex */
public abstract class a<T> extends c<T, Float> {
    public a(String str) {
        super(Float.class, str);
    }

    @Override // com.nineoldandroids.util.c
    /* renamed from: f */
    public final void e(T t4, Float f5) {
        g(t4, f5.floatValue());
    }

    public abstract void g(T t4, float f5);
}
