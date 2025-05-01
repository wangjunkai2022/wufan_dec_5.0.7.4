package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.a0;
import org.aspectj.lang.reflect.b0;
/* compiled from: TypePatternBasedPerClauseImpl.java */
/* loaded from: classes7.dex */
public class r extends l implements b0 {

    /* renamed from: b  reason: collision with root package name */
    private a0 f72181b;

    public r(PerClauseKind perClauseKind, String str) {
        super(perClauseKind);
        this.f72181b = new s(str);
    }

    @Override // org.aspectj.lang.reflect.b0
    public a0 c() {
        return this.f72181b;
    }

    @Override // org.aspectj.internal.lang.reflect.l
    public String toString() {
        return "pertypewithin(" + this.f72181b.a() + ")";
    }
}
