package com.swift.sandhook;

import com.swift.sandhook.wrapper.HookErrorException;
import com.swift.sandhook.wrapper.HookWrapper;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class PendingHookHandler {
    private static boolean canUsePendingHook;
    private static Map<Class, Vector<HookWrapper.HookEntity>> pendingHooks = new ConcurrentHashMap();

    static {
        if (SandHookConfig.delayHook) {
            canUsePendingHook = SandHook.initForPendingHook();
        }
    }

    public static synchronized void addPendingHook(HookWrapper.HookEntity hookEntity) {
        synchronized (PendingHookHandler.class) {
            Vector<HookWrapper.HookEntity> vector = pendingHooks.get(hookEntity.target.getDeclaringClass());
            if (vector == null) {
                vector = new Vector<>();
                pendingHooks.put(hookEntity.target.getDeclaringClass(), vector);
            }
            vector.add(hookEntity);
        }
    }

    public static boolean canWork() {
        return canUsePendingHook && SandHook.canGetObject() && !SandHookConfig.DEBUG;
    }

    public static void onClassInit(long j4) {
        Class cls;
        Vector<HookWrapper.HookEntity> vector;
        if (j4 == 0 || (cls = (Class) SandHook.getObject(j4)) == null || (vector = pendingHooks.get(cls)) == null) {
            return;
        }
        Iterator<HookWrapper.HookEntity> it2 = vector.iterator();
        while (it2.hasNext()) {
            HookWrapper.HookEntity next = it2.next();
            HookLog.w("do pending hook for method: " + next.target.toString());
            try {
                next.initClass = false;
                SandHook.hook(next);
            } catch (HookErrorException e5) {
                HookLog.e("Pending Hook Error!", e5);
            }
        }
        pendingHooks.remove(cls);
    }
}
