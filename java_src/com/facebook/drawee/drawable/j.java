package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
/* compiled from: OrientedDrawable.java */
/* loaded from: classes2.dex */
public class j extends h {
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    final Matrix f11222f;

    /* renamed from: g  reason: collision with root package name */
    private int f11223g;

    /* renamed from: h  reason: collision with root package name */
    private int f11224h;

    /* renamed from: i  reason: collision with root package name */
    private final Matrix f11225i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f11226j;

    public j(Drawable drawable, int i4) {
        this(drawable, i4, 0);
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i4;
        if (this.f11223g <= 0 && ((i4 = this.f11224h) == 0 || i4 == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f11222f);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.facebook.drawee.drawable.h, com.facebook.drawee.drawable.t
    public void e(Matrix matrix) {
        s(matrix);
        if (this.f11222f.isIdentity()) {
            return;
        }
        matrix.preConcat(this.f11222f);
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i4 = this.f11224h;
        if (i4 != 5 && i4 != 7 && this.f11223g % 180 == 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i4 = this.f11224h;
        if (i4 != 5 && i4 != 7 && this.f11223g % 180 == 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i4;
        Drawable current = getCurrent();
        int i5 = this.f11223g;
        if (i5 <= 0 && ((i4 = this.f11224h) == 0 || i4 == 1)) {
            current.setBounds(rect);
            return;
        }
        int i6 = this.f11224h;
        if (i6 == 2) {
            this.f11222f.setScale(-1.0f, 1.0f);
        } else if (i6 == 7) {
            this.f11222f.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f11222f.postScale(-1.0f, 1.0f);
        } else if (i6 == 4) {
            this.f11222f.setScale(1.0f, -1.0f);
        } else if (i6 != 5) {
            this.f11222f.setRotate(i5, rect.centerX(), rect.centerY());
        } else {
            this.f11222f.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f11222f.postScale(1.0f, -1.0f);
        }
        this.f11225i.reset();
        this.f11222f.invert(this.f11225i);
        this.f11226j.set(rect);
        this.f11225i.mapRect(this.f11226j);
        RectF rectF = this.f11226j;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public j(Drawable drawable, int i4, int i5) {
        super(drawable);
        this.f11225i = new Matrix();
        this.f11226j = new RectF();
        boolean z4 = true;
        com.facebook.common.internal.h.d(i4 % 90 == 0);
        com.facebook.common.internal.h.d((i5 < 0 || i5 > 8) ? false : false);
        this.f11222f = new Matrix();
        this.f11223g = i4;
        this.f11224h = i5;
    }
}
