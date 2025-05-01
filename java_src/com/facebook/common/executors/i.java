package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;
import javax.annotation.Nullable;
/* compiled from: UiThreadImmediateExecutorService.java */
/* loaded from: classes.dex */
public class i extends e {
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private static i f10846c;

    private i() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static i f() {
        if (f10846c == null) {
            f10846c = new i();
        }
        return f10846c;
    }

    @Override // com.facebook.common.executors.e, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (K0()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
