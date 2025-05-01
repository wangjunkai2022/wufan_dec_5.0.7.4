package com.aggmoread.sdk.z.a.m;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public class g implements k {

    /* renamed from: b  reason: collision with root package name */
    static final String f2324b = "g";

    /* renamed from: a  reason: collision with root package name */
    h f2325a;

    public g(Context context) {
        this.f2325a = h.a(context, "CacheSpSimple");
    }

    private String b(String str) {
        return str + "_savetime";
    }

    private long[] c(String str) {
        String[] split;
        String a5 = this.f2325a.a(b(str), "");
        if (!TextUtils.isEmpty(a5) && a5.contains("_") && (split = a5.split("_")) != null && split.length != 0) {
            String str2 = split[0];
            String str3 = split[1];
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                return new long[]{Long.valueOf(str2).longValue(), Long.valueOf(str3).longValue()};
            }
        }
        return null;
    }

    @Override // com.aggmoread.sdk.z.a.m.k
    public String a(String str) {
        long[] c5 = c(str);
        String str2 = f2324b;
        com.aggmoread.sdk.z.a.d.c(str2, "getAsString enter , key = " + str);
        if (c5 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = c5[0];
            long j5 = currentTimeMillis - c5[1];
            com.aggmoread.sdk.z.a.d.c(str2, str + " , saveSenconds = " + j4 + " , diff = " + j5);
            if (j5 > j4 * 1000) {
                com.aggmoread.sdk.z.a.d.c(str2, "cache expire(" + str + ")");
                d(str);
                return null;
            }
            com.aggmoread.sdk.z.a.d.c(str2, "cache hit(" + str + ")");
        }
        return this.f2325a.a(str, (String) null);
    }

    @Override // com.aggmoread.sdk.z.a.m.k
    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = f2324b;
        com.aggmoread.sdk.z.a.d.c(str3, "put enter , key = " + str);
        this.f2325a.b(str, str2);
    }

    public boolean d(String str) {
        this.f2325a.a(str);
        this.f2325a.a(b(str));
        return true;
    }
}
