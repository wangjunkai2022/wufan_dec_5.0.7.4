package com.xinzhu.overmind.server.accounts;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class MindAccount implements Parcelable {
    public static final Parcelable.Creator<MindAccount> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final Account f67838b;

    /* renamed from: c  reason: collision with root package name */
    public String f67839c;

    /* renamed from: d  reason: collision with root package name */
    public long f67840d;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<MindAccount> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindAccount createFromParcel(Parcel parcel) {
            return new MindAccount(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindAccount[] newArray(int i4) {
            return new MindAccount[i4];
        }
    }

    public MindAccount(Account account) {
        this.f67838b = account;
    }

    public String a() {
        return this.f67839c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this.f67838b.equals(obj);
    }

    public int hashCode() {
        return this.f67838b.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f67838b, i4);
        parcel.writeString(this.f67839c);
        parcel.writeLong(this.f67840d);
    }

    public MindAccount(String str, String str2) {
        this.f67838b = new Account(str, str2);
    }

    protected MindAccount(Parcel parcel) {
        this.f67838b = (Account) parcel.readParcelable(Account.class.getClassLoader());
        this.f67839c = parcel.readString();
        this.f67840d = parcel.readLong();
    }
}
