package com.ss.android.socialbase.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes5.dex */
public class p implements Parcelable, Comparable {
    public static final Parcelable.Creator<p> CREATOR = new Parcelable.Creator<p>() { // from class: com.ss.android.socialbase.downloader.model.p.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: vv */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: vv */
        public p[] newArray(int i4) {
            return new p[i4];
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private final String f61228m;
    private final String vv;

    public p(String str, String str2) {
        this.vv = str;
        this.f61228m = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (TextUtils.equals(this.vv, pVar.vv())) {
                return 0;
            }
            String str = this.vv;
            if (str == null) {
                return -1;
            }
            int compareTo = str.compareTo(pVar.vv());
            if (compareTo > 0) {
                return 1;
            }
            return compareTo < 0 ? -1 : 0;
        }
        return 1;
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
            p pVar = (p) obj;
            if (TextUtils.equals(this.vv, pVar.vv) && TextUtils.equals(this.f61228m, pVar.f61228m)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.vv;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61228m;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String m() {
        return this.f61228m;
    }

    public String toString() {
        return "HttpHeader{name='" + this.vv + "', value='" + this.f61228m + "'}";
    }

    public String vv() {
        return this.vv;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.vv);
        parcel.writeString(this.f61228m);
    }

    protected p(Parcel parcel) {
        this.vv = parcel.readString();
        this.f61228m = parcel.readString();
    }
}
