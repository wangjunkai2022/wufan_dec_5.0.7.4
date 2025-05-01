package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlinx.coroutines.channels.n;
import org.jetbrains.annotations.NotNull;
/* compiled from: Channels.kt */
/* loaded from: classes.dex */
final /* synthetic */ class ChannelsKt__ChannelsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void a(@NotNull b0<? super E> b0Var, E e5) {
        if (n.m(b0Var.x(e5))) {
            return;
        }
        kotlinx.coroutines.j.b(null, new ChannelsKt__ChannelsKt$sendBlocking$1(b0Var, e5, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> Object b(@NotNull b0<? super E> b0Var, E e5) {
        Object b5;
        Object x4 = b0Var.x(e5);
        if (x4 instanceof n.c) {
            b5 = kotlinx.coroutines.j.b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(b0Var, e5, null), 1, null);
            return ((n) b5).o();
        }
        Unit unit = (Unit) x4;
        return n.f69990b.c(Unit.INSTANCE);
    }
}
