package io.netty.util.internal.shaded.org.jctools.queues;
/* loaded from: classes6.dex */
public interface MessagePassingQueue<T> {
    public static final int UNBOUNDED_CAPACITY = -1;

    /* loaded from: classes6.dex */
    public interface Consumer<T> {
        void accept(T t4);
    }

    /* loaded from: classes6.dex */
    public interface ExitCondition {
        boolean keepRunning();
    }

    /* loaded from: classes6.dex */
    public interface Supplier<T> {
        T get();
    }

    /* loaded from: classes6.dex */
    public interface WaitStrategy {
        int idle(int i4);
    }

    int capacity();

    void clear();

    int drain(Consumer<T> consumer);

    int drain(Consumer<T> consumer, int i4);

    void drain(Consumer<T> consumer, WaitStrategy waitStrategy, ExitCondition exitCondition);

    int fill(Supplier<T> supplier);

    int fill(Supplier<T> supplier, int i4);

    void fill(Supplier<T> supplier, WaitStrategy waitStrategy, ExitCondition exitCondition);

    boolean isEmpty();

    boolean offer(T t4);

    T peek();

    T poll();

    boolean relaxedOffer(T t4);

    T relaxedPeek();

    T relaxedPoll();

    int size();
}
