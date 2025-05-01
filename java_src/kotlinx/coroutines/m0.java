package kotlinx.coroutines;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes6.dex */
public final class m0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private static final List<l0> f71215a;

    static {
        Sequence asSequence;
        List<l0> list;
        asSequence = SequencesKt__SequencesKt.asSequence(ServiceLoader.load(l0.class, l0.class.getClassLoader()).iterator());
        list = SequencesKt___SequencesKt.toList(asSequence);
        f71215a = list;
    }

    public static final void a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        for (l0 l0Var : f71215a) {
            try {
                l0Var.handleException(coroutineContext, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, n0.c(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            Result.Companion companion = Result.Companion;
            ExceptionsKt__ExceptionsKt.addSuppressed(th, new DiagnosticCoroutineContextException(coroutineContext));
            Result.m35constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.Companion;
            Result.m35constructorimpl(ResultKt.createFailure(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
