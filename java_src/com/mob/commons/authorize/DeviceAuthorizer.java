package com.mob.commons.authorize;

import android.content.Context;
import com.mob.commons.MobProduct;
import com.mob.commons.e;
import com.mob.commons.j;
import com.mob.tools.proguard.PublicMemberKeeper;
@Deprecated
/* loaded from: classes5.dex */
public final class DeviceAuthorizer implements PublicMemberKeeper {
    public static synchronized String authorize(MobProduct mobProduct) {
        String a5;
        synchronized (DeviceAuthorizer.class) {
            a5 = e.a(mobProduct);
        }
        return a5;
    }

    public static String authorizeForOnce() {
        return e.b();
    }

    public static String getMString(Context context) {
        return e.a(context);
    }

    public static boolean isClear() {
        return j.a().b();
    }

    public static boolean isFor() {
        return e.a();
    }
}
