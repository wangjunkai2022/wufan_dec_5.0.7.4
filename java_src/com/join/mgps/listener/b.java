package com.join.mgps.listener;

import java.util.ArrayList;
import java.util.List;
/* compiled from: AppPaBiTopObserver.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f53547b;

    /* renamed from: c  reason: collision with root package name */
    private static Object f53548c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private List<a> f53549a = new ArrayList();

    /* compiled from: AppPaBiTopObserver.java */
    /* loaded from: classes3.dex */
    public interface a {
        void l();
    }

    private b() {
    }

    public static b b() {
        if (f53547b == null) {
            synchronized (f53548c) {
                if (f53547b == null) {
                    f53547b = new b();
                }
            }
        }
        return f53547b;
    }

    public void a(a aVar) {
        if (this.f53549a.contains(aVar)) {
            return;
        }
        this.f53549a.add(aVar);
    }

    public void c() {
        List<a> list = this.f53549a;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                try {
                    this.f53549a.get(i4).l();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public void d(a aVar) {
        List<a> list = this.f53549a;
        if (list != null) {
            list.remove(aVar);
        }
    }
}
