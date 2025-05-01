package com.umeng.analytics.pro;
/* compiled from: TApplicationException.java */
/* loaded from: classes6.dex */
public class bu extends cb {

    /* renamed from: a  reason: collision with root package name */
    public static final int f63533a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f63534b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f63535c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f63536d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f63537e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f63538f = 5;

    /* renamed from: g  reason: collision with root package name */
    public static final int f63539g = 6;

    /* renamed from: h  reason: collision with root package name */
    public static final int f63540h = 7;

    /* renamed from: j  reason: collision with root package name */
    private static final cz f63541j = new cz("TApplicationException");

    /* renamed from: k  reason: collision with root package name */
    private static final cp f63542k = new cp("message", (byte) 11, 1);

    /* renamed from: l  reason: collision with root package name */
    private static final cp f63543l = new cp("type", (byte) 8, 2);

    /* renamed from: m  reason: collision with root package name */
    private static final long f63544m = 1;

    /* renamed from: i  reason: collision with root package name */
    protected int f63545i;

    public bu() {
        this.f63545i = 0;
    }

    public int a() {
        return this.f63545i;
    }

    public void b(cu cuVar) throws cb {
        cuVar.a(f63541j);
        if (getMessage() != null) {
            cuVar.a(f63542k);
            cuVar.a(getMessage());
            cuVar.c();
        }
        cuVar.a(f63543l);
        cuVar.a(this.f63545i);
        cuVar.c();
        cuVar.d();
        cuVar.b();
    }

    public static bu a(cu cuVar) throws cb {
        cuVar.j();
        String str = null;
        int i4 = 0;
        while (true) {
            cp l4 = cuVar.l();
            byte b5 = l4.f63628b;
            if (b5 == 0) {
                cuVar.k();
                return new bu(i4, str);
            }
            short s4 = l4.f63629c;
            if (s4 != 1) {
                if (s4 != 2) {
                    cx.a(cuVar, b5);
                } else if (b5 == 8) {
                    i4 = cuVar.w();
                } else {
                    cx.a(cuVar, b5);
                }
            } else if (b5 == 11) {
                str = cuVar.z();
            } else {
                cx.a(cuVar, b5);
            }
            cuVar.m();
        }
    }

    public bu(int i4) {
        this.f63545i = 0;
        this.f63545i = i4;
    }

    public bu(int i4, String str) {
        super(str);
        this.f63545i = 0;
        this.f63545i = i4;
    }

    public bu(String str) {
        super(str);
        this.f63545i = 0;
    }
}
