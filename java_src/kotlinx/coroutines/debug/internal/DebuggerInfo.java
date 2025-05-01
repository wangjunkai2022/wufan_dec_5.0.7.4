package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DebuggerInfo.kt */
@PublishedApi
/* loaded from: classes6.dex */
public final class DebuggerInfo implements Serializable {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final Long f70079b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final String f70080c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final String f70081d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final String f70082e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private final String f70083f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private final String f70084g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final List<StackTraceElement> f70085h;

    /* renamed from: i  reason: collision with root package name */
    private final long f70086i;

    public DebuggerInfo(@NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl, @NotNull CoroutineContext coroutineContext) {
        Thread.State state;
        o0 o0Var = (o0) coroutineContext.get(o0.f71218c);
        this.f70079b = o0Var == null ? null : Long.valueOf(o0Var.b0());
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key);
        this.f70080c = continuationInterceptor == null ? null : continuationInterceptor.toString();
        p0 p0Var = (p0) coroutineContext.get(p0.f71228c);
        this.f70081d = p0Var == null ? null : p0Var.getName();
        this.f70082e = debugCoroutineInfoImpl.f();
        Thread thread = debugCoroutineInfoImpl.f70049e;
        this.f70083f = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = debugCoroutineInfoImpl.f70049e;
        this.f70084g = thread2 != null ? thread2.getName() : null;
        this.f70085h = debugCoroutineInfoImpl.g();
        this.f70086i = debugCoroutineInfoImpl.f70046b;
    }

    @Nullable
    public final Long a() {
        return this.f70079b;
    }

    @Nullable
    public final String b() {
        return this.f70080c;
    }

    @NotNull
    public final List<StackTraceElement> c() {
        return this.f70085h;
    }

    @Nullable
    public final String d() {
        return this.f70084g;
    }

    @Nullable
    public final String e() {
        return this.f70083f;
    }

    public final long f() {
        return this.f70086i;
    }

    @NotNull
    public final String g() {
        return this.f70082e;
    }

    @Nullable
    public final String getName() {
        return this.f70081d;
    }
}
