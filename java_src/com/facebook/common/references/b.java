package com.facebook.common.references;

import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* compiled from: OOMSoftReference.java */
/* loaded from: classes.dex */
public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    SoftReference<T> f10896a = null;

    /* renamed from: b  reason: collision with root package name */
    SoftReference<T> f10897b = null;

    /* renamed from: c  reason: collision with root package name */
    SoftReference<T> f10898c = null;

    public void a() {
        SoftReference<T> softReference = this.f10896a;
        if (softReference != null) {
            softReference.clear();
            this.f10896a = null;
        }
        SoftReference<T> softReference2 = this.f10897b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f10897b = null;
        }
        SoftReference<T> softReference3 = this.f10898c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f10898c = null;
        }
    }

    @Nullable
    public T b() {
        SoftReference<T> softReference = this.f10896a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(@Nonnull T t4) {
        this.f10896a = new SoftReference<>(t4);
        this.f10897b = new SoftReference<>(t4);
        this.f10898c = new SoftReference<>(t4);
    }
}
