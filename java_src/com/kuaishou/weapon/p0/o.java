package com.kuaishou.weapon.p0;

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.join.mgps.Util.h0;
import com.kuaishou.weapon.p0.p;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class o {
    public static s a(JSONObject jSONObject) {
        p b5 = b(jSONObject);
        if (b5 == null) {
            return null;
        }
        int a5 = b5.a();
        String l4 = b5.l();
        String j4 = b5.j();
        boolean z4 = b5.d() == 1;
        boolean z5 = b5.h() == 1;
        int e5 = b5.e();
        String c5 = b5.c();
        String f5 = b5.f();
        String b6 = b5.b();
        PackageInfo packageInfo = new PackageInfo();
        try {
            packageInfo.packageName = f5;
            packageInfo.versionName = l4;
            ApplicationInfo applicationInfo = new ApplicationInfo();
            if (!TextUtils.isEmpty(f5) && !TextUtils.isEmpty(b6) && b6.startsWith(h0.f27805a)) {
                applicationInfo.name = f5 + b6;
                applicationInfo.className = f5 + b6;
            }
            applicationInfo.theme = b5.i();
            packageInfo.applicationInfo = applicationInfo;
            List<p.a> m4 = b5.m();
            if (m4 != null && m4.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < m4.size(); i4++) {
                    ActivityInfo activityInfo = new ActivityInfo();
                    activityInfo.name = m4.get(i4).c();
                    activityInfo.theme = m4.get(i4).b();
                    activityInfo.labelRes = m4.get(i4).a();
                    if (!TextUtils.isEmpty(activityInfo.name)) {
                        arrayList.add(activityInfo);
                    }
                }
                if (arrayList.size() > 0) {
                    packageInfo.activities = (ActivityInfo[]) arrayList.toArray(new ActivityInfo[arrayList.size()]);
                }
            }
        } catch (Throwable unused) {
        }
        s sVar = new s(packageInfo, a5, f5, l4, j4, c5);
        sVar.f55678v = z4;
        sVar.f55680x = e5;
        int a6 = b5.k() == null ? 0 : b5.k().a();
        int b7 = b5.k() == null ? -1 : b5.k().b();
        sVar.f55676t = a6;
        sVar.f55677u = b7;
        sVar.f55675s = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT > 29 && z5) {
            z5 = b5.g() == 1;
        }
        sVar.f55681y = z5;
        return sVar;
    }

    private static p b(JSONObject jSONObject) {
        try {
            p pVar = new p();
            pVar.a(jSONObject.optInt("wk"));
            pVar.a(jSONObject.optString("wan"));
            pVar.b(jSONObject.optString("wm"));
            pVar.b(jSONObject.optInt("wo"));
            pVar.c(jSONObject.optInt("wpr"));
            pVar.c(jSONObject.optString(bi.f55324q));
            pVar.e(jSONObject.optInt("ws", 1));
            pVar.d(jSONObject.optInt("wh", 0));
            pVar.f(jSONObject.optInt("wt"));
            pVar.d(jSONObject.optString("wu"));
            pVar.e(jSONObject.optString("wv"));
            JSONArray jSONArray = jSONObject.getJSONArray("wa");
            ArrayList arrayList = null;
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                p.a aVar = new p.a();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                aVar.a(jSONObject2.optInt("r"));
                aVar.b(jSONObject2.optInt(com.umeng.analytics.pro.bm.aM));
                aVar.a(jSONObject2.getString(t.f55689h));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar);
            }
            pVar.a(arrayList);
            p.b bVar = new p.b();
            JSONObject jSONObject3 = jSONObject.getJSONObject("we");
            bVar.a(jSONObject3.optInt("duration"));
            bVar.b(jSONObject3.optInt("network"));
            pVar.a(bVar);
            return pVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
