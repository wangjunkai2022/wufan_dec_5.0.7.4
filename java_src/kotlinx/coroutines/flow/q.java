package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
/* compiled from: Share.kt */
/* loaded from: classes6.dex */
final class q<T> {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final e<T> f71027a;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public final int f71028b;
    @JvmField
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final BufferOverflow f71029c;
    @JvmField
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineContext f71030d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull e<? extends T> eVar, int i4, @NotNull BufferOverflow bufferOverflow, @NotNull CoroutineContext coroutineContext) {
        this.f71027a = eVar;
        this.f71028b = i4;
        this.f71029c = bufferOverflow;
        this.f71030d = coroutineContext;
    }
}
