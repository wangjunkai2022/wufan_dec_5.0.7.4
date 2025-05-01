package kotlinx.coroutines.flow;

import io.netty.handler.codec.rtsp.RtspHeaders;
import java.util.Collection;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collection.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {RtspHeaders.Values.DESTINATION}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70234b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f70235c;

    /* renamed from: d  reason: collision with root package name */
    int f70236d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__CollectionKt$toCollection$1(Continuation<? super FlowKt__CollectionKt$toCollection$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70235c = obj;
        this.f70236d |= Integer.MIN_VALUE;
        return g.V1(null, null, this);
    }
}
