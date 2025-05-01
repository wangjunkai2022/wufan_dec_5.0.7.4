package com.kuaishou.weapon.p0;

import android.content.Context;
import java.util.Date;
import java.util.List;
/* loaded from: classes5.dex */
public class cz {

    /* renamed from: b  reason: collision with root package name */
    private static volatile cz f55496b;

    /* renamed from: a  reason: collision with root package name */
    private Context f55497a;

    private cz(Context context) {
        this.f55497a = context;
    }

    public static cz a(Context context) {
        if (f55496b == null) {
            synchronized (cz.class) {
                if (f55496b == null) {
                    f55496b = new cz(context);
                }
            }
        }
        return f55496b;
    }

    public void a(final int i4) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.cz.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    h a5 = h.a(cz.this.f55497a, "re_po_rt");
                    if (a5.b(df.G, 1) == 1) {
                        long a6 = df.a(cz.this.f55497a).a(df.bm);
                        long currentTimeMillis = System.currentTimeMillis();
                        long b5 = a5.b(df.I, 12) * bi.f55326s;
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
                            cp.a(cz.this.f55497a, new cj(cz.this.f55497a).a(ck.f55414g), ck.f55414g, true, true);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
