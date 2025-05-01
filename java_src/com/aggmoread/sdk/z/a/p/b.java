package com.aggmoread.sdk.z.a.p;
/* loaded from: classes2.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f2383b = new a(99);

    /* renamed from: c  reason: collision with root package name */
    public static final b f2384c = new C0070b(1);

    /* renamed from: d  reason: collision with root package name */
    public static final b f2385d = new c(2);

    /* renamed from: e  reason: collision with root package name */
    public static final b f2386e = new d(3);

    /* renamed from: a  reason: collision with root package name */
    private int f2387a;

    /* loaded from: classes2.dex */
    static class a extends b {
        a(int i4) {
            super(i4, null);
        }

        public String toString() {
            return "UNKNOWN";
        }
    }

    /* renamed from: com.aggmoread.sdk.z.a.p.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0070b extends b {
        C0070b(int i4) {
            super(i4, null);
        }

        public String toString() {
            return "CMCC";
        }
    }

    /* loaded from: classes2.dex */
    static class c extends b {
        c(int i4) {
            super(i4, null);
        }

        public String toString() {
            return "TELECOM";
        }
    }

    /* loaded from: classes2.dex */
    static class d extends b {
        d(int i4) {
            super(i4, null);
        }

        public String toString() {
            return "UNICOM";
        }
    }

    private b(int i4) {
        this.f2387a = i4;
    }

    /* synthetic */ b(int i4, a aVar) {
        this(i4);
    }

    public final int a() {
        return this.f2387a;
    }
}
