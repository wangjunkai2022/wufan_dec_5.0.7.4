package com.tencent.stat.a;

import android.content.Context;
import java.util.Map;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class b extends e {

    /* renamed from: a  reason: collision with root package name */
    protected c f62882a;

    /* renamed from: l  reason: collision with root package name */
    private long f62883l;

    public b(Context context, int i4, String str) {
        super(context, i4);
        c cVar = new c();
        this.f62882a = cVar;
        this.f62883l = -1L;
        cVar.f62884a = str;
    }

    @Override // com.tencent.stat.a.e
    public f a() {
        return f.CUSTOM;
    }

    public void a(long j4) {
        this.f62883l = j4;
    }

    public void a(Properties properties) {
        if (properties != null) {
            this.f62882a.f62886c = (Properties) properties.clone();
        }
    }

    public void a(String[] strArr) {
        if (strArr != null) {
            this.f62882a.f62885b = (String[]) strArr.clone();
        }
    }

    @Override // com.tencent.stat.a.e
    public boolean a(JSONObject jSONObject) {
        jSONObject.put("ei", this.f62882a.f62884a);
        long j4 = this.f62883l;
        if (j4 > 0) {
            jSONObject.put(com.umeng.analytics.pro.f.ac, j4);
        }
        c cVar = this.f62882a;
        if (cVar.f62886c == null && cVar.f62885b == null) {
            jSONObject.put("kv", new JSONObject());
        }
        if (this.f62882a.f62885b != null) {
            JSONArray jSONArray = new JSONArray();
            for (String str : this.f62882a.f62885b) {
                jSONArray.put(str);
            }
            jSONObject.put("ar", jSONArray);
        }
        if (this.f62882a.f62886c != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (Map.Entry entry : this.f62882a.f62886c.entrySet()) {
                    jSONObject2.put(entry.getKey().toString(), entry.getValue().toString());
                }
            } catch (Exception unused) {
                jSONObject2 = new JSONObject(this.f62882a.f62886c);
            }
            jSONObject.put("kv", jSONObject2);
            return true;
        }
        return true;
    }
}
