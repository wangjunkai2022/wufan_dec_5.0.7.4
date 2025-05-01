package com.danikula.videocache;
/* loaded from: classes2.dex */
public class ProxyCacheException extends Exception {

    /* renamed from: b  reason: collision with root package name */
    private static final String f10050b = ". Version: 1.0";

    public ProxyCacheException(String str) {
        super(str + f10050b);
    }

    public ProxyCacheException(String str, Throwable th) {
        super(str + f10050b, th);
    }

    public ProxyCacheException(Throwable th) {
        super("No explanation error. Version: 1.0", th);
    }
}
