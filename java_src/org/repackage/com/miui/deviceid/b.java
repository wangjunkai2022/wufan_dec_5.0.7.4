package org.repackage.com.miui.deviceid;

import android.content.Context;
import java.lang.reflect.Method;
/* compiled from: IdentifierManager.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f73001a = "IdentifierManager";

    /* renamed from: b  reason: collision with root package name */
    private static Object f73002b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f73003c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f73004d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f73005e;

    /* renamed from: f  reason: collision with root package name */
    private static Method f73006f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f73007g;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f73003c = cls;
            f73002b = cls.newInstance();
            f73004d = f73003c.getMethod("getUDID", Context.class);
            f73005e = f73003c.getMethod("getOAID", Context.class);
            f73006f = f73003c.getMethod("getVAID", Context.class);
            f73007g = f73003c.getMethod("getAAID", Context.class);
        } catch (Exception unused) {
        }
    }

    public static String a(Context context) {
        return b(context, f73004d);
    }

    private static String b(Context context, Method method) {
        Object obj = f73002b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean c() {
        return (f73003c == null || f73002b == null) ? false : true;
    }

    public static String d(Context context) {
        return b(context, f73005e);
    }

    public static String e(Context context) {
        return b(context, f73006f);
    }

    public static String f(Context context) {
        return b(context, f73007g);
    }
}
