package io.netty.util;

import io.netty.util.concurrent.FastThreadLocal;
import io.netty.util.internal.MathUtil;
import io.netty.util.internal.ObjectPool;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes6.dex */
public abstract class Recycler<T> {
    private static final int DEFAULT_INITIAL_MAX_CAPACITY_PER_THREAD = 4096;
    private static final int DEFAULT_MAX_CAPACITY_PER_THREAD;
    private static final FastThreadLocal<Map<Stack<?>, WeakOrderQueue>> DELAYED_RECYCLED;
    private static final AtomicInteger ID_GENERATOR;
    private static final int INITIAL_CAPACITY;
    private static final int LINK_CAPACITY;
    private static final int MAX_DELAYED_QUEUES_PER_THREAD;
    private static final int MAX_SHARED_CAPACITY_FACTOR;
    private static final Handle NOOP_HANDLE;
    private static final int OWN_THREAD_ID;
    private static final int RATIO;
    private static final InternalLogger logger;
    private final int interval;
    private final int maxCapacityPerThread;
    private final int maxDelayedQueuesPerThread;
    private final int maxSharedCapacityFactor;
    private final FastThreadLocal<Stack<T>> threadLocal;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class DefaultHandle<T> implements Handle<T> {
        boolean hasBeenRecycled;
        int lastRecycledId;
        int recycleId;
        Stack<?> stack;
        Object value;

        DefaultHandle(Stack<?> stack) {
            this.stack = stack;
        }

        @Override // io.netty.util.internal.ObjectPool.Handle
        public void recycle(Object obj) {
            if (obj == this.value) {
                Stack<?> stack = this.stack;
                if (this.lastRecycledId == this.recycleId && stack != null) {
                    stack.push(this);
                    return;
                }
                throw new IllegalStateException("recycled already");
            }
            throw new IllegalArgumentException("object does not belong to handle");
        }
    }

    /* loaded from: classes6.dex */
    public interface Handle<T> extends ObjectPool.Handle<T> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Stack<T> {
        final AtomicInteger availableSharedCapacity;
        private WeakOrderQueue cursor;
        DefaultHandle<?>[] elements;
        private int handleRecycleCount;
        private volatile WeakOrderQueue head;
        private final int interval;
        private final int maxCapacity;
        private final int maxDelayedQueues;
        final Recycler<T> parent;
        private WeakOrderQueue prev;
        int size;
        final WeakReference<Thread> threadRef;

        Stack(Recycler<T> recycler, Thread thread, int i4, int i5, int i6, int i7) {
            this.parent = recycler;
            this.threadRef = new WeakReference<>(thread);
            this.maxCapacity = i4;
            this.availableSharedCapacity = new AtomicInteger(Math.max(i4 / i5, Recycler.LINK_CAPACITY));
            this.elements = new DefaultHandle[Math.min(Recycler.INITIAL_CAPACITY, i4)];
            this.interval = i6;
            this.handleRecycleCount = i6;
            this.maxDelayedQueues = i7;
        }

        private WeakOrderQueue newWeakOrderQueue(Thread thread) {
            return WeakOrderQueue.newQueue(this, thread);
        }

        private void pushLater(DefaultHandle<?> defaultHandle, Thread thread) {
            if (this.maxDelayedQueues == 0) {
                return;
            }
            Map map = (Map) Recycler.DELAYED_RECYCLED.get();
            WeakOrderQueue weakOrderQueue = (WeakOrderQueue) map.get(this);
            if (weakOrderQueue == null) {
                if (map.size() >= this.maxDelayedQueues) {
                    map.put(this, WeakOrderQueue.DUMMY);
                    return;
                }
                weakOrderQueue = newWeakOrderQueue(thread);
                if (weakOrderQueue == null) {
                    return;
                }
                map.put(this, weakOrderQueue);
            } else if (weakOrderQueue == WeakOrderQueue.DUMMY) {
                return;
            }
            weakOrderQueue.add(defaultHandle);
        }

