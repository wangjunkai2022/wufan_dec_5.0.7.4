package kotlinx.coroutines.internal;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes6.dex */
public final class i0 {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final LockFreeLinkedListNode f71118a;

    public i0(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f71118a = lockFreeLinkedListNode;
    }

    @NotNull
    public String toString() {
        return "Removed[" + this.f71118a + ']';
    }
}
