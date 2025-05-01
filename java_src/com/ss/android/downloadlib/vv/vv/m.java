package com.ss.android.downloadlib.vv.vv;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator<m>() { // from class: com.ss.android.downloadlib.vv.vv.m.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: vv */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: vv */
        public m[] newArray(int i4) {
            return new m[i4];
        }
    };

    /* renamed from: i  reason: collision with root package name */
    public int f60757i;

    /* renamed from: m  reason: collision with root package name */
    public int f60758m;

    /* renamed from: o  reason: collision with root package name */
    public String f60759o;

    /* renamed from: p  reason: collision with root package name */
    public String f60760p;

    /* renamed from: u  reason: collision with root package name */
    public String f60761u;
    public int vv;

    public m() {
        this.f60760p = "";
        this.f60759o = "";
        this.f60761u = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            m mVar = (m) obj;
            if (this.vv == mVar.vv && this.f60758m == mVar.f60758m) {
                String str = this.f60760p;
                if (str != null) {
                    return str.equals(mVar.f60760p);
                }
                if (mVar.f60760p == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i4 = ((this.vv * 31) + this.f60758m) * 31;
        String str = this.f60760p;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.vv);
        parcel.writeInt(this.f60758m);
        parcel.writeString(this.f60760p);
        parcel.writeString(this.f60759o);
        parcel.writeString(this.f60761u);
        parcel.writeInt(this.f60757i);
    }

    protected m(Parcel parcel) {
        this.f60760p = "";
        this.f60759o = "";
        this.f60761u = "";
        this.vv = parcel.readInt();
        this.f60758m = parcel.readInt();
        this.f60760p = parcel.readString();
        this.f60759o = parcel.readString();
        this.f60761u = parcel.readString();
        this.f60757i = parcel.readInt();
    }
}
