package com.switfpass.pay.thread;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class f {

    /* renamed from: f  reason: collision with root package name */
    public static final int f61804f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f61805g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f61806h = -2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f61807i = -3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f61808j = -4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f61809k = -5;

    /* renamed from: l  reason: collision with root package name */
    public static final int f61810l = -6;

    /* renamed from: m  reason: collision with root package name */
    public static final int f61811m = 460;

    /* renamed from: n  reason: collision with root package name */
    public static final int f61812n = 461;

    /* renamed from: o  reason: collision with root package name */
    public static final int f61813o = 462;

    /* renamed from: p  reason: collision with root package name */
    public static final int f61814p = 460;

    /* renamed from: q  reason: collision with root package name */
    public static Map f61815q;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f61816a;

    /* renamed from: b  reason: collision with root package name */
    public JSONArray f61817b;

    /* renamed from: c  reason: collision with root package name */
    public int f61818c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f61819d;

    /* renamed from: e  reason: collision with root package name */
    public Object f61820e;

    static {
        HashMap hashMap = new HashMap();
        f61815q = hashMap;
        hashMap.put(-1, "网络不可用");
        f61815q.put(-2, "发生未知错误");
        f61815q.put(-3, "网络繁忙，请稍候再试！");
        f61815q.put(-4, "读取数据超时");
        f61815q.put(-5, "网络连接错误");
        f61815q.put(-6, "验证数据失败");
        f61815q.put(460, "用户名已经存在");
        f61815q.put(Integer.valueOf((int) f61812n), "推荐人不存在");
        f61815q.put(Integer.valueOf((int) f61813o), "推荐人不能推荐了");
        f61815q.put(460, "应用不存在");
    }

    public static String a(int i4) {
        return (String) f61815q.get(Integer.valueOf(i4));
    }

    public static boolean d(int i4) {
        return i4 != 0;
    }

    public String b() {
        return !TextUtils.isEmpty(this.f61819d) ? this.f61819d : (String) f61815q.get(Integer.valueOf(this.f61818c));
    }

    public boolean c() {
        return (this.f61818c == 0 && TextUtils.isEmpty(this.f61819d)) ? false : true;
    }

    public boolean e() {
        return this.f61818c < 0;
    }

    public void f(String str) {
        this.f61819d = str;
    }
}
