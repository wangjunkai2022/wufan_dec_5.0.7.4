package kotlinx.coroutines.channels;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {TypedValues.CycleType.TYPE_EASING, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", SimulatorExitPlayActivity_.Q}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
public final class ChannelsKt__DeprecatedKt$maxWith$1<E> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f69844b;

    /* renamed from: c  reason: collision with root package name */
    Object f69845c;

    /* renamed from: d  reason: collision with root package name */
    Object f69846d;

    /* renamed from: e  reason: collision with root package name */
    Object f69847e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f69848f;

    /* renamed from: g  reason: collision with root package name */
    int f69849g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__DeprecatedKt$maxWith$1(Continuation<? super ChannelsKt__DeprecatedKt$maxWith$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object M;
        this.f69848f = obj;
        this.f69849g |= Integer.MIN_VALUE;
        M = ChannelsKt__DeprecatedKt.M(null, null, this);
        return M;
    }
}
