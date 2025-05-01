package com.xinzhu.overmind.entity;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public class PendingIntentRecord implements Parcelable {
    public static final Parcelable.Creator<PendingIntentRecord> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public String f67774b;

    /* renamed from: c  reason: collision with root package name */
    public int f67775c;

    /* renamed from: d  reason: collision with root package name */
    public int f67776d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f67777e;

    /* renamed from: f  reason: collision with root package name */
    public Intent f67778f;

    /* renamed from: g  reason: collision with root package name */
    public int f67779g;

    /* renamed from: h  reason: collision with root package name */
    public int f67780h;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<PendingIntentRecord> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PendingIntentRecord createFromParcel(Parcel parcel) {
            return new PendingIntentRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PendingIntentRecord[] newArray(int i4) {
            return new PendingIntentRecord[i4];
        }
    }

    public PendingIntentRecord(String str, int i4, int i5, IBinder iBinder, Intent intent, int i6, int i7) {
        this.f67774b = str;
        this.f67775c = i4;
        this.f67776d = i5;
        this.f67777e = iBinder;
        Intent intent2 = new Intent();
        intent2.setComponent(intent.getComponent());
        intent2.setAction(intent.getAction());
        intent2.setFlags(intent.getFlags());
        intent2.setType(intent.getType());
        this.f67778f = intent2;
        this.f67779g = i6;
        this.f67780h = i7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        return "PendingIntentRecord " + this.f67777e + " " + this.f67774b + " " + this.f67775c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f67774b);
        parcel.writeInt(this.f67775c);
        parcel.writeInt(this.f67776d);
        parcel.writeStrongBinder(this.f67777e);
        parcel.writeParcelable(this.f67778f, i4);
        parcel.writeInt(this.f67779g);
        parcel.writeInt(this.f67780h);
    }

    protected PendingIntentRecord(Parcel parcel) {
        this.f67774b = parcel.readString();
        this.f67775c = parcel.readInt();
        this.f67776d = parcel.readInt();
        this.f67777e = parcel.readStrongBinder();
        this.f67778f = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f67779g = parcel.readInt();
        this.f67780h = parcel.readInt();
    }
}
