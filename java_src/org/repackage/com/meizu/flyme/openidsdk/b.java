package org.repackage.com.meizu.flyme.openidsdk;

import android.content.Context;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import java.lang.reflect.Method;
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f72980a = "OpenIdHelper";

    /* renamed from: b  reason: collision with root package name */
    private static Method f72981b;

    public static String a(Context context) {
        f d5 = f.d();
        return d5.a(context.getApplicationContext(), d5.f72989a);
    }

    public static void b(boolean z4) {
        f.d();
        f.f(z4);
    }

    public static final boolean c() {
        Context context = null;
        try {
            if (f72981b == null) {
                Method method = Class.forName(InstrumentationProxy.f64868d).getMethod("currentApplication", new Class[0]);
                f72981b = method;
                method.setAccessible(true);
            }
            context = (Context) f72981b.invoke(null, new Object[0]);
        } catch (Exception e5) {
            new StringBuilder("ActivityThread:currentApplication --> ").append(e5.toString());
        }
        if (context == null) {
            return false;
        }
        return f.d().h(context, false);
    }

    public static String d(Context context) {
        f d5 = f.d();
        return d5.a(context.getApplicationContext(), d5.f72990b);
    }

    public static String e(Context context) {
        f d5 = f.d();
        return d5.a(context.getApplicationContext(), d5.f72992d);
    }

    public static String f(Context context) {
        f d5 = f.d();
        return d5.a(context.getApplicationContext(), d5.f72991c);
    }
}
