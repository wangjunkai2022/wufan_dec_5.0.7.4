package com.mob.tools.utils;

import android.text.TextUtils;
import com.mob.tools.MobLog;
/* loaded from: classes5.dex */
public abstract class j extends Thread {
    public j() {
    }

    protected abstract void a() throws Throwable;

    protected void a(Throwable th) {
        MobLog.getInstance().d(th);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            a(th);
        }
    }

    public j(String str) {
        if (TextUtils.isEmpty("M-")) {
            return;
        }
        setName("M-" + str);
    }
}
