package com.bytedance.pangle.log;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f8451a;

    /* renamed from: b  reason: collision with root package name */
    private String f8452b;

    /* renamed from: c  reason: collision with root package name */
    private String f8453c;

    /* renamed from: d  reason: collision with root package name */
    private long f8454d;

    /* renamed from: e  reason: collision with root package name */
    private long f8455e;

    private a(String str, String str2, String str3) {
        this.f8451a = str;
        this.f8452b = str2;
        this.f8453c = str3;
        long currentTimeMillis = System.currentTimeMillis();
        this.f8455e = currentTimeMillis;
        this.f8454d = currentTimeMillis;
        String str4 = this.f8451a;
        ZeusLogger.i(str4, this.f8452b + String.format(" watcher[%s]-start", str3));
    }

    public static a a(String str, String str2, String str3) {
        return new a(str, str2, str3);
    }

    public final long a(String str) {
        long currentTimeMillis = System.currentTimeMillis() - this.f8455e;
        long currentTimeMillis2 = System.currentTimeMillis() - this.f8454d;
        String str2 = this.f8451a;
        ZeusLogger.i(str2, this.f8452b + String.format(" watcher[%s]-%s cost=%s, total=%s", this.f8453c, str, Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis2)));
        return currentTimeMillis2;
    }

    public final long a() {
        return System.currentTimeMillis() - this.f8454d;
    }
}
