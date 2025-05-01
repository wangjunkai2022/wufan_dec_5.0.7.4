package com.facebook.imageformat;

import javax.annotation.Nullable;
/* compiled from: ImageFormat.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f11540c = new c("UNKNOWN", null);

    /* renamed from: a  reason: collision with root package name */
    private final String f11541a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11542b;

    /* compiled from: ImageFormat.java */
    /* loaded from: classes.dex */
    public interface a {
        @Nullable
        c a(byte[] bArr, int i4);

        int b();
    }

    public c(String str, @Nullable String str2) {
        this.f11542b = str;
        this.f11541a = str2;
    }

    @Nullable
    public String a() {
        return this.f11541a;
    }

    public String b() {
        return this.f11542b;
    }

    public String toString() {
        return b();
    }
}
