package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Exceptions.kt */
/* loaded from: classes6.dex */
public final class JobCancellationException extends CancellationException implements k0<JobCancellationException> {
    @JvmField
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final z1 f69620b;

    public JobCancellationException(@NotNull String str, @Nullable Throwable th, @NotNull z1 z1Var) {
        super(str);
        this.f69620b = z1Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.k0
    @Nullable
    /* renamed from: b */
    public JobCancellationException a() {
        if (s0.d()) {
            String message = getMessage();
            Intrinsics.checkNotNull(message);
            return new JobCancellationException(message, this, this.f69620b);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!Intrinsics.areEqual(jobCancellationException.getMessage(), getMessage()) || !Intrinsics.areEqual(jobCancellationException.f69620b, this.f69620b) || !Intrinsics.areEqual(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        if (s0.d()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int hashCode = ((message.hashCode() * 31) + this.f69620b.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + this.f69620b;
    }
}
