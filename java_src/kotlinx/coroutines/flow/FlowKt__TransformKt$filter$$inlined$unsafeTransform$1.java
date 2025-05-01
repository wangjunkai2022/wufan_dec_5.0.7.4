package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes6.dex */
public final class FlowKt__TransformKt$filter$$inlined$unsafeTransform$1<T> implements e<T> {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f70580b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Function2 f70581c;

    /* compiled from: Emitters.kt */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2<T> implements f, SuspendFunction {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f70585b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f70586c;

        /* compiled from: Emitters.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8}, m = "emit", n = {"value", "$this$filter_u24lambda_u2d0"}, s = {"L$0", "L$1"})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f70587b;

            /* renamed from: c  reason: collision with root package name */
            int f70588c;

            /* renamed from: e  reason: collision with root package name */
            Object f70590e;

            /* renamed from: f  reason: collision with root package name */
            Object f70591f;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f70587b = obj;
                this.f70588c |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(f fVar, Function2 function2) {
            this.f70585b = fVar;
            this.f70586c = function2;
        }

        @Nullable
        public final Object a(Object obj, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new AnonymousClass1(continuation);
            InlineMarker.mark(5);
            f fVar = this.f70585b;
            if (((Boolean) this.f70586c.invoke(obj, continuation)).booleanValue()) {
                InlineMarker.mark(0);
                fVar.emit(obj, continuation);
                InlineMarker.mark(1);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
        @Override // kotlinx.coroutines.flow.f
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.f70588c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f70588c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f70587b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f70588c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.throwOnFailure(r8)
                goto L6c
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f70591f
                kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.f) r7
                java.lang.Object r2 = r0.f70590e
                kotlin.ResultKt.throwOnFailure(r8)
                goto L56
            L3e:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlinx.coroutines.flow.f r8 = r6.f70585b
                kotlin.jvm.functions.Function2 r2 = r6.f70586c
                r0.f70590e = r7
                r0.f70591f = r8
                r0.f70588c = r4
                java.lang.Object r2 = r2.invoke(r7, r0)
                if (r2 != r1) goto L52
                return r1
            L52:
                r5 = r2
                r2 = r7
                r7 = r8
                r8 = r5
            L56:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L6c
                r8 = 0
                r0.f70590e = r8
                r0.f70591f = r8
                r0.f70588c = r3
                java.lang.Object r7 = r7.emit(r2, r0)
                if (r7 != r1) goto L6c
                return r1
            L6c:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(e eVar, Function2 function2) {
        this.f70580b = eVar;
        this.f70581c = function2;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object a(@NotNull f fVar, @NotNull Continuation continuation) {
        Object coroutine_suspended;
        Object a5 = this.f70580b.a(new AnonymousClass2(fVar, this.f70581c), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }

    @Nullable
    public Object g(@NotNull f fVar, @NotNull Continuation continuation) {
        InlineMarker.mark(4);
        new ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.1

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f70582b;

            /* renamed from: c  reason: collision with root package name */
            int f70583c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f70582b = obj;
                this.f70583c |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.this.a(null, this);
            }
        };
        InlineMarker.mark(5);
        e eVar = this.f70580b;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fVar, this.f70581c);
        InlineMarker.mark(0);
        eVar.a(anonymousClass2, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
