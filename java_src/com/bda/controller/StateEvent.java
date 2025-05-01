package com.bda.controller;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class StateEvent extends BaseEvent implements Parcelable {
    public static final Parcelable.Creator<StateEvent> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final int f5120f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f5121g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f5122h = 2;
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    public static final int f5123i = 3;
    @Deprecated

    /* renamed from: j  reason: collision with root package name */
    public static final int f5124j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f5125k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f5126l = 4;

    /* renamed from: m  reason: collision with root package name */
    public static final int f5127m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f5128n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f5129o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f5130p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f5131q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f5132r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f5133s = 2;

    /* renamed from: d  reason: collision with root package name */
    final int f5134d;

    /* renamed from: e  reason: collision with root package name */
    final int f5135e;

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<StateEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public StateEvent createFromParcel(Parcel parcel) {
            return new StateEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public StateEvent[] newArray(int i4) {
            return new StateEvent[i4];
        }
    }

    public StateEvent(long j4, int i4, int i5, int i6) {
        super(j4, i4);
        this.f5134d = i5;
        this.f5135e = i6;
    }

    public final int c() {
        return this.f5135e;
    }

    public final int d() {
        return this.f5134d;
    }

    @Override // com.bda.controller.BaseEvent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.bda.controller.BaseEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f5134d);
        parcel.writeInt(this.f5135e);
    }

    StateEvent(Parcel parcel) {
        super(parcel);
        this.f5134d = parcel.readInt();
        this.f5135e = parcel.readInt();
    }
}
