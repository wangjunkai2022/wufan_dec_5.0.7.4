package com.aggmoread.sdk.z.a.j;
/* loaded from: classes2.dex */
public class e {
    public static Class a() {
        try {
            return Class.forName("com.aggmoread.sdk.a.adcomm.amsdk.AMCustomBroadReceiver");
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(String str) {
        Class a5 = a();
        if (a5 != null) {
            try {
                a5.getDeclaredMethod("remove", String.class).invoke(a5, str);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public static void a(String str, l lVar) {
        com.aggmoread.sdk.z.a.d.c("APINFICLCKRIVER", "register enter , url = " + str);
        Class a5 = a();
        if (a5 != null) {
            try {
                a5.getDeclaredMethod("register", String.class, l.class).invoke(a5, str, lVar);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }
}
