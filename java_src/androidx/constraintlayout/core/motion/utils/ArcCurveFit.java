package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
/* loaded from: classes.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    /* loaded from: classes.dex */
    private static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] ourPercent = new double[91];
        boolean linear;
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        Arc(int i4, double d5, double d6, double d7, double d8, double d9, double d10) {
            this.linear = false;
            this.mVertical = i4 == 1;
            this.mTime1 = d5;
            this.mTime2 = d6;
            this.mOneOverDeltaTime = 1.0d / (d6 - d5);
            if (3 == i4) {
                this.linear = true;
            }
            double d11 = d9 - d7;
            double d12 = d10 - d8;
            if (!this.linear && Math.abs(d11) >= EPSILON && Math.abs(d12) >= EPSILON) {
                this.mLut = new double[101];
                boolean z4 = this.mVertical;
                double d13 = z4 ? -1 : 1;
                Double.isNaN(d13);
                this.mEllipseA = d11 * d13;
                double d14 = z4 ? 1 : -1;
                Double.isNaN(d14);
                this.mEllipseB = d12 * d14;
                this.mEllipseCenterX = z4 ? d9 : d7;
                this.mEllipseCenterY = z4 ? d8 : d10;
                buildTable(d7, d8, d9, d10);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.linear = true;
            this.mX1 = d7;
            this.mX2 = d9;
            this.mY1 = d8;
            this.mY2 = d10;
            double hypot = Math.hypot(d12, d11);
            this.mArcDistance = hypot;
            this.mArcVelocity = hypot * this.mOneOverDeltaTime;
            double d15 = this.mTime2;
            double d16 = this.mTime1;
            this.mEllipseCenterX = d11 / (d15 - d16);
            this.mEllipseCenterY = d12 / (d15 - d16);
        }

        private void buildTable(double d5, double d6, double d7, double d8) {
            double[] dArr;
            double[] dArr2;
            double d9;
            double d10 = d7 - d5;
            double d11 = d6 - d8;
            int i4 = 0;
            double d12 = 0.0d;
            double d13 = 0.0d;
            double d14 = 0.0d;
            while (true) {
                if (i4 >= ourPercent.length) {
                    break;
                }
                double d15 = i4;
                Double.isNaN(d15);
                double d16 = d12;
                double length = dArr.length - 1;
                Double.isNaN(length);
                double radians = Math.toRadians((d15 * 90.0d) / length);
                double sin = Math.sin(radians) * d10;
                double cos = Math.cos(radians) * d11;
                if (i4 > 0) {
                    d9 = Math.hypot(sin - d13, cos - d14) + d16;
                    ourPercent[i4] = d9;
                } else {
                    d9 = d16;
                }
                i4++;
                d14 = cos;
                d12 = d9;
                d13 = sin;
            }
            double d17 = d12;
            this.mArcDistance = d17;
            int i5 = 0;
            while (true) {
                double[] dArr3 = ourPercent;
                if (i5 >= dArr3.length) {
                    break;
                }
                dArr3[i5] = dArr3[i5] / d17;
                i5++;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= this.mLut.length) {
                    return;
                }
                double d18 = i6;
                double length2 = dArr2.length - 1;
                Double.isNaN(d18);
                Double.isNaN(length2);
                double d19 = d18 / length2;
                int binarySearch = Arrays.binarySearch(ourPercent, d19);
                if (binarySearch >= 0) {
                    double[] dArr4 = this.mLut;
                    double d20 = binarySearch;
                    double length3 = ourPercent.length - 1;
                    Double.isNaN(d20);
                    Double.isNaN(length3);
                    dArr4[i6] = d20 / length3;
                } else if (binarySearch == -1) {
                    this.mLut[i6] = 0.0d;
                } else {
                    int i7 = -binarySearch;
                    int i8 = i7 - 2;
                    double d21 = i8;
                    double[] dArr5 = ourPercent;
                    Double.isNaN(d21);
                    double length4 = dArr5.length - 1;
                    Double.isNaN(length4);
                    this.mLut[i6] = (d21 + ((d19 - dArr5[i8]) / (dArr5[i7 - 1] - dArr5[i8]))) / length4;
                }
                i6++;
            }
        }

        double getDX() {
            double d5 = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d5, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d5 = -d5;
            }
            return d5 * hypot;
        }

        double getDY() {
            double d5 = this.mEllipseA * this.mTmpCosAngle;
            double d6 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d5, d6);
            return this.mVertical ? (-d6) * hypot : d6 * hypot;
        }

        public double getLinearDX(double d5) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d5) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d5) {
            double d6 = (d5 - this.mTime1) * this.mOneOverDeltaTime;
            double d7 = this.mX1;
            return d7 + (d6 * (this.mX2 - d7));
        }

        public double getLinearY(double d5) {
            double d6 = (d5 - this.mTime1) * this.mOneOverDeltaTime;
            double d7 = this.mY1;
            return d7 + (d6 * (this.mY2 - d7));
        }

        double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        double lookup(double d5) {
            if (d5 <= 0.0d) {
                return 0.0d;
            }
            if (d5 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = dArr.length - 1;
            Double.isNaN(length);
            double d6 = d5 * length;
            int i4 = (int) d6;
            double d7 = i4;
            Double.isNaN(d7);
            return dArr[i4] + ((d6 - d7) * (dArr[i4 + 1] - dArr[i4]));
        }

        void setPoint(double d5) {
            double lookup = lookup((this.mVertical ? this.mTime2 - d5 : d5 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }
    }

    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        this.mTime = dArr;
        this.mArcs = new Arc[dArr.length - 1];
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        while (true) {
            Arc[] arcArr = this.mArcs;
            if (i4 >= arcArr.length) {
                return;
            }
            int i7 = iArr[i4];
            if (i7 == 0) {
                i6 = 3;
            } else if (i7 == 1) {
                i5 = 1;
                i6 = 1;
            } else if (i7 == 2) {
                i5 = 2;
                i6 = 2;
            } else if (i7 == 3) {
                i5 = i5 == 1 ? 2 : 1;
                i6 = i5;
            }
            int i8 = i4 + 1;
            arcArr[i4] = new Arc(i6, dArr[i4], dArr[i8], dArr2[i4][0], dArr2[i4][1], dArr2[i8][0], dArr2[i8][1]);
            i4 = i8;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d5, double[] dArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            if (d5 < arcArr[0].mTime1) {
                double d6 = arcArr[0].mTime1;
                double d7 = d5 - arcArr[0].mTime1;
                if (arcArr[0].linear) {
                    dArr[0] = arcArr[0].getLinearX(d6) + (this.mArcs[0].getLinearDX(d6) * d7);
                    dArr[1] = this.mArcs[0].getLinearY(d6) + (d7 * this.mArcs[0].getLinearDY(d6));
                    return;
                }
                arcArr[0].setPoint(d6);
                dArr[0] = this.mArcs[0].getX() + (this.mArcs[0].getDX() * d7);
                dArr[1] = this.mArcs[0].getY() + (d7 * this.mArcs[0].getDY());
                return;
            } else if (d5 > arcArr[arcArr.length - 1].mTime2) {
                double d8 = arcArr[arcArr.length - 1].mTime2;
                double d9 = d5 - d8;
                int length = arcArr.length - 1;
                if (arcArr[length].linear) {
                    dArr[0] = arcArr[length].getLinearX(d8) + (this.mArcs[length].getLinearDX(d8) * d9);
                    dArr[1] = this.mArcs[length].getLinearY(d8) + (d9 * this.mArcs[length].getLinearDY(d8));
                    return;
                }
                arcArr[length].setPoint(d5);
                dArr[0] = this.mArcs[length].getX() + (this.mArcs[length].getDX() * d9);
                dArr[1] = this.mArcs[length].getY() + (d9 * this.mArcs[length].getDY());
                return;
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            if (d5 < arcArr2[0].mTime1) {
                d5 = arcArr2[0].mTime1;
            }
            if (d5 > arcArr2[arcArr2.length - 1].mTime2) {
                d5 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i4 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i4 >= arcArr3.length) {
                return;
            }
            if (d5 <= arcArr3[i4].mTime2) {
                if (arcArr3[i4].linear) {
                    dArr[0] = arcArr3[i4].getLinearX(d5);
                    dArr[1] = this.mArcs[i4].getLinearY(d5);
                    return;
                }
                arcArr3[i4].setPoint(d5);
                dArr[0] = this.mArcs[i4].getX();
                dArr[1] = this.mArcs[i4].getY();
                return;
            }
            i4++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d5, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        if (d5 < arcArr[0].mTime1) {
            d5 = arcArr[0].mTime1;
        } else if (d5 > arcArr[arcArr.length - 1].mTime2) {
            d5 = arcArr[arcArr.length - 1].mTime2;
        }
        int i4 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i4 >= arcArr2.length) {
                return;
            }
            if (d5 <= arcArr2[i4].mTime2) {
                if (arcArr2[i4].linear) {
                    dArr[0] = arcArr2[i4].getLinearDX(d5);
                    dArr[1] = this.mArcs[i4].getLinearDY(d5);
                    return;
                }
                arcArr2[i4].setPoint(d5);
                dArr[0] = this.mArcs[i4].getDX();
                dArr[1] = this.mArcs[i4].getDY();
                return;
            }
            i4++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d5, int i4) {
        Arc[] arcArr = this.mArcs;
        int i5 = 0;
        if (d5 < arcArr[0].mTime1) {
            d5 = arcArr[0].mTime1;
        }
        if (d5 > arcArr[arcArr.length - 1].mTime2) {
            d5 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i5 >= arcArr2.length) {
                return Double.NaN;
            }
            if (d5 <= arcArr2[i5].mTime2) {
                if (arcArr2[i5].linear) {
                    if (i4 == 0) {
                        return arcArr2[i5].getLinearDX(d5);
                    }
                    return arcArr2[i5].getLinearDY(d5);
                }
                arcArr2[i5].setPoint(d5);
                if (i4 == 0) {
                    return this.mArcs[i5].getDX();
                }
                return this.mArcs[i5].getDY();
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d5, float[] fArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            if (d5 < arcArr[0].mTime1) {
                double d6 = arcArr[0].mTime1;
                double d7 = d5 - arcArr[0].mTime1;
                if (arcArr[0].linear) {
                    fArr[0] = (float) (arcArr[0].getLinearX(d6) + (this.mArcs[0].getLinearDX(d6) * d7));
                    fArr[1] = (float) (this.mArcs[0].getLinearY(d6) + (d7 * this.mArcs[0].getLinearDY(d6)));
                    return;
                }
                arcArr[0].setPoint(d6);
                fArr[0] = (float) (this.mArcs[0].getX() + (this.mArcs[0].getDX() * d7));
                fArr[1] = (float) (this.mArcs[0].getY() + (d7 * this.mArcs[0].getDY()));
                return;
            } else if (d5 > arcArr[arcArr.length - 1].mTime2) {
                double d8 = arcArr[arcArr.length - 1].mTime2;
                double d9 = d5 - d8;
                int length = arcArr.length - 1;
                if (arcArr[length].linear) {
                    fArr[0] = (float) (arcArr[length].getLinearX(d8) + (this.mArcs[length].getLinearDX(d8) * d9));
                    fArr[1] = (float) (this.mArcs[length].getLinearY(d8) + (d9 * this.mArcs[length].getLinearDY(d8)));
                    return;
                }
                arcArr[length].setPoint(d5);
                fArr[0] = (float) this.mArcs[length].getX();
                fArr[1] = (float) this.mArcs[length].getY();
                return;
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            if (d5 < arcArr2[0].mTime1) {
                d5 = arcArr2[0].mTime1;
            } else if (d5 > arcArr2[arcArr2.length - 1].mTime2) {
                d5 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i4 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i4 >= arcArr3.length) {
                return;
            }
            if (d5 <= arcArr3[i4].mTime2) {
                if (arcArr3[i4].linear) {
                    fArr[0] = (float) arcArr3[i4].getLinearX(d5);
                    fArr[1] = (float) this.mArcs[i4].getLinearY(d5);
                    return;
                }
                arcArr3[i4].setPoint(d5);
                fArr[0] = (float) this.mArcs[i4].getX();
                fArr[1] = (float) this.mArcs[i4].getY();
                return;
            }
            i4++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d5, int i4) {
        double d6;
        double linearY;
        double linearDY;
        double y2;
        double dy;
        int i5 = 0;
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            if (d5 < arcArr[0].mTime1) {
                double d7 = arcArr[0].mTime1;
                d6 = d5 - arcArr[0].mTime1;
                if (!arcArr[0].linear) {
                    arcArr[0].setPoint(d7);
                    if (i4 == 0) {
                        y2 = this.mArcs[0].getX();
                        dy = this.mArcs[0].getDX();
                    } else {
                        y2 = this.mArcs[0].getY();
                        dy = this.mArcs[0].getDY();
                    }
                    return y2 + (d6 * dy);
                } else if (i4 == 0) {
                    linearY = arcArr[0].getLinearX(d7);
                    linearDY = this.mArcs[0].getLinearDX(d7);
                } else {
                    linearY = arcArr[0].getLinearY(d7);
                    linearDY = this.mArcs[0].getLinearDY(d7);
                }
            } else if (d5 > arcArr[arcArr.length - 1].mTime2) {
                double d8 = arcArr[arcArr.length - 1].mTime2;
                d6 = d5 - d8;
                int length = arcArr.length - 1;
                if (i4 == 0) {
                    linearY = arcArr[length].getLinearX(d8);
                    linearDY = this.mArcs[length].getLinearDX(d8);
                } else {
                    linearY = arcArr[length].getLinearY(d8);
                    linearDY = this.mArcs[length].getLinearDY(d8);
                }
            }
            return linearY + (d6 * linearDY);
        }
        Arc[] arcArr2 = this.mArcs;
        if (d5 < arcArr2[0].mTime1) {
            d5 = arcArr2[0].mTime1;
        } else if (d5 > arcArr2[arcArr2.length - 1].mTime2) {
            d5 = arcArr2[arcArr2.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i5 >= arcArr3.length) {
                return Double.NaN;
            }
            if (d5 <= arcArr3[i5].mTime2) {
                if (arcArr3[i5].linear) {
                    if (i4 == 0) {
                        return arcArr3[i5].getLinearX(d5);
                    }
                    return arcArr3[i5].getLinearY(d5);
                }
                arcArr3[i5].setPoint(d5);
                if (i4 == 0) {
                    return this.mArcs[i5].getX();
                }
                return this.mArcs[i5].getY();
            }
            i5++;
        }
    }
}
