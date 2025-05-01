package kotlinx.coroutines.debug.internal;

import java.util.List;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DebugCoroutineInfo.kt */
@PublishedApi
/* loaded from: classes6.dex */
public final class c {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineContext f70094a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineStackFrame f70095b;

    /* renamed from: c  reason: collision with root package name */
    private final long f70096c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final List<StackTraceElement> f70097d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final String f70098e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private final Thread f70099f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private final CoroutineStackFrame f70100g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final List<StackTraceElement> f70101h;

    public c(@NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl, @NotNull CoroutineContext coroutineContext) {
        this.f70094a = coroutineContext;
        this.f70095b = debugCoroutineInfoImpl.c();
        this.f70096c = debugCoroutineInfoImpl.f70046b;
        this.f70097d = debugCoroutineInfoImpl.d();
        this.f70098e = debugCoroutineInfoImpl.f();
        this.f70099f = debugCoroutineInfoImpl.f70049e;
        this.f70100g = debugCoroutineInfoImpl.e();
        this.f70101h = debugCoroutineInfoImpl.g();
    }

    @Nullable
    public final CoroutineStackFrame a() {
        return this.f70095b;
    }

    @NotNull
    public final List<StackTraceElement> b() {
        return this.f70097d;
    }

    @Nullable
    public final CoroutineStackFrame c() {
        return this.f70100g;
    }

    @Nullable
    public final Thread d() {
        return this.f70099f;
    }

    public final long e() {
        return this.f70096c;
    }

    @NotNull
    public final String f() {
        return this.f70098e;
    }

    @JvmName(name = "lastObservedStackTrace")
    @NotNull
    public final List<StackTraceElement> g() {
        return this.f70101h;
    }

    @NotNull
    public final CoroutineContext getContext() {
        return this.f70094a;
    }
}
