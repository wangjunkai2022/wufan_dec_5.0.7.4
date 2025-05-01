package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes6.dex */
public final class CoroutineContextKt {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private static final String f69602a = " @";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z4) {
        boolean c5 = c(coroutineContext);
        boolean c6 = c(coroutineContext2);
        if (!c5 && !c6) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final CoroutineContext invoke(@NotNull CoroutineContext coroutineContext4, @NotNull CoroutineContext.Element element) {
                if (element instanceof j0) {
                    CoroutineContext.Element element2 = objectRef.element.get(element.getKey());
                    if (element2 == null) {
                        j0 j0Var = (j0) element;
                        if (z4) {
                            j0Var = j0Var.B();
                        }
                        return coroutineContext4.plus(j0Var);
                    }
                    Ref.ObjectRef<CoroutineContext> objectRef2 = objectRef;
                    objectRef2.element = objectRef2.element.minusKey(element.getKey());
                    return coroutineContext4.plus(((j0) element).h(element2));
                }
                return coroutineContext4.plus(element);
            }
        });
        if (c6) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, new Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final CoroutineContext invoke(@NotNull CoroutineContext coroutineContext4, @NotNull CoroutineContext.Element element) {
                    if (element instanceof j0) {
                        return coroutineContext4.plus(((j0) element).B());
                    }
                    return coroutineContext4.plus(element);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    @Nullable
    public static final String b(@NotNull CoroutineContext coroutineContext) {
        o0 o0Var;
        String name;
        if (s0.d() && (o0Var = (o0) coroutineContext.get(o0.f71218c)) != null) {
            p0 p0Var = (p0) coroutineContext.get(p0.f71228c);
            String str = "coroutine";
            if (p0Var != null && (name = p0Var.getName()) != null) {
                str = name;
            }
            return str + '#' + o0Var.b0();
        }
        return null;
    }

    private static final boolean c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2<Boolean, CoroutineContext.Element, Boolean>() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            @NotNull
            public final Boolean a(boolean z4, @NotNull CoroutineContext.Element element) {
                return Boolean.valueOf(z4 || (element instanceof j0));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.Element element) {
                return a(bool.booleanValue(), element);
            }
        })).booleanValue();
    }

    @InternalCoroutinesApi
    @NotNull
    public static final CoroutineContext d(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
        return !c(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : a(coroutineContext, coroutineContext2, false);
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final CoroutineContext e(@NotNull q0 q0Var, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext a5 = a(q0Var.getCoroutineContext(), coroutineContext, true);
        CoroutineContext plus = s0.d() ? a5.plus(new o0(s0.c().incrementAndGet())) : a5;
        return (a5 == d1.a() || a5.get(ContinuationInterceptor.Key) != null) ? plus : plus.plus(d1.a());
    }

    @Nullable
    public static final j3<?> f(@NotNull CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof z0) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof j3) {
                return (j3) coroutineStackFrame;
            }
        }
        return null;
    }

    @Nullable
    public static final j3<?> g(@NotNull Continuation<?> continuation, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (continuation instanceof CoroutineStackFrame) {
            if (coroutineContext.get(k3.f71197b) != null) {
                j3<?> f5 = f((CoroutineStackFrame) continuation);
                if (f5 != null) {
                    f5.z1(coroutineContext, obj);
                }
                return f5;
            }
            return null;
        }
        return null;
    }

    public static final <T> T h(@NotNull Continuation<?> continuation, @Nullable Object obj, @NotNull Function0<? extends T> function0) {
        CoroutineContext context = continuation.getContext();
        Object c5 = ThreadContextKt.c(context, obj);
        j3<?> g4 = c5 != ThreadContextKt.f71089a ? g(continuation, context, c5) : null;
        try {
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            if (g4 == null || g4.y1()) {
                ThreadContextKt.a(context, c5);
            }
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <T> T i(@NotNull CoroutineContext coroutineContext, @Nullable Object obj, @NotNull Function0<? extends T> function0) {
        Object c5 = ThreadContextKt.c(coroutineContext, obj);
        try {
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            ThreadContextKt.a(coroutineContext, c5);
            InlineMarker.finallyEnd(1);
        }
    }
}
