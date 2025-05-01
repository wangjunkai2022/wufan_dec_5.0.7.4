package com.aggmoread.sdk.z.a.s;
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: k  reason: collision with root package name */
    public static c f2491k = new b().a();

    /* renamed from: a  reason: collision with root package name */
    private int f2492a;

    /* renamed from: b  reason: collision with root package name */
    private int f2493b;

    /* renamed from: c  reason: collision with root package name */
    private int f2494c;

    /* renamed from: d  reason: collision with root package name */
    private int f2495d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2496e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2497f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2498g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2499h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2500i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2501j;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: d  reason: collision with root package name */
        private int f2505d;

        /* renamed from: e  reason: collision with root package name */
        private int f2506e;

        /* renamed from: a  reason: collision with root package name */
        private int f2502a = 1;

        /* renamed from: b  reason: collision with root package name */
        private int f2503b = 1;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2504c = true;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2507f = true;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2508g = true;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2509h = false;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2510i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f2511j = false;

        public b a(int i4) {
            this.f2503b = i4;
            return this;
        }

        public b a(boolean z4) {
            this.f2504c = z4;
            return this;
        }

        public c a() {
            c cVar = new c();
            cVar.f2495d = this.f2503b;
            cVar.f2494c = this.f2502a;
            cVar.f2496e = this.f2504c;
            cVar.f2498g = this.f2508g;
            cVar.f2497f = this.f2507f;
            cVar.f2499h = this.f2509h;
            cVar.f2500i = this.f2510i;
            cVar.f2501j = this.f2511j;
            cVar.f2492a = this.f2505d;
            cVar.f2493b = this.f2506e;
            return cVar;
        }

        public b b(boolean z4) {
            this.f2509h = z4;
            return this;
        }

        public b c(boolean z4) {
            this.f2508g = z4;
            return this;
        }

        public b d(boolean z4) {
            this.f2507f = z4;
            return this;
        }
    }

    private c() {
    }

    public boolean a() {
        return this.f2497f;
    }

    public String toString() {
        return String.format("{最大视频时间=%s, 最小视频时间=%s, 视频播放设置=%s, 静音播放=%s, 自动播放设置=%s, 是否自动静音播放=%s, 进度条=%s, 封面=%s, 详情页=%s, 是否点击控制暂停=%s}", Integer.valueOf(this.f2492a), Integer.valueOf(this.f2493b), Integer.valueOf(this.f2494c), Boolean.valueOf(this.f2501j), Integer.valueOf(this.f2495d), Boolean.valueOf(this.f2496e), Boolean.valueOf(this.f2497f), Boolean.valueOf(this.f2498g), Boolean.valueOf(this.f2499h), Boolean.valueOf(this.f2500i));
    }
}
