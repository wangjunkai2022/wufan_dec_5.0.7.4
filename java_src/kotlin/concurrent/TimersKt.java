package kotlin.concurrent;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Timer.kt */
@JvmName(name = "TimersKt")
/* loaded from: classes6.dex */
public final class TimersKt {
    @InlineOnly
    private static final Timer fixedRateTimer(String str, boolean z4, long j4, long j5, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z4);
        timer.scheduleAtFixedRate(new TimersKt$timerTask$1(action), j4, j5);
        return timer;
    }

    static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z4, long j4, long j5, Function1 action, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            j4 = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z4);
        timer.scheduleAtFixedRate(new TimersKt$timerTask$1(action), j4, j5);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, long j4, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, j4);
        return timersKt$timerTask$1;
    }

    @InlineOnly
    private static final TimerTask scheduleAtFixedRate(Timer timer, long j4, long j5, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.scheduleAtFixedRate(timersKt$timerTask$1, j4, j5);
        return timersKt$timerTask$1;
    }

    @PublishedApi
    @NotNull
    public static final Timer timer(@Nullable String str, boolean z4) {
        return str == null ? new Timer(z4) : new Timer(str, z4);
    }

    static /* synthetic */ Timer timer$default(String str, boolean z4, long j4, long j5, Function1 action, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            j4 = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z4);
        timer.schedule(new TimersKt$timerTask$1(action), j4, j5);
        return timer;
    }

    @InlineOnly
    private static final TimerTask timerTask(Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new TimersKt$timerTask$1(action);
    }

    @InlineOnly
    private static final Timer timer(String str, boolean z4, long j4, long j5, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z4);
        timer.schedule(new TimersKt$timerTask$1(action), j4, j5);
        return timer;
    }

    @InlineOnly
    private static final Timer fixedRateTimer(String str, boolean z4, Date startAt, long j4, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z4);
        timer.scheduleAtFixedRate(new TimersKt$timerTask$1(action), startAt, j4);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, Date time, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, time);
        return timersKt$timerTask$1;
    }

    @InlineOnly
    private static final TimerTask scheduleAtFixedRate(Timer timer, Date time, long j4, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.scheduleAtFixedRate(timersKt$timerTask$1, time, j4);
        return timersKt$timerTask$1;
    }

    static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z4, Date startAt, long j4, Function1 action, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z4);
        timer.scheduleAtFixedRate(new TimersKt$timerTask$1(action), startAt, j4);
        return timer;
    }

    @InlineOnly
    private static final Timer timer(String str, boolean z4, Date startAt, long j4, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z4);
        timer.schedule(new TimersKt$timerTask$1(action), startAt, j4);
        return timer;
    }

    static /* synthetic */ Timer timer$default(String str, boolean z4, Date startAt, long j4, Function1 action, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z4);
        timer.schedule(new TimersKt$timerTask$1(action), startAt, j4);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, long j4, long j5, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, j4, j5);
        return timersKt$timerTask$1;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer timer, Date time, long j4, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        TimersKt$timerTask$1 timersKt$timerTask$1 = new TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, time, j4);
        return timersKt$timerTask$1;
    }
}
