package com.papa.controller.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public class PadStateEvent extends BaseEvent implements Parcelable {
    public static final Parcelable.Creator<PadStateEvent> CREATOR = new a();
    final int K;
    final int L;
    protected String M;

    /* loaded from: classes5.dex */
    class a implements Parcelable.Creator<PadStateEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PadStateEvent createFromParcel(Parcel parcel) {
            return new PadStateEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PadStateEvent[] newArray(int i4) {
            return new PadStateEvent[i4];
        }
    }

    public PadStateEvent(long j4, int i4, String str, int i5, int i6, String str2) {
        super(j4, i4, str);
        this.M = "";
        this.K = i5;
        this.L = i6;
        this.M = str2;
    }

    public int d() {
        return this.L;
    }

    public String e() {
        return this.M;
    }

    public int f() {
        return this.K;
    }

    public String toString() {
        return "PadStateEvent{state=" + this.K + ", action=" + this.L + ", mac='" + this.M + "'}";
    }

    @Override // com.papa.controller.core.BaseEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeString(this.M);
    }

    public PadStateEvent(Parcel parcel) {
        super(parcel);
        this.M = "";
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readString();
    }
}
