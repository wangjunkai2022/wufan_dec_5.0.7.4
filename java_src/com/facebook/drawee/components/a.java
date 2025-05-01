package com.facebook.drawee.components;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.internal.h;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
/* compiled from: DeferredReleaser.java */
/* loaded from: classes.dex */
public class a {
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private static a f11075d;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f11078c = new RunnableC0258a();

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f11076a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f11077b = new Handler(Looper.getMainLooper());

    /* compiled from: DeferredReleaser.java */
    /* renamed from: com.facebook.drawee.components.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0258a implements Runnable {
        RunnableC0258a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.d();
            for (b bVar : a.this.f11076a) {
                bVar.release();
            }
            a.this.f11076a.clear();
        }
    }

    /* compiled from: DeferredReleaser.java */
    /* loaded from: classes2.dex */
    public interface b {
        void release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        h.o(Looper.getMainLooper().getThread() == Thread.currentThread());
    }

    public static synchronized a e() {
        a aVar;
        synchronized (a.class) {
            if (f11075d == null) {
                f11075d = new a();
            }
            aVar = f11075d;
        }
        return aVar;
    }

    public void c(b bVar) {
        d();
        this.f11076a.remove(bVar);
    }

    public void f(b bVar) {
        d();
        if (this.f11076a.add(bVar) && this.f11076a.size() == 1) {
            this.f11077b.post(this.f11078c);
        }
    }
}
