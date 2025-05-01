package com.ss.android.downloadlib.n;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.sdk.authjs.a;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.ss.android.download.api.config.g;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadlib.activity.JumpKllkActivity;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.umeng.analytics.pro.bm;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class qv {
    private static com.ss.android.downloadlib.addownload.m.n i(@NonNull Context context, @NonNull String str) {
        try {
            Uri parse = Uri.parse("https://www.samsungapps.com/appquery/appDetail.as?appId=".concat(String.valueOf(str)));
            Intent intent = new Intent();
            intent.setClassName("com.sec.android.app.samsungapps", "com.sec.android.app.samsungapps.Main");
            intent.setData(parse);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("start_only_for_android", true);
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.m.n(5);
        } catch (Exception unused) {
            return new com.ss.android.downloadlib.addownload.m.n(6, 14);
        }
    }

    private static void n(final Context context, final com.ss.android.downloadlib.addownload.m.o oVar, final String str) {
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.n.qv.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject wv = com.ss.android.downloadlib.addownload.b.wv();
                String optString = wv.optString("s");
                final JSONObject jSONObject = new JSONObject();
                String vv = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("x"), optString);
                JSONObject jSONObject2 = new JSONObject();
                jh.vv(jSONObject2, bm.aM, "v");
                jh.vv(jSONObject2, "p", str);
                byte[] bytes = jSONObject2.toString().getBytes();
                com.ss.android.downloadlib.addownload.b.i().vv(vv, com.ss.android.downloadlib.addownload.b.g().vv(bytes, bytes.length), "application/octet-stream;tt-data=a", 0, new g() { // from class: com.ss.android.downloadlib.n.qv.7.1
                    @Override // com.ss.android.download.api.config.g
                    public void vv(String str2) {
                        AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                        qv.m(context, str, str2, oVar, jSONObject);
                    }

                    @Override // com.ss.android.download.api.config.g
                    public void vv(Throwable th) {
                        Context context2 = context;
                        com.ss.android.downloadlib.m.vv.vv(qv.vv(context2, Uri.parse("market://details?id=" + str)), oVar, true);
                        jh.vv(jSONObject, "ttdownloader_message", th != null ? th.getMessage() : "null");
                        com.ss.android.downloadlib.addownload.m.o oVar2 = oVar;
                        JSONObject jSONObject3 = jSONObject;
                        qv.m(oVar2, jSONObject3, 7, 5, "market://details?id=" + str);
                    }
                });
            }
        });
    }

    private static void o(final Context context, final com.ss.android.downloadlib.addownload.m.o oVar, final String str) {
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.n.qv.6
            @Override // java.lang.Runnable
            public void run() {
                JSONObject wv = com.ss.android.downloadlib.addownload.b.wv();
                final JSONObject jSONObject = new JSONObject();
                try {
                    String optString = wv.optString("s");
                    String vv = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("bw"), optString);
                    String vv2 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("bx"), optString);
                    String vv3 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("by"), optString);
                    Uri.Builder builder = new Uri.Builder();
                    builder.scheme("https").authority(vv).appendPath(vv2).appendQueryParameter(vv3, str);
                    com.ss.android.downloadlib.addownload.b.i().vv("GET", builder.build().toString(), null, new g() { // from class: com.ss.android.downloadlib.n.qv.6.1
                        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
                        /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
                        @Override // com.ss.android.download.api.config.g
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public void vv(java.lang.String r6) {
                            /*
                                r5 = this;
                                boolean r0 = android.text.TextUtils.isEmpty(r6)
                                r1 = 1
                                if (r0 != 0) goto L28
                                java.lang.String r6 = com.ss.android.downloadlib.n.qv.vv(r6)
                                boolean r0 = android.text.TextUtils.isEmpty(r6)
                                if (r0 != 0) goto L28
                                java.lang.String r6 = com.ss.android.downloadlib.n.qv.m(r6)
                                boolean r0 = android.text.TextUtils.isEmpty(r6)
                                if (r0 != 0) goto L28
                                com.ss.android.downloadlib.n.qv$6 r0 = com.ss.android.downloadlib.n.qv.AnonymousClass6.this
                                android.content.Context r2 = r2
                                com.ss.android.downloadlib.addownload.m.o r3 = r3
                                java.lang.String r0 = r1
                                com.ss.android.downloadlib.n.qv.vv(r2, r3, r0, r6)
                                r6 = 1
                                goto L29
                            L28:
                                r6 = 0
                            L29:
                                if (r6 != 0) goto L6d
                                com.ss.android.downloadlib.n.qv$6 r6 = com.ss.android.downloadlib.n.qv.AnonymousClass6.this
                                android.content.Context r6 = r2
                                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                java.lang.String r2 = "market://details?id="
                                r0.<init>(r2)
                                com.ss.android.downloadlib.n.qv$6 r3 = com.ss.android.downloadlib.n.qv.AnonymousClass6.this
                                java.lang.String r3 = r1
                                r0.append(r3)
                                java.lang.String r0 = r0.toString()
                                android.net.Uri r0 = android.net.Uri.parse(r0)
                                com.ss.android.downloadlib.addownload.m.n r6 = com.ss.android.downloadlib.n.qv.vv(r6, r0)
                                com.ss.android.downloadlib.n.qv$6 r0 = com.ss.android.downloadlib.n.qv.AnonymousClass6.this
                                com.ss.android.downloadlib.addownload.m.o r0 = r3
                                com.ss.android.downloadlib.m.vv.vv(r6, r0, r1)
                                com.ss.android.downloadlib.n.qv$6 r6 = com.ss.android.downloadlib.n.qv.AnonymousClass6.this
                                com.ss.android.downloadlib.addownload.m.o r6 = r3
                                org.json.JSONObject r0 = r2
                                r1 = 10
                                r3 = 9
                                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                r4.<init>(r2)
                                com.ss.android.downloadlib.n.qv$6 r2 = com.ss.android.downloadlib.n.qv.AnonymousClass6.this
                                java.lang.String r2 = r1
                                r4.append(r2)
                                java.lang.String r2 = r4.toString()
                                com.ss.android.downloadlib.n.qv.vv(r6, r0, r1, r3, r2)
                            L6d:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.n.qv.AnonymousClass6.AnonymousClass1.vv(java.lang.String):void");
                        }

                        @Override // com.ss.android.download.api.config.g
                        public void vv(Throwable th) {
                            Context context2 = context;
                            com.ss.android.downloadlib.m.vv.vv(qv.vv(context2, Uri.parse("market://details?id=" + str)), oVar, true);
                            jh.vv(jSONObject, "ttdownloader_message", th != null ? th.getMessage() : "null");
                            com.ss.android.downloadlib.addownload.m.o oVar2 = oVar;
                            JSONObject jSONObject2 = jSONObject;
                            qv.m(oVar2, jSONObject2, 11, 9, "market://details?id=" + str);
                        }
                    });
                } catch (Exception e5) {
                    e5.printStackTrace();
                    com.ss.android.downloadlib.addownload.m.o oVar2 = oVar;
                    qv.m(oVar2, jSONObject, 4, 9, "market://details?id=" + str);
                }
            }
        });
    }

    private static com.ss.android.downloadlib.addownload.m.n p(Context context, com.ss.android.downloadlib.addownload.m.o oVar, String str) {
        Intent intent = new Intent(context, JumpKllkActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("dl", true);
        intent.putExtra("p", str);
        intent.putExtra("id", oVar.vv);
        if (Build.VERSION.SDK_INT >= 29) {
            intent.putExtra("bk", "com.heytap.browser");
        } else if (jh.o(context, "com.android.browser")) {
            intent.putExtra("bk", "com.android.browser");
        } else if (jh.o(context, "com.coloros.browser")) {
            intent.putExtra("bk", "com.coloros.browser");
        } else {
            return vv(context, Uri.parse("market://details?id=".concat(String.valueOf(str))));
        }
        intent.putExtra("start_only_for_android", true);
        JSONObject jSONObject = new JSONObject();
        try {
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.m.n(7, "am_kllk3");
        } catch (Throwable unused) {
            m(oVar, jSONObject, 1, 3, "market://details?id=".concat(String.valueOf(str)));
            return vv(context, Uri.parse("market://details?id=".concat(String.valueOf(str))));
        }
    }

    private static void qv(Context context, com.ss.android.downloadlib.addownload.m.o oVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            TTDelegateActivity.vv(str, oVar.vv, "need_comment");
        } catch (Exception unused) {
            com.ss.android.downloadlib.m.vv.vv(vv(context, Uri.parse("market://details?id=".concat(String.valueOf(str)))), oVar, true);
            m(oVar, jSONObject, 9, 8, "market://details?id=".concat(String.valueOf(str)));
        }
    }

    private static void u(Context context, com.ss.android.downloadlib.addownload.m.o oVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            TTDelegateActivity.vv(str, oVar.vv);
        } catch (Exception unused) {
            com.ss.android.downloadlib.m.vv.vv(vv(context, Uri.parse("market://details?id=".concat(String.valueOf(str)))), oVar, true);
            m(oVar, jSONObject, 13, 10, "market://details?id=".concat(String.valueOf(str)));
        }
    }

    private static com.ss.android.downloadlib.addownload.m.n m(Context context, com.ss.android.downloadlib.addownload.m.o oVar, String str) {
        Intent intent = new Intent(context, JumpKllkActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("p", str);
        intent.putExtra("id", oVar.vv);
        intent.putExtra("start_only_for_android", true);
        JSONObject jSONObject = new JSONObject();
        try {
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.m.n(7, "am_kllk2");
        } catch (Throwable unused) {
            m(oVar, jSONObject, 1, 3, "market://details?id=".concat(String.valueOf(str)));
            return vv(context, Uri.parse("market://details?id=".concat(String.valueOf(str))));
        }
    }

    public static com.ss.android.downloadlib.addownload.m.n vv(Context context, Uri uri) {
        Intent intent;
        if (!com.ss.android.socialbase.appdownloader.u.o.p() && (context == null || uri == null || !"market".equals(uri.getScheme()))) {
            return new com.ss.android.downloadlib.addownload.m.n(6, 12);
        }
        try {
            String k4 = com.ss.android.socialbase.appdownloader.u.o.k();
            if (com.ss.android.socialbase.appdownloader.u.o.d() && (TextUtils.isEmpty(k4) || !jh.o(context, k4))) {
                k4 = "com.huawei.appmarket";
                Uri.Builder buildUpon = uri.buildUpon();
                buildUpon.scheme("market");
                intent = new Intent("android.intent.action.VIEW", buildUpon.build());
            } else {
                intent = new Intent("android.intent.action.VIEW", uri);
            }
            if (!jh.vv(context, intent)) {
                return new com.ss.android.downloadlib.addownload.m.n(6, 13);
            }
            if (jh.o(context, k4) && !com.ss.android.socialbase.appdownloader.u.o.n()) {
                intent.setPackage(k4);
            }
            if (com.ss.android.socialbase.downloader.n.vv.p().vv("fix_jump_market")) {
                intent.addFlags(335544320);
            } else if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            if (com.ss.android.socialbase.downloader.n.vv.p().m("test_jump_market_failed") == 1) {
                com.ss.android.downloadlib.o.p.vv().vv(false, "jump market error");
                return new com.ss.android.downloadlib.addownload.m.n(6, 25);
            }
            intent.putExtra("start_only_for_android", true);
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.m.n(5);
        } catch (Exception unused) {
            return new com.ss.android.downloadlib.addownload.m.n(6, 14);
        }
    }

    private static void i(final Context context, final com.ss.android.downloadlib.addownload.m.o oVar, final String str) {
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.n.qv.5
            @Override // java.lang.Runnable
            public void run() {
                Context context2 = context;
                com.ss.android.downloadlib.m.vv.vv(qv.vv(context2, Uri.parse("market://details?id=" + str)), oVar, true);
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject wv = com.ss.android.downloadlib.addownload.b.wv();
                    Thread.sleep(wv.optInt("m2_delay_millis", 1000));
                    com.ss.android.downloadlib.vv.vv.vv.vv().vv(context, true);
                    com.ss.android.downloadlib.vv.vv.m mVar = new com.ss.android.downloadlib.vv.vv.m();
                    mVar.vv = 1;
                    mVar.f60758m = 0;
                    String vv = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("v"), wv.optString("s"));
                    mVar.f60760p = String.format(vv, str);
                    com.ss.android.downloadlib.vv.vv.vv.vv().vv(mVar, (com.ss.android.downloadlib.vv.vv.i) null);
                    com.ss.android.downloadlib.vv.vv.vv.vv().m();
                    qv.m(oVar, jSONObject, -1, 2, String.format(vv, str));
                } catch (Throwable th) {
                    th.printStackTrace();
                    com.ss.android.downloadlib.addownload.m.o oVar2 = oVar;
                    qv.m(oVar2, jSONObject, 1, 2, "market://details?id=" + str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(String str) {
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        if (pathSegments.size() > 0) {
            return pathSegments.get(pathSegments.size() - 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(Context context, String str, String str2, @NonNull com.ss.android.downloadlib.addownload.m.o oVar, @NonNull JSONObject jSONObject) {
        jh.vv(jSONObject, "ttdownloader_type", (Object) 5);
        try {
            String vv = com.ss.android.socialbase.appdownloader.u.p.vv(new JSONObject(str2).optString("a"));
            if (!TextUtils.isEmpty(vv)) {
                TTDelegateActivity.vv(str, oVar.vv, vv, jSONObject);
                return;
            }
            com.ss.android.downloadlib.m.vv.vv(vv(context, Uri.parse("market://details?id=".concat(String.valueOf(str)))), oVar, true);
            m(oVar, jSONObject, 5, 5, "market://details?id=".concat(String.valueOf(str)));
        } catch (Exception unused) {
            com.ss.android.downloadlib.m.vv.vv(vv(context, Uri.parse("market://details?id=".concat(String.valueOf(str)))), oVar, true);
            m(oVar, jSONObject, 6, 5, "market://details?id=".concat(String.valueOf(str)));
        }
    }

    public static boolean p(@NonNull Activity activity, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.putExtra("start_only_for_android", true);
        String k4 = com.ss.android.socialbase.appdownloader.u.o.k();
        if (jh.o(com.ss.android.downloadlib.addownload.b.getContext(), k4)) {
            intent.setPackage(k4);
        }
        if (jh.vv(com.ss.android.downloadlib.addownload.b.getContext(), intent)) {
            try {
                activity.startActivity(intent);
                return true;
            } catch (Exception e5) {
                com.ss.android.downloadlib.o.p.vv().vv(e5, "start HM2");
                return false;
            }
        }
        return false;
    }

    public static boolean m(@NonNull Activity activity, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.putExtra("start_only_for_android", true);
        String k4 = com.ss.android.socialbase.appdownloader.u.o.k();
        if (jh.o(com.ss.android.downloadlib.addownload.b.getContext(), k4)) {
            intent.setPackage(k4);
        }
        if (jh.vv(com.ss.android.downloadlib.addownload.b.getContext(), intent)) {
            try {
                activity.startActivity(intent);
                return true;
            } catch (Exception e5) {
                com.ss.android.downloadlib.o.p.vv().vv(e5, "start HM1");
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(268435456);
            intent.putExtra("open_url", str);
            intent.putExtra("start_only_for_android", true);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static com.ss.android.downloadlib.addownload.m.n vv(final Context context, Uri uri, com.ss.android.downloadlib.addownload.m.o oVar) {
        com.ss.android.downloadad.api.vv.m mVar;
        if (context != null && com.ss.android.downloadlib.m.k.vv(uri)) {
            try {
                final Intent intent = new Intent("android.intent.action.VIEW", uri);
                if (!jh.vv(context, intent)) {
                    return new com.ss.android.downloadlib.addownload.m.n(6, 13);
                }
                String k4 = com.ss.android.socialbase.appdownloader.u.o.k();
                if (jh.o(context, k4)) {
                    intent.setPackage(k4);
                }
                intent.addFlags(335544320);
                if (com.ss.android.socialbase.downloader.n.vv.p().m("test_jump_market_failed") == 1 && "local_test".equals(com.ss.android.downloadlib.addownload.b.k().f60345p)) {
                    com.ss.android.downloadlib.o.p.vv().vv(false, "jump market error");
                    return new com.ss.android.downloadlib.addownload.m.n(6, 25);
                }
                intent.putExtra("start_only_for_android", true);
                long optLong = com.ss.android.downloadlib.addownload.b.wv().optLong("market_jump_delay", 1000L);
                if (optLong > 0 && oVar != null && (mVar = oVar.f60511o) != null && !mVar.pl()) {
                    com.ss.android.downloadlib.n.vv().m().post(new Runnable() { // from class: com.ss.android.downloadlib.n.qv.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.ss.android.downloadlib.addownload.b.p().vv(8, com.ss.android.downloadlib.addownload.b.getContext(), null, "浏览器跳转失败，正在前往应用商店", null, 0);
                        }
                    });
                }
                com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.n.qv.2
                    @Override // java.lang.Runnable
                    public void run() {
                        context.startActivity(intent);
                    }
                }, optLong);
                return new com.ss.android.downloadlib.addownload.m.n(5);
            } catch (Exception unused) {
                return new com.ss.android.downloadlib.addownload.m.n(6, 14);
            }
        }
        return new com.ss.android.downloadlib.addownload.m.n(6, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(com.ss.android.downloadlib.addownload.m.o oVar, JSONObject jSONObject, int i4, int i5, String str) {
        jh.vv(jSONObject, "error_code", Integer.valueOf(i4));
        jh.vv(jSONObject, "ttdownloader_type", Integer.valueOf(i5));
        jh.vv(jSONObject, "rmu", str);
        jh.vv(jSONObject, com.ss.android.socialbase.appdownloader.u.o.k(), Integer.valueOf(jh.m(com.ss.android.downloadlib.addownload.b.getContext(), com.ss.android.socialbase.appdownloader.u.o.k())));
        com.ss.android.downloadlib.i.vv.vv().m("am_result", jSONObject, oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.m.n m(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return new com.ss.android.downloadlib.addownload.m.n(4, 11);
        }
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.b.getContext();
        }
        Intent n4 = jh.n(context, str);
        if (n4 == null) {
            return new com.ss.android.downloadlib.addownload.m.n(4, 22);
        }
        n4.putExtra("start_only_for_android", true);
        try {
            context.startActivity(n4);
            return new com.ss.android.downloadlib.addownload.m.n(3);
        } catch (Exception unused) {
            return new com.ss.android.downloadlib.addownload.m.n(4, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String p(String str) {
        String[] split;
        String[] split2;
        Matcher matcher = Pattern.compile("<input[\\s\\S]*>\\n").matcher(str);
        String group = matcher.find() ? matcher.group() : "";
        if (!group.equals(null) && group.length() > 0) {
            for (String str2 : group.split("\\n")) {
                if (str2.startsWith("<input")) {
                    for (String str3 : str2.split("\\s")) {
                        if (str3.startsWith("value")) {
                            return str3.substring(7, str3.length() - 1);
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.m.n m(String str, @NonNull com.ss.android.downloadad.api.vv.vv vvVar) {
        if (TextUtils.isEmpty(str)) {
            return new com.ss.android.downloadlib.addownload.m.n(2, 21);
        }
        Context context = com.ss.android.downloadlib.addownload.b.getContext();
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        intent.addFlags(268435456);
        intent.putExtra("open_url", str);
        intent.putExtra("start_only_for_android", true);
        if (com.ss.android.socialbase.downloader.n.vv.p().vv("fix_app_link_flag")) {
            intent.addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        if (jh.m(context, intent)) {
            if (com.ss.android.downloadlib.addownload.b.wv().optInt("open_url_mode") == 0 && com.ss.android.downloadlib.addownload.b.jh() != null && com.ss.android.downloadlib.addownload.b.jh().vv() && Build.VERSION.SDK_INT >= 26 && vvVar.d()) {
                TTDelegateActivity.vv(str, vvVar);
            } else {
                try {
                    com.ss.android.downloadlib.addownload.b.getContext().startActivity(intent);
                } catch (Exception unused) {
                    return new com.ss.android.downloadlib.addownload.m.n(2);
                }
            }
            return new com.ss.android.downloadlib.addownload.m.n(1);
        }
        return new com.ss.android.downloadlib.addownload.m.n(2, 24);
    }

    public static com.ss.android.downloadlib.addownload.m.n vv(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (com.ss.android.socialbase.appdownloader.u.o.n() && jh.o(context, "com.sec.android.app.samsungapps")) {
                return i(context, str);
            }
            return vv(context, com.ss.android.download.api.p.vv.vv(str));
        }
        return new com.ss.android.downloadlib.addownload.m.n(6, 11);
    }

    public static com.ss.android.downloadlib.addownload.m.n vv(Context context, com.ss.android.downloadlib.addownload.m.o oVar, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (com.ss.android.socialbase.appdownloader.u.o.n() && jh.o(context, "com.sec.android.app.samsungapps")) {
                return i(context, str);
            }
            if (oVar.f60510m.isAd() && oVar.f60509i.enableAM()) {
                JSONArray optJSONArray = com.ss.android.downloadlib.addownload.b.wv().optJSONArray("am_plans");
                if (com.ss.android.socialbase.appdownloader.u.o.o() && com.ss.android.socialbase.appdownloader.u.vv.vv(optJSONArray, "am_3")) {
                    return m(context, oVar, str);
                }
                if (com.ss.android.socialbase.appdownloader.u.o.u() && com.ss.android.socialbase.appdownloader.u.vv.vv(optJSONArray, "am_2")) {
                    i(context, oVar, str);
                    return new com.ss.android.downloadlib.addownload.m.n(7, "am_m2");
                } else if (com.ss.android.socialbase.appdownloader.u.o.i() && com.ss.android.socialbase.appdownloader.u.vv.vv(optJSONArray, "am_5")) {
                    n(context, oVar, str);
                    return new com.ss.android.downloadlib.addownload.m.n(7, "am_v1");
                } else {
                    if (com.ss.android.socialbase.appdownloader.u.o.o() && com.ss.android.socialbase.appdownloader.u.vv.vv(optJSONArray, "am_7")) {
                        DownloadController downloadController = oVar.f60509i;
                        if ((downloadController instanceof AdDownloadController) && ((AdDownloadController) downloadController).enableOppoAutoDownload()) {
                            return p(context, oVar, str);
                        }
                    }
                    if (com.ss.android.socialbase.appdownloader.u.o.i() && com.ss.android.socialbase.appdownloader.u.vv.vv(optJSONArray, "am_8") && jh.vv(jh.p(context, "com.bbk.appstore"), "8.7.2.0") >= 0) {
                        qv(context, oVar, str);
                        return new com.ss.android.downloadlib.addownload.m.n(7, "am_v2");
                    } else if ((com.ss.android.socialbase.appdownloader.u.o.vv() || com.ss.android.socialbase.appdownloader.u.o.m()) && com.ss.android.socialbase.appdownloader.u.vv.vv(optJSONArray, "am_9")) {
                        o(context, oVar, str);
                        return new com.ss.android.downloadlib.addownload.m.n(7, "am_hr");
                    } else if ((com.ss.android.socialbase.appdownloader.u.o.vv() || com.ss.android.socialbase.appdownloader.u.o.m()) && com.ss.android.socialbase.appdownloader.u.vv.vv(optJSONArray, "am_10")) {
                        u(context, oVar, str);
                        return new com.ss.android.downloadlib.addownload.m.n(7, "am_hr2");
                    } else {
                        return vv(context, Uri.parse("market://details?id=".concat(String.valueOf(str))));
                    }
                }
            }
            return vv(context, Uri.parse("market://details?id=".concat(String.valueOf(str))));
        }
        return new com.ss.android.downloadlib.addownload.m.n(6, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(Context context, @NonNull com.ss.android.downloadlib.addownload.m.o oVar, @NonNull String str, @NonNull String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            TTDelegateActivity.m(str, oVar.vv, str2);
        } catch (Exception unused) {
            com.ss.android.downloadlib.m.vv.vv(vv(context, Uri.parse("market://details?id=".concat(String.valueOf(str)))), oVar, true);
            m(oVar, jSONObject, 12, 9, "market://details?id=".concat(String.valueOf(str)));
        }
    }

    public static void m(@NonNull Activity activity, String str, long j4, String str2) {
        com.ss.android.downloadlib.addownload.m.o o4 = com.ss.android.downloadlib.addownload.m.u.vv().o(j4);
        JSONObject jSONObject = new JSONObject();
        JSONObject wv = com.ss.android.downloadlib.addownload.b.wv();
        String optString = wv.optString("s");
        String vv = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("bz"), optString);
        String vv2 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("ca"), optString);
        String vv3 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("cb"), optString);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("hiapplink").authority("com.huawei.appmarket");
        if (!TextUtils.isEmpty(vv)) {
            builder.appendQueryParameter(vv, str2);
        }
        if (!TextUtils.isEmpty(vv2) && !TextUtils.isEmpty(vv3)) {
            builder.appendQueryParameter(vv2, vv3);
        }
        if (m(activity, builder.build())) {
            m(o4, jSONObject, -1, 9, "market://details?id=".concat(String.valueOf(str)));
            com.ss.android.downloadlib.m.vv.vv("am_hr", jSONObject, o4, true);
            return;
        }
        m(o4, jSONObject, 2, 9, "market://details?id=".concat(String.valueOf(str)));
        com.ss.android.downloadlib.m.vv.vv(vv((Context) activity, Uri.parse("market://details?id=".concat(String.valueOf(str)))), o4, true);
    }

    public static boolean vv(Context context, com.ss.android.downloadlib.addownload.m.o oVar, String str, JSONObject jSONObject, boolean z4, int i4) {
        jh.vv(jSONObject, "download_scene", Integer.valueOf(oVar.x()));
        com.ss.android.downloadlib.i.vv.vv().m("market_click_open", jSONObject, oVar);
        com.ss.android.downloadlib.addownload.m.n vv = vv(context, Uri.parse(str));
        String vv2 = jh.vv(vv.m(), "open_market");
        int type = vv.getType();
        if (type == 5) {
            com.ss.android.downloadlib.m.vv.vv(vv2, jSONObject, oVar, true);
        } else if (type == 6) {
            jh.vv(jSONObject, "error_code", Integer.valueOf(vv.vv()));
            jh.vv(jSONObject, "download_scene", Integer.valueOf(oVar.x()));
            com.ss.android.downloadlib.i.vv.vv().m("market_open_failed", jSONObject, oVar);
            return false;
        } else if (type != 7) {
            return false;
        }
        if (z4) {
            com.ss.android.downloadlib.i.vv.vv().vv(oVar.vv, i4);
        }
        return true;
    }

    public static void vv(Context context, String str, long j4, boolean z4) {
        JSONObject jSONObject = new JSONObject();
        com.ss.android.downloadlib.addownload.m.o o4 = com.ss.android.downloadlib.addownload.m.u.vv().o(j4);
        try {
            JSONObject wv = com.ss.android.downloadlib.addownload.b.wv();
            String optString = wv.optString("s");
            String vv = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("aa"), optString);
            String vv2 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("ac"), optString);
            String vv3 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("af"), optString);
            boolean vv4 = com.ss.android.socialbase.appdownloader.u.vv.vv(wv, context, vv2);
            StringBuilder sb = new StringBuilder(String.format(vv, str, vv3, vv2));
            Intent intent = new Intent("android.intent.action.VIEW");
            String k4 = com.ss.android.socialbase.appdownloader.u.o.k();
            if (jh.o(context, k4)) {
                intent.setPackage(k4);
            }
            if (z4) {
                sb.append(com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("ae"), optString));
            } else {
                intent.addFlags(335544320);
            }
            jh.vv(jSONObject, "mf", Boolean.valueOf(vv4));
            jh.vv(jSONObject, "if", Boolean.valueOf(z4));
            intent.setData(Uri.parse(sb.toString()));
            intent.putExtra("start_only_for_android", true);
            context.startActivity(intent);
            com.ss.android.downloadlib.m.vv.vv("am_kllk2", jSONObject, o4, true);
            if (vv4) {
                m(o4, jSONObject, -1, 3, sb.toString());
            } else {
                m(o4, jSONObject, 3, 3, sb.toString());
            }
        } catch (Exception unused) {
            com.ss.android.downloadlib.m.vv.vv(vv(com.ss.android.downloadlib.addownload.b.getContext(), Uri.parse("market://details?id=".concat(String.valueOf(str)))), o4, true);
            m(o4, jSONObject, 2, 3, "market://details?id=".concat(String.valueOf(str)));
        }
    }

    public static void vv(final Context context, String str, long j4, String str2, boolean z4) {
        JSONObject jSONObject = new JSONObject();
        com.ss.android.downloadlib.addownload.m.o o4 = com.ss.android.downloadlib.addownload.m.u.vv().o(j4);
        try {
            JSONObject wv = com.ss.android.downloadlib.addownload.b.wv();
            String optString = wv.optString("s");
            String vv = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("br"), optString);
            String vv2 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("bs_1"), optString);
            String vv3 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("bs_2"), optString);
            String vv4 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("bs_3"), optString);
            String vv5 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("bt"), optString);
            String vv6 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("bu"), optString);
            StringBuilder sb = new StringBuilder(String.format("https://", new Object[0]));
            sb.append(vv);
            sb.append(vv2);
            sb.append(vv3);
            sb.append(vv4);
            sb.append(vv5);
            sb.append(vv6);
            final Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(str2);
            if (z4) {
                sb.append("pkg=".concat(String.valueOf(str)));
                sb.append("&dl=true");
            } else {
                intent.addFlags(335544320);
            }
            jh.vv(jSONObject, "dl", Boolean.valueOf(z4));
            intent.setData(Uri.parse(sb.toString()));
            intent.putExtra("start_only_for_android", true);
            long optLong = com.ss.android.downloadlib.addownload.b.wv().optLong("oppo_browser_jump_delay", 1000L);
            if (optLong > 0) {
                com.ss.android.downloadlib.n.vv().m().post(new Runnable() { // from class: com.ss.android.downloadlib.n.qv.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.ss.android.downloadlib.addownload.b.p().vv(12, com.ss.android.downloadlib.addownload.b.getContext(), null, "正在前往浏览器下载", null, 0);
                    }
                });
            }
            com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.n.qv.4
                @Override // java.lang.Runnable
                public void run() {
                    context.startActivity(intent);
                }
            }, optLong);
            com.ss.android.downloadad.api.vv.m mVar = o4.f60511o;
            if (mVar != null) {
                mVar.v(true);
            }
            com.ss.android.downloadlib.m.vv.vv("am_kllk3", jSONObject, o4, true);
            m(o4, jSONObject, -1, 7, sb.toString());
        } catch (Exception unused) {
            com.ss.android.downloadad.api.vv.m mVar2 = o4.f60511o;
            if (mVar2 != null) {
                mVar2.v(false);
            }
            com.ss.android.downloadlib.m.vv.vv(vv(com.ss.android.downloadlib.addownload.b.getContext(), Uri.parse("market://details?id=".concat(String.valueOf(str))), o4), o4, true);
            m(o4, jSONObject, 2, 7, "market://details?id=".concat(String.valueOf(str)));
        }
    }

    private static boolean vv(@NonNull Activity activity, @NonNull String str, @NonNull HashMap<String, String> hashMap) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=".concat(String.valueOf(str))));
        intent.putExtra("start_only_for_android", true);
        intent.putExtra(a.f4790l, hashMap);
        String k4 = com.ss.android.socialbase.appdownloader.u.o.k();
        if (jh.o(com.ss.android.downloadlib.addownload.b.getContext(), k4)) {
            intent.setPackage(k4);
        }
        if (jh.vv(com.ss.android.downloadlib.addownload.b.getContext(), intent)) {
            try {
                activity.startActivity(intent);
                return true;
            } catch (Exception e5) {
                com.ss.android.downloadlib.o.p.vv().vv(e5, "start v1");
                return false;
            }
        }
        return false;
    }

    public static void vv(@NonNull Activity activity, String str, long j4, String str2, String str3) {
        JSONObject jSONObject;
        int i4;
        try {
            jSONObject = new JSONObject(str3);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        com.ss.android.downloadlib.addownload.m.o o4 = com.ss.android.downloadlib.addownload.m.u.vv().o(j4);
        try {
            JSONObject wv = com.ss.android.downloadlib.addownload.b.wv();
            boolean vv = com.ss.android.socialbase.appdownloader.u.vv.vv(wv, activity, com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("bg"), wv.optString("s")));
            HashMap<String, String> m4 = jh.m(new JSONObject(str2));
            if (vv && !m4.isEmpty() && vv(activity, str, m4)) {
                m(o4, jSONObject, -1, 5, "market://details?id=".concat(String.valueOf(str)));
                com.ss.android.downloadlib.m.vv.vv("am_v1", jSONObject, o4, true);
                return;
            }
            if (vv) {
                i4 = m4.isEmpty() ? 1 : 2;
            } else {
                i4 = 3;
            }
            m(o4, jSONObject, i4, 5, "market://details?id=".concat(String.valueOf(str)));
            com.ss.android.downloadlib.m.vv.vv(vv((Context) activity, Uri.parse("market://details?id=".concat(String.valueOf(str)))), o4, true);
        } catch (Exception unused2) {
            com.ss.android.downloadlib.m.vv.vv(vv(com.ss.android.downloadlib.addownload.b.getContext(), Uri.parse("market://details?id=".concat(String.valueOf(str)))), o4, true);
            m(o4, jSONObject, 4, 5, "market://details?id=".concat(String.valueOf(str)));
        }
    }

    public static void vv(@NonNull Activity activity, String str, long j4, String str2) {
        com.ss.android.downloadlib.addownload.m.o o4 = com.ss.android.downloadlib.addownload.m.u.vv().o(j4);
        JSONObject jSONObject = new JSONObject();
        JSONObject wv = com.ss.android.downloadlib.addownload.b.wv();
        String vv = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("bv"), wv.optString("s"));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("market").authority(BaseConstants.MARKET_URI_AUTHORITY_DETAIL).appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(vv)) {
            builder.appendQueryParameter(vv, str2);
        }
        if (vv(activity, builder.build())) {
            m(o4, jSONObject, -1, 8, "market://details?id=".concat(String.valueOf(str)));
            com.ss.android.downloadlib.m.vv.vv("am_v2", jSONObject, o4, true);
            return;
        }
        m(o4, jSONObject, 2, 8, "market://details?id=".concat(String.valueOf(str)));
        com.ss.android.downloadlib.m.vv.vv(vv((Context) activity, Uri.parse("market://details?id=".concat(String.valueOf(str)))), o4, true);
    }

    public static boolean vv(@NonNull Activity activity, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.putExtra("start_only_for_android", true);
        String k4 = com.ss.android.socialbase.appdownloader.u.o.k();
        if (jh.o(com.ss.android.downloadlib.addownload.b.getContext(), k4)) {
            intent.setPackage(k4);
        }
        if (jh.vv(com.ss.android.downloadlib.addownload.b.getContext(), intent)) {
            try {
                activity.startActivity(intent);
                return true;
            } catch (Exception e5) {
                com.ss.android.downloadlib.o.p.vv().vv(e5, "start v2");
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.m.n vv(Context context, String str, com.ss.android.downloadad.api.vv.vv vvVar) {
        Intent n4 = jh.n(context, str);
        if (n4 == null) {
            return new com.ss.android.downloadlib.addownload.m.n(4, 22);
        }
        if (Build.VERSION.SDK_INT >= 26 && com.ss.android.downloadlib.addownload.b.wv().optInt("open_package_mode") == 1 && com.ss.android.downloadlib.addownload.b.jh() != null && com.ss.android.downloadlib.addownload.b.jh().vv() && vvVar.d()) {
            TTDelegateActivity.m(str, vvVar);
            return new com.ss.android.downloadlib.addownload.m.n(3);
        }
        n4.putExtra("start_only_for_android", true);
        try {
            context.startActivity(n4);
            return new com.ss.android.downloadlib.addownload.m.n(3);
        } catch (Exception unused) {
            return new com.ss.android.downloadlib.addownload.m.n(4, 23);
        }
    }

    static com.ss.android.downloadlib.addownload.m.n vv(String str, com.ss.android.downloadad.api.vv.vv vvVar) {
        return vv(com.ss.android.downloadlib.addownload.b.getContext(), str, vvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.m.n vv(@NonNull com.ss.android.downloadad.api.vv.m mVar, String str, String str2) {
        com.ss.android.downloadlib.addownload.m.n m4 = m(str, mVar);
        return (com.ss.android.downloadlib.m.u.vv(mVar) && m4.getType() == 2) ? vv(str2, mVar) : m4;
    }

    public static void vv(@NonNull Activity activity, String str, long j4) {
        com.ss.android.downloadlib.addownload.m.o o4 = com.ss.android.downloadlib.addownload.m.u.vv().o(j4);
        JSONObject jSONObject = new JSONObject();
        JSONObject wv = com.ss.android.downloadlib.addownload.b.wv();
        String optString = wv.optString("s");
        String vv = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString("ca"), optString);
        String vv2 = com.ss.android.socialbase.appdownloader.u.p.vv(wv.optString(com.umeng.ccg.a.f64008a), optString);
        StringBuilder sb = new StringBuilder("market://details?id=");
        if (!TextUtils.isEmpty(vv) && !TextUtils.isEmpty(vv2)) {
            sb.append(str);
            sb.append(m.a.f71490d);
            sb.append(vv);
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append(vv2);
        }
        if (p(activity, Uri.parse(sb.toString()))) {
            m(o4, jSONObject, -1, 10, "market://details?id=".concat(String.valueOf(str)));
            com.ss.android.downloadlib.m.vv.vv("am_hr2", jSONObject, o4, true);
            return;
        }
        m(o4, jSONObject, 2, 10, "market://details?id=".concat(String.valueOf(str)));
        com.ss.android.downloadlib.m.vv.vv(vv((Context) activity, Uri.parse("market://details?id=".concat(String.valueOf(str)))), o4, true);
    }
}
