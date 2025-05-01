package com.mob.tools;

import com.mob.commons.C0811r;
import java.lang.Thread;
/* loaded from: classes5.dex */
public class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static Thread.UncaughtExceptionHandler f56643a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f56644b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f56645c;

    private b() {
    }

    public static synchronized void a() {
        synchronized (b.class) {
            if (!f56644b && C0811r.f56463h && !f56645c) {
                f56645c = true;
                f56643a = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new b());
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            MobLog.getInstance().d("UE handled, processing...", new Object[0]);
            MobLog.getInstance().crash(th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = f56643a;
            if (uncaughtExceptionHandler2 == null || (uncaughtExceptionHandler2 instanceof b)) {
            }
        } catch (Throwable th2) {
            try {
                MobLog.getInstance().d(th2);
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            } finally {
                uncaughtExceptionHandler = f56643a;
                if (uncaughtExceptionHandler != null && !(uncaughtExceptionHandler instanceof b)) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        }
    }
}
