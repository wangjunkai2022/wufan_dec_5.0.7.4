package com.join.mgps.listener;

import java.util.ArrayList;
import java.util.List;
/* compiled from: AppMsgObserver.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f53544b;

    /* renamed from: c  reason: collision with root package name */
    private static Object f53545c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private List<InterfaceC0373a> f53546a = new ArrayList();

    /* compiled from: AppMsgObserver.java */
    /* renamed from: com.join.mgps.listener.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0373a {
        void l();
    }

    private a() {
    }

    public static a b() {
        if (f53544b == null) {
            synchronized (f53545c) {
                if (f53544b == null) {
                    f53544b = new a();
                }
            }
        }
        return f53544b;
    }

    public void a(InterfaceC0373a interfaceC0373a) {
        if (this.f53546a.contains(interfaceC0373a)) {
            return;
        }
        this.f53546a.add(interfaceC0373a);
    }

    public void c() {
        List<InterfaceC0373a> list = this.f53546a;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                try {
                    this.f53546a.get(i4).l();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public void d(InterfaceC0373a interfaceC0373a) {
        List<InterfaceC0373a> list = this.f53546a;
        if (list != null) {
            list.remove(interfaceC0373a);
        }
    }
}
