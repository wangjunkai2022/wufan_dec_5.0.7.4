package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class bw {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f55360d = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private Context f55361a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55362b;

    /* renamed from: c  reason: collision with root package name */
    private int f55363c;

    public bw(Context context, int i4, boolean z4) {
        this.f55361a = context;
        this.f55362b = z4;
        this.f55363c = i4;
    }

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            h a5 = h.a(this.f55361a, "re_po_rt");
            boolean e5 = a5.e("a1_p_s_p_s");
            boolean e6 = a5.e("a1_p_s_p_s_c_b");
            jSONObject.put("11006", e5 ? 1 : 0);
            jSONObject.put("11029", e6 ? 1 : 0);
            if (a5.b(df.au, 1) == 1 && (e5 || e6)) {
                String a6 = bh.a(this.f55361a);
                if (!TextUtils.isEmpty(a6) && !a6.startsWith("RISK")) {
                    jSONObject.put("01001", f.a(a6));
                }
                String c5 = bh.c(this.f55361a);
                if (!TextUtils.isEmpty(c5) && !c5.startsWith("RISK")) {
                    jSONObject.put("01003", c5);
                }
                String b5 = bh.b(this.f55361a, 0);
                if (!TextUtils.isEmpty(b5) && !b5.startsWith("RISK")) {
                    jSONObject.put("01019", b5);
                }
                String b6 = bh.b(this.f55361a, 1);
                if (!TextUtils.isEmpty(b6) && !b6.startsWith("RISK")) {
                    jSONObject.put("01004", f.a(b6));
                }
            }
            int b7 = a5.b(df.at, 1);
            if (b7 == 1 && (e5 || e6)) {
                String f5 = bh.f(this.f55361a);
                if (!TextUtils.isEmpty(f5) && !f5.startsWith("RISK")) {
                    jSONObject.put("01013", f5);
                }
            }
            if (a5.b(df.av, 1) == 1 && (e5 || e6)) {
                String d5 = bh.d(this.f55361a);
                if (!TextUtils.isEmpty(d5) && !d5.startsWith("RISK")) {
                    jSONObject.put("01007", d5);
                }
            }
            if (a5.b(df.aw, 1) == 1 && (e5 || e6)) {
                jSONObject.put("01011", bh.e(this.f55361a));
            }
            if (e5 || e6) {
                String h4 = bh.h();
                if (!TextUtils.isEmpty(h4) && !h4.startsWith("RISK")) {
                    jSONObject.put("07005", h4);
                } else if (h4 == null) {
                    jSONObject.put("07005", "");
                } else {
                    jSONObject.put("07005", h4);
                }
                jSONObject.put("07006", bh.g());
            }
            if (a5.b(df.ay, 1) == 1 && (e5 || e6)) {
                String p4 = bh.p(this.f55361a);
                if (!TextUtils.isEmpty(p4) && !p4.startsWith("RISK")) {
                    jSONObject.put("01016", p4);
                }
            }
            if (e5 || e6) {
                try {
                    double b8 = bh.b();
                    if (b8 > 0.0d) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(b8);
                        jSONObject.put("09002", sb.toString());
                    }
                    double c6 = bh.c();
                    if (c6 > 0.0d) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c6);
                        jSONObject.put("09003", sb2.toString());
                    }
                } catch (Exception unused) {
                }
            }
            jSONObject.put("11013", Integer.parseInt(bx.a(this.f55361a.getApplicationContext()), 2));
            jSONObject.put("11012", bx.b(this.f55361a));
            try {
                jSONObject.put("11202", bh.b(com.kwad.sdk.e.b.Jd().IS()));
                jSONObject.put("11204", bh.b(com.kwad.sdk.e.b.Jd().IZ()));
                jSONObject.put("11205", bh.b(com.kwad.sdk.e.b.Jd().getDeviceId()));
                jSONObject.put("11206", bh.b(com.kwad.sdk.e.b.Jd().getIccId()));
                jSONObject.put("11207", bh.b(com.kwad.sdk.e.b.Jd().IR()));
                jSONObject.put("11208", bh.b(com.kwad.sdk.e.b.Jd().IU()));
                jSONObject.put("11209", bh.b(com.kwad.sdk.e.b.Jd().IV()));
                jSONObject.put("11210", bh.b(com.kwad.sdk.e.b.Jd().IW()));
                jSONObject.put("11211", bh.b(com.kwad.sdk.e.b.Jd().getIp()));
                jSONObject.put("11212", bh.b(com.kwad.sdk.e.b.Jd().getLocation()));
                jSONObject.put("11213", bh.b(com.kwad.sdk.e.b.Jd().getOaid()));
                jSONObject.put("11214", bh.b(com.kwad.sdk.e.b.Jd().IT()));
                jSONObject.put("11215", bh.b(com.kwad.sdk.e.b.Jd().IY()));
                jSONObject.put("11216", bh.b(com.kwad.sdk.e.b.Jd().IX()));
                jSONObject.put("11301", bh.c(com.kwad.sdk.e.b.Jd().Jc()));
                jSONObject.put("11302", bh.c(com.kwad.sdk.e.b.Jd().getSdkVersion()));
                jSONObject.put("11303", bh.c(com.kwad.sdk.e.b.Jd().getAppId()));
                jSONObject.put("11104", com.kwad.sdk.e.b.Jd().IZ());
                jSONObject.put("11105", com.kwad.sdk.e.b.Jd().getDeviceId());
                jSONObject.put("11106", com.kwad.sdk.e.b.Jd().getIccId());
                jSONObject.put("11107", com.kwad.sdk.e.b.Jd().IR());
                jSONObject.put("11108", com.kwad.sdk.e.b.Jd().IU());
                jSONObject.put("11109", com.kwad.sdk.e.b.Jd().IV());
                jSONObject.put("11110", com.kwad.sdk.e.b.Jd().IW());
                jSONObject.put("11111", com.kwad.sdk.e.b.Jd().getIp());
                jSONObject.put("11112", com.kwad.sdk.e.b.Jd().getLocation());
                jSONObject.put("11113", com.kwad.sdk.e.b.Jd().getOaid());
                jSONObject.put("11114", com.kwad.sdk.e.b.Jd().IT());
                jSONObject.put("11115", com.kwad.sdk.e.b.Jd().IY());
                jSONObject.put("11116", com.kwad.sdk.e.b.Jd().IX());
            } catch (Throwable unused2) {
            }
            String w4 = bh.w(this.f55361a);
            if (!TextUtils.isEmpty(w4)) {
                jSONObject.put("01026", w4);
            }
            if (b7 == 1) {
                try {
                    JSONObject a7 = ai.a(this.f55361a);
                    if (a7 != null) {
                        jSONObject.put("11015", a7);
                    }
                    if (Engine.loadSuccess) {
                        ce ceVar = new ce(this.f55361a);
                        jSONObject.put("02001", ceVar.a("02001") != null ? ceVar.a("02001") : bl.a());
                        jSONObject.put("02002", ceVar.a("02002") != null ? ceVar.a("02002") : bl.b());
                        jSONObject.put("02003", ceVar.a("02003") != null ? ceVar.a("02003") : bl.c());
                        jSONObject.put("02007", ceVar.a("02007") != null ? ceVar.a("02007") : bl.g());
                        jSONObject.put("02006", ceVar.a("02006") != null ? ceVar.a("02006") : bl.f());
                        jSONObject.put("02004", ceVar.a("02004") != null ? ceVar.a("02004") : bl.d());
                        jSONObject.put("02005", ceVar.a("02005") != null ? ceVar.a("02005") : bl.e());
                        jSONObject.put("02018", ceVar.a("02018") != null ? ceVar.a("02018") : bl.s());
                        jSONObject.put("02013", ceVar.a("02013") != null ? ceVar.a("02013") : bl.m());
                        jSONObject.put("02016", ceVar.a("02016") != null ? ceVar.a("02016") : bl.q());
                    } else {
                        jSONObject.put("02001", bl.a());
                        jSONObject.put("02002", bl.b());
                        jSONObject.put("02003", bl.c());
                        jSONObject.put("02004", bl.d());
                        jSONObject.put("02005", bl.e());
                        jSONObject.put("02006", bl.f());
                        jSONObject.put("02007", bl.g());
                        jSONObject.put("02018", bl.s());
                        jSONObject.put("02013", bl.m());
                        jSONObject.put("02016", bl.q());
                    }
                    jSONObject.put("02021", bl.d(this.f55361a));
                    jSONObject.put("02022", bl.c(this.f55361a));
                    jSONObject.put("02044", bl.t());
                    jSONObject.put("11009", bs.a(this.f55361a.getApplicationContext()));
                    if (Engine.loadSuccess) {
                        bz bzVar = new bz(this.f55361a);
                        jSONObject.put("04001", bzVar.a("04001") != null ? bzVar.a("04001") : "");
                        jSONObject.put("04002", bzVar.a("04002") != null ? bzVar.a("04002") : "");
                        jSONObject.put("04003", bzVar.a("04003") != null ? bzVar.a("04003") : "");
                        jSONObject.put("04004", bzVar.a("04004") != null ? bzVar.a("04004") : "");
                    } else {
                        try {
                            bj b9 = bk.b();
                            jSONObject.put("04001", bk.a());
                            jSONObject.put("04002", b9.b());
                            jSONObject.put("04003", b9.c());
                            jSONObject.put("04004", b9.a());
                        } catch (Exception unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                    return null;
                }
            }
            if (this.f55362b) {
                jSONObject.put("20004", 1);
            }
            jSONObject.put("11017", jSONObject.toString().length());
            jSONObject.put("20000", this.f55363c);
            jSONObject.put("11028", WeaponHI.sKSSdkver);
            return jSONObject;
        } catch (Throwable unused5) {
            return null;
        }
    }

    public String a(String str) {
        try {
            synchronized (f55360d) {
                JSONObject a5 = new cm(str, ck.f55419l).a(this.f55361a);
                if (a5 == null) {
                    return null;
                }
                JSONObject a6 = a();
                if (a6 == null) {
                    return null;
                }
                a5.put("module_section", a6);
                return a5.toString();
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
