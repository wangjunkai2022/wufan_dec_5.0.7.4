package com.facebook.imagepipeline.memory;

import androidx.annotation.Nullable;
import com.facebook.common.internal.VisibleForTesting;
import java.util.HashSet;
import java.util.Set;
/* compiled from: LruBucketsPoolBackend.java */
/* loaded from: classes2.dex */
public abstract class s<T> implements b0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<T> f12066a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final g<T> f12067b = new g<>();

    private T b(@Nullable T t4) {
        if (t4 != null) {
            synchronized (this) {
                this.f12066a.remove(t4);
            }
        }
        return t4;
    }

    @VisibleForTesting
    int c() {
        return this.f12067b.g();
    }

    @Override // com.facebook.imagepipeline.memory.b0
    @Nullable
    public T get(int i4) {
        return b(this.f12067b.a(i4));
    }

    @Override // com.facebook.imagepipeline.memory.b0
    @Nullable
    public T pop() {
        return b(this.f12067b.f());
    }

    @Override // com.facebook.imagepipeline.memory.b0
    public void put(T t4) {
        boolean add;
        synchronized (this) {
            add = this.f12066a.add(t4);
        }
        if (add) {
            this.f12067b.e(a(t4), t4);
        }
    }
}
