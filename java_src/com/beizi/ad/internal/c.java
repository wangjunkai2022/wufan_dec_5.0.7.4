package com.beizi.ad.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import com.beizi.ad.R;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.view.BannerAdViewImpl;
import com.beizi.ad.internal.view.InterstitialAdViewImpl;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: AdFetcher.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private ScheduledExecutorService f5833a;

    /* renamed from: f  reason: collision with root package name */
    private final com.beizi.ad.internal.a f5838f;

    /* renamed from: g  reason: collision with root package name */
    private l f5839g;

    /* renamed from: b  reason: collision with root package name */
    private int f5834b = -1;

    /* renamed from: d  reason: collision with root package name */
    private long f5836d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f5837e = -1;

    /* renamed from: h  reason: collision with root package name */
    private EnumC0176c f5840h = EnumC0176c.STOPPED;

    /* renamed from: c  reason: collision with root package name */
    private final b f5835c = new b(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdFetcher.java */
    /* renamed from: com.beizi.ad.internal.c$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5841a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f5842b;

        static {
            int[] iArr = new int[j.values().length];
            f5842b = iArr;
            try {
                iArr[j.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5842b[j.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5842b[j.SPLASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5842b[j.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5842b[j.PREFETCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC0176c.values().length];
            f5841a = iArr2;
            try {
                iArr2[EnumC0176c.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5841a[EnumC0176c.SINGLE_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5841a[EnumC0176c.AUTO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdFetcher.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HaoboLog.v(HaoboLog.baseLogTag, HaoboLog.getString(R.string.handler_message_pass));
            c.this.f5835c.sendEmptyMessage(0);
        }

        /* synthetic */ a(c cVar, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* compiled from: AdFetcher.java */
    /* loaded from: classes2.dex */
    private static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final c f5844a;

        b(c cVar) {
            this.f5844a = cVar;
        }

        @Override // android.os.Handler
        @SuppressLint({"NewApi"})
        public synchronized void handleMessage(Message message) {
            c cVar = this.f5844a;
            if (cVar != null && cVar.f5838f.isReadyToStart()) {
                if (cVar.f5836d != -1) {
                    HaoboLog.d(HaoboLog.baseLogTag, HaoboLog.getString(R.string.new_ad_since, Math.max(0, (int) (System.currentTimeMillis() - cVar.f5836d))));
                }
                cVar.f5836d = System.currentTimeMillis();
                int i4 = AnonymousClass1.f5842b[cVar.f5838f.getMediaType().ordinal()];
                if (i4 == 1) {
                    cVar.f5839g = new f((BannerAdViewImpl) cVar.f5838f);
                } else if (i4 == 2) {
                    cVar.f5839g = new f((InterstitialAdViewImpl) cVar.f5838f);
                } else if (i4 == 3) {
                    cVar.f5839g = new f((BannerAdViewImpl) cVar.f5838f);
                } else if (i4 == 4) {
                    cVar.f5839g = new com.beizi.ad.internal.nativead.c((com.beizi.ad.internal.nativead.b) cVar.f5838f);
                } else if (i4 == 5) {
                    cVar.f5839g = new k();
                }
                cVar.f5839g.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdFetcher.java */
    /* renamed from: com.beizi.ad.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0176c {
        STOPPED,
        SINGLE_REQUEST,
        AUTO_REFRESH
    }

    public c(com.beizi.ad.internal.a aVar) {
        this.f5838f = aVar;
    }

    private void e() {
        ScheduledExecutorService scheduledExecutorService = this.f5833a;
        if (scheduledExecutorService == null) {
            return;
        }
        scheduledExecutorService.shutdownNow();
        try {
            this.f5833a.awaitTermination(this.f5834b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.f5833a = null;
            throw th;
        }
        this.f5833a = null;
    }

    private void d() {
        if (this.f5833a == null) {
            this.f5833a = Executors.newScheduledThreadPool(4);
        }
    }

    public void b() {
        HaoboLog.d(HaoboLog.baseLogTag, HaoboLog.getString(R.string.start));
        d();
        int i4 = AnonymousClass1.f5841a[this.f5840h.ordinal()];
        long j4 = 0;
        if (i4 != 1) {
            if (i4 != 2) {
                return;
            }
            HaoboLog.v(HaoboLog.baseLogTag, HaoboLog.getString(R.string.fetcher_start_single));
            this.f5833a.schedule(new a(this, null), 0L, TimeUnit.SECONDS);
        } else if (this.f5834b <= 0) {
            HaoboLog.v(HaoboLog.baseLogTag, HaoboLog.getString(R.string.fetcher_start_single));
            this.f5833a.schedule(new a(this, null), 0L, TimeUnit.SECONDS);
            this.f5840h = EnumC0176c.SINGLE_REQUEST;
        } else {
            HaoboLog.v(HaoboLog.baseLogTag, HaoboLog.getString(R.string.fetcher_start_auto));
            int i5 = this.f5834b;
            long j5 = this.f5837e;
            if (j5 != -1) {
                long j6 = this.f5836d;
                if (j6 != -1) {
                    long j7 = i5;
                    j4 = Math.min(j7, Math.max(0L, j7 - (j5 - j6)));
                }
            }
            long j8 = j4;
            HaoboLog.v(HaoboLog.baseLogTag, HaoboLog.getString(R.string.request_delayed_by_x_ms, j8));
            this.f5833a.scheduleAtFixedRate(new a(this, null), j8, i5, TimeUnit.MILLISECONDS);
            this.f5840h = EnumC0176c.AUTO_REFRESH;
        }
    }

    public void c() {
        this.f5836d = -1L;
        this.f5837e = -1L;
    }

    public void a(int i4) {
        boolean z4 = this.f5834b != i4;
        this.f5834b = i4;
        if (!z4 || this.f5840h.equals(EnumC0176c.STOPPED)) {
            return;
        }
        String str = HaoboLog.baseLogTag;
        HaoboLog.d(str, "AdFetcher refresh mPeriod changed to " + this.f5834b);
        HaoboLog.d(HaoboLog.baseLogTag, "Resetting AdFetcher");
        a();
        b();
    }

    public void a() {
        l lVar = this.f5839g;
        if (lVar != null) {
            lVar.e();
            this.f5839g = null;
        }
        e();
        HaoboLog.d(HaoboLog.baseLogTag, HaoboLog.getString(R.string.stop));
        this.f5837e = System.currentTimeMillis();
        this.f5840h = EnumC0176c.STOPPED;
    }
}
