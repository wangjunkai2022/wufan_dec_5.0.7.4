package com.githang.statusbar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/* compiled from: StatusBarCompat.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    static final b f13024a;

    /* compiled from: StatusBarCompat.java */
    /* loaded from: classes3.dex */
    static class a implements b {
        a() {
        }

        @Override // com.githang.statusbar.b
        public void a(Window window, int i4, boolean z4) {
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23) {
            f13024a = new h();
        } else if (i4 >= 21 && !a()) {
            f13024a = new g();
        } else if (i4 >= 19) {
            f13024a = new f();
        } else {
            f13024a = new a();
        }
    }

    private static boolean a() {
        FileInputStream fileInputStream;
        File file = new File(Environment.getRootDirectory(), "build.prop");
        if (file.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    try {
                        fileInputStream = new FileInputStream(file);
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
            } catch (Exception e7) {
                e = e7;
                fileInputStream2 = fileInputStream;
                e.printStackTrace();
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return properties.containsKey("ro.build.hw_emui_api_level");
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                throw th;
            }
            return properties.containsKey("ro.build.hw_emui_api_level");
        }
        return false;
    }

    @TargetApi(14)
    public static void b(Window window, boolean z4) {
        View childAt;
        if (Build.VERSION.SDK_INT < 14 || (childAt = ((ViewGroup) window.findViewById(16908290)).getChildAt(0)) == null) {
            return;
        }
        childAt.setFitsSystemWindows(z4);
    }

    public static void c(Activity activity, int i4) {
        d(activity, i4, f(i4) > 225);
    }

    public static void d(Activity activity, int i4, boolean z4) {
        e(activity.getWindow(), i4, z4);
    }

    public static void e(Window window, int i4, boolean z4) {
        if ((window.getAttributes().flags & 1024) > 0 || e.f13026a) {
            return;
        }
        f13024a.a(window, i4, z4);
    }

    public static int f(int i4) {
        int blue = Color.blue(i4);
        return (((Color.red(i4) * 38) + (Color.green(i4) * 75)) + (blue * 15)) >> 7;
    }
}
