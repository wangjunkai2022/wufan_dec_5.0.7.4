package com.mob.tools;

import com.mob.MobSDK;
import com.mob.commons.l;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.EverythingKeeper;
/* loaded from: classes5.dex */
public class MobLog implements EverythingKeeper {
    public static synchronized NLog getInstance() {
        NLog nLog;
        synchronized (MobLog.class) {
            nLog = NLog.getInstance(l.a("006]jefmhhgnhnke"), MobSDK.SDK_VERSION_CODE, l.a("009=fhfmhhfnTkQfmfmAi_hk"));
        }
        return nLog;
    }
}
