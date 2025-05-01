package com.sina.weibo.sdk.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.sina.weibo.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: com.sina.weibo.sdk.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0605a {
        public int ah;
        public String packageName = BuildConfig.APPLICATION_ID;
        public String ag = "com.sina.weibo.SSOActivity";
    }

    public static boolean a(Context context, Intent intent) {
        PackageManager packageManager;
        ResolveInfo resolveActivity;
        if (context == null || (packageManager = context.getPackageManager()) == null || (resolveActivity = packageManager.resolveActivity(intent, 0)) == null) {
            return false;
        }
        try {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveActivity.activityInfo.packageName, 64).signatures;
            if (signatureArr == null) {
                return false;
            }
            for (Signature signature : signatureArr) {
                if ("18da2bf10352443a00a5e046d9fca6bd".equals(d.a(signature.toByteArray()))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static C0605a c(Context context) {
        return e(context);
    }

    public static boolean d(Context context) {
        C0605a e5 = e(context);
        return e5 != null && e5.ah >= 10791;
    }

    public static C0605a e(Context context) {
        List<ResolveInfo> queryIntentServices;
        C0605a a5;
        String[] strArr = {BuildConfig.APPLICATION_ID, "com.sina.weibog3"};
        for (int i4 = 0; i4 < 2; i4++) {
            String str = strArr[i4];
            Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
            intent.setPackage(str);
            intent.addCategory("android.intent.category.DEFAULT");
            if (context != null && (queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) != null && !queryIntentServices.isEmpty()) {
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && serviceInfo.applicationInfo != null && !TextUtils.isEmpty(serviceInfo.packageName)) {
                        String str2 = resolveInfo.serviceInfo.packageName;
                        if (TextUtils.equals(str, str2) && (a5 = a(context, str2)) != null) {
                            return a5;
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    private static C0605a a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream open = context.createPackageContext(str, 2).getAssets().open("weibo_for_sdk.json");
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = open.read(bArr, 0, 4096);
                if (read != -1) {
                    sb.append(new String(bArr, 0, read));
                } else {
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    C0605a c0605a = new C0605a();
                    c0605a.ah = jSONObject.optInt("support_api", -1);
                    c0605a.ag = jSONObject.optString("authActivityName", null);
                    c0605a.packageName = str;
                    return c0605a;
                }
            }
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return null;
        } catch (IOException e6) {
            e6.printStackTrace();
            return null;
        } catch (JSONException e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
