package kotlinx.coroutines.flow;

import org.jetbrains.annotations.NotNull;
/* compiled from: SharingStarted.kt */
/* loaded from: classes6.dex */
final class StartedLazily implements r {
    @Override // kotlinx.coroutines.flow.r
    @NotNull
    public e<SharingCommand> a(@NotNull u<Integer> uVar) {
        return g.I0(new StartedLazily$command$1(uVar, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
