package com.google.android.material.transition;
/* loaded from: classes3.dex */
class FadeModeEvaluators {
    private static final FadeModeEvaluator IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f5, float f6, float f7, float f8) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f6, f7, f5));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f5, float f6, float f7, float f8) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f6, f7, f5), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f5, float f6, float f7, float f8) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f6, f7, f5), TransitionUtils.lerp(0, 255, f6, f7, f5));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f5, float f6, float f7, float f8) {
            float f9 = ((f7 - f6) * f8) + f6;
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f6, f9, f5), TransitionUtils.lerp(0, 255, f9, f7, f5));
        }
    };

    private FadeModeEvaluators() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FadeModeEvaluator get(int i4, boolean z4) {
        if (i4 == 0) {
            return z4 ? IN : OUT;
        } else if (i4 == 1) {
            return z4 ? OUT : IN;
        } else if (i4 != 2) {
            if (i4 == 3) {
                return THROUGH;
            }
            throw new IllegalArgumentException("Invalid fade mode: " + i4);
        } else {
            return CROSS;
        }
    }
}
