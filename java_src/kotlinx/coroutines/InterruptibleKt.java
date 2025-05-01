package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Interruptible.kt */
/* loaded from: classes6.dex */
public final class InterruptibleKt {

    /* renamed from: a  reason: collision with root package name */
    private static final int f69613a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static final int f69614b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final int f69615c = 2;

    /* renamed from: d  reason: collision with root package name */
    private static final int f69616d = 3;

    @Nullable
    public static final <T> Object b(@NotNull CoroutineContext coroutineContext, @NotNull Function0<? extends T> function0, @NotNull Continuation<? super T> continuation) {
        return i.h(coroutineContext, new InterruptibleKt$runInterruptible$2(function0, null), continuation);
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Function0 function0, Continuation continuation, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return b(coroutineContext, function0, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(CoroutineContext coroutineContext, Function0<? extends T> function0) {
        try {
            g3 g3Var = new g3(c2.B(coroutineContext));
            g3Var.d();
            T invoke = function0.invoke();
            g3Var.a();
            return invoke;
        } catch (InterruptedException e5) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e5);
        }
    }
}
