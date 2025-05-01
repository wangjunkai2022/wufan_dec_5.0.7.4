package kotlinx.coroutines.debug.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DebugCoroutineInfoImpl.kt */
/* loaded from: classes6.dex */
public final class DebugCoroutineInfoImpl {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final i f70045a;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public final long f70046b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<CoroutineContext> f70047c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f70048d = d.f70102a;
    @JvmField
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public Thread f70049e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<CoroutineStackFrame> f70050f;

    public DebugCoroutineInfoImpl(@Nullable CoroutineContext coroutineContext, @Nullable i iVar, long j4) {
        this.f70045a = iVar;
        this.f70046b = j4;
        this.f70047c = new WeakReference<>(coroutineContext);
    }

    private final List<StackTraceElement> b() {
        Sequence sequence;
        List<StackTraceElement> list;
        List<StackTraceElement> emptyList;
        i iVar = this.f70045a;
        if (iVar == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        sequence = SequencesKt__SequenceBuilderKt.sequence(new DebugCoroutineInfoImpl$creationStackTrace$1(this, iVar, null));
        list = SequencesKt___SequencesKt.toList(sequence);
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004a -> B:26:0x0062). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005c -> B:25:0x005f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.CoroutineStackFrame r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1) r0
            int r1 = r0.f70060g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70060g = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f70058e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70060g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f70057d
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r6
            java.lang.Object r7 = r0.f70056c
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            java.lang.Object r2 = r0.f70055b
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5f
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.ResultKt.throwOnFailure(r8)
            r2 = r5
        L41:
            if (r7 != 0) goto L46
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L46:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 != 0) goto L4d
            goto L62
        L4d:
            r0.f70055b = r2
            r0.f70056c = r6
            r0.f70057d = r7
            r0.f70060g = r3
            java.lang.Object r8 = r6.yield(r8, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r4 = r7
            r7 = r6
            r6 = r4
        L5f:
            r4 = r7
            r7 = r6
            r6 = r4
        L62:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = r7.getCallerFrame()
            if (r7 == 0) goto L69
            goto L41
        L69:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.j(kotlin.sequences.SequenceScope, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final i c() {
        return this.f70045a;
    }

    @NotNull
    public final List<StackTraceElement> d() {
        return b();
    }

    @Nullable
    public final CoroutineStackFrame e() {
        WeakReference<CoroutineStackFrame> weakReference = this.f70050f;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @NotNull
    public final String f() {
        return this.f70048d;
    }

    @NotNull
    public final List<StackTraceElement> g() {
        List<StackTraceElement> emptyList;
        CoroutineStackFrame e5 = e();
        if (e5 == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList();
        while (e5 != null) {
            StackTraceElement stackTraceElement = e5.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            e5 = e5.getCallerFrame();
        }
        return arrayList;
    }

    @Nullable
    public final CoroutineContext getContext() {
        return this.f70047c.get();
    }

    public final void h(@Nullable CoroutineStackFrame coroutineStackFrame) {
        this.f70050f = coroutineStackFrame == null ? null : new WeakReference<>(coroutineStackFrame);
    }

    public final void i(@NotNull String str, @NotNull Continuation<?> continuation) {
        if (Intrinsics.areEqual(this.f70048d, str) && Intrinsics.areEqual(str, d.f70104c) && e() != null) {
            return;
        }
        this.f70048d = str;
        h(continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null);
        this.f70049e = Intrinsics.areEqual(str, d.f70103b) ? Thread.currentThread() : null;
    }

    @NotNull
    public String toString() {
        return "DebugCoroutineInfo(state=" + f() + ",context=" + getContext() + ')';
    }
}
