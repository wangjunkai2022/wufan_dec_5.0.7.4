package com.alipay.apmobilesecuritysdk.face;

import com.alipay.apmobilesecuritysdk.face.a;
import com.umeng.analytics.pro.bm;
import java.util.HashMap;
import java.util.LinkedList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f4677b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.f4677b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedList linkedList;
        LinkedList linkedList2;
        while (true) {
            try {
                linkedList = this.f4677b.f4665d;
                if (linkedList.isEmpty()) {
                    break;
                }
                linkedList2 = this.f4677b.f4665d;
                a.b bVar = (a.b) linkedList2.pollFirst();
                if (bVar != null && !a.this.f4663b) {
                    a.this.f4663b = true;
                    try {
                        com.alipay.apmobilesecuritysdk.d.a.a(a.this.f4662a);
                        com.alipay.apmobilesecuritysdk.d.a.c();
                        HashMap hashMap = new HashMap();
                        hashMap.put(com.alipay.sdk.cons.b.f4830c, bVar.f4668c);
                        hashMap.put(com.alipay.sdk.cons.b.f4834g, bVar.f4667b);
                        com.alipay.apmobilesecuritysdk.d.a.a(a.this.f4662a);
                        hashMap.put(bm.f63446g, com.alipay.apmobilesecuritysdk.d.a.b());
                        hashMap.put("userId", bVar.f4669d);
                        e.a(a.this.f4662a, hashMap);
                        if (bVar.f4670e != null) {
                            a.c cVar = new a.c();
                            cVar.f4674c = com.alipay.apmobilesecuritysdk.a.a.f(a.this.f4662a);
                            cVar.f4673b = com.alipay.apmobilesecuritysdk.a.a.a(a.this.f4662a);
                            com.alipay.apmobilesecuritysdk.d.a.a(a.this.f4662a);
                            cVar.f4672a = com.alipay.apmobilesecuritysdk.d.a.b();
                            cVar.f4675d = com.alipay.apmobilesecuritysdk.f.b.a(a.this.f4662a);
                        }
                    } catch (Throwable unused) {
                    }
                    a.this.f4663b = false;
                }
            } catch (Throwable unused2) {
            }
        }
        a.g(this.f4677b);
    }
}
