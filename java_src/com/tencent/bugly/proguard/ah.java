package com.tencent.bugly.proguard;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class ah extends k implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public String f62506a = "";

    /* renamed from: d  reason: collision with root package name */
    private String f62509d = "";

    /* renamed from: b  reason: collision with root package name */
    public String f62507b = "";

    /* renamed from: e  reason: collision with root package name */
    private String f62510e = "";

    /* renamed from: c  reason: collision with root package name */
    public String f62508c = "";

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f62506a, 0);
        String str = this.f62509d;
        if (str != null) {
            jVar.a(str, 1);
        }
        String str2 = this.f62507b;
        if (str2 != null) {
            jVar.a(str2, 2);
        }
        String str3 = this.f62510e;
        if (str3 != null) {
            jVar.a(str3, 3);
        }
        String str4 = this.f62508c;
        if (str4 != null) {
            jVar.a(str4, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i4) {
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f62506a = iVar.b(0, true);
        this.f62509d = iVar.b(1, false);
        this.f62507b = iVar.b(2, false);
        this.f62510e = iVar.b(3, false);
        this.f62508c = iVar.b(4, false);
    }
}
