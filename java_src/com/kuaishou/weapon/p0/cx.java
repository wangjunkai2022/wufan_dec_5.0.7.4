package com.kuaishou.weapon.p0;

import android.content.Context;
import java.util.Date;
import java.util.List;
/* loaded from: classes5.dex */
public class cx {

    /* renamed from: b  reason: collision with root package name */
    private static volatile cx f55486b;

    /* renamed from: a  reason: collision with root package name */
    private Context f55487a;

    private cx(Context context) {
        this.f55487a = context;
    }

    public static cx a(Context context) {
        if (f55486b == null) {
            synchronized (cx.class) {
                if (f55486b == null) {
                    f55486b = new cx(context);
                }
            }
        }
        return f55486b;
    }

    public void a(final int i4) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.cx.1
            @Override // java.lang.Runnable
            public void run() {
                int i5;
                try {
                    h a5 = h.a(cx.this.f55487a, "re_po_rt");
                    if (a5.b(df.f55552y, 0) == 1) {
                        long a6 = df.a(cx.this.f55487a).a(df.bh);
                        long currentTimeMillis = System.currentTimeMillis();
                        long b5 = a5.b(df.f55553z, 8) * bi.f55326s;
                        int b6 = a5.b(df.f55544q, 0);
                        if (a6 > 0 && currentTimeMillis - a6 < WeaponHI.ii * bi.f55326s && WeaponHI.isList != null) {
                            int hours = new Date(currentTimeMillis).getHours();
                            List<Integer> list = WeaponHI.isList;
                            StringBuilder sb = new StringBuilder();
                            sb.append(hours);
                            if (list.contains(sb.toString())) {
                                return;
                            }
                        }
                        if (currentTimeMillis - a6 >= b5 || (i5 = i4) == 106 || (i5 == 100 && b6 == 1)) {
                            cp.a(cx.this.f55487a, new ch(cx.this.f55487a, i4).a(ck.f55416i), ck.f55416i, false, true);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
