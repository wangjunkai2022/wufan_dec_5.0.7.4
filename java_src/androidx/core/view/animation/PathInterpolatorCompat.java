package androidx.core.view.animation;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
/* loaded from: classes2.dex */
public final class PathInterpolatorCompat {

    @RequiresApi(21)
    /* loaded from: classes2.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static PathInterpolator createPathInterpolator(Path path) {
            return new PathInterpolator(path);
        }

        @DoNotInline
        static PathInterpolator createPathInterpolator(float f5, float f6) {
            return new PathInterpolator(f5, f6);
        }

        @DoNotInline
        static PathInterpolator createPathInterpolator(float f5, float f6, float f7, float f8) {
            return new PathInterpolator(f5, f6, f7, f8);
        }
    }

    private PathInterpolatorCompat() {
    }

    @NonNull
    public static Interpolator create(@NonNull Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.createPathInterpolator(path);
        }
        return new PathInterpolatorApi14(path);
    }

    @NonNull
    public static Interpolator create(float f5, float f6) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.createPathInterpolator(f5, f6);
        }
        return new PathInterpolatorApi14(f5, f6);
    }

    @NonNull
    public static Interpolator create(float f5, float f6, float f7, float f8) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.createPathInterpolator(f5, f6, f7, f8);
        }
        return new PathInterpolatorApi14(f5, f6, f7, f8);
    }
}
