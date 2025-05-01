package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
/* compiled from: CoroutineScope.kt */
@DelicateCoroutinesApi
/* loaded from: classes6.dex */
public final class s1 implements q0 {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final s1 f71252b = new s1();

    private s1() {
    }

    @Override // kotlinx.coroutines.q0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}
