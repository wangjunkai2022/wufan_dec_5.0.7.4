package com.kuaishou.weapon.p0;

import dalvik.system.VMRuntime;
/* loaded from: classes5.dex */
public class cr {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f55464a = false;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f55465b = true;

    static {
        try {
            f55464a = ((Boolean) VMRuntime.class.getDeclaredMethod("is64Bit", new Class[0]).invoke(VMRuntime.class.getDeclaredMethod("getRuntime", new Class[0]).invoke(null, new Object[0]), new Object[0])).booleanValue();
        } catch (Exception unused) {
            f55464a = false;
        }
        f55465b = System.getProperty("java.vm.version").startsWith("2");
    }

    public static boolean a() {
        return f55464a;
    }

    public static boolean b() {
        return f55465b;
    }
}
