package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
/* compiled from: ExceptionsConstructor.kt */
/* loaded from: classes6.dex */
final class z0 extends k {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final z0 f71186a = new z0();
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final ReentrantReadWriteLock f71187b = new ReentrantReadWriteLock();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> f71188c = new WeakHashMap<>();

    private z0() {
    }

    @Override // kotlinx.coroutines.internal.k
    @NotNull
    public Function1<Throwable, Throwable> a(@NotNull Class<? extends Throwable> cls) {
        Function1<Throwable, Throwable> b5;
        ReentrantReadWriteLock reentrantReadWriteLock = f71187b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            Function1<Throwable, Throwable> function1 = f71188c.get(cls);
            if (function1 == null) {
                readLock = reentrantReadWriteLock.readLock();
                int i4 = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                int i5 = 0;
                while (i5 < readHoldCount) {
                    i5++;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> weakHashMap = f71188c;
                    Function1<Throwable, Throwable> function12 = weakHashMap.get(cls);
                    if (function12 == null) {
                        b5 = ExceptionsConstructorKt.b(cls);
                        weakHashMap.put(cls, b5);
                        return b5;
                    }
                    while (i4 < readHoldCount) {
                        i4++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                    return function12;
                } finally {
                    while (i4 < readHoldCount) {
                        i4++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                }
            }
            return function1;
        } finally {
            readLock.unlock();
        }
    }
}
