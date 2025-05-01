package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.facebook.common.internal.VisibleForTesting;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;
/* compiled from: RoundedBitmapDrawable.java */
/* loaded from: classes.dex */
public class m extends o {
    private final Paint D;
    private final Paint E;
    @Nullable
    private final Bitmap F;
    private WeakReference<Bitmap> G;

    public m(Resources resources, @Nullable Bitmap bitmap, @Nullable Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.D = paint2;
        Paint paint3 = new Paint(1);
        this.E = paint3;
        this.F = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    public static m n(Resources resources, BitmapDrawable bitmapDrawable) {
        return new m(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
    }

    private void p() {
        WeakReference<Bitmap> weakReference = this.G;
        if (weakReference == null || weakReference.get() != this.F) {
            this.G = new WeakReference<>(this.F);
            Paint paint = this.D;
            Bitmap bitmap = this.F;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f11257g = true;
        }
        if (this.f11257g) {
            this.D.getShader().setLocalMatrix(this.f11275y);
            this.f11257g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.drawee.drawable.o
    @VisibleForTesting
    public boolean d() {
        return super.d() && this.F != null;
    }

    @Override // com.facebook.drawee.drawable.o, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("RoundedBitmapDrawable#draw");
        }
        if (!d()) {
            super.draw(canvas);
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
                return;
            }
            return;
        }
        f();
        e();
        p();
        int save = canvas.save();
        canvas.concat(this.f11272v);
        canvas.drawPath(this.f11256f, this.D);
        float f5 = this.f11255e;
        if (f5 > 0.0f) {
            this.E.setStrokeWidth(f5);
            this.E.setColor(f.d(this.f11258h, this.D.getAlpha()));
            canvas.drawPath(this.f11259i, this.E);
        }
        canvas.restoreToCount(save);
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    Paint o() {
        return this.D;
    }

    @Override // com.facebook.drawee.drawable.o, android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        super.setAlpha(i4);
        if (i4 != this.D.getAlpha()) {
            this.D.setAlpha(i4);
            super.setAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.o, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.D.setColorFilter(colorFilter);
    }

    public m(Resources resources, Bitmap bitmap) {
        this(resources, bitmap, null);
    }
}
