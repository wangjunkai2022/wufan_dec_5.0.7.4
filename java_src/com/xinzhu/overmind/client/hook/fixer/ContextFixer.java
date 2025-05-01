package com.xinzhu.overmind.client.hook.fixer;

import android.content.Context;
import android.content.ContextWrapper;
import com.xinzhu.haunted.android.app.l;
import com.xinzhu.haunted.android.content.a;
import com.xinzhu.haunted.android.content.h;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.e;
import com.xinzhu.overmind.client.hook.c;
import com.xinzhu.overmind.client.hook.proxies.am.b;
import java.util.Objects;
/* loaded from: classes.dex */
public class ContextFixer {
    public static final String TAG = "ContextFixer";

    public static void fix(Context context) {
        try {
            if (Objects.equals(e.getVPackageName(), "com.tencent.mm")) {
                c.c().b(b.class);
                c.c().b(com.xinzhu.overmind.client.hook.proxies.pm.c.class);
            }
            int i4 = 0;
            while (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
                i4++;
                if (i4 >= 10) {
                    return;
                }
            }
            l lVar = new l(context);
            lVar.t(null);
            context.getPackageManager();
            lVar.q(Overmind.getHostPkg());
            lVar.r(Overmind.getHostPkg());
            new h(context.getContentResolver()).l0(Overmind.getHostPkg());
            if (com.xinzhu.overmind.utils.e.h() && lVar.e()) {
                fixAttributionSource(lVar.i());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void fixAttributionSource(Object obj) {
        while (obj != null) {
            try {
                a aVar = new a(obj);
                Object d5 = aVar.d();
                if (d5 != null) {
                    com.xinzhu.haunted.android.content.b bVar = new com.xinzhu.haunted.android.content.b(d5);
                    bVar.e(Overmind.getHostPkg());
                    if (Overmind.getHostUid() > 0) {
                        bVar.f(Integer.valueOf(Overmind.getHostUid()));
                    }
                }
                obj = aVar.c();
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
    }
}
