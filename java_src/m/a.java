package m;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f71489c = "\"&";

    /* renamed from: d  reason: collision with root package name */
    public static final String f71490d = "&";

    /* renamed from: e  reason: collision with root package name */
    public static final String f71491e = "bizcontext=\"";

    /* renamed from: f  reason: collision with root package name */
    public static final String f71492f = "bizcontext=";

    /* renamed from: g  reason: collision with root package name */
    public static final String f71493g = "\"";

    /* renamed from: h  reason: collision with root package name */
    public static final String f71494h = "appkey";

    /* renamed from: i  reason: collision with root package name */
    public static final String f71495i = "ty";

    /* renamed from: j  reason: collision with root package name */
    public static final String f71496j = "sv";

    /* renamed from: k  reason: collision with root package name */
    public static final String f71497k = "an";

    /* renamed from: l  reason: collision with root package name */
    public static final String f71498l = "av";

    /* renamed from: m  reason: collision with root package name */
    public static final String f71499m = "sdk_start_time";

    /* renamed from: n  reason: collision with root package name */
    public static final String f71500n = "UTF-8";

    /* renamed from: a  reason: collision with root package name */
    private String f71501a;

    /* renamed from: b  reason: collision with root package name */
    private String f71502b;

    public a(Context context) {
        this.f71501a = "";
        this.f71502b = "";
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f71501a = packageInfo.versionName;
            this.f71502b = packageInfo.packageName;
        } catch (Exception unused) {
        }
    }

    private static String c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i4 = 0; i4 < split.length; i4++) {
            if (!TextUtils.isEmpty(split[i4]) && split[i4].startsWith(str3)) {
                return split[i4];
            }
        }
        return null;
    }

    private String d(String str, String str2) throws JSONException, UnsupportedEncodingException {
        String b5 = b("", "");
        return str + b5 + str2;
    }

    private String e(String str, String str2, String str3) throws JSONException, UnsupportedEncodingException {
        String substring = str.substring(str2.length());
        JSONObject jSONObject = new JSONObject(substring.substring(0, substring.length() - str3.length()));
        if (!jSONObject.has("appkey")) {
            jSONObject.put("appkey", com.alipay.sdk.cons.a.f4814c);
        }
        if (!jSONObject.has(f71495i)) {
            jSONObject.put(f71495i, "and_lite");
        }
        if (!jSONObject.has(f71496j)) {
            jSONObject.put(f71496j, com.alipay.sdk.cons.a.f4817f);
        }
        if (!jSONObject.has(f71497k)) {
            jSONObject.put(f71497k, this.f71502b);
        }
        if (!jSONObject.has(f71498l)) {
            jSONObject.put(f71498l, this.f71501a);
        }
        if (!jSONObject.has(f71499m)) {
            jSONObject.put(f71499m, System.currentTimeMillis());
        }
        String jSONObject2 = jSONObject.toString();
        return str2 + jSONObject2 + str3;
    }

    private static boolean f(String str) {
        return !str.contains(f71489c);
    }

    private String g(String str) {
        try {
            String c5 = c(str, f71490d, f71492f);
            if (TextUtils.isEmpty(c5)) {
                str = str + f71490d + d(f71492f, "");
            } else {
                int indexOf = str.indexOf(c5);
                str = str.substring(0, indexOf) + e(c5, f71492f, "") + str.substring(indexOf + c5.length());
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    private String h(String str) {
        try {
            String c5 = c(str, f71489c, f71491e);
            if (TextUtils.isEmpty(c5)) {
                return str + f71490d + d(f71491e, f71493g);
            }
            if (!c5.endsWith(f71493g)) {
                c5 = c5 + f71493g;
            }
            int indexOf = str.indexOf(c5);
            return str.substring(0, indexOf) + e(c5, f71491e, f71493g) + str.substring(indexOf + c5.length());
        } catch (Throwable unused) {
            return str;
        }
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("new_external_info==")) {
            return str;
        }
        if (!str.contains(f71489c)) {
            return g(str);
        }
        return h(str);
    }

    public final String b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", com.alipay.sdk.cons.a.f4814c);
            jSONObject.put(f71495i, "and_lite");
            jSONObject.put(f71496j, com.alipay.sdk.cons.a.f4817f);
            jSONObject.put(f71497k, this.f71502b);
            jSONObject.put(f71498l, this.f71501a);
            jSONObject.put(f71499m, System.currentTimeMillis());
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
