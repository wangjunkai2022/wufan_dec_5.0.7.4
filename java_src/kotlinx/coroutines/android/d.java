package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final long f69655a = 4611686018427387903L;
    @JvmField
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public static final b f69656b;
    @Nullable
    private static volatile Choreographer choreographer;

    /* compiled from: Runnable.kt */
    /* loaded from: classes6.dex */
    public static final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f69657b;

        public a(p pVar) {
            this.f69657b = pVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.l(this.f69657b);
        }
    }

    static {
        Object m35constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(new HandlerContext(d(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th));
        }
        f69656b = Result.m41isFailureimpl(m35constructorimpl) ? null : m35constructorimpl;
    }

    @VisibleForTesting
    @NotNull
    public static final Handler d(@NotNull Looper looper, boolean z4) {
        int i4;
        if (!z4 || (i4 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i4 >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    @Nullable
    public static final Object e(@NotNull Continuation<? super Long> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Continuation intercepted2;
        Object coroutine_suspended2;
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            intercepted2 = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            q qVar = new q(intercepted2, 1);
            qVar.P();
            j(choreographer2, qVar);
            Object y2 = qVar.y();
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (y2 == coroutine_suspended2) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return y2;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        q qVar2 = new q(intercepted, 1);
        qVar2.P();
        d1.e().dispatch(EmptyCoroutineContext.INSTANCE, new a(qVar2));
        Object y4 = qVar2.y();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (y4 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return y4;
    }

    @JvmOverloads
    @JvmName(name = "from")
    @NotNull
    public static final b f(@NotNull Handler handler) {
        return h(handler, null, 1, null);
    }

    @JvmOverloads
    @JvmName(name = "from")
    @NotNull
    public static final b g(@NotNull Handler handler, @Nullable String str) {
        return new HandlerContext(handler, str);
    }

    public static /* synthetic */ b h(Handler handler, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        return g(handler, str);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Choreographer choreographer2, final p<? super Long> pVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j4) {
                d.k(p.this, j4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(p pVar, long j4) {
        pVar.O(d1.e(), Long.valueOf(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(p<? super Long> pVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        j(choreographer2, pVar);
    }
}
