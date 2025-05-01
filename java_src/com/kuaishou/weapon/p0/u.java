package com.kuaishou.weapon.p0;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static final int f55709a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f55710b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f55711c = 4;

    /* renamed from: d  reason: collision with root package name */
    public static final int f55712d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f55713e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final int f55714f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f55715g = 3;

    /* renamed from: h  reason: collision with root package name */
    public static final int f55716h = 4;

    /* renamed from: o  reason: collision with root package name */
    private static long f55717o;

    /* renamed from: j  reason: collision with root package name */
    private Context f55719j;

    /* renamed from: k  reason: collision with root package name */
    private q f55720k;

    /* renamed from: l  reason: collision with root package name */
    private t f55721l;

    /* renamed from: m  reason: collision with root package name */
    private File f55722m;

    /* renamed from: n  reason: collision with root package name */
    private dp f55723n;

    /* renamed from: p  reason: collision with root package name */
    private int f55724p;

    /* renamed from: r  reason: collision with root package name */
    private boolean f55726r;

    /* renamed from: q  reason: collision with root package name */
    private int f55725q = 0;

    /* renamed from: i  reason: collision with root package name */
    List<Integer> f55718i = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private Map<Integer, a> f55727s = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        int f55728a;

        public a(int i4) {
            this.f55728a = i4;
        }
    }

    public u(Context context, int i4, boolean z4) {
        this.f55724p = 0;
        this.f55726r = false;
        this.f55719j = context;
        this.f55720k = q.a(context);
        this.f55721l = t.a(context);
        this.f55723n = dp.a(context);
        this.f55722m = new File(context.getFilesDir(), ".tmp");
        this.f55724p = i4;
        this.f55726r = z4;
    }

    public JSONObject a() {
        try {
            String str = cu.f55469a + cu.f55475g;
            String a5 = cv.a(this.f55719j);
            if (!TextUtils.isEmpty(a5)) {
                str = str + "?" + a5;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject c5 = cv.c(this.f55719j);
            if (c5 != null) {
                jSONObject.put("data", new bn(this.f55719j).c(c5.toString()));
            }
            l a6 = l.a(this.f55719j);
            m mVar = new m(str, jSONObject);
            mVar.a(WeaponHI.cookieData);
            mVar.b(WeaponHI.encryENV);
            JSONObject jSONObject2 = new JSONObject(a6.a(mVar));
            int optInt = jSONObject2.optInt("result", 0);
            if (optInt != 1) {
                if (optInt == -7) {
                    dp.a(this.f55719j).a(dp.f55562a, 1, false);
                    return null;
                }
                return null;
            }
            String a7 = new bn(this.f55719j).a(jSONObject2.getString("antispamPluginManageRsp"));
            if (TextUtils.isEmpty(a7)) {
                if (this.f55725q == 0) {
                    this.f55725q = 8;
                }
                throw new NetworkErrorException("kuaishou risk pluginloader response is null");
            }
            JSONObject jSONObject3 = new JSONObject(a7);
            if (jSONObject3.optInt("status", 0) == 1) {
                return jSONObject3.optJSONObject("plugin");
            }
            dp dpVar = this.f55723n;
            if (dpVar != null) {
                dpVar.a(dp.f55563b, System.currentTimeMillis(), true);
                return null;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator<String> it2;
        JSONObject jSONObject;
        boolean z4;
        try {
            try {
                synchronized (u.class) {
                    int i4 = this.f55724p;
                    if (i4 == 1 || i4 == 2 || i4 == 4 || this.f55726r || System.currentTimeMillis() - f55717o >= q.a.f73127b) {
                        this.f55721l.d();
                        f55717o = System.currentTimeMillis();
                        if ((System.currentTimeMillis() - this.f55723n.a(dp.f55563b)) - (this.f55723n.a(dp.f55564c, 6) * bi.f55326s) > 0) {
                            List<s> a5 = this.f55721l.a();
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList<s> arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            JSONObject a6 = a();
                            if (a6 != null) {
                                boolean z5 = false;
                                try {
                                    boolean b5 = dm.b(this.f55719j);
                                    Iterator<String> keys = a6.keys();
                                    HashSet<String> hashSet = new HashSet();
                                    boolean z6 = false;
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        if (b5 && next.endsWith("64")) {
                                            if (next.length() > 3) {
                                                hashSet.add(next.substring(0, next.length() - 3));
                                                hashSet.add(next.substring(0, next.length() - 3) + ".32");
                                                z6 = true;
                                            } else {
                                                z6 = true;
                                            }
                                        } else if (!b5 && next.endsWith("32")) {
                                            if (next.length() > 3) {
                                                hashSet.add(next.substring(0, next.length() - 3));
                                                hashSet.add(next.substring(0, next.length() - 3) + ".64");
                                                z6 = true;
                                            } else {
                                                z6 = true;
                                            }
                                        } else {
                                            if (b5 && next.endsWith("v8")) {
                                                if (next.length() > 3) {
                                                    hashSet.add(next.substring(0, next.length() - 3));
                                                    hashSet.add(next.substring(0, next.length() - 3) + ".v7");
                                                    z6 = true;
                                                }
                                            } else if (!b5 && next.endsWith("v7")) {
                                                if (next.length() > 3) {
                                                    hashSet.add(next.substring(0, next.length() - 3));
                                                    hashSet.add(next.substring(0, next.length() - 3) + ".v8");
                                                }
                                            }
                                            z6 = true;
                                        }
                                    }
                                    if (z6) {
                                        for (String str : hashSet) {
                                            a6.remove(str);
                                        }
                                    }
                                    z5 = z6;
                                } catch (Throwable unused) {
                                }
                                Iterator<String> keys2 = a6.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    s a7 = o.a(a6.optJSONObject(next2));
                                    if (a7 != null) {
                                        if (z5 && !a7.f55681y && (next2.endsWith("32") || next2.endsWith("64") || next2.endsWith("v7") || next2.endsWith("v8"))) {
                                            a7.f55681y = true;
                                        }
                                        if (a7.f55678v) {
                                            arrayList4.add(next2);
                                        }
                                        if (!a7.f55681y) {
                                            arrayList3.add(a7);
                                        }
                                        int indexOf = a5.indexOf(a7);
                                        if (indexOf >= 0 && a7.f55681y) {
                                            s sVar = a5.get(indexOf);
                                            if (dn.b(a7.f55660d, sVar.f55660d)) {
                                                int i5 = a7.f55680x;
                                                if (i5 != sVar.f55680x) {
                                                    this.f55721l.c(a7.f55657a, i5);
                                                }
                                                if (!this.f55721l.d(a7.f55657a)) {
                                                    arrayList2.add(a7);
                                                }
                                                it2 = keys2;
                                                jSONObject = a6;
                                                z4 = z5;
                                            } else {
                                                jSONObject = a6;
                                                z4 = z5;
                                                it2 = keys2;
                                                this.f55723n.a(dp.f55563b, System.currentTimeMillis(), true);
                                                int i6 = a7.f55680x;
                                                if (i6 != sVar.f55680x) {
                                                    this.f55721l.c(a7.f55657a, i6);
                                                }
                                                arrayList.add(a7);
                                            }
                                            a5.remove(indexOf);
                                        } else {
                                            it2 = keys2;
                                            jSONObject = a6;
                                            z4 = z5;
                                            if (a7.f55681y) {
                                                arrayList2.add(a7);
                                            }
                                        }
                                        a6 = jSONObject;
                                        z5 = z4;
                                        keys2 = it2;
                                    }
                                }
                                for (s sVar2 : a5) {
                                    if (!arrayList4.contains(sVar2.f55659c)) {
                                        List<Integer> list = this.f55718i;
                                        if (list != null) {
                                            list.add(Integer.valueOf(sVar2.f55657a));
                                        }
                                        this.f55720k.a(sVar2.f55659c);
                                    }
                                }
                                for (s sVar3 : arrayList3) {
                                    if (!arrayList4.contains(sVar3.f55659c)) {
                                        List<Integer> list2 = this.f55718i;
                                        if (list2 != null) {
                                            list2.add(Integer.valueOf(sVar3.f55657a));
                                        }
                                        this.f55720k.a(sVar3.f55659c);
                                    }
                                }
                                ArrayList<s> arrayList5 = new ArrayList();
                                if (arrayList2.size() != 0) {
                                    arrayList5.addAll(arrayList2);
                                }
                                if (arrayList.size() != 0) {
                                    arrayList5.addAll(arrayList);
                                }
                                for (s sVar4 : arrayList5) {
                                    if (sVar4 != null) {
                                        if (arrayList.contains(sVar4)) {
                                            this.f55720k.a(sVar4.f55657a, sVar4.f55660d, (PackageInfo) null);
                                        } else if (arrayList2.contains(sVar4)) {
                                            a(sVar4);
                                        }
                                    }
                                }
                            } else {
                                throw new Exception("pluginJsonObject is null ");
                            }
                        } else {
                            this.f55720k.c();
                            this.f55721l.b();
                        }
                    }
                }
            } finally {
                WeaponHI.iD();
            }
        } catch (Throwable unused2) {
            this.f55720k.c();
            this.f55721l.b();
        }
    }

    private void a(s sVar) {
        try {
            if (!TextUtils.isEmpty(sVar.f55666j) && sVar.f55666j.length() >= 10) {
                if (!this.f55722m.exists()) {
                    this.f55722m.mkdir();
                }
                File file = this.f55722m;
                File file2 = new File(file, sVar.f55657a + "-" + sVar.f55660d + ".tmp");
                File file3 = this.f55722m;
                File file4 = new File(file3, sVar.f55657a + "-" + sVar.f55660d + ".zip");
                boolean a5 = l.a(this.f55719j).a(sVar.f55665i, file2);
                if (!a5) {
                    a5 = l.a(this.f55719j).a(sVar.f55665i, file2);
                }
                if (a5) {
                    if (file4.exists()) {
                        file4.delete();
                    }
                    int c5 = b.c(file2.getAbsolutePath(), file4.getAbsolutePath(), c.a("a3NyaXNrY3RsYnVzaW5zc3Z4cHprd3NwYWlvcXBrc3M=".getBytes("utf-8"), 2));
                    if (c5 != 0) {
                        if (file4.exists()) {
                            file4.delete();
                        }
                        a5 = false;
                    }
                    if (c5 == 0 && file2.exists()) {
                        file2.delete();
                    }
                } else {
                    this.f55727s.put(Integer.valueOf(sVar.f55657a), new a(3));
                }
                String a6 = f.a(file4);
                if (a5 && sVar.f55666j.equals(a6)) {
                    dn.a(file4.getAbsolutePath(), Boolean.TRUE);
                    sVar.f55661e = file4.getAbsolutePath();
                    if (this.f55720k.a(sVar, (String) null, (String) null)) {
                        Map<Integer, a> map = this.f55727s;
                        if (map != null && !map.containsKey(Integer.valueOf(sVar.f55657a))) {
                            this.f55727s.put(Integer.valueOf(sVar.f55657a), new a(1));
                        }
                        this.f55723n.a(dp.f55563b, System.currentTimeMillis(), true);
                        return;
                    }
                    Map<Integer, a> map2 = this.f55727s;
                    if (map2 != null && !map2.containsKey(Integer.valueOf(sVar.f55657a))) {
                        this.f55727s.put(Integer.valueOf(sVar.f55657a), new a(4));
                    }
                    this.f55720k.a(sVar.f55657a, sVar.f55660d, (PackageInfo) null);
                    return;
                }
                if (file2.exists()) {
                    file2.length();
                    file2.delete();
                }
                this.f55720k.a(sVar.f55657a, sVar.f55660d, (PackageInfo) null);
                return;
            }
            this.f55720k.a(sVar.f55657a, sVar.f55660d, (PackageInfo) null);
        } catch (Throwable unused) {
            this.f55720k.a(sVar.f55657a, sVar.f55660d, (PackageInfo) null);
        }
    }
}
