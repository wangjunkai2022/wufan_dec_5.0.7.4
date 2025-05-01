package com.mob.tools.utils;

import com.mob.tools.MobLog;
/* loaded from: classes5.dex */
public abstract class i implements Runnable {
    protected abstract void a() throws Throwable;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }
}
