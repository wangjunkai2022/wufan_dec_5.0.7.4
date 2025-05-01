package kotlinx.coroutines.flow.internal;

import kotlin.BuilderInference;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.k0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes6.dex */
public final class SafeCollector_commonKt {
    @JvmName(name = "checkContext")
    public static final void a(@NotNull final SafeCollector<?> safeCollector, @NotNull CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new Function2<Integer, CoroutineContext.Element, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @NotNull
            public final Integer a(int i4, @NotNull CoroutineContext.Element element) {
                CoroutineContext.Key<?> key = element.getKey();
                CoroutineContext.Element element2 = safeCollector.f70985c.get(key);
                if (key != z1.f71466g1) {
                    return Integer.valueOf(element != element2 ? Integer.MIN_VALUE : i4 + 1);
                }
                z1 z1Var = (z1) element2;
                z1 b5 = SafeCollector_commonKt.b((z1) element, z1Var);
                if (b5 == z1Var) {
                    if (z1Var != null) {
                        i4++;
                    }
                    return Integer.valueOf(i4);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b5 + ", expected child of " + z1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element element) {
                return a(num.intValue(), element);
            }
        })).intValue() == safeCollector.f70986d) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.f70985c + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    @Nullable
    public static final z1 b(@Nullable z1 z1Var, @Nullable z1 z1Var2) {
        while (z1Var != null) {
            if (z1Var == z1Var2 || !(z1Var instanceof k0)) {
                return z1Var;
            }
            z1Var = ((k0) z1Var).x1();
        }
        return null;
    }

    @PublishedApi
    @NotNull
    public static final <T> kotlinx.coroutines.flow.e<T> c(@BuilderInference @NotNull Function2<? super kotlinx.coroutines.flow.f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new SafeCollector_commonKt$unsafeFlow$1(function2);
    }
}
