package com.umeng.ccg;

import java.util.HashMap;
import java.util.Map;
/* compiled from: CcgSwitch.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f64028a = true;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f64029b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f64030c = true;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f64031d = true;

    /* renamed from: f  reason: collision with root package name */
    private static Map<String, Boolean> f64033f = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static Object f64032e = new Object();

    public static boolean a() {
        boolean z4;
        synchronized (f64032e) {
            z4 = f64028a;
        }
        return z4;
    }

    public static boolean b() {
        boolean z4;
        synchronized (f64032e) {
            z4 = f64029b;
        }
        return z4;
    }

    public static boolean c() {
        boolean z4;
        synchronized (f64032e) {
            z4 = f64030c;
        }
        return z4;
    }

    public static boolean d() {
        boolean z4;
        synchronized (f64032e) {
            z4 = f64031d;
        }
        return z4;
    }

    public static void a(boolean z4) {
        synchronized (f64032e) {
            f64031d = z4;
            f64033f.put(a.f64012e, Boolean.valueOf(z4));
        }
    }

    public static boolean a(String str) {
        boolean booleanValue;
        synchronized (f64032e) {
            booleanValue = f64033f.containsKey(str) ? f64033f.get(str).booleanValue() : true;
        }
        return booleanValue;
    }
}
