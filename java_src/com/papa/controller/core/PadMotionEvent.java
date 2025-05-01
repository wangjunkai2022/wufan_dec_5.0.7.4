package com.papa.controller.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public class PadMotionEvent extends BaseEvent implements Parcelable {
    public static final Parcelable.Creator<PadMotionEvent> CREATOR = new a();
    final int K;
    final float L;
    final float M;

    /* loaded from: classes5.dex */
    class a implements Parcelable.Creator<PadMotionEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PadMotionEvent createFromParcel(Parcel parcel) {
            return new PadMotionEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PadMotionEvent[] newArray(int i4) {
            return new PadMotionEvent[i4];
        }
    }

    public PadMotionEvent(long j4, int i4, String str, int i5, float f5, float f6) {
        super(j4, i4, str);
        this.K = i5;
        this.L = f5;
        this.M = f6;
    }

    public int d() {
        return this.K;
    }

    public float e() {
        return this.L;
    }

    public float f() {
        return this.M;
    }

    @Override // com.papa.controller.core.BaseEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.K);
        parcel.writeFloat(this.L);
        parcel.writeFloat(this.M);
    }

    public PadMotionEvent(Parcel parcel) {
        super(parcel);
        this.K = parcel.readInt();
        this.L = parcel.readFloat();
        this.M = parcel.readFloat();
    }
}
