package com.aggmoread.sdk.z.c.a.a.e.q;

import android.content.ContextWrapper;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    static Map<String, i> f3533a = new HashMap();

    public static boolean a(ContextWrapper contextWrapper, String str, String str2, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        i iVar;
        try {
            if (f3533a.containsKey(str)) {
                iVar = f3533a.get(str);
                iVar.a();
            } else {
                iVar = new i(contextWrapper.getApplicationContext(), str, str2);
            }
            Field declaredField = ContextWrapper.class.getDeclaredField("mBase");
            declaredField.setAccessible(true);
            declaredField.set(contextWrapper, iVar);
            a(eVar, str, iVar);
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static boolean a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, String str, i iVar) {
        return true;
    }
}
