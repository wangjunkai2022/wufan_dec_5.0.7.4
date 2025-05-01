package com.join.mgps.joystick.map;

import android.os.Environment;
import com.join.mgps.Util.u;
import com.join.mgps.Util.v;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.lingala.zip4j.util.e;
/* compiled from: BlackListManager.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    static u f53445e;

    /* renamed from: f  reason: collision with root package name */
    private static a f53446f;

    /* renamed from: a  reason: collision with root package name */
    private String f53447a;

    /* renamed from: b  reason: collision with root package name */
    private final String f53448b = d.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private final String f53449c = "blacklist_config.ini";

    /* renamed from: d  reason: collision with root package name */
    private final String[] f53450d = {"BT_BLACK_LIST"};

    public a() {
        this.f53447a = Environment.getExternalStorageDirectory().getPath() + "/wufan91/config";
        this.f53447a = v.f28104d + "/wufan91/config";
        g();
    }

    private void a() {
        g();
        u uVar = f53445e;
        if (uVar != null) {
            uVar.i(this.f53450d[0]);
            j();
        }
    }

    public static a b() {
        if (f53446f == null) {
            f53446f = new a();
        }
        return f53446f;
    }

    private Map c(String str) {
        HashMap hashMap = new HashMap();
        g();
        u.c b5 = f53445e.b(str);
        for (String str2 : b5.d()) {
            hashMap.put(str2, b5.c(str2));
        }
        return hashMap;
    }

    private File d() {
        return new File(this.f53447a + e.F0 + "blacklist_config.ini");
    }

    private boolean e(String str) {
        return str == null || str.equals("");
    }

    private synchronized void g() {
        File d5 = d();
        if (d5 == null) {
            return;
        }
        String absolutePath = d5.getAbsolutePath();
        try {
            if (!d5.getParentFile().exists()) {
                d5.getParentFile().mkdirs();
            }
            if (d5.exists() && d5.isDirectory()) {
                d5.delete();
            }
            if (!d5.exists()) {
                d5.setReadable(true);
                d5.setWritable(true);
                d5.createNewFile();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (f53445e == null) {
            f53445e = new u(absolutePath);
        }
        f53445e.h();
    }

    private static synchronized void h(int i4, String str, String str2, String str3) {
        synchronized (a.class) {
            u uVar = f53445e;
            uVar.g(str, str2, str3);
            uVar.j();
        }
    }

    private void i() {
        u uVar = f53445e;
        int i4 = 0;
        while (true) {
            String[] strArr = this.f53450d;
            if (i4 >= strArr.length) {
                return;
            }
            String str = strArr[i4];
            if (uVar.b(str) == null) {
                uVar.f(new u.c(str));
            }
            i4++;
        }
    }

    private synchronized void j() {
        try {
            u uVar = f53445e;
            if (uVar != null) {
                uVar.j();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void m(String str, Map<String, String> map) {
        g();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String str2 = map.get(key);
            u uVar = f53445e;
            if (uVar != null) {
                uVar.g(str, str2, key);
            }
        }
        j();
    }

    public boolean f(String str) {
        u.c b5;
        if (e(str)) {
            return false;
        }
        g();
        u uVar = f53445e;
        if (uVar == null || (b5 = uVar.b(this.f53450d[0])) == null) {
            return false;
        }
        for (String str2 : b5.d()) {
            if (!e(str2)) {
                if (str.toLowerCase().contains(b5.c(str2).toLowerCase())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void k(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        g();
        if (f53445e == null) {
            return;
        }
        a();
        for (int i4 = 0; i4 < list.size(); i4++) {
            f53445e.g(this.f53450d[0], list.get(i4), "");
        }
    }

    public void l(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        g();
        if (f53445e == null) {
            return;
        }
        a();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!e(value)) {
                f53445e.g(this.f53450d[0], key, value);
                j();
            }
        }
    }
}
