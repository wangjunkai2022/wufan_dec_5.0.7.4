package com.meituan.android.walle;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ChannelReader.java */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f55926a = "channel";

    private d() {
    }

    public static c a(File file) {
        Map<String, String> b5 = b(file);
        if (b5 == null) {
            return null;
        }
        b5.remove("channel");
        return new c(b5.get("channel"), b5);
    }

    public static Map<String, String> b(File file) {
        try {
            String c5 = c(file);
            if (c5 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(c5);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.getString(obj));
            }
            return hashMap;
        } catch (JSONException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String c(File file) {
        return f.d(file, a.f55912e);
    }
}
