package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MainCoroutineDispatcher.kt */
/* loaded from: classes6.dex */
public abstract class j2 extends CoroutineDispatcher {
    @NotNull
    public abstract j2 Y();

    /* JADX INFO: Access modifiers changed from: protected */
    @InternalCoroutinesApi
    @Nullable
    public final String Z() {
        j2 j2Var;
        j2 e5 = d1.e();
        if (this == e5) {
            return "Dispatchers.Main";
        }
        try {
            j2Var = e5.Y();
        } catch (UnsupportedOperationException unused) {
            j2Var = null;
        }
        if (this == j2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher limitedParallelism(int i4) {
        kotlinx.coroutines.internal.s.a(i4);
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String Z = Z();
        if (Z == null) {
            return t0.a(this) + '@' + t0.b(this);
        }
        return Z;
    }
}
