package com.sdk.l;

import com.sdk.Unicorn.base.framework.bean.KInfo;
import com.sdk.f.g;
import com.sdk.o.b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f60074a = "com.sdk.l.a";

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f60075b = g.f60051b;

    public static String a(Object obj) {
        try {
            Field[] declaredFields = Class.forName(obj.getClass().getName()).getDeclaredFields();
            JSONObject jSONObject = new JSONObject();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                String name = field.getName();
                if (!"serialVersionUID".equals(name)) {
                    Object obj2 = field.get(obj);
                    if (field.getType().equals(ArrayList.class)) {
                        JSONArray jSONArray = new JSONArray();
                        ArrayList arrayList = (ArrayList) obj2;
                        if (arrayList != null) {
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                Object obj3 = arrayList.get(i4);
                                Class<?> cls = obj3.getClass();
                                if (cls.equals(KInfo.class)) {
                                    Field[] declaredFields2 = cls.getDeclaredFields();
                                    JSONObject jSONObject2 = new JSONObject();
                                    for (Field field2 : declaredFields2) {
                                        field2.setAccessible(true);
                                        jSONObject2.put(field2.getName(), field2.get(obj3));
                                    }
                                    jSONArray.put(jSONObject2);
                                } else {
                                    jSONArray.put(obj3);
                                }
                            }
                        }
                        obj2 = jSONArray;
                    }
                    jSONObject.put(name, obj2);
                }
            }
            return jSONObject.toString();
        } catch (Exception e5) {
            b.a(f60074a, e5.getMessage(), Boolean.valueOf(f60075b));
            return null;
        }
    }
}
