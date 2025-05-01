package com.bda.controller;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public final class KeyEvent extends BaseEvent implements Parcelable {
    public static final Parcelable.Creator<KeyEvent> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final int f5091f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f5092g = 19;

    /* renamed from: h  reason: collision with root package name */
    public static final int f5093h = 20;

    /* renamed from: i  reason: collision with root package name */
    public static final int f5094i = 21;

    /* renamed from: j  reason: collision with root package name */
    public static final int f5095j = 22;

    /* renamed from: k  reason: collision with root package name */
    public static final int f5096k = 96;

    /* renamed from: l  reason: collision with root package name */
    public static final int f5097l = 97;

    /* renamed from: m  reason: collision with root package name */
    public static final int f5098m = 99;

    /* renamed from: n  reason: collision with root package name */
    public static final int f5099n = 100;

    /* renamed from: o  reason: collision with root package name */
    public static final int f5100o = 102;

    /* renamed from: p  reason: collision with root package name */
    public static final int f5101p = 103;

    /* renamed from: q  reason: collision with root package name */
    public static final int f5102q = 104;

    /* renamed from: r  reason: collision with root package name */
    public static final int f5103r = 105;

    /* renamed from: s  reason: collision with root package name */
    public static final int f5104s = 106;

    /* renamed from: t  reason: collision with root package name */
    public static final int f5105t = 107;

    /* renamed from: u  reason: collision with root package name */
    public static final int f5106u = 108;

    /* renamed from: v  reason: collision with root package name */
    public static final int f5107v = 109;

    /* renamed from: w  reason: collision with root package name */
    public static final int f5108w = 0;

    /* renamed from: x  reason: collision with root package name */
    public static final int f5109x = 1;

    /* renamed from: d  reason: collision with root package name */
    final int f5110d;

    /* renamed from: e  reason: collision with root package name */
    final int f5111e;

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<KeyEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public KeyEvent createFromParcel(Parcel parcel) {
            return new KeyEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public KeyEvent[] newArray(int i4) {
            return new KeyEvent[i4];
        }
    }

    public KeyEvent(long j4, int i4, int i5, int i6) {
        super(j4, i4);
        this.f5110d = i5;
        this.f5111e = i6;
    }

    public final int c() {
        return this.f5111e;
    }

    public final int d() {
        return this.f5110d;
    }

    @Override // com.bda.controller.BaseEvent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.bda.controller.BaseEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f5110d);
        parcel.writeInt(this.f5111e);
    }

    KeyEvent(Parcel parcel) {
        super(parcel);
        this.f5110d = parcel.readInt();
        this.f5111e = parcel.readInt();
    }
}
