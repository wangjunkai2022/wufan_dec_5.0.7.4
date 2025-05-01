package com.sdk.a;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.kwad.sdk.collector.AppStatusRules;
import com.sdk.a.g;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static long f59928a = 60000;

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Boolean> f59929b;

    /* renamed from: c  reason: collision with root package name */
    public final com.sdk.b.c<String, String> f59930c;

    /* renamed from: d  reason: collision with root package name */
    public int f59931d;

    static {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = new ConcurrentHashMap<>(10);
        f59929b = concurrentHashMap;
        concurrentHashMap.put(g.a.GET.f59973l, Boolean.TRUE);
        new ConcurrentHashMap(10);
    }

    public d() {
        this.f59931d = AppStatusRules.UploadConfig.DEFAULT_FILE_MAX_SIZE;
        this.f59931d = AppStatusRules.UploadConfig.DEFAULT_FILE_MAX_SIZE;
        f59928a = 60000L;
        this.f59930c = new c(this, AppStatusRules.UploadConfig.DEFAULT_FILE_MAX_SIZE);
    }

    public String a(String str) {
        if (str != null) {
            return this.f59930c.a((com.sdk.b.c<String, String>) str);
        }
        return null;
    }

    public void a(String str, String str2, long j4) {
        if (str == null || str2 == null || j4 < 1) {
            return;
        }
        this.f59930c.a(str, str2, System.currentTimeMillis() + j4);
    }

    @SuppressLint({"DefaultLocale"})
    public boolean b(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str) || (bool = f59929b.get(str.toUpperCase())) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
