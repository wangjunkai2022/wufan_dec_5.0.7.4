package com.beizi.fusion.g;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import com.beizi.fusion.d.a.b;
import com.beizi.fusion.model.DevInfo;
import com.beizi.fusion.model.EnvInfo;
import com.beizi.fusion.model.JsonResolver;
import com.beizi.fusion.model.RequestInfo;
import com.qq.e.comm.pi.ACTD;
import com.umeng.analytics.pro.bm;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: HttpUtil.java */
/* loaded from: classes2.dex */
public class ab {

    /* renamed from: a  reason: collision with root package name */
    private static String f6824a = "HttpUtil";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae A[Catch: IOException -> 0x00c9, TRY_ENTER, TryCatch #0 {IOException -> 0x00c9, blocks: (B:44:0x00ae, B:46:0x00b3, B:48:0x00b8, B:55:0x00c5, B:59:0x00cd, B:61:0x00d2, B:33:0x009b), top: B:79:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3 A[Catch: IOException -> 0x00c9, TryCatch #0 {IOException -> 0x00c9, blocks: (B:44:0x00ae, B:46:0x00b3, B:48:0x00b8, B:55:0x00c5, B:59:0x00cd, B:61:0x00d2, B:33:0x009b), top: B:79:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8 A[Catch: IOException -> 0x00c9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00c9, blocks: (B:44:0x00ae, B:46:0x00b3, B:48:0x00b8, B:55:0x00c5, B:59:0x00cd, B:61:0x00d2, B:33:0x009b), top: B:79:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5 A[Catch: IOException -> 0x00c9, TRY_ENTER, TryCatch #0 {IOException -> 0x00c9, blocks: (B:44:0x00ae, B:46:0x00b3, B:48:0x00b8, B:55:0x00c5, B:59:0x00cd, B:61:0x00d2, B:33:0x009b), top: B:79:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd A[Catch: IOException -> 0x00c9, TryCatch #0 {IOException -> 0x00c9, blocks: (B:44:0x00ae, B:46:0x00b3, B:48:0x00b8, B:55:0x00c5, B:59:0x00cd, B:61:0x00d2, B:33:0x009b), top: B:79:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2 A[Catch: IOException -> 0x00c9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00c9, blocks: (B:44:0x00ae, B:46:0x00b3, B:48:0x00b8, B:55:0x00c5, B:59:0x00cd, B:61:0x00d2, B:33:0x009b), top: B:79:0x0006 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.g.ab.a(java.lang.String, java.lang.String):java.lang.String");
    }

