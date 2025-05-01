package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.infer.annotation.ThreadSafe;
import java.util.LinkedList;
import javax.annotation.Nullable;
/* compiled from: BucketMap.java */
@ThreadSafe
/* loaded from: classes.dex */
public class g<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final SparseArray<b<T>> f12029a = new SparseArray<>();
    @VisibleForTesting
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    b<T> f12030b;
    @VisibleForTesting
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    b<T> f12031c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BucketMap.java */
    @VisibleForTesting
    /* loaded from: classes.dex */
    public static class b<I> {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        b<I> f12032a;

        /* renamed from: b  reason: collision with root package name */
        int f12033b;

        /* renamed from: c  reason: collision with root package name */
        LinkedList<I> f12034c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        b<I> f12035d;

        public String toString() {
            return "LinkedEntry(key: " + this.f12033b + ")";
        }

        private b(@Nullable b<I> bVar, int i4, LinkedList<I> linkedList, @Nullable b<I> bVar2) {
            this.f12032a = bVar;
            this.f12033b = i4;
            this.f12034c = linkedList;
            this.f12035d = bVar2;
        }
    }

    private void b(b<T> bVar) {
        if (bVar == null || !bVar.f12034c.isEmpty()) {
            return;
        }
        d(bVar);
        this.f12029a.remove(bVar.f12033b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(b<T> bVar) {
        if (this.f12030b == bVar) {
            return;
        }
        d(bVar);
        b bVar2 = (b<T>) this.f12030b;
        if (bVar2 == null) {
            this.f12030b = bVar;
            this.f12031c = bVar;
            return;
        }
        bVar.f12035d = bVar2;
        bVar2.f12032a = bVar;
        this.f12030b = bVar;
    }

    private synchronized void d(b<T> bVar) {
        b bVar2 = (b<T>) bVar.f12032a;
        b bVar3 = (b<T>) bVar.f12035d;
        if (bVar2 != null) {
            bVar2.f12035d = bVar3;
        }
        if (bVar3 != null) {
            bVar3.f12032a = bVar2;
        }
        bVar.f12032a = null;
        bVar.f12035d = null;
        if (bVar == this.f12030b) {
            this.f12030b = bVar3;
        }
        if (bVar == this.f12031c) {
            this.f12031c = bVar2;
        }
    }

    @Nullable
    public synchronized T a(int i4) {
        b<T> bVar = this.f12029a.get(i4);
        if (bVar == null) {
            return null;
        }
        T pollFirst = bVar.f12034c.pollFirst();
        c(bVar);
        return pollFirst;
    }

    public synchronized void e(int i4, T t4) {
        b<T> bVar = this.f12029a.get(i4);
        if (bVar == null) {
            bVar = new b<>(null, i4, new LinkedList(), null);
            this.f12029a.put(i4, bVar);
        }
        bVar.f12034c.addLast(t4);
        c(bVar);
    }

    @Nullable
    public synchronized T f() {
        b<T> bVar = this.f12031c;
        if (bVar == null) {
            return null;
        }
        T pollLast = bVar.f12034c.pollLast();
        b(bVar);
        return pollLast;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public synchronized int g() {
        int i4;
        i4 = 0;
        for (b bVar = this.f12030b; bVar != null; bVar = bVar.f12035d) {
            LinkedList<I> linkedList = bVar.f12034c;
            if (linkedList != 0) {
                i4 += linkedList.size();
            }
        }
        return i4;
    }
}
