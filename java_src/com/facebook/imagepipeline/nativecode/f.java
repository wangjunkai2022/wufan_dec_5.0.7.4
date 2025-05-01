package com.facebook.imagepipeline.nativecode;
/* compiled from: WebpTranscoderFactory.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static e f12085a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f12086b;

    static {
        try {
            f12085a = (e) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            f12086b = true;
        } catch (Throwable unused) {
            f12086b = false;
        }
    }

    public static e a() {
        return f12085a;
    }
}
