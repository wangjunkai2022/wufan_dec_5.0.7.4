package com.beizi.fusion;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.beizi.fusion.g.aj;
import com.kuaishou.weapon.p0.g;
/* loaded from: classes2.dex */
public class BeiZis {

    /* renamed from: a  reason: collision with root package name */
    private static BeiZiCustomController f6480a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6481b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String f6482c = "1.0.25";

    /* renamed from: d  reason: collision with root package name */
    private static boolean f6483d = true;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f6484e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f6485f;

    @RequiresPermission(g.f55581a)
    public static void asyncInit(Context context, String str) {
        f6483d = false;
        com.beizi.fusion.d.b.a().a(context, str, null, null);
    }

    @RequiresPermission(g.f55581a)
    public static void asyncInitWithDomain(Context context, String str, String str2) {
        f6483d = false;
        if (!TextUtils.isEmpty(str2)) {
            com.beizi.fusion.d.b.a().a(str2).a(context, str, null, null);
        } else {
            com.beizi.fusion.d.b.a().a(context, str, null, null);
        }
    }

    public static void closeShakeAd() {
        f6485f = true;
    }

    public static BeiZiCustomController getCustomController() {
        return f6480a;
    }

    public static String getOaidVersion() {
        return f6482c;
    }

    public static String getSdkVersion() {
        return "4.90.4.4";
    }

    public static boolean getTransferProtocol() {
        return f6484e;
    }

    @RequiresPermission(g.f55581a)
    public static void init(Context context, String str) {
        com.beizi.fusion.d.b.a().a(context, str, null, null);
    }

    @RequiresPermission(g.f55581a)
    public static void initWithDomain(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            com.beizi.fusion.d.b.a().a(str2).a(context, str, null, null);
        } else {
            com.beizi.fusion.d.b.a().a(context, str, null, null);
        }
    }

    public static boolean isCloseShakeAd() {
        return f6485f;
    }

    public static boolean isIsSyncInit() {
        return f6483d;
    }

    public static boolean isLimitPersonalAds() {
        return f6481b;
    }

    public static void setLimitPersonalAds(boolean z4) {
        f6481b = z4;
    }

    public static void setOaidVersion(String str) {
        f6482c = str;
    }

    public static void setSupportPersonalized(boolean z4) {
        aj.a(z4);
    }

    public static void setTransferProtocol(boolean z4) {
        f6484e = z4;
    }

    @RequiresPermission(g.f55581a)
    public static void init(Context context, String str, BeiZiCustomController beiZiCustomController) {
        f6480a = beiZiCustomController;
        com.beizi.fusion.d.b.a().a(context, str, null, null);
    }

    @RequiresPermission(g.f55581a)
    public static void asyncInit(Context context, String str, BeiZiCustomController beiZiCustomController) {
        f6480a = beiZiCustomController;
        f6483d = false;
        com.beizi.fusion.d.b.a().a(context, str, null, null);
    }

    @RequiresPermission(g.f55581a)
    public static void init(Context context, String str, BeiZiCustomController beiZiCustomController, String str2) {
        f6480a = beiZiCustomController;
        com.beizi.fusion.d.b.a().a(context, str, str2, null);
    }

    @RequiresPermission(g.f55581a)
    public static void asyncInit(Context context, String str, BeiZiCustomController beiZiCustomController, String str2) {
        f6480a = beiZiCustomController;
        f6483d = false;
        com.beizi.fusion.d.b.a().a(context, str, str2, null);
    }

    @RequiresPermission(g.f55581a)
    public static void init(Context context, String str, BeiZiCustomController beiZiCustomController, String str2, String str3) {
        f6480a = beiZiCustomController;
        com.beizi.fusion.d.b.a().a(context, str, str2, str3);
    }

    @RequiresPermission(g.f55581a)
    public static void asyncInit(Context context, String str, BeiZiCustomController beiZiCustomController, String str2, String str3) {
        f6480a = beiZiCustomController;
        f6483d = false;
        com.beizi.fusion.d.b.a().a(context, str, str2, str3);
    }
}
