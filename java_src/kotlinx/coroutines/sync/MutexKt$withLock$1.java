package kotlinx.coroutines.sync;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Mutex.kt */
@DebugMetadata(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {112}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
public final class MutexKt$withLock$1<T> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f71395b;

    /* renamed from: c  reason: collision with root package name */
    Object f71396c;

    /* renamed from: d  reason: collision with root package name */
    Object f71397d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f71398e;

    /* renamed from: f  reason: collision with root package name */
    int f71399f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutexKt$withLock$1(Continuation<? super MutexKt$withLock$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f71398e = obj;
        this.f71399f |= Integer.MIN_VALUE;
        return MutexKt.o(null, null, null, this);
    }
}
