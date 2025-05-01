package io.netty.util.concurrent;

import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.StringUtil;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes6.dex */
public class DefaultThreadFactory implements ThreadFactory {
    private static final AtomicInteger poolId = new AtomicInteger();
    private final boolean daemon;
    private final AtomicInteger nextId;
    private final String prefix;
    private final int priority;
    protected final ThreadGroup threadGroup;

    public DefaultThreadFactory(Class<?> cls) {
        this(cls, false, 5);
    }

    public static String toPoolName(Class<?> cls) {
        ObjectUtil.checkNotNull(cls, "poolType");
        String simpleClassName = StringUtil.simpleClassName(cls);
        int length = simpleClassName.length();
        if (length != 0) {
            if (length != 1) {
                if (Character.isUpperCase(simpleClassName.charAt(0)) && Character.isLowerCase(simpleClassName.charAt(1))) {
                    return Character.toLowerCase(simpleClassName.charAt(0)) + simpleClassName.substring(1);
                }
                return simpleClassName;
            }
            return simpleClassName.toLowerCase(Locale.US);
        }
        return "unknown";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Runnable wrap = FastThreadLocalRunnable.wrap(runnable);
        Thread newThread = newThread(wrap, this.prefix + this.nextId.incrementAndGet());
        try {
            boolean isDaemon = newThread.isDaemon();
            boolean z4 = this.daemon;
            if (isDaemon != z4) {
                newThread.setDaemon(z4);
            }
            int priority = newThread.getPriority();
            int i4 = this.priority;
            if (priority != i4) {
                newThread.setPriority(i4);
            }
        } catch (Exception unused) {
        }
        return newThread;
    }

    public DefaultThreadFactory(String str) {
        this(str, false, 5);
    }

    public DefaultThreadFactory(Class<?> cls, boolean z4) {
        this(cls, z4, 5);
    }

    public DefaultThreadFactory(String str, boolean z4) {
        this(str, z4, 5);
    }

    public DefaultThreadFactory(Class<?> cls, int i4) {
        this(cls, false, i4);
    }

    public DefaultThreadFactory(String str, int i4) {
        this(str, false, i4);
    }

    protected Thread newThread(Runnable runnable, String str) {
        return new FastThreadLocalThread(this.threadGroup, runnable, str);
    }

    public DefaultThreadFactory(Class<?> cls, boolean z4, int i4) {
        this(toPoolName(cls), z4, i4);
    }

    public DefaultThreadFactory(String str, boolean z4, int i4, ThreadGroup threadGroup) {
        this.nextId = new AtomicInteger();
        ObjectUtil.checkNotNull(str, "poolName");
        if (i4 >= 1 && i4 <= 10) {
            this.prefix = str + '-' + poolId.incrementAndGet() + '-';
            this.daemon = z4;
            this.priority = i4;
            this.threadGroup = threadGroup;
            return;
        }
        throw new IllegalArgumentException("priority: " + i4 + " (expected: Thread.MIN_PRIORITY <= priority <= Thread.MAX_PRIORITY)");
    }

    public DefaultThreadFactory(String str, boolean z4, int i4) {
        this(str, z4, i4, System.getSecurityManager() == null ? Thread.currentThread().getThreadGroup() : System.getSecurityManager().getThreadGroup());
    }
}
