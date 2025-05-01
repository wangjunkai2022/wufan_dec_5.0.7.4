package cn.sharesdk.framework.a.b;
/* compiled from: DemoEvent.java */
/* loaded from: classes2.dex */
public class d extends c {

    /* renamed from: d  reason: collision with root package name */
    private static int f885d;

    /* renamed from: m  reason: collision with root package name */
    private static long f886m;

    /* renamed from: a  reason: collision with root package name */
    public String f887a;

    /* renamed from: b  reason: collision with root package name */
    public int f888b;

    /* renamed from: c  reason: collision with root package name */
    public String f889c = "";

    @Override // cn.sharesdk.framework.a.b.c
    protected String a() {
        return "[EVT]";
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected void a(long j4) {
        f886m = j4;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected int b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected int c() {
        return 30;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected long d() {
        return f885d;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected long e() {
        return f886m;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected void f() {
        f885d++;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public String toString() {
        return super.toString() + '|' + this.f887a + '|' + this.f888b + '|' + this.f889c;
    }
}
