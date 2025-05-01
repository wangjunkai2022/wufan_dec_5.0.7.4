package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.StatLogger;
import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class g implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f62997a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context) {
        this.f62997a = context;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        StatLogger statLogger;
        StatLogger statLogger2;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        StatLogger statLogger3;
        StatLogger statLogger4;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2;
        if (StatConfig.isEnableStatService()) {
            n a5 = n.a(this.f62997a);
            Context context = this.f62997a;
            a5.a(new com.tencent.stat.a.d(context, StatService.a(context, false), 2, th), (c) null);
            statLogger = StatService.f62872i;
            statLogger.debug("MTA has caught the following uncaught exception:");
            statLogger2 = StatService.f62872i;
            statLogger2.error(th);
            uncaughtExceptionHandler = StatService.f62873j;
            if (uncaughtExceptionHandler == null) {
                statLogger3 = StatService.f62872i;
                statLogger3.debug("Original uncaught exception handler not set.");
                return;
            }
            statLogger4 = StatService.f62872i;
            statLogger4.debug("Call the original uncaught exception handler.");
            uncaughtExceptionHandler2 = StatService.f62873j;
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        }
    }
}
