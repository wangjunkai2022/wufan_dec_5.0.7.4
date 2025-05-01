package com.ta.utdid2.device;

import android.content.Context;
import com.ta.utdid2.android.utils.g;
import com.ta.utdid2.android.utils.i;
import java.util.zip.Adler32;
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static a f62106a = null;

    /* renamed from: b  reason: collision with root package name */
    static String f62107b = "d6fc3a4a06adbde89223bvefedc24fecde188aaa9161";

    /* renamed from: c  reason: collision with root package name */
    static final Object f62108c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final byte f62109d = 1;

    private static a a(Context context) {
        if (context != null) {
            new a();
            synchronized (f62108c) {
                String e5 = d.f(context).e();
                if (i.c(e5)) {
                    return null;
                }
                if (e5.endsWith("\n")) {
                    e5 = e5.substring(0, e5.length() - 1);
                }
                a aVar = new a();
                long currentTimeMillis = System.currentTimeMillis();
                String a5 = g.a(context);
                String b5 = g.b(context);
                aVar.i(a5);
                aVar.j(a5);
                aVar.h(currentTimeMillis);
                aVar.k(b5);
                aVar.l(e5);
                aVar.g(c(aVar));
                return aVar;
            }
        }
        return null;
    }

    public static synchronized a b(Context context) {
        synchronized (b.class) {
            a aVar = f62106a;
            if (aVar != null) {
                return aVar;
            }
            if (context != null) {
                a a5 = a(context);
                f62106a = a5;
                return a5;
            }
            return null;
        }
    }

    static long c(a aVar) {
        if (aVar != null) {
            String format = String.format("%s%s%s%s%s", aVar.f(), aVar.c(), Long.valueOf(aVar.b()), aVar.e(), aVar.d());
            if (i.c(format)) {
                return 0L;
            }
            Adler32 adler32 = new Adler32();
            adler32.reset();
            adler32.update(format.getBytes());
            return adler32.getValue();
        }
        return 0L;
    }
}
