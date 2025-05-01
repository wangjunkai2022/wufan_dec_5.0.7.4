package com.efs.sdk.base.core.config.a;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.controller.ControllerCenter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    String f10342b;

    /* renamed from: a  reason: collision with root package name */
    public int f10341a = -1;

    /* renamed from: c  reason: collision with root package name */
    String f10343c = "https://";

    /* renamed from: d  reason: collision with root package name */
    String f10344d = "errnewlog.umeng.com";

    /* renamed from: e  reason: collision with root package name */
    long f10345e = 480;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f10349i = null;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, Double> f10346f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public Map<String, String> f10347g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public Map<String, Object> f10348h = new HashMap();

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f10342b = str;
            String str2 = new String(com.efs.sdk.base.core.util.b.a.a(Base64.decode(str.getBytes(), 11), ControllerCenter.getGlobalEnvStruct().getSecret().getBytes()));
            String[] split = str2.split("\\|");
            if (split.length <= 1) {
                return;
            }
            String str3 = split[1];
            try {
                JSONArray jSONArray = new JSONArray(str2.substring(split[0].length() + split[1].length() + 2));
                this.f10348h.put("rate", Integer.valueOf(Integer.parseInt(str3)));
                this.f10348h.put("stra", jSONArray);
            } catch (JSONException e5) {
                throw new RuntimeException(e5);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a() {
        b bVar = new b();
        if (ControllerCenter.getGlobalEnvStruct().isIntl()) {
            bVar.f10344d = "errnewlogos.umeng.com";
        } else {
            bVar.f10344d = "errnewlog.umeng.com";
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(@NonNull Map<String, String> map) {
        if (map.containsKey("gate_way")) {
            String str = map.get("gate_way");
            if (!TextUtils.isEmpty(str)) {
                this.f10344d = str;
            }
        }
        if (map.containsKey("gate_way_https")) {
            String str2 = map.get("gate_way_https");
            if (!TextUtils.isEmpty(str2)) {
                this.f10343c = Boolean.parseBoolean(str2) ? "https://" : "http://";
            }
        }
        try {
            if (map.containsKey("updateInteval")) {
                String str3 = map.get("updateInteval");
                if (!TextUtils.isEmpty(str3)) {
                    this.f10345e = Long.parseLong(str3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("data_sampling_rate_") || key.startsWith("file_sampling_rate_")) {
                String replace = key.replace("data_sampling_rate_", "").replace("file_sampling_rate_", "");
                double d5 = 100.0d;
                try {
                    d5 = Double.parseDouble(entry.getValue());
                } catch (Throwable unused) {
                }
                hashMap.put(replace, Double.valueOf(d5));
            }
        }
        this.f10346f = hashMap;
        this.f10347g = map;
    }
}
