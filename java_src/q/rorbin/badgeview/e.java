package q.rorbin.badgeview;

import android.graphics.PointF;
import java.util.List;
/* compiled from: MathUtil.java */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final double f73177a = 6.283185307179586d;

    public static void a(PointF pointF, float f5, Double d5, List<PointF> list) {
        float f6;
        if (d5 != null) {
            double atan = (float) Math.atan(d5.doubleValue());
            double cos = Math.cos(atan);
            double d6 = f5;
            Double.isNaN(d6);
            double sin = Math.sin(atan);
            Double.isNaN(d6);
            f6 = (float) (sin * d6);
            f5 = (float) (cos * d6);
        } else {
            f6 = 0.0f;
        }
        list.add(new PointF(pointF.x + f5, pointF.y + f6));
        list.add(new PointF(pointF.x - f5, pointF.y - f6));
    }

    public static float b(PointF pointF, PointF pointF2) {
        return (float) Math.sqrt(Math.pow(pointF.x - pointF2.x, 2.0d) + Math.pow(pointF.y - pointF2.y, 2.0d));
    }

    public static int c(PointF pointF, PointF pointF2) {
        float f5 = pointF.x;
        float f6 = pointF2.x;
        if (f5 > f6) {
            float f7 = pointF.y;
            float f8 = pointF2.y;
            if (f7 > f8) {
                return 4;
            }
            return f7 < f8 ? 1 : -1;
        } else if (f5 < f6) {
            float f9 = pointF.y;
            float f10 = pointF2.y;
            if (f9 > f10) {
                return 3;
            }
            return f9 < f10 ? 2 : -1;
        } else {
            return -1;
        }
    }

    public static double d(double d5, int i4) {
        if (d5 < 0.0d) {
            d5 += 1.5707963267948966d;
        }
        double d6 = i4 - 1;
        Double.isNaN(d6);
        return d5 + (d6 * 1.5707963267948966d);
    }

    public static double e(double d5) {
        return (d5 / 6.283185307179586d) * 360.0d;
    }
}
