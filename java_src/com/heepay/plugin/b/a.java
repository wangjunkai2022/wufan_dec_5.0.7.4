package com.heepay.plugin.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.heepay.plugin.a.b;
import com.heepay.plugin.a.d;
import com.heepay.plugin.api.HPlugin;
import com.heepay.plugin.c.c;
import com.heepay.plugin.domain.e;
import com.heepay.plugin.domain.f;
import com.heepay.plugin.domain.g;
import com.heepay.plugin.domain.h;
import com.heepay.plugin.domain.i;
import com.tencent.stat.DeviceInfo;
import java.security.PublicKey;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressLint({"DefaultLocale"})
/* loaded from: classes3.dex */
public class a extends com.heepay.plugin.a.a {

    /* renamed from: o  reason: collision with root package name */
    private static a f14375o = new a();

    /* renamed from: q  reason: collision with root package name */
    private static final String f14376q = com.heepay.plugin.a.a.f14252d + com.heepay.plugin.a.a.f14253e + com.heepay.plugin.a.a.f14255g + "<@*Se*rv*ic*e@ xm*ln*s=\"h*tt*p:*/*/w*ww*.j*ca*r*d*.c*n/*we*bs*er*vi*ces/\">".replaceAll("\\*", "") + "<ph*one*Ver*>@p*ho*ne*Ver@</*pho*ne*Ver>".replaceAll("\\*", "") + "<ph*on*eI*D>*@p*ho*ne*ID*@</*pho*ne*I*D>".replaceAll("\\*", "") + "<*p*hon*eI*nf*o>@*ph*o*n*eI*n*f*o@*</*ph*one*In*fo>".replaceAll("\\*", "") + "<*tim*est*am*p>@*tim*est*amp*@</*tim*est*am*p>".replaceAll("\\*", "") + "<*enc*ryp*tPa*ra*m>*@p*ar*am*@<*/e*nc*ry*pt*Pa*ra*m>".replaceAll("\\*", "") + "<*si*gn>*@s**ign@</sign>".replaceAll("\\*", "") + "<*/*@*Se*rv*ice*@>".replaceAll("\\*", "") + com.heepay.plugin.a.a.f14256h + com.heepay.plugin.a.a.f14254f;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14377n = c.f14379a;

    /* renamed from: p  reason: collision with root package name */
    private int f14378p = 0;

    private a() {
    }

    private JSONObject a(String str, int i4, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(b.C0306b.f14290a, str);
        jSONObject.put(b.C0306b.f14291b, i4);
        jSONObject.put(b.C0306b.f14293d, str2);
        return jSONObject;
    }

