package com.google.zxing.aztec.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
/* loaded from: classes3.dex */
public final class Detector {
    private boolean compact;
    private final BitMatrix image;
    private int nbCenterLayers;
    private int nbDataBlocks;
    private int nbLayers;
    private int shift;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Point {

        /* renamed from: x  reason: collision with root package name */
        public final int f13139x;

        /* renamed from: y  reason: collision with root package name */
        public final int f13140y;

        public ResultPoint toResultPoint() {
            return new ResultPoint(this.f13139x, this.f13140y);
        }

        private Point(int i4, int i5) {
            this.f13139x = i4;
            this.f13140y = i5;
        }
    }

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private static void correctParameterData(boolean[] zArr, boolean z4) throws NotFoundException {
        int i4;
        int i5;
        if (z4) {
            i4 = 7;
            i5 = 2;
        } else {
            i4 = 10;
            i5 = 4;
        }
        int i6 = i4 - i5;
        int[] iArr = new int[i4];
        int i7 = 0;
        while (true) {
            if (i7 >= i4) {
                try {
                    break;
                } catch (ReedSolomonException unused) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            int i8 = 1;
            for (int i9 = 1; i9 <= 4; i9++) {
                if (zArr[((4 * i7) + 4) - i9]) {
                    iArr[i7] = iArr[i7] + i8;
                }
                i8 <<= 1;
            }
            i7++;
        }
        new ReedSolomonDecoder(GenericGF.AZTEC_PARAM).decode(iArr, i6);
        for (int i10 = 0; i10 < i5; i10++) {
            int i11 = 1;
            for (int i12 = 1; i12 <= 4; i12++) {
                zArr[((i10 * 4) + 4) - i12] = (iArr[i10] & i11) == i11;
                i11 <<= 1;
            }
        }
    }

    private static float distance(Point point, Point point2) {
        int i4 = point.f13139x;
        int i5 = point2.f13139x;
        int i6 = point.f13140y;
        int i7 = point2.f13140y;
        return (float) Math.sqrt(((i4 - i5) * (i4 - i5)) + ((i6 - i7) * (i6 - i7)));
    }

    private void extractParameters(Point[] pointArr) throws NotFoundException {
        boolean[] zArr;
        int i4 = 0;
        boolean[] sampleLine = sampleLine(pointArr[0], pointArr[1], (this.nbCenterLayers * 2) + 1);
        boolean[] sampleLine2 = sampleLine(pointArr[1], pointArr[2], (this.nbCenterLayers * 2) + 1);
        boolean[] sampleLine3 = sampleLine(pointArr[2], pointArr[3], (this.nbCenterLayers * 2) + 1);
        boolean[] sampleLine4 = sampleLine(pointArr[3], pointArr[0], (this.nbCenterLayers * 2) + 1);
        if (sampleLine[0] && sampleLine[this.nbCenterLayers * 2]) {
            this.shift = 0;
        } else if (sampleLine2[0] && sampleLine2[this.nbCenterLayers * 2]) {
            this.shift = 1;
        } else if (sampleLine3[0] && sampleLine3[this.nbCenterLayers * 2]) {
            this.shift = 2;
        } else if (sampleLine4[0] && sampleLine4[this.nbCenterLayers * 2]) {
            this.shift = 3;
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
        if (this.compact) {
            boolean[] zArr2 = new boolean[28];
            for (int i5 = 0; i5 < 7; i5++) {
                int i6 = i5 + 2;
                zArr2[i5] = sampleLine[i6];
                zArr2[i5 + 7] = sampleLine2[i6];
                zArr2[i5 + 14] = sampleLine3[i6];
                zArr2[i5 + 21] = sampleLine4[i6];
            }
            zArr = new boolean[28];
            while (i4 < 28) {
                zArr[i4] = zArr2[((this.shift * 7) + i4) % 28];
                i4++;
            }
        } else {
            boolean[] zArr3 = new boolean[40];
            for (int i7 = 0; i7 < 11; i7++) {
                if (i7 < 5) {
                    int i8 = i7 + 2;
                    zArr3[i7] = sampleLine[i8];
                    zArr3[i7 + 10] = sampleLine2[i8];
                    zArr3[i7 + 20] = sampleLine3[i8];
                    zArr3[i7 + 30] = sampleLine4[i8];
                }
                if (i7 > 5) {
                    int i9 = i7 + 2;
                    zArr3[i7 - 1] = sampleLine[i9];
                    zArr3[(i7 + 10) - 1] = sampleLine2[i9];
                    zArr3[(i7 + 20) - 1] = sampleLine3[i9];
                    zArr3[(i7 + 30) - 1] = sampleLine4[i9];
                }
            }
            zArr = new boolean[40];
            while (i4 < 40) {
                zArr[i4] = zArr3[((this.shift * 10) + i4) % 40];
                i4++;
            }
        }
        correctParameterData(zArr, this.compact);
        getParameters(zArr);
    }

    private Point[] getBullEyeCornerPoints(Point point) throws NotFoundException {
        int i4;
        int i5;
        this.nbCenterLayers = 1;
        Point point2 = point;
        Point point3 = point2;
        Point point4 = point3;
        Point point5 = point4;
        boolean z4 = true;
        while (this.nbCenterLayers < 9) {
            Point firstDifferent = getFirstDifferent(point2, z4, 1, -1);
            Point firstDifferent2 = getFirstDifferent(point3, z4, 1, 1);
            Point firstDifferent3 = getFirstDifferent(point4, z4, -1, 1);
            Point firstDifferent4 = getFirstDifferent(point5, z4, -1, -1);
            if (this.nbCenterLayers > 2) {
                double distance = (distance(firstDifferent4, firstDifferent) * this.nbCenterLayers) / (distance(point5, point2) * (this.nbCenterLayers + 2));
                if (distance < 0.75d || distance > 1.25d || !isWhiteOrBlackRectangle(firstDifferent, firstDifferent2, firstDifferent3, firstDifferent4)) {
                    break;
                }
            }
            z4 = !z4;
            this.nbCenterLayers++;
            point5 = firstDifferent4;
            point2 = firstDifferent;
            point3 = firstDifferent2;
            point4 = firstDifferent3;
        }
        int i6 = this.nbCenterLayers;
        if (i6 != 5 && i6 != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.compact = i6 == 5;
        float f5 = 1.5f / ((i6 * 2) - 3);
        int i7 = point2.f13139x;
        float f6 = (i7 - i4) * f5;
        int round = round(point4.f13139x - f6);
        float f7 = (point2.f13140y - point4.f13140y) * f5;
        int round2 = round(point4.f13140y - f7);
        int round3 = round(point2.f13139x + f6);
        int round4 = round(point2.f13140y + f7);
        int i8 = point3.f13139x;
        float f8 = (i8 - i5) * f5;
        int round5 = round(point5.f13139x - f8);
        float f9 = f5 * (point3.f13140y - point5.f13140y);
        int round6 = round(point5.f13140y - f9);
        int round7 = round(point3.f13139x + f8);
        int round8 = round(point3.f13140y + f9);
        if (isValid(round3, round4) && isValid(round7, round8) && isValid(round, round2) && isValid(round5, round6)) {
            return new Point[]{new Point(round3, round4), new Point(round7, round8), new Point(round, round2), new Point(round5, round6)};
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private int getColor(Point point, Point point2) {
        float distance = distance(point, point2);
        int i4 = point2.f13139x;
        int i5 = point.f13139x;
        float f5 = (i4 - i5) / distance;
        int i6 = point2.f13140y;
        int i7 = point.f13140y;
        float f6 = (i6 - i7) / distance;
        float f7 = i5;
        float f8 = i7;
        boolean z4 = this.image.get(i5, i7);
        int i8 = 0;
        for (int i9 = 0; i9 < distance; i9++) {
            f7 += f5;
            f8 += f6;
            if (this.image.get(round(f7), round(f8)) != z4) {
                i8++;
            }
        }
        double d5 = i8 / distance;
        if (d5 <= 0.1d || d5 >= 0.9d) {
            return d5 <= 0.1d ? z4 ? 1 : -1 : z4 ? -1 : 1;
        }
        return 0;
    }

    private Point getFirstDifferent(Point point, boolean z4, int i4, int i5) {
        int i6 = point.f13139x + i4;
        int i7 = point.f13140y;
        while (true) {
            i7 += i5;
            if (!isValid(i6, i7) || this.image.get(i6, i7) != z4) {
                break;
            }
            i6 += i4;
        }
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        while (isValid(i8, i9) && this.image.get(i8, i9) == z4) {
            i8 += i4;
        }
        int i10 = i8 - i4;
        while (isValid(i10, i9) && this.image.get(i10, i9) == z4) {
            i9 += i5;
        }
        return new Point(i10, i9 - i5);
    }

    private Point getMatrixCenter() {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint resultPoint4;
        ResultPoint resultPoint5;
        ResultPoint resultPoint6;
        ResultPoint resultPoint7;
        ResultPoint resultPoint8;
        try {
            ResultPoint[] detect = new WhiteRectangleDetector(this.image).detect();
            resultPoint3 = detect[0];
            resultPoint4 = detect[1];
            resultPoint2 = detect[2];
            resultPoint = detect[3];
        } catch (NotFoundException unused) {
            int width = this.image.getWidth() / 2;
            int height = this.image.getHeight() / 2;
            int i4 = width + 7;
            int i5 = height - 7;
            ResultPoint resultPoint9 = getFirstDifferent(new Point(i4, i5), false, 1, -1).toResultPoint();
            int i6 = height + 7;
            ResultPoint resultPoint10 = getFirstDifferent(new Point(i4, i6), false, 1, 1).toResultPoint();
            int i7 = width - 7;
            ResultPoint resultPoint11 = getFirstDifferent(new Point(i7, i6), false, -1, 1).toResultPoint();
            resultPoint = getFirstDifferent(new Point(i7, i5), false, -1, -1).toResultPoint();
            resultPoint2 = resultPoint11;
            resultPoint3 = resultPoint9;
            resultPoint4 = resultPoint10;
        }
        int round = round((((resultPoint3.getX() + resultPoint.getX()) + resultPoint4.getX()) + resultPoint2.getX()) / 4.0f);
        int round2 = round((((resultPoint3.getY() + resultPoint.getY()) + resultPoint4.getY()) + resultPoint2.getY()) / 4.0f);
        try {
            ResultPoint[] detect2 = new WhiteRectangleDetector(this.image, 15, round, round2).detect();
            resultPoint5 = detect2[0];
            resultPoint6 = detect2[1];
            resultPoint7 = detect2[2];
            resultPoint8 = detect2[3];
        } catch (NotFoundException unused2) {
            int i8 = round + 7;
            int i9 = round2 - 7;
            resultPoint5 = getFirstDifferent(new Point(i8, i9), false, 1, -1).toResultPoint();
            int i10 = round2 + 7;
            resultPoint6 = getFirstDifferent(new Point(i8, i10), false, 1, 1).toResultPoint();
            int i11 = round - 7;
            resultPoint7 = getFirstDifferent(new Point(i11, i10), false, -1, 1).toResultPoint();
            resultPoint8 = getFirstDifferent(new Point(i11, i9), false, -1, -1).toResultPoint();
        }
        return new Point(round((((resultPoint5.getX() + resultPoint8.getX()) + resultPoint6.getX()) + resultPoint7.getX()) / 4.0f), round((((resultPoint5.getY() + resultPoint8.getY()) + resultPoint6.getY()) + resultPoint7.getY()) / 4.0f));
    }

    private ResultPoint[] getMatrixCornerPoints(Point[] pointArr) throws NotFoundException {
        int i4 = this.nbLayers;
        float f5 = (((i4 * 2) + (i4 > 4 ? 1 : 0)) + ((i4 - 4) / 8)) / (this.nbCenterLayers * 2.0f);
        int i5 = pointArr[0].f13139x - pointArr[2].f13139x;
        int i6 = i5 + (i5 > 0 ? 1 : -1);
        int i7 = pointArr[0].f13140y - pointArr[2].f13140y;
        int i8 = i7 + (i7 > 0 ? 1 : -1);
        float f6 = i6 * f5;
        int round = round(pointArr[2].f13139x - f6);
        float f7 = i8 * f5;
        int round2 = round(pointArr[2].f13140y - f7);
        int round3 = round(pointArr[0].f13139x + f6);
        int round4 = round(pointArr[0].f13140y + f7);
        int i9 = pointArr[1].f13139x - pointArr[3].f13139x;
        int i10 = i9 + (i9 > 0 ? 1 : -1);
        int i11 = pointArr[1].f13140y - pointArr[3].f13140y;
        int i12 = i11 + (i11 > 0 ? 1 : -1);
        float f8 = i10 * f5;
        int round5 = round(pointArr[3].f13139x - f8);
        float f9 = f5 * i12;
        int round6 = round(pointArr[3].f13140y - f9);
        int round7 = round(pointArr[1].f13139x + f8);
        int round8 = round(pointArr[1].f13140y + f9);
        if (isValid(round3, round4) && isValid(round7, round8) && isValid(round, round2) && isValid(round5, round6)) {
            return new ResultPoint[]{new ResultPoint(round3, round4), new ResultPoint(round7, round8), new ResultPoint(round, round2), new ResultPoint(round5, round6)};
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void getParameters(boolean[] zArr) {
        int i4;
        int i5;
        if (this.compact) {
            i4 = 2;
            i5 = 6;
        } else {
            i4 = 5;
            i5 = 11;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = this.nbLayers << 1;
            this.nbLayers = i7;
            if (zArr[i6]) {
                this.nbLayers = i7 + 1;
            }
        }
        for (int i8 = i4; i8 < i4 + i5; i8++) {
            int i9 = this.nbDataBlocks << 1;
            this.nbDataBlocks = i9;
            if (zArr[i8]) {
                this.nbDataBlocks = i9 + 1;
            }
        }
        this.nbLayers++;
        this.nbDataBlocks++;
    }

    private boolean isValid(int i4, int i5) {
        return i4 >= 0 && i4 < this.image.getWidth() && i5 > 0 && i5 < this.image.getHeight();
    }

    private boolean isWhiteOrBlackRectangle(Point point, Point point2, Point point3, Point point4) {
        Point point5 = new Point(point.f13139x - 3, point.f13140y + 3);
        Point point6 = new Point(point2.f13139x - 3, point2.f13140y - 3);
        Point point7 = new Point(point3.f13139x + 3, point3.f13140y - 3);
        Point point8 = new Point(point4.f13139x + 3, point4.f13140y + 3);
        int color = getColor(point8, point5);
        return color != 0 && getColor(point5, point6) == color && getColor(point6, point7) == color && getColor(point7, point8) == color;
    }

    private static int round(float f5) {
        return (int) (f5 + 0.5f);
    }

    private BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
        int i4;
        if (this.compact) {
            i4 = (this.nbLayers * 4) + 11;
        } else {
            int i5 = this.nbLayers;
            i4 = i5 <= 4 ? (i5 * 4) + 15 : (i5 * 4) + ((((i5 - 4) / 8) + 1) * 2) + 15;
        }
        int i6 = i4;
        float f5 = i6 - 0.5f;
        return GridSampler.getInstance().sampleGrid(bitMatrix, i6, i6, 0.5f, 0.5f, f5, 0.5f, f5, f5, 0.5f, f5, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private boolean[] sampleLine(Point point, Point point2, int i4) {
        int i5;
        boolean[] zArr = new boolean[i4];
        float distance = distance(point, point2);
        float f5 = distance / (i4 - 1);
        int i6 = point2.f13139x;
        int i7 = point.f13139x;
        float f6 = ((i6 - i7) * f5) / distance;
        int i8 = point2.f13140y;
        float f7 = (f5 * (i8 - i5)) / distance;
        float f8 = i7;
        float f9 = point.f13140y;
        for (int i9 = 0; i9 < i4; i9++) {
            zArr[i9] = this.image.get(round(f8), round(f9));
            f8 += f6;
            f9 += f7;
        }
        return zArr;
    }

    public AztecDetectorResult detect() throws NotFoundException {
        Point[] bullEyeCornerPoints = getBullEyeCornerPoints(getMatrixCenter());
        extractParameters(bullEyeCornerPoints);
        ResultPoint[] matrixCornerPoints = getMatrixCornerPoints(bullEyeCornerPoints);
        BitMatrix bitMatrix = this.image;
        int i4 = this.shift;
        return new AztecDetectorResult(sampleGrid(bitMatrix, matrixCornerPoints[i4 % 4], matrixCornerPoints[(i4 + 3) % 4], matrixCornerPoints[(i4 + 2) % 4], matrixCornerPoints[(i4 + 1) % 4]), matrixCornerPoints, this.compact, this.nbDataBlocks, this.nbLayers);
    }
}
