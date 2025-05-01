package com.join.android.app.common.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: BitMapUtils.java */
/* loaded from: classes3.dex */
public class f {
    public static Bitmap a(Bitmap bitmap) {
        float f5;
        float f6;
        float f7;
        float f8;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            f8 = width / 2;
            f7 = width;
            f6 = f7;
            f5 = 0.0f;
        } else {
            f5 = (width - height) / 2;
            f6 = height;
            f7 = width - f5;
            width = height;
            f8 = height / 2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect((int) f5, (int) 0.0f, (int) f7, (int) f6);
        Rect rect2 = new Rect((int) 0.0f, (int) 0.0f, (int) f6, (int) f6);
        RectF rectF = new RectF(rect2);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f8, f8, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return createBitmap;
    }

    public static void b(ImageView imageView, Drawable drawable) {
        float f5;
        float f6;
        float f7;
        float f8;
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            f8 = width / 2;
            f7 = width;
            f6 = f7;
            f5 = 0.0f;
        } else {
            f5 = (width - height) / 2;
            f6 = height;
            f7 = width - f5;
            width = height;
            f8 = height / 2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect((int) f5, (int) 0.0f, (int) f7, (int) f6);
        Rect rect2 = new Rect((int) 0.0f, (int) 0.0f, (int) f6, (int) f6);
        RectF rectF = new RectF(rect2);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f8, f8, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        imageView.setImageBitmap(createBitmap);
    }
}
