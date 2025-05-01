package com.xinzhu.overmind.server.user;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class MindUserInfo implements Parcelable {
    public static final Parcelable.Creator<MindUserInfo> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public int f68255b;

    /* renamed from: c  reason: collision with root package name */
    public MindUserStatus f68256c;

    /* renamed from: d  reason: collision with root package name */
    public String f68257d;

    /* renamed from: e  reason: collision with root package name */
    public long f68258e;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<MindUserInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindUserInfo createFromParcel(Parcel parcel) {
            return new MindUserInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindUserInfo[] newArray(int i4) {
            return new MindUserInfo[i4];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MindUserInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MindUserInfo{id=" + this.f68255b + ", status=" + this.f68256c + ", name='" + this.f68257d + "', createTime=" + this.f68258e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f68255b);
        MindUserStatus mindUserStatus = this.f68256c;
        parcel.writeInt(mindUserStatus == null ? -1 : mindUserStatus.ordinal());
        parcel.writeString(this.f68257d);
        parcel.writeLong(this.f68258e);
    }

    protected MindUserInfo(Parcel parcel) {
        this.f68255b = parcel.readInt();
        int readInt = parcel.readInt();
        this.f68256c = readInt == -1 ? null : MindUserStatus.values()[readInt];
        this.f68257d = parcel.readString();
        this.f68258e = parcel.readLong();
    }
}
