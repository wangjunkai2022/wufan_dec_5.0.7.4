package kotlin.math;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
/* compiled from: MathJVM.kt */
/* loaded from: classes6.dex */
final class Constants {
    @NotNull
    public static final Constants INSTANCE = new Constants();
    @JvmField
    public static final double LN2 = Math.log(2.0d);
    @JvmField
    public static final double epsilon;
    @JvmField
    public static final double taylor_2_bound;
    @JvmField
    public static final double taylor_n_bound;
    @JvmField
    public static final double upper_taylor_2_bound;
    @JvmField
    public static final double upper_taylor_n_bound;

    static {
        double ulp = Math.ulp(1.0d);
        epsilon = ulp;
        double sqrt = Math.sqrt(ulp);
        taylor_2_bound = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        taylor_n_bound = sqrt2;
        double d5 = 1;
        Double.isNaN(d5);
        upper_taylor_2_bound = d5 / sqrt;
        Double.isNaN(d5);
        upper_taylor_n_bound = d5 / sqrt2;
    }

    private Constants() {
    }
}
