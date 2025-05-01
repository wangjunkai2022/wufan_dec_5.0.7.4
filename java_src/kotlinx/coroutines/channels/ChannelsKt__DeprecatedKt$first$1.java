package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChannelsKt__DeprecatedKt$first$1<E> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f69793b;

    /* renamed from: c  reason: collision with root package name */
    Object f69794c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f69795d;

    /* renamed from: e  reason: collision with root package name */
    int f69796e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__DeprecatedKt$first$1(Continuation<? super ChannelsKt__DeprecatedKt$first$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object w4;
        this.f69795d = obj;
        this.f69796e |= Integer.MIN_VALUE;
        w4 = ChannelsKt__DeprecatedKt.w(null, this);
        return w4;
    }
}
