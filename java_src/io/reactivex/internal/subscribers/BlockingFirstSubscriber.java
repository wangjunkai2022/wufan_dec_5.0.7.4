package io.reactivex.internal.subscribers;

import io.reactivex.plugins.RxJavaPlugins;
/* loaded from: classes6.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.value == null) {
            this.error = th;
        } else {
            RxJavaPlugins.onError(th);
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t4) {
        if (this.value == null) {
            this.value = t4;
            this.upstream.cancel();
            countDown();
        }
    }
}
