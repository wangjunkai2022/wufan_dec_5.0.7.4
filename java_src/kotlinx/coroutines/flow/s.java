package kotlinx.coroutines.flow;

import kotlin.time.Duration;
import kotlinx.coroutines.flow.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: SharingStarted.kt */
/* loaded from: classes6.dex */
public final class s {
    @NotNull
    public static final r a(@NotNull r.a aVar, long j4, long j5) {
        return new StartedWhileSubscribed(Duration.m1391getInWholeMillisecondsimpl(j4), Duration.m1391getInWholeMillisecondsimpl(j5));
    }

    public static /* synthetic */ r b(r.a aVar, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = Duration.Companion.m1475getZEROUwyO8pc();
        }
        if ((i4 & 2) != 0) {
            j5 = Duration.Companion.m1473getINFINITEUwyO8pc();
        }
        return a(aVar, j4, j5);
    }
}
