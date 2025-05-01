package kotlinx.coroutines.flow.internal;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.c2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SafeCollector.kt */
/* loaded from: classes6.dex */
public final class SafeCollector<T> extends ContinuationImpl implements kotlinx.coroutines.flow.f<T>, CoroutineStackFrame {
    @JvmField
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final kotlinx.coroutines.flow.f<T> f70984b;
    @JvmField
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final CoroutineContext f70985c;
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public final int f70986d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private CoroutineContext f70987e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Continuation<? super Unit> f70988f;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull CoroutineContext coroutineContext) {
        super(j.f71010b, EmptyCoroutineContext.INSTANCE);
        this.f70984b = fVar;
        this.f70985c = coroutineContext;
        this.f70986d = ((Number) coroutineContext.fold(0, new Function2<Integer, CoroutineContext.Element, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            @NotNull
            public final Integer a(int i4, @NotNull CoroutineContext.Element element) {
                return Integer.valueOf(i4 + 1);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element element) {
                return a(num.intValue(), element);
            }
        })).intValue();
    }

    private final void e(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t4) {
        if (coroutineContext2 instanceof f) {
            h((f) coroutineContext2, t4);
        }
        SafeCollector_commonKt.a(this, coroutineContext);
    }

    private final Object g(Continuation<? super Unit> continuation, T t4) {
        Object coroutine_suspended;
        CoroutineContext context = continuation.getContext();
        c2.z(context);
        CoroutineContext coroutineContext = this.f70987e;
        if (coroutineContext != context) {
            e(context, coroutineContext, t4);
            this.f70987e = context;
        }
        this.f70988f = continuation;
        Object invoke = SafeCollectorKt.a().invoke(this.f70984b, t4, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (!Intrinsics.areEqual(invoke, coroutine_suspended)) {
            this.f70988f = null;
        }
        return invoke;
    }

    private final void h(f fVar, Object obj) {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + fVar.f71008b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(trimIndent.toString());
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t4, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        try {
            Object g4 = g(continuation, t4);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (g4 == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g4 == coroutine_suspended2 ? g4 : Unit.INSTANCE;
        } catch (Throwable th) {
            this.f70987e = new f(th, continuation.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<? super Unit> continuation = this.f70988f;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f70987e;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        Throwable m38exceptionOrNullimpl = Result.m38exceptionOrNullimpl(obj);
        if (m38exceptionOrNullimpl != null) {
            this.f70987e = new f(m38exceptionOrNullimpl, getContext());
        }
        Continuation<? super Unit> continuation = this.f70988f;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return coroutine_suspended;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
