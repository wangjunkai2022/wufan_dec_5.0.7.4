package com.alipay.apmobilesecuritysdk.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alipay.apmobilesecuritysdk.e.e;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private File f4639a;

    /* renamed from: b  reason: collision with root package name */
    private com.alipay.security.mobile.module.a.c.a f4640b;

    public b(String str, com.alipay.security.mobile.module.a.c.a aVar) {
        this.f4639a = null;
        this.f4640b = null;
        this.f4639a = new File(str);
        this.f4640b = aVar;
    }

    private static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private void c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
        boolean z4 = true;
        z4 = (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) ? false : false;
        boolean b5 = e.b(context);
        if (z4 && b5) {
            new Thread(new c(this)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        File file = this.f4639a;
        if (file == null) {
            return;
        }
        if (file.exists() && this.f4639a.isDirectory() && this.f4639a.list().length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f4639a.list()) {
                arrayList.add(str);
            }
            Collections.sort(arrayList);
            String str2 = (String) arrayList.get(arrayList.size() - 1);
            int size = arrayList.size();
            if (str2.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log")) {
                if (arrayList.size() < 2) {
                    return;
                }
                str2 = (String) arrayList.get(arrayList.size() - 2);
                size--;
            }
            if (!this.f4640b.a(a(com.alipay.security.mobile.module.commonutils.c.a(this.f4639a.getAbsolutePath(), str2)))) {
                size--;
            }
            for (int i4 = 0; i4 < size; i4++) {
                new File(this.f4639a, (String) arrayList.get(i4)).delete();
            }
        }
    }
}
