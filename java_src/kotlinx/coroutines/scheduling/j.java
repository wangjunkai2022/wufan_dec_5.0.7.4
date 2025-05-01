package kotlinx.coroutines.scheduling;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
/* compiled from: Tasks.kt */
/* loaded from: classes7.dex */
public abstract class j implements Runnable {
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public long f71308b;
    @JvmField
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public k f71309c;

    public j(long j4, @NotNull k kVar) {
        this.f71308b = j4;
        this.f71309c = kVar;
    }

    public final int b() {
        return this.f71309c.P();
    }

    public j() {
        this(0L, n.f71320i);
    }
}
