package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
/* compiled from: Runnable.kt */
/* loaded from: classes6.dex */
public final class t2 {

    /* compiled from: Runnable.kt */
    /* loaded from: classes6.dex */
    public static final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f71424b;

        public a(Function0<Unit> function0) {
            this.f71424b = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f71424b.invoke();
        }
    }

    @NotNull
    public static final Runnable a(@NotNull Function0<Unit> function0) {
        return new a(function0);
    }
}
