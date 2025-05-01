package com.papa91.wrapper;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
@TargetApi(11)
/* loaded from: classes5.dex */
class Wrapper11 {
    Wrapper11() {
    }

    public static void Activity_invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
    }

    public static void MenuItem_setShowAsAction(MenuItem menuItem, boolean z4) {
        menuItem.setShowAsAction(z4 ? 6 : 0);
    }

    static void View_setSystemUiVisibility(View view, int i4) {
        view.setSystemUiVisibility(i4);
    }

    public static void displayActionBar(Activity activity) {
    }

    public static void displayHomeAsUp(Activity activity) {
    }
}
