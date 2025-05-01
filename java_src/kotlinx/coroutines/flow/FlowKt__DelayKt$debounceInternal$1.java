package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Delay.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {Opcodes.OR_INT_LIT8, 355}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$debounceInternal$1<T> extends SuspendLambda implements Function3<q0, f<? super T>, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    Object f70252b;

    /* renamed from: c  reason: collision with root package name */
    Object f70253c;

    /* renamed from: d  reason: collision with root package name */
    int f70254d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Object f70255e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f70256f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Function1<T, Long> f70257g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ e<T> f70258h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1(Function1<? super T, Long> function1, e<? extends T> eVar, Continuation<? super FlowKt__DelayKt$debounceInternal$1> continuation) {
        super(3, continuation);
        this.f70257g = function1;
        this.f70258h = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    /* renamed from: e */
    public final Object invoke(@NotNull q0 q0Var, @NotNull f<? super T> fVar, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.f70257g, this.f70258h, continuation);
        flowKt__DelayKt$debounceInternal$1.f70255e = q0Var;
        flowKt__DelayKt$debounceInternal$1.f70256f = fVar;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:61|26|30|31|(3:33|(1:41)(1:37)|(2:39|40))|42|43|44|(1:46)|47|48|(1:50)|(1:52)(1:53)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0117, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
        r13.n0(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:49:0x00fc, B:51:0x0100, B:52:0x010a), top: B:64:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x012b -> B:11:0x0072). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
