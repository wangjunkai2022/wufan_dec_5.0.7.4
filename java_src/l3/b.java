package l3;

import android.content.Context;
/* compiled from: dp2pxUtils.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f71488a = "dp2pxUtils";

    public static int a(float f5, float f6) {
        return (int) ((f6 * f5) + 0.5f);
    }

    public static int b(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int c(float f5, float f6) {
        return (int) ((f6 / f5) + 0.5f);
    }

    public static int d(Context context, float f5) {
        return (int) ((f5 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
