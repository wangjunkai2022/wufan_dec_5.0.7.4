package com.facebook.common.references;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.h;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
@VisibleForTesting
/* loaded from: classes2.dex */
public class SharedReference<T> {
    @GuardedBy("itself")

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Object, Integer> f10888d = new IdentityHashMap();
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private T f10889a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private int f10890b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final c<T> f10891c;

    /* loaded from: classes2.dex */
    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t4, c<T> cVar) {
        this.f10889a = (T) h.i(t4);
        this.f10891c = (c) h.i(cVar);
        a(t4);
    }

    private static void a(Object obj) {
        Map<Object, Integer> map = f10888d;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                map.put(obj, 1);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    private synchronized int c() {
        int i4;
        e();
        h.d(this.f10890b > 0);
        i4 = this.f10890b - 1;
        this.f10890b = i4;
        return i4;
    }

    private void e() {
        if (!i(this)) {
            throw new NullReferenceException();
        }
    }

    public static boolean i(SharedReference<?> sharedReference) {
        return sharedReference != null && sharedReference.h();
    }

    private static void j(Object obj) {
        Map<Object, Integer> map = f10888d;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                com.facebook.common.logging.a.y0("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                map.remove(obj);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public synchronized void b() {
        e();
        this.f10890b++;
    }

    public void d() {
        T t4;
        if (c() == 0) {
            synchronized (this) {
                t4 = this.f10889a;
                this.f10889a = null;
            }
            this.f10891c.release(t4);
            j(t4);
        }
    }

    public synchronized T f() {
        return this.f10889a;
    }

    public synchronized int g() {
        return this.f10890b;
    }

    public synchronized boolean h() {
        return this.f10890b > 0;
    }
}
