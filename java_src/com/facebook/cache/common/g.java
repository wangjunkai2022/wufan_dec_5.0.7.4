package com.facebook.cache.common;

import com.facebook.cache.common.CacheErrorLogger;
import javax.annotation.Nullable;
/* compiled from: NoOpCacheErrorLogger.java */
/* loaded from: classes.dex */
public class g implements CacheErrorLogger {

    /* renamed from: a  reason: collision with root package name */
    private static g f10705a;

    private g() {
    }

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            if (f10705a == null) {
                f10705a = new g();
            }
            gVar = f10705a;
        }
        return gVar;
    }

    @Override // com.facebook.cache.common.CacheErrorLogger
    public void a(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, Class<?> cls, String str, @Nullable Throwable th) {
    }
}
