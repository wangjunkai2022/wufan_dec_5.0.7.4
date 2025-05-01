package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class ai extends k implements Cloneable {

    /* renamed from: c  reason: collision with root package name */
    private static ArrayList<String> f62511c;

    /* renamed from: a  reason: collision with root package name */
    private String f62512a = "";

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<String> f62513b = null;

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f62512a, 0);
        ArrayList<String> arrayList = this.f62513b;
        if (arrayList != null) {
            jVar.a((Collection) arrayList, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i4) {
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f62512a = iVar.b(0, true);
        if (f62511c == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f62511c = arrayList;
            arrayList.add("");
        }
        this.f62513b = (ArrayList) iVar.a((i) f62511c, 1, false);
    }
}
