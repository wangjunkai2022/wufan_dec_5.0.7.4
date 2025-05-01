package com.xinzhu.overmind.entity.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.xinzhu.overmind.utils.v;
/* loaded from: classes.dex */
public class InstallResult implements Parcelable {
    public static final Parcelable.Creator<InstallResult> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final String f67789e = "InstallResult";

    /* renamed from: b  reason: collision with root package name */
    public boolean f67790b;

    /* renamed from: c  reason: collision with root package name */
    public String f67791c;

    /* renamed from: d  reason: collision with root package name */
    public String f67792d;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<InstallResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public InstallResult createFromParcel(Parcel parcel) {
            return new InstallResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public InstallResult[] newArray(int i4) {
            return new InstallResult[i4];
        }
    }

    public InstallResult() {
        this.f67790b = true;
    }

    public InstallResult a(String str) {
        this.f67792d = str;
        this.f67790b = false;
        v.a(f67789e, str);
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f67790b ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f67791c);
        parcel.writeString(this.f67792d);
    }

    protected InstallResult(Parcel parcel) {
        this.f67790b = true;
        this.f67790b = parcel.readByte() != 0;
        this.f67791c = parcel.readString();
        this.f67792d = parcel.readString();
    }
}
