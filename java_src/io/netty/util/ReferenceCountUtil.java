package io.netty.util;

import io.netty.util.internal.StringUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
/* loaded from: classes6.dex */
public final class ReferenceCountUtil {
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(ReferenceCountUtil.class);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class ReleasingTask implements Runnable {
        private final int decrement;
        private final ReferenceCounted obj;

        ReleasingTask(ReferenceCounted referenceCounted, int i4) {
            this.obj = referenceCounted;
            this.decrement = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.obj.release(this.decrement)) {
                    ReferenceCountUtil.logger.warn("Non-zero refCnt: {}", this);
                } else {
                    ReferenceCountUtil.logger.debug("Released: {}", this);
                }
            } catch (Exception e5) {
                ReferenceCountUtil.logger.warn("Failed to release an object: {}", this.obj, e5);
            }
        }

        public String toString() {
            return StringUtil.simpleClassName(this.obj) + ".release(" + this.decrement + ") refCnt: " + this.obj.refCnt();
        }
    }

    static {
        ResourceLeakDetector.addExclusions(ReferenceCountUtil.class, "touch");
    }

    private ReferenceCountUtil() {
    }

    public static int refCnt(Object obj) {
        if (obj instanceof ReferenceCounted) {
            return ((ReferenceCounted) obj).refCnt();
        }
        return -1;
    }

    public static boolean release(Object obj) {
        if (obj instanceof ReferenceCounted) {
            return ((ReferenceCounted) obj).release();
        }
        return false;
    }

    @Deprecated
    public static <T> T releaseLater(T t4) {
        return (T) releaseLater(t4, 1);
    }

    public static <T> T retain(T t4) {
        return t4 instanceof ReferenceCounted ? (T) ((ReferenceCounted) t4).retain() : t4;
    }

    public static void safeRelease(Object obj) {
        try {
            release(obj);
        } catch (Throwable th) {
            logger.warn("Failed to release a message: {}", obj, th);
        }
    }

    public static <T> T touch(T t4) {
        return t4 instanceof ReferenceCounted ? (T) ((ReferenceCounted) t4).touch() : t4;
    }

    @Deprecated
    public static <T> T releaseLater(T t4, int i4) {
        if (t4 instanceof ReferenceCounted) {
            ThreadDeathWatcher.watch(Thread.currentThread(), new ReleasingTask((ReferenceCounted) t4, i4));
        }
        return t4;
    }

    public static boolean release(Object obj, int i4) {
        if (obj instanceof ReferenceCounted) {
            return ((ReferenceCounted) obj).release(i4);
        }
        return false;
    }

    public static <T> T retain(T t4, int i4) {
        return t4 instanceof ReferenceCounted ? (T) ((ReferenceCounted) t4).retain(i4) : t4;
    }

    public static void safeRelease(Object obj, int i4) {
        try {
            release(obj, i4);
        } catch (Throwable th) {
            if (logger.isWarnEnabled()) {
                logger.warn("Failed to release a message: {} (decrement: {})", obj, Integer.valueOf(i4), th);
            }
        }
    }

    public static <T> T touch(T t4, Object obj) {
        return t4 instanceof ReferenceCounted ? (T) ((ReferenceCounted) t4).touch(obj) : t4;
    }
}
