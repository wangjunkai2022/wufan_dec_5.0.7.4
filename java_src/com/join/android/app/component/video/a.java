package com.join.android.app.component.video;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.g2;
import com.papa.gsyvideoplayer.video.base.GSYVideoPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: CustomManager.java */
/* loaded from: classes3.dex */
public class a extends com.papa.gsyvideoplayer.c {
    public static final int A = 2131297232;
    public static String B = "GSYVideoManager";
    private static Map<String, a> C = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    public static final int f15344z = 2131297233;

    public a() {
        P();
    }

    public static boolean c0(Context context, String str) {
        boolean z4 = false;
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (com.papa.gsyvideoplayer.utils.b.o(context) == null) {
            return false;
        }
        if (((ViewGroup) com.papa.gsyvideoplayer.utils.b.o(context).findViewById(16908290)).findViewById(R.id.custom_full_id) != null) {
            z4 = true;
            com.papa.gsyvideoplayer.utils.b.k(context);
            if (g2.h(str)) {
                return true;
            }
            if (e0(str).p() != null) {
                e0(str).p().onBackFullscreen();
            }
        }
        return z4;
    }

    public static void d0() {
        if (C.size() > 0) {
            for (Map.Entry<String, a> entry : C.entrySet()) {
                n0(entry.getKey());
            }
        }
        C.clear();
    }

    public static synchronized a e0(String str) {
        a aVar;
        synchronized (a.class) {
            if (!TextUtils.isEmpty(str)) {
                aVar = C.get(str);
                if (aVar == null) {
                    aVar = new a();
                    com.papa.gsyvideoplayer.model.c cVar = new com.papa.gsyvideoplayer.model.c(4, "enable-accurate-seek", 1);
                    com.papa.gsyvideoplayer.model.c cVar2 = new com.papa.gsyvideoplayer.model.c(1, "analyzeduration", 1);
                    com.papa.gsyvideoplayer.model.c cVar3 = new com.papa.gsyvideoplayer.model.c(1, "analyzemaxduration", 30);
                    new com.papa.gsyvideoplayer.model.c(2, "skip_loop_filter", 48);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(cVar);
                    arrayList.add(cVar2);
                    arrayList.add(cVar3);
                    aVar.X(arrayList);
                    C.put(str, aVar);
                }
            } else {
                throw new IllegalStateException("key not be empty");
            }
        }
        return aVar;
    }

    public static synchronized Map<String, a> f0() {
        Map<String, a> map;
        synchronized (a.class) {
            map = C;
        }
        return map;
    }

    public static boolean g0(Activity activity) {
        View findViewById = ((ViewGroup) com.papa.gsyvideoplayer.utils.b.o(activity).findViewById(16908290)).findViewById(R.id.custom_full_id);
        return (findViewById != null ? (GSYVideoPlayer) findViewById : null) != null;
    }

    public static void i0() {
        if (C.size() > 0) {
            for (Map.Entry<String, a> entry : C.entrySet()) {
                entry.getValue().h0(entry.getKey());
            }
        }
    }

    public static void l0() {
        if (C.size() > 0) {
            for (Map.Entry<String, a> entry : C.entrySet()) {
                entry.getValue().j0(entry.getKey());
            }
        }
    }

    public static void m0(boolean z4) {
        if (C.size() > 0) {
            for (Map.Entry<String, a> entry : C.entrySet()) {
                entry.getValue().k0(entry.getKey(), z4);
            }
        }
    }

    public static void n0(String str) {
        if (g2.h(str)) {
            return;
        }
        if (e0(str).w() != null) {
            e0(str).w().onCompletion();
        }
        e0(str).x();
    }

    public static void o0(String str) {
        C.remove(str);
    }

    @Override // com.papa.gsyvideoplayer.c
    protected com.papa.gsyvideoplayer.player.c M() {
        return new com.papa.gsyvideoplayer.player.d();
    }

    public void h0(String str) {
        if (g2.h(str) || e0(str).w() == null) {
            return;
        }
        e0(str).w().onVideoPause();
    }

    public void j0(String str) {
        if (g2.h(str) || e0(str).w() == null) {
            return;
        }
        e0(str).w().onVideoResume();
    }

    public void k0(String str, boolean z4) {
        if (g2.h(str) || e0(str).w() == null) {
            return;
        }
        e0(str).w().onVideoResume(z4);
    }
}
