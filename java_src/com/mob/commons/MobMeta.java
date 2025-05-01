package com.mob.commons;

import android.os.Looper;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.PublicMemberKeeper;
/* loaded from: classes5.dex */
public class MobMeta implements PublicMemberKeeper {
    public static <T> T get(MobProduct mobProduct, String str, Class<T> cls, T t4) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            NLog mobLog = MobLog.getInstance();
            mobLog.w("WARNING: gt mta in main: key = " + str);
        }
        Object a5 = C0811r.a(str, cls, mobProduct);
        if (a5 == null) {
            a5 = C0811r.a(str);
        }
        return a5 == null ? t4 : (T) a5;
    }
}
