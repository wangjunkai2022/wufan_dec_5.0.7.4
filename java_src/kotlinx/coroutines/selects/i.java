package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import org.jetbrains.annotations.NotNull;
/* compiled from: Select.kt */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f71367a = AtomicLongFieldUpdater.newUpdater(i.class, "number");
    @NotNull
    private volatile /* synthetic */ long number = 1;

    public final long a() {
        return f71367a.incrementAndGet(this);
    }
}
