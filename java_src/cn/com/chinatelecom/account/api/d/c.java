package cn.com.chinatelecom.account.api.d;

import android.content.Context;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.e.j;
import java.net.InetAddress;
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f629a = "c";

    /* renamed from: b  reason: collision with root package name */
    private static String f630b = null;

    /* renamed from: c  reason: collision with root package name */
    private static long f631c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static long f632d = 1800000;

    public static synchronized String a() {
        synchronized (c.class) {
            if (System.currentTimeMillis() >= f631c || !cn.com.chinatelecom.account.api.e.d.a(f630b)) {
                return null;
            }
            return f630b;
        }
    }

    public static void a(final Context context) {
        if (f630b == null && cn.com.chinatelecom.account.api.e.g.a() == null) {
            new cn.com.chinatelecom.account.api.c.d().a(new cn.com.chinatelecom.account.api.c.e() { // from class: cn.com.chinatelecom.account.api.d.c.1
                @Override // cn.com.chinatelecom.account.api.c.e
                public void a() {
                    cn.com.chinatelecom.account.api.e.e a5;
                    String a6;
                    try {
                        String a7 = cn.com.chinatelecom.account.api.e.d.a();
                        cn.com.chinatelecom.account.api.e.f.a(a7).a(cn.com.chinatelecom.account.api.e.d.a(context)).c("dns").b(cn.com.chinatelecom.account.api.e.g.f(context));
                        String a8 = cn.com.chinatelecom.account.api.a.d.a(cn.com.chinatelecom.account.api.e.b.f673f);
                        String b5 = c.b(a8, a7, 0);
                        if (TextUtils.isEmpty(b5)) {
                            b5 = c.b(a8, a7, 1);
                        }
                        synchronized (c.class) {
                            if (TextUtils.isEmpty(b5)) {
                                a5 = cn.com.chinatelecom.account.api.e.f.a(a7).a(80011);
                                a6 = cn.com.chinatelecom.account.api.a.d.a(j.f732q);
                            } else {
                                String unused = c.f630b = b5;
                                long unused2 = c.f631c = System.currentTimeMillis() + c.f632d;
                                a5 = cn.com.chinatelecom.account.api.e.f.a(a7).a(0);
                                a6 = "success";
                            }
                            a5.e(a6);
                        }
                        cn.com.chinatelecom.account.api.e.f.b(a7);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, String str2, int i4) {
        StringBuilder sb;
        String str3;
        try {
            cn.com.chinatelecom.account.api.e.f.a(str2).b(i4);
            return InetAddress.getByName(str).getHostAddress();
        } catch (Exception e5) {
            if (i4 == 0) {
                sb = new StringBuilder();
                str3 = "first exception: ";
            } else {
                sb = new StringBuilder();
                str3 = "retry exception: ";
            }
            sb.append(str3);
            sb.append(e5.getMessage());
            cn.com.chinatelecom.account.api.e.f.a(str2).g(sb.toString());
            return null;
        }
    }
}
