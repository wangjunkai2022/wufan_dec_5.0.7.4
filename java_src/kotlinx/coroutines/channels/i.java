package kotlinx.coroutines.channels;

import kotlinx.coroutines.ObsoleteCoroutinesApi;
import org.jetbrains.annotations.NotNull;
/* compiled from: BroadcastChannel.kt */
/* loaded from: classes6.dex */
public final class i {
    @ObsoleteCoroutinesApi
    @NotNull
    public static final <E> h<E> a(int i4) {
        if (i4 != -2) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != Integer.MAX_VALUE) {
                        return new f(i4);
                    }
                    throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
                }
                throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
            }
            return new q();
        }
        return new f(k.f69974h1.a());
    }
}
