package com.kuaishou.weapon.p0;

import android.content.Context;
/* loaded from: classes5.dex */
public class de {

    /* renamed from: b  reason: collision with root package name */
    private static volatile de f55524b;

    /* renamed from: a  reason: collision with root package name */
    private Context f55525a;

    private de(Context context) {
        this.f55525a = context;
    }

    public static de a(Context context) {
        if (f55524b == null) {
            synchronized (de.class) {
                if (f55524b == null) {
                    f55524b = new de(context);
                }
            }
        }
        return f55524b;
    }

    public void a(final int i4) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.de.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    h a5 = h.a(de.this.f55525a, "re_po_rt");
                    if (a5.b(df.B, 0) == 1) {
                        long a6 = df.a(de.this.f55525a).a(df.bn);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - a6 >= a5.b(df.E, 2) * bi.f55326s || i4 == 106) {
                            try {
                                String a7 = new co(de.this.f55525a).a(ck.f55415h);
                                int intValue = Integer.valueOf(ck.f55415h).intValue();
                                if (a7 != null && a7.length() > 10) {
                                    new bc(de.this.f55525a, a7, intValue).a("1000");
                                }
                            } catch (Throwable unused) {
                            }
                            df.a(de.this.f55525a).a(df.bn, currentTimeMillis);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        });
    }
}
