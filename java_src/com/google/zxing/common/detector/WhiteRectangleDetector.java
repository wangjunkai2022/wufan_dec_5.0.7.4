package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
/* loaded from: classes3.dex */
public final class WhiteRectangleDetector {
    private static final int CORR = 1;
    private static final int INIT_SIZE = 30;
    private final int downInit;
    private final int height;
    private final BitMatrix image;
    private final int leftInit;
    private final int rightInit;
    private final int upInit;
    private final int width;

    public WhiteRectangleDetector(BitMatrix bitMatrix) throws NotFoundException {
        this.image = bitMatrix;
        int height = bitMatrix.getHeight();
        this.height = height;
        int width = bitMatrix.getWidth();
        this.width = width;
        int i4 = (width - 30) >> 1;
        this.leftInit = i4;
        int i5 = (width + 30) >> 1;
        this.rightInit = i5;
        int i6 = (height - 30) >> 1;
        this.upInit = i6;
        int i7 = (height + 30) >> 1;
        this.downInit = i7;
        if (i6 < 0 || i4 < 0 || i7 >= height || i5 >= width) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private ResultPoint[] centerEdges(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        float x4 = resultPoint.getX();
        float y2 = resultPoint.getY();
        float x5 = resultPoint2.getX();
        float y4 = resultPoint2.getY();
        float x6 = resultPoint3.getX();
        float y5 = resultPoint3.getY();
        float x7 = resultPoint4.getX();
        float y6 = resultPoint4.getY();
        return x4 < ((float) (this.width / 2)) ? new ResultPoint[]{new ResultPoint(x7 - 1.0f, y6 + 1.0f), new ResultPoint(x5 + 1.0f, y4 + 1.0f), new ResultPoint(x6 - 1.0f, y5 - 1.0f), new ResultPoint(x4 + 1.0f, y2 - 1.0f)} : new ResultPoint[]{new ResultPoint(x7 + 1.0f, y6 + 1.0f), new ResultPoint(x5 + 1.0f, y4 - 1.0f), new ResultPoint(x6 - 1.0f, y5 + 1.0f), new ResultPoint(x4 - 1.0f, y2 - 1.0f)};
    }

    private boolean containsBlackPoint(int i4, int i5, int i6, boolean z4) {
        if (z4) {
            while (i4 <= i5) {
                if (this.image.get(i4, i6)) {
                    return true;
                }
                i4++;
            }
            return false;
        }
        while (i4 <= i5) {
            if (this.image.get(i6, i4)) {
                return true;
            }
            i4++;
        }
        return false;
    }

    private static int distanceL2(float f5, float f6, float f7, float f8) {
        float f9 = f5 - f7;
        float f10 = f6 - f8;
        return round((float) Math.sqrt((f9 * f9) + (f10 * f10)));
    }

    private ResultPoint getBlackPointOnSegment(float f5, float f6, float f7, float f8) {
        int distanceL2 = distanceL2(f5, f6, f7, f8);
        float f9 = distanceL2;
        float f10 = (f7 - f5) / f9;
        float f11 = (f8 - f6) / f9;
        for (int i4 = 0; i4 < distanceL2; i4++) {
            float f12 = i4;
            int round = round((f12 * f10) + f5);
            int round2 = round((f12 * f11) + f6);
            if (this.image.get(round, round2)) {
                return new ResultPoint(round, round2);
            }
        }
        return null;
    }

    private static int round(float f5) {
        return (int) (f5 + 0.5f);
    }

    public ResultPoint[] detect() throws NotFoundException {
        int i4 = this.leftInit;
        int i5 = this.rightInit;
        int i6 = this.upInit;
        int i7 = this.downInit;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = false;
        while (z5) {
            boolean z7 = true;
            boolean z8 = false;
            while (z7 && i5 < this.width) {
                z7 = containsBlackPoint(i6, i7, i5, false);
                if (z7) {
                    i5++;
                    z8 = true;
                }
            }
            if (i5 < this.width) {
                boolean z9 = true;
                while (z9 && i7 < this.height) {
                    z9 = containsBlackPoint(i4, i5, i7, true);
                    if (z9) {
                        i7++;
                        z8 = true;
                    }
                }
                if (i7 < this.height) {
                    boolean z10 = true;
                    while (z10 && i4 >= 0) {
                        z10 = containsBlackPoint(i6, i7, i4, false);
                        if (z10) {
                            i4--;
                            z8 = true;
                        }
                    }
                    if (i4 >= 0) {
                        z5 = z8;
                        boolean z11 = true;
                        while (z11 && i6 >= 0) {
                            z11 = containsBlackPoint(i4, i5, i6, true);
                            if (z11) {
                                i6--;
                                z5 = true;
                            }
                        }
                        if (i6 >= 0) {
                            if (z5) {
                                z6 = true;
                            }
                        }
                    }
                }
            }
            z4 = true;
            break;
        }
        if (z4 || !z6) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i8 = i5 - i4;
        ResultPoint resultPoint = null;
        ResultPoint resultPoint2 = null;
        for (int i9 = 1; i9 < i8; i9++) {
            resultPoint2 = getBlackPointOnSegment(i4, i7 - i9, i4 + i9, i7);
            if (resultPoint2 != null) {
                break;
            }
        }
        if (resultPoint2 != null) {
            ResultPoint resultPoint3 = null;
            for (int i10 = 1; i10 < i8; i10++) {
                resultPoint3 = getBlackPointOnSegment(i4, i6 + i10, i4 + i10, i6);
                if (resultPoint3 != null) {
                    break;
                }
            }
            if (resultPoint3 != null) {
                ResultPoint resultPoint4 = null;
                for (int i11 = 1; i11 < i8; i11++) {
                    resultPoint4 = getBlackPointOnSegment(i5, i6 + i11, i5 - i11, i6);
                    if (resultPoint4 != null) {
                        break;
                    }
                }
                if (resultPoint4 != null) {
                    for (int i12 = 1; i12 < i8; i12++) {
                        resultPoint = getBlackPointOnSegment(i5, i7 - i12, i5 - i12, i7);
                        if (resultPoint != null) {
                            break;
                        }
                    }
                    if (resultPoint != null) {
                        return centerEdges(resultPoint, resultPoint2, resultPoint4, resultPoint3);
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                throw NotFoundException.getNotFoundInstance();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public WhiteRectangleDetector(BitMatrix bitMatrix, int i4, int i5, int i6) throws NotFoundException {
        this.image = bitMatrix;
        int height = bitMatrix.getHeight();
        this.height = height;
        int width = bitMatrix.getWidth();
        this.width = width;
        int i7 = i4 >> 1;
        int i8 = i5 - i7;
        this.leftInit = i8;
        int i9 = i5 + i7;
        this.rightInit = i9;
        int i10 = i6 - i7;
        this.upInit = i10;
        int i11 = i6 + i7;
        this.downInit = i11;
        if (i10 < 0 || i8 < 0 || i11 >= height || i9 >= width) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
