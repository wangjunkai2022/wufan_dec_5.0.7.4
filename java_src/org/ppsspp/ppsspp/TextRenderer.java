package org.ppsspp.ppsspp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
/* loaded from: classes7.dex */
public class TextRenderer {
    private static final String TAG = "TextRenderer";
    private static Paint bg;

    /* renamed from: p  reason: collision with root package name */
    private static Paint f72927p;
    private static Typeface robotoCondensed;

    static {
        Paint paint = new Paint(129);
        f72927p = paint;
        paint.setColor(-1);
        Paint paint2 = new Paint();
        bg = paint2;
        paint2.setColor(-16777216);
    }

    public static void init(Context context) {
        Typeface createFromFile = Typeface.createFromFile(NativeActivity.assetsPath + "Roboto-Condensed.ttf");
        robotoCondensed = createFromFile;
        if (createFromFile != null) {
            f72927p.setTypeface(robotoCondensed);
        }
    }

    private static Point measure(String str, double d5) {
        String[] split = str.replaceAll("\\r", "").split("\n");
        Point point = new Point();
        point.x = 0;
        for (String str2 : split) {
            point.x = Math.max(measureLine(str2, d5).x, point.x);
        }
        point.y = (((int) (f72927p.descent() - f72927p.ascent())) * split.length) + 2;
        return point;
    }

    private static Point measureLine(String str, double d5) {
        int i4;
        if (str.length() > 0) {
            f72927p.setTextSize((float) d5);
            i4 = (((int) f72927p.measureText(str)) + 5) & (-2);
        } else {
            i4 = 1;
        }
        Point point = new Point();
        point.x = i4;
        point.y = (int) ((f72927p.descent() - f72927p.ascent()) + 2.0f);
        return point;
    }

    public static int measureText(String str, double d5) {
        Point measure = measure(str, d5);
        return measure.y | (measure.x << 16);
    }

    public static int[] renderText(String str, double d5) {
        String[] split;
        Point measure = measure(str, d5);
        int i4 = measure.x;
        int i5 = measure.y;
        int i6 = i4 == 0 ? 1 : i4;
        int i7 = i5 == 0 ? 1 : i5;
        Bitmap createBitmap = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawRect(0.0f, 0.0f, i6, i7, bg);
        float f5 = 1.0f;
        for (String str2 : str.replaceAll("\\r", "").split("\n")) {
            if (str2.length() > 0) {
                canvas.drawText(str2, 1.0f, (-f72927p.ascent()) + f5, f72927p);
            }
            f5 += f72927p.descent() - f72927p.ascent();
        }
        int[] iArr = new int[i6 * i7];
        createBitmap.getPixels(iArr, 0, i6, 0, 0, i6, i7);
        createBitmap.recycle();
        return iArr;
    }
}
