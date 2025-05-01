package kotlinx.coroutines.sync;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Semaphore.kt */
@DebugMetadata(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {85}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
public final class SemaphoreKt$withPermit$1<T> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f71414b;

    /* renamed from: c  reason: collision with root package name */
    Object f71415c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f71416d;

    /* renamed from: e  reason: collision with root package name */
    int f71417e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SemaphoreKt$withPermit$1(Continuation<? super SemaphoreKt$withPermit$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f71416d = obj;
        this.f71417e |= Integer.MIN_VALUE;
        return SemaphoreKt.q(null, null, this);
    }
}
