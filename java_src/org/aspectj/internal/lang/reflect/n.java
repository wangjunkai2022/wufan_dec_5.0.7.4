package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.x;
/* compiled from: PointcutExpressionImpl.java */
/* loaded from: classes7.dex */
public class n implements x {

    /* renamed from: a  reason: collision with root package name */
    private String f72172a;

    public n(String str) {
        this.f72172a = str;
    }

    @Override // org.aspectj.lang.reflect.x
    public String a() {
        return this.f72172a;
    }

    public String toString() {
        return a();
    }
}
