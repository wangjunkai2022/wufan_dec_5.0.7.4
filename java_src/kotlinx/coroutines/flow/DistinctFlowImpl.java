package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Distinct.kt */
/* loaded from: classes6.dex */
final class DistinctFlowImpl<T> implements e<T> {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final e<T> f70138b;
    @JvmField
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Function1<T, Object> f70139c;
    @JvmField
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final Function2<Object, Object, Boolean> f70140d;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(@NotNull e<? extends T> eVar, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.f70138b = eVar;
        this.f70139c = function1;
        this.f70140d = function2;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object a(@NotNull f<? super T> fVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) kotlinx.coroutines.flow.internal.l.f71013a;
        Object a5 = this.f70138b.a(new DistinctFlowImpl$collect$2(this, objectRef, fVar), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }
}
