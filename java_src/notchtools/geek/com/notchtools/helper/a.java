package notchtools.geek.com.notchtools.helper;

import android.os.Build;
import android.text.TextUtils;
/* compiled from: DeviceBrandTools.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f71942a;

    public static a a() {
        if (f71942a == null) {
            synchronized (a.class) {
                if (f71942a == null) {
                    f71942a = new a();
                }
            }
        }
        return f71942a;
    }

    private String b(String str) {
        return c.c().a(str);
    }

    public final boolean c() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("HUAWEI");
    }

    public final boolean d() {
        return !TextUtils.isEmpty(b("ro.miui.ui.version.name"));
    }

    public final boolean e() {
        return !TextUtils.isEmpty(b("ro.product.brand"));
    }

    public final boolean f() {
        return !TextUtils.isEmpty(b("ro.vivo.os.name"));
    }
}
