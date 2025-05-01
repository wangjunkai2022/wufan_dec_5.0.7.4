package com.aggmoread.sdk.z.c.a.a.c.t;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f2776a;

    /* renamed from: b  reason: collision with root package name */
    private int f2777b;

    /* renamed from: c  reason: collision with root package name */
    private int f2778c;

    /* renamed from: d  reason: collision with root package name */
    private int f2779d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2780e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2781f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2782g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2783h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2784i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2785j;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.c.t.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0097b {

        /* renamed from: d  reason: collision with root package name */
        private int f2789d;

        /* renamed from: e  reason: collision with root package name */
        private int f2790e;

        /* renamed from: a  reason: collision with root package name */
        private int f2786a = 1;

        /* renamed from: b  reason: collision with root package name */
        private int f2787b = 1;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2788c = true;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2791f = true;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2792g = true;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2793h = false;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2794i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f2795j = false;

        public C0097b a(int i4) {
            this.f2787b = i4;
            return this;
        }

        public C0097b a(boolean z4) {
            this.f2788c = z4;
            return this;
        }

        public b a() {
            b bVar = new b();
            bVar.f2779d = this.f2787b;
            bVar.f2778c = this.f2786a;
            bVar.f2780e = this.f2788c;
            bVar.f2782g = this.f2792g;
            bVar.f2781f = this.f2791f;
            bVar.f2783h = this.f2793h;
            bVar.f2784i = this.f2794i;
            bVar.f2785j = this.f2795j;
            bVar.f2776a = this.f2789d;
            bVar.f2777b = this.f2790e;
            return bVar;
        }

        public C0097b b(int i4) {
            this.f2786a = i4;
            return this;
        }

        public C0097b b(boolean z4) {
            this.f2795j = z4;
            return this;
        }

        public C0097b c(boolean z4) {
            this.f2793h = z4;
            return this;
        }

        public C0097b d(boolean z4) {
            this.f2794i = z4;
            return this;
        }

        public C0097b e(boolean z4) {
            this.f2792g = z4;
            return this;
        }

        public C0097b f(boolean z4) {
            this.f2791f = z4;
            return this;
        }
    }

    static {
        new C0097b().a();
    }

    private b() {
    }

    public int a() {
        return this.f2779d;
    }

    public int b() {
        return this.f2776a;
    }

    public int c() {
        return this.f2777b;
    }

    public boolean d() {
        return this.f2780e;
    }

    public boolean e() {
        return this.f2785j;
    }

    public boolean f() {
        return this.f2783h;
    }

    public boolean g() {
        return this.f2782g;
    }

    public boolean h() {
        return this.f2781f;
    }

    public String toString() {
        return String.format("{最大视频时间=%s, 最小视频时间=%s, 视频播放设置=%s, 静音播放=%s, 自动播放设置=%s, 是否自动静音播放=%s, 进度条=%s, 封面=%s, 详情页=%s, 是否点击控制暂停=%s}", Integer.valueOf(this.f2776a), Integer.valueOf(this.f2777b), Integer.valueOf(this.f2778c), Boolean.valueOf(this.f2785j), Integer.valueOf(this.f2779d), Boolean.valueOf(this.f2780e), Boolean.valueOf(this.f2781f), Boolean.valueOf(this.f2782g), Boolean.valueOf(this.f2783h), Boolean.valueOf(this.f2784i));
    }
}
