package com.sdk.v;

import android.content.Context;
import com.sdk.f.g;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f60104a;

    /* renamed from: b  reason: collision with root package name */
    public static String f60105b;

    /* renamed from: c  reason: collision with root package name */
    public static String f60106c;

    /* renamed from: d  reason: collision with root package name */
    public static int f60107d;

    /* renamed from: e  reason: collision with root package name */
    public static String f60108e;

    static {
        boolean z4 = g.f60051b;
    }

    public a(Context context) {
    }

    public static a a(Context context) {
        if (f60104a == null) {
            synchronized (a.class) {
                f60104a = new a(context);
            }
        }
        return f60104a;
    }

    public static String a() {
        return f60108e;
    }

    public void a(String str, String str2) {
        f60105b = str2;
        f60106c = str;
        f60107d = 0;
        f60108e = "B";
    }
}
