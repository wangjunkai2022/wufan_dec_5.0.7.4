package com.aggmoread.sdk.z.a.m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
/* loaded from: classes2.dex */
public class j {
    public static Bitmap a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static Drawable a(Resources resources, String str) {
        Bitmap a5 = a(str);
        if (a5 != null) {
            return new BitmapDrawable(resources, a5);
        }
        return null;
    }

    public static GradientDrawable.Orientation a(int i4) {
        int i5 = ((i4 % 360) + 360) % 360;
        return i5 != 0 ? i5 != 45 ? i5 != 90 ? i5 != 135 ? i5 != 180 ? i5 != 225 ? i5 != 315 ? GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.TR_BL : GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.BR_TL : GradientDrawable.Orientation.BOTTOM_TOP : GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.LEFT_RIGHT;
    }

    public static GradientDrawable a(Context context, int i4, int i5, int i6, int i7, int i8) {
        return a(context, 0, 0, i4, i5, i6, i7, i8);
    }

    public static GradientDrawable a(Context context, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        if (i4 > 0 || i5 > 0) {
            gradientDrawable.setSize(i4, i5);
        }
        gradientDrawable.setColor(Color.argb(i6, i7, i8, i9));
        gradientDrawable.setCornerRadius(b.a(context, i10) * 1.0f);
        return gradientDrawable;
    }

    public static void a(View view, Context context, int i4, int i5, int i6, int i7, int i8) {
        GradientDrawable a5 = a(context, i4, i5, i6, i7, i8);
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(a5);
        } else {
            view.setBackgroundDrawable(a5);
        }
    }

    public static void a(ImageView imageView, String str) {
        Bitmap a5;
        if (imageView == null || (a5 = a(str)) == null) {
            return;
        }
        imageView.setImageBitmap(a5);
    }

    public static int[] a(int i4, int i5, int i6) {
        return i5 != -1 ? new int[]{i4, i5, i6} : new int[]{i4, i6};
    }
}
