package com.join.mgps.socket;

import com.join.mgps.socket.entity.e;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: RequestQueneManager.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f54606b = "a";

    /* renamed from: a  reason: collision with root package name */
    LinkedBlockingQueue<e> f54607a;

    /* compiled from: RequestQueneManager.java */
    /* loaded from: classes2.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f54608a = new a();

        private b() {
        }
    }

    public static a b() {
        return b.f54608a;
    }

    public void a() {
        LinkedBlockingQueue<e> linkedBlockingQueue = this.f54607a;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.clear();
        }
    }

    public e c() {
        LinkedBlockingQueue<e> linkedBlockingQueue = this.f54607a;
        if (linkedBlockingQueue != null) {
            return linkedBlockingQueue.poll();
        }
        return null;
    }

    public void d(e eVar) {
        try {
            if (this.f54607a == null) {
                this.f54607a = new LinkedBlockingQueue<>();
            }
            this.f54607a.put(eVar);
            StringBuilder sb = new StringBuilder();
            sb.append("push: 装入数据 size");
            sb.append(this.f54607a.size());
            sb.append(eVar.toString());
        } catch (InterruptedException e5) {
            e5.printStackTrace();
        }
    }

    private a() {
        this.f54607a = new LinkedBlockingQueue<>();
    }
}
