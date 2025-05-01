package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Job.kt */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@InternalCoroutinesApi
/* loaded from: classes.dex */
public interface v extends g1 {

    /* compiled from: Job.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        @InternalCoroutinesApi
        public static /* synthetic */ void a() {
        }
    }

    @InternalCoroutinesApi
    boolean e(@NotNull Throwable th);

    @Nullable
    z1 getParent();
}
