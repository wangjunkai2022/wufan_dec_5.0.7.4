package io.netty.util;
/* loaded from: classes6.dex */
public interface ResourceLeakTracker<T> {
    boolean close(T t4);

    void record();

    void record(Object obj);
}
