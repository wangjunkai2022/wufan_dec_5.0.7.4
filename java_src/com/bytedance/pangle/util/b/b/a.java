package com.bytedance.pangle.util.b.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<c> f8604a = new ArrayList();

    public final void a(Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f8604a) {
            if (!set.contains(cVar.f8614h)) {
                arrayList.add(cVar);
            }
        }
        this.f8604a = arrayList;
    }
}
