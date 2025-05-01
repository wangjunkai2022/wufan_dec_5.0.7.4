package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Intrinsics;
/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes6.dex */
public final class s {
    public static final void a(int i4) {
        if (!(i4 >= 1)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Expected positive parallelism level, but got ", Integer.valueOf(i4)).toString());
        }
    }
}
