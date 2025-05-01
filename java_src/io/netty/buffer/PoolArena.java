package io.netty.buffer;

import io.netty.util.internal.LongCounter;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.StringUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public abstract class PoolArena<T> implements PoolArenaMetric {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final boolean HAS_UNSAFE = PlatformDependent.hasUnsafe();
    static final int numTinySubpagePools = 32;
    private long allocationsNormal;
    private final List<PoolChunkListMetric> chunkListMetrics;
    final int chunkSize;
    private long deallocationsNormal;
    private long deallocationsSmall;
    private long deallocationsTiny;
    final int directMemoryCacheAlignment;
    final int directMemoryCacheAlignmentMask;
    private final int maxOrder;
    final int numSmallSubpagePools;
    final int pageShifts;
    final int pageSize;
    final PooledByteBufAllocator parent;
    private final PoolChunkList<T> q000;
    private final PoolChunkList<T> q025;
    private final PoolChunkList<T> q050;
    private final PoolChunkList<T> q075;
    private final PoolChunkList<T> q100;
    private final PoolChunkList<T> qInit;
    private final PoolSubpage<T>[] smallSubpagePools;
    final int subpageOverflowMask;
    private final LongCounter allocationsTiny = PlatformDependent.newLongCounter();
    private final LongCounter allocationsSmall = PlatformDependent.newLongCounter();
    private final LongCounter allocationsHuge = PlatformDependent.newLongCounter();
    private final LongCounter activeBytesHuge = PlatformDependent.newLongCounter();
    private final LongCounter deallocationsHuge = PlatformDependent.newLongCounter();
    final AtomicInteger numThreadCaches = new AtomicInteger();
    private final PoolSubpage<T>[] tinySubpagePools = newSubpagePoolArray(32);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.netty.buffer.PoolArena$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$buffer$PoolArena$SizeClass;

        static {
            int[] iArr = new int[SizeClass.values().length];
            $SwitchMap$io$netty$buffer$PoolArena$SizeClass = iArr;
            try {
                iArr[SizeClass.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$buffer$PoolArena$SizeClass[SizeClass.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$buffer$PoolArena$SizeClass[SizeClass.Tiny.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes6.dex */
    static final class DirectArena extends PoolArena<ByteBuffer> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public DirectArena(PooledByteBufAllocator pooledByteBufAllocator, int i4, int i5, int i6, int i7, int i8) {
            super(pooledByteBufAllocator, i4, i5, i6, i7, i8);
        }

        private static ByteBuffer allocateDirect(int i4) {
            return PlatformDependent.useDirectBufferNoCleaner() ? PlatformDependent.allocateDirectNoCleaner(i4) : ByteBuffer.allocateDirect(i4);
        }

        @Override // io.netty.buffer.PoolArena
        protected void destroyChunk(PoolChunk<ByteBuffer> poolChunk) {
            if (PlatformDependent.useDirectBufferNoCleaner()) {
                PlatformDependent.freeDirectNoCleaner(poolChunk.memory);
            } else {
                PlatformDependent.freeDirectBuffer(poolChunk.memory);
            }
        }

        @Override // io.netty.buffer.PoolArena
        boolean isDirect() {
            return true;
        }

        @Override // io.netty.buffer.PoolArena
        protected PooledByteBuf<ByteBuffer> newByteBuf(int i4) {
            if (PoolArena.HAS_UNSAFE) {
                return PooledUnsafeDirectByteBuf.newInstance(i4);
            }
            return PooledDirectByteBuf.newInstance(i4);
        }

        @Override // io.netty.buffer.PoolArena
        protected PoolChunk<ByteBuffer> newChunk(int i4, int i5, int i6, int i7) {
            int i8 = this.directMemoryCacheAlignment;
            if (i8 == 0) {
                return new PoolChunk<>(this, allocateDirect(i7), i4, i5, i6, i7, 0);
            }
            ByteBuffer allocateDirect = allocateDirect(i8 + i7);
            return new PoolChunk<>(this, allocateDirect, i4, i5, i6, i7, offsetCacheLine(allocateDirect));
        }

        @Override // io.netty.buffer.PoolArena
        protected PoolChunk<ByteBuffer> newUnpooledChunk(int i4) {
            int i5 = this.directMemoryCacheAlignment;
            if (i5 == 0) {
                return new PoolChunk<>(this, allocateDirect(i4), i4, 0);
            }
            ByteBuffer allocateDirect = allocateDirect(i5 + i4);
            return new PoolChunk<>(this, allocateDirect, i4, offsetCacheLine(allocateDirect));
        }

        int offsetCacheLine(ByteBuffer byteBuffer) {
            return this.directMemoryCacheAlignment - (PoolArena.HAS_UNSAFE ? (int) (PlatformDependent.directBufferAddress(byteBuffer) & this.directMemoryCacheAlignmentMask) : 0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public void memoryCopy(ByteBuffer byteBuffer, int i4, PooledByteBuf<ByteBuffer> pooledByteBuf, int i5) {
            if (i5 == 0) {
                return;
            }
            if (PoolArena.HAS_UNSAFE) {
                PlatformDependent.copyMemory(PlatformDependent.directBufferAddress(byteBuffer) + i4, PlatformDependent.directBufferAddress(pooledByteBuf.memory) + pooledByteBuf.offset, i5);
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer internalNioBuffer = pooledByteBuf.internalNioBuffer();
            duplicate.position(i4).limit(i4 + i5);
            internalNioBuffer.position(pooledByteBuf.offset);
            internalNioBuffer.put(duplicate);
        }
    }

    /* loaded from: classes6.dex */
    static final class HeapArena extends PoolArena<byte[]> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public HeapArena(PooledByteBufAllocator pooledByteBufAllocator, int i4, int i5, int i6, int i7, int i8) {
            super(pooledByteBufAllocator, i4, i5, i6, i7, i8);
        }

        private static byte[] newByteArray(int i4) {
            return PlatformDependent.allocateUninitializedArray(i4);
        }

        @Override // io.netty.buffer.PoolArena
        protected void destroyChunk(PoolChunk<byte[]> poolChunk) {
        }

        @Override // io.netty.buffer.PoolArena
        boolean isDirect() {
            return false;
        }

        @Override // io.netty.buffer.PoolArena
        protected PooledByteBuf<byte[]> newByteBuf(int i4) {
            return PoolArena.HAS_UNSAFE ? PooledUnsafeHeapByteBuf.newUnsafeInstance(i4) : PooledHeapByteBuf.newInstance(i4);
        }

        @Override // io.netty.buffer.PoolArena
        protected PoolChunk<byte[]> newChunk(int i4, int i5, int i6, int i7) {
            return new PoolChunk<>(this, newByteArray(i7), i4, i5, i6, i7, 0);
        }

        @Override // io.netty.buffer.PoolArena
        protected PoolChunk<byte[]> newUnpooledChunk(int i4) {
            return new PoolChunk<>(this, newByteArray(i4), i4, 0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.netty.buffer.PoolArena
        public void memoryCopy(byte[] bArr, int i4, PooledByteBuf<byte[]> pooledByteBuf, int i5) {
            if (i5 == 0) {
                return;
            }
            System.arraycopy(bArr, i4, pooledByteBuf.memory, pooledByteBuf.offset, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public enum SizeClass {
        Tiny,
        Small,
        Normal
    }

    protected PoolArena(PooledByteBufAllocator pooledByteBufAllocator, int i4, int i5, int i6, int i7, int i8) {
        this.parent = pooledByteBufAllocator;
        this.pageSize = i4;
        this.maxOrder = i5;
        this.pageShifts = i6;
        this.chunkSize = i7;
        this.directMemoryCacheAlignment = i8;
        this.directMemoryCacheAlignmentMask = i8 - 1;
        this.subpageOverflowMask = (i4 - 1) ^ (-1);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            PoolSubpage<T>[] poolSubpageArr = this.tinySubpagePools;
            if (i10 >= poolSubpageArr.length) {
                break;
            }
            poolSubpageArr[i10] = newSubpagePoolHead(i4);
            i10++;
        }
        int i11 = i6 - 9;
        this.numSmallSubpagePools = i11;
        this.smallSubpagePools = newSubpagePoolArray(i11);
        while (true) {
            PoolSubpage<T>[] poolSubpageArr2 = this.smallSubpagePools;
            if (i9 < poolSubpageArr2.length) {
                poolSubpageArr2[i9] = newSubpagePoolHead(i4);
                i9++;
            } else {
                PoolChunkList<T> poolChunkList = new PoolChunkList<>(this, null, 100, Integer.MAX_VALUE, i7);
                this.q100 = poolChunkList;
                PoolChunkList<T> poolChunkList2 = new PoolChunkList<>(this, poolChunkList, 75, 100, i7);
                this.q075 = poolChunkList2;
                PoolChunkList<T> poolChunkList3 = new PoolChunkList<>(this, poolChunkList2, 50, 100, i7);
                this.q050 = poolChunkList3;
                PoolChunkList<T> poolChunkList4 = new PoolChunkList<>(this, poolChunkList3, 25, 75, i7);
                this.q025 = poolChunkList4;
                PoolChunkList<T> poolChunkList5 = new PoolChunkList<>(this, poolChunkList4, 1, 50, i7);
                this.q000 = poolChunkList5;
                PoolChunkList<T> poolChunkList6 = new PoolChunkList<>(this, poolChunkList5, Integer.MIN_VALUE, 25, i7);
                this.qInit = poolChunkList6;
                poolChunkList.prevList(poolChunkList2);
                poolChunkList2.prevList(poolChunkList3);
                poolChunkList3.prevList(poolChunkList4);
                poolChunkList4.prevList(poolChunkList5);
                poolChunkList5.prevList(null);
                poolChunkList6.prevList(poolChunkList6);
                ArrayList arrayList = new ArrayList(6);
                arrayList.add(poolChunkList6);
                arrayList.add(poolChunkList5);
                arrayList.add(poolChunkList4);
                arrayList.add(poolChunkList3);
                arrayList.add(poolChunkList2);
                arrayList.add(poolChunkList);
                this.chunkListMetrics = Collections.unmodifiableList(arrayList);
                return;
            }
        }
    }

    private void allocateHuge(PooledByteBuf<T> pooledByteBuf, int i4) {
        PoolChunk<T> newUnpooledChunk = newUnpooledChunk(i4);
        this.activeBytesHuge.add(newUnpooledChunk.chunkSize());
        pooledByteBuf.initUnpooled(newUnpooledChunk, i4);
        this.allocationsHuge.increment();
    }

    private void allocateNormal(PooledByteBuf<T> pooledByteBuf, int i4, int i5) {
        if (this.q050.allocate(pooledByteBuf, i4, i5) || this.q025.allocate(pooledByteBuf, i4, i5) || this.q000.allocate(pooledByteBuf, i4, i5) || this.qInit.allocate(pooledByteBuf, i4, i5) || this.q075.allocate(pooledByteBuf, i4, i5)) {
            return;
        }
        PoolChunk<T> newChunk = newChunk(this.pageSize, this.maxOrder, this.pageShifts, this.chunkSize);
        newChunk.allocate(pooledByteBuf, i4, i5);
        this.qInit.add(newChunk);
    }

    private static void appendPoolSubPages(StringBuilder sb, PoolSubpage<?>[] poolSubpageArr) {
        for (int i4 = 0; i4 < poolSubpageArr.length; i4++) {
            PoolSubpage<?> poolSubpage = poolSubpageArr[i4];
            if (poolSubpage.next != poolSubpage) {
                sb.append(StringUtil.NEWLINE);
                sb.append(i4);
                sb.append(": ");
                PoolSubpage poolSubpage2 = poolSubpage.next;
                do {
                    sb.append(poolSubpage2);
                    poolSubpage2 = poolSubpage2.next;
                } while (poolSubpage2 != poolSubpage);
            }
        }
    }

    private void destroyPoolChunkLists(PoolChunkList<T>... poolChunkListArr) {
        for (PoolChunkList<T> poolChunkList : poolChunkListArr) {
            poolChunkList.destroy(this);
        }
    }

    private static void destroyPoolSubPages(PoolSubpage<?>[] poolSubpageArr) {
        for (PoolSubpage<?> poolSubpage : poolSubpageArr) {
            poolSubpage.destroy();
        }
    }

    private void incTinySmallAllocation(boolean z4) {
        if (z4) {
            this.allocationsTiny.increment();
        } else {
            this.allocationsSmall.increment();
        }
    }

    static boolean isTiny(int i4) {
        return (i4 & (-512)) == 0;
    }

    private PoolSubpage<T>[] newSubpagePoolArray(int i4) {
        return new PoolSubpage[i4];
    }

    private PoolSubpage<T> newSubpagePoolHead(int i4) {
        PoolSubpage<T> poolSubpage = new PoolSubpage<>(i4);
        poolSubpage.prev = poolSubpage;
        poolSubpage.next = poolSubpage;
        return poolSubpage;
    }

    private SizeClass sizeClass(int i4) {
        if (isTinyOrSmall(i4)) {
            return isTiny(i4) ? SizeClass.Tiny : SizeClass.Small;
        }
        return SizeClass.Normal;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int smallIdx(int i4) {
        int i5 = i4 >>> 10;
        int i6 = 0;
        while (i5 != 0) {
            i5 >>>= 1;
            i6++;
        }
        return i6;
    }

    private static List<PoolSubpageMetric> subPageMetricList(PoolSubpage<?>[] poolSubpageArr) {
        ArrayList arrayList = new ArrayList();
        for (PoolSubpage<?> poolSubpage : poolSubpageArr) {
            PoolSubpage poolSubpage2 = poolSubpage.next;
            if (poolSubpage2 != poolSubpage) {
                do {
                    arrayList.add(poolSubpage2);
                    poolSubpage2 = poolSubpage2.next;
                } while (poolSubpage2 != poolSubpage);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int tinyIdx(int i4) {
        return i4 >>> 4;
    }

    int alignCapacity(int i4) {
        int i5 = this.directMemoryCacheAlignmentMask & i4;
        return i5 == 0 ? i4 : (i4 + this.directMemoryCacheAlignment) - i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PooledByteBuf<T> allocate(PoolThreadCache poolThreadCache, int i4, int i5) {
        PooledByteBuf<T> newByteBuf = newByteBuf(i5);
        allocate(poolThreadCache, newByteBuf, i4);
        return newByteBuf;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public List<PoolChunkListMetric> chunkLists() {
        return this.chunkListMetrics;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void destroyChunk(PoolChunk<T> poolChunk);

    protected final void finalize() throws Throwable {
        try {
            super.finalize();
            destroyPoolSubPages(this.smallSubpagePools);
            destroyPoolSubPages(this.tinySubpagePools);
            destroyPoolChunkLists(this.qInit, this.q000, this.q025, this.q050, this.q075, this.q100);
        } catch (Throwable th) {
            destroyPoolSubPages(this.smallSubpagePools);
            destroyPoolSubPages(this.tinySubpagePools);
            destroyPoolChunkLists(this.qInit, this.q000, this.q025, this.q050, this.q075, this.q100);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PoolSubpage<T> findSubpagePoolHead(int i4) {
        PoolSubpage<T>[] poolSubpageArr;
        int i5;
        if (isTiny(i4)) {
            i5 = i4 >>> 4;
            poolSubpageArr = this.tinySubpagePools;
        } else {
            int i6 = 0;
            int i7 = i4 >>> 10;
            while (i7 != 0) {
                i7 >>>= 1;
                i6++;
            }
            int i8 = i6;
            poolSubpageArr = this.smallSubpagePools;
            i5 = i8;
        }
        return poolSubpageArr[i5];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void free(PoolChunk<T> poolChunk, ByteBuffer byteBuffer, long j4, int i4, PoolThreadCache poolThreadCache) {
        if (poolChunk.unpooled) {
            int chunkSize = poolChunk.chunkSize();
            destroyChunk(poolChunk);
            this.activeBytesHuge.add(-chunkSize);
            this.deallocationsHuge.increment();
            return;
        }
        SizeClass sizeClass = sizeClass(i4);
        if (poolThreadCache == null || !poolThreadCache.add(this, poolChunk, byteBuffer, j4, i4, sizeClass)) {
            freeChunk(poolChunk, j4, sizeClass, byteBuffer, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void freeChunk(PoolChunk<T> poolChunk, long j4, SizeClass sizeClass, ByteBuffer byteBuffer, boolean z4) {
        boolean z5;
        synchronized (this) {
            z5 = true;
            if (!z4) {
                int i4 = AnonymousClass1.$SwitchMap$io$netty$buffer$PoolArena$SizeClass[sizeClass.ordinal()];
                if (i4 == 1) {
                    this.deallocationsNormal++;
                } else if (i4 == 2) {
                    this.deallocationsSmall++;
                } else if (i4 == 3) {
                    this.deallocationsTiny++;
                } else {
                    throw new Error();
                }
            }
            if (poolChunk.parent.free(poolChunk, j4, byteBuffer)) {
                z5 = false;
            }
        }
        if (z5) {
            destroyChunk(poolChunk);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean isDirect();

    boolean isTinyOrSmall(int i4) {
        return (i4 & this.subpageOverflowMask) == 0;
    }

    protected abstract void memoryCopy(T t4, int i4, PooledByteBuf<T> pooledByteBuf, int i5);

    protected abstract PooledByteBuf<T> newByteBuf(int i4);

    protected abstract PoolChunk<T> newChunk(int i4, int i5, int i6, int i7);

    protected abstract PoolChunk<T> newUnpooledChunk(int i4);

    int normalizeCapacity(int i4) {
        ObjectUtil.checkPositiveOrZero(i4, "reqCapacity");
        if (i4 >= this.chunkSize) {
            return this.directMemoryCacheAlignment == 0 ? i4 : alignCapacity(i4);
        } else if (isTiny(i4)) {
            if (this.directMemoryCacheAlignment > 0) {
                return alignCapacity(i4);
            }
            return (i4 & 15) == 0 ? i4 : (i4 & (-16)) + 16;
        } else {
            int i5 = i4 - 1;
            int i6 = i5 | (i5 >>> 1);
            int i7 = i6 | (i6 >>> 2);
            int i8 = i7 | (i7 >>> 4);
            int i9 = i8 | (i8 >>> 8);
            int i10 = (i9 | (i9 >>> 16)) + 1;
            return i10 < 0 ? i10 >>> 1 : i10;
        }
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveAllocations() {
        long j4;
        long value = ((this.allocationsTiny.value() + this.allocationsSmall.value()) + this.allocationsHuge.value()) - this.deallocationsHuge.value();
        synchronized (this) {
            j4 = value + (this.allocationsNormal - ((this.deallocationsTiny + this.deallocationsSmall) + this.deallocationsNormal));
        }
        return Math.max(j4, 0L);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveBytes() {
        long value = this.activeBytesHuge.value();
        synchronized (this) {
            for (int i4 = 0; i4 < this.chunkListMetrics.size(); i4++) {
                for (PoolChunkMetric poolChunkMetric : this.chunkListMetrics.get(i4)) {
                    value += poolChunkMetric.chunkSize();
                }
            }
        }
        return Math.max(0L, value);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveHugeAllocations() {
        return Math.max(numHugeAllocations() - numHugeDeallocations(), 0L);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveNormalAllocations() {
        long j4;
        synchronized (this) {
            j4 = this.allocationsNormal - this.deallocationsNormal;
        }
        return Math.max(j4, 0L);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveSmallAllocations() {
        return Math.max(numSmallAllocations() - numSmallDeallocations(), 0L);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveTinyAllocations() {
        return Math.max(numTinyAllocations() - numTinyDeallocations(), 0L);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numAllocations() {
        long j4;
        synchronized (this) {
            j4 = this.allocationsNormal;
        }
        return this.allocationsTiny.value() + this.allocationsSmall.value() + j4 + this.allocationsHuge.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numChunkLists() {
        return this.chunkListMetrics.size();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numDeallocations() {
        long j4;
        synchronized (this) {
            j4 = this.deallocationsTiny + this.deallocationsSmall + this.deallocationsNormal;
        }
        return j4 + this.deallocationsHuge.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numHugeAllocations() {
        return this.allocationsHuge.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numHugeDeallocations() {
        return this.deallocationsHuge.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numNormalAllocations() {
        return this.allocationsNormal;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numNormalDeallocations() {
        return this.deallocationsNormal;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numSmallAllocations() {
        return this.allocationsSmall.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numSmallDeallocations() {
        return this.deallocationsSmall;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numSmallSubpages() {
        return this.smallSubpagePools.length;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numThreadCaches() {
        return this.numThreadCaches.get();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numTinyAllocations() {
        return this.allocationsTiny.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numTinyDeallocations() {
        return this.deallocationsTiny;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numTinySubpages() {
        return this.tinySubpagePools.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reallocate(PooledByteBuf<T> pooledByteBuf, int i4, boolean z4) {
        int i5 = pooledByteBuf.length;
        if (i5 == i4) {
            return;
        }
        PoolChunk<T> poolChunk = pooledByteBuf.chunk;
        ByteBuffer byteBuffer = pooledByteBuf.tmpNioBuf;
        long j4 = pooledByteBuf.handle;
        T t4 = pooledByteBuf.memory;
        int i6 = pooledByteBuf.offset;
        int i7 = pooledByteBuf.maxLength;
        allocate(this.parent.threadCache(), pooledByteBuf, i4);
        if (i4 > i5) {
            i4 = i5;
        } else {
            pooledByteBuf.trimIndicesToCapacity(i4);
        }
        memoryCopy(t4, i6, pooledByteBuf, i4);
        if (z4) {
            free(poolChunk, byteBuffer, j4, i7, pooledByteBuf.cache);
        }
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public List<PoolSubpageMetric> smallSubpages() {
        return subPageMetricList(this.smallSubpagePools);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public List<PoolSubpageMetric> tinySubpages() {
        return subPageMetricList(this.tinySubpagePools);
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("Chunk(s) at 0~25%:");
        String str = StringUtil.NEWLINE;
        sb.append(str);
        sb.append(this.qInit);
        sb.append(str);
        sb.append("Chunk(s) at 0~50%:");
        sb.append(str);
        sb.append(this.q000);
        sb.append(str);
        sb.append("Chunk(s) at 25~75%:");
        sb.append(str);
        sb.append(this.q025);
        sb.append(str);
        sb.append("Chunk(s) at 50~100%:");
        sb.append(str);
        sb.append(this.q050);
        sb.append(str);
        sb.append("Chunk(s) at 75~100%:");
        sb.append(str);
        sb.append(this.q075);
        sb.append(str);
        sb.append("Chunk(s) at 100%:");
        sb.append(str);
        sb.append(this.q100);
        sb.append(str);
        sb.append("tiny subpages:");
        appendPoolSubPages(sb, this.tinySubpagePools);
        sb.append(str);
        sb.append("small subpages:");
        appendPoolSubPages(sb, this.smallSubpagePools);
        sb.append(str);
        return sb.toString();
    }

    private void allocate(PoolThreadCache poolThreadCache, PooledByteBuf<T> pooledByteBuf, int i4) {
        int smallIdx;
        PoolSubpage<T>[] poolSubpageArr;
        int normalizeCapacity = normalizeCapacity(i4);
        if (isTinyOrSmall(normalizeCapacity)) {
            boolean isTiny = isTiny(normalizeCapacity);
            if (isTiny) {
                if (poolThreadCache.allocateTiny(this, pooledByteBuf, i4, normalizeCapacity)) {
                    return;
                }
                smallIdx = tinyIdx(normalizeCapacity);
                poolSubpageArr = this.tinySubpagePools;
            } else if (poolThreadCache.allocateSmall(this, pooledByteBuf, i4, normalizeCapacity)) {
                return;
            } else {
                smallIdx = smallIdx(normalizeCapacity);
                poolSubpageArr = this.smallSubpagePools;
            }
            PoolSubpage<T> poolSubpage = poolSubpageArr[smallIdx];
            synchronized (poolSubpage) {
                PoolSubpage<T> poolSubpage2 = poolSubpage.next;
                if (poolSubpage2 != poolSubpage) {
                    poolSubpage2.chunk.initBufWithSubpage(pooledByteBuf, null, poolSubpage2.allocate(), i4);
                    incTinySmallAllocation(isTiny);
                    return;
                }
                synchronized (this) {
                    allocateNormal(pooledByteBuf, i4, normalizeCapacity);
                }
                incTinySmallAllocation(isTiny);
            }
        } else if (normalizeCapacity <= this.chunkSize) {
            if (poolThreadCache.allocateNormal(this, pooledByteBuf, i4, normalizeCapacity)) {
                return;
            }
            synchronized (this) {
                allocateNormal(pooledByteBuf, i4, normalizeCapacity);
                this.allocationsNormal++;
            }
        } else {
            allocateHuge(pooledByteBuf, i4);
        }
    }
}
