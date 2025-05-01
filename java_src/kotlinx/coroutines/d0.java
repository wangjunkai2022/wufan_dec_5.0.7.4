package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
/* compiled from: CompletionState.kt */
/* loaded from: classes6.dex */
public class d0 {

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f70013b = AtomicIntegerFieldUpdater.newUpdater(d0.class, "_handled");
    @NotNull
    private volatile /* synthetic */ int _handled;
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f70014a;

    public d0(@NotNull Throwable th, boolean z4) {
        this.f70014a = th;
        this._handled = z4 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f70013b.compareAndSet(this, 0, 1);
    }

    @NotNull
    public String toString() {
        return t0.a(this) + '[' + this.f70014a + ']';
    }

    public /* synthetic */ d0(Throwable th, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i4 & 2) != 0 ? false : z4);
    }
}
