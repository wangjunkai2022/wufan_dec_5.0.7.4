package com.mob.commons.b;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.mob.commons.b.h;
import com.mob.commons.s;
/* loaded from: classes5.dex */
public class j extends h {
    public j(Context context) {
        super(context);
    }

    @Override // com.mob.commons.b.h
    protected Intent a() {
        Intent intent = new Intent();
        intent.setClassName(s.a("023cDdkdfdlgddgdidldc5f:dddi=cf]didcfiGfGdjdddiWcf"), s.a("039c_dkdfdlgddgdidldcOfDdddiGcfCdidcfi2fAdjdddi5cfMdlflJfYdddiKcfVdidcelOfWdjdddi;cf"));
        return intent;
    }

    @Override // com.mob.commons.b.h
    protected long c() {
        return 3000L;
    }

    @Override // com.mob.commons.b.h
    public h.b a(IBinder iBinder) {
        String a5 = s.a("042cJdkdfdlgddgdidldc+fCdddiScf-didcfiYf(djdddiEcf)dleefl f_dddi=cf<didcee+eif<djefKdcf");
        h.b bVar = new h.b();
        bVar.f56222a = a(s.a("004(dk_d=didc"), iBinder, a5, 1, new String[0]);
        return bVar;
    }
}
