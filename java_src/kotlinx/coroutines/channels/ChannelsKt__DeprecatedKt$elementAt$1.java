package kotlinx.coroutines.channels;

import com.join.mgps.activity.QuarkInstallAppActivity_;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", "index", QuarkInstallAppActivity_.f36990i}, s = {"L$0", "I$0", "I$1"})
/* loaded from: classes6.dex */
public final class ChannelsKt__DeprecatedKt$elementAt$1<E> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    int f69753b;

    /* renamed from: c  reason: collision with root package name */
    int f69754c;

    /* renamed from: d  reason: collision with root package name */
    Object f69755d;

    /* renamed from: e  reason: collision with root package name */
    Object f69756e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f69757f;

    /* renamed from: g  reason: collision with root package name */
    int f69758g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__DeprecatedKt$elementAt$1(Continuation<? super ChannelsKt__DeprecatedKt$elementAt$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object l4;
        this.f69757f = obj;
        this.f69758g |= Integer.MIN_VALUE;
        l4 = ChannelsKt__DeprecatedKt.l(null, 0, this);
        return l4;
    }
}
