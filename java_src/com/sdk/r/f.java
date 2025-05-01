package com.sdk.r;
/* loaded from: classes5.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static f f60099a;

    /* renamed from: b  reason: collision with root package name */
    public com.sdk.s.a f60100b;

    /* renamed from: c  reason: collision with root package name */
    public final String f60101c;

    public f() {
        com.sdk.s.a gVar;
        int i4 = com.sdk.v.a.f60107d;
        this.f60101c = com.sdk.v.a.f60105b;
        if (i4 == 0) {
            gVar = new com.sdk.s.b();
        } else if (i4 != 2) {
            return;
        } else {
            gVar = new g();
        }
        this.f60100b = gVar;
    }

    public static f a() {
        if (f60099a == null) {
            f60099a = new f();
        }
        return f60099a;
    }
}
