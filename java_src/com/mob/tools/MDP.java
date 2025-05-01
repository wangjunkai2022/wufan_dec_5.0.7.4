package com.mob.tools;

import com.mob.commons.z;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.i;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class MDP implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static Object f56539a = new Object();

    public static Object get(String str, ArrayList<Object> arrayList) {
        return get(str, arrayList, false, 0);
    }

    private static Object a(String str, BlockingQueue blockingQueue) throws InterruptedException {
        int i4;
        if ("gia".equals(str) || "gal".equals(str) || "gsl".equals(str) || "giafce".equals(str)) {
            i4 = 30000;
        } else {
            i4 = "glctn".equals(str) ? 60000 : 3000;
        }
        return blockingQueue.poll(i4, TimeUnit.MILLISECONDS);
    }

    public static Object get(String str, ArrayList<Object> arrayList, int i4) {
        return get(str, arrayList, false, i4);
    }

    public static Object get(String str, ArrayList<Object> arrayList, boolean z4) {
        return get(str, arrayList, z4, 0);
    }

    public static Object get(final String str, final ArrayList<Object> arrayList, boolean z4, int i4) {
        Object poll;
        if (z4) {
            return com.mob.tools.c.a.a(str, arrayList);
        }
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        z.f56521e.execute(new i() { // from class: com.mob.tools.MDP.1
            @Override // com.mob.tools.utils.i
            public void a() {
                Object a5 = com.mob.tools.c.a.a(str, arrayList);
                if (a5 == null) {
                    a5 = MDP.f56539a;
                }
                linkedBlockingQueue.offer(a5);
            }
        });
        try {
            if (i4 <= 0) {
                poll = a(str, linkedBlockingQueue);
            } else {
                poll = linkedBlockingQueue.poll(i4, TimeUnit.MILLISECONDS);
            }
            if (poll == f56539a) {
                return null;
            }
            return poll;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }
}
