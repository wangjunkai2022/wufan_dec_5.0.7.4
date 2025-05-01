package cn.sharesdk.framework.a.b;

import com.mob.MobSDK;
/* compiled from: BaseEvent.java */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: e  reason: collision with root package name */
    public long f877e;

    /* renamed from: f  reason: collision with root package name */
    public String f878f;

    /* renamed from: g  reason: collision with root package name */
    public String f879g;

    /* renamed from: h  reason: collision with root package name */
    public int f880h;

    /* renamed from: i  reason: collision with root package name */
    public String f881i;

    /* renamed from: j  reason: collision with root package name */
    public int f882j;

    /* renamed from: k  reason: collision with root package name */
    public String f883k;

    /* renamed from: l  reason: collision with root package name */
    public String f884l;

    protected abstract String a();

    protected abstract void a(long j4);

    protected abstract int b();

    protected abstract int c();

    protected abstract long d();

    protected abstract long e();

    protected abstract void f();

    public boolean g() {
        int b5 = b();
        int c5 = c();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - e() < b5) {
            return d() < ((long) c5);
        }
        a(currentTimeMillis);
        return true;
    }

    public void h() {
        f();
    }

    public String toString() {
        return a() + ':' + this.f877e + '|' + this.f878f + '|' + MobSDK.getAppkey() + '|' + this.f879g + '|' + this.f880h + '|' + this.f881i + '|' + this.f882j + '|' + this.f883k;
    }
}
