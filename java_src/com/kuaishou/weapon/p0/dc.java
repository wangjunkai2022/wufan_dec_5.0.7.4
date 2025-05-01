package com.kuaishou.weapon.p0;

import android.content.Context;
/* loaded from: classes5.dex */
public class dc {

    /* renamed from: b  reason: collision with root package name */
    private static volatile dc f55516b;

    /* renamed from: a  reason: collision with root package name */
    private Context f55517a;

    private dc(Context context) {
        this.f55517a = context;
    }

    public static dc a(Context context) {
        if (f55516b == null) {
            synchronized (dc.class) {
                if (f55516b == null) {
                    f55516b = new dc(context);
                }
            }
        }
        return f55516b;
    }

    public void a(final int i4) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.dc.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    h a5 = h.a(dc.this.f55517a, "re_po_rt");
                    if (a5.b(df.ap, 1) == 1) {
                        long a6 = df.a(dc.this.f55517a).a(df.bl);
                        long currentTimeMillis = System.currentTimeMillis();
                        int b5 = a5.b(df.as, 0);
                        long j4 = currentTimeMillis - a6;
                        if (j4 >= a5.b(df.ar, 6) * bi.f55326s || (i4 == 100 && b5 == 1 && j4 >= 14400000)) {
                            cg.a(dc.this.f55517a, new bw(dc.this.f55517a, i4, false).a(ck.f55412e), ck.f55412e, true);
                            df.a(dc.this.f55517a).a(df.bl, currentTimeMillis);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