        private void pushNow(DefaultHandle<?> defaultHandle) {
            if ((defaultHandle.recycleId | defaultHandle.lastRecycledId) == 0) {
                int i4 = Recycler.OWN_THREAD_ID;
                defaultHandle.lastRecycledId = i4;
                defaultHandle.recycleId = i4;
                int i5 = this.size;
                if (i5 >= this.maxCapacity || dropHandle(defaultHandle)) {
                    return;
                }
                DefaultHandle<?>[] defaultHandleArr = this.elements;
                if (i5 == defaultHandleArr.length) {
                    this.elements = (DefaultHandle[]) Arrays.copyOf(defaultHandleArr, Math.min(i5 << 1, this.maxCapacity));
                }
                this.elements[i5] = defaultHandle;
                this.size = i5 + 1;
                return;
            }
            throw new IllegalStateException("recycled already");
        }

        private boolean scavenge() {
            if (scavengeSome()) {
                return true;
            }
            this.prev = null;
            this.cursor = this.head;
            return false;
        }

        private boolean scavengeSome() {
            WeakOrderQueue weakOrderQueue;
            WeakOrderQueue weakOrderQueue2;
            boolean z4;
            WeakOrderQueue next;
            WeakOrderQueue weakOrderQueue3 = this.cursor;
            boolean z5 = false;
            if (weakOrderQueue3 == null) {
                weakOrderQueue2 = null;
                weakOrderQueue = this.head;
                if (weakOrderQueue == null) {
                    return false;
                }
            } else {
                weakOrderQueue = weakOrderQueue3;
                weakOrderQueue2 = this.prev;
            }
            while (true) {
                z4 = true;
                if (weakOrderQueue.transfer(this)) {
                    break;
                }
                next = weakOrderQueue.getNext();
                if (weakOrderQueue.get() == null) {
                    if (weakOrderQueue.hasFinalData()) {
                        while (weakOrderQueue.transfer(this)) {
                            z5 = true;
                        }
                    }
                    if (weakOrderQueue2 != null) {
                        weakOrderQueue.reclaimAllSpaceAndUnlink();
                        weakOrderQueue2.setNext(next);
                    }
                } else {
                    weakOrderQueue2 = weakOrderQueue;
                }
                if (next == null || z5) {
                    break;
                }
                weakOrderQueue = next;
            }
            z4 = z5;
            weakOrderQueue = next;
            this.prev = weakOrderQueue2;
            this.cursor = weakOrderQueue;
            return z4;
        }

        boolean dropHandle(DefaultHandle<?> defaultHandle) {
            if (!defaultHandle.hasBeenRecycled) {
                int i4 = this.handleRecycleCount;
                if (i4 < this.interval) {
                    this.handleRecycleCount = i4 + 1;
                    return true;
                }
                this.handleRecycleCount = 0;
                defaultHandle.hasBeenRecycled = true;
            }
            return false;
        }

        int increaseCapacity(int i4) {
            int length = this.elements.length;
            int i5 = this.maxCapacity;
            do {
                length <<= 1;
                if (length >= i4) {
                    break;
                }
            } while (length < i5);
            int min = Math.min(length, i5);
            DefaultHandle<?>[] defaultHandleArr = this.elements;
            if (min != defaultHandleArr.length) {
                this.elements = (DefaultHandle[]) Arrays.copyOf(defaultHandleArr, min);
            }
            return min;
        }

        DefaultHandle<T> newHandle() {
            return new DefaultHandle<>(this);
        }

        DefaultHandle<T> pop() {
            int i4 = this.size;
            if (i4 != 0 || (scavenge() && (i4 = this.size) > 0)) {
                int i5 = i4 - 1;
                DefaultHandle<?>[] defaultHandleArr = this.elements;
                DefaultHandle<T> defaultHandle = (DefaultHandle<T>) defaultHandleArr[i5];
                defaultHandleArr[i5] = null;
                this.size = i5;
                if (defaultHandle.lastRecycledId == defaultHandle.recycleId) {
                    defaultHandle.recycleId = 0;
                    defaultHandle.lastRecycledId = 0;
                    return defaultHandle;
                }
                throw new IllegalStateException("recycled multiple times");
            }
            return null;
        }

