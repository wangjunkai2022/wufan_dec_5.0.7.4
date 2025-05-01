package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: BUGLY */
/* loaded from: classes4.dex */
public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new Parcelable.Creator<PlugInBean>() { // from class: com.tencent.bugly.crashreport.common.info.PlugInBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlugInBean createFromParcel(Parcel parcel) {
            return new PlugInBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PlugInBean[] newArray(int i4) {
            return new PlugInBean[i4];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f62247a;

    /* renamed from: b  reason: collision with root package name */
    public final String f62248b;

    /* renamed from: c  reason: collision with root package name */
    public final String f62249c;

    public PlugInBean(String str, String str2, String str3) {
        this.f62247a = str;
        this.f62248b = str2;
        this.f62249c = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f62247a + " plV:" + this.f62248b + " plUUID:" + this.f62249c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f62247a);
        parcel.writeString(this.f62248b);
        parcel.writeString(this.f62249c);
    }

    public PlugInBean(Parcel parcel) {
        this.f62247a = parcel.readString();
        this.f62248b = parcel.readString();
        this.f62249c = parcel.readString();
    }
}
