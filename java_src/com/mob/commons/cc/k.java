package com.mob.commons.cc;

import android.database.ContentObserver;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class k extends ContentObserver implements t<k> {

    /* renamed from: a  reason: collision with root package name */
    private m f56271a;

    public k() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z4) {
        if (this.f56271a != null) {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(Boolean.valueOf(z4));
            this.f56271a.a("onChange", arrayList);
        }
    }

    public void a(m mVar) {
        this.f56271a = mVar;
    }

    @Override // com.mob.commons.cc.t
    public boolean a(k kVar, Class<k> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("setHandler".equals(str) && objArr.length == 1 && objArr[0] != null && (objArr[0] instanceof m)) {
            kVar.a((m) objArr[0]);
            return true;
        }
        return false;
    }
}
