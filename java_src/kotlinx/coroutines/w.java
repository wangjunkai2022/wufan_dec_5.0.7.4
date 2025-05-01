package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public final class w extends a2 implements v {
    @JvmField
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final x f71458f;

    public w(@NotNull x xVar) {
        this.f71458f = xVar;
    }

    @Override // kotlinx.coroutines.v
    public boolean e(@NotNull Throwable th) {
        return f0().p0(th);
    }

    @Override // kotlinx.coroutines.f0
    public void e0(@Nullable Throwable th) {
        this.f71458f.v(f0());
    }

    @Override // kotlinx.coroutines.v
    @NotNull
    public z1 getParent() {
        return f0();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        e0(th);
        return Unit.INSTANCE;
    }
}
