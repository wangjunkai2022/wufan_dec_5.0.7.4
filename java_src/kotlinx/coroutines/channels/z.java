package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
/* compiled from: RendezvousChannel.kt */
/* loaded from: classes6.dex */
public class z<E> extends AbstractChannel<E> {
    public z(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean A() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean e0() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean f0() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean z() {
        return true;
    }
}
