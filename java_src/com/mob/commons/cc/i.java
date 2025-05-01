package com.mob.commons.cc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class i extends BroadcastReceiver implements t<i> {

    /* renamed from: a  reason: collision with root package name */
    private m f56270a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f56270a != null) {
            try {
                ArrayList<Object> arrayList = new ArrayList<>(1);
                arrayList.add(intent);
                this.f56270a.a("onReceive", arrayList);
            } catch (Throwable unused) {
            }
        }
    }

    public void a(m mVar) {
        this.f56270a = mVar;
    }

    @Override // com.mob.commons.cc.t
    public boolean a(i iVar, Class<i> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("setHandler".equals(str) && objArr.length == 1 && objArr[0] != null && (objArr[0] instanceof m)) {
            iVar.a((m) objArr[0]);
            return true;
        }
        return false;
    }
}
