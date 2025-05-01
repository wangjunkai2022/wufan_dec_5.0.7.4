package io.netty.util.internal;

import java.util.Queue;
/* loaded from: classes6.dex */
public interface PriorityQueue<T> extends Queue<T> {
    void clearIgnoringIndexes();

    boolean containsTyped(T t4);

    void priorityChanged(T t4);

    boolean removeTyped(T t4);
}
