package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Channel.kt */
/* loaded from: classes.dex */
public final class m {
    @NotNull
    public static final <E> k<E> b(int i4, @NotNull BufferOverflow bufferOverflow, @Nullable Function1<? super E, Unit> function1) {
        if (i4 == -2) {
            return new g(bufferOverflow == BufferOverflow.SUSPEND ? k.f69974h1.a() : 1, bufferOverflow, function1);
        } else if (i4 == -1) {
            if ((bufferOverflow != BufferOverflow.SUSPEND ? 0 : 1) != 0) {
                return new r(function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i4 == 0) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                return new z(function1);
            }
            return new g(1, bufferOverflow, function1);
        } else if (i4 != Integer.MAX_VALUE) {
            if (i4 == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) {
                return new r(function1);
            }
            return new g(i4, bufferOverflow, function1);
        } else {
            return new u(function1);
        }
    }

    public static /* synthetic */ k c(int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return d(i4, null, null, 6, null);
    }

    public static /* synthetic */ k d(int i4, BufferOverflow bufferOverflow, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i5 & 4) != 0) {
            function1 = null;
        }
        return b(i4, bufferOverflow, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T e(@NotNull Object obj, @NotNull Function1<? super Throwable, ? extends T> function1) {
        return obj instanceof n.c ? function1.invoke(n.f(obj)) : obj;
    }

    @NotNull
    public static final <T> Object f(@NotNull Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        if (obj instanceof n.a) {
            function1.invoke(n.f(obj));
        }
        return obj;
    }

    @NotNull
    public static final <T> Object g(@NotNull Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        if (obj instanceof n.c) {
            function1.invoke(n.f(obj));
        }
        return obj;
    }

    @NotNull
    public static final <T> Object h(@NotNull Object obj, @NotNull Function1<? super T, Unit> function1) {
        if (!(obj instanceof n.c)) {
            function1.invoke(obj);
        }
        return obj;
    }
}