    private boolean a(g gVar) {
        String str = gVar.f14438d;
        if (str == null || str.length() <= 0 || Integer.valueOf(gVar.f14438d).intValue() != 100) {
            return false;
        }
        String str2 = gVar.f14447m;
        c.b("WebService", "public key data has error ");
        c.b("WebService", "Received public key data again: " + str2);
        if (str2 == null || str2.length() <= 0) {
            return false;
        }
        this.f14260j = str2;
        try {
            PublicKey c5 = d.c(str2);
            this.f14261k = c5;
            if (c5 != null) {
                c.b("WebService", "Received public key: " + this.f14260j);
                return true;
            }
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private com.heepay.plugin.domain.d b(g gVar) {
        if (gVar == null) {
            return new com.heepay.plugin.domain.d();
        }
        JSONObject jSONObject = new JSONObject(gVar.a());
        com.heepay.plugin.domain.d dVar = new com.heepay.plugin.domain.d();
        dVar.d(com.heepay.plugin.c.a.a(jSONObject, b.C0306b.f14290a));
        dVar.a(com.heepay.plugin.c.a.a(jSONObject, b.a.C, 0));
        dVar.e(com.heepay.plugin.c.a.a(jSONObject, b.C0306b.f14300k));
        dVar.b(com.heepay.plugin.c.a.a(jSONObject, b.C0306b.f14301l));
        dVar.b(com.heepay.plugin.c.a.a(jSONObject, b.C0306b.f14296g, 0));
        dVar.c(com.heepay.plugin.c.a.a(jSONObject, b.a.f14287x));
        dVar.a(com.heepay.plugin.c.a.a(jSONObject, b.C0306b.E));
        return dVar;
    }

    public static a c() {
        return f14375o;
    }

    private String e() {
        a(HPlugin.mPayInitInfo.getSdkVersion());
        return "a" + HPlugin.mPayInitInfo.getSdkVersion();
    }

    public f a(String str, int i4) {
        f fVar = new f();
        String replaceAll = "Ve*rs*i*on*Se*rv*ic*e.A*pp*Bu*gR*ep*or*t".replaceAll("\\*", "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(b.c.f14316a, str);
            jSONObject.put(b.c.f14317b, i4);
            g a5 = a(replaceAll, jSONObject.toString(), true);
            if (a5.f14436b) {
                fVar.a(true);
                fVar.a(a5.f14437c);
                fVar.c(a5.f14438d);
            }
            return fVar;
        } catch (JSONException e5) {
            c.e("Exception", "产生了例外：" + com.heepay.plugin.c.b.a(e5));
            com.heepay.plugin.c.d.a("---->1--AppBugReport", "---" + com.heepay.plugin.c.b.a(e5));
            fVar.a(true);
            fVar.a((Exception) e5);
            fVar.a("获取数据时出错");
            fVar.b(fVar.b() + ", 原因：" + e5.getMessage());
            return fVar;
        }
    }

    public f a(String str, int i4, String str2, String str3) {
        f fVar = new f();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(b.C0306b.f14290a, str);
            jSONObject.put(b.C0306b.f14291b, i4);
            jSONObject.put(b.C0306b.f14293d, str2);
            jSONObject.put(b.C0306b.f14294e, str3);
            jSONObject.put(b.a.J, e.a().c());
            g a5 = a("PayService.CheckPayTokenID", jSONObject.toString(), true);
            if (a5.f14436b) {
                if (!a(a5)) {
                    fVar.a(true);
                    fVar.a(a5.f14437c);
                    fVar.c(a5.f14438d);
                    return fVar;
                }
                a5 = a("PayService.CheckPayTokenID", jSONObject.toString(), true);
                if (a5.f14436b) {
                    fVar.a(true);
                    fVar.a(a5.f14437c);
                    fVar.c(a5.f14438d);
                    return fVar;
                }
            }
            try {
                JSONObject jSONObject2 = new JSONObject(a5.a());
                h hVar = new h();
                hVar.a(com.heepay.plugin.c.a.a(jSONObject2, b.C0306b.f14296g));
                hVar.b(com.heepay.plugin.c.a.a(jSONObject2, b.C0306b.f14292c));
                hVar.c(com.heepay.plugin.c.a.a(jSONObject2, b.C0306b.f14300k));
                hVar.e(com.heepay.plugin.c.a.a(jSONObject2, b.C0306b.f14302m));
                hVar.d(com.heepay.plugin.c.a.a(jSONObject2, b.C0306b.f14303n));
                hVar.f(com.heepay.plugin.c.a.a(jSONObject2, b.C0306b.f14304o));
                fVar.a(hVar);
                return fVar;
            } catch (JSONException e5) {
                c.e("Exception", "产生了例外：" + com.heepay.plugin.c.b.a(e5));
                com.heepay.plugin.c.d.a("---->2--CheckPayTokenID", "---" + com.heepay.plugin.c.b.a(e5));
                fVar.a(true);
                fVar.a((Exception) e5);
                fVar.a("获取数据时出错");
                fVar.b(fVar.b() + ", 原因：" + e5.getMessage());
                return fVar;
            }
        } catch (JSONException e6) {
            e6.printStackTrace();
            c.e("Exception", "产生了例外：" + com.heepay.plugin.c.b.a(e6));
            com.heepay.plugin.c.d.a("---->1--CheckPayTokenID", "---" + com.heepay.plugin.c.b.a(e6));
            fVar.a(true);
            fVar.a((Exception) e6);
            fVar.a("获取数据时出错");
            fVar.b(fVar.b() + ", 原因：" + e6.getMessage());
            return fVar;
        }
    }

    public f a(String str, int i4, String str2, String str3, String str4) {
        f fVar = new f();
        if (TextUtils.isEmpty(str)) {
            fVar.a(true);
            fVar.a("订单号出错");
            return fVar;
        } else if (i4 == 0) {
            fVar.a(true);
            fVar.a("商家信息出错");
            return fVar;
        } else {
            try {
                JSONObject a5 = a(str, i4, str2);
                a5.put(b.C0306b.f14296g, str3);
                a5.put(b.C0306b.f14297h, str4);
                g a6 = a("PayService.SubmitPay", a5.toString(), true);
                if (a6.f14436b) {
                    fVar.a(true);
                    fVar.a(a6.f14437c);
                    fVar.c(a6.f14438d);
                    return fVar;
                }
                try {
                    fVar.a(b(a6));
                    return fVar;
                } catch (Exception e5) {
                    c.e("Exception", "产生了例外：" + com.heepay.plugin.c.b.a(e5));
                    com.heepay.plugin.c.d.a("---->2--SubmitPay", "---" + com.heepay.plugin.c.b.a(e5));
                    fVar.a(true);
                    fVar.a(e5);
                    fVar.a("获取数据时出错");
                    fVar.b(fVar.b() + ", 原因：" + e5.getMessage());
                    return fVar;
                }
            } catch (JSONException e6) {
                c.e("Exception", "产生了例外：" + com.heepay.plugin.c.b.a(e6));
                com.heepay.plugin.c.d.a("---->1--SubmitPay", "---" + com.heepay.plugin.c.b.a(e6));
                fVar.a(true);
                fVar.a((Exception) e6);
                fVar.a("获取数据时出错");
                fVar.b(fVar.b() + ", 原因：" + e6.getMessage());
                return fVar;
            }
        }
    }

    public f a(String str, int i4, String str2, boolean z4) {
        f fVar = new f();
        String replaceAll = "P*a*yS*er*vi*ce.Qu*ery*Pa*yS*ta*tu*s".replaceAll("\\*", "");
        try {
            JSONObject a5 = a(str, i4, str2);
            a5.put(b.C0306b.B, z4);
            g a6 = a(replaceAll, a5.toString(), true);
            if (!a6.f14436b) {
                fVar.a(a6.f14448n);
                return fVar;
            }
            fVar.a(true);
            fVar.a(a6.f14437c);
            fVar.c(a6.f14438d);
            fVar.a(a6.f14448n);
            return fVar;
        } catch (JSONException e5) {
            c.e("Exception", "产生了例外：" + com.heepay.plugin.c.b.a(e5));
            com.heepay.plugin.c.d.a("---->1--QueryPayStatus", "---" + com.heepay.plugin.c.b.a(e5));
            fVar.a(true);
            fVar.a((Exception) e5);
            fVar.a("获取数据时出错");
            fVar.b(fVar.b() + ", 原因：" + e5.getMessage());
            return fVar;
        }
    }

    protected g a(String str, String str2, boolean z4) {
        String replaceAll;
        String a5;
        String str3;
        String b5 = b();
        String str4 = this.f14257b;
        if (str4 == null || str4.isEmpty()) {
            if (this.f14377n) {
                switch (HPlugin.mPayInitInfo.getPayUrlType()) {
                    case 0:
                        break;
                    case 1:
                        str3 = "*h*t*t*p*:*/*/*1*9*2*.*1*6*8*.*2*.*9*5*/*P*a*y*H*e*e*_*p*a*y*/*P*h*o*n*e*/*S*D*K";
                        replaceAll = str3.replaceAll("\\*", "");
                        a5 = com.heepay.plugin.c.a.a(replaceAll);
                        break;
                    case 2:
                        str3 = "*h*t*t*p*:*/*/*2*1*1*.*1*0*3*.*1*5*7*.*4*5*/*P*a*y*H**e*e*_*p*a*y*/*P*h*o*n*e*/*S*D*K*";
                        replaceAll = str3.replaceAll("\\*", "");
                        a5 = com.heepay.plugin.c.a.a(replaceAll);
                        break;
                    case 3:
                        str3 = "*h*t*t*p*:*/*/*1*1*5*.*1*8*2*.*3*8*.*1*3*6*/*P*a*y*H**e*e*_*p*a*y*/*P*h*o*n*e*/*S*D*K*";
                        replaceAll = str3.replaceAll("\\*", "");
                        a5 = com.heepay.plugin.c.a.a(replaceAll);
                        break;
                    case 4:
                        str3 = "*h*t*t*p*:*/*/*2*1*1*.*1*0*3*.*1*7*1*.*1*6*3*/*P*a*y*H**e*e*_*p*a*y*/*P*h*o*n*e*/*S*D*K*";
                        replaceAll = str3.replaceAll("\\*", "");
                        a5 = com.heepay.plugin.c.a.a(replaceAll);
                        break;
                    case 5:
                        str3 = "*h*t*t*p*:*/*/*2*1*1*.*1*0*3*.*1*7*1*.*1*8*5*/*P*a*y*H**e*e*_*p*a*y*/*P*h*o*n*e*/*S*D*K*";
                        replaceAll = str3.replaceAll("\\*", "");
                        a5 = com.heepay.plugin.c.a.a(replaceAll);
                        break;
                    case 6:
                        str3 = "*h*t*t*p*:*/*/*2*1*1.*1*0*3*.*1*7*1*.*1*8*8*/*P*a*y*H**e*e*_*p*a*y*/*P*h*o*n*e*/*S*D*K*";
                        replaceAll = str3.replaceAll("\\*", "");
                        a5 = com.heepay.plugin.c.a.a(replaceAll);
                        break;
                    case 7:
                        str3 = "*h*t*t*p*:*/*/*1*1*5*.*1*8*2*.*2*4*4*.*1*6*5*/*P*a*y*H**e*e*_*p*a*y*/*P*h*o*n*e*/*S*D*K*";
                        replaceAll = str3.replaceAll("\\*", "");
                        a5 = com.heepay.plugin.c.a.a(replaceAll);
                        break;
                    case 8:
                        str3 = "*h*t*t*p*s*:*/*/*t*e*s*t*.*h*e*e*p*a*y*.*c*o*m*/*P*h*o*n*e*/*S*D*K";
                        replaceAll = str3.replaceAll("\\*", "");
                        a5 = com.heepay.plugin.c.a.a(replaceAll);
                        break;
                    case 9:
                        str3 = "*h*t*t*p*s*:*/*/*P*a*y*F*o*r*Y*f*b*.*h*e*e*p*a*y*.*c*o*m*/*P*h*o*n*e*/*S*D*K*";
                        replaceAll = str3.replaceAll("\\*", "");
                        a5 = com.heepay.plugin.c.a.a(replaceAll);
                        break;
                    default:
                        a5 = "*h*t*t*p*:*/*/*c*.*s*u*p*.*8*0*0*j*.*c*o*m*/*P*h*o*n*e*/*S*D*K*".replaceAll("\\*", "");
                        break;
                }
                this.f14257b = a5;
            }
            replaceAll = "*h*t*t*p*s*:*/*/*p*a*y*.*h*e*e*_*p*a*y*.*c*o*m*/*P*h*o*n*e*/*S*D*K".replaceAll("\\*", "");
            a5 = com.heepay.plugin.c.a.a(replaceAll);
            this.f14257b = a5;
        }
        g b6 = b(str, b5, str2, z4);
        if (b6 == null) {
            b6 = new g();
            b6.f14436b = true;
            b6.f14437c = "返回的对象为空";
        }
        c.a("GetDataFromServer", str + " return value: " + b6.toString());
        if (b6.f14436b) {
            if (b6.f14435a != null) {
                for (int i4 = 0; i4 < 3; i4++) {
                    if (b6.f14435a != null) {
                        c.b("----重新请求", "" + i4);
                        b6 = b(str, b5, str2, z4);
                    }
                }
            }
            String b7 = b6.b();
            this.f14259i = "服务失败，原因：" + b7 + "";
            StringBuilder sb = new StringBuilder();
            sb.append("GetDataFromServer return error, ");
            sb.append(this.f14259i);
            c.e("USaleWebService", sb.toString());
            return b6;
        }
        return b6;
    }

    @Override // com.heepay.plugin.a.a
    protected String a(String str, String str2, String str3, boolean z4) {
        e a5 = e.a();
        String c5 = a5.c();
        String h4 = a5.h();
        String e5 = e();
        String lowerCase = d.a(str + e5 + net.lingala.zip4j.util.e.F0 + c5 + net.lingala.zip4j.util.e.F0 + str3 + net.lingala.zip4j.util.e.F0 + h4 + net.lingala.zip4j.util.e.F0 + str2).toLowerCase();
        if (z4) {
            str2 = a(this.f14261k, str2);
        }
        return new String(f14376q).replaceAll("@Service@", str).replaceAll("@phoneVer@", e5).replaceAll("@phoneID@", c(c5)).replaceAll("@phoneInfo@", c(h4)).replaceAll("@timestamp@", c(str3)).replaceAll("@param@", c(str2)).replaceAll("@sign@", c(lowerCase));
    }

    @Override // com.heepay.plugin.a.a
    public boolean a(Context context) {
        super.a(context);
        this.f14378p++;
        e.a().b(context);
        return true;
    }

    public f d() {
        f fVar = new f();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DeviceInfo.TAG_VERSION, this.f14263m);
            g a5 = a("VersionService.GetVersionInfo", jSONObject.toString(), false);
            if (a5.f14436b) {
                fVar.a(true);
                fVar.a(a5.f14437c);
                fVar.c(a5.f14438d);
                return fVar;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(a5.a());
                i iVar = new i();
                iVar.b(com.heepay.plugin.a.a.a(jSONObject2, b.d.f14324a, 0));
                iVar.a(com.heepay.plugin.a.a.a(jSONObject2, b.d.f14325b));
                iVar.b(com.heepay.plugin.a.a.a(jSONObject2, b.d.f14326c));
                iVar.a(com.heepay.plugin.c.a.a(jSONObject2, b.d.f14331h, 1));
                if (jSONObject2.has(b.c.f14317b)) {
                    com.heepay.plugin.domain.a aVar = new com.heepay.plugin.domain.a();
                    aVar.a(com.heepay.plugin.c.a.b(jSONObject2.getJSONObject(b.c.f14317b), b.c.f14318c));
                    aVar.b(com.heepay.plugin.c.a.b(jSONObject2.getJSONObject(b.c.f14317b), b.c.f14319d));
                    aVar.c(com.heepay.plugin.c.a.b(jSONObject2.getJSONObject(b.c.f14317b), b.c.f14320e));
                    aVar.d(com.heepay.plugin.c.a.b(jSONObject2.getJSONObject(b.c.f14317b), b.c.f14321f));
                    aVar.e(com.heepay.plugin.c.a.b(jSONObject2.getJSONObject(b.c.f14317b), b.c.f14322g));
                    aVar.f(com.heepay.plugin.c.a.b(jSONObject2.getJSONObject(b.c.f14317b), b.c.f14323h));
                    iVar.a(aVar);
                }
                if (jSONObject2.has(b.d.f14328e)) {
                    JSONArray jSONArray = jSONObject2.getJSONArray(b.d.f14328e);
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        com.heepay.plugin.domain.c cVar = new com.heepay.plugin.domain.c();
                        cVar.a(com.heepay.plugin.a.a.a(jSONArray.getJSONObject(i4), b.d.f14329f));
                        arrayList.add(cVar);
                    }
                    iVar.a(arrayList);
                }
                fVar.a(iVar);
                String a6 = com.heepay.plugin.a.a.a(jSONObject2, b.d.f14327d);
                if (a6 != null && a6.length() > 0) {
                    this.f14260j = a6;
                    PublicKey c5 = d.c(a6);
                    this.f14261k = c5;
                    if (c5 != null) {
                        c.b("WebService", "Received public key: " + this.f14260j);
                    }
                }
                return fVar;
            } catch (Exception e5) {
                c.e("Exception", "产生了例外：" + com.heepay.plugin.c.b.a(e5));
                com.heepay.plugin.c.d.a("---->2--getVersionFromServer", "---" + com.heepay.plugin.c.b.a(e5));
                fVar.a(true);
                fVar.a(e5);
                fVar.a("获取数据时出错");
                fVar.b(fVar.b() + ", 原因：" + e5.getMessage());
                return fVar;
            }
        } catch (Exception e6) {
            c.e("Exception", "产生了例外：" + com.heepay.plugin.c.b.a(e6));
            com.heepay.plugin.c.d.a("---->1--getVersionFromServer", "---" + com.heepay.plugin.c.b.a(e6));
            fVar.a(true);
            fVar.a(e6);
            fVar.a("获取数据时出错");
            fVar.b(fVar.b() + ", 原因：" + e6.getMessage());
            return fVar;
        }
    }
}
