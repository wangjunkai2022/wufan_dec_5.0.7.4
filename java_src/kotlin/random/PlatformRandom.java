package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: PlatformRandom.kt */
/* loaded from: classes6.dex */
final class PlatformRandom extends AbstractPlatformRandom implements Serializable {
    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    @NotNull
    private final java.util.Random impl;

    /* compiled from: PlatformRandom.kt */
    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PlatformRandom(@NotNull java.util.Random impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @Override // kotlin.random.AbstractPlatformRandom
    @NotNull
    public java.util.Random getImpl() {
        return this.impl;
    }
}
