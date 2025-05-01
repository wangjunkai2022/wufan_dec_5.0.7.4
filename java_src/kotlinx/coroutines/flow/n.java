package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SharedFlow.kt */
/* loaded from: classes6.dex */
public interface n<T> extends e<T> {
    @Override // kotlinx.coroutines.flow.e
    @Nullable
    Object a(@NotNull f<? super T> fVar, @NotNull Continuation<?> continuation);

    @NotNull
    List<T> e();
}
