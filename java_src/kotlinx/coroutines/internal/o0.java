package kotlinx.coroutines.internal;

import kotlin.jvm.JvmField;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Symbol.kt */
/* loaded from: classes6.dex */
public final class o0 {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final String f71138a;

    public o0(@NotNull String str) {
        this.f71138a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T a(@Nullable Object obj) {
        if (obj == this) {
            return null;
        }
        return obj;
    }

    @NotNull
    public String toString() {
        return Typography.less + this.f71138a + Typography.greater;
    }
}
