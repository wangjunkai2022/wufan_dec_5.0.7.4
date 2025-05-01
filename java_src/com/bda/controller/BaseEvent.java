package com.bda.controller;

import android.os.Parcel;
import android.os.Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BaseEvent implements Parcelable {
    public static final Parcelable.Creator<BaseEvent> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final long f5082b;

    /* renamed from: c  reason: collision with root package name */
    final int f5083c;

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<BaseEvent> {
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

    public BaseEvent(long j4, int i4) {
        this.f5082b = j4;
        this.f5083c = i4;
    }

    public final int a() {
        return this.f5083c;
    }

    public final long b() {
        return this.f5082b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f5082b);
        parcel.writeInt(this.f5083c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseEvent(Parcel parcel) {
        this.f5082b = parcel.readLong();
        this.f5083c = parcel.readInt();
    }
}
