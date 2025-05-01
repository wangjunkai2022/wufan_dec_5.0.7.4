package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.j2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MainDispatcherFactory.kt */
@InternalCoroutinesApi
/* loaded from: classes6.dex */
public interface b0 {

    /* compiled from: MainDispatcherFactory.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        @Nullable
        public static String a(@NotNull b0 b0Var) {
            return null;
        }
    }

    @NotNull
    j2 createDispatcher(@NotNull List<? extends b0> list);

    int getLoadPriority();

    @Nullable
    String hintOnError();
}
