package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public final class u extends a2 {
    @JvmField
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final q<?> f71443f;

    public u(@NotNull q<?> qVar) {
        this.f71443f = qVar;
    }

    @Override // kotlinx.coroutines.f0
    public void e0(@Nullable Throwable th) {
        q<?> qVar = this.f71443f;
        qVar.G(qVar.x(f0()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        e0(th);
        return Unit.INSTANCE;
    }
}
