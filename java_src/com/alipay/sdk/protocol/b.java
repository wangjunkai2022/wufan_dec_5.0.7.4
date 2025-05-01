package com.alipay.sdk.protocol;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f4922a;

    /* renamed from: b  reason: collision with root package name */
    private String f4923b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f4924c;

    private b(String str) {
        this.f4923b = str;
    }

    private String a() {
        return this.f4923b;
    }

    public static List<b> b(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        String optString = jSONObject.optString("name", "");
        String[] split = TextUtils.isEmpty(optString) ? null : optString.split(";");
        for (int i4 = 0; i4 < split.length; i4++) {
            a a5 = a.a(split[i4]);
            if (a5 != a.None) {
                b bVar = new b(split[i4], a5);
                bVar.f4924c = d(split[i4]);
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private static void c(b bVar) {
        String[] strArr = bVar.f4924c;
        if (strArr.length == 3 && TextUtils.equals(com.alipay.sdk.cons.b.f4830c, strArr[0])) {
            Context context = m.b.b().f71504a;
            n.b a5 = n.b.a();
            if (TextUtils.isEmpty(strArr[1]) || TextUtils.isEmpty(strArr[2])) {
                return;
            }
            a5.f71677a = strArr[1];
            a5.f71678b = strArr[2];
            n.a aVar = new n.a(context);
            try {
                aVar.j(com.alipay.sdk.util.b.a(context).b(), com.alipay.sdk.util.b.a(context).e(), a5.f71677a, a5.f71678b);
            } catch (Exception unused) {
            } finally {
                aVar.close();
            }
        }
    }

    private static String[] d(String str) {
        ArrayList arrayList = new ArrayList();
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == -1 || lastIndexOf == -1 || lastIndexOf <= indexOf) {
            return null;
        }
        String[] split = str.substring(indexOf + 1, lastIndexOf).split(",");
        if (split != null) {
            for (int i4 = 0; i4 < split.length; i4++) {
                if (!TextUtils.isEmpty(split[i4])) {
                    arrayList.add(split[i4].trim().replaceAll("'", "").replaceAll(m.a.f71493g, ""));
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private a e() {
        return this.f4922a;
    }

    private static String[] f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(";");
    }

    private String[] g() {
        return this.f4924c;
    }

    private b(String str, a aVar) {
        this.f4923b = str;
        this.f4922a = aVar;
    }
}
