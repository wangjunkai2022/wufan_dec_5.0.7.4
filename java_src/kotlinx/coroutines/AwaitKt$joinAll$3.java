package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Await.kt */
@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AwaitKt$joinAll$3 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f69599b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f69600c;

    /* renamed from: d  reason: collision with root package name */
    int f69601d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AwaitKt$joinAll$3(Continuation<? super AwaitKt$joinAll$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f69600c = obj;
        this.f69601d |= Integer.MIN_VALUE;
        return AwaitKt.c(null, this);
    }
}
