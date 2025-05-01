package kotlinx.coroutines.sync;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Mutex.kt */
/* loaded from: classes7.dex */
public final class b {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final Object f71420a;

    public b(@NotNull Object obj) {
        this.f71420a = obj;
    }

    @NotNull
    public String toString() {
        return "Empty[" + this.f71420a + ']';
    }
}
