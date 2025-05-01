package com.beizi.fusion.g;
/* compiled from: RandomUtils.java */
/* loaded from: classes2.dex */
public class al {
    public static boolean a(int i4) {
        return ((int) ((Math.random() * 100.0d) + 1.0d)) <= i4;
    }

    public static int b(int i4) {
        double random = Math.random();
        double d5 = i4;
        Double.isNaN(d5);
        return (int) ((random * d5) + 1.0d);
    }

    public static int[] a(int i4, int i5) {
        double d5;
        double d6;
        int[] iArr = new int[2];
        boolean z4 = false;
        while (!z4) {
            Double.isNaN(i4 * 2);
            double rint = Math.rint(b(0, (int) (d5 * 0.95d)));
            Double.isNaN(i5 * 2);
            double rint2 = Math.rint(b(0, (int) (d6 * 0.95d)));
            double d7 = i4;
            double d8 = i5;
            Double.isNaN(d7);
            Double.isNaN(d8);
            if (a(d7, d8, rint, rint2, d7 * 0.9d, d8 * 0.9d) <= 1.0d) {
                iArr[0] = (int) rint;
                iArr[1] = (int) rint2;
                z4 = true;
            }
        }
        return iArr;
    }

    private static int b(int i4, int i5) {
        double random = Math.random();
        double d5 = i5 - i4;
        Double.isNaN(d5);
        double d6 = i4;
        Double.isNaN(d6);
        return (int) ((random * d5) + d6);
    }

    private static double a(double d5, double d6, double d7, double d8, double d9, double d10) {
        return (Math.pow(d7 - d5, 2.0d) / Math.pow(d9, 2.0d)) + (Math.pow(d8 - d6, 2.0d) / Math.pow(d10, 2.0d));
    }
}
