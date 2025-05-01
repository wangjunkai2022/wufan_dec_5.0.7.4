package com.kwad.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.kwad.sdk.i;
import com.kwad.sdk.service.ServiceProvider;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public final class x {
    private static AtomicInteger aQj = new AtomicInteger(0);
    private static volatile boolean aQk = false;
    private static volatile boolean aQl;

    private static int Ma() {
        com.kwad.sdk.service.a.h hVar = (com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class);
        if (hVar == null) {
            com.kwad.sdk.core.e.c.w("Ks_UnionHelper", "sdkConfigProvider == null");
            return 0;
        }
        int zt = hVar.zt();
        com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "config mode:" + zt);
        return zt;
    }

    private static void Mb() {
        if (aQk) {
            return;
        }
        aQj.set(Me());
        aQl = bg.m("kssdk_kv_mode", "downgrade", false);
        aQk = true;
    }

    public static void Mc() {
        if (Mf() || Ma() == 0) {
            return;
        }
        g.execute(new az() { // from class: com.kwad.sdk.utils.x.3
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                com.kwad.sdk.utils.b.a Md = x.Md();
                if (Md == null) {
                    return;
                }
                x.c(Md);
                com.kwad.sdk.utils.b.b bVar = (com.kwad.sdk.utils.b.b) ServiceProvider.get(com.kwad.sdk.utils.b.b.class);
                if (bVar != null) {
                    bVar.a(Md);
                }
            }
        });
    }

    @WorkerThread
    public static com.kwad.sdk.utils.b.a Md() {
        Map<String, ?> all;
        com.kwad.sdk.utils.b.a aVar = new com.kwad.sdk.utils.b.a();
        SharedPreferences gY = bg.gY("ksadsdk_kv_perf");
        if (gY == null) {
            return null;
        }
        try {
            all = gY.getAll();
        } catch (Throwable unused) {
        }
        if (all == null) {
            return null;
        }
        int i4 = 0;
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            i4 += ((Integer) entry.getValue()).intValue();
        }
        aVar.aTq = i4;
        SharedPreferences.Editor edit = gY.edit();
        for (Map.Entry<String, ?> entry2 : all.entrySet()) {
            edit.putInt(entry2.getKey(), 0);
        }
        edit.apply();
        d(aVar);
        e(aVar);
        return aVar;
    }

    private static int Me() {
        int b5 = bg.b("kssdk_kv_mode", "mode", 0);
        com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "local mode:" + b5);
        return b5;
    }

    public static boolean Mf() {
        Mb();
        return aQj.get() == 0;
    }

    private static boolean Mg() {
        return Build.VERSION.SDK_INT > 23;
    }

    private static int Mh() {
        Mb();
        int Ma = (aQl || !Mg()) ? 0 : Ma();
        com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "targetMode:" + Ma);
        return Ma;
    }

    public static void Mi() {
        Mb();
        int i4 = aQj.get();
        int Mh = Mh();
        boolean z4 = i4 != Mh;
        com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "needTransfer:" + z4);
        if (z4) {
            transfer(Mh);
        }
    }

    private static void Mj() {
        g.execute(new az() { // from class: com.kwad.sdk.utils.x.4
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                Context context;
                try {
                    context = y.getContext();
                } catch (Exception e5) {
                    com.kwad.sdk.core.e.c.e("Ks_UnionHelper", Log.getStackTraceString(e5));
                }
                if (context == null) {
                    return;
                }
                for (String str : i.a.alC) {
                    x.R(context, str);
                }
                x.dZ(0);
                x.aQj.set(0);
            }
        });
    }

    private static void Mk() {
        com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "transferToKv");
        g.execute(new az() { // from class: com.kwad.sdk.utils.x.5
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                try {
                    Context context = y.getContext();
                    if (context != null) {
                        for (String str : i.a.alC) {
                            x.Q(context, str);
                        }
                        x.dZ(1);
                        x.aQj.set(1);
                    }
                } catch (Exception e5) {
                    com.kwad.sdk.core.e.c.e("Ks_UnionHelper", Log.getStackTraceString(e5));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(Context context, String str) {
        SharedPreferences gY;
        com.kwad.sdk.utils.a.c av = com.kwad.sdk.utils.a.e.av(context, str);
        if ("ksadsdk_splash_preload_id_list".equals(str) && (gY = bg.gY(str)) == null) {
            SharedPreferences.Editor edit = gY.edit();
            if (edit != null) {
                edit.remove("kv_to_sp_transfer_flag").remove("sp_to_kv_transfer_flag").apply();
            }
        } else if (av.contains("sp_to_kv_transfer_flag")) {
        } else {
            SharedPreferences gY2 = bg.gY(str);
            if (gY2 == null) {
                av.putBoolean("sp_to_kv_transfer_flag", true);
                return;
            }
            av.putAll(gY2.getAll());
            av.putBoolean("sp_to_kv_transfer_flag", true);
            bg.aw(str, "kv_to_sp_transfer_flag");
            a(str, av);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void R(Context context, String str) {
        SharedPreferences gY = bg.gY(str);
        if (gY == null) {
            return;
        }
        if ("ksadsdk_splash_preload_id_list".equals(str)) {
            SharedPreferences.Editor edit = gY.edit();
            if (edit != null) {
                edit.remove("kv_to_sp_transfer_flag").remove("sp_to_kv_transfer_flag").apply();
            }
        } else if (gY.contains("kv_to_sp_transfer_flag")) {
        } else {
            com.kwad.sdk.utils.a.c av = com.kwad.sdk.utils.a.e.av(context, str);
            Map<String, Object> all = av.getAll();
            if (all.isEmpty()) {
                bg.l(str, "kv_to_sp_transfer_flag", true);
                return;
            }
            bg.a(str, all);
            bg.l(str, "kv_to_sp_transfer_flag", true);
            av.remove("sp_to_kv_transfer_flag");
            av.release();
        }
    }

    private static void a(String str, com.kwad.sdk.utils.a.c cVar) {
        if (i.a.alD.contains(str)) {
            return;
        }
        cVar.release();
    }

    @WorkerThread
    public static void ar(final String str, final String str2) {
        g.execute(new az() { // from class: com.kwad.sdk.utils.x.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                int b5 = bg.b("ksadsdk_kv_perf", str, 0);
                if (TextUtils.isEmpty(str2)) {
                    bg.aw("ksadsdk_kv_perf", str);
                    return;
                }
                bg.a("ksadsdk_kv_perf", str, b5 + 1);
            }
        });
    }

    public static void as(final String str, final String str2) {
        g.execute(new az() { // from class: com.kwad.sdk.utils.x.2
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                SharedPreferences gY = bg.gY("ksadsdk_kv_perf");
                if (gY != null && gY.contains(str)) {
                    if (TextUtils.isEmpty(str2)) {
                        bg.a("ksadsdk_kv_perf_failed", str, bg.b("ksadsdk_kv_perf_failed", str, 0) + 1);
                        return;
                    }
                    bg.a("ksadsdk_kv_perf_success", str, bg.b("ksadsdk_kv_perf_success", str, 0) + 1);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(@NonNull com.kwad.sdk.utils.b.a aVar) {
        int i4 = aVar.aTr;
        double d5 = i4;
        double d6 = i4 + aVar.aTs;
        Double.isNaN(d5);
        Double.isNaN(d6);
        if (d5 / d6 > 0.10000000149011612d) {
            aQl = true;
            com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "need downgrade");
            bg.l("kssdk_kv_mode", "downgrade", true);
        }
        if (aQl) {
            Mi();
        }
    }

    private static void d(com.kwad.sdk.utils.b.a aVar) {
        SharedPreferences gY = bg.gY("ksadsdk_kv_perf_failed");
        int i4 = 0;
        if (gY != null) {
            Map<String, ?> all = gY.getAll();
            if (all != null) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    i4 += ((Integer) entry.getValue()).intValue();
                }
            }
            aVar.aTr = i4;
            SharedPreferences.Editor edit = gY.edit();
            edit.clear();
            edit.apply();
            return;
        }
        aVar.aTr = 0;
    }

    static void dZ(int i4) {
        bg.a("kssdk_kv_mode", "mode", i4);
    }

    private static void e(com.kwad.sdk.utils.b.a aVar) {
        SharedPreferences gY = bg.gY("ksadsdk_kv_perf_success");
        int i4 = 0;
        if (gY != null) {
            Map<String, ?> all = gY.getAll();
            if (all != null) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    i4 += ((Integer) entry.getValue()).intValue();
                }
            }
            aVar.aTs = i4;
            SharedPreferences.Editor edit = gY.edit();
            edit.clear();
            edit.apply();
            return;
        }
        aVar.aTs = 0;
    }

    private static void transfer(int i4) {
        if (i4 == 0) {
            Mj();
        } else if (i4 == 1) {
            Mk();
        }
    }
}
