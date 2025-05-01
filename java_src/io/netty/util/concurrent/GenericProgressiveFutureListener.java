package io.netty.util.concurrent;

import io.netty.util.concurrent.ProgressiveFuture;
/* loaded from: classes6.dex */
public interface GenericProgressiveFutureListener<F extends ProgressiveFuture<?>> extends GenericFutureListener<F> {
    void operationProgressed(F f5, long j4, long j5) throws Exception;
}
