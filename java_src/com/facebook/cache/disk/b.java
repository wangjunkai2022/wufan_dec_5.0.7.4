package com.facebook.cache.disk;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.common.internal.k;
import com.facebook.common.internal.l;
import java.io.File;
import javax.annotation.Nullable;
/* compiled from: DiskCacheConfig.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f10737a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10738b;

    /* renamed from: c  reason: collision with root package name */
    private final k<File> f10739c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10740d;

    /* renamed from: e  reason: collision with root package name */
    private final long f10741e;

    /* renamed from: f  reason: collision with root package name */
    private final long f10742f;

    /* renamed from: g  reason: collision with root package name */
    private final g f10743g;

    /* renamed from: h  reason: collision with root package name */
    private final CacheErrorLogger f10744h;

    /* renamed from: i  reason: collision with root package name */
    private final CacheEventListener f10745i;

    /* renamed from: j  reason: collision with root package name */
    private final com.facebook.common.disk.b f10746j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f10747k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f10748l;

    /* compiled from: DiskCacheConfig.java */
    /* renamed from: com.facebook.cache.disk.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0250b {

        /* renamed from: a  reason: collision with root package name */
        private int f10749a;

        /* renamed from: b  reason: collision with root package name */
        private String f10750b;

        /* renamed from: c  reason: collision with root package name */
        private k<File> f10751c;

        /* renamed from: d  reason: collision with root package name */
        private long f10752d;

        /* renamed from: e  reason: collision with root package name */
        private long f10753e;

        /* renamed from: f  reason: collision with root package name */
        private long f10754f;

        /* renamed from: g  reason: collision with root package name */
        private g f10755g;

        /* renamed from: h  reason: collision with root package name */
        private CacheErrorLogger f10756h;

        /* renamed from: i  reason: collision with root package name */
        private CacheEventListener f10757i;

        /* renamed from: j  reason: collision with root package name */
        private com.facebook.common.disk.b f10758j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f10759k;
        @Nullable

        /* renamed from: l  reason: collision with root package name */
        private final Context f10760l;

        /* compiled from: DiskCacheConfig.java */
        /* renamed from: com.facebook.cache.disk.b$b$a */
        /* loaded from: classes2.dex */
        class a implements k<File> {
            a() {
            }

            @Override // com.facebook.common.internal.k
            /* renamed from: a */
            public File get() {
                return C0250b.this.f10760l.getApplicationContext().getCacheDir();
            }
        }

        public b m() {
            com.facebook.common.internal.h.p((this.f10751c == null && this.f10760l == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f10751c == null && this.f10760l != null) {
                this.f10751c = new a();
            }
            return new b(this);
        }

        public C0250b n(String str) {
            this.f10750b = str;
            return this;
        }

        public C0250b o(File file) {
            this.f10751c = l.a(file);
            return this;
        }

        public C0250b p(k<File> kVar) {
            this.f10751c = kVar;
            return this;
        }

        public C0250b q(CacheErrorLogger cacheErrorLogger) {
            this.f10756h = cacheErrorLogger;
            return this;
        }

        public C0250b r(CacheEventListener cacheEventListener) {
            this.f10757i = cacheEventListener;
            return this;
        }

        public C0250b s(com.facebook.common.disk.b bVar) {
            this.f10758j = bVar;
            return this;
        }

        public C0250b t(g gVar) {
            this.f10755g = gVar;
            return this;
        }

        public C0250b u(boolean z4) {
            this.f10759k = z4;
            return this;
        }

        public C0250b v(long j4) {
            this.f10752d = j4;
            return this;
        }

        public C0250b w(long j4) {
            this.f10753e = j4;
            return this;
        }

        public C0250b x(long j4) {
            this.f10754f = j4;
            return this;
        }

        public C0250b y(int i4) {
            this.f10749a = i4;
            return this;
        }

        private C0250b(@Nullable Context context) {
            this.f10749a = 1;
            this.f10750b = "image_cache";
            this.f10752d = 41943040L;
            this.f10753e = 10485760L;
            this.f10754f = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            this.f10755g = new com.facebook.cache.disk.a();
            this.f10760l = context;
        }
    }

    public static C0250b l(@Nullable Context context) {
        return new C0250b(context);
    }

    public String a() {
        return this.f10738b;
    }

    public k<File> b() {
        return this.f10739c;
    }

    public CacheErrorLogger c() {
        return this.f10744h;
    }

    public CacheEventListener d() {
        return this.f10745i;
    }

    public long e() {
        return this.f10740d;
    }

    public com.facebook.common.disk.b f() {
        return this.f10746j;
    }

    public g g() {
        return this.f10743g;
    }

    public Context getContext() {
        return this.f10747k;
    }

    public boolean h() {
        return this.f10748l;
    }

    public long i() {
        return this.f10741e;
    }

    public long j() {
        return this.f10742f;
    }

    public int k() {
        return this.f10737a;
    }

    private b(C0250b c0250b) {
        CacheErrorLogger cacheErrorLogger;
        CacheEventListener cacheEventListener;
        com.facebook.common.disk.b bVar;
        this.f10737a = c0250b.f10749a;
        this.f10738b = (String) com.facebook.common.internal.h.i(c0250b.f10750b);
        this.f10739c = (k) com.facebook.common.internal.h.i(c0250b.f10751c);
        this.f10740d = c0250b.f10752d;
        this.f10741e = c0250b.f10753e;
        this.f10742f = c0250b.f10754f;
        this.f10743g = (g) com.facebook.common.internal.h.i(c0250b.f10755g);
        if (c0250b.f10756h != null) {
            cacheErrorLogger = c0250b.f10756h;
        } else {
            cacheErrorLogger = com.facebook.cache.common.g.b();
        }
        this.f10744h = cacheErrorLogger;
        if (c0250b.f10757i != null) {
            cacheEventListener = c0250b.f10757i;
        } else {
            cacheEventListener = com.facebook.cache.common.h.i();
        }
        this.f10745i = cacheEventListener;
        if (c0250b.f10758j != null) {
            bVar = c0250b.f10758j;
        } else {
            bVar = com.facebook.common.disk.c.c();
        }
        this.f10746j = bVar;
        this.f10747k = c0250b.f10760l;
        this.f10748l = c0250b.f10759k;
    }
}
