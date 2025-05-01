package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;
/* compiled from: FadeDrawable.java */
/* loaded from: classes2.dex */
public class g extends a {
    @VisibleForTesting

    /* renamed from: u  reason: collision with root package name */
    public static final int f11200u = 0;
    @VisibleForTesting

    /* renamed from: v  reason: collision with root package name */
    public static final int f11201v = 1;
    @VisibleForTesting

    /* renamed from: w  reason: collision with root package name */
    public static final int f11202w = 2;

    /* renamed from: j  reason: collision with root package name */
    private final Drawable[] f11203j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f11204k;

    /* renamed from: l  reason: collision with root package name */
    private final int f11205l;
    @VisibleForTesting

    /* renamed from: m  reason: collision with root package name */
    int f11206m;
    @VisibleForTesting

    /* renamed from: n  reason: collision with root package name */
    int f11207n;
    @VisibleForTesting

    /* renamed from: o  reason: collision with root package name */
    long f11208o;
    @VisibleForTesting

    /* renamed from: p  reason: collision with root package name */
    int[] f11209p;
    @VisibleForTesting

    /* renamed from: q  reason: collision with root package name */
    int[] f11210q;
    @VisibleForTesting

    /* renamed from: r  reason: collision with root package name */
    int f11211r;
    @VisibleForTesting

    /* renamed from: s  reason: collision with root package name */
    boolean[] f11212s;
    @VisibleForTesting

    /* renamed from: t  reason: collision with root package name */
    int f11213t;

    public g(Drawable[] drawableArr) {
        this(drawableArr, false);
    }

    private void i(Canvas canvas, Drawable drawable, int i4) {
        if (drawable == null || i4 <= 0) {
            return;
        }
        this.f11213t++;
        drawable.mutate().setAlpha(i4);
        this.f11213t--;
        drawable.draw(canvas);
    }

    private void x() {
        this.f11206m = 2;
        Arrays.fill(this.f11209p, this.f11205l);
        this.f11209p[0] = 255;
        Arrays.fill(this.f11210q, this.f11205l);
        this.f11210q[0] = 255;
        Arrays.fill(this.f11212s, this.f11204k);
        this.f11212s[0] = true;
    }

    private boolean z(float f5) {
        boolean z4 = true;
        for (int i4 = 0; i4 < this.f11203j.length; i4++) {
            boolean[] zArr = this.f11212s;
            int i5 = zArr[i4] ? 1 : -1;
            int[] iArr = this.f11210q;
            iArr[i4] = (int) (this.f11209p[i4] + (i5 * 255 * f5));
            if (iArr[i4] < 0) {
                iArr[i4] = 0;
            }
            if (iArr[i4] > 255) {
                iArr[i4] = 255;
            }
            if (zArr[i4] && iArr[i4] < 255) {
                z4 = false;
            }
            if (!zArr[i4] && iArr[i4] > 0) {
                z4 = false;
            }
        }
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[LOOP:0: B:25:0x004e->B:27:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[EDGE_INSN: B:31:0x0065->B:28:0x0065 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.drawee.drawable.a, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f11206m
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 == r3) goto La
            goto L4e
        La:
            int r0 = r8.f11207n
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.facebook.common.internal.h.o(r0)
            long r4 = r8.s()
            long r6 = r8.f11208o
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.f11207n
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.z(r0)
            if (r0 == 0) goto L27
            goto L28
        L27:
            r1 = 1
        L28:
            r8.f11206m = r1
            goto L4d
        L2b:
            int[] r0 = r8.f11210q
            int[] r4 = r8.f11209p
            android.graphics.drawable.Drawable[] r5 = r8.f11203j
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.s()
            r8.f11208o = r4
            int r0 = r8.f11207n
            if (r0 != 0) goto L42
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L43
        L42:
            r0 = 0
        L43:
            boolean r0 = r8.z(r0)
            if (r0 == 0) goto L4a
            goto L4b
        L4a:
            r1 = 1
        L4b:
            r8.f11206m = r1
        L4d:
            r3 = r0
        L4e:
            android.graphics.drawable.Drawable[] r0 = r8.f11203j
            int r1 = r0.length
            if (r2 >= r1) goto L65
            r0 = r0[r2]
            int[] r1 = r8.f11210q
            r1 = r1[r2]
            int r4 = r8.f11211r
            int r1 = r1 * r4
            int r1 = r1 / 255
            r8.i(r9, r0, r1)
            int r2 = r2 + 1
            goto L4e
        L65:
            if (r3 != 0) goto L6a
            r8.invalidateSelf()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.drawable.g.draw(android.graphics.Canvas):void");
    }

    public void g() {
        this.f11213t++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f11211r;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f11213t == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.f11213t--;
        invalidateSelf();
    }

    public void k() {
        this.f11206m = 0;
        Arrays.fill(this.f11212s, true);
        invalidateSelf();
    }

    public void l(int i4) {
        this.f11206m = 0;
        this.f11212s[i4] = true;
        invalidateSelf();
    }

    public void m() {
        this.f11206m = 0;
        Arrays.fill(this.f11212s, false);
        invalidateSelf();
    }

    public void o(int i4) {
        this.f11206m = 0;
        this.f11212s[i4] = false;
        invalidateSelf();
    }

    public void p(int i4) {
        this.f11206m = 0;
        Arrays.fill(this.f11212s, false);
        this.f11212s[i4] = true;
        invalidateSelf();
    }

    public void q(int i4) {
        this.f11206m = 0;
        int i5 = i4 + 1;
        Arrays.fill(this.f11212s, 0, i5, true);
        Arrays.fill(this.f11212s, i5, this.f11203j.length, false);
        invalidateSelf();
    }

    public void r() {
        this.f11206m = 2;
        for (int i4 = 0; i4 < this.f11203j.length; i4++) {
            this.f11210q[i4] = this.f11212s[i4] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long s() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.facebook.drawee.drawable.a, android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (this.f11211r != i4) {
            this.f11211r = i4;
            invalidateSelf();
        }
    }

    public int t() {
        return this.f11207n;
    }

    @VisibleForTesting
    public int u() {
        return this.f11206m;
    }

    public boolean v(int i4) {
        return this.f11212s[i4];
    }

    public void w() {
        x();
        invalidateSelf();
    }

    public void y(int i4) {
        this.f11207n = i4;
        if (this.f11206m == 1) {
            this.f11206m = 0;
        }
    }

    public g(Drawable[] drawableArr, boolean z4) {
        super(drawableArr);
        com.facebook.common.internal.h.p(drawableArr.length >= 1, "At least one layer required!");
        this.f11203j = drawableArr;
        this.f11209p = new int[drawableArr.length];
        this.f11210q = new int[drawableArr.length];
        this.f11211r = 255;
        this.f11212s = new boolean[drawableArr.length];
        this.f11213t = 0;
        this.f11204k = z4;
        this.f11205l = z4 ? 255 : 0;
        x();
    }
}
