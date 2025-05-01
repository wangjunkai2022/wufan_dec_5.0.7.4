package com.join.mgps.Util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
/* compiled from: OSUtil.java */
/* loaded from: classes3.dex */
public class k1 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f27905a = "ro.miui.ui.version.code";

    /* renamed from: b  reason: collision with root package name */
    private static final String f27906b = "ro.miui.ui.version.name";

    /* renamed from: c  reason: collision with root package name */
    private static final String f27907c = "ro.miui.internal.storage";

    /* renamed from: d  reason: collision with root package name */
    private static final String f27908d = "ro.build.version.emui";

    /* renamed from: e  reason: collision with root package name */
    private static final String f27909e = "ro.build.hw_emui_api_level";

    /* renamed from: f  reason: collision with root package name */
    private static final String f27910f = "ro.confg.hw_systemversion";

    /* renamed from: g  reason: collision with root package name */
    private static final String f27911g = "ro.build.display.id";

    /* renamed from: h  reason: collision with root package name */
    private static final String f27912h = "Flyme";

    /* renamed from: i  reason: collision with root package name */
    private static final String f27913i = "persist.sys.use.flyme.icon";

    /* renamed from: j  reason: collision with root package name */
    private static final String f27914j = "ro.meizu.setupwizard.flyme";

    /* renamed from: k  reason: collision with root package name */
    private static final String f27915k = "ro.flyme.published";

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OSUtil.java */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Properties f27916a;

        private a() throws IOException {
            Properties properties = new Properties();
            this.f27916a = properties;
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
        }

        public static a i() throws IOException {
            return new a();
        }

        public boolean a(Object obj) {
            return this.f27916a.containsKey(obj);
        }

        public boolean b(Object obj) {
            return this.f27916a.containsValue(obj);
        }

        public Set<Map.Entry<Object, Object>> c() {
            return this.f27916a.entrySet();
        }

        public String d(String str) {
            return this.f27916a.getProperty(str);
        }

        public String e(String str, String str2) {
            return this.f27916a.getProperty(str, str2);
        }

        public boolean f() {
            return this.f27916a.isEmpty();
        }

        public Set<Object> g() {
            return this.f27916a.keySet();
        }

        public Enumeration<Object> h() {
            return this.f27916a.keys();
        }

        public int j() {
            return this.f27916a.size();
        }

        public Collection<Object> k() {
            return this.f27916a.values();
        }
    }

    public static boolean a(Context context) {
        String str;
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", q.a.f73126a);
            boolean z4 = identifier > 0 ? resources.getBoolean(identifier) : false;
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            } catch (Exception unused) {
            }
            if ("1".equals(str)) {
                return false;
            }
            if ("0".equals(str)) {
                return true;
            }
            return z4;
        } catch (Exception unused2) {
            return false;
        }
    }

    private static String b(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static boolean c() {
        return h(f27908d, f27909e, f27910f);
    }

    public static boolean d() {
        if (h(f27913i, f27914j, f27915k)) {
            return true;
        }
        try {
            a i4 = a.i();
            if (i4.a(f27911g)) {
                String d5 = i4.d(f27911g);
                if (TextUtils.isEmpty(d5)) {
                    return false;
                }
                return d5.contains(f27912h);
            }
            return false;
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static boolean e() {
        return Build.MANUFACTURER.equalsIgnoreCase("HUAWEI");
    }

    public static boolean f(Context context) {
        int i4;
        if (Build.VERSION.SDK_INT < 21) {
            i4 = Settings.System.getInt(context.getContentResolver(), "navigationbar_is_min", 0);
        } else {
            i4 = Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0);
        }
        return i4 == 1;
    }

    public static boolean g() {
        return h(f27905a, f27906b, f27907c);
    }

    private static boolean h(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            try {
                try {
                    a i4 = a.i();
                    for (String str : strArr) {
                        if (i4.d(str) != null) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } catch (IOException unused) {
                for (String str2 : strArr) {
                    if (b(str2, null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
