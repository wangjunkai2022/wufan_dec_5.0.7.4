package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Actor.kt */
@ObsoleteCoroutinesApi
/* loaded from: classes6.dex */
public interface e<E> extends q0, ReceiveChannel<E> {

    /* compiled from: Actor.kt */
    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static <E> kotlinx.coroutines.selects.d<E> b(@NotNull e<E> eVar) {
            return ReceiveChannel.DefaultImpls.d(eVar);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E c(@NotNull e<E> eVar) {
            return (E) ReceiveChannel.DefaultImpls.h(eVar);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @LowPriorityInOverloadResolution
        @Nullable
        public static <E> Object d(@NotNull e<E> eVar, @NotNull Continuation<? super E> continuation) {
            return ReceiveChannel.DefaultImpls.i(eVar, continuation);
        }
    }

    @NotNull
    k<E> getChannel();
}
