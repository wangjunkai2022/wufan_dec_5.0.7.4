package com.facebook.rebound;

import com.facebook.rebound.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/* compiled from: AnimationQueue.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: g  reason: collision with root package name */
    private boolean f12567g;

    /* renamed from: b  reason: collision with root package name */
    private final Queue<Double> f12562b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private final Queue<Double> f12563c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    private final List<InterfaceC0284b> f12564d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<Double> f12565e = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    private final f f12561a = f.e();

    /* renamed from: f  reason: collision with root package name */
    private final f.a f12566f = new a();

    /* compiled from: AnimationQueue.java */
    /* loaded from: classes2.dex */
    class a extends f.a {
        a() {
        }

        @Override // com.facebook.rebound.f.a
        public void a(long j4) {
            b.this.g(j4);
        }
    }

    /* compiled from: AnimationQueue.java */
    /* renamed from: com.facebook.rebound.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0284b {
        void a(Double d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(long j4) {
        int max;
        Double poll = this.f12562b.poll();
        if (poll != null) {
            this.f12563c.offer(poll);
            max = 0;
        } else {
            max = Math.max(this.f12564d.size() - this.f12563c.size(), 0);
        }
        this.f12565e.addAll(this.f12563c);
        int size = this.f12565e.size();
        while (true) {
            size--;
            if (size <= -1) {
                break;
            }
            Double d5 = this.f12565e.get(size);
            int size2 = ((this.f12565e.size() - 1) - size) + max;
            if (this.f12564d.size() > size2) {
                this.f12564d.get(size2).a(d5);
            }
        }
        this.f12565e.clear();
        while (this.f12563c.size() + max >= this.f12564d.size()) {
            this.f12563c.poll();
        }
        if (this.f12563c.isEmpty() && this.f12562b.isEmpty()) {
            this.f12567g = false;
        } else {
            this.f12561a.f(this.f12566f);
        }
    }

    private void i() {
        if (this.f12567g) {
            return;
        }
        this.f12567g = true;
        this.f12561a.f(this.f12566f);
    }

    public void b(Collection<Double> collection) {
        this.f12562b.addAll(collection);
        i();
    }

    public void c(InterfaceC0284b interfaceC0284b) {
        this.f12564d.add(interfaceC0284b);
    }

    public void d(Double d5) {
        this.f12562b.add(d5);
        i();
    }

    public void e() {
        this.f12564d.clear();
    }

    public void f() {
        this.f12562b.clear();
    }

    public void h(InterfaceC0284b interfaceC0284b) {
        this.f12564d.remove(interfaceC0284b);
    }
}
