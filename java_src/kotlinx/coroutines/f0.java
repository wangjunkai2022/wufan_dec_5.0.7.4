package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.Nullable;
/* compiled from: CompletionHandler.kt */
/* loaded from: classes6.dex */
public abstract class f0 extends LockFreeLinkedListNode implements Function1<Throwable, Unit> {
    public abstract void e0(@Nullable Throwable th);
}
