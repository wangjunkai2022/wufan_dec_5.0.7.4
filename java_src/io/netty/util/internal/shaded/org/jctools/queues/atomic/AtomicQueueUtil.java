package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes6.dex */
final class AtomicQueueUtil {
    AtomicQueueUtil() {
    }

    static AtomicLongArray allocateLongArray(int i4) {
        return new AtomicLongArray(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> AtomicReferenceArray<E> allocateRefArray(int i4) {
        return new AtomicReferenceArray<>(i4);
    }

    static int calcCircularLongElementOffset(long j4, int i4) {
        return (int) (j4 & i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int calcCircularRefElementOffset(long j4, long j5) {
        return (int) (j4 & j5);
    }

    static int calcLongElementOffset(long j4) {
        return (int) j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int calcRefElementOffset(long j4) {
        return (int) j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int length(AtomicReferenceArray<?> atomicReferenceArray) {
        return atomicReferenceArray.length();
    }

    static long lpLongElement(AtomicLongArray atomicLongArray, int i4) {
        return atomicLongArray.get(i4);
    }

    static <E> E lpRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i4) {
        return atomicReferenceArray.get(i4);
    }

    static long lvLongElement(AtomicLongArray atomicLongArray, int i4) {
        return atomicLongArray.get(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> E lvRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i4) {
        return atomicReferenceArray.get(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int modifiedCalcCircularRefElementOffset(long j4, long j5) {
        return ((int) (j4 & j5)) >> 1;
    }

    static int nextArrayOffset(AtomicReferenceArray<?> atomicReferenceArray) {
        return length(atomicReferenceArray) - 1;
    }

    static void soLongElement(AtomicLongArray atomicLongArray, int i4, long j4) {
        atomicLongArray.lazySet(i4, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void soRefElement(AtomicReferenceArray atomicReferenceArray, int i4, Object obj) {
        atomicReferenceArray.lazySet(i4, obj);
    }

    static void spLongElement(AtomicLongArray atomicLongArray, int i4, long j4) {
        atomicLongArray.lazySet(i4, j4);
    }

    static <E> void spRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i4, E e5) {
        atomicReferenceArray.lazySet(i4, e5);
    }

    static <E> void svRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i4, E e5) {
        atomicReferenceArray.set(i4, e5);
    }
}
