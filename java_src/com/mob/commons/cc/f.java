package com.mob.commons.cc;

import android.content.Intent;
import android.content.pm.PackageManager;
/* loaded from: classes5.dex */
public class f implements t<PackageManager> {
    @Override // com.mob.commons.cc.t
    public boolean a(PackageManager packageManager, Class<PackageManager> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if (com.mob.commons.a.l.a("019DefehTgQekfdff fjgfj]fmVgVekeeejUdg(gj").equals(str) && objArr.length == 2 && (objArr[0] instanceof Intent) && (objArr[1] instanceof Integer)) {
            objArr2[0] = packageManager.queryIntentServices((Intent) objArr[0], ((Integer) objArr[1]).intValue());
            return true;
        } else if (com.mob.commons.a.l.a("025Kfk=gjGgf=e*eh[fdi?ff_fjgfjThdelekhmRedNfi:e@fkLg").equals(str) && objArr.length == 1 && (objArr[0] instanceof String)) {
            objArr2[0] = packageManager.getLaunchIntentForPackage((String) objArr[0]);
            return true;
        } else if (com.mob.commons.a.l.a("015<ek g@gjelChSeeNgEge>dj+ejeeejZjRfd").equals(str) && objArr.length == 2 && (objArr[0] instanceof Integer) && (objArr[1] instanceof Integer)) {
            objArr2[0] = packageManager.resolveActivity((Intent) objArr[0], ((Integer) objArr[1]).intValue());
            return true;
        } else {
            return false;
        }
    }
}
