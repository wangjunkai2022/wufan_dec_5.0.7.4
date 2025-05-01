package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
/* compiled from: ExceptionsConstructor.kt */
/* loaded from: classes6.dex */
public abstract class k {
    @NotNull
    public abstract Function1<Throwable, Throwable> a(@NotNull Class<? extends Throwable> cls);
}
