package kotlinx.coroutines.channels;

import com.join.mgps.activity.QuarkInstallAppActivity_;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = QuarkInstallAppActivity_.f36990i, n = {QuarkInstallAppActivity_.f36990i, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChannelsKt__DeprecatedKt$count$1<E> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f69727b;

    /* renamed from: c  reason: collision with root package name */
    Object f69728c;

    /* renamed from: d  reason: collision with root package name */
    Object f69729d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f69730e;

    /* renamed from: f  reason: collision with root package name */
    int f69731f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__DeprecatedKt$count$1(Continuation<? super ChannelsKt__DeprecatedKt$count$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object d5;
        this.f69730e = obj;
        this.f69731f |= Integer.MIN_VALUE;
        d5 = ChannelsKt__DeprecatedKt.d(null, this);
        return d5;
    }
}
