package com.ss.android.socialbase.downloader.network;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes5.dex */
public class b {
    private static final String vv = "b";

    /* renamed from: i  reason: collision with root package name */
    private final AtomicReference<jh> f61238i;

    /* renamed from: m  reason: collision with root package name */
    private final i f61239m;

    /* renamed from: n  reason: collision with root package name */
    private int f61240n;

    /* renamed from: o  reason: collision with root package name */
    private AtomicReference<jh> f61241o;

    /* renamed from: p  reason: collision with root package name */
    private volatile boolean f61242p;

    /* renamed from: u  reason: collision with root package name */
    private final ArrayList<Object> f61243u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ss.android.socialbase.downloader.network.b$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] vv;

        static {
            int[] iArr = new int[jh.values().length];
            vv = iArr;
            try {
                iArr[jh.POOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                vv[jh.MODERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                vv[jh.GOOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                vv[jh.EXCELLENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes5.dex */
    private static class vv {
        public static final b vv = new b(null);
    }

    /* synthetic */ b(AnonymousClass1 anonymousClass1) {
        this();
    }

    private void i() {
        try {
            int size = this.f61243u.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f61243u.get(i4);
                this.f61238i.get();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean p() {
        if (this.f61239m == null) {
            return false;
        }
        try {
            int i4 = AnonymousClass1.vv[this.f61238i.get().ordinal()];
            double d5 = 2000.0d;
            double d6 = 550.0d;
            if (i4 == 1) {
                d6 = 0.0d;
                d5 = 150.0d;
            } else if (i4 == 2) {
                d5 = 550.0d;
                d6 = 150.0d;
            } else if (i4 != 3) {
                if (i4 != 4) {
                    return true;
                }
                d5 = 3.4028234663852886E38d;
                d6 = 2000.0d;
            }
            double vv2 = this.f61239m.vv();
            if (vv2 > d5) {
                if (vv2 > d5 * 1.25d) {
                    return true;
                }
            } else if (vv2 < d6 * 0.8d) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static b vv() {
        return vv.vv;
    }

    public synchronized jh m() {
        i iVar = this.f61239m;
        if (iVar == null) {
            return jh.UNKNOWN;
        }
        return vv(iVar.vv());
    }

    private b() {
        this.f61239m = new i(0.05d);
        this.f61242p = false;
        this.f61238i = new AtomicReference<>(jh.UNKNOWN);
        this.f61243u = new ArrayList<>();
    }

    public synchronized void vv(long j4, long j5) {
        double d5 = j4;
        Double.isNaN(d5);
        double d6 = j5;
        Double.isNaN(d6);
        double d7 = ((d5 * 1.0d) / d6) * 8.0d;
        if (j5 == 0 || d7 < 3.0d) {
            return;
        }
        try {
            this.f61239m.vv(d7);
            jh m4 = m();
            if (this.f61242p) {
                this.f61240n++;
                if (m4 != this.f61241o.get()) {
                    this.f61242p = false;
                    this.f61240n = 1;
                }
                if (this.f61240n >= 5.0d && p()) {
                    this.f61242p = false;
                    this.f61240n = 1;
                    this.f61238i.set(this.f61241o.get());
                    i();
                }
                return;
            }
            if (this.f61238i.get() != m4) {
                this.f61242p = true;
                this.f61241o = new AtomicReference<>(m4);
            }
        } catch (Throwable unused) {
        }
    }

    private jh vv(double d5) {
        if (d5 < 0.0d) {
            return jh.UNKNOWN;
        }
        if (d5 < 150.0d) {
            return jh.POOR;
        }
        if (d5 < 550.0d) {
            return jh.MODERATE;
        }
        if (d5 < 2000.0d) {
            return jh.GOOD;
        }
        return jh.EXCELLENT;
    }
}
