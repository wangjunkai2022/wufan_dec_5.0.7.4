package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.y;
/* compiled from: SignaturePatternImpl.java */
/* loaded from: classes7.dex */
public class p implements y {

    /* renamed from: a  reason: collision with root package name */
    private String f72178a;

    public p(String str) {
        this.f72178a = str;
    }

    @Override // org.aspectj.lang.reflect.y
    public String a() {
        return this.f72178a;
    }

    public String toString() {
        return a();
    }
}
