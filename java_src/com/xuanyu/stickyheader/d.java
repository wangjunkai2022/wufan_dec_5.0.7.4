package com.xuanyu.stickyheader;
/* compiled from: Pools.java */
/* loaded from: classes6.dex */
public final class d {

    /* compiled from: Pools.java */
    /* loaded from: classes6.dex */
    public interface a<T> {
        T acquire();

        boolean release(T t4);
    }

    /* compiled from: Pools.java */
    /* loaded from: classes6.dex */
    public static class b<T> implements a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f68446a;

        /* renamed from: b  reason: collision with root package name */
        private int f68447b;

        public b(int i4) {
            if (i4 > 0) {
                this.f68446a = new Object[i4];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        private boolean a(T t4) {
            for (int i4 = 0; i4 < this.f68447b; i4++) {
                if (this.f68446a[i4] == t4) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.xuanyu.stickyheader.d.a
        public T acquire() {
            int i4 = this.f68447b;
            if (i4 > 0) {
                int i5 = i4 - 1;
                Object[] objArr = this.f68446a;
                T t4 = (T) objArr[i5];
                objArr[i5] = null;
                this.f68447b = i4 - 1;
                return t4;
            }
            return null;
        }

        @Override // com.xuanyu.stickyheader.d.a
        public boolean release(T t4) {
            if (!a(t4)) {
                int i4 = this.f68447b;
                Object[] objArr = this.f68446a;
                if (i4 < objArr.length) {
                    objArr[i4] = t4;
                    this.f68447b = i4 + 1;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Already in the pool!");
        }
    }

    private d() {
    }

    /* compiled from: Pools.java */
    /* loaded from: classes6.dex */
    public static class c<T> extends b<T> {

        /* renamed from: c  reason: collision with root package name */
        private final Object f68448c;

        public c(int i4, Object obj) {
            super(i4);
            this.f68448c = obj;
        }

        @Override // com.xuanyu.stickyheader.d.b, com.xuanyu.stickyheader.d.a
        public T acquire() {
            T t4;
            synchronized (this.f68448c) {
                t4 = (T) super.acquire();
            }
            return t4;
        }

        @Override // com.xuanyu.stickyheader.d.b, com.xuanyu.stickyheader.d.a
        public boolean release(T t4) {
            boolean release;
            synchronized (this.f68448c) {
                release = super.release(t4);
            }
            return release;
        }

        public c(int i4) {
            this(i4, new Object());
        }
    }
}
