package com.cmic.sso.sdk.d;

import android.text.TextUtils;
import com.cmic.sso.sdk.e.o;
import java.util.HashMap;
/* compiled from: EventUtils.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static C0238a<String, String> f9288a = new C0238a<>();

    /* compiled from: EventUtils.java */
    /* renamed from: com.cmic.sso.sdk.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class C0238a<K, V> extends HashMap<K, V> {
        private C0238a() {
        }
    }

    public static void a(String str) {
        try {
            String str2 = f9288a.get(str);
            f9288a.put(str, String.valueOf((TextUtils.isEmpty(str2) ? 0 : Integer.parseInt(str2)) + 1));
            C0238a<String, String> c0238a = f9288a;
            c0238a.put(str + "Time", o.a());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void a(String str, String str2) {
        f9288a.put(str, str2);
    }
}
