package com.kuaishou.weapon.p0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.kuaishou.weapon.p0.jni.A;
import org.json.JSONArray;
/* loaded from: classes5.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private Context f55748a;

    /* renamed from: b  reason: collision with root package name */
    private int f55749b;

    /* renamed from: c  reason: collision with root package name */
    private h f55750c;

    public w(Context context) {
        this.f55749b = 0;
        this.f55748a = context;
        h a5 = h.a(context, "re_po_rt");
        this.f55750c = a5;
        if (a5 != null) {
            this.f55749b = a5.b(df.f55545r, 0);
        }
    }

    public JSONArray a(int i4) {
        try {
            new A(this.f55748a, i4);
            JSONArray jsonObject = A.getJsonObject();
            JSONArray jSONArray = new JSONArray();
            if (jsonObject != null) {
                for (int i5 = 0; i5 < jsonObject.length(); i5++) {
                    jSONArray.put(jsonObject.get(i5));
                }
                A.setJsonObject(null);
                return jSONArray;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public JSONArray b(int i4) {
        try {
            return c(i4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public JSONArray c(int i4) {
        return d(i4);
    }

    public JSONArray d(int i4) {
        JSONArray jSONArray = new JSONArray();
        try {
            PackageManager packageManager = this.f55748a.getPackageManager();
            for (int i5 = 1000; i5 <= 19999; i5++) {
                String[] strArr = null;
                try {
                    strArr = packageManager.getPackagesForUid(i5);
                } catch (Exception unused) {
                }
                if (strArr != null) {
                    for (String str : strArr) {
                        try {
                            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                            if (i4 != 1 || (packageInfo.applicationInfo.flags & 1) != 1) {
                                v vVar = new v(packageInfo, this.f55748a);
                                vVar.h();
                                jSONArray.put(vVar.k());
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        } catch (Exception unused3) {
        }
        return jSONArray;
    }
}
