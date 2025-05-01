package io.netty.channel;

import io.netty.util.IntSupplier;
/* loaded from: classes6.dex */
final class DefaultSelectStrategy implements SelectStrategy {
    static final SelectStrategy INSTANCE = new DefaultSelectStrategy();

    private DefaultSelectStrategy() {
    }

    @Override // io.netty.channel.SelectStrategy
    public int calculateStrategy(IntSupplier intSupplier, boolean z4) throws Exception {
        if (z4) {
            return intSupplier.get();
        }
        return -1;
    }
}
