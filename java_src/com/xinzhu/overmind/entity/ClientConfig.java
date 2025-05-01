package com.xinzhu.overmind.entity;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class ClientConfig implements Parcelable {
    public static final Parcelable.Creator<ClientConfig> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public String f67762b;

    /* renamed from: c  reason: collision with root package name */
    public String f67763c;

    /* renamed from: d  reason: collision with root package name */
    public int f67764d;

    /* renamed from: e  reason: collision with root package name */
    public int f67765e;

    /* renamed from: f  reason: collision with root package name */
    public int f67766f;

    /* renamed from: g  reason: collision with root package name */
    public int f67767g;

    /* renamed from: h  reason: collision with root package name */
    public int f67768h;

    /* renamed from: i  reason: collision with root package name */
    public IBinder f67769i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f67770j;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ClientConfig> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ClientConfig createFromParcel(Parcel parcel) {
            return new ClientConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ClientConfig[] newArray(int i4) {
            return new ClientConfig[i4];
        }
    }

    public ClientConfig() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f67762b);
        parcel.writeString(this.f67763c);
        parcel.writeInt(this.f67764d);
        parcel.writeInt(this.f67765e);
        parcel.writeInt(this.f67766f);
        parcel.writeInt(this.f67767g);
        parcel.writeInt(this.f67768h);
        parcel.writeStrongBinder(this.f67769i);
        parcel.writeByte(this.f67770j ? (byte) 1 : (byte) 0);
    }

    protected ClientConfig(Parcel parcel) {
        this.f67762b = parcel.readString();
        this.f67763c = parcel.readString();
        this.f67764d = parcel.readInt();
        this.f67765e = parcel.readInt();
        this.f67766f = parcel.readInt();
        this.f67767g = parcel.readInt();
        this.f67768h = parcel.readInt();
        this.f67769i = parcel.readStrongBinder();
        this.f67770j = parcel.readByte() != 0;
    }
}
