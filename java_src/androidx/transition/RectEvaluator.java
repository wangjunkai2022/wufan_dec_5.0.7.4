package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
/* loaded from: classes2.dex */
class RectEvaluator implements TypeEvaluator<Rect> {
    private Rect mRect;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectEvaluator() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f5, Rect rect, Rect rect2) {
        int i4 = rect.left;
        int i5 = i4 + ((int) ((rect2.left - i4) * f5));
        int i6 = rect.top;
        int i7 = i6 + ((int) ((rect2.top - i6) * f5));
        int i8 = rect.right;
        int i9 = i8 + ((int) ((rect2.right - i8) * f5));
        int i10 = rect.bottom;
        int i11 = i10 + ((int) ((rect2.bottom - i10) * f5));
        Rect rect3 = this.mRect;
        if (rect3 == null) {
            return new Rect(i5, i7, i9, i11);
        }
        rect3.set(i5, i7, i9, i11);
        return this.mRect;
    }
}
