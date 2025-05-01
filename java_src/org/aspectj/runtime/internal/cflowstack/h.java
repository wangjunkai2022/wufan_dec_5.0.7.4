package org.aspectj.runtime.internal.cflowstack;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
/* compiled from: ThreadStackImpl11.java */
/* loaded from: classes7.dex */
public class h implements c {

    /* renamed from: e  reason: collision with root package name */
    private static final int f72231e = 20000;

    /* renamed from: f  reason: collision with root package name */
    private static final int f72232f = 100;

    /* renamed from: b  reason: collision with root package name */
    private Thread f72234b;

    /* renamed from: c  reason: collision with root package name */
    private Stack f72235c;

    /* renamed from: a  reason: collision with root package name */
    private Hashtable f72233a = new Hashtable();

    /* renamed from: d  reason: collision with root package name */
    private int f72236d = 0;

    @Override // org.aspectj.runtime.internal.cflowstack.c
    public synchronized Stack a() {
        if (Thread.currentThread() != this.f72234b) {
            Thread currentThread = Thread.currentThread();
            this.f72234b = currentThread;
            Stack stack = (Stack) this.f72233a.get(currentThread);
            this.f72235c = stack;
            if (stack == null) {
                Stack stack2 = new Stack();
                this.f72235c = stack2;
                this.f72233a.put(this.f72234b, stack2);
            }
            this.f72236d++;
            if (this.f72236d > Math.max(100, 20000 / Math.max(1, this.f72233a.size()))) {
                Stack stack3 = new Stack();
                Enumeration keys = this.f72233a.keys();
                while (keys.hasMoreElements()) {
                    Thread thread = (Thread) keys.nextElement();
                    if (!thread.isAlive()) {
                        stack3.push(thread);
                    }
                }
                Enumeration elements = stack3.elements();
                while (elements.hasMoreElements()) {
                    this.f72233a.remove((Thread) elements.nextElement());
                }
                this.f72236d = 0;
            }
        }
        return this.f72235c;
    }

    @Override // org.aspectj.runtime.internal.cflowstack.c
    public void b() {
    }
}
