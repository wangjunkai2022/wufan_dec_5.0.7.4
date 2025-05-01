package io.netty.util.concurrent;
/* loaded from: classes6.dex */
public interface EventExecutorChooserFactory {

    /* loaded from: classes6.dex */
    public interface EventExecutorChooser {
        EventExecutor next();
    }

    EventExecutorChooser newChooser(EventExecutor[] eventExecutorArr);
}
