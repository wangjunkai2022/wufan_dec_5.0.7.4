package com.facebook.imagepipeline.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes2.dex */
public class RotationOptions {

    /* renamed from: c  reason: collision with root package name */
    public static final int f11691c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f11692d = 90;

    /* renamed from: e  reason: collision with root package name */
    public static final int f11693e = 180;

    /* renamed from: f  reason: collision with root package name */
    public static final int f11694f = 270;

    /* renamed from: g  reason: collision with root package name */
    private static final int f11695g = -1;

    /* renamed from: h  reason: collision with root package name */
    private static final int f11696h = -2;

    /* renamed from: i  reason: collision with root package name */
    private static final RotationOptions f11697i = new RotationOptions(-1, false);

    /* renamed from: j  reason: collision with root package name */
    private static final RotationOptions f11698j = new RotationOptions(-2, false);

    /* renamed from: k  reason: collision with root package name */
    private static final RotationOptions f11699k = new RotationOptions(-1, true);

    /* renamed from: a  reason: collision with root package name */
    private final int f11700a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11701b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface RotationAngle {
    }

    private RotationOptions(int i4, boolean z4) {
        this.f11700a = i4;
        this.f11701b = z4;
    }

    public static RotationOptions a() {
        return f11697i;
    }

    public static RotationOptions b() {
        return f11699k;
    }

    public static RotationOptions d() {
        return f11698j;
    }

    public static RotationOptions e(int i4) {
        return new RotationOptions(i4, false);
    }

    public boolean c() {
        return this.f11701b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RotationOptions) {
            RotationOptions rotationOptions = (RotationOptions) obj;
            return this.f11700a == rotationOptions.f11700a && this.f11701b == rotationOptions.f11701b;
        }
        return false;
    }

    public int f() {
        if (!h()) {
            return this.f11700a;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public boolean g() {
        return this.f11700a != -2;
    }

    public boolean h() {
        return this.f11700a == -1;
    }

    public int hashCode() {
        return com.facebook.common.util.b.h(Integer.valueOf(this.f11700a), Boolean.valueOf(this.f11701b));
    }

    public String toString() {
        return String.format(null, "%d defer:%b", Integer.valueOf(this.f11700a), Boolean.valueOf(this.f11701b));
    }
}
