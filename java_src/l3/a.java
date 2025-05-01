package l3;

import android.os.Build;
import android.view.View;
/* compiled from: ViewUtils.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f71482a = "getMaxWidth";

    /* renamed from: b  reason: collision with root package name */
    private static final String f71483b = "getMaxHeight";

    /* renamed from: c  reason: collision with root package name */
    private static final String f71484c = "getMinWidth";

    /* renamed from: d  reason: collision with root package name */
    private static final String f71485d = "getMinHeight";

    /* renamed from: e  reason: collision with root package name */
    private static final String f71486e = "setMaxWidth";

    /* renamed from: f  reason: collision with root package name */
    private static final String f71487f = "setMaxHeight";

    public static int a(View view) {
        return e(view, f71483b);
    }

    public static int b(View view) {
        return e(view, f71482a);
    }

    public static int c(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        return e(view, f71485d);
    }

    public static int d(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        return e(view, f71484c);
    }

    private static int e(View view, String str) {
        try {
            return ((Integer) view.getClass().getMethod(str, new Class[0]).invoke(view, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void f(View view, int i4) {
        j(view, f71487f, i4);
    }

    public static void g(View view, int i4) {
        j(view, f71486e, i4);
    }

    public static void h(View view, int i4) {
        view.setMinimumHeight(i4);
    }

    public static void i(View view, int i4) {
        view.setMinimumWidth(i4);
    }

    private static void j(View view, String str, int i4) {
        try {
            view.getClass().getMethod(str, new Class[0]).invoke(view, Integer.valueOf(i4));
        } catch (Exception unused) {
        }
    }
}
