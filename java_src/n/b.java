package n;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    private static b f71676c;

    /* renamed from: a  reason: collision with root package name */
    public String f71677a;

    /* renamed from: b  reason: collision with root package name */
    public String f71678b;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f71676c == null) {
                f71676c = new b();
                Context context = m.b.b().f71504a;
                a aVar = new a(context);
                String b5 = com.alipay.sdk.util.b.a(context).b();
                String e5 = com.alipay.sdk.util.b.a(context).e();
                f71676c.f71677a = aVar.l(b5, e5);
                f71676c.f71678b = aVar.r(b5, e5);
                if (TextUtils.isEmpty(f71676c.f71678b)) {
                    b bVar2 = f71676c;
                    String hexString = Long.toHexString(System.currentTimeMillis());
                    if (hexString.length() > 10) {
                        hexString = hexString.substring(hexString.length() - 10);
                    }
                    bVar2.f71678b = hexString;
                }
                b bVar3 = f71676c;
                aVar.j(b5, e5, bVar3.f71677a, bVar3.f71678b);
            }
            bVar = f71676c;
        }
        return bVar;
    }

    private void b(Context context) {
        a aVar = new a(context);
        try {
            aVar.j(com.alipay.sdk.util.b.a(context).b(), com.alipay.sdk.util.b.a(context).e(), this.f71677a, this.f71678b);
        } catch (Exception unused) {
        } finally {
            aVar.close();
        }
    }

    private void c(String str) {
        this.f71677a = str;
    }

    private String d() {
        return this.f71677a;
    }

    private void e(String str) {
        this.f71678b = str;
    }

    private String f() {
        return this.f71678b;
    }

    private boolean g() {
        return TextUtils.isEmpty(this.f71677a);
    }

    private static void h() {
        Context context = m.b.b().f71504a;
        String b5 = com.alipay.sdk.util.b.a(context).b();
        String e5 = com.alipay.sdk.util.b.a(context).e();
        a aVar = new a(context);
        aVar.h(b5, e5);
        aVar.close();
    }

    private static String i() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }
}
