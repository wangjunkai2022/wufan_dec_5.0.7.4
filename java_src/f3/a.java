package f3;

import android.app.Application;
import com.xinzhu.overmind.b;
import java.lang.reflect.Field;
import java.util.HashMap;
/* compiled from: WeChatCompat.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f69005a = "WeChatCompat";

    public static void a(String str, Application application) {
        Field[] declaredFields;
        HashMap hashMap;
        if ("com.tencent.mm".equals(str)) {
            try {
                for (Field field : Class.forName("com.tencent.mm.sensitive.l", true, application.getClassLoader()).getDeclaredFields()) {
                    field.setAccessible(true);
                    if (HashMap.class.isAssignableFrom(field.getType()) && (hashMap = (HashMap) field.get(null)) != null && hashMap.get("device_identifiers") != null && hashMap.get("iphonesubinfo") != null && hashMap.get("package") != null) {
                        b.c(f69005a, "WeChatCompat works");
                        hashMap.clear();
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