        void push(DefaultHandle<?> defaultHandle) {
            Thread currentThread = Thread.currentThread();
            if (this.threadRef.get() == currentThread) {
                pushNow(defaultHandle);
            } else {
                pushLater(defaultHandle, currentThread);
            }
        }

        synchronized void setHead(WeakOrderQueue weakOrderQueue) {
            weakOrderQueue.setNext(this.head);
            this.head = weakOrderQueue;
        }
    }

    static {
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance(Recycler.class);
        logger = internalLoggerFactory;
        NOOP_HANDLE = new Handle() { // from class: io.netty.util.Recycler.1
            @Override // io.netty.util.internal.ObjectPool.Handle
            public void recycle(Object obj) {
            }
        };
        AtomicInteger atomicInteger = new AtomicInteger(Integer.MIN_VALUE);
        ID_GENERATOR = atomicInteger;
        OWN_THREAD_ID = atomicInteger.getAndIncrement();
        int i4 = SystemPropertyUtil.getInt("io.netty.recycler.maxCapacityPerThread", SystemPropertyUtil.getInt("io.netty.recycler.maxCapacity", 4096));
        int i5 = i4 >= 0 ? i4 : 4096;
        DEFAULT_MAX_CAPACITY_PER_THREAD = i5;
        int max = Math.max(2, SystemPropertyUtil.getInt("io.netty.recycler.maxSharedCapacityFactor", 2));
        MAX_SHARED_CAPACITY_FACTOR = max;
        MAX_DELAYED_QUEUES_PER_THREAD = Math.max(0, SystemPropertyUtil.getInt("io.netty.recycler.maxDelayedQueuesPerThread", NettyRuntime.availableProcessors() * 2));
        int safeFindNextPositivePowerOfTwo = MathUtil.safeFindNextPositivePowerOfTwo(Math.max(SystemPropertyUtil.getInt("io.netty.recycler.linkCapacity", 16), 16));
        LINK_CAPACITY = safeFindNextPositivePowerOfTwo;
        int safeFindNextPositivePowerOfTwo2 = MathUtil.safeFindNextPositivePowerOfTwo(SystemPropertyUtil.getInt("io.netty.recycler.ratio", 8));
        RATIO = safeFindNextPositivePowerOfTwo2;
        if (internalLoggerFactory.isDebugEnabled()) {
            if (i5 == 0) {
                internalLoggerFactory.debug("-Dio.netty.recycler.maxCapacityPerThread: disabled");
                internalLoggerFactory.debug("-Dio.netty.recycler.maxSharedCapacityFactor: disabled");
                internalLoggerFactory.debug("-Dio.netty.recycler.linkCapacity: disabled");
                internalLoggerFactory.debug("-Dio.netty.recycler.ratio: disabled");
            } else {
                internalLoggerFactory.debug("-Dio.netty.recycler.maxCapacityPerThread: {}", Integer.valueOf(i5));
                internalLoggerFactory.debug("-Dio.netty.recycler.maxSharedCapacityFactor: {}", Integer.valueOf(max));
                internalLoggerFactory.debug("-Dio.netty.recycler.linkCapacity: {}", Integer.valueOf(safeFindNextPositivePowerOfTwo));
                internalLoggerFactory.debug("-Dio.netty.recycler.ratio: {}", Integer.valueOf(safeFindNextPositivePowerOfTwo2));
            }
        }
        INITIAL_CAPACITY = Math.min(i5, 256);
        DELAYED_RECYCLED = new FastThreadLocal<Map<Stack<?>, WeakOrderQueue>>() { // from class: io.netty.util.Recycler.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.netty.util.concurrent.FastThreadLocal
            public Map<Stack<?>, WeakOrderQueue> initialValue() {
                return new WeakHashMap();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Recycler() {
        this(DEFAULT_MAX_CAPACITY_PER_THREAD);
    }

    public final T get() {
        if (this.maxCapacityPerThread == 0) {
            return newObject(NOOP_HANDLE);
        }
        Stack<T> stack = this.threadLocal.get();
        DefaultHandle<T> pop = stack.pop();
        if (pop == null) {
            pop = stack.newHandle();
            pop.value = newObject(pop);
        }
        return (T) pop.value;
    }

    protected abstract T newObject(Handle<T> handle);

    @Deprecated
    public final boolean recycle(T t4, Handle<T> handle) {
        if (handle == NOOP_HANDLE) {
            return false;
        }
        DefaultHandle defaultHandle = (DefaultHandle) handle;
        if (defaultHandle.stack.parent != this) {
            return false;
        }
        defaultHandle.recycle(t4);
        return true;
    }

    final int threadLocalCapacity() {
        return this.threadLocal.get().elements.length;
    }

    final int threadLocalSize() {
        return this.threadLocal.get().size;
    }

    protected Recycler(int i4) {
        this(i4, MAX_SHARED_CAPACITY_FACTOR);
    }

    protected Recycler(int i4, int i5) {
        this(i4, i5, RATIO, MAX_DELAYED_QUEUES_PER_THREAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class WeakOrderQueue extends WeakReference<Thread> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final WeakOrderQueue DUMMY = new WeakOrderQueue();
        private int handleRecycleCount;
        private final Head head;
        private final int id;
        private final int interval;
        private WeakOrderQueue next;
        private Link tail;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class Head {
            private final AtomicInteger availableSharedCapacity;
            Link link;

            Head(AtomicInteger atomicInteger) {
                this.availableSharedCapacity = atomicInteger;
            }

            private void reclaimSpace(int i4) {
                this.availableSharedCapacity.addAndGet(i4);
            }

            static boolean reserveSpaceForLink(AtomicInteger atomicInteger) {
                int i4;
                do {
                    i4 = atomicInteger.get();
                    if (i4 < Recycler.LINK_CAPACITY) {
                        return false;
                    }
                } while (!atomicInteger.compareAndSet(i4, i4 - Recycler.LINK_CAPACITY));
                return true;
            }

            Link newLink() {
                if (reserveSpaceForLink(this.availableSharedCapacity)) {
                    return new Link();
                }
                return null;
            }

            void reclaimAllSpaceAndUnlink() {
                Link link = this.link;
                this.link = null;
                int i4 = 0;
                while (link != null) {
                    i4 += Recycler.LINK_CAPACITY;
                    Link link2 = link.next;
                    link.next = null;
                    link = link2;
                }
                if (i4 > 0) {
                    reclaimSpace(i4);
                }
            }

            void relink(Link link) {
                reclaimSpace(Recycler.LINK_CAPACITY);
                this.link = link;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class Link extends AtomicInteger {
            final DefaultHandle<?>[] elements = new DefaultHandle[Recycler.LINK_CAPACITY];
            Link next;
            int readIndex;

            Link() {
            }
        }

        private WeakOrderQueue() {
            super(null);
            this.id = Recycler.ID_GENERATOR.getAndIncrement();
            this.head = new Head(null);
            this.interval = 0;
        }

        static WeakOrderQueue newQueue(Stack<?> stack, Thread thread) {
            if (Head.reserveSpaceForLink(stack.availableSharedCapacity)) {
                WeakOrderQueue weakOrderQueue = new WeakOrderQueue(stack, thread);
                stack.setHead(weakOrderQueue);
                return weakOrderQueue;
            }
            return null;
        }

        void add(DefaultHandle<?> defaultHandle) {
            defaultHandle.lastRecycledId = this.id;
            int i4 = this.handleRecycleCount;
            if (i4 < this.interval) {
                this.handleRecycleCount = i4 + 1;
                return;
            }
            this.handleRecycleCount = 0;
            Link link = this.tail;
            int i5 = link.get();
            if (i5 == Recycler.LINK_CAPACITY) {
                Link newLink = this.head.newLink();
                if (newLink == null) {
                    return;
                }
                link.next = newLink;
                this.tail = newLink;
                i5 = newLink.get();
                link = newLink;
            }
            link.elements[i5] = defaultHandle;
            defaultHandle.stack = null;
            link.lazySet(i5 + 1);
        }

        WeakOrderQueue getNext() {
            return this.next;
        }

        boolean hasFinalData() {
            Link link = this.tail;
            return link.readIndex != link.get();
        }

        void reclaimAllSpaceAndUnlink() {
            this.head.reclaimAllSpaceAndUnlink();
            this.next = null;
        }

        void setNext(WeakOrderQueue weakOrderQueue) {
            this.next = weakOrderQueue;
        }

        boolean transfer(Stack<?> stack) {
            Link link;
            Link link2 = this.head.link;
            if (link2 == null) {
                return false;
            }
            if (link2.readIndex == Recycler.LINK_CAPACITY) {
                link2 = link2.next;
                if (link2 == null) {
                    return false;
                }
                this.head.relink(link2);
            }
            int i4 = link2.readIndex;
            int i5 = link2.get();
            int i6 = i5 - i4;
            if (i6 == 0) {
                return false;
            }
            int i7 = stack.size;
            int i8 = i6 + i7;
            if (i8 > stack.elements.length) {
                i5 = Math.min((stack.increaseCapacity(i8) + i4) - i7, i5);
            }
            if (i4 != i5) {
                DefaultHandle<?>[] defaultHandleArr = link2.elements;
                DefaultHandle<?>[] defaultHandleArr2 = stack.elements;
                while (i4 < i5) {
                    DefaultHandle<?> defaultHandle = defaultHandleArr[i4];
                    int i9 = defaultHandle.recycleId;
                    if (i9 == 0) {
                        defaultHandle.recycleId = defaultHandle.lastRecycledId;
                    } else if (i9 != defaultHandle.lastRecycledId) {
                        throw new IllegalStateException("recycled already");
                    }
                    defaultHandleArr[i4] = null;
                    if (!stack.dropHandle(defaultHandle)) {
                        defaultHandle.stack = stack;
                        defaultHandleArr2[i7] = defaultHandle;
                        i7++;
                    }
                    i4++;
                }
                if (i5 == Recycler.LINK_CAPACITY && (link = link2.next) != null) {
                    this.head.relink(link);
                }
                link2.readIndex = i5;
                if (stack.size == i7) {
                    return false;
                }
                stack.size = i7;
                return true;
            }
            return false;
        }

        private WeakOrderQueue(Stack<?> stack, Thread thread) {
            super(thread);
            this.id = Recycler.ID_GENERATOR.getAndIncrement();
            this.tail = new Link();
            Head head = new Head(stack.availableSharedCapacity);
            this.head = head;
            head.link = this.tail;
            int i4 = ((Stack) stack).interval;
            this.interval = i4;
            this.handleRecycleCount = i4;
        }
    }

    protected Recycler(int i4, int i5, int i6, int i7) {
        this.threadLocal = new FastThreadLocal<Stack<T>>() { // from class: io.netty.util.Recycler.2
            @Override // io.netty.util.concurrent.FastThreadLocal
            protected /* bridge */ /* synthetic */ void onRemoval(Object obj) throws Exception {
                onRemoval((Stack) ((Stack) obj));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.netty.util.concurrent.FastThreadLocal
            public Stack<T> initialValue() {
                return new Stack<>(Recycler.this, Thread.currentThread(), Recycler.this.maxCapacityPerThread, Recycler.this.maxSharedCapacityFactor, Recycler.this.interval, Recycler.this.maxDelayedQueuesPerThread);
            }

            protected void onRemoval(Stack<T> stack) {
                if (stack.threadRef.get() == Thread.currentThread() && Recycler.DELAYED_RECYCLED.isSet()) {
                    ((Map) Recycler.DELAYED_RECYCLED.get()).remove(stack);
                }
            }
        };
        this.interval = MathUtil.safeFindNextPositivePowerOfTwo(i6);
        if (i4 <= 0) {
            this.maxCapacityPerThread = 0;
            this.maxSharedCapacityFactor = 1;
            this.maxDelayedQueuesPerThread = 0;
            return;
        }
        this.maxCapacityPerThread = i4;
        this.maxSharedCapacityFactor = Math.max(1, i5);
        this.maxDelayedQueuesPerThread = Math.max(0, i7);
    }
}
