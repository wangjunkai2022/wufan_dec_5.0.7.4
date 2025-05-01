package com.xinzhu.overmind.entity.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.xinzhu.overmind.Overmind;
/* loaded from: classes6.dex */
public class InstalledModule implements Parcelable {
    public static final Parcelable.Creator<InstalledModule> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public String f67793b;

    /* renamed from: c  reason: collision with root package name */
    public String f67794c;

    /* renamed from: d  reason: collision with root package name */
    public String f67795d;

    /* renamed from: e  reason: collision with root package name */
    public String f67796e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f67797f;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<InstalledModule> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public InstalledModule createFromParcel(Parcel parcel) {
            return new InstalledModule(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public InstalledModule[] newArray(int i4) {
            return new InstalledModule[i4];
        }
    }

    public InstalledModule() {
    }

    public ApplicationInfo a() {
        return Overmind.getMindPackageManager().f(this.f67793b, 128, -4);
    }

    public PackageInfo b() {
        return Overmind.getMindPackageManager().l(this.f67793b, 128, -4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f67793b);
        parcel.writeString(this.f67794c);
        parcel.writeString(this.f67795d);
        parcel.writeString(this.f67796e);
        parcel.writeByte(this.f67797f ? (byte) 1 : (byte) 0);
    }

    protected InstalledModule(Parcel parcel) {
        this.f67793b = parcel.readString();
        this.f67794c = parcel.readString();
        this.f67795d = parcel.readString();
        this.f67796e = parcel.readString();
        this.f67797f = parcel.readByte() != 0;
    }
}
