package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.qrcode.decoder.Version;
import java.util.Map;
/* loaded from: classes3.dex */
public class Detector {
    private final BitMatrix image;
    private ResultPointCallback resultPointCallback;

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private float calculateModuleSizeOneWay(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float sizeOfBlackWhiteBlackRunBothWays = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint.getX(), (int) resultPoint.getY(), (int) resultPoint2.getX(), (int) resultPoint2.getY());
        float sizeOfBlackWhiteBlackRunBothWays2 = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint2.getX(), (int) resultPoint2.getY(), (int) resultPoint.getX(), (int) resultPoint.getY());
        return Float.isNaN(sizeOfBlackWhiteBlackRunBothWays) ? sizeOfBlackWhiteBlackRunBothWays2 / 7.0f : Float.isNaN(sizeOfBlackWhiteBlackRunBothWays2) ? sizeOfBlackWhiteBlackRunBothWays / 7.0f : (sizeOfBlackWhiteBlackRunBothWays + sizeOfBlackWhiteBlackRunBothWays2) / 14.0f;
    }

    protected static int computeDimension(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, float f5) throws NotFoundException {
        int round = ((round(ResultPoint.distance(resultPoint, resultPoint2) / f5) + round(ResultPoint.distance(resultPoint, resultPoint3) / f5)) >> 1) + 7;
        int i4 = round & 3;
        if (i4 != 0) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return round;
                }
                throw NotFoundException.getNotFoundInstance();
            }
            return round - 1;
        }
        return round + 1;
    }

    public static PerspectiveTransform createTransform(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i4) {
        float x4;
        float y2;
        float f5;
        float f6 = i4 - 3.5f;
        if (resultPoint4 != null) {
            x4 = resultPoint4.getX();
            y2 = resultPoint4.getY();
            f5 = f6 - 3.0f;
        } else {
            x4 = (resultPoint2.getX() - resultPoint.getX()) + resultPoint3.getX();
            y2 = (resultPoint2.getY() - resultPoint.getY()) + resultPoint3.getY();
            f5 = f6;
        }
        return PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f6, 3.5f, f5, f5, 3.5f, f6, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), x4, y2, resultPoint3.getX(), resultPoint3.getY());
    }

    private static int round(float f5) {
        return (int) (f5 + 0.5f);
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, PerspectiveTransform perspectiveTransform, int i4) throws NotFoundException {
        return GridSampler.getInstance().sampleGrid(bitMatrix, i4, i4, perspectiveTransform);
    }

    private float sizeOfBlackWhiteBlackRun(int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        double sqrt;
        Detector detector;
        boolean z4;
        int i14 = 1;
        boolean z5 = Math.abs(i7 - i5) > Math.abs(i6 - i4);
        if (z5) {
            i9 = i4;
            i8 = i5;
            i11 = i6;
            i10 = i7;
        } else {
            i8 = i4;
            i9 = i5;
            i10 = i6;
            i11 = i7;
        }
        int abs = Math.abs(i10 - i8);
        int i15 = i11 - i9;
        int abs2 = Math.abs(i15);
        int i16 = (-abs) >> 1;
        int i17 = i8 < i10 ? 1 : -1;
        int i18 = i9 < i11 ? 1 : -1;
        int i19 = i10 + i17;
        int i20 = i8;
        int i21 = i9;
        int i22 = 0;
        while (true) {
            if (i20 == i19) {
                i12 = i19;
                i13 = i15;
                break;
            }
            int i23 = z5 ? i21 : i20;
            boolean z6 = z5;
            int i24 = z5 ? i20 : i21;
            if (i22 == i14) {
                detector = this;
                i12 = i19;
                i13 = i15;
                z4 = true;
            } else {
                detector = this;
                i12 = i19;
                i13 = i15;
                z4 = false;
            }
            if (z4 == detector.image.get(i23, i24)) {
                if (i22 == 2) {
                    int i25 = i20 - i8;
                    int i26 = i21 - i9;
                    sqrt = Math.sqrt((i25 * i25) + (i26 * i26));
                    break;
                }
                i22++;
            }
            i16 += abs2;
            if (i16 > 0) {
                if (i21 == i11) {
                    break;
                }
                i21 += i18;
                i16 -= abs;
            }
            i20 += i17;
            i15 = i13;
            i19 = i12;
            z5 = z6;
            i14 = 1;
        }
        if (i22 == 2) {
            int i27 = i12 - i8;
            sqrt = Math.sqrt((i27 * i27) + (i13 * i13));
            return (float) sqrt;
        }
        return Float.NaN;
    }

    private float sizeOfBlackWhiteBlackRunBothWays(int i4, int i5, int i6, int i7) {
        float f5;
        float f6;
        float sizeOfBlackWhiteBlackRun = sizeOfBlackWhiteBlackRun(i4, i5, i6, i7);
        int i8 = i4 - (i6 - i4);
        int i9 = 0;
        if (i8 < 0) {
            f5 = i4 / (i4 - i8);
            i8 = 0;
        } else if (i8 >= this.image.getWidth()) {
            f5 = ((this.image.getWidth() - 1) - i4) / (i8 - i4);
            i8 = this.image.getWidth() - 1;
        } else {
            f5 = 1.0f;
        }
        float f7 = i5;
        int i10 = (int) (f7 - ((i7 - i5) * f5));
        if (i10 < 0) {
            f6 = f7 / (i5 - i10);
        } else if (i10 >= this.image.getHeight()) {
            f6 = ((this.image.getHeight() - 1) - i5) / (i10 - i5);
            i9 = this.image.getHeight() - 1;
        } else {
            i9 = i10;
            f6 = 1.0f;
        }
        return (sizeOfBlackWhiteBlackRun + sizeOfBlackWhiteBlackRun(i4, i5, (int) (i4 + ((i8 - i4) * f6)), i9)) - 1.0f;
    }

    protected float calculateModuleSize(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        return (calculateModuleSizeOneWay(resultPoint, resultPoint2) + calculateModuleSizeOneWay(resultPoint, resultPoint3)) / 2.0f;
    }

    public DetectorResult detect() throws NotFoundException, FormatException {
        return detect(null);
    }

    protected AlignmentPattern findAlignmentInRegion(float f5, int i4, int i5, float f6) throws NotFoundException {
        int i6 = (int) (f6 * f5);
        int max = Math.max(0, i4 - i6);
        int min = Math.min(this.image.getWidth() - 1, i4 + i6) - max;
        float f7 = 3.0f * f5;
        if (min >= f7) {
            int max2 = Math.max(0, i5 - i6);
            int min2 = Math.min(this.image.getHeight() - 1, i5 + i6) - max2;
            if (min2 >= f7) {
                return new AlignmentPatternFinder(this.image, max, max2, min, min2, f5, this.resultPointCallback).find();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BitMatrix getImage() {
        return this.image;
    }

    protected ResultPointCallback getResultPointCallback() {
        return this.resultPointCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DetectorResult processFinderPatternInfo(FinderPatternInfo finderPatternInfo) throws NotFoundException, FormatException {
        FinderPattern topLeft = finderPatternInfo.getTopLeft();
        FinderPattern topRight = finderPatternInfo.getTopRight();
        FinderPattern bottomLeft = finderPatternInfo.getBottomLeft();
        float calculateModuleSize = calculateModuleSize(topLeft, topRight, bottomLeft);
        if (calculateModuleSize >= 1.0f) {
            int computeDimension = computeDimension(topLeft, topRight, bottomLeft, calculateModuleSize);
            Version provisionalVersionForDimension = Version.getProvisionalVersionForDimension(computeDimension);
            int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion() - 7;
            AlignmentPattern alignmentPattern = null;
            if (provisionalVersionForDimension.getAlignmentPatternCenters().length > 0) {
                float x4 = (topRight.getX() - topLeft.getX()) + bottomLeft.getX();
                float y2 = (topRight.getY() - topLeft.getY()) + bottomLeft.getY();
                float f5 = 1.0f - (3.0f / dimensionForVersion);
                int x5 = (int) (topLeft.getX() + ((x4 - topLeft.getX()) * f5));
                int y4 = (int) (topLeft.getY() + (f5 * (y2 - topLeft.getY())));
                for (int i4 = 4; i4 <= 16; i4 <<= 1) {
                    try {
                        alignmentPattern = findAlignmentInRegion(calculateModuleSize, x5, y4, i4);
                        break;
                    } catch (NotFoundException unused) {
                    }
                }
            }
            return new DetectorResult(sampleGrid(this.image, createTransform(topLeft, topRight, bottomLeft, alignmentPattern, computeDimension), computeDimension), alignmentPattern == null ? new ResultPoint[]{bottomLeft, topLeft, topRight} : new ResultPoint[]{bottomLeft, topLeft, topRight, alignmentPattern});
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public DetectorResult detect(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.resultPointCallback = resultPointCallback;
        return processFinderPatternInfo(new FinderPatternFinder(this.image, resultPointCallback).find(map));
    }
}
