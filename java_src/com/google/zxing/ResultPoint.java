package com.google.zxing;

import io.netty.util.internal.StringUtil;
/* loaded from: classes3.dex */
public class ResultPoint {

    /* renamed from: x  reason: collision with root package name */
    private final float f13137x;

    /* renamed from: y  reason: collision with root package name */
    private final float f13138y;

    public ResultPoint(float f5, float f6) {
        this.f13137x = f5;
        this.f13138y = f6;
    }

    private static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f5 = resultPoint2.f13137x;
        float f6 = resultPoint2.f13138y;
        return ((resultPoint3.f13137x - f5) * (resultPoint.f13138y - f6)) - ((resultPoint3.f13138y - f6) * (resultPoint.f13137x - f5));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float f5 = resultPoint.f13137x - resultPoint2.f13137x;
        float f6 = resultPoint.f13138y - resultPoint2.f13138y;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float distance = distance(resultPointArr[0], resultPointArr[1]);
        float distance2 = distance(resultPointArr[1], resultPointArr[2]);
        float distance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (distance2 >= distance && distance2 >= distance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (distance3 >= distance2 && distance3 >= distance) {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        } else {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        }
        if (crossProductZ(resultPoint2, resultPoint, resultPoint3) < 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            return this.f13137x == resultPoint.f13137x && this.f13138y == resultPoint.f13138y;
        }
        return false;
    }

    public final float getX() {
        return this.f13137x;
    }

    public final float getY() {
        return this.f13138y;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f13137x) * 31) + Float.floatToIntBits(this.f13138y);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(25);
        sb.append('(');
        sb.append(this.f13137x);
        sb.append(StringUtil.COMMA);
        sb.append(this.f13138y);
        sb.append(')');
        return sb.toString();
    }
}
