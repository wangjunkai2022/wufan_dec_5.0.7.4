package com.mob.tools.utils;

import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
/* loaded from: classes5.dex */
public final class MobPools implements PublicMemberKeeper {

    /* loaded from: classes5.dex */
    public interface Pool<T> extends PublicMemberKeeper {
        T acquire();

        boolean release(T t4);
    }

    /* loaded from: classes5.dex */
    public static class SimplePool<T> implements Pool<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f56981a;

        /* renamed from: b  reason: collision with root package name */
        private int f56982b;

        public SimplePool(int i4) {
            if (i4 > 0) {
                this.f56981a = new Object[i4];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        private boolean a(T t4) {
            for (int i4 = 0; i4 < this.f56982b; i4++) {
                if (this.f56981a[i4] == t4) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.mob.tools.utils.MobPools.Pool
        public T acquire() {
            int i4 = this.f56982b;
            if (i4 > 0) {
                int i5 = i4 - 1;
                try {
                    Object[] objArr = this.f56981a;
                    T t4 = (T) objArr[i5];
                    objArr[i5] = null;
                    this.f56982b = i4 - 1;
                    return t4;
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
            return null;
        }

        @Override // com.mob.tools.utils.MobPools.Pool
        public boolean release(T t4) {
            if (!a(t4)) {
                int i4 = this.f56982b;
                Object[] objArr = this.f56981a;
                if (i4 < objArr.length) {
                    objArr[i4] = t4;
                    this.f56982b = i4 + 1;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Already in the pool!");
        }
    }

    private MobPools() {
    }

    /* loaded from: classes5.dex */
    public static class SynchronizedPool<T> extends SimplePool<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f56983a;

        public SynchronizedPool(int i4, Object obj) {
            super(i4);
            this.f56983a = obj;
        }

        @Override // com.mob.tools.utils.MobPools.SimplePool, com.mob.tools.utils.MobPools.Pool
        public T acquire() {
            T t4;
            synchronized (this.f56983a) {
                t4 = (T) super.acquire();
            }
            return t4;
        }

        @Override // com.mob.tools.utils.MobPools.SimplePool, com.mob.tools.utils.MobPools.Pool
        public boolean release(T t4) {
            boolean release;
            synchronized (this.f56983a) {
                release = super.release(t4);
            }
            return release;
        }

        public SynchronizedPool(int i4) {
            this(i4, new Object());
        }
    }
}
