package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import m.a;
/* loaded from: classes2.dex */
public class PathParser {
    private static final String LOGTAG = "PathParser";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c5, float[] fArr) {
        arrayList.add(new PathDataNode(c5, fArr));
    }

    public static boolean canMorph(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < pathDataNodeArr.length; i4++) {
            if (pathDataNodeArr[i4].mType != pathDataNodeArr2[i4].mType || pathDataNodeArr[i4].mParams.length != pathDataNodeArr2[i4].mParams.length) {
                return false;
            }
        }
        return true;
    }

    static float[] copyOfRange(float[] fArr, int i4, int i5) {
        if (i4 <= i5) {
            int length = fArr.length;
            if (i4 >= 0 && i4 <= length) {
                int i6 = i5 - i4;
                int min = Math.min(i6, length - i4);
                float[] fArr2 = new float[i6];
                System.arraycopy(fArr, i4, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            int nextStart = nextStart(str, i4);
            String trim = str.substring(i5, nextStart).trim();
            if (trim.length() > 0) {
                addNode(arrayList, trim.charAt(0), getFloats(trim));
            }
            i5 = nextStart;
            i4 = nextStart + 1;
        }
        if (i4 - i5 == 1 && i5 < str.length()) {
            addNode(arrayList, str.charAt(i5), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] createNodesFromPathData = createNodesFromPathData(str);
        if (createNodesFromPathData != null) {
            try {
                PathDataNode.nodesToPath(createNodesFromPathData, path);
                return path;
            } catch (RuntimeException e5) {
                throw new RuntimeException("Error in parsing " + str, e5);
            }
        }
        return null;
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i4 = 0; i4 < pathDataNodeArr.length; i4++) {
            pathDataNodeArr2[i4] = new PathDataNode(pathDataNodeArr[i4]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r0 = 0
            r10.mEndWithNegOrDot = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L37
        L27:
            r10.mEndWithNegOrDot = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.mEndWithNegOrDot = r7
            goto L35
        L31:
            r2 = 0
            goto L37
        L33:
            r2 = 1
            goto L37
        L35:
            r2 = 0
            r4 = 1
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.mEndPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i4 = 1;
            int i5 = 0;
            while (i4 < length) {
                extract(str, i4, extractFloatResult);
                int i6 = extractFloatResult.mEndPosition;
                if (i4 < i6) {
                    fArr[i5] = Float.parseFloat(str.substring(i4, i6));
                    i5++;
                }
                i4 = extractFloatResult.mEndWithNegOrDot ? i6 : i6 + 1;
            }
            return copyOfRange(fArr, 0, i5);
        } catch (NumberFormatException e5) {
            throw new RuntimeException("error in parsing \"" + str + a.f71493g, e5);
        }
    }

    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f5) {
        if (pathDataNodeArr != null && pathDataNodeArr2 != null && pathDataNodeArr3 != null) {
            if (pathDataNodeArr.length == pathDataNodeArr2.length && pathDataNodeArr2.length == pathDataNodeArr3.length) {
                if (canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
                    for (int i4 = 0; i4 < pathDataNodeArr.length; i4++) {
                        pathDataNodeArr[i4].interpolatePathDataNode(pathDataNodeArr2[i4], pathDataNodeArr3[i4], f5);
                    }
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
    }

    private static int nextStart(String str, int i4) {
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i4;
            }
            i4++;
        }
        return i4;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i4 = 0; i4 < pathDataNodeArr2.length; i4++) {
            pathDataNodeArr[i4].mType = pathDataNodeArr2[i4].mType;
            for (int i5 = 0; i5 < pathDataNodeArr2[i4].mParams.length; i5++) {
                pathDataNodeArr[i4].mParams[i5] = pathDataNodeArr2[i4].mParams[i5];
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        PathDataNode(char c5, float[] fArr) {
            this.mType = c5;
            this.mParams = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void addCommand(Path path, float[] fArr, char c5, char c6, float[] fArr2) {
            int i4;
            int i5;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            char c7 = c6;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c7) {
                case 'A':
                case 'a':
                    i4 = 7;
                    break;
                case 'C':
                case 'c':
                    i4 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i4 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i4 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i4 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                    i4 = 2;
                    break;
            }
            float f19 = f13;
            float f20 = f14;
            float f21 = f17;
            float f22 = f18;
            int i6 = 0;
            char c8 = c5;
            while (i6 < fArr2.length) {
                if (c7 != 'A') {
                    if (c7 == 'C') {
                        i5 = i6;
                        int i7 = i5 + 2;
                        int i8 = i5 + 3;
                        int i9 = i5 + 4;
                        int i10 = i5 + 5;
                        path.cubicTo(fArr2[i5 + 0], fArr2[i5 + 1], fArr2[i7], fArr2[i8], fArr2[i9], fArr2[i10]);
                        f19 = fArr2[i9];
                        float f23 = fArr2[i10];
                        float f24 = fArr2[i7];
                        float f25 = fArr2[i8];
                        f20 = f23;
                        f16 = f25;
                        f15 = f24;
                    } else if (c7 == 'H') {
                        i5 = i6;
                        int i11 = i5 + 0;
                        path.lineTo(fArr2[i11], f20);
                        f19 = fArr2[i11];
                    } else if (c7 == 'Q') {
                        i5 = i6;
                        int i12 = i5 + 0;
                        int i13 = i5 + 1;
                        int i14 = i5 + 2;
                        int i15 = i5 + 3;
                        path.quadTo(fArr2[i12], fArr2[i13], fArr2[i14], fArr2[i15]);
                        float f26 = fArr2[i12];
                        float f27 = fArr2[i13];
                        f19 = fArr2[i14];
                        f20 = fArr2[i15];
                        f15 = f26;
                        f16 = f27;
                    } else if (c7 == 'V') {
                        i5 = i6;
                        int i16 = i5 + 0;
                        path.lineTo(f19, fArr2[i16]);
                        f20 = fArr2[i16];
                    } else if (c7 != 'a') {
                        if (c7 != 'c') {
                            if (c7 == 'h') {
                                int i17 = i6 + 0;
                                path.rLineTo(fArr2[i17], 0.0f);
                                f19 += fArr2[i17];
                            } else if (c7 != 'q') {
                                if (c7 == 'v') {
                                    int i18 = i6 + 0;
                                    path.rLineTo(0.0f, fArr2[i18]);
                                    f8 = fArr2[i18];
                                } else if (c7 == 'L') {
                                    int i19 = i6 + 0;
                                    int i20 = i6 + 1;
                                    path.lineTo(fArr2[i19], fArr2[i20]);
                                    f19 = fArr2[i19];
                                    f20 = fArr2[i20];
                                } else if (c7 == 'M') {
                                    int i21 = i6 + 0;
                                    f19 = fArr2[i21];
                                    int i22 = i6 + 1;
                                    f20 = fArr2[i22];
                                    if (i6 > 0) {
                                        path.lineTo(fArr2[i21], fArr2[i22]);
                                    } else {
                                        path.moveTo(fArr2[i21], fArr2[i22]);
                                        i5 = i6;
                                        f22 = f20;
                                        f21 = f19;
                                    }
                                } else if (c7 == 'S') {
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        f19 = (f19 * 2.0f) - f15;
                                        f20 = (f20 * 2.0f) - f16;
                                    }
                                    float f28 = f20;
                                    int i23 = i6 + 0;
                                    int i24 = i6 + 1;
                                    int i25 = i6 + 2;
                                    int i26 = i6 + 3;
                                    path.cubicTo(f19, f28, fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                    f5 = fArr2[i23];
                                    f6 = fArr2[i24];
                                    f19 = fArr2[i25];
                                    f20 = fArr2[i26];
                                    f15 = f5;
                                    f16 = f6;
                                } else if (c7 == 'T') {
                                    if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                        f19 = (f19 * 2.0f) - f15;
                                        f20 = (f20 * 2.0f) - f16;
                                    }
                                    int i27 = i6 + 0;
                                    int i28 = i6 + 1;
                                    path.quadTo(f19, f20, fArr2[i27], fArr2[i28]);
                                    float f29 = fArr2[i27];
                                    float f30 = fArr2[i28];
                                    i5 = i6;
                                    f16 = f20;
                                    f15 = f19;
                                    f19 = f29;
                                    f20 = f30;
                                } else if (c7 == 'l') {
                                    int i29 = i6 + 0;
                                    int i30 = i6 + 1;
                                    path.rLineTo(fArr2[i29], fArr2[i30]);
                                    f19 += fArr2[i29];
                                    f8 = fArr2[i30];
                                } else if (c7 == 'm') {
                                    int i31 = i6 + 0;
                                    f19 += fArr2[i31];
                                    int i32 = i6 + 1;
                                    f20 += fArr2[i32];
                                    if (i6 > 0) {
                                        path.rLineTo(fArr2[i31], fArr2[i32]);
                                    } else {
                                        path.rMoveTo(fArr2[i31], fArr2[i32]);
                                        i5 = i6;
                                        f22 = f20;
                                        f21 = f19;
                                    }
                                } else if (c7 == 's') {
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        float f31 = f19 - f15;
                                        f9 = f20 - f16;
                                        f10 = f31;
                                    } else {
                                        f10 = 0.0f;
                                        f9 = 0.0f;
                                    }
                                    int i33 = i6 + 0;
                                    int i34 = i6 + 1;
                                    int i35 = i6 + 2;
                                    int i36 = i6 + 3;
                                    path.rCubicTo(f10, f9, fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                    f5 = fArr2[i33] + f19;
                                    f6 = fArr2[i34] + f20;
                                    f19 += fArr2[i35];
                                    f7 = fArr2[i36];
                                } else if (c7 == 't') {
                                    if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                        f11 = f19 - f15;
                                        f12 = f20 - f16;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i37 = i6 + 0;
                                    int i38 = i6 + 1;
                                    path.rQuadTo(f11, f12, fArr2[i37], fArr2[i38]);
                                    float f32 = f11 + f19;
                                    float f33 = f12 + f20;
                                    f19 += fArr2[i37];
                                    f20 += fArr2[i38];
                                    f16 = f33;
                                    f15 = f32;
                                }
                                f20 += f8;
                            } else {
                                int i39 = i6 + 0;
                                int i40 = i6 + 1;
                                int i41 = i6 + 2;
                                int i42 = i6 + 3;
                                path.rQuadTo(fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                                f5 = fArr2[i39] + f19;
                                f6 = fArr2[i40] + f20;
                                f19 += fArr2[i41];
                                f7 = fArr2[i42];
                            }
                            i5 = i6;
                        } else {
                            int i43 = i6 + 2;
                            int i44 = i6 + 3;
                            int i45 = i6 + 4;
                            int i46 = i6 + 5;
                            path.rCubicTo(fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i43], fArr2[i44], fArr2[i45], fArr2[i46]);
                            f5 = fArr2[i43] + f19;
                            f6 = fArr2[i44] + f20;
                            f19 += fArr2[i45];
                            f7 = fArr2[i46];
                        }
                        f20 += f7;
                        f15 = f5;
                        f16 = f6;
                        i5 = i6;
                    } else {
                        int i47 = i6 + 5;
                        int i48 = i6 + 6;
                        i5 = i6;
                        drawArc(path, f19, f20, fArr2[i47] + f19, fArr2[i48] + f20, fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3] != 0.0f, fArr2[i6 + 4] != 0.0f);
                        f19 += fArr2[i47];
                        f20 += fArr2[i48];
                    }
                    i6 = i5 + i4;
                    c8 = c6;
                    c7 = c8;
                } else {
                    i5 = i6;
                    int i49 = i5 + 5;
                    int i50 = i5 + 6;
                    drawArc(path, f19, f20, fArr2[i49], fArr2[i50], fArr2[i5 + 0], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f, fArr2[i5 + 4] != 0.0f);
                    f19 = fArr2[i49];
                    f20 = fArr2[i50];
                }
                f16 = f20;
                f15 = f19;
                i6 = i5 + i4;
                c8 = c6;
                c7 = c8;
            }
            fArr[0] = f19;
            fArr[1] = f20;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f21;
            fArr[5] = f22;
        }

        private static void arcToBezier(Path path, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
            double d14 = d7;
            int ceil = (int) Math.ceil(Math.abs((d13 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d11);
            double sin = Math.sin(d11);
            double cos2 = Math.cos(d12);
            double sin2 = Math.sin(d12);
            double d15 = -d14;
            double d16 = d15 * cos;
            double d17 = d8 * sin;
            double d18 = (d16 * sin2) - (d17 * cos2);
            double d19 = d15 * sin;
            double d20 = d8 * cos;
            double d21 = (sin2 * d19) + (cos2 * d20);
            double d22 = ceil;
            Double.isNaN(d22);
            double d23 = d13 / d22;
            double d24 = d12;
            double d25 = d21;
            double d26 = d18;
            int i4 = 0;
            double d27 = d9;
            double d28 = d10;
            while (i4 < ceil) {
                double d29 = d24 + d23;
                double sin3 = Math.sin(d29);
                double cos3 = Math.cos(d29);
                double d30 = (d5 + ((d14 * cos) * cos3)) - (d17 * sin3);
                double d31 = d6 + (d14 * sin * cos3) + (d20 * sin3);
                double d32 = (d16 * sin3) - (d17 * cos3);
                double d33 = (sin3 * d19) + (cos3 * d20);
                double d34 = d29 - d24;
                double tan = Math.tan(d34 / 2.0d);
                double sin4 = (Math.sin(d34) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d35 = d27 + (d26 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d35, (float) (d28 + (d25 * sin4)), (float) (d30 - (sin4 * d32)), (float) (d31 - (sin4 * d33)), (float) d30, (float) d31);
                i4++;
                d23 = d23;
                sin = sin;
                d27 = d30;
                d19 = d19;
                cos = cos;
                d24 = d29;
                d25 = d33;
                d26 = d32;
                ceil = ceil;
                d28 = d31;
                d14 = d7;
            }
        }

        private static void drawArc(Path path, float f5, float f6, float f7, float f8, float f9, float f10, float f11, boolean z4, boolean z5) {
            double d5;
            double d6;
            double radians = Math.toRadians(f11);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d7 = f5;
            Double.isNaN(d7);
            double d8 = d7 * cos;
            double d9 = f6;
            Double.isNaN(d9);
            double d10 = f9;
            Double.isNaN(d10);
            double d11 = (d8 + (d9 * sin)) / d10;
            double d12 = -f5;
            Double.isNaN(d12);
            Double.isNaN(d9);
            double d13 = f10;
            Double.isNaN(d13);
            double d14 = ((d12 * sin) + (d9 * cos)) / d13;
            double d15 = f7;
            Double.isNaN(d15);
            double d16 = f8;
            Double.isNaN(d16);
            Double.isNaN(d10);
            double d17 = ((d15 * cos) + (d16 * sin)) / d10;
            double d18 = -f7;
            Double.isNaN(d18);
            Double.isNaN(d16);
            Double.isNaN(d13);
            double d19 = ((d18 * sin) + (d16 * cos)) / d13;
            double d20 = d11 - d17;
            double d21 = d14 - d19;
            double d22 = (d11 + d17) / 2.0d;
            double d23 = (d14 + d19) / 2.0d;
            double d24 = (d20 * d20) + (d21 * d21);
            if (d24 == 0.0d) {
                return;
            }
            double d25 = (1.0d / d24) - 0.25d;
            if (d25 < 0.0d) {
                StringBuilder sb = new StringBuilder();
                sb.append("Points are too far apart ");
                sb.append(d24);
                float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
                drawArc(path, f5, f6, f7, f8, f9 * sqrt, f10 * sqrt, f11, z4, z5);
                return;
            }
            double sqrt2 = Math.sqrt(d25);
            double d26 = d20 * sqrt2;
            double d27 = sqrt2 * d21;
            if (z4 == z5) {
                d5 = d22 - d27;
                d6 = d23 + d26;
            } else {
                d5 = d22 + d27;
                d6 = d23 - d26;
            }
            double atan2 = Math.atan2(d14 - d6, d11 - d5);
            double atan22 = Math.atan2(d19 - d6, d17 - d5) - atan2;
            if (z5 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            Double.isNaN(d10);
            double d28 = d5 * d10;
            Double.isNaN(d13);
            double d29 = d6 * d13;
            arcToBezier(path, (d28 * cos) - (d29 * sin), (d28 * sin) + (d29 * cos), d10, d13, d7, d9, radians, atan2, atan22);
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c5 = 'm';
            for (int i4 = 0; i4 < pathDataNodeArr.length; i4++) {
                addCommand(path, fArr, c5, pathDataNodeArr[i4].mType, pathDataNodeArr[i4].mParams);
                c5 = pathDataNodeArr[i4].mType;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f5) {
            this.mType = pathDataNode.mType;
            int i4 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i4 >= fArr.length) {
                    return;
                }
                this.mParams[i4] = (fArr[i4] * (1.0f - f5)) + (pathDataNode2.mParams[i4] * f5);
                i4++;
            }
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }
    }
}
