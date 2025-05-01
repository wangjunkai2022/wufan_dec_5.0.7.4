package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {487}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
public final class ChannelsKt__DeprecatedKt$lastIndexOf$1<E> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f69817b;

    /* renamed from: c  reason: collision with root package name */
    Object f69818c;

    /* renamed from: d  reason: collision with root package name */
    Object f69819d;

    /* renamed from: e  reason: collision with root package name */
    Object f69820e;

    /* renamed from: f  reason: collision with root package name */
    Object f69821f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f69822g;

    /* renamed from: h  reason: collision with root package name */
    int f69823h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__DeprecatedKt$lastIndexOf$1(Continuation<? super ChannelsKt__DeprecatedKt$lastIndexOf$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object C;
        this.f69822g = obj;
        this.f69823h |= Integer.MIN_VALUE;
        C = ChannelsKt__DeprecatedKt.C(null, null, this);
        return C;
    }
}
