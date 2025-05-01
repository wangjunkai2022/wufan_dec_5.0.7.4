package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {487}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class ChannelsKt__DeprecatedKt$indexOf$1<E> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f69806b;

    /* renamed from: c  reason: collision with root package name */
    Object f69807c;

    /* renamed from: d  reason: collision with root package name */
    Object f69808d;

    /* renamed from: e  reason: collision with root package name */
    Object f69809e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f69810f;

    /* renamed from: g  reason: collision with root package name */
    int f69811g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__DeprecatedKt$indexOf$1(Continuation<? super ChannelsKt__DeprecatedKt$indexOf$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object A;
        this.f69810f = obj;
        this.f69811g |= Integer.MIN_VALUE;
        A = ChannelsKt__DeprecatedKt.A(null, null, this);
        return A;
    }
}