    private static byte[] b(Context context, String str) {
        try {
            RequestInfo requestInfo = RequestInfo.getInstance(context);
            if (!requestInfo.isInit) {
                requestInfo.init();
            }
            DevInfo devInfo = requestInfo.getDevInfo();
            EnvInfo envInfo = requestInfo.getEnvInfo();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", "4.90.4.4");
            jSONObject.put("srcType", 1);
            jSONObject.put("timeStamp", System.currentTimeMillis());
            jSONObject.put(ACTD.APPID_KEY, str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sdkUID", devInfo.getSdkUID());
            jSONObject2.put("sdkUIDOrig", devInfo.getSdkUIDOrig());
            jSONObject2.put(bm.f63463x, devInfo.getOs());
            jSONObject2.put("platform", 2);
            jSONObject2.put("devType", Integer.valueOf(devInfo.getDevType()));
            jSONObject2.put("brand", devInfo.getBrand());
            jSONObject2.put("model", devInfo.getModel());
            jSONObject2.put(bm.f63465z, devInfo.getResolution());
            jSONObject2.put("screenSize", devInfo.getScreenSize());
            jSONObject2.put("language", devInfo.getLanguage());
            jSONObject2.put("density", devInfo.getDensity());
            jSONObject2.put("root", devInfo.getRoot());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("net", Integer.valueOf(envInfo.getNet()));
            jSONObject3.put("isp", Integer.valueOf(envInfo.getIsp()));
            jSONObject.putOpt("devInfo", jSONObject2);
            jSONObject.putOpt("envInfo", jSONObject3);
            String a5 = d.a(ad.a(), jSONObject.toString());
            if (TextUtils.isEmpty(a5)) {
                return null;
            }
            return a5.getBytes();
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ed A[Catch: IOException -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0117, blocks: (B:72:0x00ed, B:89:0x0113, B:47:0x00b4), top: B:116:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113 A[Catch: IOException -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0117, blocks: (B:72:0x00ed, B:89:0x0113, B:47:0x00b4), top: B:116:0x0001 }] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r7, byte[] r8) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.g.ab.a(java.lang.String, byte[]):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ac A[Catch: IOException -> 0x01b0, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x01b0, blocks: (B:84:0x0186, B:100:0x01ac, B:58:0x0147), top: B:129:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186 A[Catch: IOException -> 0x01b0, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x01b0, blocks: (B:84:0x0186, B:100:0x01ac, B:58:0x0147), top: B:129:0x0003 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.g.ab.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r11, java.io.File r12) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.g.ab.a(java.lang.String, java.io.File):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f9 A[Catch: IOException -> 0x013a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x013a, blocks: (B:70:0x00f9, B:93:0x0136, B:52:0x00c4), top: B:99:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136 A[Catch: IOException -> 0x013a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x013a, blocks: (B:70:0x00f9, B:93:0x0136, B:52:0x00c4), top: B:99:0x0018 }] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.InputStreamReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.Boolean r8) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.g.ab.a(android.content.Context, java.lang.String, java.lang.String, java.lang.Boolean):java.lang.String");
    }

    private static byte[] a(Context context, String str) {
        try {
            RequestInfo requestInfo = RequestInfo.getInstance(context);
            if (!requestInfo.isInit) {
                requestInfo.init();
            }
            DevInfo devInfo = requestInfo.getDevInfo();
            EnvInfo envInfo = requestInfo.getEnvInfo();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", str);
            jSONObject.put("packageName", av.c(context));
            jSONObject.put("installTime", String.valueOf(av.a(context)));
            jSONObject.put("updateTime", String.valueOf(av.b(context)));
            jSONObject.put("uploadTime", String.valueOf(System.currentTimeMillis()));
            jSONObject.put("appVersion", av.d(context));
            jSONObject.put("sdkVersion", "4.90.4.4");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sdkUID", devInfo.getSdkUID());
            jSONObject2.put("sdkUIDOrig", devInfo.getSdkUIDOrig());
            if (!TextUtils.isEmpty(devInfo.getOaid())) {
                jSONObject2.put("oaid", devInfo.getOaid());
            } else if (!TextUtils.isEmpty(requestInfo.getCustomOaid())) {
                jSONObject2.put("oaid", requestInfo.getCustomOaid());
            }
            jSONObject2.put("gaid", devInfo.getGaid());
            jSONObject2.put(bm.f63463x, devInfo.getOs());
            jSONObject2.put("platform", "2");
            jSONObject2.put("devType", devInfo.getDevType());
            jSONObject2.put("brand", devInfo.getBrand());
            jSONObject2.put("model", devInfo.getModel());
            jSONObject2.put(bm.f63465z, devInfo.getResolution());
            jSONObject2.put("screenSize", devInfo.getScreenSize());
            jSONObject2.put("language", devInfo.getLanguage());
            jSONObject2.put("density", devInfo.getDensity());
            jSONObject2.put("root", devInfo.getRoot());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("net", envInfo.getNet());
            jSONObject3.put("isp", envInfo.getIsp());
            jSONObject3.put("developerMode", av.h(context));
            jSONObject3.put("isDebugApk", av.g(context));
            jSONObject3.put("isDebugConnected", Debug.isDebuggerConnected());
            jSONObject3.put("isWifiProxy", av.i(context));
            jSONObject3.put("isVpn", av.b());
            jSONObject3.put("isSimulator", w.a().a(context));
            jSONObject.putOpt("devInfo", jSONObject2);
            jSONObject.putOpt("envInfo", jSONObject3);
            String a5 = c.a(jSONObject.toString(), ad.b());
            if (TextUtils.isEmpty(a5)) {
                return null;
            }
            return a5.getBytes();
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String a(Context context, String str, String str2, boolean z4, List<String> list, List<b.k> list2, int i4) {
        try {
            RequestInfo requestInfo = RequestInfo.getInstance(context);
            if (!requestInfo.isInit) {
                requestInfo.init();
            }
            DevInfo devInfo = requestInfo.getDevInfo();
            EnvInfo envInfo = requestInfo.getEnvInfo();
            com.beizi.fusion.d.a.b bVar = new com.beizi.fusion.d.a.b();
            b.i iVar = new b.i();
            iVar.a(str);
            iVar.a(0);
            iVar.b(i4);
            iVar.c(1);
            ArrayList arrayList = new ArrayList();
            arrayList.add("CNY");
            iVar.a(arrayList);
            iVar.b(list);
            iVar.d(1);
            ArrayList arrayList2 = new ArrayList();
            b.f fVar = new b.f();
            fVar.a("1");
            fVar.a(1);
            fVar.b(1);
            fVar.c(1);
            b.g gVar = new b.g();
            b.h hVar = new b.h();
            hVar.a(str2);
            hVar.b("AdScope");
            hVar.c("4.90.4.4");
            hVar.a(z4 ? 1 : 0);
            gVar.a(hVar);
            fVar.a(gVar);
            fVar.d(1);
            arrayList2.add(fVar);
            iVar.c(arrayList2);
            b.c cVar = new b.c();
            b.a aVar = new b.a();
            aVar.a(av.c(context));
            aVar.b(av.d(context));
            b.C0188b c0188b = new b.C0188b();
            c0188b.a(com.beizi.fusion.d.b.a().b());
            aVar.a(c0188b);
            cVar.a(aVar);
            b.d dVar = new b.d();
            dVar.a(Integer.valueOf(devInfo.getDevType()).intValue());
            dVar.a(envInfo.getUserAgent());
            dVar.b(1);
            dVar.a(envInfo.getUserAgent());
            dVar.b(devInfo.getBrand());
            dVar.c(devInfo.getModel());
            dVar.c(2);
            dVar.d(Build.VERSION.RELEASE);
            dVar.a(av.m(context));
            dVar.b(av.l(context));
            dVar.e(devInfo.getDensityDpi());
            dVar.f(devInfo.getDensity());
            dVar.g(devInfo.getLanguage());
            dVar.h(envInfo.getIsp());
            dVar.i(envInfo.getNet());
            b.e eVar = new b.e();
            eVar.a(devInfo.getSdkUID());
            if (!TextUtils.isEmpty(devInfo.getOaid())) {
                eVar.b(devInfo.getOaid());
            } else if (!TextUtils.isEmpty(requestInfo.getCustomOaid())) {
                eVar.b(requestInfo.getCustomOaid());
            }
            dVar.a(eVar);
            cVar.a(dVar);
            iVar.a(cVar);
            b.j jVar = new b.j();
            jVar.a(list2);
            iVar.a(jVar);
            bVar.a(iVar);
            String a5 = d.a(ad.a(), JsonResolver.toJson(bVar));
            if (TextUtils.isEmpty(a5)) {
                return null;
            }
            return a5;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
