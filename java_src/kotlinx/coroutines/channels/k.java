package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.internal.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Channel.kt */
/* loaded from: classes6.dex */
public interface k<E> extends b0<E>, ReceiveChannel<E> {
    @NotNull

    /* renamed from: h1  reason: collision with root package name */
    public static final b f69974h1 = b.f69981a;

    /* renamed from: i1  reason: collision with root package name */
    public static final int f69975i1 = Integer.MAX_VALUE;

    /* renamed from: j1  reason: collision with root package name */
    public static final int f69976j1 = 0;

    /* renamed from: k1  reason: collision with root package name */
    public static final int f69977k1 = -1;

    /* renamed from: l1  reason: collision with root package name */
    public static final int f69978l1 = -2;

    /* renamed from: m1  reason: collision with root package name */
    public static final int f69979m1 = -3;
    @NotNull

    /* renamed from: n1  reason: collision with root package name */
    public static final String f69980n1 = "kotlinx.coroutines.channels.defaultBuffer";

    /* compiled from: Channel.kt */
    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static <E> kotlinx.coroutines.selects.d<E> b(@NotNull k<E> kVar) {
            return ReceiveChannel.DefaultImpls.d(kVar);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull k<E> kVar, E e5) {
            return b0.a.c(kVar, e5);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E d(@NotNull k<E> kVar) {
            return (E) ReceiveChannel.DefaultImpls.h(kVar);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @LowPriorityInOverloadResolution
        @Nullable
        public static <E> Object e(@NotNull k<E> kVar, @NotNull Continuation<? super E> continuation) {
            return ReceiveChannel.DefaultImpls.i(kVar, continuation);
        }
    }

    /* compiled from: Channel.kt */
    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f69982b = Integer.MAX_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public static final int f69983c = 0;

        /* renamed from: d  reason: collision with root package name */
        public static final int f69984d = -1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f69985e = -2;

        /* renamed from: f  reason: collision with root package name */
        public static final int f69986f = -3;
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        public static final String f69987g = "kotlinx.coroutines.channels.defaultBuffer";

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f69981a = new b();

        /* renamed from: h  reason: collision with root package name */
        private static final int f69988h = q0.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private b() {
        }

        public final int a() {
            return f69988h;
        }
    }
}
