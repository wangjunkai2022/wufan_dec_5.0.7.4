package kotlinx.coroutines.android;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.j2;
import kotlinx.coroutines.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes.dex */
public abstract class b extends j2 implements y0 {
    private b() {
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public g1 A(long j4, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return y0.a.b(this, j4, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.y0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object S(long j4, @NotNull Continuation<? super Unit> continuation) {
        return y0.a.a(this, j4, continuation);
    }

    @NotNull
    public abstract b a0();
}
