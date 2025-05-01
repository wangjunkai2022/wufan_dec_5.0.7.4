package com.aggmoread.sdk.z.c.a.a.d.b;

import android.os.Build;
import android.view.View;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.e.m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, Object[]> f3461a = new WeakHashMap<>();

    public static int a(String str) {
        int a5 = com.aggmoread.sdk.z.c.a.a.e.h.a().a(str, -1);
        com.aggmoread.sdk.z.c.a.a.e.h.a().a(str);
        return a5;
    }

    public static Map<Object, Object> a(d dVar) {
        Map map = (Map) com.aggmoread.sdk.z.c.a.a.b.f2733d[6];
        Map<Object, Object> map2 = (Map) map.get(dVar.f3258b);
        if (map2 == null) {
            HashMap hashMap = new HashMap();
            map.put(dVar.f3258b, hashMap);
            return hashMap;
        }
        return map2;
    }

    public static void a(View view, Object[] objArr) {
        Object[] objArr2 = f3461a.get(view);
        if (objArr2 != null) {
            objArr[2] = objArr2[2];
        }
        f3461a.put(view, objArr);
    }

    public static void a(d dVar, int i4) {
        a(dVar).put(dVar.f3258b, Integer.valueOf(i4));
    }

    public static void a(d dVar, e eVar) {
        a(dVar, eVar, false);
    }

    public static void a(d dVar, e eVar, boolean z4) {
        ((Map) com.aggmoread.sdk.z.c.a.a.b.f2733d[7]).put(eVar.f3309c.a(e.c.T, ""), new Object[]{new WeakReference(dVar.f3258b), dVar.f3259c, dVar.f3265i, Integer.valueOf(dVar.f3261e.a()), j.f3429q.getPackageName(), com.aggmoread.sdk.z.c.a.a.e.c.e(), com.aggmoread.sdk.z.c.a.a.e.c.q(), com.aggmoread.sdk.z.c.a.a.e.c.g(), Build.BRAND, Build.MODEL, Boolean.valueOf(com.aggmoread.sdk.z.c.a.a.e.c.B()), com.aggmoread.sdk.z.c.a.a.e.c.p(), Boolean.valueOf(z4)});
    }

    public static void a(Object obj, double d5, double d6, double d7, int i4, int i5, int i6, long j4, int i7) {
        com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{0, new WeakReference(obj), Double.valueOf(d5), Double.valueOf(d6), Double.valueOf(d7), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Long.valueOf(j4), Integer.valueOf(i7)}, j.f3429q);
    }

    public static void a(Object obj, long j4) {
        com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{3, new WeakReference(obj), Long.valueOf(j4)}, j.f3429q);
    }

    public static void a(Object obj, e eVar) {
        com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{10, new WeakReference(obj), Double.valueOf(m.d(eVar)), Double.valueOf(m.e(eVar))}, j.f3429q);
    }

    public static void a(Object obj, boolean z4, boolean z5) {
        com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{5, new WeakReference(obj), Boolean.valueOf(z4), Boolean.valueOf(z5)}, j.f3429q);
    }

    public static void a(Object obj, byte[] bArr) {
        com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{4, new WeakReference(obj), bArr}, j.f3429q);
    }

    public static void a(Object obj, int[] iArr) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMGTAG", "update saved point");
        com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{6, new WeakReference(obj), iArr}, j.f3429q);
    }

    public static void a(Object obj, Object[] objArr, com.aggmoread.sdk.z.c.a.a.c.i iVar, View view, View[] viewArr) {
        a(obj, objArr, iVar, view, viewArr, null, null);
    }

    public static void a(Object obj, Object[] objArr, com.aggmoread.sdk.z.c.a.a.c.i iVar, View view, View[] viewArr, WeakReference<View> weakReference, WeakReference weakReference2) {
        a(obj, objArr, iVar, view, viewArr, weakReference, weakReference2, null);
    }

    public static void a(Object obj, Object[] objArr, com.aggmoread.sdk.z.c.a.a.c.i iVar, View view, View[] viewArr, WeakReference<View> weakReference, WeakReference weakReference2, Object obj2) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        WeakReference[] weakReferenceArr = new WeakReference[viewArr.length];
        for (int i4 = 0; i4 < viewArr.length; i4++) {
            weakReferenceArr[i4] = new WeakReference(viewArr[i4]);
        }
        Object[] objArr2 = f3461a.get(view);
        if (objArr2 != null && (onAttachStateChangeListener = (View.OnAttachStateChangeListener) objArr2[3]) != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            objArr[2] = objArr2[2];
        }
        f3461a.put(view, objArr);
        com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{2, new WeakReference(obj), new WeakReference(objArr), new WeakReference(view), weakReferenceArr, Integer.valueOf(iVar.a()), weakReference, weakReference2, obj2}, j.f3429q);
    }

    public static void a(Object obj, Object[] objArr, com.aggmoread.sdk.z.c.a.a.c.i iVar, Object obj2) {
        boolean a5 = m.a(iVar);
        com.aggmoread.sdk.z.c.a.a.e.e.b("xxx", "register isAvailable " + a5);
        if (a5) {
            com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{7, new WeakReference(obj), new WeakReference(objArr), Integer.valueOf(iVar.a()), obj2}, j.f3429q);
        }
    }

    public static void a(Object[] objArr) {
        com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{9, new WeakReference(objArr)}, j.f3429q);
    }

    public static void a(Object[] objArr, int i4) {
        com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{8, new WeakReference(objArr), Integer.valueOf(i4)}, j.f3429q);
    }

    public static int b(d dVar) {
        Object obj = a(dVar).get(dVar.f3258b);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public static void b(Object obj, boolean z4, boolean z5) {
        com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{1, new WeakReference(obj), Boolean.valueOf(z4), Boolean.valueOf(z5)}, j.f3429q);
    }
}
