package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: NonCancellable.kt */
/* loaded from: classes.dex */
public final class l2 extends AbstractCoroutineContextElement implements z1 {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final l2 f71210b = new l2();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final String f71211c = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private l2() {
        super(z1.f71466g1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    public static /* synthetic */ void Y() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    public static /* synthetic */ void Z() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    public static /* synthetic */ void a0() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    public static /* synthetic */ void b0() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    public static /* synthetic */ void c0() {
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    @Nullable
    public Object K(@NotNull Continuation<? super Unit> continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.z1
    @NotNull
    public kotlinx.coroutines.selects.c T() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    @NotNull
    public v X(@NotNull x xVar) {
        return m2.f71216b;
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    public void b(@Nullable CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        b(null);
    }

    @Override // kotlinx.coroutines.z1
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.z1
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.z1
    public boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.z1
    @NotNull
    public Sequence<z1> j() {
        Sequence<z1> emptySequence;
        emptySequence = SequencesKt__SequencesKt.emptySequence();
        return emptySequence;
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    @NotNull
    public g1 p(boolean z4, boolean z5, @NotNull Function1<? super Throwable, Unit> function1) {
        return m2.f71216b;
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    @NotNull
    public CancellationException r() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    public boolean start() {
        return false;
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public z1 y(@NotNull z1 z1Var) {
        return z1.a.i(this, z1Var);
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.WARNING, message = f71211c)
    @NotNull
    public g1 z(@NotNull Function1<? super Throwable, Unit> function1) {
        return m2.f71216b;
    }
}
