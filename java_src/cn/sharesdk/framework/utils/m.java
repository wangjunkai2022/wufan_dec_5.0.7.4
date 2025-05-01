package cn.sharesdk.framework.utils;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
/* compiled from: ViewRound.java */
/* loaded from: classes2.dex */
public class m {
    public static ShapeDrawable a(float f5, int i4) {
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        for (int i5 = 0; i5 < 8; i5++) {
            fArr[i5] = 0.0f + f5;
            fArr2[i5] = f5;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr2));
        shapeDrawable.getPaint().setColor(i4);
        return shapeDrawable;
    }
}
