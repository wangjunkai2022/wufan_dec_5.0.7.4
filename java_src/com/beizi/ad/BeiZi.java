package com.beizi.ad;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.RequiresPermission;
import com.beizi.ad.internal.g;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.UserEnvInfo;
import com.beizi.ad.internal.utilities.WebviewUtil;
import com.beizi.ad.lance.a.i;
import java.util.Map;
/* loaded from: classes2.dex */
public class BeiZi {

    /* renamed from: a  reason: collision with root package name */
    private static BeiZiAdSdkController f5165a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f5166b;

    public static BeiZiAdSdkController getCustomController() {
        return f5165a;
    }

    public static int getLocationDecimalDigits() {
        return UserEnvInfo.getInstance().getLocationDecimalDigits();
    }

    public static boolean getLocationEnabled() {
        return UserEnvInfo.getInstance().locationEnabled;
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return g.a().a(context);
    }

    @RequiresPermission(com.kuaishou.weapon.p0.g.f55581a)
    public static void init(Context context, String str) {
        g.a().a(context, str);
    }

    @RequiresPermission(com.kuaishou.weapon.p0.g.f55581a)
    public static void initWithDomain(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            g.a().a(str2).a(context, str);
        } else {
            g.a().a(context, str);
        }
    }

    public static boolean isHttpsEnabled() {
        return g.a().f5893a;
    }

    public static boolean isLimitPersonalAds() {
        return f5166b;
    }

    public static void logTagInfo(String str, boolean z4) {
        g.a().a(str, z4);
    }

    public static void setAdRequestUrl(String str) {
        g.a().b(str);
    }

    public static void setAppMuted(boolean z4) {
        g.a().a(z4);
    }

    public static void setAppVolume(float f5) {
        g.a().a(f5);
    }

    public static void setIncentiveConfig(Map<String, String> map) {
        g.a().a(map);
    }

    public static void setLimitPersonalAds(boolean z4) {
        f5166b = z4;
    }

    public static void setLocationDecimalDigits(int i4) {
        UserEnvInfo.getInstance().setLocationDecimalDigits(i4);
    }

    public static void setLocationEnabled(boolean z4) {
        UserEnvInfo.getInstance().locationEnabled = z4;
    }

    public static void startActivity(Context context, String str) {
        Class a5 = AdActivity.a();
        try {
            WebView webView = new WebView(context);
            WebviewUtil.setWebViewSettings(webView);
            webView.loadUrl(str, i.a());
            com.beizi.ad.internal.activity.a.f5750a.add(webView);
            Intent intent = new Intent(context, a5);
            intent.setFlags(268435456);
            intent.putExtra("ACTIVITY_TYPE", "DOWNLOADBROWSER");
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.adactivity_missing, a5.getName()));
            com.beizi.ad.internal.activity.a.f5750a.remove();
        } catch (Exception e5) {
            String str2 = HaoboLog.baseLogTag;
            HaoboLog.e(str2, "Exception initializing the redirect webview: " + e5.getMessage());
        }
    }

    public static void useHttps(boolean z4) {
        g.a().f5893a = z4;
    }

    @RequiresPermission(com.kuaishou.weapon.p0.g.f55581a)
    public static void init(Context context, String str, BeiZiAdSdkController beiZiAdSdkController) {
        f5165a = beiZiAdSdkController;
        g.a().a(context, str);
    }
}
