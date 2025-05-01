package androidx.core.graphics;

import android.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: Matrix.kt */
/* loaded from: classes2.dex */
public final class MatrixKt {
    @NotNull
    public static final Matrix rotationMatrix(float f5, float f6, float f7) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f5, f6, f7);
        return matrix;
    }

    public static /* synthetic */ Matrix rotationMatrix$default(float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f7 = 0.0f;
        }
        return rotationMatrix(f5, f6, f7);
    }

    @NotNull
    public static final Matrix scaleMatrix(float f5, float f6) {
        Matrix matrix = new Matrix();
        matrix.setScale(f5, f6);
        return matrix;
    }

    public static /* synthetic */ Matrix scaleMatrix$default(float f5, float f6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f5 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            f6 = 1.0f;
        }
        return scaleMatrix(f5, f6);
    }

    @NotNull
    public static final Matrix times(@NotNull Matrix matrix, @NotNull Matrix m4) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Intrinsics.checkNotNullParameter(m4, "m");
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preConcat(m4);
        return matrix2;
    }

    @NotNull
    public static final Matrix translationMatrix(float f5, float f6) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f5, f6);
        return matrix;
    }

    public static /* synthetic */ Matrix translationMatrix$default(float f5, float f6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f6 = 0.0f;
        }
        return translationMatrix(f5, f6);
    }

    @NotNull
    public static final float[] values(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
