package com.google.zxing.common.reedsolomon;
/* loaded from: classes3.dex */
public final class ReedSolomonDecoder {
    private final GenericGF field;

    public ReedSolomonDecoder(GenericGF genericGF) {
        this.field = genericGF;
    }

    private int[] findErrorLocations(GenericGFPoly genericGFPoly) throws ReedSolomonException {
        int degree = genericGFPoly.getDegree();
        int i4 = 0;
        if (degree == 1) {
            return new int[]{genericGFPoly.getCoefficient(1)};
        }
        int[] iArr = new int[degree];
        for (int i5 = 1; i5 < this.field.getSize() && i4 < degree; i5++) {
            if (genericGFPoly.evaluateAt(i5) == 0) {
                iArr[i4] = this.field.inverse(i5);
                i4++;
            }
        }
        if (i4 == degree) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    private int[] findErrorMagnitudes(GenericGFPoly genericGFPoly, int[] iArr, boolean z4) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            int inverse = this.field.inverse(iArr[i4]);
            int i5 = 1;
            for (int i6 = 0; i6 < length; i6++) {
                if (i4 != i6) {
                    int multiply = this.field.multiply(iArr[i6], inverse);
                    i5 = this.field.multiply(i5, (multiply & 1) == 0 ? multiply | 1 : multiply & (-2));
                }
            }
            iArr2[i4] = this.field.multiply(genericGFPoly.evaluateAt(inverse), this.field.inverse(i5));
            if (z4) {
                iArr2[i4] = this.field.multiply(iArr2[i4], inverse);
            }
        }
        return iArr2;
    }

    private GenericGFPoly[] runEuclideanAlgorithm(GenericGFPoly genericGFPoly, GenericGFPoly genericGFPoly2, int i4) throws ReedSolomonException {
        if (genericGFPoly.getDegree() < genericGFPoly2.getDegree()) {
            genericGFPoly2 = genericGFPoly;
            genericGFPoly = genericGFPoly2;
        }
        GenericGFPoly one = this.field.getOne();
        GenericGFPoly zero = this.field.getZero();
        GenericGFPoly genericGFPoly3 = genericGFPoly2;
        GenericGFPoly genericGFPoly4 = genericGFPoly;
        GenericGFPoly genericGFPoly5 = genericGFPoly3;
        GenericGFPoly zero2 = this.field.getZero();
        GenericGFPoly one2 = this.field.getOne();
        while (genericGFPoly5.getDegree() >= i4 / 2) {
            if (!genericGFPoly5.isZero()) {
                GenericGFPoly zero3 = this.field.getZero();
                int inverse = this.field.inverse(genericGFPoly5.getCoefficient(genericGFPoly5.getDegree()));
                while (genericGFPoly4.getDegree() >= genericGFPoly5.getDegree() && !genericGFPoly4.isZero()) {
                    int degree = genericGFPoly4.getDegree() - genericGFPoly5.getDegree();
                    int multiply = this.field.multiply(genericGFPoly4.getCoefficient(genericGFPoly4.getDegree()), inverse);
                    zero3 = zero3.addOrSubtract(this.field.buildMonomial(degree, multiply));
                    genericGFPoly4 = genericGFPoly4.addOrSubtract(genericGFPoly5.multiplyByMonomial(degree, multiply));
                }
                GenericGFPoly addOrSubtract = zero3.multiply(zero).addOrSubtract(one);
                GenericGFPoly addOrSubtract2 = zero3.multiply(one2).addOrSubtract(zero2);
                GenericGFPoly genericGFPoly6 = genericGFPoly4;
                genericGFPoly4 = genericGFPoly5;
                genericGFPoly5 = genericGFPoly6;
                GenericGFPoly genericGFPoly7 = zero;
                zero = addOrSubtract;
                one = genericGFPoly7;
                zero2 = one2;
                one2 = addOrSubtract2;
            } else {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
        }
        int coefficient = one2.getCoefficient(0);
        if (coefficient != 0) {
            int inverse2 = this.field.inverse(coefficient);
            return new GenericGFPoly[]{one2.multiply(inverse2), genericGFPoly5.multiply(inverse2)};
        }
        throw new ReedSolomonException("sigmaTilde(0) was zero");
    }

    public void decode(int[] iArr, int i4) throws ReedSolomonException {
        GenericGFPoly genericGFPoly = new GenericGFPoly(this.field, iArr);
        int[] iArr2 = new int[i4];
        boolean equals = this.field.equals(GenericGF.DATA_MATRIX_FIELD_256);
        boolean z4 = true;
        for (int i5 = 0; i5 < i4; i5++) {
            int evaluateAt = genericGFPoly.evaluateAt(this.field.exp(equals ? i5 + 1 : i5));
            iArr2[(i4 - 1) - i5] = evaluateAt;
            if (evaluateAt != 0) {
                z4 = false;
            }
        }
        if (z4) {
            return;
        }
        GenericGFPoly[] runEuclideanAlgorithm = runEuclideanAlgorithm(this.field.buildMonomial(i4, 1), new GenericGFPoly(this.field, iArr2), i4);
        GenericGFPoly genericGFPoly2 = runEuclideanAlgorithm[0];
        GenericGFPoly genericGFPoly3 = runEuclideanAlgorithm[1];
        int[] findErrorLocations = findErrorLocations(genericGFPoly2);
        int[] findErrorMagnitudes = findErrorMagnitudes(genericGFPoly3, findErrorLocations, equals);
        for (int i6 = 0; i6 < findErrorLocations.length; i6++) {
            int length = (iArr.length - 1) - this.field.log(findErrorLocations[i6]);
            if (length >= 0) {
                iArr[length] = GenericGF.addOrSubtract(iArr[length], findErrorMagnitudes[i6]);
            } else {
                throw new ReedSolomonException("Bad error location");
            }
        }
    }
}
