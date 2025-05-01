package com.papa.controller.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public class BaseEvent implements Parcelable {
    public static final int A = -1;
    public static final int B = -1;
    public static final int C = 0;
    public static final Parcelable.Creator<BaseEvent> CREATOR = new a();
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 8;
    public static final int G = 9;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f57989e = 19;

    /* renamed from: f  reason: collision with root package name */
    public static final int f57990f = 20;

    /* renamed from: g  reason: collision with root package name */
    public static final int f57991g = 21;

    /* renamed from: h  reason: collision with root package name */
    public static final int f57992h = 22;

    /* renamed from: i  reason: collision with root package name */
    public static final int f57993i = 96;

    /* renamed from: j  reason: collision with root package name */
    public static final int f57994j = 97;

    /* renamed from: k  reason: collision with root package name */
    public static final int f57995k = 99;

    /* renamed from: l  reason: collision with root package name */
    public static final int f57996l = 100;

    /* renamed from: m  reason: collision with root package name */
    public static final int f57997m = 102;

    /* renamed from: n  reason: collision with root package name */
    public static final int f57998n = 103;

    /* renamed from: o  reason: collision with root package name */
    public static final int f57999o = 104;

    /* renamed from: p  reason: collision with root package name */
    public static final int f58000p = 105;

    /* renamed from: q  reason: collision with root package name */
    public static final int f58001q = 106;

    /* renamed from: r  reason: collision with root package name */
    public static final int f58002r = 107;

    /* renamed from: s  reason: collision with root package name */
    public static final int f58003s = 108;

    /* renamed from: t  reason: collision with root package name */
    public static final int f58004t = 109;

    /* renamed from: u  reason: collision with root package name */
    public static final int f58005u = 198;

    /* renamed from: v  reason: collision with root package name */
    public static final int f58006v = 199;

    /* renamed from: w  reason: collision with root package name */
    public static final int f58007w = 200;

    /* renamed from: x  reason: collision with root package name */
    public static final int f58008x = 201;

    /* renamed from: y  reason: collision with root package name */
    public static final int f58009y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final int f58010z = 1;

    /* renamed from: b  reason: collision with root package name */
    final long f58011b;

    /* renamed from: c  reason: collision with root package name */
    final int f58012c;

    /* renamed from: d  reason: collision with root package name */
    final String f58013d;

    /* loaded from: classes5.dex */
    class a implements Parcelable.Creator<BaseEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BaseEvent createFromParcel(Parcel parcel) {
            return new BaseEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BaseEvent[] newArray(int i4) {
            return new BaseEvent[i4];
        }
    }

    public BaseEvent(long j4, int i4, String str) {
        this.f58011b = j4;
        this.f58012c = i4;
        this.f58013d = str;
    }

    public int a() {
        return this.f58012c;
    }

    public long b() {
        return this.f58011b;
    }

    public String c() {
        return this.f58013d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f58011b);
        parcel.writeInt(this.f58012c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseEvent(Parcel parcel) {
        this.f58011b = parcel.readLong();
        this.f58012c = parcel.readInt();
        this.f58013d = parcel.readString();
    }
}
