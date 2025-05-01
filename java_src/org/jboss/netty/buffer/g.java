package org.jboss.netty.buffer;
/* compiled from: ChannelBufferIndexFinder.java */
/* loaded from: classes7.dex */
public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f72456a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final g f72457b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final g f72458c = new d();

    /* renamed from: d  reason: collision with root package name */
    public static final g f72459d = new e();

    /* renamed from: e  reason: collision with root package name */
    public static final g f72460e = new f();

    /* renamed from: f  reason: collision with root package name */
    public static final g f72461f = new C0798g();

    /* renamed from: g  reason: collision with root package name */
    public static final g f72462g = new h();

    /* renamed from: h  reason: collision with root package name */
    public static final g f72463h = new i();

    /* renamed from: i  reason: collision with root package name */
    public static final g f72464i = new j();

    /* renamed from: j  reason: collision with root package name */
    public static final g f72465j = new a();

    /* compiled from: ChannelBufferIndexFinder.java */
    /* loaded from: classes7.dex */
    static class a implements g {
        a() {
        }

        @Override // org.jboss.netty.buffer.g
        public boolean a(org.jboss.netty.buffer.e eVar, int i4) {
            byte b5 = eVar.getByte(i4);
            return (b5 == 32 || b5 == 9) ? false : true;
        }
    }

    /* compiled from: ChannelBufferIndexFinder.java */
    /* loaded from: classes7.dex */
    static class b implements g {
        b() {
        }

        @Override // org.jboss.netty.buffer.g
        public boolean a(org.jboss.netty.buffer.e eVar, int i4) {
            return eVar.getByte(i4) == 0;
        }
    }

    /* compiled from: ChannelBufferIndexFinder.java */
    /* loaded from: classes7.dex */
    static class c implements g {
        c() {
        }

        @Override // org.jboss.netty.buffer.g
        public boolean a(org.jboss.netty.buffer.e eVar, int i4) {
            return eVar.getByte(i4) != 0;
        }
    }

    /* compiled from: ChannelBufferIndexFinder.java */
    /* loaded from: classes7.dex */
    static class d implements g {
        d() {
        }

        @Override // org.jboss.netty.buffer.g
        public boolean a(org.jboss.netty.buffer.e eVar, int i4) {
            return eVar.getByte(i4) == 13;
        }
    }

    /* compiled from: ChannelBufferIndexFinder.java */
    /* loaded from: classes7.dex */
    static class e implements g {
        e() {
        }

        @Override // org.jboss.netty.buffer.g
        public boolean a(org.jboss.netty.buffer.e eVar, int i4) {
            return eVar.getByte(i4) != 13;
        }
    }

    /* compiled from: ChannelBufferIndexFinder.java */
    /* loaded from: classes7.dex */
    static class f implements g {
        f() {
        }

        @Override // org.jboss.netty.buffer.g
        public boolean a(org.jboss.netty.buffer.e eVar, int i4) {
            return eVar.getByte(i4) == 10;
        }
    }

    /* compiled from: ChannelBufferIndexFinder.java */
    /* renamed from: org.jboss.netty.buffer.g$g  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    static class C0798g implements g {
        C0798g() {
        }

        @Override // org.jboss.netty.buffer.g
        public boolean a(org.jboss.netty.buffer.e eVar, int i4) {
            return eVar.getByte(i4) != 10;
        }
    }

    /* compiled from: ChannelBufferIndexFinder.java */
    /* loaded from: classes7.dex */
    static class h implements g {
        h() {
        }

        @Override // org.jboss.netty.buffer.g
        public boolean a(org.jboss.netty.buffer.e eVar, int i4) {
            byte b5 = eVar.getByte(i4);
            return b5 == 13 || b5 == 10;
        }
    }

    /* compiled from: ChannelBufferIndexFinder.java */
    /* loaded from: classes7.dex */
    static class i implements g {
        i() {
        }

        @Override // org.jboss.netty.buffer.g
        public boolean a(org.jboss.netty.buffer.e eVar, int i4) {
            byte b5 = eVar.getByte(i4);
            return (b5 == 13 || b5 == 10) ? false : true;
        }
    }

    /* compiled from: ChannelBufferIndexFinder.java */
    /* loaded from: classes7.dex */
    static class j implements g {
        j() {
        }

        @Override // org.jboss.netty.buffer.g
        public boolean a(org.jboss.netty.buffer.e eVar, int i4) {
            byte b5 = eVar.getByte(i4);
            return b5 == 32 || b5 == 9;
        }
    }

    boolean a(org.jboss.netty.buffer.e eVar, int i4);
}
