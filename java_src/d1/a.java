package d1;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: ListenableFuture.java */
/* loaded from: classes3.dex */
public interface a<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
