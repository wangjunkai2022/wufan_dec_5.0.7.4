package com.alipay.apmobilesecuritysdk.c;

import android.content.Context;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f4642a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f4643b = {"AD1", "AD2", "AD3", "AD5", "AD6", "AD7", "AD8", "AD9", "AD10", "AD11", "AD12", "AD13", "AD14", "AD15", "AD16", "AD18", "AD19", "AD20", "AD21", "AL3", "AA1", "AA2", "AA3", "AA4", "AA5", "AC1", "AC2", "AC4", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    private static String a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        int i4 = 0;
        while (i4 < arrayList.size()) {
            String str = (String) arrayList.get(i4);
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder();
            sb.append(i4 == 0 ? "" : m.a.f71490d);
            sb.append(str);
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append(str2);
            stringBuffer.append(sb.toString());
            i4++;
        }
        return stringBuffer.toString();
    }

    public static synchronized Map<String, String> b(Context context, Map<String, String> map) {
        Map<String, String> map2;
        synchronized (e.class) {
            if (f4642a == null) {
                e(context, map);
            }
            map2 = f4642a;
        }
        return map2;
    }

    public static synchronized void c() {
        synchronized (e.class) {
            f4642a = null;
        }
    }

    public static synchronized String d(Context context, Map<String, String> map) {
        String[] strArr;
        String a5;
        synchronized (e.class) {
            b(context, map);
            TreeMap treeMap = new TreeMap();
            for (String str : f4643b) {
                if (f4642a.containsKey(str)) {
                    treeMap.put(str, f4642a.get(str));
                }
            }
            a5 = com.alipay.security.mobile.module.commonutils.crypto.d.a(a(treeMap));
        }
        return a5;
    }

    private static synchronized void e(Context context, Map<String, String> map) {
        synchronized (e.class) {
            TreeMap treeMap = new TreeMap();
            f4642a = treeMap;
            treeMap.putAll(b.a(context, map));
            f4642a.putAll(d.a(context));
            f4642a.putAll(c.a(context));
            f4642a.putAll(a.a(context));
        }
    }
}
