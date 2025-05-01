package com.bytedance.pangle.a;

import com.bytedance.pangle.d.e;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    final CountDownLatch f8232a;

    /* renamed from: b  reason: collision with root package name */
    Throwable f8233b;

    /* renamed from: com.bytedance.pangle.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0213a {
        void a();
    }

    private a(InterfaceC0213a[] interfaceC0213aArr) {
        this.f8232a = new CountDownLatch(interfaceC0213aArr.length);
        for (final InterfaceC0213a interfaceC0213a : interfaceC0213aArr) {
            e.a(new Runnable() { // from class: com.bytedance.pangle.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        interfaceC0213a.a();
                    } catch (Throwable th) {
                        a.this.f8233b = th;
                    }
                    a.this.f8232a.countDown();
                }
            });
        }
    }

    public static void a(InterfaceC0213a... interfaceC0213aArr) {
        a aVar = new a(interfaceC0213aArr);
        try {
            aVar.f8232a.await();
            Throwable th = aVar.f8233b;
            if (th != null) {
                throw th;
            }
        } catch (InterruptedException e5) {
            throw new RuntimeException(e5);
        }
    }
}
