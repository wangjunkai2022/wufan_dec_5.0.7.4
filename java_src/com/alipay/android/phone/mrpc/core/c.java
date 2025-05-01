package com.alipay.android.phone.mrpc.core;
/* loaded from: classes2.dex */
public final class c extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    private static final long f4537e = -2875437994101380406L;

    /* renamed from: b  reason: collision with root package name */
    private String f4538b;

    /* renamed from: c  reason: collision with root package name */
    private int f4539c;

    /* renamed from: d  reason: collision with root package name */
    private String f4540d;

    public c(Integer num, String str) {
        super(b(num, str));
        this.f4539c = num.intValue();
        this.f4540d = str;
    }

    public c(Integer num, String str, Throwable th) {
        super(b(num, str), th);
        this.f4539c = num.intValue();
        this.f4540d = str;
    }

    private c(Integer num, Throwable th) {
        super(th);
        this.f4539c = num.intValue();
    }

    private c(String str) {
        super(str);
        this.f4539c = 0;
        this.f4540d = str;
    }

    private String a() {
        return this.f4538b;
    }

    private static String b(Integer num, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("RPCException: ");
        if (num != null) {
            sb.append("[");
            sb.append(num);
            sb.append("]");
        }
        sb.append(" : ");
        if (str != null) {
            sb.append(str);
        }
        return sb.toString();
    }

    private int d() {
        return this.f4539c;
    }

    private String e() {
        return this.f4540d;
    }

    public final void c(String str) {
        this.f4538b = str;
    }
}
