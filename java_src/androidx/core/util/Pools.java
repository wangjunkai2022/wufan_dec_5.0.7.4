package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: classes2.dex */
public final class Pools {

    /* loaded from: classes2.dex */
    public interface Pool<T> {
        @Nullable
        T acquire();

        boolean release(@NonNull T t4);
    }

    /* loaded from: classes2.dex */
    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i4) {
            if (i4 > 0) {
                this.mPool = new Object[i4];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        private boolean isInPool(@NonNull T t4) {
            for (int i4 = 0; i4 < this.mPoolSize; i4++) {
                if (this.mPool[i4] == t4) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i4 = this.mPoolSize;
            if (i4 > 0) {
                int i5 = i4 - 1;
                Object[] objArr = this.mPool;
                T t4 = (T) objArr[i5];
                objArr[i5] = null;
                this.mPoolSize = i4 - 1;
                return t4;
            }
            return null;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@NonNull T t4) {
            if (!isInPool(t4)) {
                int i4 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i4 < objArr.length) {
                    objArr[i4] = t4;
                    this.mPoolSize = i4 + 1;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Already in the pool!");
        }
    }

    /* loaded from: classes2.dex */
    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object mLock;

        public SynchronizedPool(int i4) {
            super(i4);
            this.mLock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t4;
            synchronized (this.mLock) {
                t4 = (T) super.acquire();
            }
            return t4;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(@NonNull T t4) {
            boolean release;
            synchronized (this.mLock) {
                release = super.release(t4);
            }
            return release;
        }
    }

    private Pools() {
    }
}
