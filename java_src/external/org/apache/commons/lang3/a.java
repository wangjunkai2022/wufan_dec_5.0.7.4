package external.org.apache.commons.lang3;

import external.org.apache.commons.lang3.builder.ToStringStyle;
import external.org.apache.commons.lang3.mutable.MutableInt;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ArrayUtils.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f68833a = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f68834b = new Class[0];

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f68835c = new String[0];

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f68836d = new long[0];

    /* renamed from: e  reason: collision with root package name */
    public static final Long[] f68837e = new Long[0];

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f68838f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final Integer[] f68839g = new Integer[0];

    /* renamed from: h  reason: collision with root package name */
    public static final short[] f68840h = new short[0];

    /* renamed from: i  reason: collision with root package name */
    public static final Short[] f68841i = new Short[0];

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f68842j = new byte[0];

    /* renamed from: k  reason: collision with root package name */
    public static final Byte[] f68843k = new Byte[0];

    /* renamed from: l  reason: collision with root package name */
    public static final double[] f68844l = new double[0];

    /* renamed from: m  reason: collision with root package name */
    public static final Double[] f68845m = new Double[0];

    /* renamed from: n  reason: collision with root package name */
    public static final float[] f68846n = new float[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Float[] f68847o = new Float[0];

    /* renamed from: p  reason: collision with root package name */
    public static final boolean[] f68848p = new boolean[0];

    /* renamed from: q  reason: collision with root package name */
    public static final Boolean[] f68849q = new Boolean[0];

    /* renamed from: r  reason: collision with root package name */
    public static final char[] f68850r = new char[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Character[] f68851s = new Character[0];

    /* renamed from: t  reason: collision with root package name */
    public static final int f68852t = -1;

    public static short[] A(short[] sArr, short... sArr2) {
        if (sArr == null) {
            return J(sArr2);
        }
        if (sArr2 == null) {
            return J(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static boolean A0(short[] sArr) {
        return sArr == null || sArr.length == 0;
    }

    public static Float[] A1(Float[] fArr) {
        return (fArr == null || fArr.length == 0) ? f68847o : fArr;
    }

    public static void A2(Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            Object obj = objArr[length];
            objArr[length] = objArr[i4];
            objArr[i4] = obj;
            length--;
        }
    }

    public static boolean[] B(boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return K(zArr2);
        }
        if (zArr2 == null) {
            return K(zArr);
        }
        boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
        System.arraycopy(zArr, 0, zArr3, 0, zArr.length);
        System.arraycopy(zArr2, 0, zArr3, zArr.length, zArr2.length);
        return zArr3;
    }

    public static boolean B0(boolean[] zArr) {
        return zArr == null || zArr.length == 0;
    }

    public static Integer[] B1(Integer[] numArr) {
        return (numArr == null || numArr.length == 0) ? f68839g : numArr;
    }

    public static void B2(short[] sArr) {
        if (sArr == null) {
            return;
        }
        int length = sArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            short s4 = sArr[length];
            sArr[length] = sArr[i4];
            sArr[i4] = s4;
            length--;
        }
    }

    public static byte[] C(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static boolean C0(Object obj, Object obj2) {
        return new external.org.apache.commons.lang3.builder.c().g(obj, obj2).w();
    }

    public static Long[] C1(Long[] lArr) {
        return (lArr == null || lArr.length == 0) ? f68837e : lArr;
    }

    public static void C2(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        int length = zArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            boolean z4 = zArr[length];
            zArr[length] = zArr[i4];
            zArr[i4] = z4;
            length--;
        }
    }

    public static char[] D(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    public static boolean D0(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? false : true;
    }

    public static Object[] D1(Object[] objArr) {
        return (objArr == null || objArr.length == 0) ? f68833a : objArr;
    }

    public static byte[] D2(byte[] bArr, int i4, int i5) {
        if (bArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > bArr.length) {
            i5 = bArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f68842j;
        }
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        return bArr2;
    }

    public static double[] E(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return (double[]) dArr.clone();
    }

    public static boolean E0(char[] cArr) {
        return (cArr == null || cArr.length == 0) ? false : true;
    }

    public static Short[] E1(Short[] shArr) {
        return (shArr == null || shArr.length == 0) ? f68841i : shArr;
    }

    public static char[] E2(char[] cArr, int i4, int i5) {
        if (cArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > cArr.length) {
            i5 = cArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f68850r;
        }
        char[] cArr2 = new char[i6];
        System.arraycopy(cArr, i4, cArr2, 0, i6);
        return cArr2;
    }

    public static float[] F(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return (float[]) fArr.clone();
    }

    public static boolean F0(double[] dArr) {
        return (dArr == null || dArr.length == 0) ? false : true;
    }

    public static String[] F1(String[] strArr) {
        return (strArr == null || strArr.length == 0) ? f68835c : strArr;
    }

    public static double[] F2(double[] dArr, int i4, int i5) {
        if (dArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > dArr.length) {
            i5 = dArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f68844l;
        }
        double[] dArr2 = new double[i6];
        System.arraycopy(dArr, i4, dArr2, 0, i6);
        return dArr2;
    }

    public static int[] G(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static boolean G0(float[] fArr) {
        return (fArr == null || fArr.length == 0) ? false : true;
    }

    public static short[] G1(short[] sArr) {
        return (sArr == null || sArr.length == 0) ? f68840h : sArr;
    }

    public static float[] G2(float[] fArr, int i4, int i5) {
        if (fArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > fArr.length) {
            i5 = fArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f68846n;
        }
        float[] fArr2 = new float[i6];
        System.arraycopy(fArr, i4, fArr2, 0, i6);
        return fArr2;
    }

    public static long[] H(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static boolean H0(int[] iArr) {
        return (iArr == null || iArr.length == 0) ? false : true;
    }

    public static boolean[] H1(boolean[] zArr) {
        return (zArr == null || zArr.length == 0) ? f68848p : zArr;
    }

    public static int[] H2(int[] iArr, int i4, int i5) {
        if (iArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > iArr.length) {
            i5 = iArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f68838f;
        }
        int[] iArr2 = new int[i6];
        System.arraycopy(iArr, i4, iArr2, 0, i6);
        return iArr2;
    }

    public static <T> T[] I(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    public static boolean I0(long[] jArr) {
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    private static Object I1(Object obj, int i4) {
        int X = X(obj);
        if (i4 >= 0 && i4 < X) {
            int i5 = X - 1;
            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i5);
            System.arraycopy(obj, 0, newInstance, 0, i4);
            if (i4 < i5) {
                System.arraycopy(obj, i4 + 1, newInstance, i4, (X - i4) - 1);
            }
            return newInstance;
        }
        throw new IndexOutOfBoundsException("Index: " + i4 + ", Length: " + X);
    }

    public static long[] I2(long[] jArr, int i4, int i5) {
        if (jArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > jArr.length) {
            i5 = jArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f68836d;
        }
        long[] jArr2 = new long[i6];
        System.arraycopy(jArr, i4, jArr2, 0, i6);
        return jArr2;
    }

    public static short[] J(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static <T> boolean J0(T[] tArr) {
        return (tArr == null || tArr.length == 0) ? false : true;
    }

    public static byte[] J1(byte[] bArr, int i4) {
        return (byte[]) I1(bArr, i4);
    }

    public static <T> T[] J2(T[] tArr, int i4, int i5) {
        if (tArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > tArr.length) {
            i5 = tArr.length;
        }
        int i6 = i5 - i4;
        Class<?> componentType = tArr.getClass().getComponentType();
        if (i6 <= 0) {
            return (T[]) ((Object[]) Array.newInstance(componentType, 0));
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(componentType, i6));
        System.arraycopy(tArr, i4, tArr2, 0, i6);
        return tArr2;
    }

    public static boolean[] K(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public static boolean K0(short[] sArr) {
        return (sArr == null || sArr.length == 0) ? false : true;
    }

    public static char[] K1(char[] cArr, int i4) {
        return (char[]) I1(cArr, i4);
    }

    public static short[] K2(short[] sArr, int i4, int i5) {
        if (sArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > sArr.length) {
            i5 = sArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f68840h;
        }
        short[] sArr2 = new short[i6];
        System.arraycopy(sArr, i4, sArr2, 0, i6);
        return sArr2;
    }

    public static boolean L(byte[] bArr, byte b5) {
        return Z(bArr, b5) != -1;
    }

    public static boolean L0(boolean[] zArr) {
        return (zArr == null || zArr.length == 0) ? false : true;
    }

    public static double[] L1(double[] dArr, int i4) {
        return (double[]) I1(dArr, i4);
    }

    public static boolean[] L2(boolean[] zArr, int i4, int i5) {
        if (zArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > zArr.length) {
            i5 = zArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f68848p;
        }
        boolean[] zArr2 = new boolean[i6];
        System.arraycopy(zArr, i4, zArr2, 0, i6);
        return zArr2;
    }

    public static boolean M(char[] cArr, char c5) {
        return b0(cArr, c5) != -1;
    }

    public static boolean M0(byte[] bArr, byte[] bArr2) {
        if (bArr != null || bArr2 == null || bArr2.length <= 0) {
            if (bArr2 != null || bArr == null || bArr.length <= 0) {
                return bArr == null || bArr2 == null || bArr.length == bArr2.length;
            }
            return false;
        }
        return false;
    }

    public static float[] M1(float[] fArr, int i4) {
        return (float[]) I1(fArr, i4);
    }

    public static <T> T[] M2(T... tArr) {
        return tArr;
    }

    public static boolean N(double[] dArr, double d5) {
        return d0(dArr, d5) != -1;
    }

    public static boolean N0(char[] cArr, char[] cArr2) {
        if (cArr != null || cArr2 == null || cArr2.length <= 0) {
            if (cArr2 != null || cArr == null || cArr.length <= 0) {
                return cArr == null || cArr2 == null || cArr.length == cArr2.length;
            }
            return false;
        }
        return false;
    }

    public static int[] N1(int[] iArr, int i4) {
        return (int[]) I1(iArr, i4);
    }

    public static Map<Object, Object> N2(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        double length = objArr.length;
        Double.isNaN(length);
        HashMap hashMap = new HashMap((int) (length * 1.5d));
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                hashMap.put(entry.getKey(), entry.getValue());
            } else if (obj instanceof Object[]) {
                Object[] objArr2 = (Object[]) obj;
                if (objArr2.length >= 2) {
                    hashMap.put(objArr2[0], objArr2[1]);
                } else {
                    throw new IllegalArgumentException("Array element " + i4 + ", '" + obj + "', has a length less than 2");
                }
            } else {
                throw new IllegalArgumentException("Array element " + i4 + ", '" + obj + "', is neither of type Map.Entry nor an Array");
            }
        }
        return hashMap;
    }

    public static boolean O(double[] dArr, double d5, double d6) {
        return g0(dArr, d5, 0, d6) != -1;
    }

    public static boolean O0(double[] dArr, double[] dArr2) {
        if (dArr != null || dArr2 == null || dArr2.length <= 0) {
            if (dArr2 != null || dArr == null || dArr.length <= 0) {
                return dArr == null || dArr2 == null || dArr.length == dArr2.length;
            }
            return false;
        }
        return false;
    }

    public static long[] O1(long[] jArr, int i4) {
        return (long[]) I1(jArr, i4);
    }

    public static Boolean[] O2(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return f68849q;
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i4 = 0; i4 < zArr.length; i4++) {
            boolArr[i4] = zArr[i4] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    public static boolean P(float[] fArr, float f5) {
        return h0(fArr, f5) != -1;
    }

    public static boolean P0(float[] fArr, float[] fArr2) {
        if (fArr != null || fArr2 == null || fArr2.length <= 0) {
            if (fArr2 != null || fArr == null || fArr.length <= 0) {
                return fArr == null || fArr2 == null || fArr.length == fArr2.length;
            }
            return false;
        }
        return false;
    }

    public static <T> T[] P1(T[] tArr, int i4) {
        return (T[]) ((Object[]) I1(tArr, i4));
    }

    public static Byte[] P2(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f68843k;
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = Byte.valueOf(bArr[i4]);
        }
        return bArr2;
    }

    public static boolean Q(int[] iArr, int i4) {
        return j0(iArr, i4) != -1;
    }

    public static boolean Q0(int[] iArr, int[] iArr2) {
        if (iArr != null || iArr2 == null || iArr2.length <= 0) {
            if (iArr2 != null || iArr == null || iArr.length <= 0) {
                return iArr == null || iArr2 == null || iArr.length == iArr2.length;
            }
            return false;
        }
        return false;
    }

    public static short[] Q1(short[] sArr, int i4) {
        return (short[]) I1(sArr, i4);
    }

    public static Character[] Q2(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return f68851s;
        }
        Character[] chArr = new Character[cArr.length];
        for (int i4 = 0; i4 < cArr.length; i4++) {
            chArr[i4] = Character.valueOf(cArr[i4]);
        }
        return chArr;
    }

    public static boolean R(long[] jArr, long j4) {
        return l0(jArr, j4) != -1;
    }

    public static boolean R0(long[] jArr, long[] jArr2) {
        if (jArr != null || jArr2 == null || jArr2.length <= 0) {
            if (jArr2 != null || jArr == null || jArr.length <= 0) {
                return jArr == null || jArr2 == null || jArr.length == jArr2.length;
            }
            return false;
        }
        return false;
    }

    public static boolean[] R1(boolean[] zArr, int i4) {
        return (boolean[]) I1(zArr, i4);
    }

    public static Double[] R2(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f68845m;
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr2[i4] = Double.valueOf(dArr[i4]);
        }
        return dArr2;
    }

    public static boolean S(Object[] objArr, Object obj) {
        return n0(objArr, obj) != -1;
    }

    public static boolean S0(Object[] objArr, Object[] objArr2) {
        if (objArr != null || objArr2 == null || objArr2.length <= 0) {
            if (objArr2 != null || objArr == null || objArr.length <= 0) {
                return objArr == null || objArr2 == null || objArr.length == objArr2.length;
            }
            return false;
        }
        return false;
    }

    private static Object S1(Object obj, int... iArr) {
        int i4;
        int i5;
        int X = X(obj);
        if (H0(iArr)) {
            Arrays.sort(iArr);
            int length = iArr.length;
            int i6 = X;
            i4 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i5 = iArr[length];
                if (i5 < 0 || i5 >= X) {
                    break;
                } else if (i5 < i6) {
                    i4++;
                    i6 = i5;
                }
            }
            throw new IndexOutOfBoundsException("Index: " + i5 + ", Length: " + X);
        }
        i4 = 0;
        int i7 = X - i4;
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i7);
        if (i4 < X) {
            int length2 = iArr.length - 1;
            while (length2 >= 0) {
                int i8 = iArr[length2];
                int i9 = X - i8;
                if (i9 > 1) {
                    int i10 = i9 - 1;
                    i7 -= i10;
                    System.arraycopy(obj, i8 + 1, newInstance, i7, i10);
                }
                length2--;
                X = i8;
            }
            if (X > 0) {
                System.arraycopy(obj, 0, newInstance, 0, X);
            }
        }
        return newInstance;
    }

    public static Float[] S2(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f68847o;
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr2[i4] = Float.valueOf(fArr[i4]);
        }
        return fArr2;
    }

    public static boolean T(short[] sArr, short s4) {
        return p0(sArr, s4) != -1;
    }

    public static boolean T0(short[] sArr, short[] sArr2) {
        if (sArr != null || sArr2 == null || sArr2.length <= 0) {
            if (sArr2 != null || sArr == null || sArr.length <= 0) {
                return sArr == null || sArr2 == null || sArr.length == sArr2.length;
            }
            return false;
        }
        return false;
    }

    public static byte[] T1(byte[] bArr, int... iArr) {
        return (byte[]) S1(bArr, G(iArr));
    }

    public static Integer[] T2(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return f68839g;
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            numArr[i4] = Integer.valueOf(iArr[i4]);
        }
        return numArr;
    }

    public static boolean U(boolean[] zArr, boolean z4) {
        return r0(zArr, z4) != -1;
    }

    public static boolean U0(boolean[] zArr, boolean[] zArr2) {
        if (zArr != null || zArr2 == null || zArr2.length <= 0) {
            if (zArr2 != null || zArr == null || zArr.length <= 0) {
                return zArr == null || zArr2 == null || zArr.length == zArr2.length;
            }
            return false;
        }
        return false;
    }

    public static char[] U1(char[] cArr, int... iArr) {
        return (char[]) S1(cArr, G(iArr));
    }

    public static Long[] U2(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return f68837e;
        }
        Long[] lArr = new Long[jArr.length];
        for (int i4 = 0; i4 < jArr.length; i4++) {
            lArr[i4] = Long.valueOf(jArr[i4]);
        }
        return lArr;
    }

    private static Object V(Object obj, Class<?> cls) {
        if (obj != null) {
            int length = Array.getLength(obj);
            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
            System.arraycopy(obj, 0, newInstance, 0, length);
            return newInstance;
        }
        return Array.newInstance(cls, 1);
    }

    public static boolean V0(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return obj.getClass().getName().equals(obj2.getClass().getName());
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static double[] V1(double[] dArr, int... iArr) {
        return (double[]) S1(dArr, G(iArr));
    }

    public static Short[] V2(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return f68841i;
        }
        Short[] shArr = new Short[sArr.length];
        for (int i4 = 0; i4 < sArr.length; i4++) {
            shArr[i4] = Short.valueOf(sArr[i4]);
        }
        return shArr;
    }

    private static int[] W(HashSet<Integer> hashSet) {
        int[] iArr = new int[hashSet.size()];
        Iterator<Integer> it2 = hashSet.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            iArr[i4] = it2.next().intValue();
            i4++;
        }
        return iArr;
    }

    public static int W0(byte[] bArr, byte b5) {
        return X0(bArr, b5, Integer.MAX_VALUE);
    }

    public static float[] W1(float[] fArr, int... iArr) {
        return (float[]) S1(fArr, G(iArr));
    }

    public static byte[] W2(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f68842j;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = bArr[i4].byteValue();
        }
        return bArr2;
    }

    public static int X(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static int X0(byte[] bArr, byte b5, int i4) {
        if (bArr != null && i4 >= 0) {
            if (i4 >= bArr.length) {
                i4 = bArr.length - 1;
            }
            while (i4 >= 0) {
                if (b5 == bArr[i4]) {
                    return i4;
                }
                i4--;
            }
            return -1;
        }
        return -1;
    }

    public static int[] X1(int[] iArr, int... iArr2) {
        return (int[]) S1(iArr, G(iArr2));
    }

    public static byte[] X2(Byte[] bArr, byte b5) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f68842j;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            Byte b6 = bArr[i4];
            bArr2[i4] = b6 == null ? b5 : b6.byteValue();
        }
        return bArr2;
    }

    public static int Y(Object obj) {
        return new external.org.apache.commons.lang3.builder.d().g(obj).E();
    }

    public static int Y0(char[] cArr, char c5) {
        return Z0(cArr, c5, Integer.MAX_VALUE);
    }

    public static long[] Y1(long[] jArr, int... iArr) {
        return (long[]) S1(jArr, G(iArr));
    }

    public static char[] Y2(Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return f68850r;
        }
        char[] cArr = new char[chArr.length];
        for (int i4 = 0; i4 < chArr.length; i4++) {
            cArr[i4] = chArr[i4].charValue();
        }
        return cArr;
    }

    public static int Z(byte[] bArr, byte b5) {
        return a0(bArr, b5, 0);
    }

    public static int Z0(char[] cArr, char c5, int i4) {
        if (cArr != null && i4 >= 0) {
            if (i4 >= cArr.length) {
                i4 = cArr.length - 1;
            }
            while (i4 >= 0) {
                if (c5 == cArr[i4]) {
                    return i4;
                }
                i4--;
            }
            return -1;
        }
        return -1;
    }

    public static <T> T[] Z1(T[] tArr, int... iArr) {
        return (T[]) ((Object[]) S1(tArr, G(iArr)));
    }

    public static char[] Z2(Character[] chArr, char c5) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return f68850r;
        }
        char[] cArr = new char[chArr.length];
        for (int i4 = 0; i4 < chArr.length; i4++) {
            Character ch = chArr[i4];
            cArr[i4] = ch == null ? c5 : ch.charValue();
        }
        return cArr;
    }

    private static Object a(Object obj, int i4, Object obj2, Class<?> cls) {
        if (obj == null) {
            if (i4 == 0) {
                Object newInstance = Array.newInstance(cls, 1);
                Array.set(newInstance, 0, obj2);
                return newInstance;
            }
            throw new IndexOutOfBoundsException("Index: " + i4 + ", Length: 0");
        }
        int length = Array.getLength(obj);
        if (i4 <= length && i4 >= 0) {
            Object newInstance2 = Array.newInstance(cls, length + 1);
            System.arraycopy(obj, 0, newInstance2, 0, i4);
            Array.set(newInstance2, i4, obj2);
            if (i4 < length) {
                System.arraycopy(obj, i4, newInstance2, i4 + 1, length - i4);
            }
            return newInstance2;
        }
        throw new IndexOutOfBoundsException("Index: " + i4 + ", Length: " + length);
    }

    public static int a0(byte[] bArr, byte b5, int i4) {
        if (bArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < bArr.length) {
            if (b5 == bArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int a1(double[] dArr, double d5) {
        return c1(dArr, d5, Integer.MAX_VALUE);
    }

    public static short[] a2(short[] sArr, int... iArr) {
        return (short[]) S1(sArr, G(iArr));
    }

    public static double[] a3(Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f68844l;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr2[i4] = dArr[i4].doubleValue();
        }
        return dArr2;
    }

    public static byte[] b(byte[] bArr, byte b5) {
        byte[] bArr2 = (byte[]) V(bArr, Byte.TYPE);
        bArr2[bArr2.length - 1] = b5;
        return bArr2;
    }

    public static int b0(char[] cArr, char c5) {
        return c0(cArr, c5, 0);
    }

    public static int b1(double[] dArr, double d5, double d6) {
        return d1(dArr, d5, Integer.MAX_VALUE, d6);
    }

    public static boolean[] b2(boolean[] zArr, int... iArr) {
        return (boolean[]) S1(zArr, G(iArr));
    }

    public static double[] b3(Double[] dArr, double d5) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f68844l;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            Double d6 = dArr[i4];
            dArr2[i4] = d6 == null ? d5 : d6.doubleValue();
        }
        return dArr2;
    }

    public static byte[] c(byte[] bArr, int i4, byte b5) {
        return (byte[]) a(bArr, i4, Byte.valueOf(b5), Byte.TYPE);
    }

    public static int c0(char[] cArr, char c5, int i4) {
        if (cArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < cArr.length) {
            if (c5 == cArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int c1(double[] dArr, double d5, int i4) {
        if (!v0(dArr) && i4 >= 0) {
            if (i4 >= dArr.length) {
                i4 = dArr.length - 1;
            }
            while (i4 >= 0) {
                if (d5 == dArr[i4]) {
                    return i4;
                }
                i4--;
            }
            return -1;
        }
        return -1;
    }

    public static byte[] c2(byte[] bArr, byte b5) {
        int Z = Z(bArr, b5);
        if (Z == -1) {
            return C(bArr);
        }
        return J1(bArr, Z);
    }

    public static float[] c3(Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f68846n;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr2[i4] = fArr[i4].floatValue();
        }
        return fArr2;
    }

    public static char[] d(char[] cArr, char c5) {
        char[] cArr2 = (char[]) V(cArr, Character.TYPE);
        cArr2[cArr2.length - 1] = c5;
        return cArr2;
    }

    public static int d0(double[] dArr, double d5) {
        return f0(dArr, d5, 0);
    }

    public static int d1(double[] dArr, double d5, int i4, double d6) {
        if (!v0(dArr) && i4 >= 0) {
            if (i4 >= dArr.length) {
                i4 = dArr.length - 1;
            }
            double d7 = d5 - d6;
            double d8 = d5 + d6;
            while (i4 >= 0) {
                if (dArr[i4] >= d7 && dArr[i4] <= d8) {
                    return i4;
                }
                i4--;
            }
            return -1;
        }
        return -1;
    }

    public static char[] d2(char[] cArr, char c5) {
        int b02 = b0(cArr, c5);
        if (b02 == -1) {
            return D(cArr);
        }
        return K1(cArr, b02);
    }

    public static float[] d3(Float[] fArr, float f5) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f68846n;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            Float f6 = fArr[i4];
            fArr2[i4] = f6 == null ? f5 : f6.floatValue();
        }
        return fArr2;
    }

    public static char[] e(char[] cArr, int i4, char c5) {
        return (char[]) a(cArr, i4, Character.valueOf(c5), Character.TYPE);
    }

    public static int e0(double[] dArr, double d5, double d6) {
        return g0(dArr, d5, 0, d6);
    }

    public static int e1(float[] fArr, float f5) {
        return f1(fArr, f5, Integer.MAX_VALUE);
    }

    public static double[] e2(double[] dArr, double d5) {
        int d02 = d0(dArr, d5);
        if (d02 == -1) {
            return E(dArr);
        }
        return L1(dArr, d02);
    }

    public static int[] e3(Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return f68838f;
        }
        int[] iArr = new int[numArr.length];
        for (int i4 = 0; i4 < numArr.length; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
        return iArr;
    }

    public static double[] f(double[] dArr, double d5) {
        double[] dArr2 = (double[]) V(dArr, Double.TYPE);
        dArr2[dArr2.length - 1] = d5;
        return dArr2;
    }

    public static int f0(double[] dArr, double d5, int i4) {
        if (v0(dArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < dArr.length) {
            if (d5 == dArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int f1(float[] fArr, float f5, int i4) {
        if (!w0(fArr) && i4 >= 0) {
            if (i4 >= fArr.length) {
                i4 = fArr.length - 1;
            }
            while (i4 >= 0) {
                if (f5 == fArr[i4]) {
                    return i4;
                }
                i4--;
            }
            return -1;
        }
        return -1;
    }

    public static float[] f2(float[] fArr, float f5) {
        int h02 = h0(fArr, f5);
        if (h02 == -1) {
            return F(fArr);
        }
        return M1(fArr, h02);
    }

    public static int[] f3(Integer[] numArr, int i4) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return f68838f;
        }
        int[] iArr = new int[numArr.length];
        for (int i5 = 0; i5 < numArr.length; i5++) {
            Integer num = numArr[i5];
            iArr[i5] = num == null ? i4 : num.intValue();
        }
        return iArr;
    }

    public static double[] g(double[] dArr, int i4, double d5) {
        return (double[]) a(dArr, i4, Double.valueOf(d5), Double.TYPE);
    }

    public static int g0(double[] dArr, double d5, int i4, double d6) {
        if (v0(dArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        double d7 = d5 - d6;
        double d8 = d5 + d6;
        while (i4 < dArr.length) {
            if (dArr[i4] >= d7 && dArr[i4] <= d8) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int g1(int[] iArr, int i4) {
        return h1(iArr, i4, Integer.MAX_VALUE);
    }

    public static int[] g2(int[] iArr, int i4) {
        int j02 = j0(iArr, i4);
        if (j02 == -1) {
            return G(iArr);
        }
        return N1(iArr, j02);
    }

    public static long[] g3(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f68836d;
        }
        long[] jArr = new long[lArr.length];
        for (int i4 = 0; i4 < lArr.length; i4++) {
            jArr[i4] = lArr[i4].longValue();
        }
        return jArr;
    }

    public static float[] h(float[] fArr, float f5) {
        float[] fArr2 = (float[]) V(fArr, Float.TYPE);
        fArr2[fArr2.length - 1] = f5;
        return fArr2;
    }

    public static int h0(float[] fArr, float f5) {
        return i0(fArr, f5, 0);
    }

    public static int h1(int[] iArr, int i4, int i5) {
        if (iArr != null && i5 >= 0) {
            if (i5 >= iArr.length) {
                i5 = iArr.length - 1;
            }
            while (i5 >= 0) {
                if (i4 == iArr[i5]) {
                    return i5;
                }
                i5--;
            }
            return -1;
        }
        return -1;
    }

    public static long[] h2(long[] jArr, long j4) {
        int l02 = l0(jArr, j4);
        if (l02 == -1) {
            return H(jArr);
        }
        return O1(jArr, l02);
    }

    public static long[] h3(Long[] lArr, long j4) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f68836d;
        }
        long[] jArr = new long[lArr.length];
        for (int i4 = 0; i4 < lArr.length; i4++) {
            Long l4 = lArr[i4];
            jArr[i4] = l4 == null ? j4 : l4.longValue();
        }
        return jArr;
    }

    public static float[] i(float[] fArr, int i4, float f5) {
        return (float[]) a(fArr, i4, Float.valueOf(f5), Float.TYPE);
    }

    public static int i0(float[] fArr, float f5, int i4) {
        if (w0(fArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < fArr.length) {
            if (f5 == fArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int i1(long[] jArr, long j4) {
        return j1(jArr, j4, Integer.MAX_VALUE);
    }

    public static <T> T[] i2(T[] tArr, Object obj) {
        int n02 = n0(tArr, obj);
        if (n02 == -1) {
            return (T[]) I(tArr);
        }
        return (T[]) P1(tArr, n02);
    }

    public static short[] i3(Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return f68840h;
        }
        short[] sArr = new short[shArr.length];
        for (int i4 = 0; i4 < shArr.length; i4++) {
            sArr[i4] = shArr[i4].shortValue();
        }
        return sArr;
    }

    public static int[] j(int[] iArr, int i4) {
        int[] iArr2 = (int[]) V(iArr, Integer.TYPE);
        iArr2[iArr2.length - 1] = i4;
        return iArr2;
    }

    public static int j0(int[] iArr, int i4) {
        return k0(iArr, i4, 0);
    }

    public static int j1(long[] jArr, long j4, int i4) {
        if (jArr != null && i4 >= 0) {
            if (i4 >= jArr.length) {
                i4 = jArr.length - 1;
            }
            while (i4 >= 0) {
                if (j4 == jArr[i4]) {
                    return i4;
                }
                i4--;
            }
            return -1;
        }
        return -1;
    }

    public static short[] j2(short[] sArr, short s4) {
        int p02 = p0(sArr, s4);
        if (p02 == -1) {
            return J(sArr);
        }
        return Q1(sArr, p02);
    }

    public static short[] j3(Short[] shArr, short s4) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return f68840h;
        }
        short[] sArr = new short[shArr.length];
        for (int i4 = 0; i4 < shArr.length; i4++) {
            Short sh = shArr[i4];
            sArr[i4] = sh == null ? s4 : sh.shortValue();
        }
        return sArr;
    }

    public static int[] k(int[] iArr, int i4, int i5) {
        return (int[]) a(iArr, i4, Integer.valueOf(i5), Integer.TYPE);
    }

    public static int k0(int[] iArr, int i4, int i5) {
        if (iArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < iArr.length) {
            if (i4 == iArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int k1(Object[] objArr, Object obj) {
        return l1(objArr, obj, Integer.MAX_VALUE);
    }

    public static boolean[] k2(boolean[] zArr, boolean z4) {
        int r02 = r0(zArr, z4);
        if (r02 == -1) {
            return K(zArr);
        }
        return R1(zArr, r02);
    }

    public static boolean[] k3(Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return f68848p;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i4 = 0; i4 < boolArr.length; i4++) {
            zArr[i4] = boolArr[i4].booleanValue();
        }
        return zArr;
    }

    public static long[] l(long[] jArr, int i4, long j4) {
        return (long[]) a(jArr, i4, Long.valueOf(j4), Long.TYPE);
    }

    public static int l0(long[] jArr, long j4) {
        return m0(jArr, j4, 0);
    }

    public static int l1(Object[] objArr, Object obj, int i4) {
        if (objArr != null && i4 >= 0) {
            if (i4 >= objArr.length) {
                i4 = objArr.length - 1;
            }
            if (obj == null) {
                while (i4 >= 0) {
                    if (objArr[i4] == null) {
                        return i4;
                    }
                    i4--;
                }
            } else if (objArr.getClass().getComponentType().isInstance(obj)) {
                while (i4 >= 0) {
                    if (obj.equals(objArr[i4])) {
                        return i4;
                    }
                    i4--;
                }
            }
            return -1;
        }
        return -1;
    }

    public static byte[] l2(byte[] bArr, byte... bArr2) {
        if (!t0(bArr) && !t0(bArr2)) {
            HashMap hashMap = new HashMap(bArr2.length);
            for (byte b5 : bArr2) {
                Byte valueOf = Byte.valueOf(b5);
                MutableInt mutableInt = (MutableInt) hashMap.get(valueOf);
                if (mutableInt == null) {
                    hashMap.put(valueOf, new MutableInt(1));
                } else {
                    mutableInt.E();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Byte b6 = (Byte) entry.getKey();
                int intValue = ((MutableInt) entry.getValue()).intValue();
                int i4 = 0;
                int i5 = 0;
                while (i4 < intValue) {
                    int a02 = a0(bArr, b6.byteValue(), i5);
                    if (a02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(a02));
                    i4++;
                    i5 = a02 + 1;
                }
            }
            return T1(bArr, W(hashSet));
        }
        return C(bArr);
    }

    public static boolean[] l3(Boolean[] boolArr, boolean z4) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return f68848p;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i4 = 0; i4 < boolArr.length; i4++) {
            Boolean bool = boolArr[i4];
            zArr[i4] = bool == null ? z4 : bool.booleanValue();
        }
        return zArr;
    }

    public static long[] m(long[] jArr, long j4) {
        long[] jArr2 = (long[]) V(jArr, Long.TYPE);
        jArr2[jArr2.length - 1] = j4;
        return jArr2;
    }

    public static int m0(long[] jArr, long j4, int i4) {
        if (jArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < jArr.length) {
            if (j4 == jArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int m1(short[] sArr, short s4) {
        return n1(sArr, s4, Integer.MAX_VALUE);
    }

    public static char[] m2(char[] cArr, char... cArr2) {
        if (!u0(cArr) && !u0(cArr2)) {
            HashMap hashMap = new HashMap(cArr2.length);
            for (char c5 : cArr2) {
                Character valueOf = Character.valueOf(c5);
                MutableInt mutableInt = (MutableInt) hashMap.get(valueOf);
                if (mutableInt == null) {
                    hashMap.put(valueOf, new MutableInt(1));
                } else {
                    mutableInt.E();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Character ch = (Character) entry.getKey();
                int intValue = ((MutableInt) entry.getValue()).intValue();
                int i4 = 0;
                int i5 = 0;
                while (i4 < intValue) {
                    int c02 = c0(cArr, ch.charValue(), i5);
                    if (c02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(c02));
                    i4++;
                    i5 = c02 + 1;
                }
            }
            return U1(cArr, W(hashSet));
        }
        return D(cArr);
    }

    public static String m3(Object obj) {
        return n3(obj, "{}");
    }

    public static <T> T[] n(T[] tArr, int i4, T t4) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else if (t4 != null) {
            cls = t4.getClass();
        } else {
            throw new IllegalArgumentException("Array and element cannot both be null");
        }
        return (T[]) ((Object[]) a(tArr, i4, t4, cls));
    }

    public static int n0(Object[] objArr, Object obj) {
        return o0(objArr, obj, 0);
    }

    public static int n1(short[] sArr, short s4, int i4) {
        if (sArr != null && i4 >= 0) {
            if (i4 >= sArr.length) {
                i4 = sArr.length - 1;
            }
            while (i4 >= 0) {
                if (s4 == sArr[i4]) {
                    return i4;
                }
                i4--;
            }
            return -1;
        }
        return -1;
    }

    public static double[] n2(double[] dArr, double... dArr2) {
        if (!v0(dArr) && !v0(dArr2)) {
            HashMap hashMap = new HashMap(dArr2.length);
            for (double d5 : dArr2) {
                Double valueOf = Double.valueOf(d5);
                MutableInt mutableInt = (MutableInt) hashMap.get(valueOf);
                if (mutableInt == null) {
                    hashMap.put(valueOf, new MutableInt(1));
                } else {
                    mutableInt.E();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Double d6 = (Double) entry.getKey();
                int intValue = ((MutableInt) entry.getValue()).intValue();
                int i4 = 0;
                int i5 = 0;
                while (i4 < intValue) {
                    int f02 = f0(dArr, d6.doubleValue(), i5);
                    if (f02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(f02));
                    i4++;
                    i5 = f02 + 1;
                }
            }
            return V1(dArr, W(hashSet));
        }
        return E(dArr);
    }

    public static String n3(Object obj, String str) {
        return obj == null ? str : new external.org.apache.commons.lang3.builder.g(obj, ToStringStyle.f68857z).g(obj).toString();
    }

    public static <T> T[] o(T[] tArr, T t4) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass();
        } else if (t4 != null) {
            cls = t4.getClass();
        } else {
            throw new IllegalArgumentException("Arguments cannot both be null");
        }
        T[] tArr2 = (T[]) ((Object[]) V(tArr, cls));
        tArr2[tArr2.length - 1] = t4;
        return tArr2;
    }

    public static int o0(Object[] objArr, Object obj, int i4) {
        if (objArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (obj == null) {
            while (i4 < objArr.length) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
        } else if (objArr.getClass().getComponentType().isInstance(obj)) {
            while (i4 < objArr.length) {
                if (obj.equals(objArr[i4])) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    public static int o1(boolean[] zArr, boolean z4) {
        return p1(zArr, z4, Integer.MAX_VALUE);
    }

    public static float[] o2(float[] fArr, float... fArr2) {
        if (!w0(fArr) && !w0(fArr2)) {
            HashMap hashMap = new HashMap(fArr2.length);
            for (float f5 : fArr2) {
                Float valueOf = Float.valueOf(f5);
                MutableInt mutableInt = (MutableInt) hashMap.get(valueOf);
                if (mutableInt == null) {
                    hashMap.put(valueOf, new MutableInt(1));
                } else {
                    mutableInt.E();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Float f6 = (Float) entry.getKey();
                int intValue = ((MutableInt) entry.getValue()).intValue();
                int i4 = 0;
                int i5 = 0;
                while (i4 < intValue) {
                    int i02 = i0(fArr, f6.floatValue(), i5);
                    if (i02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(i02));
                    i4++;
                    i5 = i02 + 1;
                }
            }
            return W1(fArr, W(hashSet));
        }
        return F(fArr);
    }

    public static short[] p(short[] sArr, int i4, short s4) {
        return (short[]) a(sArr, i4, Short.valueOf(s4), Short.TYPE);
    }

    public static int p0(short[] sArr, short s4) {
        return q0(sArr, s4, 0);
    }

    public static int p1(boolean[] zArr, boolean z4, int i4) {
        if (!B0(zArr) && i4 >= 0) {
            if (i4 >= zArr.length) {
                i4 = zArr.length - 1;
            }
            while (i4 >= 0) {
                if (z4 == zArr[i4]) {
                    return i4;
                }
                i4--;
            }
            return -1;
        }
        return -1;
    }

    public static int[] p2(int[] iArr, int... iArr2) {
        if (!x0(iArr) && !x0(iArr2)) {
            HashMap hashMap = new HashMap(iArr2.length);
            for (int i4 : iArr2) {
                Integer valueOf = Integer.valueOf(i4);
                MutableInt mutableInt = (MutableInt) hashMap.get(valueOf);
                if (mutableInt == null) {
                    hashMap.put(valueOf, new MutableInt(1));
                } else {
                    mutableInt.E();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Integer num = (Integer) entry.getKey();
                int intValue = ((MutableInt) entry.getValue()).intValue();
                int i5 = 0;
                int i6 = 0;
                while (i5 < intValue) {
                    int k02 = k0(iArr, num.intValue(), i6);
                    if (k02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(k02));
                    i5++;
                    i6 = k02 + 1;
                }
            }
            return X1(iArr, W(hashSet));
        }
        return G(iArr);
    }

    public static short[] q(short[] sArr, short s4) {
        short[] sArr2 = (short[]) V(sArr, Short.TYPE);
        sArr2[sArr2.length - 1] = s4;
        return sArr2;
    }

    public static int q0(short[] sArr, short s4, int i4) {
        if (sArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < sArr.length) {
            if (s4 == sArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static byte[] q1(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? f68842j : bArr;
    }

    public static long[] q2(long[] jArr, long... jArr2) {
        if (!y0(jArr) && !y0(jArr2)) {
            HashMap hashMap = new HashMap(jArr2.length);
            for (long j4 : jArr2) {
                Long valueOf = Long.valueOf(j4);
                MutableInt mutableInt = (MutableInt) hashMap.get(valueOf);
                if (mutableInt == null) {
                    hashMap.put(valueOf, new MutableInt(1));
                } else {
                    mutableInt.E();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Long l4 = (Long) entry.getKey();
                int intValue = ((MutableInt) entry.getValue()).intValue();
                int i4 = 0;
                int i5 = 0;
                while (i4 < intValue) {
                    int m02 = m0(jArr, l4.longValue(), i5);
                    if (m02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(m02));
                    i4++;
                    i5 = m02 + 1;
                }
            }
            return Y1(jArr, W(hashSet));
        }
        return H(jArr);
    }

    public static boolean[] r(boolean[] zArr, int i4, boolean z4) {
        return (boolean[]) a(zArr, i4, Boolean.valueOf(z4), Boolean.TYPE);
    }

    public static int r0(boolean[] zArr, boolean z4) {
        return s0(zArr, z4, 0);
    }

    public static char[] r1(char[] cArr) {
        return (cArr == null || cArr.length == 0) ? f68850r : cArr;
    }

    public static <T> T[] r2(T[] tArr, T... tArr2) {
        if (!z0(tArr) && !z0(tArr2)) {
            HashMap hashMap = new HashMap(tArr2.length);
            for (T t4 : tArr2) {
                MutableInt mutableInt = (MutableInt) hashMap.get(t4);
                if (mutableInt == null) {
                    hashMap.put(t4, new MutableInt(1));
                } else {
                    mutableInt.E();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                int intValue = ((MutableInt) entry.getValue()).intValue();
                int i4 = 0;
                int i5 = 0;
                while (i4 < intValue) {
                    int o02 = o0(tArr, key, i5);
                    if (o02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(o02));
                    i4++;
                    i5 = o02 + 1;
                }
            }
            return (T[]) Z1(tArr, W(hashSet));
        }
        return (T[]) I(tArr);
    }

    public static boolean[] s(boolean[] zArr, boolean z4) {
        boolean[] zArr2 = (boolean[]) V(zArr, Boolean.TYPE);
        zArr2[zArr2.length - 1] = z4;
        return zArr2;
    }

    public static int s0(boolean[] zArr, boolean z4, int i4) {
        if (B0(zArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < zArr.length) {
            if (z4 == zArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static double[] s1(double[] dArr) {
        return (dArr == null || dArr.length == 0) ? f68844l : dArr;
    }

    public static short[] s2(short[] sArr, short... sArr2) {
        if (!A0(sArr) && !A0(sArr2)) {
            HashMap hashMap = new HashMap(sArr2.length);
            for (short s4 : sArr2) {
                Short valueOf = Short.valueOf(s4);
                MutableInt mutableInt = (MutableInt) hashMap.get(valueOf);
                if (mutableInt == null) {
                    hashMap.put(valueOf, new MutableInt(1));
                } else {
                    mutableInt.E();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Short sh = (Short) entry.getKey();
                int intValue = ((MutableInt) entry.getValue()).intValue();
                int i4 = 0;
                int i5 = 0;
                while (i4 < intValue) {
                    int q02 = q0(sArr, sh.shortValue(), i5);
                    if (q02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(q02));
                    i4++;
                    i5 = q02 + 1;
                }
            }
            return a2(sArr, W(hashSet));
        }
        return J(sArr);
    }

    public static byte[] t(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return C(bArr2);
        }
        if (bArr2 == null) {
            return C(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean t0(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static float[] t1(float[] fArr) {
        return (fArr == null || fArr.length == 0) ? f68846n : fArr;
    }

    public static boolean[] t2(boolean[] zArr, boolean... zArr2) {
        if (!B0(zArr) && !B0(zArr2)) {
            HashMap hashMap = new HashMap(zArr2.length);
            for (boolean z4 : zArr2) {
                Boolean valueOf = Boolean.valueOf(z4);
                MutableInt mutableInt = (MutableInt) hashMap.get(valueOf);
                if (mutableInt == null) {
                    hashMap.put(valueOf, new MutableInt(1));
                } else {
                    mutableInt.E();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Boolean bool = (Boolean) entry.getKey();
                int intValue = ((MutableInt) entry.getValue()).intValue();
                int i4 = 0;
                int i5 = 0;
                while (i4 < intValue) {
                    int s02 = s0(zArr, bool.booleanValue(), i5);
                    if (s02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(s02));
                    i4++;
                    i5 = s02 + 1;
                }
            }
            return b2(zArr, W(hashSet));
        }
        return K(zArr);
    }

    public static char[] u(char[] cArr, char... cArr2) {
        if (cArr == null) {
            return D(cArr2);
        }
        if (cArr2 == null) {
            return D(cArr);
        }
        char[] cArr3 = new char[cArr.length + cArr2.length];
        System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
        System.arraycopy(cArr2, 0, cArr3, cArr.length, cArr2.length);
        return cArr3;
    }

    public static boolean u0(char[] cArr) {
        return cArr == null || cArr.length == 0;
    }

    public static int[] u1(int[] iArr) {
        return (iArr == null || iArr.length == 0) ? f68838f : iArr;
    }

    public static void u2(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            byte b5 = bArr[length];
            bArr[length] = bArr[i4];
            bArr[i4] = b5;
            length--;
        }
    }

    public static double[] v(double[] dArr, double... dArr2) {
        if (dArr == null) {
            return E(dArr2);
        }
        if (dArr2 == null) {
            return E(dArr);
        }
        double[] dArr3 = new double[dArr.length + dArr2.length];
        System.arraycopy(dArr, 0, dArr3, 0, dArr.length);
        System.arraycopy(dArr2, 0, dArr3, dArr.length, dArr2.length);
        return dArr3;
    }

    public static boolean v0(double[] dArr) {
        return dArr == null || dArr.length == 0;
    }

    public static long[] v1(long[] jArr) {
        return (jArr == null || jArr.length == 0) ? f68836d : jArr;
    }

    public static void v2(char[] cArr) {
        if (cArr == null) {
            return;
        }
        int length = cArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            char c5 = cArr[length];
            cArr[length] = cArr[i4];
            cArr[i4] = c5;
            length--;
        }
    }

    public static float[] w(float[] fArr, float... fArr2) {
        if (fArr == null) {
            return F(fArr2);
        }
        if (fArr2 == null) {
            return F(fArr);
        }
        float[] fArr3 = new float[fArr.length + fArr2.length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        return fArr3;
    }

    public static boolean w0(float[] fArr) {
        return fArr == null || fArr.length == 0;
    }

    public static Boolean[] w1(Boolean[] boolArr) {
        return (boolArr == null || boolArr.length == 0) ? f68849q : boolArr;
    }

    public static void w2(double[] dArr) {
        if (dArr == null) {
            return;
        }
        int length = dArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            double d5 = dArr[length];
            dArr[length] = dArr[i4];
            dArr[i4] = d5;
            length--;
        }
    }

    public static int[] x(int[] iArr, int... iArr2) {
        if (iArr == null) {
            return G(iArr2);
        }
        if (iArr2 == null) {
            return G(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static boolean x0(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }

    public static Byte[] x1(Byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? f68843k : bArr;
    }

    public static void x2(float[] fArr) {
        if (fArr == null) {
            return;
        }
        int length = fArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            float f5 = fArr[length];
            fArr[length] = fArr[i4];
            fArr[i4] = f5;
            length--;
        }
    }

    public static long[] y(long[] jArr, long... jArr2) {
        if (jArr == null) {
            return H(jArr2);
        }
        if (jArr2 == null) {
            return H(jArr);
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
        System.arraycopy(jArr2, 0, jArr3, jArr.length, jArr2.length);
        return jArr3;
    }

    public static boolean y0(long[] jArr) {
        return jArr == null || jArr.length == 0;
    }

    public static Character[] y1(Character[] chArr) {
        return (chArr == null || chArr.length == 0) ? f68851s : chArr;
    }

    public static void y2(int[] iArr) {
        if (iArr == null) {
            return;
        }
        int length = iArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            int i5 = iArr[length];
            iArr[length] = iArr[i4];
            iArr[i4] = i5;
            length--;
        }
    }

    public static <T> T[] z(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return (T[]) I(tArr2);
        }
        if (tArr2 == null) {
            return (T[]) I(tArr);
        }
        Class<?> componentType = tArr.getClass().getComponentType();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(componentType, tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        try {
            System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
            return tArr3;
        } catch (ArrayStoreException e5) {
            Class<?> componentType2 = tArr2.getClass().getComponentType();
            if (!componentType.isAssignableFrom(componentType2)) {
                throw new IllegalArgumentException("Cannot store " + componentType2.getName() + " in an array of " + componentType.getName(), e5);
            }
            throw e5;
        }
    }

    public static boolean z0(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static Double[] z1(Double[] dArr) {
        return (dArr == null || dArr.length == 0) ? f68845m : dArr;
    }

    public static void z2(long[] jArr) {
        if (jArr == null) {
            return;
        }
        int length = jArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            long j4 = jArr[length];
            jArr[length] = jArr[i4];
            jArr[i4] = j4;
            length--;
        }
    }
}
