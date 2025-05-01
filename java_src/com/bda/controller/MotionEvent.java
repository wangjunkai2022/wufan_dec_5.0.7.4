package com.bda.controller;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
/* loaded from: classes2.dex */
public final class MotionEvent extends BaseEvent implements Parcelable {
    public static final Parcelable.Creator<MotionEvent> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final int f5112f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f5113g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f5114h = 11;

    /* renamed from: i  reason: collision with root package name */
    public static final int f5115i = 14;

    /* renamed from: j  reason: collision with root package name */
    public static final int f5116j = 17;

    /* renamed from: k  reason: collision with root package name */
    public static final int f5117k = 18;

    /* renamed from: d  reason: collision with root package name */
    final SparseArray<Float> f5118d;

    /* renamed from: e  reason: collision with root package name */
    final SparseArray<Float> f5119e;

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<MotionEvent> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MotionEvent createFromParcel(Parcel parcel) {
            return new MotionEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MotionEvent[] newArray(int i4) {
            return new MotionEvent[i4];
        }
    }

    public MotionEvent(long j4, int i4, float f5, float f6, float f7, float f8, float f9, float f10) {
        super(j4, i4);
        SparseArray<Float> sparseArray = new SparseArray<>(4);
        this.f5118d = sparseArray;
        sparseArray.put(0, Float.valueOf(f5));
        sparseArray.put(1, Float.valueOf(f6));
        sparseArray.put(11, Float.valueOf(f7));
        sparseArray.put(14, Float.valueOf(f8));
        SparseArray<Float> sparseArray2 = new SparseArray<>(2);
        this.f5119e = sparseArray2;
        sparseArray2.put(0, Float.valueOf(f9));
        sparseArray2.put(1, Float.valueOf(f10));
    }

    public final int c(int i4) {
        return -1;
    }

    public final float d(int i4) {
        return e(i4, 0);
    }

    @Override // com.bda.controller.BaseEvent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final float e(int i4, int i5) {
        if (i5 == 0) {
            return this.f5118d.get(i4, Float.valueOf(0.0f)).floatValue();
        }
        return 0.0f;
    }

    public final int f() {
        return 1;
    }

    public final int g(int i4) {
        return 0;
    }

    public final float h() {
        return j();
    }

    public final float i() {
        return m();
    }

    public final float j() {
        return e(0, 0);
    }

    public final float k(int i4) {
        return e(0, i4);
    }

    public final float l() {
        return this.f5119e.get(0, Float.valueOf(0.0f)).floatValue();
    }

    public final float m() {
        return e(1, 0);
    }

    public final float n(int i4) {
        return e(1, i4);
    }

    public final float o() {
        return this.f5119e.get(1, Float.valueOf(0.0f)).floatValue();
    }

    @Override // com.bda.controller.BaseEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        int size = this.f5118d.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(this.f5118d.keyAt(i5));
            parcel.writeFloat(this.f5118d.valueAt(i5).floatValue());
        }
        int size2 = this.f5119e.size();
        parcel.writeInt(size2);
        for (int i6 = 0; i6 < size2; i6++) {
            parcel.writeInt(this.f5119e.keyAt(i6));
            parcel.writeFloat(this.f5119e.valueAt(i6).floatValue());
        }
    }

    public MotionEvent(long j4, int i4, int[] iArr, float[] fArr, int[] iArr2, float[] fArr2) {
        super(j4, i4);
        int length = iArr.length;
        this.f5118d = new SparseArray<>(length);
        for (int i5 = 0; i5 < length; i5++) {
            this.f5118d.put(iArr[i5], Float.valueOf(fArr[i5]));
        }
        int length2 = iArr2.length;
        this.f5119e = new SparseArray<>(length2);
        for (int i6 = 0; i6 < length2; i6++) {
            this.f5119e.put(iArr2[i6], Float.valueOf(fArr2[i6]));
        }
    }

    MotionEvent(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.f5118d = new SparseArray<>(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f5118d.put(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        this.f5119e = new SparseArray<>(parcel.readInt());
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f5119e.put(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
    }
}
