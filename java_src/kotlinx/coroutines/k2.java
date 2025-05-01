package kotlinx.coroutines;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public final class k2 extends kotlinx.coroutines.internal.v implements u1 {
    @Override // kotlinx.coroutines.u1
    @NotNull
    public k2 f() {
        return this;
    }

    @NotNull
    public final String i0(@NotNull String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z4 = true;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) L(); !Intrinsics.areEqual(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.M()) {
            if (lockFreeLinkedListNode instanceof f2) {
                f2 f2Var = (f2) lockFreeLinkedListNode;
                if (z4) {
                    z4 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(f2Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // kotlinx.coroutines.u1
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return s0.d() ? i0("Active") : super.toString();
    }
}
