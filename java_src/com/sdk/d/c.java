package com.sdk.d;

import android.os.Process;
import android.os.SystemClock;
import com.sdk.a.e;
import com.sdk.d.e;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Add missing generic type declarations: [Params, Result] */
/* loaded from: classes5.dex */
public class c<Params, Result> extends e.c<Params, Result> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f60005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(null);
        this.f60005b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public Result call() {
        AtomicBoolean atomicBoolean;
        Object a5;
        atomicBoolean = this.f60005b.f60012f;
        atomicBoolean.set(true);
        Process.setThreadPriority(10);
        e eVar = this.f60005b;
        Params[] paramsArr = this.f60018a;
        com.sdk.a.e eVar2 = (com.sdk.a.e) eVar;
        if (eVar2.f59938p != e.a.CANCELLED && paramsArr != null && paramsArr.length != 0) {
            if (paramsArr.length == 4) {
                eVar2.f59942t = String.valueOf(paramsArr[1]);
                eVar2.f59943u = true;
                eVar2.f59944v = (Boolean) paramsArr[2];
                eVar2.f59945w = (Boolean) paramsArr[3];
            }
            if (paramsArr.length == 2) {
                eVar2.f59946x = (Boolean) paramsArr[1];
            }
            try {
                eVar2.f59941s = SystemClock.uptimeMillis();
                eVar2.a(1);
                com.sdk.a.g gVar = (com.sdk.a.g) paramsArr[0];
                String a6 = gVar.a();
                eVar2.f59937o = a6;
                HttpURLConnection a7 = gVar.a(a6, false);
                if (a7 == null) {
                    eVar2.a(4, new com.sdk.a.i(0, eVar2.b(), false));
                } else {
                    com.sdk.a.i b5 = eVar2.b(gVar, a7);
                    if (b5.a() == 0) {
                        eVar2.a(4, b5);
                    } else {
                        eVar2.a(3, Integer.valueOf(b5.a()), b5.b());
                    }
                }
            } catch (Exception e5) {
                com.sdk.o.c.c(e5.toString());
                com.sdk.o.b.a("PriorityAsyncTask", "网络访问异常：\n" + e5.toString(), eVar2.f60014h);
                com.sdk.o.b.a("PriorityAsyncTask", "网络访问异常httphander330：\n" + e5.toString(), eVar2.f60014h);
                eVar2.a(3, 302002, "网络访问异常");
            }
        }
        a5 = eVar.a((e) null);
        return (Result) a5;
    }
}
