package kotlin.jdk7;

import j1.b;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
/* compiled from: AutoCloseableJVM.kt */
@JvmName(name = "AutoCloseableKt")
/* loaded from: classes6.dex */
public final class AutoCloseableKt {
    @SinceKotlin(version = b.f69563b)
    @PublishedApi
    public static final void closeFinally(@Nullable AutoCloseable autoCloseable, @Nullable Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }

    @SinceKotlin(version = b.f69563b)
    @InlineOnly
    private static final <T extends AutoCloseable, R> R use(T t4, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R invoke = block.invoke(t4);
            InlineMarker.finallyStart(1);
            closeFinally(t4, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }
}
