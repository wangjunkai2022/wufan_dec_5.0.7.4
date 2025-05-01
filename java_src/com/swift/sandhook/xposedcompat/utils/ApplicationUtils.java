package com.swift.sandhook.xposedcompat.utils;

import android.app.Application;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ApplicationUtils {
    static Application application;
    private static Class classActivityThread;
    private static Method currentApplicationMethod;

    public static Application currentApplication() {
        Application application2 = application;
        if (application2 != null) {
            return application2;
        }
        if (currentApplicationMethod == null) {
            try {
                Class<?> cls = Class.forName(InstrumentationProxy.f64868d);
                classActivityThread = cls;
                currentApplicationMethod = cls.getDeclaredMethod("currentApplication", new Class[0]);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Method method = currentApplicationMethod;
        if (method == null) {
            return null;
        }
        try {
            application = (Application) method.invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        return application;
    }
}
