package kotlinx.coroutines.flow;

import org.jetbrains.annotations.NotNull;
/* compiled from: SharingStarted.kt */
/* loaded from: classes6.dex */
final class t implements r {
    @Override // kotlinx.coroutines.flow.r
    @NotNull
    public e<SharingCommand> a(@NotNull u<Integer> uVar) {
        return g.L0(SharingCommand.START);
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
