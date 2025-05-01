package kotlinx.coroutines;

import kotlin.Unit;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CancellableContinuation.kt */
/* loaded from: classes6.dex */
final class p2 extends f {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final LockFreeLinkedListNode f71230b;

    public p2(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f71230b = lockFreeLinkedListNode;
    }

    @Override // kotlinx.coroutines.o
    public void a(@Nullable Throwable th) {
        this.f71230b.W();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        a(th);
        return Unit.INSTANCE;
    }

    @NotNull
    public String toString() {
        return "RemoveOnCancel[" + this.f71230b + ']';
    }
}
