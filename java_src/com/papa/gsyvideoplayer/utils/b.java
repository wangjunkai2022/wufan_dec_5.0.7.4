package com.papa.gsyvideoplayer.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.kwad.sdk.core.response.model.SdkConfigData;
import java.io.File;
import java.util.Formatter;
import java.util.Locale;
/* compiled from: CommonUtil.java */
/* loaded from: classes5.dex */
public class b {
    public static void a(String str) {
        String[] list;
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            for (String str2 : file.list()) {
                a(str + File.separator + str2);
            }
            file.delete();
        }
    }

    public static int b(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int c(Activity activity) {
        TypedValue typedValue = new TypedValue();
        if (activity.getTheme().resolveAttribute(16843499, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static Activity d(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof TintContextWrapper) {
            return o(((TintContextWrapper) context).getBaseContext());
        }
        if (context instanceof ContextWrapper) {
            return o(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static AppCompatActivity e(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return e(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean f(Activity activity) {
        return activity.getWindowManager().getDefaultDisplay().getRotation() == 1 || activity.getWindowManager().getDefaultDisplay().getRotation() == 3;
    }

    public static int g(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int h(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int i(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static String j(long j4) {
        if (j4 >= 0 && j4 < 1024) {
            return j4 + " KB/s";
        } else if (j4 >= 1024 && j4 < 1048576) {
            return Long.toString(j4 / 1024) + " KB/s";
        } else if (j4 < 1048576 || j4 >= 1073741824) {
            return "";
        } else {
            return Long.toString(j4 / 1048576) + " MB/s";
        }
    }

    public static void k(Context context) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            ((Activity) context).getWindow().getDecorView().setSystemUiVisibility(3074);
        } else if (i4 >= 19) {
            ((Activity) context).getWindow().getDecorView().setSystemUiVisibility(2562);
        } else {
            ((Activity) context).getWindow().getDecorView().setSystemUiVisibility(514);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static void l(Context context, boolean z4, boolean z5) {
        AppCompatActivity e5;
        ActionBar supportActionBar;
        if (z4 && (e5 = e(context)) != null && (supportActionBar = e5.getSupportActionBar()) != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
            supportActionBar.hide();
        }
        if (z5) {
            if (context instanceof FragmentActivity) {
                ((FragmentActivity) context).getWindow().setFlags(1024, 1024);
            } else if (context instanceof Activity) {
                ((Activity) context).getWindow().setFlags(1024, 1024);
            } else {
                e(context).getWindow().setFlags(1024, 1024);
            }
        }
    }

    public static boolean m(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).isConnected();
    }

    public static int n(Context context, float f5) {
        return (int) ((f5 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Activity o(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof TintContextWrapper) {
            return o(((TintContextWrapper) context).getBaseContext());
        }
        if (context instanceof ContextWrapper) {
            return o(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void p(Context context, int i4) {
        ((Activity) context).getWindow().getDecorView().setSystemUiVisibility(i4);
    }

    @SuppressLint({"RestrictedApi"})
    public static void q(Context context, boolean z4, boolean z5) {
        AppCompatActivity e5;
        ActionBar supportActionBar;
        if (z4 && (e5 = e(context)) != null && (supportActionBar = e5.getSupportActionBar()) != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
            supportActionBar.show();
        }
        if (z5) {
            if (context instanceof FragmentActivity) {
                ((FragmentActivity) context).getWindow().clearFlags(1024);
            } else if (context instanceof Activity) {
                ((Activity) context).getWindow().clearFlags(1024);
            } else {
                e(context).getWindow().clearFlags(1024);
            }
        }
    }

    public static String r(int i4) {
        if (i4 <= 0 || i4 >= 86400000) {
            return "00:00";
        }
        int i5 = i4 / 1000;
        int i6 = i5 % 60;
        int i7 = (i5 / 60) % 60;
        int i8 = i5 / SdkConfigData.DEFAULT_REQUEST_INTERVAL;
        Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
        return i8 > 0 ? formatter.format("%d:%02d:%02d", Integer.valueOf(i8), Integer.valueOf(i7), Integer.valueOf(i6)).toString() : formatter.format("%02d:%02d", Integer.valueOf(i7), Integer.valueOf(i6)).toString();
    }
}
