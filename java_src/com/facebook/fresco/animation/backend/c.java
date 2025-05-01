package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.fresco.animation.backend.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* compiled from: AnimationBackendDelegateWithInactivityCheck.java */
/* loaded from: classes.dex */
public class c<T extends com.facebook.fresco.animation.backend.a> extends com.facebook.fresco.animation.backend.b<T> {
    @VisibleForTesting

    /* renamed from: p  reason: collision with root package name */
    static final long f11391p = 2000;
    @VisibleForTesting

    /* renamed from: q  reason: collision with root package name */
    static final long f11392q = 1000;

    /* renamed from: h  reason: collision with root package name */
    private final com.facebook.common.time.c f11393h;

    /* renamed from: i  reason: collision with root package name */
    private final ScheduledExecutorService f11394i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11395j;

    /* renamed from: k  reason: collision with root package name */
    private long f11396k;

    /* renamed from: l  reason: collision with root package name */
    private long f11397l;

    /* renamed from: m  reason: collision with root package name */
    private long f11398m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private b f11399n;

    /* renamed from: o  reason: collision with root package name */
    private final Runnable f11400o;

    /* compiled from: AnimationBackendDelegateWithInactivityCheck.java */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                c.this.f11395j = false;
                if (c.this.v()) {
                    if (c.this.f11399n != null) {
                        c.this.f11399n.i();
                    }
                } else {
                    c.this.w();
                }
            }
        }
    }

    /* compiled from: AnimationBackendDelegateWithInactivityCheck.java */
    /* loaded from: classes2.dex */
    public interface b {
        void i();
    }

    private c(@Nullable T t4, @Nullable b bVar, com.facebook.common.time.c cVar, ScheduledExecutorService scheduledExecutorService) {
        super(t4);
        this.f11395j = false;
        this.f11397l = f11391p;
        this.f11398m = 1000L;
        this.f11400o = new a();
        this.f11399n = bVar;
        this.f11393h = cVar;
        this.f11394i = scheduledExecutorService;
    }

    public static <T extends com.facebook.fresco.animation.backend.a & b> com.facebook.fresco.animation.backend.b<T> r(T t4, com.facebook.common.time.c cVar, ScheduledExecutorService scheduledExecutorService) {
        return s(t4, (b) t4, cVar, scheduledExecutorService);
    }

    public static <T extends com.facebook.fresco.animation.backend.a> com.facebook.fresco.animation.backend.b<T> s(T t4, b bVar, com.facebook.common.time.c cVar, ScheduledExecutorService scheduledExecutorService) {
        return new c(t4, bVar, cVar, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v() {
        return this.f11393h.now() - this.f11396k > this.f11397l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w() {
        if (!this.f11395j) {
            this.f11395j = true;
            this.f11394i.schedule(this.f11400o, this.f11398m, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.facebook.fresco.animation.backend.b, com.facebook.fresco.animation.backend.a
    public boolean h(Drawable drawable, Canvas canvas, int i4) {
        this.f11396k = this.f11393h.now();
        boolean h4 = super.h(drawable, canvas, i4);
        w();
        return h4;
    }

    public long t() {
        return this.f11398m;
    }

    public long u() {
        return this.f11397l;
    }

    public void x(long j4) {
        this.f11398m = j4;
    }

    public void y(@Nullable b bVar) {
        this.f11399n = bVar;
    }

    public void z(long j4) {
        this.f11397l = j4;
    }
}
