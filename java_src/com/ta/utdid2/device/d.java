package com.ta.utdid2.device;

import android.content.Context;
import android.provider.Settings;
import com.ta.utdid2.android.utils.g;
import com.ta.utdid2.android.utils.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes5.dex */
public class d {

    /* renamed from: i  reason: collision with root package name */
    private static final String f62110i = "d6fc3a4a06adbde89223bvefedc24fecde188aaa9161";

    /* renamed from: k  reason: collision with root package name */
    private static d f62112k = null;

    /* renamed from: l  reason: collision with root package name */
    static final String f62113l = "dxCRMxhQkdGePGnp";

    /* renamed from: m  reason: collision with root package name */
    static final String f62114m = "mqBRboGZkQPcAkyk";

    /* renamed from: n  reason: collision with root package name */
    private static final String f62115n = ".DataStorage";

    /* renamed from: o  reason: collision with root package name */
    private static final String f62116o = "ContextData";

    /* renamed from: q  reason: collision with root package name */
    private static final String f62118q = "Alvin2";

    /* renamed from: a  reason: collision with root package name */
    private Context f62119a;

    /* renamed from: c  reason: collision with root package name */
    private f f62121c;

    /* renamed from: d  reason: collision with root package name */
    private String f62122d;

    /* renamed from: e  reason: collision with root package name */
    private String f62123e;

    /* renamed from: f  reason: collision with root package name */
    private com.ta.utdid2.core.persistent.c f62124f;

    /* renamed from: g  reason: collision with root package name */
    private com.ta.utdid2.core.persistent.c f62125g;

    /* renamed from: j  reason: collision with root package name */
    private static final Object f62111j = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static final String f62117p = ".UTSystemConfig" + File.separator + "Global";

    /* renamed from: b  reason: collision with root package name */
    private String f62120b = null;

    /* renamed from: h  reason: collision with root package name */
    private Pattern f62126h = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public d(Context context) {
        this.f62119a = null;
        this.f62121c = null;
        this.f62122d = "xx_utdid_key";
        this.f62123e = "xx_utdid_domain";
        this.f62124f = null;
        this.f62125g = null;
        this.f62119a = context;
        this.f62125g = new com.ta.utdid2.core.persistent.c(context, f62117p, f62118q, false, true);
        this.f62124f = new com.ta.utdid2.core.persistent.c(context, f62115n, f62116o, false, true);
        this.f62121c = new f();
        this.f62122d = String.format("K_%d", Integer.valueOf(i.b(this.f62122d)));
        this.f62123e = String.format("D_%d", Integer.valueOf(i.b(this.f62123e)));
    }

    private static String a(byte[] bArr) throws Exception {
        Mac mac = Mac.getInstance(com.alipay.security.mobile.module.commonutils.crypto.c.f4997a);
        mac.init(new SecretKeySpec(f62110i.getBytes(), mac.getAlgorithm()));
        return com.ta.utdid2.android.utils.b.f(mac.doFinal(bArr), 2);
    }

