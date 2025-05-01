package com.tencent.bugly.proguard;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class ao extends k implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public String f62582a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f62583b = "";

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f62582a, 0);
        jVar.a(this.f62583b, 1);
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i4) {
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f62582a = iVar.b(0, true);
        this.f62583b = iVar.b(1, true);
    }
}
