package io.netty.channel;
/* loaded from: classes6.dex */
public interface MessageSizeEstimator {

    /* loaded from: classes6.dex */
    public interface Handle {
        int size(Object obj);
    }

    Handle newHandle();
}
