package com.umeng.ccg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.ab;
import com.umeng.analytics.pro.ac;
import com.umeng.analytics.pro.ad;
import com.umeng.analytics.pro.ae;
import com.umeng.analytics.pro.af;
import com.umeng.analytics.pro.ag;
import com.umeng.analytics.pro.ah;
import com.umeng.analytics.pro.aj;
import com.umeng.analytics.pro.al;
import com.umeng.analytics.pro.an;
import com.umeng.analytics.pro.ap;
import com.umeng.analytics.pro.aq;
import com.umeng.analytics.pro.ar;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.av;
import com.umeng.analytics.pro.aw;
import com.umeng.ccg.c;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: Monitor.java */
/* loaded from: classes6.dex */
public class d implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64054a = "iucc";

    /* renamed from: b  reason: collision with root package name */
    private static final String f64055b = aw.b().b(aw.C);

    /* renamed from: c  reason: collision with root package name */
    private static JSONObject f64056c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f64057d = {com.umeng.ccg.a.f64013f, com.umeng.ccg.a.f64014g, com.umeng.ccg.a.f64015h};

    /* renamed from: e  reason: collision with root package name */
    private static ArrayList<ac> f64058e = null;

    /* renamed from: f  reason: collision with root package name */
    private static ArrayList<ac> f64059f = null;

    /* renamed from: g  reason: collision with root package name */
    private static ArrayList<ac> f64060g = null;

    /* renamed from: j  reason: collision with root package name */
    private static c f64061j = new c();

    /* renamed from: h  reason: collision with root package name */
    private volatile String f64062h = "";

    /* renamed from: i  reason: collision with root package name */
    private Map<String, a> f64063i = new HashMap();

    /* compiled from: Monitor.java */
    /* loaded from: classes6.dex */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        private JSONArray f64066b;

        /* renamed from: c  reason: collision with root package name */
        private String f64067c;

        public a(JSONArray jSONArray, String str) {
            this.f64066b = jSONArray;
            this.f64067c = str;
        }

        public JSONArray a() {
            return this.f64066b;
        }

        public String b() {
            return this.f64067c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Monitor.java */
    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final d f64068a = new d();

        private b() {
        }
    }

    /* compiled from: Monitor.java */
    /* loaded from: classes6.dex */
    public static class c extends BroadcastReceiver {
        public long a(ArrayList<ac> arrayList) {
            if (arrayList != null && arrayList.size() > 0) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ac acVar = arrayList.get(i4);
                    if (acVar instanceof ae) {
                        return ((ae) acVar).c();
                    }
                }
            }
            return 0L;
        }

        public boolean b(ArrayList<ac> arrayList) {
            if (arrayList == null || arrayList.size() <= 0) {
                return false;
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (arrayList.get(i4).b()) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_SCREEN_ON");
                    if (b(d.f64058e)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_on event.");
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 301, d.a(), null, a(d.f64058e) * 1000);
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_on event.");
                    }
                }
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_SCREEN_OFF");
                    if (b(d.f64059f)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_off event.");
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 302, d.a(), null, a(d.f64059f) * 1000);
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_off event.");
                    }
                }
                if (action.equals("android.intent.action.USER_PRESENT")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_USER_PRESENT");
                    if (b(d.f64060g)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_unlock event.");
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 303, d.a(), null, a(d.f64060g) * 1000);
                        return;
                    }
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_unlock event.");
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context, String str) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        context.registerReceiver(f64061j, intentFilter);
    }

    private String e(Context context) {
        try {
            SharedPreferences a5 = at.a(context);
            return a5 != null ? a5.getString(at.f63362e, "") : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private void f() {
        try {
            SharedPreferences a5 = at.a(UMGlobalContext.getAppContext());
            if (a5 != null) {
                a5.edit().putString(at.f63363f, new JSONObject(ar.a()).toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    private boolean g() {
        try {
            SharedPreferences a5 = at.a(UMGlobalContext.getAppContext());
            if (a5 != null) {
                return !TextUtils.isEmpty(a5.getString(at.f63364g, ""));
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private long b(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ts")) {
            try {
                return jSONObject.optLong("ts");
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    private void c(Context context) {
        ImprintHandler.getImprintService(context).registImprintCallback(f64054a, new UMImprintChangeCallback() { // from class: com.umeng.ccg.d.1
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 107, d.a(), str2);
            }
        });
    }

    private Long d(Context context) {
        try {
            SharedPreferences a5 = at.a(context);
            if (a5 == null) {
                return 0L;
            }
            return Long.valueOf(a5.getLong(at.f63361d, 0L));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private void c(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(com.umeng.ccg.a.f64008a)) {
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(com.umeng.ccg.a.f64008a);
            ab a5 = optJSONObject.has(com.umeng.ccg.a.f64009b) ? a(com.umeng.ccg.a.f64009b, optJSONObject.optJSONObject(com.umeng.ccg.a.f64009b)) : null;
            ab a6 = optJSONObject.has(com.umeng.ccg.a.f64010c) ? a(com.umeng.ccg.a.f64010c, optJSONObject.optJSONObject(com.umeng.ccg.a.f64010c)) : null;
            ab a7 = optJSONObject.has(com.umeng.ccg.a.f64011d) ? a(com.umeng.ccg.a.f64011d, optJSONObject.optJSONObject(com.umeng.ccg.a.f64011d)) : null;
            ab a8 = optJSONObject.has(com.umeng.ccg.a.f64012e) ? a(com.umeng.ccg.a.f64012e, optJSONObject.optJSONObject(com.umeng.ccg.a.f64012e)) : null;
            ab a9 = optJSONObject.has(com.umeng.ccg.a.f64013f) ? a(com.umeng.ccg.a.f64013f, optJSONObject.optJSONObject(com.umeng.ccg.a.f64013f)) : null;
            ab a10 = optJSONObject.has(com.umeng.ccg.a.f64014g) ? a(com.umeng.ccg.a.f64014g, optJSONObject.optJSONObject(com.umeng.ccg.a.f64014g)) : null;
            ab a11 = optJSONObject.has(com.umeng.ccg.a.f64015h) ? a(com.umeng.ccg.a.f64015h, optJSONObject.optJSONObject(com.umeng.ccg.a.f64015h)) : null;
            ArrayList arrayList = new ArrayList();
            if (a5 != null) {
                arrayList.add(a5);
            }
            if (a6 != null) {
                arrayList.add(a6);
            }
            if (a7 != null) {
                arrayList.add(a7);
            }
            if (a8 != null) {
                arrayList.add(a8);
            }
            if (a9 != null) {
                arrayList.add(a9);
            }
            if (a10 != null) {
                arrayList.add(a10);
            }
            if (a11 != null) {
                arrayList.add(a11);
            }
            com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 202, a(), arrayList);
        } catch (Throwable unused) {
        }
    }

    private boolean e() {
        SharedPreferences a5 = at.a(UMGlobalContext.getAppContext());
        if (a5 != null) {
            String string = a5.getString(at.f63363f, "");
            if (TextUtils.isEmpty(string)) {
                f();
                return false;
            }
            try {
                if (!ar.a().keySet().equals(ar.a(new JSONObject(string)).keySet())) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static d a() {
        return b.f64068a;
    }

    private JSONObject b(Context context) {
        FileInputStream fileInputStream;
        try {
            File filesDir = context.getFilesDir();
            String str = f64055b;
            if (new File(filesDir, str).exists()) {
                try {
                    fileInputStream = context.openFileInput(str);
                } catch (Throwable unused) {
                    fileInputStream = null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(av.a(HelperUtils.readStreamToByteArray(fileInputStream), UMConfigure.sAppkey.getBytes())));
                    try {
                        ar.a(fileInputStream);
                    } catch (Throwable unused2) {
                    }
                    return jSONObject;
                } catch (Throwable unused3) {
                    ar.a(fileInputStream);
                    return null;
                }
            }
            return null;
        } catch (Throwable unused4) {
            return null;
        }
    }

    public void a(Context context) {
        com.umeng.ccg.c.a(context, 105, a(), null);
    }

    private boolean a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("code")) {
            return false;
        }
        try {
            if (200 == Integer.valueOf(jSONObject.optInt("code")).intValue() && jSONObject.has(com.umeng.ccg.a.f64008a)) {
                return jSONObject.has("ts");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void a(Context context, JSONObject jSONObject, String str) {
        try {
            long b5 = b(jSONObject);
            byte[] a5 = av.a(jSONObject.toString().getBytes(), UMConfigure.sAppkey.getBytes());
            if (a5 != null && a5.length > 1) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), f64055b));
                fileOutputStream.write(a5);
                fileOutputStream.flush();
                ar.a(fileOutputStream);
                a(context, str, b5);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "saveConfigFile success.");
            }
        } catch (Throwable unused) {
        }
    }

    private void b(String str) {
        String str2 = at.f63359b + str;
        SharedPreferences a5 = at.a(UMGlobalContext.getAppContext());
        if (a5 != null) {
            a5.edit().putLong(str2, System.currentTimeMillis()).commit();
        }
    }

    private void a(String str, ac acVar) {
        if (com.umeng.ccg.a.f64013f.equalsIgnoreCase(str)) {
            if (f64058e == null) {
                f64058e = new ArrayList<>();
            }
            f64058e.add(acVar);
        }
        if (com.umeng.ccg.a.f64014g.equalsIgnoreCase(str)) {
            if (f64059f == null) {
                f64059f = new ArrayList<>();
            }
            f64059f.add(acVar);
        }
        if (com.umeng.ccg.a.f64015h.equalsIgnoreCase(str)) {
            if (f64060g == null) {
                f64060g = new ArrayList<>();
            }
            f64060g.add(acVar);
        }
    }

    private ab a(String str, JSONObject jSONObject) {
        JSONArray optJSONArray;
        String str2;
        String str3;
        ab abVar;
        JSONArray optJSONArray2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has(com.umeng.ccg.a.f64016i) && (optJSONArray = jSONObject.optJSONArray(com.umeng.ccg.a.f64016i)) != null && optJSONArray.length() > 0) {
                    JSONObject jSONObject2 = (JSONObject) optJSONArray.get(0);
                    boolean has = jSONObject2.has(com.umeng.ccg.a.f64017j);
                    boolean has2 = jSONObject2.has(com.umeng.ccg.a.f64020m);
                    boolean has3 = jSONObject2.has(com.umeng.ccg.a.f64021n);
                    if (has && has2 && has3) {
                        try {
                            int optInt = jSONObject2.optInt(com.umeng.ccg.a.f64017j);
                            long optLong = jSONObject2.optLong(com.umeng.ccg.a.f64020m);
                            long optLong2 = jSONObject2.optLong(com.umeng.ccg.a.f64021n);
                            String optString = jSONObject2.optString(com.umeng.ccg.a.f64022o);
                            ArrayList arrayList = new ArrayList();
                            if (jSONObject2.has(com.umeng.ccg.a.f64018k)) {
                                JSONArray optJSONArray3 = jSONObject2.optJSONArray(com.umeng.ccg.a.f64018k);
                                str2 = "action";
                                HashSet hashSet = new HashSet();
                                if (optJSONArray3 != null) {
                                    str3 = com.umeng.ccg.a.f64025r;
                                    int i4 = 0;
                                    for (int length = optJSONArray3.length(); i4 < length; length = length) {
                                        hashSet.add(Integer.valueOf(optJSONArray3.getInt(i4)));
                                        i4++;
                                    }
                                } else {
                                    str3 = com.umeng.ccg.a.f64025r;
                                }
                                if (hashSet.size() > 0) {
                                    al alVar = new al(hashSet);
                                    if (Arrays.asList(f64057d).contains(str)) {
                                        a(str, alVar);
                                    } else {
                                        arrayList.add(alVar);
                                    }
                                }
                            } else {
                                str2 = "action";
                                str3 = com.umeng.ccg.a.f64025r;
                            }
                            if (jSONObject2.has(com.umeng.ccg.a.f64019l)) {
                                String optString2 = jSONObject2.optString(com.umeng.ccg.a.f64019l);
                                if (!TextUtils.isEmpty(optString2)) {
                                    aj ajVar = new aj(optString2);
                                    HashSet hashSet2 = new HashSet();
                                    for (int i5 = 1; i5 <= 24; i5++) {
                                        if (ajVar.a(i5)) {
                                            hashSet2.add(Integer.valueOf(i5));
                                        }
                                    }
                                    if (hashSet2.size() > 0) {
                                        af afVar = new af(hashSet2);
                                        if (Arrays.asList(f64057d).contains(str)) {
                                            a(str, afVar);
                                        } else {
                                            arrayList.add(afVar);
                                        }
                                    }
                                }
                            }
                            arrayList.add(new ah(optInt));
                            ag agVar = new ag(str, optLong);
                            String[] strArr = f64057d;
                            if (Arrays.asList(strArr).contains(str)) {
                                a(str, agVar);
                            } else {
                                arrayList.add(agVar);
                            }
                            ae aeVar = new ae(optLong2);
                            if (Arrays.asList(strArr).contains(str)) {
                                a(str, aeVar);
                                arrayList.add(aeVar);
                            } else {
                                arrayList.add(aeVar);
                            }
                            if (com.umeng.ccg.a.f64012e.equals(str)) {
                                abVar = new ad(str, arrayList);
                            } else {
                                abVar = new ab(str, arrayList);
                            }
                            try {
                                abVar.a(optString);
                                String str4 = "";
                                String str5 = str3;
                                if (jSONObject.has(str5) && (optJSONArray2 = jSONObject.optJSONArray(str5)) != null) {
                                    Map<String, a> map = this.f64063i;
                                    if (map != null && !map.containsKey(str)) {
                                        this.f64063i.put(str, new a(new JSONArray(optJSONArray2.toString()), optString));
                                    }
                                    int length2 = optJSONArray2.length();
                                    for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                                        str4 = str4 + optJSONArray2.getString(i6);
                                        if (i6 < length2 - 1) {
                                            str4 = str4 + ",";
                                        }
                                    }
                                }
                                abVar.b(str4);
                                if (com.umeng.ccg.a.f64012e.equals(str) && (abVar instanceof ad)) {
                                    String str6 = str2;
                                    if (jSONObject2.has(str6)) {
                                        ((ad) abVar).d(jSONObject2.optString(str6));
                                    }
                                    if (jSONObject2.has(com.umeng.ccg.a.f64026s)) {
                                        ((ad) abVar).c(jSONObject2.optString(com.umeng.ccg.a.f64026s));
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            return abVar;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                    return null;
                }
            } catch (Throwable unused3) {
            }
        }
        return null;
    }

    private void a(Context context, String str, long j4) {
        SharedPreferences a5;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] split = str.split("@");
            if (split.length != 4 || (a5 = at.a(context)) == null) {
                return;
            }
            long parseLong = Long.parseLong(split[0]);
            String str2 = split[1];
            SharedPreferences.Editor edit = a5.edit();
            edit.putLong(at.f63360c, j4);
            edit.putLong(at.f63361d, parseLong);
            edit.putString(at.f63362e, str2).commit();
            UMRTLog.i(UMRTLog.RTLOG_TAG, "updateTsS1S2 : ts = " + j4 + "; s1 = " + parseLong + "; s2 = " + str2);
        } catch (Throwable unused) {
        }
    }

    private void a(String str) {
        try {
            String[] split = str.split("@");
            if (split.length != 4) {
                return;
            }
            long parseLong = Long.parseLong(split[0]);
            String str2 = split[1];
            if (!TextUtils.isEmpty(this.f64062h)) {
                String[] split2 = this.f64062h.split("@");
                if (split2.length == 2) {
                    long parseLong2 = Long.parseLong(split2[0]);
                    String str3 = split2[1];
                    if (parseLong2 == parseLong && str3.equalsIgnoreCase(str2)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "重复的iucc S1 and S2, 忽略本次更新，不发起fetch。");
                        return;
                    }
                }
            }
            SharedPreferences a5 = at.a(UMGlobalContext.getAppContext());
            if (a5 != null) {
                if (a5.getLong(at.f63360c, 0L) != parseLong) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "local config ts != iuccS1, send FETCH_NEW_CONFIG msg.");
                    this.f64062h = String.valueOf(parseLong) + "@" + str2;
                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 101, a(), str);
                    return;
                }
                d(UMGlobalContext.getAppContext());
                if (e(UMGlobalContext.getAppContext()).equalsIgnoreCase(str2)) {
                    return;
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "local S2 != iuccS2, send FETCH_NEW_CONFIG msg.");
                this.f64062h = String.valueOf(parseLong) + "@" + str2;
                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 101, a(), str);
            }
        } catch (Throwable unused) {
        }
    }

    private void a(boolean z4) {
        try {
            SharedPreferences a5 = at.a(UMGlobalContext.getAppContext());
            if (a5 != null) {
                SharedPreferences.Editor edit = a5.edit();
                if (z4) {
                    edit.putString(at.f63364g, "1").commit();
                } else {
                    edit.putString(at.f63364g, "").commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v54 */
    @Override // com.umeng.ccg.c.a
    public void a(Object obj, int i4) {
        Integer valueOf;
        ArrayList arrayList;
        int size;
        a aVar;
        a aVar2;
        a aVar3;
        boolean z4 = true;
        int i5 = 0;
        try {
            switch (i4) {
                case 101:
                    if (obj == null || !(obj instanceof String)) {
                        return;
                    }
                    String str = (String) obj;
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "[workEvent]: recv FETCH_NEW_CONFIG msg. source iucc is: " + str);
                    JSONObject a5 = an.a(UMGlobalContext.getAppContext(), str);
                    if (a5 != null) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "[imprint] send request. body: " + a5.toString());
                        au.a(new aq(aq.f63343a, a5, str), 0L, TimeUnit.SECONDS);
                    }
                    if (g()) {
                        c(UMGlobalContext.getAppContext());
                        String imprintProperty = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), f64054a, "");
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "manual check iucc value: " + imprintProperty);
                        a(imprintProperty);
                        return;
                    }
                    return;
                case 102:
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "[workEvent]: recv FETCH_RESPONSE msg.");
                    this.f64062h = "";
                    if (obj != null && (obj instanceof JSONObject)) {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (a(jSONObject.optJSONObject("config"))) {
                            com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 103, a(), jSONObject);
                            return;
                        } else {
                            com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 104, a(), null);
                            return;
                        }
                    }
                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 104, a(), null);
                    return;
                case 103:
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "[workEvent]: recv FETCH_SUCCESS msg.");
                    Context appContext = UMGlobalContext.getAppContext();
                    if (obj == null || !(obj instanceof JSONObject)) {
                        return;
                    }
                    JSONObject jSONObject2 = (JSONObject) obj;
                    JSONObject optJSONObject = jSONObject2.optJSONObject("config");
                    String optString = jSONObject2.optString("sourceIucc");
                    if (optJSONObject != null) {
                        if (g()) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 成功拉取云配参数后，检测到should fetch标志，清除此标志。更新SDK类型集缓存值");
                            f();
                            a(false);
                        }
                        a(appContext, optJSONObject, optString);
                        return;
                    }
                    return;
                case 104:
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "[workEvent]: recv FETCH_FAILED msg.");
                    return;
                case 105:
                    String[] collectItemList = CcgAgent.getCollectItemList();
                    int length = collectItemList.length;
                    ?? r32 = 0;
                    while (r32 < length) {
                        String str2 = collectItemList[r32];
                        ArrayList<String> forbidSdkArray = CcgAgent.getForbidSdkArray(str2);
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "[forbid_sdk] 采集项: " + str2 + "; 值: " + forbidSdkArray.toString());
                        r32++;
                    }
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "[workEvent]: recv LOAD_CONFIG msg.");
                    Integer num = 0;
                    try {
                        JSONObject b5 = b(UMGlobalContext.getAppContext());
                        if (b5 != null) {
                            if (a(b5)) {
                                valueOf = Integer.valueOf(num.intValue() | 1);
                            } else {
                                valueOf = Integer.valueOf(num.intValue() | 0);
                            }
                        } else {
                            valueOf = Integer.valueOf(num.intValue() | 0);
                        }
                        r32 = new JSONObject();
                        r32.put("result", valueOf);
                        if (b5 != null) {
                            r32.put("config", b5);
                        }
                    } catch (Throwable unused) {
                    }
                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 106, a(), r32);
                    return;
                case 106:
                    if (obj == null || !(obj instanceof JSONObject)) {
                        return;
                    }
                    JSONObject jSONObject3 = (JSONObject) obj;
                    if (jSONObject3.has("result")) {
                        if ((jSONObject3.optInt("result") & 1) != 0 && jSONObject3.has("config")) {
                            JSONObject optJSONObject2 = jSONObject3.optJSONObject("config");
                            f64056c = optJSONObject2;
                            if (optJSONObject2 != null) {
                                CcgAgent.notifyConfigReady(optJSONObject2);
                                i5 = 1;
                            }
                        }
                        if (i5 == 0) {
                            CcgAgent.notifyConfigReady(null);
                        }
                    }
                    if (e()) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 检测到集成的SDK类型集合发生变化，发起云配参数拉取请求(设置本地should fetch标志).");
                        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), f64054a, "");
                        a(true);
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 101, a(), imprintProperty2);
                        return;
                    }
                    c(UMGlobalContext.getAppContext());
                    String imprintProperty3 = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), f64054a, "");
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "manual check iucc value: " + imprintProperty3);
                    a(imprintProperty3);
                    return;
                case 107:
                    if (obj != null) {
                        try {
                            if (obj instanceof String) {
                                String str3 = (String) obj;
                                UMRTLog.i(UMRTLog.RTLOG_TAG, "[IMPRINT_IUCC_CHANGED] iucc : " + str3);
                                a(str3);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "[imprint] process error " + th.getMessage());
                            return;
                        }
                    }
                    return;
                default:
                    switch (i4) {
                        case 201:
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "recv PARSE_CONFIG msg.");
                            if (obj == null || !(obj instanceof JSONObject)) {
                                return;
                            }
                            c((JSONObject) obj);
                            return;
                        case 202:
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "recv COLLECTION_JUDGMENT msg.");
                            if (obj == null || !(obj instanceof ArrayList) || (size = (arrayList = (ArrayList) obj).size()) <= 0) {
                                return;
                            }
                            while (i5 < size) {
                                ab abVar = (ab) arrayList.get(i5);
                                JSONObject a6 = abVar.a(abVar.a(), null);
                                if (a6 != null) {
                                    long optLong = !Arrays.asList(f64057d).contains(abVar.a()) ? a6.optLong("delay") * 1000 : 0L;
                                    a6.remove("delay");
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "send START_COLLECT msg, delayTs = " + optLong);
                                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 203, a(), a6, optLong);
                                }
                                i5++;
                            }
                            return;
                        case 203:
                            if (obj == null || !(obj instanceof JSONObject)) {
                                return;
                            }
                            JSONObject jSONObject4 = (JSONObject) obj;
                            String optString2 = jSONObject4.optString("actionName");
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "recv START_COLLECT msg. name is : " + optString2);
                            if (!com.umeng.ccg.b.a(optString2)) {
                                UMRTLog.i(UMRTLog.RTLOG_TAG, "Local switch of [" + optString2 + "] is off, ignore this command.");
                                return;
                            }
                            String jSONObject5 = jSONObject4.toString();
                            if (Arrays.asList(f64057d).contains(optString2)) {
                                if (com.umeng.ccg.a.f64013f.equalsIgnoreCase(optString2)) {
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "register Intent.ACTION_SCREEN_ON");
                                    a(UMGlobalContext.getAppContext(), "android.intent.action.SCREEN_ON");
                                }
                                if (com.umeng.ccg.a.f64014g.equalsIgnoreCase(optString2)) {
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "register Intent.ACTION_SCREEN_OFF");
                                    a(UMGlobalContext.getAppContext(), "android.intent.action.SCREEN_OFF");
                                }
                                if (com.umeng.ccg.a.f64015h.equalsIgnoreCase(optString2)) {
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "register Intent.ACTION_USER_PRESENT");
                                    a(UMGlobalContext.getAppContext(), "android.intent.action.USER_PRESENT");
                                    return;
                                }
                                return;
                            }
                            b(optString2);
                            if (CcgAgent.hasRegistedActionInfo()) {
                                if (CcgAgent.getActionInfo("anti") == null) {
                                    z4 = false;
                                }
                                String optString3 = jSONObject4.optString(com.umeng.ccg.a.f64023p);
                                if (!TextUtils.isEmpty(optString3)) {
                                    ActionInfo actionInfo = CcgAgent.getActionInfo(optString3);
                                    if (actionInfo != null) {
                                        UMRTLog.i(UMRTLog.RTLOG_TAG, "调用[" + optString3 + "] onCommand接口方法, 参数: " + jSONObject4.toString());
                                        actionInfo.onCommand(UMGlobalContext.getAppContext(), optString2, jSONObject4);
                                    }
                                } else {
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "忽略 本次采集项[" + optString2 + "]采集请求.");
                                }
                                if (z4) {
                                    return;
                                }
                                ar.a(UMGlobalContext.getAppContext(), jSONObject5);
                                return;
                            }
                            ar.a(UMGlobalContext.getAppContext(), jSONObject5);
                            return;
                        default:
                            switch (i4) {
                                case 301:
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv REPORT_SCREEN_ON msg.");
                                    b(com.umeng.ccg.a.f64013f);
                                    if (!this.f64063i.containsKey(com.umeng.ccg.a.f64013f) || (aVar = this.f64063i.get(com.umeng.ccg.a.f64013f)) == null) {
                                        return;
                                    }
                                    JSONObject a7 = an.a(UMGlobalContext.getAppContext(), 1, aVar.a(), aVar.b());
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "screen_on event param: " + a7.toString());
                                    au.a(new ap(ap.f63340a, a7), 0L, TimeUnit.SECONDS);
                                    return;
                                case 302:
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv REPORT_SCREEN_OFF msg.");
                                    b(com.umeng.ccg.a.f64014g);
                                    if (!this.f64063i.containsKey(com.umeng.ccg.a.f64014g) || (aVar2 = this.f64063i.get(com.umeng.ccg.a.f64014g)) == null) {
                                        return;
                                    }
                                    JSONObject a8 = an.a(UMGlobalContext.getAppContext(), 3, aVar2.a(), aVar2.b());
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "screen_off event param: " + a8.toString());
                                    au.a(new ap(ap.f63340a, a8), 0L, TimeUnit.SECONDS);
                                    return;
                                case 303:
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv REPORT_SCREEN_UNLOCK msg.");
                                    b(com.umeng.ccg.a.f64015h);
                                    if (!this.f64063i.containsKey(com.umeng.ccg.a.f64015h) || (aVar3 = this.f64063i.get(com.umeng.ccg.a.f64015h)) == null) {
                                        return;
                                    }
                                    JSONObject a9 = an.a(UMGlobalContext.getAppContext(), 2, aVar3.a(), aVar3.b());
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "screen_unlock event param: " + a9.toString());
                                    au.a(new ap(ap.f63340a, a9), 0L, TimeUnit.SECONDS);
                                    return;
                                default:
                                    return;
                            }
                    }
            }
        } catch (Throwable unused2) {
        }
    }
}
