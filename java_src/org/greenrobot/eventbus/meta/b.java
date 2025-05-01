package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.j;
/* compiled from: SimpleSubscriberInfo.java */
/* loaded from: classes7.dex */
public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final e[] f72388d;

    public b(Class cls, boolean z4, e[] eVarArr) {
        super(cls, null, z4);
        this.f72388d = eVarArr;
    }

    @Override // org.greenrobot.eventbus.meta.c
    public synchronized j[] a() {
        j[] jVarArr;
        int length = this.f72388d.length;
        jVarArr = new j[length];
        for (int i4 = 0; i4 < length; i4++) {
            e eVar = this.f72388d[i4];
            jVarArr[i4] = g(eVar.f72389a, eVar.f72391c, eVar.f72390b, eVar.f72392d, eVar.f72393e);
        }
        return jVarArr;
    }
}
