package com.join.mgps.wrapper;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
/* compiled from: Wrapper11.java */
@TargetApi(11)
/* loaded from: classes5.dex */
public class b {
    public static void a(Activity activity) {
        activity.invalidateOptionsMenu();
    }

    public static void b(MenuItem menuItem, boolean z4) {
        menuItem.setShowAsAction(z4 ? 6 : 0);
    }

    static void c(View view, int i4) {
        view.setSystemUiVisibility(i4);
    }

    public static void d(Activity activity) {
    }

    public static void e(Activity activity) {
    }
}
