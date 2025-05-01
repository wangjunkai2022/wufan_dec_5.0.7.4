package com.kwad.sdk.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.app.AppPackageInfo;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.bv;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public final class aw {
    public static String aQN = "";

    public static com.kwad.sdk.k.a.b Lg() {
        return com.kwad.sdk.k.a.b.Lg();
    }

    public static com.kwad.sdk.k.a.f Lh() {
        return com.kwad.sdk.k.a.f.Lh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Ng() {
        com.kwad.sdk.k.a.f Lh = com.kwad.sdk.k.a.f.Lh();
        int i4 = Lh != null ? Lh.aOl : -1;
        if (i4 >= 0) {
            return com.kwad.sdk.e.b.a(false, String.valueOf(i4), 0);
        }
        if (!((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).zg()) {
            return com.kwad.sdk.e.b.a(false, String.valueOf(i4), 1);
        }
        return com.kwad.sdk.e.b.a(false, String.valueOf(i4), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Nh() {
        com.kwad.sdk.k.a.b Lg = com.kwad.sdk.k.a.b.Lg();
        if (Lg != null) {
            return com.kwad.sdk.e.b.a(false, Lg.toJson(), 0);
        }
        if (!((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).zi()) {
            return com.kwad.sdk.e.b.a(false, "", 1);
        }
        return com.kwad.sdk.e.b.a(false, "", 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Ni() {
        return com.kwad.sdk.e.b.a(false, "1", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Nj() {
        return com.kwad.sdk.e.b.a(false, String.valueOf(getSdkVersion()), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Nk() {
        return com.kwad.sdk.e.b.a(false, String.valueOf(getAppId()), 0);
    }

    private static String bS(boolean z4) {
        String cd = bj.cd(z4);
        if (!z4) {
            return TextUtils.isEmpty(cd) ? "" : cd;
        }
        boolean z5 = true;
        if (!TextUtils.isEmpty(cd)) {
            return com.kwad.sdk.e.b.a((!av.Na() || TextUtils.isEmpty(av.Nb())) ? false : false, cd, 0);
        } else if (!av.Na() && o.LS()) {
            return com.kwad.sdk.e.b.a(false, cd, 5);
        } else {
            return com.kwad.sdk.e.b.a(false, cd, 1);
        }
    }

    private static String bT(boolean z4) {
        if (com.kwad.framework.a.a.md.booleanValue() && !TextUtils.isEmpty(bk.getDeviceId())) {
            return bk.getDeviceId();
        }
        String deviceId = bj.getDeviceId();
        if (!z4) {
            return TextUtils.isEmpty(deviceId) ? "" : deviceId;
        }
        boolean z5 = true;
        if (!TextUtils.isEmpty(deviceId)) {
            return com.kwad.sdk.e.b.a((!av.usePhoneStateDisable() || TextUtils.isEmpty(av.MX())) ? false : false, deviceId, 0);
        } else if (!av.usePhoneStateDisable() && o.LQ()) {
            return com.kwad.sdk.e.b.a(false, deviceId, 5);
        } else {
            return com.kwad.sdk.e.b.a(false, deviceId, 1);
        }
    }

    private static String bU(boolean z4) {
        String NV = bj.NV();
        if (!z4) {
            return TextUtils.isEmpty(NV) ? "" : NV;
        } else if (!TextUtils.isEmpty(NV)) {
            return com.kwad.sdk.e.b.a(av.Nc(), NV, 0);
        } else {
            if (!av.Nc() && !((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).ab(8L)) {
                return com.kwad.sdk.e.b.a(false, NV, 2);
            }
            return com.kwad.sdk.e.b.a(false, NV, 1);
        }
    }

    static /* synthetic */ String bV(boolean z4) {
        return bS(true);
    }

    static /* synthetic */ String bW(boolean z4) {
        return Ng();
    }

    static /* synthetic */ String bX(boolean z4) {
        return Nh();
    }

    static /* synthetic */ String bY(boolean z4) {
        return bT(true);
    }

    static /* synthetic */ String bZ(boolean z4) {
        return bU(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Context context, boolean z4) {
        String u4 = bj.u(context, z4);
        if (!z4) {
            return TextUtils.isEmpty(u4) ? "" : u4;
        }
        boolean z5 = true;
        if (!TextUtils.isEmpty(u4)) {
            return com.kwad.sdk.e.b.a((!av.usePhoneStateDisable() || TextUtils.isEmpty(av.MV())) ? false : false, u4, 0);
        } else if (Build.VERSION.SDK_INT >= 29) {
            return com.kwad.sdk.e.b.a(false, u4, 4);
        } else {
            if (!av.usePhoneStateDisable() && o.LW()) {
                return com.kwad.sdk.e.b.a(false, u4, SystemUtil.di(context) ? 3 : 1);
            }
            return com.kwad.sdk.e.b.a(false, u4, 1);
        }
    }

    public static String cI(Context context) {
        return c(context, false);
    }

    public static String cJ(Context context) {
        return d(context, false);
    }

    public static String cK(Context context) {
        return e(context, false);
    }

    public static String cL(Context context) {
        return f(context, false);
    }

    public static String cM(Context context) {
        return g(context, false);
    }

    public static String cN(Context context) {
        return h(context, false);
    }

    public static String cO(Context context) {
        return i(context, false);
    }

    public static int cP(Context context) {
        return bj.dp(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cQ(Context context) {
        int dp = bj.dp(context);
        if (dp > 0) {
            return com.kwad.sdk.e.b.a(false, String.valueOf(dp), 0);
        }
        if (Build.VERSION.SDK_INT < 23) {
            return com.kwad.sdk.e.b.a(false, String.valueOf(dp), 1);
        }
        return com.kwad.sdk.e.b.a(false, String.valueOf(dp), 3);
    }

    public static int cR(Context context) {
        return bj.dq(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cS(Context context) {
        List<bv.a> o4 = o(context, 15);
        if (o4 != null && o4.size() > 0) {
            return com.kwad.sdk.e.b.a(av.Nc(), t.O(o4), 0);
        }
        if (!av.Nc() && !((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).ab(32L)) {
            return com.kwad.sdk.e.b.a(false, "", bv.dx(context) ? 1 : 3);
        }
        return com.kwad.sdk.e.b.a(false, "", 1);
    }

    private static Map<String, AppPackageInfo> cT(Context context) {
        com.kwad.sdk.components.n nVar = (com.kwad.sdk.components.n) com.kwad.sdk.components.c.f(com.kwad.sdk.components.n.class);
        if (nVar != null && o.LU()) {
            return nVar.K(context);
        }
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cU(Context context) {
        com.kwad.sdk.core.c.b.En();
        if (!com.kwad.sdk.core.c.b.isAppOnForeground()) {
            return com.kwad.sdk.e.b.a(false, "", 5);
        }
        Map<String, AppPackageInfo> cT = cT(context);
        if (cT.size() > 0) {
            boolean z4 = av.Ne() && av.Nf() != null;
            com.kwad.sdk.components.n nVar = (com.kwad.sdk.components.n) com.kwad.sdk.components.c.f(com.kwad.sdk.components.n.class);
            if (nVar != null && o.LU()) {
                return com.kwad.sdk.e.b.a(z4, nVar.c(cT), 0);
            }
        }
        if (!av.Ne() && o.LU()) {
            return com.kwad.sdk.e.b.a(false, "", bj.dw(context) ? 3 : 1);
        }
        return com.kwad.sdk.e.b.a(false, "", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cV(Context context) {
        com.kwad.sdk.utils.c.a ci = r.ci(context);
        boolean z4 = true;
        if (ci != null && ci.aTt != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("latitude", String.valueOf(ci.aTt.getLatitude()));
            hashMap.put("longitude", String.valueOf(ci.aTt.getLongitude()));
            return com.kwad.sdk.e.b.a((!av.MT() || av.MU() == null) ? false : false, t.parseMap2JSON(hashMap), 0);
        } else if (!av.MT() && !((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).ab(64L)) {
            return com.kwad.sdk.e.b.a(false, "", ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55587g) == 0 ? 3 : 1);
        } else {
            return com.kwad.sdk.e.b.a(false, "", 1);
        }
    }

    @NonNull
    private static com.kwad.sdk.e.c cW(final Context context) {
        return new com.kwad.sdk.e.c() { // from class: com.kwad.sdk.utils.aw.1
            @Override // com.kwad.sdk.e.a
            public final String IR() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIMEI:" + aw.c(context, true));
                return aw.c(context, true);
            }

            @Override // com.kwad.sdk.e.a
            public final String IS() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getAndroidID:" + aw.d(context, true));
                return aw.d(context, true);
            }

            @Override // com.kwad.sdk.e.a
            public final String IT() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getMac:" + aw.e(context, true));
                return aw.e(context, true);
            }

            @Override // com.kwad.sdk.e.a
            public final String IU() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIMEI2:" + aw.f(context, true));
                return aw.f(context, true);
            }

            @Override // com.kwad.sdk.e.a
            public final String IV() {
                String g4 = aw.g(context, true);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIMEI2:" + g4);
                return g4;
            }

            @Override // com.kwad.sdk.e.a
            public final String IW() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIMSI:" + aw.h(context, true));
                return aw.h(context, true);
            }

            @Override // com.kwad.sdk.e.a
            public final String IX() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getSimCardPhoneCount:" + aw.cQ(context));
                return aw.cQ(context);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.kwad.sdk.utils.aw.bW(boolean):java.lang.String
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // com.kwad.sdk.e.a
            public final java.lang.String IY() {
                /*
                    r3 = this;
                    r0 = 1
                    java.lang.String r0 = com.kwad.sdk.utils.aw.bW(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "getSimCardActivePhoneCount:"
                    r1.<init>(r2)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SDKPrivateSafetyDataUtil"
                    com.kwad.sdk.core.e.c.d(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.aw.AnonymousClass1.IY():java.lang.String");
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.kwad.sdk.utils.aw.bX(boolean):java.lang.String
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // com.kwad.sdk.e.a
            public final java.lang.String IZ() {
                /*
                    r3 = this;
                    r0 = 1
                    java.lang.String r0 = com.kwad.sdk.utils.aw.bX(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "getBaseStationInfo:"
                    r1.<init>(r2)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SDKPrivateSafetyDataUtil"
                    com.kwad.sdk.core.e.c.d(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.aw.AnonymousClass1.IZ():java.lang.String");
            }

            @Override // com.kwad.sdk.e.a
            public final String Ja() {
                String cS = aw.cS(context);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getWifiList:" + cS);
                return cS;
            }

            @Override // com.kwad.sdk.e.a
            public final String Jb() {
                String cU = aw.cU(context);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getAppList:" + cU);
                return cU;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.kwad.sdk.utils.aw.ca(boolean):java.lang.String
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // com.kwad.sdk.e.a
            public final java.lang.String Jc() {
                /*
                    r3 = this;
                    r0 = 1
                    java.lang.String r0 = com.kwad.sdk.utils.aw.ca(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "getSdkType:"
                    r1.<init>(r2)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SDKPrivateSafetyDataUtil"
                    com.kwad.sdk.core.e.c.d(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.aw.AnonymousClass1.Jc():java.lang.String");
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.kwad.sdk.utils.aw.cc(boolean):java.lang.String
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // com.kwad.sdk.e.a
            public final java.lang.String getAppId() {
                /*
                    r3 = this;
                    r0 = 1
                    java.lang.String r0 = com.kwad.sdk.utils.aw.cc(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "getAppId:"
                    r1.<init>(r2)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SDKPrivateSafetyDataUtil"
                    com.kwad.sdk.core.e.c.d(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.aw.AnonymousClass1.getAppId():java.lang.String");
            }

            @Override // com.kwad.sdk.e.a
            public final String getDeviceId() {
                String bY = aw.bY(true);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getDeviceId:" + bY);
                return bY;
            }

            @Override // com.kwad.sdk.e.a
            public final String getIccId() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIccId:" + aw.i(context, true));
                return aw.i(context, true);
            }

            @Override // com.kwad.sdk.e.a
            public final String getIp() {
                String bZ = aw.bZ(true);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getIp:" + bZ);
                return bZ;
            }

            @Override // com.kwad.sdk.e.a
            public final String getLocation() {
                String cV = aw.cV(context);
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getLocation:" + cV);
                return cV;
            }

            @Override // com.kwad.sdk.e.a
            public final String getOaid() {
                com.kwad.sdk.core.e.c.d("SDKPrivateSafetyDataUtil", "getOaid:" + aw.bV(true));
                return aw.bV(true);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.kwad.sdk.utils.aw.cb(boolean):java.lang.String
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
                	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
                Caused by: java.lang.IndexOutOfBoundsException: Index: 0
                	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
                	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
                	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
                	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
                	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
                	... 1 more
                */
            @Override // com.kwad.sdk.e.a
            public final java.lang.String getSdkVersion() {
                /*
                    r3 = this;
                    r0 = 1
                    java.lang.String r0 = com.kwad.sdk.utils.aw.cb(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "getSdkVersion:"
                    r1.<init>(r2)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SDKPrivateSafetyDataUtil"
                    com.kwad.sdk.core.e.c.d(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.aw.AnonymousClass1.getSdkVersion():java.lang.String");
            }
        };
    }

    static /* synthetic */ String ca(boolean z4) {
        return Ni();
    }

    static /* synthetic */ String cb(boolean z4) {
        return Nj();
    }

    static /* synthetic */ String cc(boolean z4) {
        return Nk();
    }

    public static com.kwad.sdk.utils.c.a ci(Context context) {
        return r.ci(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Context context, boolean z4) {
        String cJ = bj.cJ(context);
        if (!z4) {
            return TextUtils.isEmpty(cJ) ? "" : cJ;
        }
        boolean z5 = true;
        if (!TextUtils.isEmpty(cJ)) {
            return com.kwad.sdk.e.b.a((!av.usePhoneStateDisable() || TextUtils.isEmpty(av.MX())) ? false : false, cJ, 0);
        } else if (!av.usePhoneStateDisable() && o.LQ()) {
            return com.kwad.sdk.e.b.a(false, cJ, 5);
        } else {
            return com.kwad.sdk.e.b.a(false, cJ, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(Context context, boolean z4) {
        String du = bj.du(context);
        if (!z4) {
            return TextUtils.isEmpty(du) ? "" : du;
        }
        boolean z5 = true;
        if (!TextUtils.isEmpty(du)) {
            return com.kwad.sdk.e.b.a((!av.MY() || TextUtils.isEmpty(av.MZ())) ? false : false, du.toLowerCase(), 0);
        } else if (!av.MY() && o.LR()) {
            return com.kwad.sdk.e.b.a(false, du, an.aq(context, com.kuaishou.weapon.p0.g.f55584d) == 0 ? 3 : 1);
        } else {
            return com.kwad.sdk.e.b.a(false, du, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(Context context, boolean z4) {
        String[] m24do = bj.m24do(context);
        String str = (m24do == null || m24do.length <= 0) ? null : m24do[0];
        if (!z4) {
            return TextUtils.isEmpty(str) ? "" : str;
        }
        boolean z5 = true;
        if (!TextUtils.isEmpty(str)) {
            return com.kwad.sdk.e.b.a((!av.usePhoneStateDisable() || TextUtils.isEmpty(av.MV())) ? false : false, str, 0);
        } else if (Build.VERSION.SDK_INT >= 29) {
            return com.kwad.sdk.e.b.a(false, str, 4);
        } else {
            if (!av.usePhoneStateDisable() && o.LW()) {
                return com.kwad.sdk.e.b.a(false, str, SystemUtil.di(context) ? 3 : 1);
            }
            return com.kwad.sdk.e.b.a(false, str, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(Context context, boolean z4) {
        String[] m24do = bj.m24do(context);
        boolean z5 = true;
        String str = (m24do == null || m24do.length <= 1) ? null : m24do[1];
        if (!z4) {
            return TextUtils.isEmpty(str) ? "" : str;
        } else if (!TextUtils.isEmpty(str)) {
            return com.kwad.sdk.e.b.a((!av.usePhoneStateDisable() || TextUtils.isEmpty(av.MV())) ? false : false, str, 0);
        } else if (Build.VERSION.SDK_INT >= 29) {
            return com.kwad.sdk.e.b.a(false, str, 4);
        } else {
            if (!av.usePhoneStateDisable() && o.LW()) {
                return com.kwad.sdk.e.b.a(false, str, SystemUtil.di(context) ? 3 : 1);
            }
            return com.kwad.sdk.e.b.a(false, str, 1);
        }
    }

    private static String getAppId() {
        return ((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).getAppId();
    }

    public static String getDeviceId() {
        return bT(false);
    }

    public static String getOaid() {
        return bS(false);
    }

    private static String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(Context context, boolean z4) {
        String cN = bj.cN(context);
        if (!z4) {
            return TextUtils.isEmpty(cN) ? "" : cN;
        } else if (!TextUtils.isEmpty(cN)) {
            return com.kwad.sdk.e.b.a(av.usePhoneStateDisable(), cN, 0);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                return com.kwad.sdk.e.b.a(false, cN, 4);
            }
            if (!av.usePhoneStateDisable() && o.LX()) {
                return com.kwad.sdk.e.b.a(false, cN, SystemUtil.di(context) ? 3 : 1);
            }
            return com.kwad.sdk.e.b.a(false, cN, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(Context context, boolean z4) {
        String dr = bj.dr(context);
        if (!z4) {
            return TextUtils.isEmpty(dr) ? "" : dr;
        } else if (!TextUtils.isEmpty(dr)) {
            return com.kwad.sdk.e.b.a(av.usePhoneStateDisable(), dr, 0);
        } else {
            if (!av.usePhoneStateDisable() && o.LY()) {
                return com.kwad.sdk.e.b.a(false, dr, SystemUtil.di(context) ? 3 : 1);
            }
            return com.kwad.sdk.e.b.a(false, dr, 1);
        }
    }

    public static void init(Context context) {
        com.kwad.sdk.e.b.a(cW(context));
    }

    public static List<bv.a> o(Context context, int i4) {
        return bv.o(context, 15);
    }
}
