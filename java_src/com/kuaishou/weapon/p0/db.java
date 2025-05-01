package com.kuaishou.weapon.p0;

import android.content.Context;
import java.util.Date;
import java.util.List;
/* loaded from: classes5.dex */
public class db {

    /* renamed from: b  reason: collision with root package name */
    private static volatile db f55511b;

    /* renamed from: a  reason: collision with root package name */
    private Context f55512a;

    private db(Context context) {
        this.f55512a = context;
    }

    public static db a(Context context) {
        if (f55511b == null) {
            synchronized (db.class) {
                if (f55511b == null) {
                    f55511b = new db(context);
                }
            }
        }
        return f55511b;
    }

    public void a(final int i4, final int i5) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.db.1
            @Override // java.lang.Runnable
            public void run() {
                long j4;
                int i6;
                try {
                    h a5 = h.a(db.this.f55512a, "re_po_rt");
                    if (a5.b(df.P, 1) == 1) {
                        long a6 = df.a(db.this.f55512a).a(df.bj);
                        long currentTimeMillis = System.currentTimeMillis();
                        long b5 = a5.b(df.R, 1) * bi.f55326s;
                        long b6 = a5.b(df.S, 5) * 60000;
                        int b7 = a5.b(df.T, 0);
                        if (a6 > 0) {
                            j4 = a6;
                            if (currentTimeMillis - a6 < WeaponHI.ii * bi.f55326s && WeaponHI.isList != null) {
                                int hours = new Date(currentTimeMillis).getHours();
                                List<Integer> list = WeaponHI.isList;
                                StringBuilder sb = new StringBuilder();
                                sb.append(hours);
                                if (list.contains(sb.toString())) {
                                    return;
                                }
                            }
                        } else {
                            j4 = a6;
                        }
                        long j5 = currentTimeMillis - j4;
                        if (j5 >= b5 || (((i6 = i4) == 100 && b7 == 1) || i6 == 106 || (i6 != 100 && i6 > 0 && j5 >= b6))) {
                            cp.a(db.this.f55512a, new cl(db.this.f55512a, i4, i5).a(ck.f55410c), ck.f55410c, true, true);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
