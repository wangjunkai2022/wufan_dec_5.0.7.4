package com.nineoldandroids.util;
/* compiled from: IntProperty.java */
/* loaded from: classes5.dex */
public abstract class b<T> extends c<T, Integer> {
    public b(String str) {
        super(Integer.class, str);
    }

    @Override // com.nineoldandroids.util.c
    /* renamed from: f */
    public final void e(T t4, Integer num) {
        e(t4, Integer.valueOf(num.intValue()));
    }

    public abstract void g(T t4, int i4);
}
