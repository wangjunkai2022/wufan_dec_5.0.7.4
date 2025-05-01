package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
/* loaded from: classes2.dex */
public final class GravityCompat {
    public static final int END = 8388613;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
    public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
    public static final int START = 8388611;

    @RequiresApi(17)
    /* loaded from: classes2.dex */
    static class Api17Impl {
        private Api17Impl() {
        }

        @DoNotInline
        static void apply(int i4, int i5, int i6, Rect rect, Rect rect2, int i7) {
            Gravity.apply(i4, i5, i6, rect, rect2, i7);
        }

        @DoNotInline
        static void applyDisplay(int i4, Rect rect, Rect rect2, int i5) {
            Gravity.applyDisplay(i4, rect, rect2, i5);
        }

        @DoNotInline
        static void apply(int i4, int i5, int i6, Rect rect, int i7, int i8, Rect rect2, int i9) {
            Gravity.apply(i4, i5, i6, rect, i7, i8, rect2, i9);
        }
    }

    private GravityCompat() {
    }

    public static void apply(int i4, int i5, int i6, @NonNull Rect rect, @NonNull Rect rect2, int i7) {
        if (Build.VERSION.SDK_INT >= 17) {
            Api17Impl.apply(i4, i5, i6, rect, rect2, i7);
        } else {
            Gravity.apply(i4, i5, i6, rect, rect2);
        }
    }

    public static void applyDisplay(int i4, @NonNull Rect rect, @NonNull Rect rect2, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            Api17Impl.applyDisplay(i4, rect, rect2, i5);
        } else {
            Gravity.applyDisplay(i4, rect, rect2);
        }
    }

    public static int getAbsoluteGravity(int i4, int i5) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i4, i5) : i4 & (-8388609);
    }

    public static void apply(int i4, int i5, int i6, @NonNull Rect rect, int i7, int i8, @NonNull Rect rect2, int i9) {
        if (Build.VERSION.SDK_INT >= 17) {
            Api17Impl.apply(i4, i5, i6, rect, i7, i8, rect2, i9);
        } else {
            Gravity.apply(i4, i5, i6, rect, i7, i8, rect2);
        }
    }
}
