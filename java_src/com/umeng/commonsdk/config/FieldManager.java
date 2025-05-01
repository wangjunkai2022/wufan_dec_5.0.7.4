package com.umeng.commonsdk.config;

import android.content.Context;
import android.util.Pair;
import com.umeng.commonsdk.config.d;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public class FieldManager {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64099a = "cfgfd";

    /* renamed from: b  reason: collision with root package name */
    private static b f64100b = b.b();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f64101c = false;

    /* renamed from: d  reason: collision with root package name */
    private static Object f64102d = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final FieldManager f64103a = new FieldManager();

        private a() {
        }
    }

    public static FieldManager a() {
        return a.f64103a;
    }

    public static boolean allow(String str) {
        synchronized (f64102d) {
            if (f64101c) {
                return b.a(str);
            }
            return false;
        }
    }

    public static boolean b() {
        boolean z4;
        synchronized (f64102d) {
            z4 = f64101c;
        }
        return z4;
    }

    private FieldManager() {
    }

    public void a(Context context) {
        String str;
        String str2 = "1001@3749699455,2130669566,262139,1983";
        String[] strArr = {d.a.class.getName(), d.b.class.getName(), d.c.class.getName(), d.EnumC0671d.class.getName()};
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "cfgfd", "1001@3749699455,2130669566,262139,1983");
        synchronized (f64102d) {
            Pair<Long, String> a5 = a(imprintProperty);
            if (((Long) a5.first).longValue() > 1000 && (str = (String) a5.second) != null && str.length() > 0) {
                str2 = str;
            }
            String[] split = str2.split(",");
            int length = split.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                g gVar = new g();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList.add(gVar);
                    ((e) arrayList.get(i4)).a(split[i4], f64100b, d.b(strArr[i4]));
                }
            }
            f64101c = true;
        }
    }

    public void a(Context context, String str) {
        String str2;
        String str3 = "1001@3749699455,2130669566,262139,1983";
        String[] strArr = {d.a.class.getName(), d.b.class.getName(), d.c.class.getName(), d.EnumC0671d.class.getName()};
        synchronized (f64102d) {
            f64100b.a();
            if (str != null) {
                Pair<Long, String> a5 = a(str);
                if (((Long) a5.first).longValue() > 1000 && (str2 = (String) a5.second) != null && str2.length() > 0) {
                    str3 = str2;
                }
            }
            String[] split = str3.split(",");
            int length = split.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                g gVar = new g();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList.add(gVar);
                    ((e) arrayList.get(i4)).a(split[i4], f64100b, d.b(strArr[i4]));
                }
            }
            f64101c = true;
        }
    }

    private static Pair<Long, String> a(String str) {
        Pair<Long, String> pair = new Pair<>(-1L, null);
        if (str != null && str.length() >= 2) {
            String[] split = str.split("@");
            if (split.length < 2) {
                return pair;
            }
            try {
                long parseLong = Long.parseLong(split[0]);
                return new Pair<>(Long.valueOf(parseLong), split[1]);
            } catch (Throwable unused) {
            }
        }
        return pair;
    }
}
