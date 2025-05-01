package com.mob.commons.b;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import com.mob.commons.b.h;
import com.mob.commons.s;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class f extends h {
    public f(Context context) {
        super(context);
    }

    @Override // com.mob.commons.b.h
    protected Intent a() {
        Intent intent = new Intent();
        intent.setAction(s.a("028c]dkdfdlQhJdiBh@dkTe dkdjdldidcdlfkCeEghQd(eedcelWfGdjdddi2cf"));
        intent.setPackage(s.a("014c8dkdfdlJh^di h(dk4eSdkdjdldidc"));
        return intent;
    }

    @Override // com.mob.commons.b.h
    protected h.b a(IBinder iBinder) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        com.mob.commons.n nVar = new com.mob.commons.n();
        nVar.a(countDownLatch);
        long currentTimeMillis = System.currentTimeMillis();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(s.a("042c@dkdfdl$h(di5h]dk eUdkdjdlYcgUdkdgdcfi9fQdjdddi[cf<dldk2d,didcdleeghfdeeflelVf]djdddi,cf"));
            obtain.writeStrongBinder(nVar);
            iBinder.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
            obtain.recycle();
            obtain2.recycle();
        } catch (Throwable unused) {
        }
        NLog mobLog = MobLog.getInstance();
        mobLog.d("hord is null ? " + TextUtils.isEmpty(nVar.a()) + " cost " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        if (TextUtils.isEmpty(nVar.a())) {
            return null;
        }
        h.b bVar = new h.b();
        bVar.f56222a = nVar.a();
        return bVar;
    }
}
