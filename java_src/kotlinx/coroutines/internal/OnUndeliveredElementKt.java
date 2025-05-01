package kotlinx.coroutines.internal;

import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: OnUndeliveredElement.kt */
/* loaded from: classes6.dex */
public final class OnUndeliveredElementKt {
    @NotNull
    public static final <E> Function1<Throwable, Unit> a(@NotNull final Function1<? super E, Unit> function1, final E e5, @NotNull final CoroutineContext coroutineContext) {
        return new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                OnUndeliveredElementKt.b(function1, e5, coroutineContext);
            }
        };
    }

    public static final <E> void b(@NotNull Function1<? super E, Unit> function1, E e5, @NotNull CoroutineContext coroutineContext) {
        UndeliveredElementException c5 = c(function1, e5, null);
        if (c5 == null) {
            return;
        }
        kotlinx.coroutines.n0.b(coroutineContext, c5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E> UndeliveredElementException c(@NotNull Function1<? super E, Unit> function1, E e5, @Nullable UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(e5);
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                ExceptionsKt__ExceptionsKt.addSuppressed(undeliveredElementException, th);
            } else {
                return new UndeliveredElementException(Intrinsics.stringPlus("Exception in undelivered element handler for ", e5), th);
            }
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(function1, obj, undeliveredElementException);
    }
}
