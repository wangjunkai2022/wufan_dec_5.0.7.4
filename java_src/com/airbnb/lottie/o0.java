package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
/* compiled from: LottieImageAsset.java */
/* loaded from: classes2.dex */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f4123a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4124b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4125c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4126d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4127e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f4128f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public o0(int i4, int i5, String str, String str2, String str3) {
        this.f4123a = i4;
        this.f4124b = i5;
        this.f4125c = str;
        this.f4126d = str2;
        this.f4127e = str3;
    }

    @Nullable
    public Bitmap a() {
        return this.f4128f;
    }

    public String b() {
        return this.f4127e;
    }

    public String c() {
        return this.f4126d;
    }

    public int d() {
        return this.f4124b;
    }

    public String e() {
        return this.f4125c;
    }

    public int f() {
        return this.f4123a;
    }

    public boolean g() {
        return this.f4128f != null || (this.f4126d.startsWith("data:") && this.f4126d.indexOf("base64,") > 0);
    }

    public void h(@Nullable Bitmap bitmap) {
        this.f4128f = bitmap;
    }
}
