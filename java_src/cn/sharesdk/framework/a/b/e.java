package cn.sharesdk.framework.a.b;

import android.text.TextUtils;
/* compiled from: ExitEvent.java */
/* loaded from: classes2.dex */
public class e extends c {

    /* renamed from: b  reason: collision with root package name */
    private static int f890b;

    /* renamed from: c  reason: collision with root package name */
    private static long f891c;

    /* renamed from: a  reason: collision with root package name */
    public long f892a;

    @Override // cn.sharesdk.framework.a.b.c
    protected String a() {
        return "[EXT]";
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected void a(long j4) {
        f891c = j4;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected int b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected int c() {
        return 5;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected long d() {
        return f890b;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected long e() {
        return f891c;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected void f() {
        f890b++;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public boolean g() {
        cn.sharesdk.framework.a.a.e a5 = cn.sharesdk.framework.a.a.e.a();
        f890b = a5.k("insertExitEventCount");
        f891c = a5.j("lastInsertExitEventTime");
        return super.g();
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void h() {
        super.h();
        cn.sharesdk.framework.a.a.e a5 = cn.sharesdk.framework.a.a.e.a();
        a5.a("lastInsertExitEventTime", Long.valueOf(f891c));
        a5.a("insertExitEventCount", f890b);
    }

    @Override // cn.sharesdk.framework.a.b.c
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|');
        if (!TextUtils.isEmpty(this.f884l)) {
            sb.append(this.f884l);
        }
        sb.append('|');
        sb.append(Math.round(((float) this.f892a) / 1000.0f));
        return sb.toString();
    }
}
