package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Await.kt */
@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {54}, m = "joinAll", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AwaitKt$joinAll$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f69594b;

    /* renamed from: c  reason: collision with root package name */
    int f69595c;

    /* renamed from: d  reason: collision with root package name */
    int f69596d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f69597e;

    /* renamed from: f  reason: collision with root package name */
    int f69598f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AwaitKt$joinAll$1(Continuation<? super AwaitKt$joinAll$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f69597e = obj;
        this.f69598f |= Integer.MIN_VALUE;
        return AwaitKt.d(null, this);
    }
}
