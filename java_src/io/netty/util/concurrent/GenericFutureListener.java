package io.netty.util.concurrent;

import io.netty.util.concurrent.Future;
import java.util.EventListener;
/* loaded from: classes6.dex */
public interface GenericFutureListener<F extends Future<?>> extends EventListener {
    void operationComplete(F f5) throws Exception;
}
