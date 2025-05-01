package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: EventTracker.java */
/* loaded from: classes6.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private static final String f63933a = "fs_lc_tl_uapp";

    /* renamed from: f  reason: collision with root package name */
    private static final String f63934f = "-1";

    /* renamed from: g  reason: collision with root package name */
    private static Context f63935g;

    /* renamed from: b  reason: collision with root package name */
    private final int f63936b;

    /* renamed from: c  reason: collision with root package name */
    private final int f63937c;

    /* renamed from: d  reason: collision with root package name */
    private final int f63938d;

    /* renamed from: e  reason: collision with root package name */
    private final int f63939e;

    /* renamed from: h  reason: collision with root package name */
    private JSONObject f63940h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventTracker.java */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final u f63941a = new u();

        private a() {
        }
    }

    public static u a(Context context) {
        if (f63935g == null && context != null) {
            f63935g = context.getApplicationContext();
        }
        return a.f63941a;
    }

    private void b(Context context) {
        try {
            String string = PreferenceWrapper.getDefault(context).getString(f63933a, null);
            if (!TextUtils.isEmpty(string)) {
                this.f63940h = new JSONObject(string);
            }
            a();
        } catch (Exception unused) {
        }
    }

    private void c(Context context) {
        try {
            if (this.f63940h != null) {
                PreferenceWrapper.getDefault(f63935g).edit().putString(f63933a, this.f63940h.toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    private u() {
        this.f63936b = 128;
        this.f63937c = 256;
        this.f63938d = 1024;
        this.f63939e = 10;
        this.f63940h = null;
        try {
            b(f63935g);
        } catch (Throwable unused) {
        }
    }

    private boolean c(String str) {
        if (str == null) {
            return true;
        }
        try {
            return str.trim().getBytes().length <= 1024;
        } catch (Exception unused) {
            return false;
        }
    }

    public void a(String str, String str2, long j4, int i4, String str3) {
        String a5;
        try {
            if (a(str) && b(str2)) {
                if (Arrays.asList(f.aM).contains(str)) {
                    MLog.e("key is " + str + ", please check key, illegal");
                    UMLog.aq(l.f63821m, 0, "\\|");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", currentTimeMillis);
                if (j4 > 0) {
                    jSONObject.put(f.ac, j4);
                }
                jSONObject.put("__t", k.f63789a);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put(str, str2);
                }
                if (UMUtils.isMainProgress(f63935g)) {
                    a5 = aa.a().d(UMGlobalContext.getAppContext(f63935g));
                } else {
                    a5 = aa.a().a(UMGlobalContext.getAppContext(f63935g), currentTimeMillis);
                }
                if (TextUtils.isEmpty(a5)) {
                    a5 = f63934f;
                }
                jSONObject.put("__i", a5);
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(f.aA, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f63935g).getProcessName(f63935g));
                a();
                JSONObject jSONObject3 = this.f63940h;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f63940h.get(str)).booleanValue()) {
                    jSONObject.put(f.ae, 1);
                    this.f63940h.put(str, true);
                    c(f63935g);
                }
                Context context = f63935g;
                UMWorkDispatch.sendEvent(context, 4097, CoreProtocol.getInstance(context), jSONObject);
                return;
            }
            UMLog.aq(l.f63820l, 0, "\\|");
        } catch (Throwable unused2) {
        }
    }

    private boolean b(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
        } catch (Exception unused) {
        }
        MLog.e("value is " + str + ", please check value, illegal");
        return false;
    }

    private boolean b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!a(entry.getKey())) {
                            UMLog.aq(l.f63816h, 0, "\\|");
                            return false;
                        } else if (entry.getValue() == null) {
                            UMLog.aq(l.f63817i, 0, "\\|");
                            return false;
                        } else if (entry.getValue() instanceof String) {
                            if (f.aK.equals(entry.getKey())) {
                                if (!c(entry.getValue().toString())) {
                                    UMLog.aq(l.P, 0, "\\|");
                                    return false;
                                }
                            } else if ("_$!url".equals(entry.getKey())) {
                                if (!c(entry.getValue().toString())) {
                                    UMLog.aq("url参数长度超过限制。|参数url长度不能超过1024字符。", 0, "\\|");
                                    return false;
                                }
                            } else if (!b(entry.getValue().toString())) {
                                UMLog.aq(l.f63818j, 0, "\\|");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
                return true;
            }
        }
        UMLog.aq(l.f63815g, 0, "\\|");
        return false;
    }

    public void a(String str, Map<String, Object> map, long j4, String str2, boolean z4) {
        String a5;
        try {
            if (!a(str)) {
                UMLog.aq(l.f63814f, 0, "\\|");
            } else if (b(map)) {
                if (map.size() > 100) {
                    MLog.e("map size is " + map.size() + ", please check");
                } else if (Arrays.asList(f.aM).contains(str)) {
                    MLog.e("key is " + str + ", please check key, illegal");
                    UMLog.aq(l.f63810b, 0, "\\|");
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", str);
                    jSONObject.put("ts", System.currentTimeMillis());
                    if (j4 > 0) {
                        jSONObject.put(f.ac, j4);
                    }
                    jSONObject.put("__t", k.f63789a);
                    ULog.i("befort ekv map, event is " + jSONObject.toString());
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!Arrays.asList(f.aM).contains(entry.getKey())) {
                            Object value = entry.getValue();
                            if (!(value instanceof String) && !(value instanceof Integer) && !(value instanceof Long) && !(value instanceof Short) && !(value instanceof Float) && !(value instanceof Double)) {
                                if (value.getClass().isArray()) {
                                    if (value instanceof int[]) {
                                        int[] iArr = (int[]) value;
                                        if (iArr.length > 10) {
                                            MLog.e("please check key or value, size overlength!");
                                            return;
                                        }
                                        JSONArray jSONArray = new JSONArray();
                                        for (int i4 : iArr) {
                                            jSONArray.put(i4);
                                        }
                                        jSONObject.put(entry.getKey(), jSONArray);
                                    } else if (value instanceof double[]) {
                                        double[] dArr = (double[]) value;
                                        if (dArr.length > 10) {
                                            MLog.e("please check key or value, size overlength!");
                                            return;
                                        }
                                        JSONArray jSONArray2 = new JSONArray();
                                        for (double d5 : dArr) {
                                            jSONArray2.put(d5);
                                        }
                                        jSONObject.put(entry.getKey(), jSONArray2);
                                    } else if (value instanceof long[]) {
                                        long[] jArr = (long[]) value;
                                        if (jArr.length > 10) {
                                            MLog.e("please check key or value, size overlength!");
                                            return;
                                        }
                                        JSONArray jSONArray3 = new JSONArray();
                                        for (long j5 : jArr) {
                                            jSONArray3.put(j5);
                                        }
                                        jSONObject.put(entry.getKey(), jSONArray3);
                                    } else if (value instanceof float[]) {
                                        float[] fArr = (float[]) value;
                                        if (fArr.length > 10) {
                                            MLog.e("please check key or value, size overlength!");
                                            return;
                                        }
                                        JSONArray jSONArray4 = new JSONArray();
                                        for (float f5 : fArr) {
                                            jSONArray4.put(f5);
                                        }
                                        jSONObject.put(entry.getKey(), jSONArray4);
                                    } else if (value instanceof short[]) {
                                        short[] sArr = (short[]) value;
                                        if (sArr.length > 10) {
                                            MLog.e("please check key or value, size overlength!");
                                            return;
                                        }
                                        JSONArray jSONArray5 = new JSONArray();
                                        for (short s4 : sArr) {
                                            jSONArray5.put((int) s4);
                                        }
                                        jSONObject.put(entry.getKey(), jSONArray5);
                                    } else if (value instanceof String[]) {
                                        String[] strArr = (String[]) value;
                                        if (strArr.length > 10) {
                                            MLog.e("please check key or value, size overlength!");
                                            return;
                                        }
                                        JSONArray jSONArray6 = new JSONArray();
                                        for (int i5 = 0; i5 < strArr.length; i5++) {
                                            if (strArr[i5] == null) {
                                                MLog.e("please check array, null item!");
                                                return;
                                            } else if (!b(strArr[i5])) {
                                                return;
                                            } else {
                                                jSONArray6.put(strArr[i5]);
                                            }
                                        }
                                        jSONObject.put(entry.getKey(), jSONArray6);
                                    } else {
                                        MLog.e("please check key or value, illegal type!");
                                        return;
                                    }
                                } else {
                                    MLog.e("please check key or value, illegal type!");
                                    return;
                                }
                            }
                            jSONObject.put(entry.getKey(), value);
                        } else {
                            UMLog.aq(l.f63813e, 0, "\\|");
                            return;
                        }
                    }
                    if (UMUtils.isMainProgress(f63935g)) {
                        a5 = aa.a().d(UMGlobalContext.getAppContext(f63935g));
                    } else {
                        a5 = aa.a().a(UMGlobalContext.getAppContext(f63935g), jSONObject.getLong("ts"));
                    }
                    if (TextUtils.isEmpty(a5)) {
                        a5 = f63934f;
                    }
                    jSONObject.put("__i", a5);
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(str2);
                            if (jSONObject2.length() > 0) {
                                jSONObject.put(f.aA, jSONObject2);
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    jSONObject.put("ds", 0);
                    jSONObject.put("pn", UMGlobalContext.getInstance(f63935g).getProcessName(f63935g));
                    a();
                    JSONObject jSONObject3 = this.f63940h;
                    if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f63940h.get(str)).booleanValue()) {
                        jSONObject.put(f.ae, 1);
                        this.f63940h.put(str, true);
                        c(f63935g);
                    }
                    ULog.i("----->>>>>ekv event json is " + jSONObject.toString());
                    if (!z4) {
                        Context context = f63935g;
                        UMWorkDispatch.sendEvent(context, 4097, CoreProtocol.getInstance(context), jSONObject);
                        return;
                    }
                    Context context2 = f63935g;
                    UMWorkDispatch.sendEvent(context2, 4355, CoreProtocol.getInstance(context2), jSONObject);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public void a(String str, Map<String, Object> map, String str2) {
        try {
            if (a(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(f.ac, 0);
                jSONObject.put("__t", k.f63790b);
                ULog.i("befort gkv map, event is " + jSONObject.toString());
                Iterator<Map.Entry<String, Object>> it2 = map.entrySet().iterator();
                for (int i4 = 0; i4 < 10 && it2.hasNext(); i4++) {
                    Map.Entry<String, Object> next = it2.next();
                    if (!f.ae.equals(next.getKey()) && !f.ac.equals(next.getKey()) && !"id".equals(next.getKey()) && !"ts".equals(next.getKey())) {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put(next.getKey(), value);
                        }
                    }
                }
                String d5 = aa.a().d(UMGlobalContext.getAppContext(f63935g));
                if (TextUtils.isEmpty(d5)) {
                    d5 = f63934f;
                }
                jSONObject.put("__i", d5);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(f.aA, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f63935g).getProcessName(f63935g));
                ULog.i("----->>>>>gkv event json is " + jSONObject.toString());
                Context context = f63935g;
                UMWorkDispatch.sendEvent(context, 4098, CoreProtocol.getInstance(context), jSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    private void a() {
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(f63935g, "track_list", "");
            if (TextUtils.isEmpty(imprintProperty)) {
                return;
            }
            String[] split = imprintProperty.split("!");
            JSONObject jSONObject = new JSONObject();
            int i4 = 0;
            if (this.f63940h != null) {
                for (String str : split) {
                    String subStr = HelperUtils.subStr(str, 128);
                    if (this.f63940h.has(subStr)) {
                        jSONObject.put(subStr, this.f63940h.get(subStr));
                    }
                }
            }
            this.f63940h = new JSONObject();
            if (split.length >= 10) {
                while (i4 < 10) {
                    a(split[i4], jSONObject);
                    i4++;
                }
            } else {
                while (i4 < split.length) {
                    a(split[i4], jSONObject);
                    i4++;
                }
            }
            c(f63935g);
        } catch (Exception unused) {
        }
    }

    private void a(String str, JSONObject jSONObject) throws JSONException {
        String subStr = HelperUtils.subStr(str, 128);
        if (jSONObject.has(subStr)) {
            a(subStr, ((Boolean) jSONObject.get(subStr)).booleanValue());
        } else {
            a(subStr, false);
        }
    }

    private void a(String str, boolean z4) {
        try {
            if (f.ae.equals(str) || f.ac.equals(str) || "id".equals(str) || "ts".equals(str) || this.f63940h.has(str)) {
                return;
            }
            this.f63940h.put(str, z4);
        } catch (Exception unused) {
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    a();
                    JSONObject jSONObject = this.f63940h;
                    if (jSONObject == null) {
                        this.f63940h = new JSONObject();
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            JSONObject jSONObject2 = this.f63940h;
                            if (jSONObject2 == null) {
                                this.f63940h = new JSONObject();
                            } else if (jSONObject2.length() >= 5) {
                                break;
                            }
                            String str = list.get(i4);
                            if (!TextUtils.isEmpty(str)) {
                                a(HelperUtils.subStr(str, 128), false);
                            }
                        }
                        c(f63935g);
                        return;
                    } else if (jSONObject.length() >= 5) {
                        MLog.d("already setFistLaunchEvent, igone.");
                        return;
                    } else {
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            if (this.f63940h.length() >= 5) {
                                MLog.d(" add setFistLaunchEvent over.");
                                return;
                            }
                            a(HelperUtils.subStr(list.get(i5), 128), false);
                        }
                        c(f63935g);
                        return;
                    }
                }
            } catch (Exception unused) {
                return;
            }
        }
        UMLog.aq(l.ak, 0, "\\|");
    }

    private JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    String key = entry.getKey();
                    if (key != null) {
                        String subStr = HelperUtils.subStr(key, 128);
                        Object value = entry.getValue();
                        if (value != null) {
                            int i4 = 0;
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    JSONArray jSONArray = new JSONArray();
                                    while (i4 < iArr.length) {
                                        jSONArray.put(iArr[i4]);
                                        i4++;
                                    }
                                    jSONObject.put(subStr, jSONArray);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    JSONArray jSONArray2 = new JSONArray();
                                    while (i4 < dArr.length) {
                                        jSONArray2.put(dArr[i4]);
                                        i4++;
                                    }
                                    jSONObject.put(subStr, jSONArray2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    JSONArray jSONArray3 = new JSONArray();
                                    while (i4 < jArr.length) {
                                        jSONArray3.put(jArr[i4]);
                                        i4++;
                                    }
                                    jSONObject.put(subStr, jSONArray3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    JSONArray jSONArray4 = new JSONArray();
                                    while (i4 < fArr.length) {
                                        jSONArray4.put(fArr[i4]);
                                        i4++;
                                    }
                                    jSONObject.put(subStr, jSONArray4);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    JSONArray jSONArray5 = new JSONArray();
                                    while (i4 < sArr.length) {
                                        jSONArray5.put((int) sArr[i4]);
                                        i4++;
                                    }
                                    jSONObject.put(subStr, jSONArray5);
                                }
                            } else if (value instanceof List) {
                                List list = (List) value;
                                JSONArray jSONArray6 = new JSONArray();
                                while (i4 < list.size()) {
                                    Object obj = list.get(i4);
                                    if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                                        jSONArray6.put(list.get(i4));
                                    }
                                    i4++;
                                }
                                if (jSONArray6.length() > 0) {
                                    jSONObject.put(subStr, jSONArray6);
                                }
                            } else if (value instanceof String) {
                                jSONObject.put(subStr, HelperUtils.subStr(value.toString(), 256));
                            } else {
                                if (!(value instanceof Long) && !(value instanceof Integer) && !(value instanceof Float) && !(value instanceof Double) && !(value instanceof Short)) {
                                    MLog.e("The param has not support type. please check !");
                                }
                                jSONObject.put(subStr, value);
                            }
                        }
                    }
                } catch (Exception e5) {
                    MLog.e(e5);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private boolean a(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        MLog.e("key is " + str + ", please check key, illegal");
        return false;
    }
}
