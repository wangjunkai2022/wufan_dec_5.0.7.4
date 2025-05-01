package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
/* compiled from: Produce.kt */
/* loaded from: classes6.dex */
public interface w<E> extends q0, b0<E> {

    /* compiled from: Produce.kt */
    /* loaded from: classes.dex */
    public static final class a {
        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@NotNull w<? super E> wVar, E e5) {
            return b0.a.c(wVar, e5);
        }
    }

    @NotNull
    b0<E> getChannel();
}
