package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: NopCollector.kt */
/* loaded from: classes6.dex */
public final class k implements kotlinx.coroutines.flow.f<Object> {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final k f71012b = new k();

    private k() {
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
