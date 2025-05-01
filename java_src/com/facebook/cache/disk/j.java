package com.facebook.cache.disk;

import com.facebook.cache.common.CacheEventListener;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.io.IOException;
import javax.annotation.Nullable;
/* compiled from: SettableCacheEvent.java */
/* loaded from: classes.dex */
public class j implements com.facebook.cache.common.b {

    /* renamed from: i  reason: collision with root package name */
    private static final Object f10811i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private static final int f10812j = 5;

    /* renamed from: k  reason: collision with root package name */
    private static j f10813k;

    /* renamed from: l  reason: collision with root package name */
    private static int f10814l;

    /* renamed from: a  reason: collision with root package name */
    private com.facebook.cache.common.c f10815a;

    /* renamed from: b  reason: collision with root package name */
    private String f10816b;

    /* renamed from: c  reason: collision with root package name */
    private long f10817c;

    /* renamed from: d  reason: collision with root package name */
    private long f10818d;

    /* renamed from: e  reason: collision with root package name */
    private long f10819e;

    /* renamed from: f  reason: collision with root package name */
    private IOException f10820f;

    /* renamed from: g  reason: collision with root package name */
    private CacheEventListener.EvictionReason f10821g;

    /* renamed from: h  reason: collision with root package name */
    private j f10822h;

    private j() {
    }

    @ReturnsOwnership
    public static j h() {
        synchronized (f10811i) {
            j jVar = f10813k;
            if (jVar != null) {
                f10813k = jVar.f10822h;
                jVar.f10822h = null;
                f10814l--;
                return jVar;
            }
            return new j();
        }
    }

    private void j() {
        this.f10815a = null;
        this.f10816b = null;
        this.f10817c = 0L;
        this.f10818d = 0L;
        this.f10819e = 0L;
        this.f10820f = null;
        this.f10821g = null;
    }

    @Override // com.facebook.cache.common.b
    @Nullable
    public IOException a() {
        return this.f10820f;
    }

    @Override // com.facebook.cache.common.b
    @Nullable
    public String b() {
        return this.f10816b;
    }

    @Override // com.facebook.cache.common.b
    public long c() {
        return this.f10819e;
    }

    @Override // com.facebook.cache.common.b
    public long d() {
        return this.f10818d;
    }

    @Override // com.facebook.cache.common.b
    @Nullable
    public com.facebook.cache.common.c e() {
        return this.f10815a;
    }

    @Override // com.facebook.cache.common.b
    @Nullable
    public CacheEventListener.EvictionReason f() {
        return this.f10821g;
    }

    @Override // com.facebook.cache.common.b
    public long g() {
        return this.f10817c;
    }

    public void i() {
        synchronized (f10811i) {
            if (f10814l < 5) {
                j();
                f10814l++;
                j jVar = f10813k;
                if (jVar != null) {
                    this.f10822h = jVar;
                }
                f10813k = this;
            }
        }
    }

    public j k(com.facebook.cache.common.c cVar) {
        this.f10815a = cVar;
        return this;
    }

    public j l(long j4) {
        this.f10818d = j4;
        return this;
    }

    public j m(long j4) {
        this.f10819e = j4;
        return this;
    }

    public j n(CacheEventListener.EvictionReason evictionReason) {
        this.f10821g = evictionReason;
        return this;
    }

    public j o(IOException iOException) {
        this.f10820f = iOException;
        return this;
    }

    public j p(long j4) {
        this.f10817c = j4;
        return this;
    }

    public j q(String str) {
        this.f10816b = str;
        return this;
    }
}
