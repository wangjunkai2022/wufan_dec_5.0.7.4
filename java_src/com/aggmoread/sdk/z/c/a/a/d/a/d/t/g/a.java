package com.aggmoread.sdk.z.c.a.a.d.a.d.t.g;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.z.c.a.a.c.o.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.qq.e.ads.nativ.NativeUnifiedAD;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.ads.nativ.widget.NativeAdContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class a extends e {
    public a(NativeUnifiedADData nativeUnifiedADData, NativeUnifiedAD nativeUnifiedAD, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map, int i4) {
        super(nativeUnifiedADData, nativeUnifiedAD, dVar, eVar, map, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.e
    public View a(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, View view3, @NonNull e.a aVar) {
        String str;
        String str2;
        View view4 = view3;
        String str3 = e.f3122r;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str3, "esp enter v = " + view + ", r = " + view3);
        if (this.f3126o == 91) {
            a(new i(1001006001, "GDT ad blocked"));
            return null;
        }
        ArrayList arrayList = list == null ? new ArrayList() : list;
        if (view4 == null) {
            view4 = view;
        }
        if (arrayList.contains(view4)) {
            str = e.f3122r;
            str2 = "ovov + true";
        } else {
            str = e.f3122r;
            str2 = "ovov + false";
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, str2);
        if (m.a(this.f2799e) && !arrayList.contains(view4)) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(e.f3122r, "ovov ");
            arrayList.add(view4);
        }
        this.f2797c = aVar;
        if (view instanceof NativeAdContainer) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(e.f3122r, "esp nativ");
            l.a(view, this.f2804j);
            a(context, (NativeAdContainer) view, layoutParams, arrayList, (WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a>) null, aVar);
            View[] viewArr = view2 != null ? new View[]{view2} : new View[0];
            this.f3128q = new WeakReference<>(view);
            a(view, viewArr);
            com.aggmoread.sdk.z.c.a.a.e.e.b(e.f3122r, "exit");
            return view;
        }
        return null;
    }
}
