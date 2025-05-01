package com.bytedance.pangle.download;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    private static volatile b f8311e;

    /* renamed from: a  reason: collision with root package name */
    final Map<String, Long> f8312a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f8313b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Runnable> f8314c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    final Map<String, Runnable> f8315d = new ConcurrentHashMap();

    private b() {
    }

    public static b a() {
        if (f8311e == null) {
            synchronized (b.class) {
                if (f8311e == null) {
                    f8311e = new b();
                }
            }
        }
        return f8311e;
    }
}
