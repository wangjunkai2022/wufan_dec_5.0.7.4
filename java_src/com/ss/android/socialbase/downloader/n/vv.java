package com.ss.android.socialbase.downloader.n;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.wv.qv;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv {

    /* renamed from: i  reason: collision with root package name */
    private static JSONObject f61230i;

    /* renamed from: n  reason: collision with root package name */
    private static vv f61232n;

    /* renamed from: o  reason: collision with root package name */
    private static Boolean f61233o;

    /* renamed from: p  reason: collision with root package name */
    private static JSONObject f61234p;

    /* renamed from: u  reason: collision with root package name */
    private static boolean f61235u;

    /* renamed from: b  reason: collision with root package name */
    private int f61236b;

    /* renamed from: k  reason: collision with root package name */
    private final Boolean f61237k;
    private final JSONObject qv;
    private final JSONObject wv;
    private static final qv<Integer, vv> vv = new qv<>(16, 16);

    /* renamed from: m  reason: collision with root package name */
    private static final vv f61231m = new vv(null);

    static {
        vv();
    }

    private vv(JSONObject jSONObject) {
        Boolean bool;
        this.qv = jSONObject;
        JSONObject jSONObject2 = null;
        r0 = null;
        r0 = null;
        Boolean bool2 = null;
        if (jSONObject == null || u("bugfix")) {
            bool = null;
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("bugfix");
            if (optJSONObject != null && optJSONObject.has("default") && !u("default")) {
                bool2 = Boolean.valueOf(optJSONObject.optInt("default", 0) == 1);
            }
            Boolean bool3 = bool2;
            jSONObject2 = optJSONObject;
            bool = bool3;
        }
        this.wv = jSONObject2;
        this.f61237k = bool;
    }

    @NonNull
    public static JSONObject m() {
        return p.c();
    }

    @NonNull
    public static vv p() {
        return f61231m;
    }

    public static boolean u(String str) {
        JSONObject jSONObject = f61234p;
        return jSONObject != null && jSONObject.optInt(str, 0) == 1;
    }

    public static void vv() {
        JSONObject c5 = p.c();
        f61235u = c5.optInt("disable_task_setting", 0) == 1;
        f61234p = c5.optJSONObject("disabled_task_keys");
        JSONObject optJSONObject = c5.optJSONObject("bugfix");
        Boolean bool = null;
        if (optJSONObject != null && optJSONObject.has("default")) {
            bool = Boolean.valueOf(optJSONObject.optInt("default", 0) == 1);
        }
        f61230i = optJSONObject;
        f61233o = bool;
    }

    public JSONObject i(String str) {
        JSONObject jSONObject = this.qv;
        if (jSONObject != null && jSONObject.has(str) && !u(str)) {
            return this.qv.optJSONObject(str);
        }
        return m().optJSONObject(str);
    }

    public JSONArray o(String str) {
        JSONObject jSONObject = this.qv;
        if (jSONObject != null && jSONObject.has(str) && !u(str)) {
            return this.qv.optJSONArray(str);
        }
        return m().optJSONArray(str);
    }

    public boolean m(String str, boolean z4) {
        if (this.wv != null && !u(str)) {
            if (this.wv.has(str)) {
                return this.wv.optInt(str, z4 ? 1 : 0) == 1;
            }
            Boolean bool = this.f61237k;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        JSONObject jSONObject = f61230i;
        if (jSONObject != null) {
            if (jSONObject.has(str)) {
                return f61230i.optInt(str, z4 ? 1 : 0) == 1;
            }
            Boolean bool2 = f61233o;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
        }
        return z4;
    }

    public String p(String str) {
        return vv(str, "");
    }

    private static vv p(int i4) {
        DownloadInfo downloadInfo;
        if (f61235u) {
            return f61231m;
        }
        Context ky = p.ky();
        if (ky != null && (downloadInfo = Downloader.getInstance(ky).getDownloadInfo(i4)) != null) {
            return m(downloadInfo);
        }
        return f61231m;
    }

    public static void vv(String str, boolean z4) {
        try {
            if (f61230i == null) {
                f61230i = new JSONObject();
            }
            f61230i.put(str, z4 ? 1 : 0);
        } catch (JSONException unused) {
        }
    }

    @NonNull
    public static vv vv(int i4) {
        return vv(i4, (DownloadInfo) null);
    }

    public int m(String str) {
        return vv(str, 0);
    }

    public static void m(int i4) {
        vv vvVar = f61232n;
        if (vvVar != null && vvVar.f61236b == i4) {
            f61232n = null;
        }
        qv<Integer, vv> qvVar = vv;
        synchronized (qvVar) {
            qvVar.remove(Integer.valueOf(i4));
        }
    }

    @NonNull
    public static vv vv(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return f61231m;
        }
        return vv(downloadInfo.getId(), downloadInfo);
    }

    private static vv vv(int i4, DownloadInfo downloadInfo) {
        vv vvVar;
        vv vvVar2 = f61232n;
        if (vvVar2 == null || vvVar2.f61236b != i4) {
            qv<Integer, vv> qvVar = vv;
            synchronized (qvVar) {
                vvVar = qvVar.get(Integer.valueOf(i4));
            }
            if (vvVar == null) {
                vvVar = downloadInfo == null ? p(i4) : m(downloadInfo);
                synchronized (qvVar) {
                    qvVar.put(Integer.valueOf(i4), vvVar);
                }
            }
            vvVar.f61236b = i4;
            f61232n = vvVar;
            return vvVar;
        }
        return vvVar2;
    }

    private static vv m(DownloadInfo downloadInfo) {
        if (f61235u) {
            return f61231m;
        }
        try {
            String downloadSettingString = downloadInfo.getDownloadSettingString();
            if (!TextUtils.isEmpty(downloadSettingString)) {
                return new vv(new JSONObject(downloadSettingString));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return f61231m;
    }

    public boolean vv(String str) {
        return m(str, false);
    }

    public int vv(String str, int i4) {
        JSONObject jSONObject = this.qv;
        if (jSONObject != null && jSONObject.has(str) && !u(str)) {
            return this.qv.optInt(str, i4);
        }
        return m().optInt(str, i4);
    }

    public long vv(String str, long j4) {
        JSONObject jSONObject = this.qv;
        if (jSONObject != null && jSONObject.has(str) && !u(str)) {
            return this.qv.optLong(str, j4);
        }
        return m().optLong(str, j4);
    }

    public double vv(String str, double d5) {
        JSONObject jSONObject = this.qv;
        if (jSONObject != null && jSONObject.has(str) && !u(str)) {
            return this.qv.optDouble(str, d5);
        }
        return m().optDouble(str, d5);
    }

    public String vv(String str, String str2) {
        JSONObject jSONObject = this.qv;
        if (jSONObject != null && jSONObject.has(str) && !u(str)) {
            return this.qv.optString(str, str2);
        }
        return m().optString(str, str2);
    }

    @NonNull
    public static vv vv(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject != m() && !f61235u) {
            vv vvVar = f61232n;
            if (vvVar == null || vvVar.qv != jSONObject) {
                qv<Integer, vv> qvVar = vv;
                synchronized (qvVar) {
                    for (vv vvVar2 : qvVar.values()) {
                        if (vvVar2.qv == jSONObject) {
                            f61232n = vvVar2;
                            return vvVar2;
                        }
                    }
                    vv vvVar3 = new vv(jSONObject);
                    f61232n = vvVar3;
                    return vvVar3;
                }
            }
            return vvVar;
        }
        return f61231m;
    }

    public static void vv(int i4, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject == m() || f61235u) {
            return;
        }
        qv<Integer, vv> qvVar = vv;
        synchronized (qvVar) {
            vv vvVar = f61232n;
            if (vvVar != null && vvVar.qv == jSONObject) {
                vvVar.f61236b = i4;
            } else {
                vvVar = null;
                Iterator<vv> it2 = qvVar.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    vv next = it2.next();
                    if (next.qv == jSONObject) {
                        next.f61236b = i4;
                        vvVar = next;
                        break;
                    }
                }
                if (vvVar == null) {
                    vvVar = new vv(jSONObject);
                    vvVar.f61236b = i4;
                }
                f61232n = vvVar;
            }
            vv.put(Integer.valueOf(i4), vvVar);
        }
    }
}
