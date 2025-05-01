package com.xinzhu.overmind.entity;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class UnbindRecord implements Parcelable {
    public static final Parcelable.Creator<UnbindRecord> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private int f67781b;

    /* renamed from: c  reason: collision with root package name */
    private int f67782c;

    /* renamed from: d  reason: collision with root package name */
    private ComponentName f67783d;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<UnbindRecord> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UnbindRecord createFromParcel(Parcel parcel) {
            return new UnbindRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public UnbindRecord[] newArray(int i4) {
            return new UnbindRecord[i4];
        }
    }

    public UnbindRecord() {
    }

    public static Parcelable.Creator<UnbindRecord> b() {
        return CREATOR;
    }

    public int a() {
        return this.f67781b;
    }

    public ComponentName c() {
        return this.f67783d;
    }

    public int d() {
        return this.f67782c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(int i4) {
        this.f67781b = i4;
    }

    public void f(ComponentName componentName) {
        this.f67783d = componentName;
    }

    public void g(int i4) {
        this.f67782c = i4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f67781b);
        parcel.writeInt(this.f67782c);
        parcel.writeParcelable(this.f67783d, i4);
    }

    protected UnbindRecord(Parcel parcel) {
        this.f67781b = parcel.readInt();
        this.f67782c = parcel.readInt();
        this.f67783d = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
    }
}
