package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
/* compiled from: ChannelFlow.kt */
@InternalCoroutinesApi
/* loaded from: classes6.dex */
public interface i<T> extends kotlinx.coroutines.flow.e<T> {

    /* compiled from: ChannelFlow.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.e a(i iVar, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow, int i5, Object obj) {
            if (obj == null) {
                if ((i5 & 1) != 0) {
                    coroutineContext = EmptyCoroutineContext.INSTANCE;
                }
                if ((i5 & 2) != 0) {
                    i4 = -3;
                }
                if ((i5 & 4) != 0) {
                    bufferOverflow = BufferOverflow.SUSPEND;
                }
                return iVar.c(coroutineContext, i4, bufferOverflow);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @NotNull
    kotlinx.coroutines.flow.e<T> c(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow);
}
