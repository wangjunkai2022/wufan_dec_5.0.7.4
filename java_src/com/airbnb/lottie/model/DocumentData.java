package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class DocumentData {

    /* renamed from: a  reason: collision with root package name */
    public String f3905a;

    /* renamed from: b  reason: collision with root package name */
    public String f3906b;

    /* renamed from: c  reason: collision with root package name */
    public float f3907c;

    /* renamed from: d  reason: collision with root package name */
    public Justification f3908d;

    /* renamed from: e  reason: collision with root package name */
    public int f3909e;

    /* renamed from: f  reason: collision with root package name */
    public float f3910f;

    /* renamed from: g  reason: collision with root package name */
    public float f3911g;
    @ColorInt

    /* renamed from: h  reason: collision with root package name */
    public int f3912h;
    @ColorInt

    /* renamed from: i  reason: collision with root package name */
    public int f3913i;

    /* renamed from: j  reason: collision with root package name */
    public float f3914j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3915k;

    /* loaded from: classes2.dex */
    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f5, Justification justification, int i4, float f6, float f7, @ColorInt int i5, @ColorInt int i6, float f8, boolean z4) {
        a(str, str2, f5, justification, i4, f6, f7, i5, i6, f8, z4);
    }

    public void a(String str, String str2, float f5, Justification justification, int i4, float f6, float f7, @ColorInt int i5, @ColorInt int i6, float f8, boolean z4) {
        this.f3905a = str;
        this.f3906b = str2;
        this.f3907c = f5;
        this.f3908d = justification;
        this.f3909e = i4;
        this.f3910f = f6;
        this.f3911g = f7;
        this.f3912h = i5;
        this.f3913i = i6;
        this.f3914j = f8;
        this.f3915k = z4;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f3905a.hashCode() * 31) + this.f3906b.hashCode()) * 31) + this.f3907c)) * 31) + this.f3908d.ordinal()) * 31) + this.f3909e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f3910f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f3912h;
    }

    public DocumentData() {
    }
}
