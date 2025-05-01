package k;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.sdk.cons.b;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class a {
    public static synchronized String a(Context context, Map<String, String> map) {
        synchronized (a.class) {
            HashMap hashMap = new HashMap();
            hashMap.put(b.f4834g, com.alipay.security.mobile.module.commonutils.a.a(map, b.f4834g, ""));
            hashMap.put(b.f4830c, com.alipay.security.mobile.module.commonutils.a.a(map, b.f4830c, ""));
            hashMap.put("userId", com.alipay.security.mobile.module.commonutils.a.a(map, "userId", ""));
            com.alipay.apmobilesecuritysdk.face.a.a(context).d(hashMap);
            String a5 = f.a();
            if (com.alipay.security.mobile.module.commonutils.a.b(a5)) {
                com.alipay.apmobilesecuritysdk.e.b b5 = com.alipay.apmobilesecuritysdk.e.a.b(context);
                if (b5 != null && !com.alipay.security.mobile.module.commonutils.a.b(b5.f4648a)) {
                    return b5.f4648a;
                }
                String b6 = j.a.b(context);
                if (com.alipay.security.mobile.module.commonutils.a.b(b6)) {
                    return com.alipay.apmobilesecuritysdk.f.b.a(context);
                }
                return b6;
            }
            return a5;
        }
    }
}
