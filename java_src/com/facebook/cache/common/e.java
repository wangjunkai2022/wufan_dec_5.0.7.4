package com.facebook.cache.common;

import android.net.Uri;
import javax.annotation.Nullable;
/* compiled from: DebuggingCacheKey.java */
/* loaded from: classes.dex */
public class e extends i {

    /* renamed from: b  reason: collision with root package name */
    private final Object f10702b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f10703c;

    public e(String str, @Nullable Object obj, Uri uri) {
        super(str);
        this.f10702b = obj;
        this.f10703c = uri;
    }

    @Nullable
    public Object c() {
        return this.f10702b;
    }

    public Uri d() {
        return this.f10703c;
    }
}
