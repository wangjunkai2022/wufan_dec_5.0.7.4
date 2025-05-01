package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class al extends k implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private static ArrayList<ak> f62544b;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<ak> f62545a = null;

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a((Collection) this.f62545a, 0);
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i4) {
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        if (f62544b == null) {
            f62544b = new ArrayList<>();
            f62544b.add(new ak());
        }
        this.f62545a = (ArrayList) iVar.a((i) f62544b, 0, true);
    }
}
