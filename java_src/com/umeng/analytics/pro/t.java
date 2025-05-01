package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: DefconProcesser.java */
/* loaded from: classes6.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final int f63927a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static final int f63928b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final int f63929c = 2;

    /* renamed from: d  reason: collision with root package name */
    private static final int f63930d = 3;

    /* renamed from: e  reason: collision with root package name */
    private final long f63931e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefconProcesser.java */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final t f63932a = new t();

        private a() {
        }
    }

    public static t a() {
        return a.f63932a;
    }

    private JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", aa.a().d(UMGlobalContext.getAppContext(null)));
            jSONObject.put(f.f63703p, currentTimeMillis);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    public void b(JSONObject jSONObject, Context context) {
        int a5 = a(context);
        if (a5 == 1) {
            if (jSONObject.has(f.L)) {
                jSONObject.remove(f.L);
            }
            if (jSONObject.has(f.f63701n)) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(f.f63701n);
                    int length = jSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        if (jSONObject2.has(f.aA)) {
                            jSONObject2.remove(f.aA);
                        }
                        if (jSONObject2.has(f.aB)) {
                            jSONObject2.remove(f.aB);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            k.a(context).a(false, true);
        } else if (a5 == 2) {
            if (jSONObject.has(f.L)) {
                jSONObject.remove(f.L);
            }
            if (jSONObject.has(f.f63701n)) {
                jSONObject.remove(f.f63701n);
            }
            try {
                jSONObject.put(f.f63701n, c());
            } catch (Exception unused2) {
            }
            k.a(context).a(false, true);
        } else if (a5 == 3) {
            if (jSONObject.has(f.L)) {
                jSONObject.remove(f.L);
            }
            jSONObject.remove(f.f63701n);
            k.a(context).a(false, true);
        }
    }

    private t() {
        this.f63931e = 60000L;
    }

    public int a(Context context) {
        return Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", String.valueOf(0))).intValue();
    }

    private void a(JSONObject jSONObject, boolean z4) {
        if (!z4 && jSONObject.has(f.f63701n)) {
            jSONObject.remove(f.f63701n);
        }
        if (jSONObject.has(f.L)) {
            jSONObject.remove(f.L);
        }
        if (jSONObject.has("error")) {
            jSONObject.remove("error");
        }
        if (jSONObject.has("ekv")) {
            jSONObject.remove("ekv");
        }
        if (jSONObject.has(f.Z)) {
            jSONObject.remove(f.Z);
        }
        if (jSONObject.has(f.L)) {
            jSONObject.remove(f.L);
        }
        if (jSONObject.has("userlevel")) {
            jSONObject.remove("userlevel");
        }
    }

    public void a(JSONObject jSONObject, Context context) {
        int a5 = a(context);
        if (a5 == 1) {
            a(jSONObject, true);
            k.a(context).b(false, true);
        } else if (a5 == 2) {
            jSONObject.remove(f.f63701n);
            try {
                jSONObject.put(f.f63701n, b());
            } catch (Exception unused) {
            }
            a(jSONObject, true);
            k.a(context).b(false, true);
        } else if (a5 == 3) {
            a(jSONObject, false);
            k.a(context).b(false, true);
        }
    }

    private JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", aa.a().a(UMGlobalContext.getAppContext(null)));
            jSONObject.put(f.f63703p, currentTimeMillis);
            jSONObject.put(f.f63704q, currentTimeMillis + 60000);
            jSONObject.put("duration", 60000L);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}
