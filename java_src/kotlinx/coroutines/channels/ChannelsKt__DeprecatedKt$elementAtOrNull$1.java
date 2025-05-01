package kotlinx.coroutines.channels;

import com.join.mgps.activity.QuarkInstallAppActivity_;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {53}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", QuarkInstallAppActivity_.f36990i}, s = {"L$0", "I$0", "I$1"})
/* loaded from: classes6.dex */
public final class ChannelsKt__DeprecatedKt$elementAtOrNull$1<E> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    int f69759b;

    /* renamed from: c  reason: collision with root package name */
    int f69760c;

    /* renamed from: d  reason: collision with root package name */
    Object f69761d;

    /* renamed from: e  reason: collision with root package name */
    Object f69762e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f69763f;

    /* renamed from: g  reason: collision with root package name */
    int f69764g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__DeprecatedKt$elementAtOrNull$1(Continuation<? super ChannelsKt__DeprecatedKt$elementAtOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m4;
        this.f69763f = obj;
        this.f69764g |= Integer.MIN_VALUE;
        m4 = ChannelsKt__DeprecatedKt.m(null, 0, this);
        return m4;
    }
}
