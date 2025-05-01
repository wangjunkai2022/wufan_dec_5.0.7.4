package kotlinx.coroutines;

import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.l0;
import org.jetbrains.annotations.NotNull;
/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes6.dex */
public final class n0 {

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractCoroutineContextElement implements l0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2<CoroutineContext, Throwable, Unit> f71217b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super CoroutineContext, ? super Throwable, Unit> function2, l0.b bVar) {
            super(bVar);
            this.f71217b = function2;
        }

        @Override // kotlinx.coroutines.l0
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
            this.f71217b.invoke(coroutineContext, th);
        }
    }

    @NotNull
    public static final l0 a(@NotNull Function2<? super CoroutineContext, ? super Throwable, Unit> function2) {
        return new a(function2, l0.f71199f1);
    }

    @InternalCoroutinesApi
    public static final void b(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        try {
            l0 l0Var = (l0) coroutineContext.get(l0.f71199f1);
            if (l0Var == null) {
                m0.a(coroutineContext, th);
            } else {
                l0Var.handleException(coroutineContext, th);
            }
        } catch (Throwable th2) {
            m0.a(coroutineContext, c(th, th2));
        }
    }

    @NotNull
    public static final Throwable c(@NotNull Throwable th, @NotNull Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ExceptionsKt__ExceptionsKt.addSuppressed(runtimeException, th);
        return runtimeException;
    }
}
