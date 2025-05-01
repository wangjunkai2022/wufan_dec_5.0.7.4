package com.mob.commons.cc;

import java.util.concurrent.CountDownLatch;
/* loaded from: classes5.dex */
public class b implements t<com.mob.commons.n> {
    @Override // com.mob.commons.cc.t
    public boolean a(com.mob.commons.n nVar, Class<com.mob.commons.n> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if (com.mob.commons.m.a("004[chTdgRdj").equals(str)) {
            objArr2[0] = nVar.a();
        } else if (com.mob.commons.m.a("008+dgQdgKdcSbgaf").equals(str) && objArr != null && objArr.length == 1) {
            objArr2[0] = nVar.a((CountDownLatch) objArr[0]);
        } else if (!com.mob.commons.m.a("005=bgdgcj.hg").equals(str)) {
            return false;
        } else {
            objArr2[0] = Boolean.valueOf(nVar.b());
        }
        return true;
    }
}
