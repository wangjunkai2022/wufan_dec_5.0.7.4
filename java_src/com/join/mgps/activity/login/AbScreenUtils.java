package com.join.mgps.activity.login;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.uc.crashsdk.export.LogType;
/* loaded from: classes4.dex */
public class AbScreenUtils {
    private static Handler mainHandler;

    public static int dp2px(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static void execute(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            mainHandler.post(runnable);
        }
    }

    public static int getScreenHeight(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static Point getScreenSize(Context context, boolean z4) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (!z4) {
            return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        float f5 = displayMetrics.density;
        return new Point((int) (displayMetrics.widthPixels / f5), (int) (displayMetrics.heightPixels / f5));
    }

    public static int getScreenWidth(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static void setViewWH(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = i4;
        layoutParams.height = i5;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    public static void setWindowDecor(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    public static void showToast(final Context context, final String str) {
        mainHandler = new Handler(Looper.getMainLooper());
        execute(new Runnable() { // from class: com.join.mgps.activity.login.AbScreenUtils.1
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(context, str, 0).show();
            }
        });
    }

    public static int getScreenWidth(Context context, boolean z4) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i4 = displayMetrics.widthPixels;
        if (z4) {
            return (int) (i4 / displayMetrics.density);
        }
        return i4;
    }
}
