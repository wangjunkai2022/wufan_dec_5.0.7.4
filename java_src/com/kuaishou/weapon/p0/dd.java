package com.kuaishou.weapon.p0;

import android.content.Context;
import java.util.Date;
import java.util.List;
/* loaded from: classes5.dex */
public class dd {

    /* renamed from: b  reason: collision with root package name */
    private static volatile dd f55520b;

    /* renamed from: a  reason: collision with root package name */
    private Context f55521a;

    private dd(Context context) {
        this.f55521a = context;
    }

    public static dd a(Context context) {
        if (f55520b == null) {
            synchronized (dd.class) {
                if (f55520b == null) {
                    f55520b = new dd(context);
                }
            }
        }
        return f55520b;
    }

    public void a(final int i4) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.dd.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    h a5 = h.a(dd.this.f55521a, "re_po_rt");
                    if (a5.b(df.aC, 1) == 1) {
                        long a6 = df.a(dd.this.f55521a).a();
                        long currentTimeMillis = System.currentTimeMillis();
                        long b5 = a5.b(df.aE, 8) * bi.f55326s;
                        if (a6 > 0 && currentTimeMillis - a6 < WeaponHI.ii * bi.f55326s && WeaponHI.isList != null) {
                            int hours = new Date(currentTimeMillis).getHours();
                            List<Integer> list = WeaponHI.isList;
                            StringBuilder sb = new StringBuilder();
                            sb.append(hours);
                            if (list.contains(sb.toString())) {
                                return;
                            }
                        }
                        if (currentTimeMillis - a6 >= b5 || i4 == 106) {
                            cp.a(dd.this.f55521a, new cn(dd.this.f55521a, i4).a(ck.f55409b), ck.f55409b, true, true);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
