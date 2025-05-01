package io.netty.channel;

import java.util.Queue;
/* loaded from: classes6.dex */
public interface EventLoopTaskQueueFactory {
    Queue<Runnable> newTaskQueue(int i4);
}
