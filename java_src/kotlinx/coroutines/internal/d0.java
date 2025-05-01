package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.j2;
import org.jetbrains.annotations.NotNull;
/* compiled from: MainDispatchers.kt */
/* loaded from: classes6.dex */
public final class d0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private static final String f71106a = "kotlinx.coroutines.fast.service.loader";

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f71107b = true;

    private static final e0 a(Throwable th, String str) {
        if (f71107b) {
            return new e0(th, str);
        }
        if (th == null) {
            e();
            throw new KotlinNothingValueException();
        }
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ e0 b(Throwable th, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    private static /* synthetic */ void c() {
    }

    @InternalCoroutinesApi
    public static final boolean d(@NotNull j2 j2Var) {
        return j2Var.Y() instanceof e0;
    }

    @NotNull
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @InternalCoroutinesApi
    @NotNull
    public static final j2 f(@NotNull b0 b0Var, @NotNull List<? extends b0> list) {
        try {
            return b0Var.createDispatcher(list);
        } catch (Throwable th) {
            return a(th, b0Var.hintOnError());
        }
    }
}
