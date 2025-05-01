package org.aspectj.runtime.internal.cflowstack;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
/* compiled from: ThreadCounterImpl11.java */
/* loaded from: classes7.dex */
public class b implements org.aspectj.runtime.internal.cflowstack.a {

    /* renamed from: e  reason: collision with root package name */
    private static final int f72223e = 20000;

    /* renamed from: f  reason: collision with root package name */
    private static final int f72224f = 100;

    /* renamed from: b  reason: collision with root package name */
    private Thread f72226b;

    /* renamed from: c  reason: collision with root package name */
    private a f72227c;

    /* renamed from: a  reason: collision with root package name */
    private Hashtable f72225a = new Hashtable();

    /* renamed from: d  reason: collision with root package name */
    private int f72228d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ThreadCounterImpl11.java */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected int f72229a = 0;

        a() {
        }
    }

    private synchronized a e() {
        if (Thread.currentThread() != this.f72226b) {
            Thread currentThread = Thread.currentThread();
            this.f72226b = currentThread;
            a aVar = (a) this.f72225a.get(currentThread);
            this.f72227c = aVar;
            if (aVar == null) {
                a aVar2 = new a();
                this.f72227c = aVar2;
                this.f72225a.put(this.f72226b, aVar2);
            }
            this.f72228d++;
            if (this.f72228d > Math.max(100, 20000 / Math.max(1, this.f72225a.size()))) {
                ArrayList<Thread> arrayList = new ArrayList();
                Enumeration keys = this.f72225a.keys();
                while (keys.hasMoreElements()) {
                    Thread thread = (Thread) keys.nextElement();
                    if (!thread.isAlive()) {
                        arrayList.add(thread);
                    }
                }
                for (Thread thread2 : arrayList) {
                    this.f72225a.remove(thread2);
                }
                this.f72228d = 0;
            }
        }
        return this.f72227c;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.a
    public void a() {
        a e5 = e();
        e5.f72229a--;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.a
    public void b() {
    }

    @Override // org.aspectj.runtime.internal.cflowstack.a
    public void c() {
        e().f72229a++;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.a
    public boolean d() {
        return e().f72229a != 0;
    }
}
