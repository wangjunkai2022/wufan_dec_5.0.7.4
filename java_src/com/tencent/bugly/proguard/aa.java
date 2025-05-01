package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f62495a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62496b;

    /* renamed from: c  reason: collision with root package name */
    private long f62497c;

    /* renamed from: d  reason: collision with root package name */
    private final long f62498d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f62499e = true;

    /* renamed from: f  reason: collision with root package name */
    private long f62500f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(Handler handler, String str, long j4) {
        this.f62495a = handler;
        this.f62496b = str;
        this.f62497c = j4;
        this.f62498d = j4;
    }

    public final void a() {
        if (this.f62499e) {
            this.f62499e = false;
            this.f62500f = SystemClock.uptimeMillis();
            this.f62495a.post(this);
        }
    }

    public final boolean b() {
        return !this.f62499e && SystemClock.uptimeMillis() > this.f62500f + this.f62497c;
    }

    public final int c() {
        if (this.f62499e) {
            return 0;
        }
        return SystemClock.uptimeMillis() - this.f62500f < this.f62497c ? 1 : 3;
    }

    public final String d() {
        return this.f62496b;
    }

    public final Looper e() {
        return this.f62495a.getLooper();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f62499e = true;
        this.f62497c = this.f62498d;
    }

    public final void a(long j4) {
        this.f62497c = Long.MAX_VALUE;
    }
}
