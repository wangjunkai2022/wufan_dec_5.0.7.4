package com.google.android.material.transition;

import android.graphics.RectF;
/* loaded from: classes3.dex */
class FitModeEvaluators {
    private static final FitModeEvaluator WIDTH = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.1
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f5, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f5;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
            float lerp = TransitionUtils.lerp(f8, f10, f6, f7, f5, true);
            float f12 = lerp / f8;
            float f13 = lerp / f10;
            return new FitModeResult(f12, f13, lerp, f9 * f12, lerp, f11 * f13);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartHeight > fitModeResult.currentEndHeight;
        }
    };
    private static final FitModeEvaluator HEIGHT = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.2
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f5, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f5;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
            float lerp = TransitionUtils.lerp(f9, f11, f6, f7, f5, true);
            float f12 = lerp / f9;
            float f13 = lerp / f11;
            return new FitModeResult(f12, f13, f8 * f12, lerp, f10 * f13, lerp);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartWidth > fitModeResult.currentEndWidth;
        }
    };

    private FitModeEvaluators() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FitModeEvaluator get(int i4, boolean z4, RectF rectF, RectF rectF2) {
        if (i4 == 0) {
            return shouldAutoFitToWidth(z4, rectF, rectF2) ? WIDTH : HEIGHT;
        } else if (i4 != 1) {
            if (i4 == 2) {
                return HEIGHT;
            }
            throw new IllegalArgumentException("Invalid fit mode: " + i4);
        } else {
            return WIDTH;
        }
    }

    private static boolean shouldAutoFitToWidth(boolean z4, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f5 = (height2 * width) / width2;
        float f6 = (width2 * height) / width;
        if (z4) {
            if (f5 >= height) {
                return true;
            }
        } else if (f6 >= height2) {
            return true;
        }
        return false;
    }
}
