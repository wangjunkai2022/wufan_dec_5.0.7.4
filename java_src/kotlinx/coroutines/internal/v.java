package kotlinx.coroutines.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes6.dex */
public class v extends LockFreeLinkedListNode {
    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean T() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @Nullable
    protected LockFreeLinkedListNode V() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public /* bridge */ /* synthetic */ boolean W() {
        return ((Boolean) g0()).booleanValue();
    }

    public final /* synthetic */ <T extends LockFreeLinkedListNode> void e0(Function1<? super T, Unit> function1) {
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) L(); !Intrinsics.areEqual(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.M()) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (lockFreeLinkedListNode instanceof LockFreeLinkedListNode) {
                function1.invoke(lockFreeLinkedListNode);
            }
        }
    }

    public final boolean f0() {
        return L() == this;
    }

    @NotNull
    public final Void g0() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    public final void h0() {
        LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) L();
        LockFreeLinkedListNode lockFreeLinkedListNode2 = this;
        while (!Intrinsics.areEqual(lockFreeLinkedListNode, this)) {
            LockFreeLinkedListNode M = lockFreeLinkedListNode.M();
            lockFreeLinkedListNode.d0(lockFreeLinkedListNode2, M);
            lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            lockFreeLinkedListNode = M;
        }
        d0(lockFreeLinkedListNode2, (LockFreeLinkedListNode) L());
    }
}
