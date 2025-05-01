package l1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ChannelReaderUtil.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f71471a = "ChannelReaderUtil";

    public static Map<Integer, ByteBuffer> a(File file) {
        return m1.b.a(file);
    }

    private static String b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static byte[] c(File file, int i4) {
        return m1.b.c(file, i4);
    }

    public static k1.a d(File file) {
        Map<String, String> g4 = g(file);
        if (g4 == null) {
            return null;
        }
        g4.remove(m1.a.f71513a);
        return new k1.a(g4.get(m1.a.f71513a), g4);
    }

    public static String e(File file) {
        String d5 = m1.a.d(file);
        StringBuilder sb = new StringBuilder();
        sb.append("getChannelByV1 , channel = ");
        sb.append(d5);
        return d5;
    }

    public static String f(File file) {
        String e5 = m1.a.e(file);
        StringBuilder sb = new StringBuilder();
        sb.append("getChannelByV2 , channel = ");
        sb.append(e5);
        return e5;
    }

    public static Map<String, String> g(File file) {
        try {
            String h4 = h(file);
            if (TextUtils.isEmpty(h4)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(h4);
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

    public static String h(File file) {
        String f5 = f(file);
        return TextUtils.isEmpty(f5) ? e(file) : f5;
    }

    public static String i(File file, int i4) {
        String d5 = m1.b.d(file, i4);
        StringBuilder sb = new StringBuilder();
        sb.append("id = ");
        sb.append(i4);
        sb.append(" , value = ");
        sb.append(d5);
        return d5;
    }
}
