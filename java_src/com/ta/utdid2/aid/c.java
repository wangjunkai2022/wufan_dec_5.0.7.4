package com.ta.utdid2.aid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.ta.utdid2.android.utils.d;
import com.ta.utdid2.android.utils.h;
import com.ta.utdid2.android.utils.i;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f62018a = "com.ta.utdid2.aid.c";

    /* renamed from: b  reason: collision with root package name */
    private static final String f62019b = "OfJbkLdFbPOMbGyP";

    /* renamed from: c  reason: collision with root package name */
    private static final String f62020c = "EvQwnbilKezpOJey";

    /* renamed from: d  reason: collision with root package name */
    private static final String f62021d = "rKrMJgyAEbVtSQGi";

    /* renamed from: e  reason: collision with root package name */
    private static Map<String, String> f62022e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static Map<String, Long> f62023f = new ConcurrentHashMap();

    public static long a(Context context, String str, String str2) {
        if (context == null) {
            return 0L;
        }
        String c5 = c(str, str2);
        Long valueOf = Long.valueOf(f62023f.containsKey(c5) ? f62023f.get(c5).longValue() : 0L);
        if (d.f62050b) {
            new StringBuilder("cache AIDGenTime:").append(valueOf);
        }
        if (valueOf.longValue() == 0) {
            valueOf = Long.valueOf(context.getSharedPreferences(f62019b, 0).getLong(f62021d.concat(c5), 0L));
            f62023f.put(c5, valueOf);
        }
        return valueOf.longValue();
    }

    public static String b(Context context, String str, String str2) {
        if (context == null) {
            return "";
        }
        String c5 = c(str, str2);
        String str3 = f62022e.get(c5);
        if (d.f62050b) {
            new StringBuilder("cache AID:").append(str3);
        }
        if (i.c(str3)) {
            String string = context.getSharedPreferences(f62019b, 0).getString(f62020c.concat(c5), "");
            f62022e.put(c5, string);
            return string;
        }
        return str3;
    }

    private static String c(String str, String str2) {
        String f5;
        if (Build.VERSION.SDK_INT >= 8) {
            f5 = com.ta.utdid2.android.utils.c.a(str.concat(str2).getBytes(), 2);
        } else {
            f5 = com.ta.utdid2.android.utils.b.f(str.concat(str2).getBytes(), 2);
        }
        if (d.f62050b) {
            new StringBuilder("encodedName:").append(f5);
        }
        return f5;
    }

    public static void d(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        String c5 = c(str, str3);
        long currentTimeMillis = System.currentTimeMillis();
        f62022e.put(c5, str2);
        f62023f.put(c5, Long.valueOf(currentTimeMillis));
        SharedPreferences sharedPreferences = context.getSharedPreferences(f62019b, 0);
        if (Build.VERSION.SDK_INT >= 9) {
            h.a(sharedPreferences.edit().putString(f62020c.concat(c5), str2));
            h.a(sharedPreferences.edit().putLong(f62021d.concat(c5), currentTimeMillis));
            return;
        }
        sharedPreferences.edit().putString(f62020c.concat(c5), str2).commit();
        sharedPreferences.edit().putLong(f62021d.concat(c5), currentTimeMillis).commit();
    }
}
