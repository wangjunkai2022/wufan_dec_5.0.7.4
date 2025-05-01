package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.swift.sandhook.annotation.MethodReflectParams;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static Proxy f62490e;

    /* renamed from: a  reason: collision with root package name */
    protected HashMap<String, HashMap<String, byte[]>> f62491a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    protected String f62492b;

    /* renamed from: c  reason: collision with root package name */
    i f62493c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, Object> f62494d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        new HashMap();
        this.f62494d = new HashMap<>();
        this.f62492b = "GBK";
        this.f62493c = new i();
    }

    public static void a(String str, int i4) {
        if (TextUtils.isEmpty(str)) {
            f62490e = null;
        } else {
            f62490e = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i4));
        }
    }

    public static Proxy b() {
        return f62490e;
    }

    public static an b(byte[] bArr) {
        if (bArr != null) {
            try {
                d dVar = new d();
                dVar.c();
                dVar.a("utf-8");
                dVar.a(bArr);
                Object b5 = dVar.b("detail", new an());
                if (an.class.isInstance(b5)) {
                    return (an) an.class.cast(b5);
                }
                return null;
            } catch (Throwable th) {
                if (!x.b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void a(InetAddress inetAddress, int i4) {
        if (inetAddress == null) {
            f62490e = null;
        } else {
            f62490e = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(inetAddress, i4));
        }
    }

    public void a(String str) {
        this.f62492b = str;
    }

    public static aq a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        aq aqVar = new aq();
        aqVar.f62600a = userInfoBean.f62203e;
        aqVar.f62604e = userInfoBean.f62208j;
        aqVar.f62603d = userInfoBean.f62201c;
        aqVar.f62602c = userInfoBean.f62202d;
        aqVar.f62606g = userInfoBean.f62213o == 1;
        int i4 = userInfoBean.f62200b;
        if (i4 == 1) {
            aqVar.f62601b = (byte) 1;
        } else if (i4 == 2) {
            aqVar.f62601b = (byte) 4;
        } else if (i4 == 3) {
            aqVar.f62601b = (byte) 2;
        } else if (i4 == 4) {
            aqVar.f62601b = (byte) 3;
        } else if (i4 < 10 || i4 >= 20) {
            x.e("unknown uinfo type %d ", Integer.valueOf(i4));
            return null;
        } else {
            aqVar.f62601b = (byte) i4;
        }
        HashMap hashMap = new HashMap();
        aqVar.f62605f = hashMap;
        if (userInfoBean.f62214p >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(userInfoBean.f62214p);
            hashMap.put("C01", sb.toString());
        }
        if (userInfoBean.f62215q >= 0) {
            Map<String, String> map = aqVar.f62605f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userInfoBean.f62215q);
            map.put("C02", sb2.toString());
        }
        Map<String, String> map2 = userInfoBean.f62216r;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f62216r.entrySet()) {
                Map<String, String> map3 = aqVar.f62605f;
                map3.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map4 = userInfoBean.f62217s;
        if (map4 != null && map4.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f62217s.entrySet()) {
                Map<String, String> map5 = aqVar.f62605f;
                map5.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map6 = aqVar.f62605f;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(!userInfoBean.f62210l);
        map6.put("A36", sb3.toString());
        Map<String, String> map7 = aqVar.f62605f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(userInfoBean.f62205g);
        map7.put("F02", sb4.toString());
        Map<String, String> map8 = aqVar.f62605f;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(userInfoBean.f62206h);
        map8.put("F03", sb5.toString());
        Map<String, String> map9 = aqVar.f62605f;
        map9.put("F04", userInfoBean.f62208j);
        Map<String, String> map10 = aqVar.f62605f;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(userInfoBean.f62207i);
        map10.put("F05", sb6.toString());
        Map<String, String> map11 = aqVar.f62605f;
        map11.put("F06", userInfoBean.f62211m);
        Map<String, String> map12 = aqVar.f62605f;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(userInfoBean.f62209k);
        map12.put("F10", sb7.toString());
        x.c("summary type %d vm:%d", Byte.valueOf(aqVar.f62601b), Integer.valueOf(aqVar.f62605f.size()));
        return aqVar;
    }

    public static String a(ArrayList<String> arrayList) {
        int i4;
        int i5;
        int i6;
        StringBuffer stringBuffer = new StringBuffer();
        int i7 = 0;
        while (true) {
            String str = "map";
            if (i7 < arrayList.size()) {
                String str2 = arrayList.get(i7);
                if (str2.equals("java.lang.Integer") || str2.equals(MethodReflectParams.INT)) {
                    str = "int32";
                } else if (str2.equals("java.lang.Boolean") || str2.equals("boolean")) {
                    str = "bool";
                } else if (str2.equals("java.lang.Byte") || str2.equals(MethodReflectParams.BYTE)) {
                    str = MethodReflectParams.CHAR;
                } else if (str2.equals("java.lang.Double") || str2.equals(MethodReflectParams.DOUBLE)) {
                    str = MethodReflectParams.DOUBLE;
                } else if (str2.equals("java.lang.Float") || str2.equals("float")) {
                    str = "float";
                } else if (str2.equals("java.lang.Long") || str2.equals(MethodReflectParams.LONG)) {
                    str = "int64";
                } else if (str2.equals("java.lang.Short") || str2.equals(MethodReflectParams.SHORT)) {
                    str = MethodReflectParams.SHORT;
                } else if (str2.equals("java.lang.Character")) {
                    throw new IllegalArgumentException("can not support java.lang.Character");
                } else {
                    if (str2.equals("java.lang.String")) {
                        str = TypedValues.Custom.S_STRING;
                    } else if (str2.equals("java.util.List")) {
                        str = "list";
                    } else if (!str2.equals("java.util.Map")) {
                        str = str2;
                    }
                }
                arrayList.set(i7, str);
                i7++;
            } else {
                Collections.reverse(arrayList);
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    String str3 = arrayList.get(i8);
                    if (str3.equals("list")) {
                        arrayList.set(i8 - 1, SimpleComparison.LESS_THAN_OPERATION + arrayList.get(i6));
                        arrayList.set(0, arrayList.get(0) + SimpleComparison.GREATER_THAN_OPERATION);
                    } else if (str3.equals("map")) {
                        arrayList.set(i8 - 1, SimpleComparison.LESS_THAN_OPERATION + arrayList.get(i5) + ",");
                        arrayList.set(0, arrayList.get(0) + SimpleComparison.GREATER_THAN_OPERATION);
                    } else if (str3.equals("Array")) {
                        arrayList.set(i8 - 1, SimpleComparison.LESS_THAN_OPERATION + arrayList.get(i4));
                        arrayList.set(0, arrayList.get(0) + SimpleComparison.GREATER_THAN_OPERATION);
                    }
                }
                Collections.reverse(arrayList);
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    stringBuffer.append(it2.next());
                }
                return stringBuffer.toString();
            }
        }
    }

    public <T> void a(String str, T t4) {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t4 != null) {
            if (!(t4 instanceof Set)) {
                j jVar = new j();
                jVar.a(this.f62492b);
                jVar.a(t4, 0);
                byte[] a5 = l.a(jVar.a());
                HashMap<String, byte[]> hashMap = new HashMap<>(1);
                ArrayList<String> arrayList = new ArrayList<>(1);
                a(arrayList, t4);
                hashMap.put(a(arrayList), a5);
                this.f62494d.remove(str);
                this.f62491a.put(str, hashMap);
                return;
            }
            throw new IllegalArgumentException("can not support Set");
        }
        throw new IllegalArgumentException("put value can not is null");
    }

    public static ar a(List<UserInfoBean> list, int i4) {
        com.tencent.bugly.crashreport.common.info.a b5;
        if (list == null || list.size() == 0 || (b5 = com.tencent.bugly.crashreport.common.info.a.b()) == null) {
            return null;
        }
        b5.p();
        ar arVar = new ar();
        arVar.f62611b = b5.f62253d;
        arVar.f62612c = b5.h();
        ArrayList<aq> arrayList = new ArrayList<>();
        for (UserInfoBean userInfoBean : list) {
            aq a5 = a(userInfoBean);
            if (a5 != null) {
                arrayList.add(a5);
            }
        }
        arVar.f62613d = arrayList;
        HashMap hashMap = new HashMap();
        arVar.f62614e = hashMap;
        hashMap.put("A7", b5.f62256g);
        Map<String, String> map = arVar.f62614e;
        map.put("A6", b5.o());
        Map<String, String> map2 = arVar.f62614e;
        map2.put("A5", b5.n());
        Map<String, String> map3 = arVar.f62614e;
        StringBuilder sb = new StringBuilder();
        sb.append(b5.l());
        map3.put("A2", sb.toString());
        Map<String, String> map4 = arVar.f62614e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b5.l());
        map4.put("A1", sb2.toString());
        Map<String, String> map5 = arVar.f62614e;
        map5.put("A24", b5.f62257h);
        Map<String, String> map6 = arVar.f62614e;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b5.m());
        map6.put("A17", sb3.toString());
        Map<String, String> map7 = arVar.f62614e;
        map7.put("A15", b5.r());
        Map<String, String> map8 = arVar.f62614e;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(b5.s());
        map8.put("A13", sb4.toString());
        Map<String, String> map9 = arVar.f62614e;
        map9.put("F08", b5.f62271v);
        Map<String, String> map10 = arVar.f62614e;
        map10.put("F09", b5.f62272w);
        Map<String, String> z4 = b5.z();
        if (z4 != null && z4.size() > 0) {
            for (Map.Entry<String, String> entry : z4.entrySet()) {
                Map<String, String> map11 = arVar.f62614e;
                map11.put("C04_" + entry.getKey(), entry.getValue());
            }
        }
        if (i4 == 1) {
            arVar.f62610a = (byte) 1;
        } else if (i4 != 2) {
            x.e("unknown up type %d ", Integer.valueOf(i4));
            return null;
        } else {
            arVar.f62610a = (byte) 2;
        }
        return arVar;
    }

    public static <T extends k> T a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T newInstance = cls.newInstance();
                i iVar = new i(bArr);
                iVar.a("utf-8");
                newInstance.a(iVar);
                return newInstance;
            } catch (Throwable th) {
                if (!x.b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static am a(Context context, int i4, byte[] bArr) {
        String str;
        com.tencent.bugly.crashreport.common.info.a b5 = com.tencent.bugly.crashreport.common.info.a.b();
        StrategyBean c5 = com.tencent.bugly.crashreport.common.strategy.a.a().c();
        if (b5 != null && c5 != null) {
            try {
                am amVar = new am();
                synchronized (b5) {
                    amVar.f62548a = 1;
                    amVar.f62549b = b5.f();
                    amVar.f62550c = b5.f62252c;
                    amVar.f62551d = b5.f62259j;
                    amVar.f62552e = b5.f62261l;
                    amVar.f62553f = b5.f62255f;
                    amVar.f62554g = i4;
                    if (bArr == null) {
                        bArr = "".getBytes();
                    }
                    amVar.f62555h = bArr;
                    amVar.f62556i = b5.i();
                    amVar.f62557j = b5.f62257h;
                    amVar.f62558k = new HashMap();
                    amVar.f62559l = b5.e();
                    amVar.f62560m = c5.f62292n;
                    amVar.f62562o = b5.h();
                    amVar.f62563p = com.tencent.bugly.crashreport.common.info.b.b(context);
                    amVar.f62564q = System.currentTimeMillis();
                    amVar.f62565r = b5.j();
                    amVar.f62566s = b5.h();
                    amVar.f62567t = amVar.f62563p;
                    amVar.f62561n = "com.tencent.bugly";
                    Map<String, String> map = amVar.f62558k;
                    map.put("A26", b5.t());
                    Map<String, String> map2 = amVar.f62558k;
                    StringBuilder sb = new StringBuilder();
                    sb.append(b5.E());
                    map2.put("A62", sb.toString());
                    Map<String, String> map3 = amVar.f62558k;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b5.F());
                    map3.put("A63", sb2.toString());
                    Map<String, String> map4 = amVar.f62558k;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(b5.A);
                    map4.put("F11", sb3.toString());
                    Map<String, String> map5 = amVar.f62558k;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(b5.f62275z);
                    map5.put("F12", sb4.toString());
                    Map<String, String> map6 = amVar.f62558k;
                    map6.put("D3", b5.f62260k);
                    List<com.tencent.bugly.a> list = com.tencent.bugly.b.f62192b;
                    if (list != null) {
                        for (com.tencent.bugly.a aVar : list) {
                            String str2 = aVar.versionKey;
                            if (str2 != null && (str = aVar.version) != null) {
                                amVar.f62558k.put(str2, str);
                            }
                        }
                    }
                    amVar.f62558k.put("G15", z.c("G15", ""));
                    amVar.f62558k.put("G10", z.c("G10", ""));
                    amVar.f62558k.put("D4", z.c("D4", "0"));
                }
                Map<String, String> y2 = b5.y();
                if (y2 != null) {
                    for (Map.Entry<String, String> entry : y2.entrySet()) {
                        amVar.f62558k.put(entry.getKey(), entry.getValue());
                    }
                }
                return amVar;
            } catch (Throwable th) {
                if (!x.b(th)) {
                    th.printStackTrace();
                }
                return null;
            }
        }
        x.e("Can not create request pkg for parameters is invalid.", new Object[0]);
        return null;
    }

    private void a(ArrayList<String> arrayList, Object obj) {
        if (obj.getClass().isArray()) {
            if (obj.getClass().getComponentType().toString().equals(MethodReflectParams.BYTE)) {
                if (Array.getLength(obj) > 0) {
                    arrayList.add("java.util.List");
                    a(arrayList, Array.get(obj, 0));
                    return;
                }
                arrayList.add("Array");
                arrayList.add("?");
                return;
            }
            throw new IllegalArgumentException("only byte[] is supported");
        } else if (!(obj instanceof Array)) {
            if (obj instanceof List) {
                arrayList.add("java.util.List");
                List list = (List) obj;
                if (list.size() > 0) {
                    a(arrayList, list.get(0));
                } else {
                    arrayList.add("?");
                }
            } else if (obj instanceof Map) {
                arrayList.add("java.util.Map");
                Map map = (Map) obj;
                if (map.size() > 0) {
                    Object next = map.keySet().iterator().next();
                    Object obj2 = map.get(next);
                    arrayList.add(next.getClass().getName());
                    a(arrayList, obj2);
                    return;
                }
                arrayList.add("?");
                arrayList.add("?");
            } else {
                arrayList.add(obj.getClass().getName());
            }
        } else {
            throw new IllegalArgumentException("can not support Array, please use List");
        }
    }

    public byte[] a() {
        j jVar = new j(0);
        jVar.a(this.f62492b);
        jVar.a((Map) this.f62491a, 0);
        return l.a(jVar.a());
    }

    public static byte[] a(Object obj) {
        try {
            d dVar = new d();
            dVar.c();
            dVar.a("utf-8");
            dVar.a(1);
            dVar.b("RqdServer");
            dVar.c(com.mp4parser.iso14496.part15.g.f57197c);
            dVar.a("detail", (String) obj);
            return dVar.a();
        } catch (Throwable th) {
            if (x.b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public void a(byte[] bArr) {
        this.f62493c.a(bArr);
        this.f62493c.a(this.f62492b);
        HashMap hashMap = new HashMap(1);
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("", new byte[0]);
        hashMap.put("", hashMap2);
        this.f62491a = this.f62493c.a((Map) hashMap, 0, false);
    }

    public static byte[] a(k kVar) {
        try {
            j jVar = new j();
            jVar.a("utf-8");
            kVar.a(jVar);
            return jVar.b();
        } catch (Throwable th) {
            if (x.b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
