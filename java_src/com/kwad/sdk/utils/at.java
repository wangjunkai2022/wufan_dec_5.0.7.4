package com.kwad.sdk.utils;

import android.content.Context;
import android.content.res.Resources;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes5.dex */
public final class at {
    public static int at(Context context, String str) {
        Resources cH = cH(context);
        if (cH == null) {
            cH = context.getResources();
        }
        return cH.getIdentifier(str, "drawable", context.getPackageName());
    }

    public static Resources cH(Context context) {
        if (context == null) {
            return null;
        }
        return ServiceProvider.Lw().getResources();
    }

    public static int getAppIconId(Context context) {
        int i4;
        try {
            i4 = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 64).applicationInfo.icon;
        } catch (Throwable unused) {
            i4 = 0;
        }
        return i4 <= 0 ? at(context, "ksad_notification_small_icon") : i4;
    }

    public static int getId(Context context, String str) {
        return getIdentifier(context, str, "id");
    }

    private static int getIdentifier(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, getPackageName(context));
    }

    private static String getPackageName(Context context) {
        return ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yV() ? "com.kwad.sdk" : context.getPackageName();
    }
}
