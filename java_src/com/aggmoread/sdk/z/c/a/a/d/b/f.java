package com.aggmoread.sdk.z.c.a.a.d.b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private String f3353a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f3354b = new ArrayList();

    private f(String str) {
        this.f3353a = str;
    }

    private String a() {
        if (this.f3354b.size() == 1) {
            return this.f3354b.get(0);
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : this.f3354b) {
            try {
                jSONArray.put(str);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public static f b(String str) {
        return new f(str);
    }

    public void a(k kVar) {
        if (kVar != null) {
            a(com.aggmoread.sdk.z.c.a.a.b.c(kVar.f3432a.f3494a));
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3354b.add(str);
    }

    public void b() {
        this.f3354b.clear();
    }

    public void c() {
        if (this.f3354b.size() > 0) {
            boolean z4 = this.f3354b.size() > 1;
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMHTTAG", this.f3353a + ", batchReport " + z4);
            new k().a(a(), z4);
        }
    }
}
