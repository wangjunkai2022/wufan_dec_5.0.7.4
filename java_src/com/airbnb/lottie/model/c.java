package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.content.l;
import java.util.List;
/* compiled from: FontCharacter.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<l> f3941a;

    /* renamed from: b  reason: collision with root package name */
    private final char f3942b;

    /* renamed from: c  reason: collision with root package name */
    private final double f3943c;

    /* renamed from: d  reason: collision with root package name */
    private final double f3944d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3945e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3946f;

    public c(List<l> list, char c5, double d5, double d6, String str, String str2) {
        this.f3941a = list;
        this.f3942b = c5;
        this.f3943c = d5;
        this.f3944d = d6;
        this.f3945e = str;
        this.f3946f = str2;
    }

    public static int c(char c5, String str, String str2) {
        return ((((0 + c5) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<l> a() {
        return this.f3941a;
    }

    public double b() {
        return this.f3944d;
    }

    public int hashCode() {
        return c(this.f3942b, this.f3946f, this.f3945e);
    }
}
