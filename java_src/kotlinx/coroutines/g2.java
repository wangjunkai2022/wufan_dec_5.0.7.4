package kotlinx.coroutines;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public final class g2 {

    /* renamed from: e  reason: collision with root package name */
    private static final int f71045e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static final int f71046f = 0;

    /* renamed from: g  reason: collision with root package name */
    private static final int f71047g = 1;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.o0 f71041a = new kotlinx.coroutines.internal.o0("COMPLETING_ALREADY");
    @JvmField
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.o0 f71042b = new kotlinx.coroutines.internal.o0("COMPLETING_WAITING_CHILDREN");
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.o0 f71043c = new kotlinx.coroutines.internal.o0("COMPLETING_RETRY");
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.o0 f71044d = new kotlinx.coroutines.internal.o0("TOO_LATE_TO_CANCEL");
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.o0 f71048h = new kotlinx.coroutines.internal.o0("SEALED");
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private static final j1 f71049i = new j1(false);
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private static final j1 f71050j = new j1(true);

    @Nullable
    public static final Object g(@Nullable Object obj) {
        return obj instanceof u1 ? new v1((u1) obj) : obj;
    }

    private static /* synthetic */ void h() {
    }

    private static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    @Nullable
    public static final Object o(@Nullable Object obj) {
        u1 u1Var;
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        return (v1Var == null || (u1Var = v1Var.f71455a) == null) ? obj : u1Var;
    }
}
