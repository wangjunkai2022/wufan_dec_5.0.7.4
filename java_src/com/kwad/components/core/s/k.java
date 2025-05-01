package com.kwad.components.core.s;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.kwad.sdk.utils.s;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes5.dex */
public final class k {
    private static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
    private static Method TT;
    private static Method TU;
    private static Field TV;

    static {
        try {
            TT = Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        }
        try {
            TU = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
        }
        try {
            TV = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
        try {
            SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = ((Integer) s.c(View.class, "SYSTEM_UI_FLAG_LIGHT_STATUS_BAR")).intValue();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private static boolean a(WindowManager.LayoutParams layoutParams, String str, boolean z4) {
        try {
            int intValue = ((Integer) s.getField(layoutParams, str)).intValue();
            int intValue2 = ((Integer) s.getField(layoutParams, "meizuFlags")).intValue();
            int i4 = z4 ? intValue | intValue2 : (intValue ^ (-1)) & intValue2;
            if (intValue2 != i4) {
                s.a(layoutParams, "meizuFlags", Integer.valueOf(i4));
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void b(Activity activity, boolean z4) {
        a(activity, true, true);
    }

    private static void g(View view, boolean z4) {
        int i4;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z4) {
            i4 = SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | systemUiVisibility;
        } else {
            i4 = (SYSTEM_UI_FLAG_LIGHT_STATUS_BAR ^ (-1)) & systemUiVisibility;
        }
        if (i4 != systemUiVisibility) {
            view.setSystemUiVisibility(i4);
        }
    }

    private static void setStatusBarColor(Window window, int i4) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        Field field = TV;
        if (field != null) {
            try {
                if (field.getInt(attributes) != 0) {
                    TV.set(attributes, 0);
                    window.setAttributes(attributes);
                }
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            }
        }
    }

    private static void a(Window window, boolean z4) {
        if (Build.VERSION.SDK_INT < 23) {
            a(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z4);
            return;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            g(decorView, z4);
            setStatusBarColor(window, 0);
        }
    }

    private static void a(Activity activity, boolean z4, boolean z5) {
        Method method = TU;
        if (method != null) {
            try {
                method.invoke(activity, Boolean.valueOf(z4));
                return;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return;
            }
        }
        a(activity.getWindow(), z4);
    }
}
