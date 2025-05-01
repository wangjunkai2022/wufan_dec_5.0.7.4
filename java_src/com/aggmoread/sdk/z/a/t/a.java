package com.aggmoread.sdk.z.a.t;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f2567a = "com.aggmoread.sdk.a.adcomm.amsdk.AMAppActivity";

    public static void a(Activity activity, Bundle bundle) {
        try {
            Intent intent = new Intent(activity, Class.forName(f2567a));
            intent.putExtra("data", bundle);
            activity.startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void a(d dVar) {
        try {
            Class.forName(f2567a).getMethod("setActivityPresenter", d.class).invoke(null, dVar);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
