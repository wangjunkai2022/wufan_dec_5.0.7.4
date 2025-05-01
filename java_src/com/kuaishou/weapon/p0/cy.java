package com.kuaishou.weapon.p0;

import android.content.Context;
import java.util.Date;
import java.util.List;
/* loaded from: classes5.dex */
public class cy {

    /* renamed from: b  reason: collision with root package name */
    private static volatile cy f55490b;

    /* renamed from: a  reason: collision with root package name */
    private Context f55491a;

    private cy(Context context) {
        this.f55491a = context;
    }

    public static cy a(Context context) {
        if (f55490b == null) {
            synchronized (cy.class) {
                if (f55490b == null) {
                    f55490b = new cy(context);
                }
            }
        }
        return f55490b;
    }

    public void a(final int i4) {
        try {
            h a5 = h.a(this.f55491a, "re_po_rt");
            final boolean e5 = a5.e("a1_p_s_p_s");
            final boolean e6 = a5.e("a1_p_s_p_s_c_b");
            if ((e5 || e6) && WeaponHI.as) {
                n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.cy.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int i5;
                        try {
                            h a6 = h.a(cy.this.f55491a, "re_po_rt");
                            if (a6.b(df.f55542o, 0) == 1) {
                                if (e5 || e6) {
                                    long a7 = df.a(cy.this.f55491a).a(df.bi);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long b5 = a6.b(df.f55543p, 8) * bi.f55326s;
                                    int b6 = a6.b(df.f55544q, 0);
                                    if (a7 > 0 && currentTimeMillis - a7 < WeaponHI.ii * bi.f55326s && WeaponHI.isList != null) {
                                        int hours = new Date(currentTimeMillis).getHours();
                                        List<Integer> list = WeaponHI.isList;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(hours);
                                        if (list.contains(sb.toString())) {
                                            return;
                                        }
                                    }
                                    if (currentTimeMillis - a7 >= b5 || (((i5 = i4) == 100 && b6 == 1) || i5 == 106)) {
                                        cp.a(cy.this.f55491a, new ci(cy.this.f55491a, i4).a(ck.f55411d), ck.f55411d, true, true);
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }
}
