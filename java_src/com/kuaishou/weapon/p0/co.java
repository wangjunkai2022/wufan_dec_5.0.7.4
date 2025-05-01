package com.kuaishou.weapon.p0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.join.mgps.Util.h0;
import com.kuaishou.weapon.p0.jni.Engine;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes5.dex */
public class co {

    /* renamed from: a  reason: collision with root package name */
    private Context f55451a;

    public co(Context context) {
        this.f55451a = context;
    }

    public String a(String str) {
        JSONObject a5;
        JSONObject a6;
        try {
            cm cmVar = new cm(str, ck.f55419l);
            String a7 = dl.a(cu.f55469a);
            String b5 = b(a7);
            if (TextUtils.isEmpty(b5) || (a5 = cmVar.a(this.f55451a)) == null) {
                return null;
            }
            String str2 = cu.f55476h + "?" + cv.a(this.f55451a);
            if (cu.a() && cu.f55469a.contains("api")) {
                str2 = "/api" + str2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, b5);
            jSONObject.put(com.alipay.sdk.cons.c.f4843f, a7);
            jSONObject.put("path", str2);
            String str3 = WeaponHI.cookieData;
            if (!TextUtils.isEmpty(str3) && str3.length() > 10) {
                jSONObject.put("cookie", str3);
            }
            jSONObject.put("head", a5);
            StringBuilder sb = new StringBuilder();
            sb.append("sdk=" + Build.VERSION.SDK_INT);
            jSONObject.put("parame", sb.toString());
            if (str.equals(ck.f55415h) && (a6 = a()) != null) {
                jSONObject.put("sjd", a6);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String hostAddress = InetAddress.getByName(dl.a(str)).getHostAddress();
            try {
                if (!TextUtils.isEmpty(hostAddress)) {
                    if (hostAddress.contains(h0.f27805a)) {
                        return hostAddress;
                    }
                }
                return "";
            } catch (UnknownHostException unused) {
                return hostAddress;
            }
        } catch (UnknownHostException unused2) {
            return "";
        }
    }

    private JSONObject a() {
        try {
            System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            h a5 = h.a(this.f55451a, "re_po_rt");
            a5.e("a1_p_s_p_s");
            a5.e("a1_p_s_p_s_c_b");
            aj ajVar = new aj(this.f55451a);
            jSONObject.put("0", ajVar.d());
            jSONObject.put("1", ajVar.a());
            jSONObject.put("2", ajVar.c());
            jSONObject.put("3", ajVar.f());
            jSONObject.put("24", ajVar.e());
            int i4 = 1;
            jSONObject.put("35", ab.b() ? 1 : 0);
            jSONObject.put("36", ab.a(this.f55451a) ? 1 : 0);
            JSONObject a6 = ai.a(this.f55451a);
            if (a6 != null) {
                jSONObject.put("4", a6);
            }
            a5.b(df.ac, 0);
            ac acVar = new ac();
            jSONObject.put("7", acVar.a() ? 1 : 0);
            boolean a7 = acVar.a(this.f55451a);
            jSONObject.put("8", a7 ? 1 : 0);
            if (a7) {
                jSONObject.put("61", acVar.b(this.f55451a));
            }
            jSONObject.put(com.join.mgps.Util.v.f28122v, acVar.e(this.f55451a));
            jSONObject.put("11", acVar.c(this.f55451a));
            ae aeVar = new ae();
            jSONObject.put("26", aeVar.a("cpuinfo") ? 1 : 0);
            jSONObject.put("27", aeVar.a("meminfo") ? 1 : 0);
            ao aoVar = new ao();
            jSONObject.put("65", aoVar.d() ? 1 : 0);
            boolean b5 = aoVar.b();
            jSONObject.put("66", b5 ? 1 : 0);
            if (b5) {
                jSONObject.put("67", aoVar.a() ? 1 : 0);
            }
            jSONObject.put("68", aoVar.f() ? 1 : 0);
            jSONObject.put("69", aoVar.e());
            jSONObject.put("101", aoVar.c() ? 1 : 0);
            jSONObject.put("102", aoVar.g() ? 1 : 0);
            jSONObject.put("99", new af().a());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("03007", bv.a(this.f55451a));
            jSONObject2.put("03014", bh.g(this.f55451a));
            jSONObject2.put("03020", bv.b(this.f55451a));
            jSONObject2.put("03030", bg.d(this.f55451a));
            jSONObject.put("51", jSONObject2);
            jSONObject.put("107", new an().d());
            if (!ab.b(this.f55451a)) {
                i4 = 0;
            }
            jSONObject.put("60", i4);
            try {
                jSONObject.put("11028", WeaponHI.sKSSdkver);
                jSONObject.put("11301", bh.c(com.kwad.sdk.e.b.Jd().Jc()));
                jSONObject.put("11302", bh.c(com.kwad.sdk.e.b.Jd().getSdkVersion()));
                jSONObject.put("11303", bh.c(com.kwad.sdk.e.b.Jd().getAppId()));
                jSONObject.put("11002", Engine.soVersion);
            } catch (Throwable unused) {
            }
            return jSONObject;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
