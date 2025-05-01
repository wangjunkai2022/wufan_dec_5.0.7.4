package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Emitters.kt */
/* loaded from: classes6.dex */
public final class x implements f<Object> {
    @JvmField
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f71038b;

    public x(@NotNull Throwable th) {
        this.f71038b = th;
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        throw this.f71038b;
    }
}
