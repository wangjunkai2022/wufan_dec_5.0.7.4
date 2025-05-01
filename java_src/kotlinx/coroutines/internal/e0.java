package kotlinx.coroutines.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.j2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainDispatchers.kt */
/* loaded from: classes6.dex */
public final class e0 extends j2 implements kotlinx.coroutines.y0 {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f71110b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final String f71111c;

    public /* synthetic */ e0(Throwable th, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i4 & 2) != 0 ? null : str);
    }

    private final Void b0() {
        String stringPlus;
        if (this.f71110b != null) {
            String str = this.f71111c;
            String str2 = "";
            if (str != null && (stringPlus = Intrinsics.stringPlus(". ", str)) != null) {
                str2 = stringPlus;
            }
            throw new IllegalStateException(Intrinsics.stringPlus("Module with the Main dispatcher had failed to initialize", str2), this.f71110b);
        }
        d0.e();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.y0
    @NotNull
    public g1 A(long j4, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        b0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.y0
    @Nullable
    public Object S(long j4, @NotNull Continuation<?> continuation) {
        b0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.j2
    @NotNull
    public j2 Y() {
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    /* renamed from: a0 */
    public Void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        b0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.y0
    @NotNull
    /* renamed from: c0 */
    public Void k(long j4, @NotNull kotlinx.coroutines.p<? super Unit> pVar) {
        b0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext) {
        b0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.j2, kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher limitedParallelism(int i4) {
        b0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.j2, kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f71110b;
        sb.append(th != null ? Intrinsics.stringPlus(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }

    public e0(@Nullable Throwable th, @Nullable String str) {
        this.f71110b = th;
        this.f71111c = str;
    }
}
