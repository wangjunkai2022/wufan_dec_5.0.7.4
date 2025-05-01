package io.netty.util;
/* loaded from: classes6.dex */
public interface Attribute<T> {
    boolean compareAndSet(T t4, T t5);

    T get();

    @Deprecated
    T getAndRemove();

    T getAndSet(T t4);

    AttributeKey<T> key();

    @Deprecated
    void remove();

    void set(T t4);

    T setIfAbsent(T t4);
}
