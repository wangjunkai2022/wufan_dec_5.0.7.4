package com.xinzhu.overmind.entity.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.xinzhu.overmind.Overmind;
import java.util.Objects;
/* loaded from: classes.dex */
public class InstalledPackage implements Parcelable {
    public static final Parcelable.Creator<InstalledPackage> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public int f67798b;

    /* renamed from: c  reason: collision with root package name */
    public String f67799c;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<InstalledPackage> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public InstalledPackage createFromParcel(Parcel parcel) {
            return new InstalledPackage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public InstalledPackage[] newArray(int i4) {
            return new InstalledPackage[i4];
        }
    }

    public InstalledPackage() {
    }

    public ApplicationInfo a() {
        return Overmind.getMindPackageManager().f(this.f67799c, 128, this.f67798b);
    }

    public PackageInfo b() {
        return Overmind.getMindPackageManager().l(this.f67799c, 128, this.f67798b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f67799c, ((InstalledPackage) obj).f67799c);
    }

    public int hashCode() {
        return Objects.hash(this.f67799c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f67798b);
        parcel.writeString(this.f67799c);
    }

    public InstalledPackage(String str) {
        this.f67799c = str;
    }

    protected InstalledPackage(Parcel parcel) {
        this.f67798b = parcel.readInt();
        this.f67799c = parcel.readString();
    }
}
