package com.mob.commons.cc;
/* loaded from: classes5.dex */
public class q implements t<p> {
    @Override // com.mob.commons.cc.t
    public boolean a(p pVar, Class<p> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("setHandler".equals(str) && objArr.length == 1 && objArr[0] != null && (objArr[0] instanceof m)) {
            pVar.a((m) objArr[0]);
            return true;
        }
        return false;
    }
}
