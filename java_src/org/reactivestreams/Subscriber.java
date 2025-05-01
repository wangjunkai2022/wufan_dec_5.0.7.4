package org.reactivestreams;
/* loaded from: classes7.dex */
public interface Subscriber<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t4);

    void onSubscribe(Subscription subscription);
}
