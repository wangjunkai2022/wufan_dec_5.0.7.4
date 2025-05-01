package kotlinx.coroutines.channels;

import org.jetbrains.annotations.Nullable;
/* compiled from: Channel.kt */
/* loaded from: classes6.dex */
public final class ClosedSendChannelException extends IllegalStateException {
    public ClosedSendChannelException(@Nullable String str) {
        super(str);
    }
}
