package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.j2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MainDispatchers.kt */
@InternalCoroutinesApi
/* loaded from: classes6.dex */
public final class f0 implements b0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f71113a = new f0();

    private f0() {
    }

    @Override // kotlinx.coroutines.internal.b0
    @NotNull
    public j2 createDispatcher(@NotNull List<? extends b0> list) {
        return new e0(null, null, 2, null);
    }

    @Override // kotlinx.coroutines.internal.b0
    public int getLoadPriority() {
        return -1;
    }

    @Override // kotlinx.coroutines.internal.b0
    @Nullable
    public String hintOnError() {
        return b0.a.a(this);
    }
}
