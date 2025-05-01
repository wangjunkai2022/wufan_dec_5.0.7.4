package x3;

import net.lingala.zip4j.exception.ZipException;
/* compiled from: ProgressMonitor.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: k  reason: collision with root package name */
    public static final int f73569k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f73570l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f73571m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f73572n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f73573o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f73574p = 3;

    /* renamed from: q  reason: collision with root package name */
    public static final int f73575q = -1;

    /* renamed from: r  reason: collision with root package name */
    public static final int f73576r = 0;

    /* renamed from: s  reason: collision with root package name */
    public static final int f73577s = 1;

    /* renamed from: t  reason: collision with root package name */
    public static final int f73578t = 2;

    /* renamed from: u  reason: collision with root package name */
    public static final int f73579u = 3;

    /* renamed from: v  reason: collision with root package name */
    public static final int f73580v = 4;

    /* renamed from: a  reason: collision with root package name */
    private int f73581a;

    /* renamed from: b  reason: collision with root package name */
    private long f73582b;

    /* renamed from: c  reason: collision with root package name */
    private long f73583c;

    /* renamed from: d  reason: collision with root package name */
    private int f73584d;

    /* renamed from: e  reason: collision with root package name */
    private int f73585e;

    /* renamed from: f  reason: collision with root package name */
    private String f73586f;

    /* renamed from: g  reason: collision with root package name */
    private int f73587g;

    /* renamed from: h  reason: collision with root package name */
    private Throwable f73588h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f73589i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f73590j;

    public a() {
        o();
        this.f73584d = 0;
    }

    public void a() {
        this.f73589i = true;
    }

    public void b(Throwable th) throws ZipException {
        o();
        this.f73587g = 2;
        this.f73588h = th;
    }

    public void c() throws ZipException {
        o();
        this.f73587g = 0;
    }

    public void d() {
        o();
        this.f73588h = null;
        this.f73587g = 0;
    }

    public int e() {
        return this.f73585e;
    }

    public Throwable f() {
        return this.f73588h;
    }

    public String g() {
        return this.f73586f;
    }

    public int h() {
        return this.f73584d;
    }

    public int i() {
        return this.f73587g;
    }

    public int j() {
        return this.f73581a;
    }

    public long k() {
        return this.f73582b;
    }

    public long l() {
        return this.f73583c;
    }

    public boolean m() {
        return this.f73589i;
    }

    public boolean n() {
        return this.f73590j;
    }

    public void o() {
        this.f73585e = -1;
        this.f73581a = 0;
        this.f73586f = null;
        this.f73582b = 0L;
        this.f73583c = 0L;
        this.f73584d = 0;
    }

    public void p(int i4) {
        this.f73585e = i4;
    }

    public void q(Throwable th) {
        this.f73588h = th;
    }

    public void r(String str) {
        this.f73586f = str;
    }

    public void s(boolean z4) {
        this.f73590j = z4;
    }

    public void setResult(int i4) {
        this.f73587g = i4;
    }

    public void t(int i4) {
        this.f73584d = i4;
    }

    public void u(int i4) {
        this.f73581a = i4;
    }

    public void v(long j4) {
        this.f73582b = j4;
    }

    public void w(long j4) {
        long j5 = this.f73583c + j4;
        this.f73583c = j5;
        long j6 = this.f73582b;
        if (j6 > 0) {
            int i4 = (int) ((j5 * 100) / j6);
            this.f73584d = i4;
            if (i4 > 100) {
                this.f73584d = 100;
            }
        }
        while (this.f73590j) {
            try {
                Thread.sleep(150L);
            } catch (InterruptedException unused) {
            }
        }
    }
}
