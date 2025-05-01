package com.androidquery.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class RatioDrawable extends BitmapDrawable {
    private boolean adjusted;
    private float anchor;

    /* renamed from: m  reason: collision with root package name */
    private Matrix f5079m;
    private float ratio;
    private WeakReference<ImageView> ref;

    /* renamed from: w  reason: collision with root package name */
    private int f5080w;

    public RatioDrawable(Resources resources, Bitmap bitmap, ImageView imageView, float f5, float f6) {
        super(resources, bitmap);
        this.ref = new WeakReference<>(imageView);
        this.ratio = f5;
        this.anchor = f6;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(new Matrix());
        adjust(imageView, bitmap, false);
    }

    private void adjust(ImageView imageView, Bitmap bitmap, boolean z4) {
        int width = getWidth(imageView);
        if (width <= 0) {
            return;
        }
        int targetHeight = targetHeight(bitmap.getWidth(), bitmap.getHeight(), width) + imageView.getPaddingTop() + imageView.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (targetHeight != layoutParams.height) {
            layoutParams.height = targetHeight;
            imageView.setLayoutParams(layoutParams);
        }
        if (z4) {
            this.adjusted = true;
        }
    }

    private Matrix getMatrix(ImageView imageView, Bitmap bitmap) {
        float f5;
        float f6;
        int width = bitmap.getWidth();
        Matrix matrix = this.f5079m;
        if (matrix == null || width != this.f5080w) {
            int height = bitmap.getHeight();
            int width2 = getWidth(imageView);
            int targetHeight = targetHeight(width, height, width2);
            if (width <= 0 || height <= 0 || width2 <= 0 || targetHeight <= 0) {
                return null;
            }
            if (this.f5079m == null || width != this.f5080w) {
                this.f5079m = new Matrix();
                float f7 = 0.0f;
                if (width * targetHeight >= width2 * height) {
                    f5 = targetHeight / height;
                    f7 = (width2 - (width * f5)) * 0.5f;
                    f6 = 0.0f;
                } else {
                    float f8 = width2 / width;
                    float yOffset = (targetHeight - (height * f8)) * getYOffset(width, height);
                    f5 = f8;
                    f6 = yOffset;
                }
                this.f5079m.setScale(f5, f5);
                this.f5079m.postTranslate(f7, f6);
                this.f5080w = width;
            }
            return this.f5079m;
        }
        return matrix;
    }

    private int getWidth(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i4 = layoutParams != null ? layoutParams.width : 0;
        if (i4 <= 0) {
            i4 = imageView.getWidth();
        }
        return i4 > 0 ? (i4 - imageView.getPaddingLeft()) - imageView.getPaddingRight() : i4;
    }

    private float getYOffset(int i4, int i5) {
        float f5 = this.anchor;
        return f5 != Float.MAX_VALUE ? (1.0f - f5) / 2.0f : ((1.5f - Math.max(1.0f, Math.min(1.5f, i5 / i4))) / 2.0f) + 0.25f;
    }

    private int targetHeight(int i4, int i5, int i6) {
        float f5 = this.ratio;
        if (f5 == Float.MAX_VALUE) {
            f5 = i5 / i4;
        }
        return (int) (i6 * f5);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        WeakReference<ImageView> weakReference = this.ref;
        ImageView imageView = weakReference != null ? weakReference.get() : null;
        if (this.ratio != 0.0f && imageView != null) {
            draw(canvas, imageView, getBitmap());
        } else {
            super.draw(canvas);
        }
    }

    private void draw(Canvas canvas, ImageView imageView, Bitmap bitmap) {
        Matrix matrix = getMatrix(imageView, bitmap);
        if (matrix != null) {
            int paddingTop = imageView.getPaddingTop() + imageView.getPaddingBottom();
            int paddingLeft = imageView.getPaddingLeft() + imageView.getPaddingRight();
            if (paddingTop > 0 || paddingLeft > 0) {
                canvas.clipRect(0, 0, imageView.getWidth() - paddingLeft, imageView.getHeight() - paddingTop);
            }
            canvas.drawBitmap(bitmap, matrix, getPaint());
        }
        if (this.adjusted) {
            return;
        }
        adjust(imageView, bitmap, true);
    }
}
