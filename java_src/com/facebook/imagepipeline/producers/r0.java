package com.facebook.imagepipeline.producers;

import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: StatefulProducerRunnable.java */
/* loaded from: classes.dex */
public abstract class r0<T> extends com.facebook.common.executors.h<T> {

    /* renamed from: h  reason: collision with root package name */
    private final Consumer<T> f12365h;

    /* renamed from: i  reason: collision with root package name */
    private final m0 f12366i;

    /* renamed from: j  reason: collision with root package name */
    private final String f12367j;

    /* renamed from: k  reason: collision with root package name */
    private final String f12368k;

    public r0(Consumer<T> consumer, m0 m0Var, String str, String str2) {
        this.f12365h = consumer;
        this.f12366i = m0Var;
        this.f12367j = str;
        this.f12368k = str2;
        m0Var.b(str2, str);
    }

    @Override // com.facebook.common.executors.h
    protected abstract void b(T t4);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.common.executors.h
    public void d() {
        m0 m0Var = this.f12366i;
        String str = this.f12368k;
        m0Var.g(str, this.f12367j, m0Var.d(str) ? g() : null);
        this.f12365h.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.common.executors.h
    public void e(Exception exc) {
        m0 m0Var = this.f12366i;
        String str = this.f12368k;
        m0Var.f(str, this.f12367j, exc, m0Var.d(str) ? h(exc) : null);
        this.f12365h.onFailure(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.common.executors.h
    public void f(T t4) {
        m0 m0Var = this.f12366i;
        String str = this.f12368k;
        m0Var.e(str, this.f12367j, m0Var.d(str) ? i(t4) : null);
        this.f12365h.b(t4, 1);
    }

    @Nullable
    protected Map<String, String> g() {
        return null;
    }

    @Nullable
    protected Map<String, String> h(Exception exc) {
        return null;
    }

    @Nullable
    protected Map<String, String> i(T t4) {
        return null;
    }
}
