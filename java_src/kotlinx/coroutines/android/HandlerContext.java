package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.m2;
import kotlinx.coroutines.p;
import kotlinx.coroutines.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes6.dex */
public final class HandlerContext extends b implements y0 {
    @Nullable
    private volatile HandlerContext _immediate;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Handler f69644b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final String f69645c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f69646d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final HandlerContext f69647e;

    /* compiled from: Runnable.kt */
    /* loaded from: classes6.dex */
    public static final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f69648b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HandlerContext f69649c;

        public a(p pVar, HandlerContext handlerContext) {
            this.f69648b = pVar;
            this.f69649c = handlerContext;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f69648b.O(this.f69649c, Unit.INSTANCE);
        }
    }

    private HandlerContext(Handler handler, String str, boolean z4) {
        super(null);
        this.f69644b = handler;
        this.f69645c = str;
        this.f69646d = z4;
        this._immediate = z4 ? this : null;
        HandlerContext handlerContext = this._immediate;
        if (handlerContext == null) {
            handlerContext = new HandlerContext(handler, str, true);
            this._immediate = handlerContext;
        }
        this.f69647e = handlerContext;
    }

    private final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        c2.f(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        d1.c().dispatch(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.f69644b.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.android.b, kotlinx.coroutines.y0
    @NotNull
    public g1 A(long j4, @NotNull final Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        long coerceAtMost;
        Handler handler = this.f69644b;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(j4, (long) DurationKt.MAX_MILLIS);
        if (handler.postDelayed(runnable, coerceAtMost)) {
            return new g1() { // from class: kotlinx.coroutines.android.a
                @Override // kotlinx.coroutines.g1
                public final void dispose() {
                    HandlerContext.f0(HandlerContext.this, runnable);
                }
            };
        }
        d0(coroutineContext, runnable);
        return m2.f71216b;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (this.f69644b.post(runnable)) {
            return;
        }
        d0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.android.b
    @NotNull
    /* renamed from: e0 */
    public HandlerContext a0() {
        return this.f69647e;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof HandlerContext) && ((HandlerContext) obj).f69644b == this.f69644b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f69644b);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext) {
        return (this.f69646d && Intrinsics.areEqual(Looper.myLooper(), this.f69644b.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.y0
    public void k(long j4, @NotNull p<? super Unit> pVar) {
        long coerceAtMost;
        final a aVar = new a(pVar, this);
        Handler handler = this.f69644b;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(j4, (long) DurationKt.MAX_MILLIS);
        if (handler.postDelayed(aVar, coerceAtMost)) {
            pVar.k(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th) {
                    Handler handler2;
                    handler2 = HandlerContext.this.f69644b;
                    handler2.removeCallbacks(aVar);
                }
            });
        } else {
            d0(pVar.getContext(), aVar);
        }
    }

    @Override // kotlinx.coroutines.j2, kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String Z = Z();
        if (Z == null) {
            String str = this.f69645c;
            if (str == null) {
                str = this.f69644b.toString();
            }
            return this.f69646d ? Intrinsics.stringPlus(str, ".immediate") : str;
        }
        return Z;
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i4 & 2) != 0 ? null : str);
    }

    public HandlerContext(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }
}
