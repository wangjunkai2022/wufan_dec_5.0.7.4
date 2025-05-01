package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Timeout.kt */
/* loaded from: classes6.dex */
public final class TimeoutCancellationException extends CancellationException implements k0<TimeoutCancellationException> {
    @JvmField
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final z1 f69636b;

    public TimeoutCancellationException(@NotNull String str, @Nullable z1 z1Var) {
        super(str);
        this.f69636b = z1Var;
    }

    @Override // kotlinx.coroutines.k0
    @Nullable
    /* renamed from: b */
    public TimeoutCancellationException a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f69636b);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }

    public TimeoutCancellationException(@NotNull String str) {
        this(str, null);
    }
}
