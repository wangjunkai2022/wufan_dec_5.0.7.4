package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.internal.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Channel.kt */
/* loaded from: classes.dex */
public interface b0<E> {

    /* compiled from: Channel.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ boolean a(b0 b0Var, Throwable th, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    th = null;
                }
                return b0Var.R(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        @ExperimentalCoroutinesApi
        public static /* synthetic */ void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull b0<? super E> b0Var, E e5) {
            Object x4 = b0Var.x(e5);
            if (n.m(x4)) {
                return true;
            }
            Throwable f5 = n.f(x4);
            if (f5 == null) {
                return false;
            }
            throw n0.p(f5);
        }
    }

    boolean R(@Nullable Throwable th);

    @Nullable
    Object S(E e5, @NotNull Continuation<? super Unit> continuation);

    boolean U();

    @NotNull
    kotlinx.coroutines.selects.e<E, b0<E>> o();

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e5);

    @ExperimentalCoroutinesApi
    void w(@NotNull Function1<? super Throwable, Unit> function1);

    @NotNull
    Object x(E e5);
}
