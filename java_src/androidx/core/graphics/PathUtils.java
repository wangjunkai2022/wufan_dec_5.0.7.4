package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;
/* loaded from: classes2.dex */
public final class PathUtils {

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(26)
    /* loaded from: classes2.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static float[] approximate(Path path, float f5) {
            return path.approximate(f5);
        }
    }

    private PathUtils() {
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path) {
        return flatten(path, 0.5f);
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path, @FloatRange(from = 0.0d) float f5) {
        float[] approximate = Api26Impl.approximate(path, f5);
        int length = approximate.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 1; i4 < length; i4++) {
            int i5 = i4 * 3;
            int i6 = (i4 - 1) * 3;
            float f6 = approximate[i5];
            float f7 = approximate[i5 + 1];
            float f8 = approximate[i5 + 2];
            float f9 = approximate[i6];
            float f10 = approximate[i6 + 1];
            float f11 = approximate[i6 + 2];
            if (f6 != f9 && (f7 != f10 || f8 != f11)) {
                arrayList.add(new PathSegment(new PointF(f10, f11), f9, new PointF(f7, f8), f6));
            }
        }
        return arrayList;
    }
}
