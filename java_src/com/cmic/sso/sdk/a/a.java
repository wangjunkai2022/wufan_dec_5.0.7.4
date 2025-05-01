package com.cmic.sso.sdk.a;
/* compiled from: UmcConfigBean.java */
/* loaded from: classes2.dex */
public class a implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private String f9094a;

    /* renamed from: b  reason: collision with root package name */
    private String f9095b;

    /* renamed from: c  reason: collision with root package name */
    private String f9096c;

    /* renamed from: d  reason: collision with root package name */
    private String f9097d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9098e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9099f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9100g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9101h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9102i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9103j;

    /* renamed from: k  reason: collision with root package name */
    private int f9104k;

    /* renamed from: l  reason: collision with root package name */
    private int f9105l;

    /* compiled from: UmcConfigBean.java */
    /* renamed from: com.cmic.sso.sdk.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0235a {

        /* renamed from: a  reason: collision with root package name */
        private final a f9106a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a a(String str) {
            this.f9106a.f9094a = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a b(String str) {
            this.f9106a.f9095b = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a c(String str) {
            this.f9106a.f9096c = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a d(String str) {
            this.f9106a.f9097d = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a e(boolean z4) {
            this.f9106a.f9102i = z4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a f(boolean z4) {
            this.f9106a.f9103j = z4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a a(boolean z4) {
            this.f9106a.f9098e = z4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a b(boolean z4) {
            this.f9106a.f9099f = z4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a c(boolean z4) {
            this.f9106a.f9100g = z4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a d(boolean z4) {
            this.f9106a.f9101h = z4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a a(int i4) {
            this.f9106a.f9104k = i4;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0235a b(int i4) {
            this.f9106a.f9105l = i4;
            return this;
        }

        public a a() {
            return this.f9106a;
        }
    }

    public boolean g() {
        return this.f9100g;
    }

    public boolean h() {
        return this.f9101h;
    }

    public boolean i() {
        return this.f9102i;
    }

    public boolean j() {
        return this.f9103j;
    }

    public int k() {
        return this.f9104k;
    }

    public int l() {
        return this.f9105l;
    }

    /* renamed from: m */
    public a clone() throws CloneNotSupportedException {
        return (a) super.clone();
    }

    private a() {
        this.f9094a = "rcs.cmpassport.com";
        this.f9095b = "rcs.cmpassport.com";
        this.f9096c = "config2.cmpassport.com";
        this.f9097d = "log2.cmpassport.com:9443";
        this.f9098e = false;
        this.f9099f = false;
        this.f9100g = false;
        this.f9101h = false;
        this.f9102i = false;
        this.f9103j = false;
        this.f9104k = 3;
        this.f9105l = 1;
    }

    public boolean e() {
        return this.f9098e;
    }

    public boolean f() {
        return this.f9099f;
    }

    public String c() {
        return this.f9096c;
    }

    public String d() {
        return this.f9097d;
    }

    public String a() {
        return this.f9094a;
    }

    public String b() {
        return this.f9095b;
    }
}
