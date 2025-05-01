package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
/* compiled from: Font.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f3936a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3937b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3938c;

    /* renamed from: d  reason: collision with root package name */
    private final float f3939d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private Typeface f3940e;

    public b(String str, String str2, String str3, float f5) {
        this.f3936a = str;
        this.f3937b = str2;
        this.f3938c = str3;
        this.f3939d = f5;
    }

    float a() {
        return this.f3939d;
    }

    public String b() {
        return this.f3936a;
    }

    public String c() {
        return this.f3937b;
    }

    public String d() {
        return this.f3938c;
    }

    @Nullable
    public Typeface e() {
        return this.f3940e;
    }

    public void f(@Nullable Typeface typeface) {
        this.f3940e = typeface;
    }
}
