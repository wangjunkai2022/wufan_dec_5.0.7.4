package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public final class j1 implements u1 {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f71189b;

    public j1(boolean z4) {
        this.f71189b = z4;
    }

    @Override // kotlinx.coroutines.u1
    @Nullable
    public k2 f() {
        return null;
    }

    @Override // kotlinx.coroutines.u1
    public boolean isActive() {
        return this.f71189b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
