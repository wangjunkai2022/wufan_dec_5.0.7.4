package com.aggmoread.sdk.z.c.a.a.d.a.d.u.f;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.z.c.a.a.c.o.e;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.kwad.sdk.api.KsNativeAd;
import com.qq.e.ads.nativ.widget.NativeAdContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class a extends d {
    public a(KsNativeAd ksNativeAd, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(ksNativeAd, dVar, eVar, map);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.f.d
    public View a(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, View view3, @NonNull e.a aVar) {
        String str;
        String str2;
        String str3 = d.f3188q;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str3, "esp enter v = " + view + ", r = " + view3);
        if (list == null) {
            list = new ArrayList<>();
        }
        List<View> list2 = list;
        if (view3 == null) {
            view3 = view;
        }
        if (list2.contains(view3)) {
            str = d.f3188q;
            str2 = "ovov + true";
        } else {
            str = d.f3188q;
            str2 = "ovov + false";
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, str2);
        if (m.a(this.f2799e) && !list2.contains(view3)) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.f3188q, "ovov ");
            list2.add(view3);
        }
        this.f2797c = aVar;
        if (view instanceof NativeAdContainer) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.f3188q, "esp nativ");
            l.a(view, this.f2804j);
            a(context, (NativeAdContainer) view, layoutParams, list2, (WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a>) null, aVar);
            View[] viewArr = view2 != null ? new View[]{view2} : new View[0];
            this.f3193p = new WeakReference<>(view);
            a(view, viewArr);
            com.aggmoread.sdk.z.c.a.a.e.e.b(d.f3188q, "exit");
            return view;
        }
        return null;
    }
}
