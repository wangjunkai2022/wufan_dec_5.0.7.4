package com.facebook.drawee.generic;

import androidx.annotation.ColorInt;
import com.facebook.common.internal.h;
import java.util.Arrays;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class RoundingParams {

    /* renamed from: a  reason: collision with root package name */
    private RoundingMethod f11312a = RoundingMethod.BITMAP_ONLY;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11313b = false;

    /* renamed from: c  reason: collision with root package name */
    private float[] f11314c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f11315d = 0;

    /* renamed from: e  reason: collision with root package name */
    private float f11316e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    private int f11317f = 0;

    /* renamed from: g  reason: collision with root package name */
    private float f11318g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11319h = false;

    /* loaded from: classes2.dex */
    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static RoundingParams a() {
        return new RoundingParams().v(true);
    }

    public static RoundingParams b(float f5, float f6, float f7, float f8) {
        return new RoundingParams().q(f5, f6, f7, f8);
    }

    public static RoundingParams c(float[] fArr) {
        return new RoundingParams().r(fArr);
    }

    public static RoundingParams d(float f5) {
        return new RoundingParams().s(f5);
    }

    private float[] h() {
        if (this.f11314c == null) {
            this.f11314c = new float[8];
        }
        return this.f11314c;
    }

    public int e() {
        return this.f11317f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.f11313b == roundingParams.f11313b && this.f11315d == roundingParams.f11315d && Float.compare(roundingParams.f11316e, this.f11316e) == 0 && this.f11317f == roundingParams.f11317f && Float.compare(roundingParams.f11318g, this.f11318g) == 0 && this.f11312a == roundingParams.f11312a && this.f11319h == roundingParams.f11319h) {
            return Arrays.equals(this.f11314c, roundingParams.f11314c);
        }
        return false;
    }

    public float f() {
        return this.f11316e;
    }

    public float[] g() {
        return this.f11314c;
    }

    public int hashCode() {
        RoundingMethod roundingMethod = this.f11312a;
        int hashCode = (((roundingMethod != null ? roundingMethod.hashCode() : 0) * 31) + (this.f11313b ? 1 : 0)) * 31;
        float[] fArr = this.f11314c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f11315d) * 31;
        float f5 = this.f11316e;
        int floatToIntBits = (((hashCode2 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31) + this.f11317f) * 31;
        float f6 = this.f11318g;
        return ((floatToIntBits + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31) + (this.f11319h ? 1 : 0);
    }

    public int i() {
        return this.f11315d;
    }

    public float j() {
        return this.f11318g;
    }

    public boolean k() {
        return this.f11313b;
    }

    public RoundingMethod l() {
        return this.f11312a;
    }

    public boolean m() {
        return this.f11319h;
    }

    public RoundingParams n(@ColorInt int i4, float f5) {
        h.e(f5 >= 0.0f, "the border width cannot be < 0");
        this.f11316e = f5;
        this.f11317f = i4;
        return this;
    }

    public RoundingParams o(@ColorInt int i4) {
        this.f11317f = i4;
        return this;
    }

    public RoundingParams p(float f5) {
        h.e(f5 >= 0.0f, "the border width cannot be < 0");
        this.f11316e = f5;
        return this;
    }

    public RoundingParams q(float f5, float f6, float f7, float f8) {
        float[] h4 = h();
        h4[1] = f5;
        h4[0] = f5;
        h4[3] = f6;
        h4[2] = f6;
        h4[5] = f7;
        h4[4] = f7;
        h4[7] = f8;
        h4[6] = f8;
        return this;
    }

    public RoundingParams r(float[] fArr) {
        h.i(fArr);
        h.e(fArr.length == 8, "radii should have exactly 8 values");
        System.arraycopy(fArr, 0, h(), 0, 8);
        return this;
    }

    public RoundingParams s(float f5) {
        Arrays.fill(h(), f5);
        return this;
    }

    public RoundingParams t(@ColorInt int i4) {
        this.f11315d = i4;
        this.f11312a = RoundingMethod.OVERLAY_COLOR;
        return this;
    }

    public RoundingParams u(float f5) {
        h.e(f5 >= 0.0f, "the padding cannot be < 0");
        this.f11318g = f5;
        return this;
    }

    public RoundingParams v(boolean z4) {
        this.f11313b = z4;
        return this;
    }

    public RoundingParams w(RoundingMethod roundingMethod) {
        this.f11312a = roundingMethod;
        return this;
    }

    public RoundingParams x(boolean z4) {
        this.f11319h = z4;
        return this;
    }
}
