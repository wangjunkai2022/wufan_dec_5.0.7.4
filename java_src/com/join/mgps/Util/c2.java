package com.join.mgps.Util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ss.android.download.api.constant.BaseConstants;
import com.uc.crashsdk.export.LogType;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: StatusBarUtil.java */
/* loaded from: classes3.dex */
public class c2 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f27758a = "ro.miui.ui.version.code";

    /* renamed from: b  reason: collision with root package name */
    private static final String f27759b = "ro.miui.ui.version.name";

    /* renamed from: c  reason: collision with root package name */
    private static final String f27760c = "ro.miui.internal.storage";

    /* renamed from: d  reason: collision with root package name */
    private static final int f27761d = 16;

    public static boolean a(Window window, boolean z4) {
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i4 = declaredField.getInt(null);
                int i5 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, z4 ? i5 | i4 : (i4 ^ (-1)) & i5);
                window.setAttributes(attributes);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean b(Window window, boolean z4) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i4 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Class<?> cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (z4) {
                    method.invoke(window, Integer.valueOf(i4), Integer.valueOf(i4));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i4));
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void c(Activity activity, int i4) {
        if (i4 == 1) {
            b(activity.getWindow(), false);
        } else if (i4 == 2) {
            a(activity.getWindow(), false);
        } else if (i4 == 3) {
            activity.getWindow().getDecorView().setSystemUiVisibility(0);
        }
        r(false, activity);
    }

    public static int d(Activity activity) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 19) {
            if (b(activity.getWindow(), true)) {
                return 1;
            }
            if (a(activity.getWindow(), true)) {
                return 2;
            }
            if (i4 >= 23) {
                return 3;
            }
        }
        return 0;
    }

    public static void e(Activity activity, int i4) {
        if (i4 == 1) {
            b(activity.getWindow(), true);
        } else if (i4 == 2) {
            a(activity.getWindow(), true);
        } else if (i4 == 3) {
            activity.getWindow().getDecorView().setSystemUiVisibility(9216);
        }
    }

    private static int f(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static boolean g() {
        try {
            return Build.class.getMethod("hasSmartBar", new Class[0]) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean h() {
        try {
            l i4 = l.i();
            if (i4.e(f27758a, null) == null && i4.e(f27759b, null) == null) {
                if (i4.e(f27760c, null) == null) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private static void i(boolean z4, Activity activity) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        try {
            Class<?> cls = Class.forName("android.view.WindowManager$LayoutParams");
            int i4 = cls.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON").getInt(attributes);
            Field declaredField = cls.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            int i5 = declaredField.getInt(attributes);
            if (z4) {
                declaredField.set(attributes, Integer.valueOf(i5 | i4));
            } else {
                declaredField.set(attributes, Integer.valueOf((i4 ^ (-1)) & i5));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private static void j(boolean z4, Activity activity) {
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i4 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z4 ? i4 : 0);
            objArr[1] = Integer.valueOf(i4);
            method.invoke(window, objArr);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void k(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
    }

    private static void l(Activity activity, boolean z4) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            j(z4, activity);
        } else if (!z4) {
            activity.getWindow().getDecorView().setSystemUiVisibility(256);
        } else if (i4 >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(8192);
        }
    }

    private static void m(boolean z4, Activity activity) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23) {
            systemUiVisibility = z4 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193);
        } else if (i4 >= 21) {
            systemUiVisibility = z4 ? systemUiVisibility | 16 : systemUiVisibility & (-17);
        }
        window.getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    private static void n(Activity activity, boolean z4) {
        if (z4) {
            if (Build.VERSION.SDK_INT >= 23) {
                activity.getWindow().getDecorView().setSystemUiVisibility(8192);
                return;
            } else {
                o(activity, 1140850688, false);
                return;
            }
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(256);
    }

    public static void o(Activity activity, int i4, boolean z4) {
        Window window = activity.getWindow();
        b(window, z4);
        a(window, z4);
        com.githang.statusbar.c.d(activity, i4, z4);
        r(z4, activity);
    }

    public static void p(Activity activity, boolean z4, boolean z5) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            activity.getWindow().getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            if (z4) {
                activity.getWindow().setStatusBarColor(activity.getResources().getColor(17170443));
            } else {
                activity.getWindow().setStatusBarColor(0);
            }
        } else if (i4 >= 19) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.flags = 67108864 | attributes.flags;
        }
        if (i4 < 23 || z5) {
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(9216);
    }

    public static void q(Activity activity, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 21) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(activity.getResources().getColor(i4));
        } else if (i5 >= 19) {
            s(activity);
            com.join.android.app.common.manager.b bVar = new com.join.android.app.common.manager.b(activity);
            bVar.m(true);
            bVar.n(i4);
        }
    }

    @RequiresApi(api = 16)
    public static void r(boolean z4, Activity activity) {
        try {
            String str = Build.MANUFACTURER;
            if (g()) {
                i(z4, activity);
            } else if (h()) {
                l(activity, z4);
            } else if (str.equalsIgnoreCase(BaseConstants.ROM_OPPO_UPPER_CONSTANT)) {
                m(false, activity);
            } else {
                n(activity, z4);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @TargetApi(19)
    public static void s(Activity activity) {
        t(activity, true);
    }

    public static void t(Activity activity, boolean z4) {
        if (activity != null) {
            u(activity.getWindow(), z4);
        }
    }

    public static void u(Window window, boolean z4) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 21) {
            if (i4 >= 19) {
                window.setFlags(TTAdConstant.KEY_CLICK_AREA, TTAdConstant.KEY_CLICK_AREA);
                return;
            }
            return;
        }
        window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
        window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
        if (z4) {
            window.addFlags(Integer.MIN_VALUE);
        }
        window.setStatusBarColor(0);
    }
}
