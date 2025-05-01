package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.j2;
import org.jetbrains.annotations.NotNull;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes6.dex */
public final class AndroidDispatcherFactory implements b0 {
    @Override // kotlinx.coroutines.internal.b0
    @NotNull
    public j2 createDispatcher(@NotNull List<? extends b0> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new HandlerContext(d.d(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.b0
    public int getLoadPriority() {
        return z.f71167j;
    }

    @Override // kotlinx.coroutines.internal.b0
    @NotNull
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
