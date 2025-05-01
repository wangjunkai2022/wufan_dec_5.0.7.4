package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
/* loaded from: classes2.dex */
public final class MarginLayoutParamsCompat {

    @RequiresApi(17)
    /* loaded from: classes2.dex */
    static class Api17Impl {
        private Api17Impl() {
        }

        @DoNotInline
        static int getLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @DoNotInline
        static int getMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @DoNotInline
        static int getMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        @DoNotInline
        static boolean isMarginRelative(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        @DoNotInline
        static void resolveLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.resolveLayoutDirection(i4);
        }

        @DoNotInline
        static void setLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.setLayoutDirection(i4);
        }

        @DoNotInline
        static void setMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.setMarginEnd(i4);
        }

        @DoNotInline
        static void setMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.setMarginStart(i4);
        }
    }

    private MarginLayoutParamsCompat() {
    }

    public static int getLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = Build.VERSION.SDK_INT >= 17 ? Api17Impl.getLayoutDirection(marginLayoutParams) : 0;
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    public static int getMarginEnd(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Api17Impl.getMarginEnd(marginLayoutParams);
        }
        return marginLayoutParams.rightMargin;
    }

    public static int getMarginStart(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Api17Impl.getMarginStart(marginLayoutParams);
        }
        return marginLayoutParams.leftMargin;
    }

    public static boolean isMarginRelative(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Api17Impl.isMarginRelative(marginLayoutParams);
        }
        return false;
    }

    public static void resolveLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Api17Impl.resolveLayoutDirection(marginLayoutParams, i4);
        }
    }

    public static void setLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Api17Impl.setLayoutDirection(marginLayoutParams, i4);
        }
    }

    public static void setMarginEnd(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Api17Impl.setMarginEnd(marginLayoutParams, i4);
        } else {
            marginLayoutParams.rightMargin = i4;
        }
    }

    public static void setMarginStart(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Api17Impl.setMarginStart(marginLayoutParams, i4);
        } else {
            marginLayoutParams.leftMargin = i4;
        }
    }
}
