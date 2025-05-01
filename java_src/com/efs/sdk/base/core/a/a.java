package com.efs.sdk.base.core.a;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile long f10267b = -1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10268a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0243a {

        /* renamed from: a  reason: collision with root package name */
        private static final a f10269a = new a((byte) 0);
    }

    /* synthetic */ a(byte b5) {
        this();
    }

    public static a a() {
        return C0243a.f10269a;
    }

    public static long b() {
        if (f10267b == -1) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + f10267b;
    }

    private a() {
        this.f10268a = true;
    }

    @NonNull
    public final HttpResponse a(String str, c cVar, File file, boolean z4) {
        String b5 = cVar.b();
        String a5 = a(str, cVar);
        if (this.f10268a) {
            Log.i("efs.px.api", "Upload file, url is ".concat(String.valueOf(a5)));
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("wpk-header", b5);
        com.efs.sdk.base.core.util.a.d a6 = new com.efs.sdk.base.core.util.a.d(a5).a(hashMap);
        a6.f10431a.f10426d = file;
        com.efs.sdk.base.core.util.a.d a7 = a6.a("type", cVar.f10278h);
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f10283m);
        return a7.a("size", sb.toString()).a("flow_limit", Boolean.toString(z4)).a(d.a()).a().b();
    }

    public static String a(@NonNull String str, @NonNull c cVar) {
        byte b5 = cVar.f10277g;
        String str2 = b5 != 1 ? b5 != 2 ? b5 != 3 ? "/api/v1/raw/upload" : "/api/v1/mix/upload" : "/perf_upload" : "/apm_logs";
        return str + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@Nullable HttpResponse httpResponse) {
        if (httpResponse == null || !httpResponse.succ || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(httpResponse.data);
            String optString = jSONObject.optString("code", "-1");
            httpResponse.setBizCode(optString);
            if (!"0".equals(optString)) {
                httpResponse.succ = false;
            }
            if (jSONObject.has("cver")) {
                ((Map) httpResponse.extra).put("cver", jSONObject.getString("cver"));
            }
            long j4 = jSONObject.getLong("stm") * 1000;
            if (Math.abs(j4 - b()) > 1500000) {
                f10267b = j4 - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            Log.e("efs.px.api", "checkPxReturn error", th);
        }
    }
}
