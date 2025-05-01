package com.xinzhu.overmind.entity.pm;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class InstallOption implements Parcelable {
    public static final Parcelable.Creator<InstallOption> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final int f67784c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f67785d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f67786e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f67787f = 8;

    /* renamed from: b  reason: collision with root package name */
    public int f67788b;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<InstallOption> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public InstallOption createFromParcel(Parcel parcel) {
            return new InstallOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public InstallOption[] newArray(int i4) {
            return new InstallOption[i4];
        }
    }

    public InstallOption() {
        this.f67788b = 0;
    }

    public static InstallOption a() {
        InstallOption installOption = new InstallOption();
        installOption.f67788b |= 2;
        return installOption;
    }

    public static InstallOption b() {
        InstallOption installOption = new InstallOption();
        installOption.f67788b |= 1;
        return installOption;
    }

    public boolean c(int i4) {
        return (i4 & this.f67788b) != 0;
    }

    public InstallOption d() {
        this.f67788b |= 8;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public InstallOption e() {
        this.f67788b |= 4;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f67788b);
    }

    protected InstallOption(Parcel parcel) {
        this.f67788b = 0;
        this.f67788b = parcel.readInt();
    }
}
