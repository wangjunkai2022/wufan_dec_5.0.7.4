package com.xinzhu.overmind.server.accounts;

import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* loaded from: classes.dex */
public class AccountManagerResponse implements Parcelable {
    public static final Parcelable.Creator<AccountManagerResponse> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private IAccountManagerResponse f67837b;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<AccountManagerResponse> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AccountManagerResponse createFromParcel(Parcel parcel) {
            return new AccountManagerResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AccountManagerResponse[] newArray(int i4) {
            return new AccountManagerResponse[i4];
        }
    }

    public AccountManagerResponse(IAccountManagerResponse iAccountManagerResponse) {
        this.f67837b = iAccountManagerResponse;
    }

    public void a(int i4, String str) {
        try {
            this.f67837b.onError(i4, str);
        } catch (RemoteException unused) {
        }
    }

    public void b(Bundle bundle) {
        try {
            this.f67837b.onResult(bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStrongBinder(this.f67837b.asBinder());
    }

    public AccountManagerResponse(Parcel parcel) {
        this.f67837b = IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder());
    }
}
