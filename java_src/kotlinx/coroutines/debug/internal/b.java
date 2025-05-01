package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
/* compiled from: ConcurrentWeakMap.kt */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int f70089a = -1640531527;

    /* renamed from: b  reason: collision with root package name */
    private static final int f70090b = 16;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final o0 f70091c = new o0("REHASH");
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final h f70092d = new h(null);
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private static final h f70093e = new h(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final h d(Object obj) {
        if (obj == null) {
            return f70092d;
        }
        return Intrinsics.areEqual(obj, Boolean.TRUE) ? f70093e : new h(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
