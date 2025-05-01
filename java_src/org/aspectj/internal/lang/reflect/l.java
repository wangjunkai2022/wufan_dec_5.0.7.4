package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.u;
/* compiled from: PerClauseImpl.java */
/* loaded from: classes7.dex */
public class l implements u {

    /* renamed from: a  reason: collision with root package name */
    private final PerClauseKind f72169a;

    /* JADX INFO: Access modifiers changed from: protected */
    public l(PerClauseKind perClauseKind) {
        this.f72169a = perClauseKind;
    }

    @Override // org.aspectj.lang.reflect.u
    public PerClauseKind getKind() {
        return this.f72169a;
    }

    public String toString() {
        return "issingleton()";
    }
}
