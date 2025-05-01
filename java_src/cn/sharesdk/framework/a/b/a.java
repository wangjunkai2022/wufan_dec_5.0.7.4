package cn.sharesdk.framework.a.b;
/* compiled from: ApiEvent.java */
/* loaded from: classes2.dex */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private static int f867c;

    /* renamed from: d  reason: collision with root package name */
    private static long f868d;

    /* renamed from: a  reason: collision with root package name */
    public int f869a;

    /* renamed from: b  reason: collision with root package name */
    public String f870b;

    @Override // cn.sharesdk.framework.a.b.c
    protected String a() {
        return "[API]";
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected void a(long j4) {
        f868d = j4;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected int b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected int c() {
        return 50;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected long d() {
        return f867c;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected long e() {
        return f868d;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected void f() {
        f867c++;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public String toString() {
        return super.toString() + '|' + this.f869a + '|' + this.f870b;
    }
}
