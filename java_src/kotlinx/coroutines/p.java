package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CancellableContinuation.kt */
/* loaded from: classes6.dex */
public interface p<T> extends Continuation<T> {

    /* compiled from: CancellableContinuation.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static /* synthetic */ boolean a(p pVar, Throwable th, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    th = null;
                }
                return pVar.a(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ Object b(p pVar, Object obj, Object obj2, int i4, Object obj3) {
            if (obj3 == null) {
                if ((i4 & 2) != 0) {
                    obj2 = null;
                }
                return pVar.c(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    @InternalCoroutinesApi
    @Nullable
    Object N(T t4, @Nullable Object obj, @Nullable Function1<? super Throwable, Unit> function1);

    @ExperimentalCoroutinesApi
    void O(@NotNull CoroutineDispatcher coroutineDispatcher, T t4);

    @InternalCoroutinesApi
    void P();

    @InternalCoroutinesApi
    void Y(@NotNull Object obj);

    boolean a(@Nullable Throwable th);

    @InternalCoroutinesApi
    @Nullable
    Object c(T t4, @Nullable Object obj);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    void k(@NotNull Function1<? super Throwable, Unit> function1);

    @InternalCoroutinesApi
    @Nullable
    Object m(@NotNull Throwable th);

    @ExperimentalCoroutinesApi
    void n(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th);

    @ExperimentalCoroutinesApi
    void s(T t4, @Nullable Function1<? super Throwable, Unit> function1);
}
