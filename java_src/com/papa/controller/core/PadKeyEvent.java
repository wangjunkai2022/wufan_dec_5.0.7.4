package com.papa.controller.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public class PadKeyEvent extends BaseEvent implements Parcelable {
    public static final Parcelable.Creator<PadKeyEvent> CREATOR = new a();
    final int K;
    final int L;
    final float M;

    /* loaded from: classes5.dex */
    class a implements Parcelable.Creator<PadKeyEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PadKeyEvent createFromParcel(Parcel parcel) {
            return new PadKeyEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PadKeyEvent[] newArray(int i4) {
            return new PadKeyEvent[i4];
        }
    }

    public PadKeyEvent(long j4, int i4, String str, int i5, int i6, float f5) {
        super(j4, i4, str);
        this.K = i5;
        this.L = i6;
        this.M = f5;
    }

    public int d() {
        return this.L;
    }

    public int e() {
        return this.K;
    }

    public float f() {
        return this.M;
    }

    @Override // com.papa.controller.core.BaseEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeFloat(this.M);
    }

    public PadKeyEvent(Parcel parcel) {
        super(parcel);
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readFloat();
    }
}
