package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class u {
    public static void a(boolean z4) {
        try {
            x.a(z4);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
    }

    public static int b() {
        int d5 = x.d();
        if (d5 == 1) {
            return 1;
        }
        return d5 == 0 ? -1 : 0;
    }

    public static boolean c() {
        int b5 = b();
        if (b5 == 2 || b5 == 1) {
            return b.b();
        }
        return false;
    }

    public static boolean d() {
        int b5 = b();
        if (b5 == 2 || b5 == 1) {
            x.g();
            return true ^ b.a();
        }
        return true;
    }

    public static HashMap<String, Object> e() {
        final HashMap<String, Object>[] hashMapArr = {new HashMap<>()};
        DH.requester(MobSDK.getContext()).getCarrier().getDetailNetworkTypeForStatic().getMIUIVersion().getSignMD5().getODH().request(new DH.DHResponder() { // from class: com.mob.commons.u.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                hashMapArr[0] = u.a(dHResponse.getDetailNetworkTypeForStatic());
                hashMapArr[0].put(s.a("006%fidcehdd%fXdj"), Integer.valueOf(MobSDK.SDK_VERSION_CODE));
                hashMapArr[0].put(s.a("004Wdcdgdidc"), e.a((MobProduct) null));
                hashMapArr[0].put(s.a("006djjFdd_fNdj"), Integer.valueOf(DH.SyncMtd.getAppVersion()));
                hashMapArr[0].put(s.a("007cd9djdjdiPf]dj"), dHResponse.getCarrier());
                hashMapArr[0].put(s.a("005>dfdkdcEfg"), DH.SyncMtd.getModel());
                hashMapArr[0].put(s.a("0073ef8dci dkdjec"), DH.SyncMtd.getManufacturer());
                hashMapArr[0].put(s.a("006'fiecfidd f5dj"), DH.SyncMtd.getOSVersionName());
                hashMapArr[0].put(s.a("005Wdgdidd+fXdj"), dHResponse.getMIUIVersion());
                hashMapArr[0].put(s.a("009SfiecfiddOf;djdi'ei"), Integer.valueOf(DH.SyncMtd.getOSVersionInt()));
                hashMapArr[0].put(s.a("010cg+di=fei@fcdidfYf"), Long.valueOf(System.currentTimeMillis()));
                hashMapArr[0].put(s.a("006djj-dfdchi"), dHResponse.getSignMD5());
                hashMapArr[0].put(s.a("005:ffdj-deBdc"), DH.SyncMtd.getBrand());
                hashMapArr[0].put("usridt", aa.c());
                hashMapArr[0].put(s.a("004<dfdkdidc"), dHResponse.getODH());
            }
        });
        return hashMapArr[0];
    }

    public static String a() {
        if (TextUtils.isEmpty(C0811r.f56456a) && MobSDK.getContext() != null) {
            C0811r.a(MobSDK.getContext());
        }
        if (TextUtils.isEmpty(C0811r.f56456a)) {
            return C0811r.f56458c;
        }
        return C0811r.f56456a;
    }

    public static HashMap<String, Object> a(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(s.a("006djj-eh)fHec"), a());
        hashMap.put(s.a("006djjjQehej"), DH.SyncMtd.getPackageName());
        hashMap.put(s.a("006djjGdd;fXdj"), DH.SyncMtd.getAppVersionName());
        hashMap.put(s.a("004jgdi"), String.valueOf(DH.SyncMtd.getPlatformCode()));
        hashMap.put(s.a("011efi[fgdkdjehVi$ec_jf"), str);
        String b5 = e.b();
        if (!TextUtils.isEmpty(b5)) {
            hashMap.put(s.a("004Mdcdgdidc"), b5);
        }
        return hashMap;
    }

    public static String a(String str, String str2, String str3, boolean z4) {
        if (d()) {
            MobLog.getInstance().d("isForb: true", new Object[0]);
            return null;
        }
        return i.a().a(str, str2, str3, z4);
    }
}
