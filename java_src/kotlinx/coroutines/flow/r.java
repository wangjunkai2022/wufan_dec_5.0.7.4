package kotlinx.coroutines.flow;

import org.jetbrains.annotations.NotNull;
/* compiled from: SharingStarted.kt */
/* loaded from: classes6.dex */
public interface r {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final a f71031a = a.f71032a;

    /* compiled from: SharingStarted.kt */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f71032a = new a();
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        private static final r f71033b = new t();
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        private static final r f71034c = new StartedLazily();

        private a() {
        }

        public static /* synthetic */ r b(a aVar, long j4, long j5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                j4 = 0;
            }
            if ((i4 & 2) != 0) {
                j5 = Long.MAX_VALUE;
            }
            return aVar.a(j4, j5);
        }

        @NotNull
        public final r a(long j4, long j5) {
            return new StartedWhileSubscribed(j4, j5);
        }

        @NotNull
        public final r c() {
            return f71033b;
        }

        @NotNull
        public final r d() {
            return f71034c;
        }
    }

    @NotNull
    e<SharingCommand> a(@NotNull u<Integer> uVar);
}
