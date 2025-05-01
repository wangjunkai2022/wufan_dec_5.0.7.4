package com.beizi.fusion.e.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.beizi.fusion.g.af;
import com.ss.android.download.api.constant.BaseConstants;
/* compiled from: DevicesIDsHelper.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private a f6770a;

    /* compiled from: DevicesIDsHelper.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    public b(a aVar) {
        this.f6770a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        return Build.MANUFACTURER.toUpperCase();
    }

    public boolean c() {
        String a5 = a("ro.build.freeme.label");
        return !TextUtils.isEmpty(a5) && a5.equalsIgnoreCase("FREEMEOS");
    }

    public boolean d() {
        String a5 = a("ro.ssui.product");
        return (TextUtils.isEmpty(a5) || a5.equalsIgnoreCase("unknown")) ? false : true;
    }

    public static boolean b() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
            String str = Build.BRAND;
            if (!str.equalsIgnoreCase("HUAWEI") && !str.equalsIgnoreCase("HONOR")) {
                return false;
            }
        }
        return true;
    }

    public void a(Context context) {
        String str = null;
        try {
            af.c("BeiZis", "init oaid " + e());
            if ("ASUS".equals(e().toUpperCase())) {
                b(context);
            } else if (b()) {
                b(context);
            } else if ("LENOVO".equals(e().toUpperCase())) {
                new d(context).a(this.f6770a);
            } else if ("MOTOLORA".equals(e().toUpperCase())) {
                new d(context).a(this.f6770a);
            } else if ("MEIZU".equals(e().toUpperCase())) {
                new e(context).a(this.f6770a);
            } else if ("NUBIA".equals(e().toUpperCase())) {
                str = new f(context).a();
            } else if (a()) {
                b(context);
            } else if ("SAMSUNG".equals(e().toUpperCase())) {
                b(context);
            } else if ("VIVO".equals(e().toUpperCase())) {
                str = new j(context).a();
            } else if ("XIAOMI".equals(e().toUpperCase())) {
                str = new k(context).a();
            } else if ("BLACKSHARK".equals(e().toUpperCase())) {
                str = new k(context).a();
            } else if ("ONEPLUS".equals(e().toUpperCase())) {
                b(context);
            } else if ("ZTE".equals(e().toUpperCase())) {
                b(context);
            } else {
                if (!"FERRMEOS".equals(e().toUpperCase()) && !c()) {
                    if ("SSUI".equals(e().toUpperCase()) || d()) {
                        b(context);
                    }
                }
                b(context);
            }
            a aVar = this.f6770a;
            if (aVar == null || str == null) {
                return;
            }
            aVar.a(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b(final Context context) {
        new Thread(new Runnable() { // from class: com.beizi.fusion.e.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (context == null) {
                    return;
                }
                try {
                    if ("ASUS".equals(b.this.e().toUpperCase())) {
                        new com.beizi.fusion.e.a.a(context).a(b.this.f6770a);
                    } else if (b.b()) {
                        new c(context).a(b.this.f6770a);
                    } else if (b.a()) {
                        new h(context).a(b.this.f6770a);
                    } else if ("ONEPLUS".equals(b.this.e().toUpperCase())) {
                        new g(context).a(b.this.f6770a);
                    } else if ("ZTE".equals(b.this.e().toUpperCase())) {
                        new l(context).a(b.this.f6770a);
                    } else {
                        if (!"FERRMEOS".equals(b.this.e().toUpperCase()) && !b.this.c()) {
                            if (!"SSUI".equals(b.this.e().toUpperCase()) && !b.this.d()) {
                                if ("SAMSUNG".equals(b.this.e().toUpperCase())) {
                                    new i(context).a(b.this.f6770a);
                                }
                            }
                            new l(context).a(b.this.f6770a);
                        }
                        new l(context).a(b.this.f6770a);
                    }
                } catch (Throwable unused) {
                    af.c("BeiZis", "getIDFromNewThead exception");
                }
            }
        }).start();
    }

    public static boolean a() {
        if (!Build.MANUFACTURER.equalsIgnoreCase(BaseConstants.ROM_OPPO_UPPER_CONSTANT)) {
            String str = Build.BRAND;
            if (!str.equalsIgnoreCase(BaseConstants.ROM_OPPO_UPPER_CONSTANT) && !str.equalsIgnoreCase("REALME") && TextUtils.isEmpty(a("ro.build.version.opporom", ""))) {
                return false;
            }
        }
        return true;
    }

    public static String a(String str, String str2) {
        String str3;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str3 = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e5) {
            af.c("BeiZis", "System property invoke error: " + e5);
            str3 = null;
        }
        return str3 == null ? "" : str3;
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception unused) {
            return null;
        }
    }
}
