package com.mob.commons;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.mob.tools.MobLog;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes5.dex */
public class n extends Binder implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private CountDownLatch f56419a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f56420b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f56421c = false;

    /* renamed from: d  reason: collision with root package name */
    private final String f56422d;

    public n() {
        String a5 = s.a("043c7dkdfdl_hYdi,h)dk+eKdkdjdlWcg-dkdgdcfi7fKdjdddi3cfCdldk(d7didcdleeghfdeefledUdgg fj<dc'eh");
        this.f56422d = a5;
        attachInterface(this, a5);
    }

    public String a() {
        return this.f56420b;
    }

    public void a(int i4, long j4, boolean z4, float f5, double d5, String str) {
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public boolean b() {
        return this.f56421c;
    }

    @Override // android.os.Binder, android.os.IBinder
    public String getInterfaceDescriptor() {
        return this.f56422d;
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            parcel.enforceInterface(this.f56422d);
            a(parcel.readInt(), parcel.readLong(), parcel.readInt() > 0, parcel.readFloat(), parcel.readDouble(), parcel.readString());
        } else if (i4 != 2) {
            if (i4 != 1598968902) {
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            parcel2.writeString(this.f56422d);
            return true;
        } else {
            parcel.enforceInterface(this.f56422d);
            a(parcel.readInt(), parcel.readInt() > 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
        }
        parcel2.writeNoException();
        return true;
    }

    public n a(CountDownLatch countDownLatch) {
        this.f56419a = countDownLatch;
        return this;
    }

    public void a(int i4, Bundle bundle) {
        try {
            if (bundle.containsKey(s.a("010)dkSdHdhdidcdhefTgd'ej"))) {
                this.f56420b = bundle.getString(s.a("010]dk dWdhdidcdhefTgd1ej"));
            } else if (bundle.containsKey(s.a("017_dk6d=dhdidcdhEgKdidfdi>i4dhfi?idif"))) {
                this.f56421c = bundle.getBoolean(s.a("0171dkBd9dhdidcdhPgNdidfdiSi?dhfiQidif"));
            }
            CountDownLatch countDownLatch = this.f56419a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }
}
