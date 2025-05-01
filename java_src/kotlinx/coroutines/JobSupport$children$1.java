package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JobSupport.kt */
@DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {952, 954}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class JobSupport$children$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super z1>, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    Object f69628b;

    /* renamed from: c  reason: collision with root package name */
    Object f69629c;

    /* renamed from: d  reason: collision with root package name */
    int f69630d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Object f69631e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ JobSupport f69632f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, Continuation<? super JobSupport$children$1> continuation) {
        super(2, continuation);
        this.f69632f = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.f69632f, continuation);
        jobSupport$children$1.f69631e = obj;
        return jobSupport$children$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super z1> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((JobSupport$children$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0069 -> B:28:0x007f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:28:0x007f). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f69630d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r7.f69629c
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r7.f69628b
            kotlinx.coroutines.internal.v r3 = (kotlinx.coroutines.internal.v) r3
            java.lang.Object r4 = r7.f69631e
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L7f
        L1f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L27:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L84
        L2b:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.f69631e
            kotlin.sequences.SequenceScope r8 = (kotlin.sequences.SequenceScope) r8
            kotlinx.coroutines.JobSupport r1 = r7.f69632f
            java.lang.Object r1 = r1.G0()
            boolean r4 = r1 instanceof kotlinx.coroutines.w
            if (r4 == 0) goto L49
            kotlinx.coroutines.w r1 = (kotlinx.coroutines.w) r1
            kotlinx.coroutines.x r1 = r1.f71458f
            r7.f69630d = r3
            java.lang.Object r8 = r8.yield(r1, r7)
            if (r8 != r0) goto L84
            return r0
        L49:
            boolean r3 = r1 instanceof kotlinx.coroutines.u1
            if (r3 == 0) goto L84
            kotlinx.coroutines.u1 r1 = (kotlinx.coroutines.u1) r1
            kotlinx.coroutines.k2 r1 = r1.f()
            if (r1 != 0) goto L56
            goto L84
        L56:
            java.lang.Object r3 = r1.L()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L61:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r5 != 0) goto L84
            boolean r5 = r1 instanceof kotlinx.coroutines.w
            if (r5 == 0) goto L7f
            r5 = r1
            kotlinx.coroutines.w r5 = (kotlinx.coroutines.w) r5
            kotlinx.coroutines.x r5 = r5.f71458f
            r8.f69631e = r4
            r8.f69628b = r3
            r8.f69629c = r1
            r8.f69630d = r2
            java.lang.Object r5 = r4.yield(r5, r8)
            if (r5 != r0) goto L7f
            return r0
        L7f:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.M()
            goto L61
        L84:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