    private final byte[] b() throws Exception {
        String sb;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nextInt = new Random().nextInt();
        byte[] a5 = com.ta.utdid2.android.utils.e.a(currentTimeMillis);
        byte[] a6 = com.ta.utdid2.android.utils.e.a(nextInt);
        byteArrayOutputStream.write(a5, 0, 4);
        byteArrayOutputStream.write(a6, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            sb = g.a(this.f62119a);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(new Random().nextInt());
            sb = sb2.toString();
        }
        byteArrayOutputStream.write(com.ta.utdid2.android.utils.e.a(i.b(sb)), 0, 4);
        byteArrayOutputStream.write(com.ta.utdid2.android.utils.e.a(i.b(a(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    private void c() {
        com.ta.utdid2.core.persistent.c cVar = this.f62125g;
        if (cVar != null) {
            if (i.c(cVar.l("UTDID2"))) {
                String l4 = this.f62125g.l("UTDID");
                if (!i.c(l4)) {
                    k(l4);
                }
            }
            boolean z4 = false;
            boolean z5 = true;
            if (!i.c(this.f62125g.l("DID"))) {
                this.f62125g.u("DID");
                z4 = true;
            }
            if (!i.c(this.f62125g.l("EI"))) {
                this.f62125g.u("EI");
                z4 = true;
            }
            if (i.c(this.f62125g.l("SI"))) {
                z5 = z4;
            } else {
                this.f62125g.u("SI");
            }
            if (z5) {
                this.f62125g.c();
            }
        }
    }

    private String d() {
        com.ta.utdid2.core.persistent.c cVar = this.f62125g;
        if (cVar != null) {
            String l4 = cVar.l("UTDID2");
            if (i.c(l4) || this.f62121c.d(l4) == null) {
                return null;
            }
            return l4;
        }
        return null;
    }

    public static d f(Context context) {
        if (context != null && f62112k == null) {
            synchronized (f62111j) {
                if (f62112k == null) {
                    d dVar = new d(context);
                    f62112k = dVar;
                    dVar.c();
                }
            }
        }
        return f62112k;
    }

    private boolean g(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.f62126h.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    private void h(String str) {
        com.ta.utdid2.core.persistent.c cVar;
        if (str == null || (cVar = this.f62124f) == null || str.equals(cVar.l(this.f62122d))) {
            return;
        }
        this.f62124f.s(this.f62122d, str);
        this.f62124f.c();
    }

    private void i(String str) {
        if (this.f62119a.checkCallingOrSelfPermission("android.permission.WRITE_SETTINGS") == 0 && g(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length()) {
                String str2 = null;
                try {
                    str2 = Settings.System.getString(this.f62119a.getContentResolver(), f62114m);
                } catch (Exception unused) {
                }
                if (g(str2)) {
                    return;
                }
                try {
                    Settings.System.putString(this.f62119a.getContentResolver(), f62114m, str);
                } catch (Exception unused2) {
                }
            }
        }
    }

    private void j(String str) {
        if (this.f62119a.checkCallingOrSelfPermission("android.permission.WRITE_SETTINGS") != 0 || str == null) {
            return;
        }
        l(str);
    }

    private void k(String str) {
        com.ta.utdid2.core.persistent.c cVar;
        if (g(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() != 24 || (cVar = this.f62125g) == null) {
                return;
            }
            cVar.s("UTDID2", str);
            this.f62125g.c();
        }
    }

    private void l(String str) {
        String str2;
        try {
            str2 = Settings.System.getString(this.f62119a.getContentResolver(), f62113l);
        } catch (Exception unused) {
            str2 = null;
        }
        if (str.equals(str2)) {
            return;
        }
        try {
            Settings.System.putString(this.f62119a.getContentResolver(), f62113l, str);
        } catch (Exception unused2) {
        }
    }

    public synchronized String e() {
        String str;
        String string;
        String str2 = this.f62120b;
        if (str2 != null) {
            return str2;
        }
        try {
            string = Settings.System.getString(this.f62119a.getContentResolver(), f62114m);
        } catch (Exception unused) {
        }
        if (g(string)) {
            return string;
        }
        e eVar = new e();
        boolean z4 = false;
        try {
            str = Settings.System.getString(this.f62119a.getContentResolver(), f62113l);
        } catch (Exception unused2) {
            str = null;
        }
        if (i.c(str)) {
            z4 = true;
        } else {
            String b5 = eVar.b(str);
            if (g(b5)) {
                i(b5);
                return b5;
            }
            String a5 = eVar.a(str);
            if (g(a5)) {
                String d5 = this.f62121c.d(a5);
                if (!i.c(d5)) {
                    j(d5);
                    try {
                        str = Settings.System.getString(this.f62119a.getContentResolver(), f62113l);
                    } catch (Exception unused3) {
                    }
                }
            }
            String a6 = this.f62121c.a(str);
            if (g(a6)) {
                this.f62120b = a6;
                k(a6);
                h(str);
                i(this.f62120b);
                return this.f62120b;
            }
        }
        String d6 = d();
        if (g(d6)) {
            String d7 = this.f62121c.d(d6);
            if (z4) {
                j(d7);
            }
            i(d6);
            h(d7);
            this.f62120b = d6;
            return d6;
        }
        String l4 = this.f62124f.l(this.f62122d);
        if (!i.c(l4)) {
            String a7 = eVar.a(l4);
            if (!g(a7)) {
                a7 = this.f62121c.a(l4);
            }
            if (g(a7)) {
                String d8 = this.f62121c.d(a7);
                if (!i.c(a7)) {
                    this.f62120b = a7;
                    if (z4) {
                        j(d8);
                    }
                    k(this.f62120b);
                    return this.f62120b;
                }
            }
        }
        try {
            byte[] b6 = b();
            if (b6 != null) {
                String f5 = com.ta.utdid2.android.utils.b.f(b6, 2);
                this.f62120b = f5;
                k(f5);
                String c5 = this.f62121c.c(b6);
                if (c5 != null) {
                    if (z4) {
                        j(c5);
                    }
                    h(c5);
                }
                return this.f62120b;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return null;
    }
}
