package com.beizi.ad.internal.video;

import android.graphics.Matrix;
/* compiled from: AdVideoManager.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private c f6134a;

    /* renamed from: b  reason: collision with root package name */
    private c f6135b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdVideoManager.java */
    /* renamed from: com.beizi.ad.internal.video.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6136a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f6137b;

        static {
            int[] iArr = new int[EnumC0183a.values().length];
            f6137b = iArr;
            try {
                iArr[EnumC0183a.LEFT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6137b[EnumC0183a.LEFT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6137b[EnumC0183a.LEFT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6137b[EnumC0183a.CENTER_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6137b[EnumC0183a.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6137b[EnumC0183a.CENTER_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6137b[EnumC0183a.RIGHT_TOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6137b[EnumC0183a.RIGHT_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6137b[EnumC0183a.RIGHT_BOTTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[b.values().length];
            f6136a = iArr2;
            try {
                iArr2[b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6136a[b.FIT_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6136a[b.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6136a[b.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6136a[b.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6136a[b.LEFT_TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6136a[b.LEFT_CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6136a[b.LEFT_BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6136a[b.CENTER_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f6136a[b.CENTER.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f6136a[b.CENTER_BOTTOM.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f6136a[b.RIGHT_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f6136a[b.RIGHT_CENTER.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f6136a[b.RIGHT_BOTTOM.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f6136a[b.LEFT_TOP_CROP.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f6136a[b.LEFT_CENTER_CROP.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f6136a[b.LEFT_BOTTOM_CROP.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f6136a[b.CENTER_TOP_CROP.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f6136a[b.CENTER_CROP.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f6136a[b.CENTER_BOTTOM_CROP.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f6136a[b.RIGHT_TOP_CROP.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f6136a[b.RIGHT_CENTER_CROP.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f6136a[b.RIGHT_BOTTOM_CROP.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f6136a[b.START_INSIDE.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f6136a[b.CENTER_INSIDE.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f6136a[b.END_INSIDE.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
        }
    }

    /* compiled from: AdVideoManager.java */
    /* renamed from: com.beizi.ad.internal.video.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0183a {
        LEFT_TOP,
        LEFT_CENTER,
        LEFT_BOTTOM,
        CENTER_TOP,
        CENTER,
        CENTER_BOTTOM,
        RIGHT_TOP,
        RIGHT_CENTER,
        RIGHT_BOTTOM
    }

    /* compiled from: AdVideoManager.java */
    /* loaded from: classes2.dex */
    public enum b {
        NONE,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        LEFT_TOP,
        LEFT_CENTER,
        LEFT_BOTTOM,
        CENTER_TOP,
        CENTER,
        CENTER_BOTTOM,
        RIGHT_TOP,
        RIGHT_CENTER,
        RIGHT_BOTTOM,
        LEFT_TOP_CROP,
        LEFT_CENTER_CROP,
        LEFT_BOTTOM_CROP,
        CENTER_TOP_CROP,
        CENTER_CROP,
        CENTER_BOTTOM_CROP,
        RIGHT_TOP_CROP,
        RIGHT_CENTER_CROP,
        RIGHT_BOTTOM_CROP,
        START_INSIDE,
        CENTER_INSIDE,
        END_INSIDE
    }

    /* compiled from: AdVideoManager.java */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private int f6174a;

        /* renamed from: b  reason: collision with root package name */
        private int f6175b;

        public c(int i4, int i5) {
            this.f6174a = i4;
            this.f6175b = i5;
        }

        public int a() {
            return this.f6174a;
        }

        public int b() {
            return this.f6175b;
        }
    }

    public a(c cVar, c cVar2) {
        this.f6134a = cVar;
        this.f6135b = cVar2;
    }

    private Matrix b() {
        return a(1.0f, 1.0f, EnumC0183a.LEFT_TOP);
    }

    private Matrix c() {
        return a(EnumC0183a.LEFT_TOP);
    }

    private Matrix d() {
        return a(EnumC0183a.CENTER);
    }

    private Matrix e() {
        return a(EnumC0183a.RIGHT_BOTTOM);
    }

    private Matrix f() {
        if (this.f6135b.b() <= this.f6134a.a() && this.f6135b.b() <= this.f6134a.b()) {
            return b(EnumC0183a.LEFT_TOP);
        }
        return c();
    }

    private Matrix g() {
        if (this.f6135b.b() <= this.f6134a.a() && this.f6135b.b() <= this.f6134a.b()) {
            return b(EnumC0183a.CENTER);
        }
        return d();
    }

    private Matrix h() {
        if (this.f6135b.b() <= this.f6134a.a() && this.f6135b.b() <= this.f6134a.b()) {
            return b(EnumC0183a.RIGHT_BOTTOM);
        }
        return e();
    }

    public Matrix a(b bVar) {
        switch (AnonymousClass1.f6136a[bVar.ordinal()]) {
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return d();
            case 4:
                return c();
            case 5:
                return e();
            case 6:
                return b(EnumC0183a.LEFT_TOP);
            case 7:
                return b(EnumC0183a.LEFT_CENTER);
            case 8:
                return b(EnumC0183a.LEFT_BOTTOM);
            case 9:
                return b(EnumC0183a.CENTER_TOP);
            case 10:
                return b(EnumC0183a.CENTER);
            case 11:
                return b(EnumC0183a.CENTER_BOTTOM);
            case 12:
                return b(EnumC0183a.RIGHT_TOP);
            case 13:
                return b(EnumC0183a.RIGHT_CENTER);
            case 14:
                return b(EnumC0183a.RIGHT_BOTTOM);
            case 15:
                return c(EnumC0183a.LEFT_TOP);
            case 16:
                return c(EnumC0183a.LEFT_CENTER);
            case 17:
                return c(EnumC0183a.LEFT_BOTTOM);
            case 18:
                return c(EnumC0183a.CENTER_TOP);
            case 19:
                return c(EnumC0183a.CENTER);
            case 20:
                return c(EnumC0183a.CENTER_BOTTOM);
            case 21:
                return c(EnumC0183a.RIGHT_TOP);
            case 22:
                return c(EnumC0183a.RIGHT_CENTER);
            case 23:
                return c(EnumC0183a.RIGHT_BOTTOM);
            case 24:
                return f();
            case 25:
                return g();
            case 26:
                return h();
            default:
                return null;
        }
    }

    private Matrix b(EnumC0183a enumC0183a) {
        return a(this.f6135b.a() / this.f6134a.a(), this.f6135b.b() / this.f6134a.b(), enumC0183a);
    }

    private Matrix c(EnumC0183a enumC0183a) {
        float a5 = this.f6134a.a() / this.f6135b.a();
        float b5 = this.f6134a.b() / this.f6135b.b();
        float max = Math.max(a5, b5);
        return a(max / a5, max / b5, enumC0183a);
    }

    private Matrix a(float f5, float f6, float f7, float f8) {
        Matrix matrix = new Matrix();
        matrix.setScale(f5, f6, f7, f8);
        return matrix;
    }

    private Matrix a(float f5, float f6, EnumC0183a enumC0183a) {
        switch (AnonymousClass1.f6137b[enumC0183a.ordinal()]) {
            case 1:
                return a(f5, f6, 0.0f, 0.0f);
            case 2:
                return a(f5, f6, 0.0f, this.f6134a.b() / 2.0f);
            case 3:
                return a(f5, f6, 0.0f, this.f6134a.b());
            case 4:
                return a(f5, f6, this.f6134a.a() / 2.0f, 0.0f);
            case 5:
                return a(f5, f6, this.f6134a.a() / 2.0f, this.f6134a.b() / 2.0f);
            case 6:
                return a(f5, f6, this.f6134a.a() / 2.0f, this.f6134a.b());
            case 7:
                return a(f5, f6, this.f6134a.a(), 0.0f);
            case 8:
                return a(f5, f6, this.f6134a.a(), this.f6134a.b() / 2.0f);
            case 9:
                return a(f5, f6, this.f6134a.a(), this.f6134a.b());
            default:
                throw new IllegalArgumentException("Illegal PivotPoint");
        }
    }

    private Matrix a() {
        return a(this.f6135b.a() / this.f6134a.a(), this.f6135b.b() / this.f6134a.b(), EnumC0183a.LEFT_TOP);
    }

    private Matrix a(EnumC0183a enumC0183a) {
        float a5 = this.f6134a.a() / this.f6135b.a();
        float b5 = this.f6134a.b() / this.f6135b.b();
        float min = Math.min(a5, b5);
        return a(min / a5, min / b5, enumC0183a);
    }
}
