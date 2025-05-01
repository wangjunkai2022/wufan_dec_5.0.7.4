package notchtools.geek.com.notchtools.helper;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
/* compiled from: NotchStatusBarUtils.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static int f71943a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f71944b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotchStatusBarUtils.java */
    /* loaded from: classes7.dex */
    public static class a implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Window f71945b;

        a(Window window) {
            this.f71945b = window;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i4) {
            if (i4 == 0) {
                b.e(this.f71945b, false);
            }
        }
    }

    public static ViewGroup a(Window window) {
        View decorView = window.getDecorView();
        if (decorView == null) {
            return null;
        }
        return (ViewGroup) decorView.findViewWithTag(notchtools.geek.com.notchtools.b.f71930e);
    }

    public static int b(Context context) {
        int identifier;
        int i4 = f71943a;
        if (i4 != -1) {
            return i4;
        }
        if (i4 <= 0 && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a)) > 0) {
            f71943a = context.getResources().getDimensionPixelSize(identifier);
        }
        return f71943a;
    }

    public static ViewGroup c(Window window) {
        ViewGroup a5 = a(window);
        if (a5 == null) {
            return null;
        }
        if (a5.getChildCount() > 0) {
            a5.removeAllViews();
        }
        return a5;
    }

    public static void d(Window window) {
        ViewGroup c5 = c(window);
        if (c5 == null) {
            return;
        }
        View view = new View(window.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, notchtools.geek.com.notchtools.b.o().d(window)));
        view.setBackgroundColor(-16777216);
        c5.addView(view);
    }

    public static void e(Window window, boolean z4) {
        int i4;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.flags |= 1024;
        window.setAttributes(attributes);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 16) {
            i4 = 1028;
            if (!f71944b) {
                i4 = 1542;
            }
        } else {
            i4 = 0;
        }
        if (i5 >= 19) {
            i4 |= 4096;
        }
        window.getDecorView().setSystemUiVisibility(i4);
        if (z4) {
            window.getDecorView().setOnSystemUiVisibilityChangeListener(new a(window));
        }
    }
}
