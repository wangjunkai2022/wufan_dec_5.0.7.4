package com.mob.commons.logcollector;

import com.mob.tools.log.LogCollector;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;
@Deprecated
/* loaded from: classes5.dex */
public class DefaultLogsCollector implements LogCollector, PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static DefaultLogsCollector f56411a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Integer> f56412b = new HashMap<>();

    private DefaultLogsCollector() {
    }

    public static synchronized DefaultLogsCollector get() {
        DefaultLogsCollector defaultLogsCollector;
        synchronized (DefaultLogsCollector.class) {
            if (f56411a == null) {
                f56411a = new DefaultLogsCollector();
            }
            defaultLogsCollector = f56411a;
        }
        return defaultLogsCollector;
    }

    public void addSDK(String str, int i4) {
        synchronized (this.f56412b) {
            this.f56412b.put(str, Integer.valueOf(i4));
        }
    }

    @Override // com.mob.tools.log.LogCollector
    public final void log(String str, int i4, int i5, String str2, String str3) {
        Integer num = this.f56412b.get(str);
        if (num == null) {
            num = -1;
        }
        NLog.getInstance(str, num.intValue(), str).log(i4, str3, new Object[0]);
    }
}
