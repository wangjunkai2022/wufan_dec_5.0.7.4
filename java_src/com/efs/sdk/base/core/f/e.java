package com.efs.sdk.base.core.f;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class e implements com.efs.sdk.base.core.c.c {
    private static void a(HttpResponse httpResponse) {
        if (httpResponse == null || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        for (String str : httpResponse.data.split("`")) {
            String[] split = str.split(SimpleComparison.EQUAL_TO_OPERATION);
            if (split.length >= 2) {
                if (split[0].equalsIgnoreCase("retcode")) {
                    httpResponse.setBizCode(split[1]);
                } else {
                    ((Map) httpResponse.extra).put(split[0], split[1]);
                }
            }
        }
    }

    @Override // com.efs.sdk.base.core.c.c
    @NonNull
    public final HttpResponse a(com.efs.sdk.base.core.d.b bVar, boolean z4) {
        HttpResponse httpResponse;
        f fVar;
        try {
            fVar = f.a.f10411a;
            c cVar = fVar.f10407a;
            String valueOf = String.valueOf(System.currentTimeMillis());
            String a5 = com.efs.sdk.base.core.util.b.b.a(cVar.f10400b + cVar.f10401c + valueOf + "AppChk#2014");
            StringBuilder sb = new StringBuilder();
            String str = cVar.f10399a;
            if (str.startsWith(com.facebook.common.util.f.f10923a)) {
                sb.append(str);
                sb.append("?chk=");
            } else {
                sb.append(str);
                sb.append("?chk=");
            }
            sb.append(a5.substring(a5.length() - 8));
            sb.append("&vno=");
            sb.append(valueOf);
            sb.append("&uuid=");
            sb.append(cVar.f10401c);
            sb.append("&app=");
            sb.append(cVar.f10400b);
            sb.append("&zip=gzip");
            String sb2 = sb.toString();
            int i4 = 0;
            byte[] bArr = new byte[0];
            int i5 = bVar.f10380a.f10375c;
            if (i5 == 0) {
                bArr = bVar.f10382c;
                i4 = bArr.length;
            } else if (1 == i5) {
                bArr = com.efs.sdk.base.core.util.b.a(bVar.f10383d.getPath());
                i4 = bArr.length;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
            hashMap.put("Content-Length", String.valueOf(i4));
            com.efs.sdk.base.core.util.a.d a6 = new com.efs.sdk.base.core.util.a.d(sb2).a(hashMap);
            a6.f10431a.f10425c = bArr;
            httpResponse = a6.a().b();
            a(httpResponse);
        } catch (Throwable th) {
            httpResponse = 0 == 0 ? new HttpResponse() : null;
            Log.e("efs.wa.send", "get file size error", th);
        }
        if (httpResponse.succ) {
            Log.i("efs.base", "wa upload succ, " + httpResponse.toString());
            com.efs.sdk.base.core.util.b.b(bVar.f10383d);
            return httpResponse;
        }
        Log.i("efs.base", "wa upload fail, resp is " + httpResponse.toString());
        return httpResponse;
    }
}
