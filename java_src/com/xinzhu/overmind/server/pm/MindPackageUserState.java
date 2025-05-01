package com.xinzhu.overmind.server.pm;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class MindPackageUserState implements Parcelable {
    public static final Parcelable.Creator<MindPackageUserState> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public boolean f68144b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f68145c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f68146d;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<MindPackageUserState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindPackageUserState createFromParcel(Parcel parcel) {
            return new MindPackageUserState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindPackageUserState[] newArray(int i4) {
            return new MindPackageUserState[i4];
        }
    }

    public MindPackageUserState() {
        this.f68144b = false;
        this.f68145c = true;
        this.f68146d = false;
    }

    public static MindPackageUserState a() {
        MindPackageUserState mindPackageUserState = new MindPackageUserState();
        mindPackageUserState.f68144b = true;
        return mindPackageUserState;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f68144b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68145c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68146d ? (byte) 1 : (byte) 0);
    }

    protected MindPackageUserState(Parcel parcel) {
        this.f68144b = parcel.readByte() != 0;
        this.f68145c = parcel.readByte() != 0;
        this.f68146d = parcel.readByte() != 0;
    }

    public MindPackageUserState(MindPackageUserState mindPackageUserState) {
        this.f68144b = mindPackageUserState.f68144b;
        this.f68145c = mindPackageUserState.f68145c;
        this.f68146d = mindPackageUserState.f68146d;
    }
}
