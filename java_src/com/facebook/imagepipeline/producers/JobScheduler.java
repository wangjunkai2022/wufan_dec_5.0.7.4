package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.internal.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public class JobScheduler {

    /* renamed from: k  reason: collision with root package name */
    static final String f12119k = "queueTime";

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12120a;

    /* renamed from: b  reason: collision with root package name */
    private final d f12121b;

    /* renamed from: e  reason: collision with root package name */
    private final int f12124e;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f12122c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f12123d = new b();
    @VisibleForTesting
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    com.facebook.imagepipeline.image.e f12125f = null;
    @VisibleForTesting
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    int f12126g = 0;
    @VisibleForTesting
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    JobState f12127h = JobState.IDLE;
    @VisibleForTesting
    @GuardedBy("this")

    /* renamed from: i  reason: collision with root package name */
    long f12128i = 0;
    @VisibleForTesting
    @GuardedBy("this")

    /* renamed from: j  reason: collision with root package name */
    long f12129j = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public enum JobState {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JobScheduler.this.d();
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JobScheduler.this.j();
        }
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12132a;

        static {
            int[] iArr = new int[JobState.values().length];
            f12132a = iArr;
            try {
                iArr[JobState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12132a[JobState.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12132a[JobState.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12132a[JobState.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(com.facebook.imagepipeline.image.e eVar, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private static ScheduledExecutorService f12133a;

        e() {
        }

        static ScheduledExecutorService a() {
            if (f12133a == null) {
                f12133a = Executors.newSingleThreadScheduledExecutor();
            }
            return f12133a;
        }
    }

    public JobScheduler(Executor executor, d dVar, int i4) {
        this.f12120a = executor;
        this.f12121b = dVar;
        this.f12124e = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        com.facebook.imagepipeline.image.e eVar;
        int i4;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            eVar = this.f12125f;
            i4 = this.f12126g;
            this.f12125f = null;
            this.f12126g = 0;
            this.f12127h = JobState.RUNNING;
            this.f12129j = uptimeMillis;
        }
        try {
            if (i(eVar, i4)) {
                this.f12121b.a(eVar, i4);
            }
        } finally {
            com.facebook.imagepipeline.image.e.d(eVar);
            g();
        }
    }

    private void e(long j4) {
        if (j4 > 0) {
            e.a().schedule(this.f12123d, j4, TimeUnit.MILLISECONDS);
        } else {
            this.f12123d.run();
        }
    }

    private void g() {
        long j4;
        boolean z4;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f12127h == JobState.RUNNING_AND_PENDING) {
                j4 = Math.max(this.f12129j + this.f12124e, uptimeMillis);
                z4 = true;
                this.f12128i = uptimeMillis;
                this.f12127h = JobState.QUEUED;
            } else {
                this.f12127h = JobState.IDLE;
                j4 = 0;
                z4 = false;
            }
        }
        if (z4) {
            e(j4 - uptimeMillis);
        }
    }

    private static boolean i(com.facebook.imagepipeline.image.e eVar, int i4) {
        return com.facebook.imagepipeline.producers.b.d(i4) || com.facebook.imagepipeline.producers.b.m(i4, 4) || com.facebook.imagepipeline.image.e.J(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f12120a.execute(this.f12122c);
    }

    public void c() {
        com.facebook.imagepipeline.image.e eVar;
        synchronized (this) {
            eVar = this.f12125f;
            this.f12125f = null;
            this.f12126g = 0;
        }
        com.facebook.imagepipeline.image.e.d(eVar);
    }

    public synchronized long f() {
        return this.f12129j - this.f12128i;
    }

    public boolean h() {
        long max;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            boolean z4 = false;
            if (i(this.f12125f, this.f12126g)) {
                int i4 = c.f12132a[this.f12127h.ordinal()];
                if (i4 != 1) {
                    if (i4 == 3) {
                        this.f12127h = JobState.RUNNING_AND_PENDING;
                    }
                    max = 0;
                } else {
                    max = Math.max(this.f12129j + this.f12124e, uptimeMillis);
                    this.f12128i = uptimeMillis;
                    this.f12127h = JobState.QUEUED;
                    z4 = true;
                }
                if (z4) {
                    e(max - uptimeMillis);
                }
                return true;
            }
            return false;
        }
    }

    public boolean k(com.facebook.imagepipeline.image.e eVar, int i4) {
        com.facebook.imagepipeline.image.e eVar2;
        if (i(eVar, i4)) {
            synchronized (this) {
                eVar2 = this.f12125f;
                this.f12125f = com.facebook.imagepipeline.image.e.b(eVar);
                this.f12126g = i4;
            }
            com.facebook.imagepipeline.image.e.d(eVar2);
            return true;
        }
        return false;
    }
}
