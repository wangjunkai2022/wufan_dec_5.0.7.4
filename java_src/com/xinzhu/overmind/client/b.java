package com.xinzhu.overmind.client;

import com.xinzhu.overmind.Overmind;
import java.lang.Thread;
/* compiled from: CrashHandler.java */
/* loaded from: classes.dex */
public class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f67455a = Thread.getDefaultUncaughtExceptionHandler();

    public b() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void a() {
        new b();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (Overmind.get().getExceptionHandler() != null) {
            Overmind.get().getExceptionHandler().uncaughtException(thread, th);
        }
        this.f67455a.uncaughtException(thread, th);
    }
}
