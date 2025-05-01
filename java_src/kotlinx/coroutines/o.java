package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
/* compiled from: CompletionHandler.kt */
/* loaded from: classes6.dex */
public abstract class o implements Function1<Throwable, Unit> {
    public abstract void a(@Nullable Throwable th);
}
