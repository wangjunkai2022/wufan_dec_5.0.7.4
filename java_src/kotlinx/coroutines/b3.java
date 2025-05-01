package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ThreadContextElement.kt */
/* loaded from: classes6.dex */
public interface b3<S> extends CoroutineContext.Element {

    /* compiled from: ThreadContextElement.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static <S, R> R a(@NotNull b3<S> b3Var, R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(b3Var, r4, function2);
        }

        @Nullable
        public static <S, E extends CoroutineContext.Element> E b(@NotNull b3<S> b3Var, @NotNull CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.get(b3Var, key);
        }

        @NotNull
        public static <S> CoroutineContext c(@NotNull b3<S> b3Var, @NotNull CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(b3Var, key);
        }

        @NotNull
        public static <S> CoroutineContext d(@NotNull b3<S> b3Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(b3Var, coroutineContext);
        }
    }

    void C(@NotNull CoroutineContext coroutineContext, S s4);

    S V(@NotNull CoroutineContext coroutineContext);
}
