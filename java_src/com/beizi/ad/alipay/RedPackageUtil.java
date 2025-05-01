package com.beizi.ad.alipay;

import com.beizi.ad.lance.a.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class RedPackageUtil {
    private static final String TAG = "RedPackageUtil";

    public static Map<String, String> convertJsonToMap(String str) throws JSONException {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.getString(next));
        }
        return hashMap;
    }

    public static String convertMapToJson(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                jSONObject.put(key, value);
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static Map<String, Object> jsonToMap(JSONObject jSONObject) {
        HashMap hashMap;
        HashMap hashMap2 = null;
        try {
            hashMap = new HashMap();
        } catch (Exception e5) {
            e = e5;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    obj = jsonToMap((JSONObject) obj);
                }
                hashMap.put(next, obj);
            }
            return hashMap;
        } catch (Exception e6) {
            e = e6;
            hashMap2 = hashMap;
            l.c(TAG, "e : " + e);
            return hashMap2;
        }
    }

    public static Map<String, Object> stringToMap(String str) {
        try {
            return jsonToMap(new JSONObject(str));
        } catch (JSONException e5) {
            l.b(TAG, "e : " + e5);
            return null;
        }
    }
}
