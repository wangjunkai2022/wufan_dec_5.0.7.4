package com.ta.utdid2.aid;

import android.content.Context;
import com.ta.utdid2.android.utils.f;
import com.ta.utdid2.android.utils.i;
import com.ta.utdid2.android.utils.k;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f61981b = null;

    /* renamed from: c  reason: collision with root package name */
    private static final String f61982c = "com.ta.utdid2.aid.a";

    /* renamed from: d  reason: collision with root package name */
    private static final int f61983d = 1;

    /* renamed from: a  reason: collision with root package name */
    private Context f61984a;

    private a(Context context) {
        this.f61984a = context;
    }

    private synchronized String a(String str, String str2, String str3) {
        Context context = this.f61984a;
        if (context == null) {
            return "";
        }
        String h4 = f.f(context) ? b.f(this.f61984a).h(str, str2, str3, c.b(this.f61984a, str, str2)) : "";
        c.d(this.f61984a, str, h4, str2);
        return h4;
    }

    public static synchronized a b(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f61981b == null) {
                f61981b = new a(context);
            }
            aVar = f61981b;
        }
        return aVar;
    }

    public String c(String str, String str2, String str3) {
        if (this.f61984a != null && !i.c(str) && !i.c(str2)) {
            String b5 = c.b(this.f61984a, str, str2);
            return ((i.c(b5) || !k.a(c.a(this.f61984a, str, str2), 1)) && f.f(this.f61984a)) ? a(str, str2, str3) : b5;
        }
        StringBuilder sb = new StringBuilder("mContext:");
        sb.append(this.f61984a);
        sb.append("; has appName:");
        sb.append(!i.c(str));
        sb.append("; has token:");
        sb.append(!i.c(str2));
        return "";
    }

    public void d(String str, String str2, String str3, a3.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f61984a != null && !i.c(str) && !i.c(str2)) {
            String b5 = c.b(this.f61984a, str, str2);
            if (!i.c(b5) && k.a(c.a(this.f61984a, str, str2), 1)) {
                aVar.a(1001, b5);
                return;
            } else if (f.f(this.f61984a)) {
                b.f(this.f61984a).i(str, str2, str3, b5, aVar);
                return;
            } else {
                aVar.a(1003, b5);
                return;
            }
        }
        StringBuilder sb = new StringBuilder("mContext:");
        sb.append(this.f61984a);
        sb.append("; callback:");
        sb.append(aVar);
        sb.append("; has appName:");
        sb.append(!i.c(str));
        sb.append("; has token:");
        sb.append(!i.c(str2));
        aVar.a(1002, "");
    }
}
