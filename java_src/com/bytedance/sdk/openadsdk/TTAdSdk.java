package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTCodeGroupRit;
import com.bytedance.sdk.openadsdk.api.p;
import com.bytedance.sdk.openadsdk.api.plugin.u;
import com.bytedance.sdk.openadsdk.api.vv;
import com.bytedance.sdk.openadsdk.live.m;
import com.bytedance.sdk.openadsdk.mediation.IMediationManager;
import com.bytedance.sdk.openadsdk.mediation.MediationManagerVisitor;
import com.join.mgps.activity.SearchHintActivity_;
import com.umeng.analytics.pro.q;
import java.util.Map;
/* loaded from: classes2.dex */
public final class TTAdSdk {
    public static final String BRANCH = "";
    public static final String BUILT_IN_PLUGIN_NAME = "com.byted.pangle";
    public static final String C_H = "18ffad7";
    public static final int EXT_API_VERSION_CODE = 999;
    public static final boolean INCLUDE_LIVE = true;
    public static final String INITIALIZER_CLASS_NAME = "com.bytedance.sdk.openadsdk.core.AdSdkInitializerHolder";
    public static final boolean IS_BOOST = false;
    public static final boolean IS_P = true;
    public static final String LIVE_PLUGIN_PACKAGE_NAME = "com.byted.live.lite";
    public static final boolean ONLY_API = false;
    public static final int SDK_VERSION_CODE = 6217;
    public static final String SDK_VERSION_NAME = "6.2.1.7";
    public static final String S_C = "main";

    /* renamed from: m  reason: collision with root package name */
    private static volatile TTAdConfig f8700m;
    private static final vv vv = new u();

    /* loaded from: classes2.dex */
    public interface Callback extends InitCallback {
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface InitCallback {
        void fail(int i4, String str);

        void success();
    }

    public static TTAdManager getAdManager() {
        vv vvVar = vv;
        if (vvVar != null) {
            return vvVar.m();
        }
        return null;
    }

    public static void getCodeGroupRit(final long j4, final TTCodeGroupRit.TTCodeGroupRitListener tTCodeGroupRitListener) {
        vv vvVar = vv;
        if (vvVar != null) {
            vvVar.m().register(new CodeGroupRitObject() { // from class: com.bytedance.sdk.openadsdk.TTAdSdk.1
                @Override // com.bytedance.sdk.openadsdk.CodeGroupRitObject
                public long getCodeGroupId() {
                    return j4;
                }

                @Override // com.bytedance.sdk.openadsdk.CodeGroupRitObject
                public TTCodeGroupRit.TTCodeGroupRitListener getListener() {
                    return tTCodeGroupRitListener;
                }
            });
        } else if (tTCodeGroupRitListener != null) {
            tTCodeGroupRitListener.onFail(q.a.f63891d, "please init sdk first!");
        }
    }

    public static IMediationManager getMediationManager() {
        if (vv != null) {
            return MediationManagerVisitor.getInstance().getMediationManager();
        }
        return null;
    }

    public static boolean init(Context context, TTAdConfig tTAdConfig) {
        f8700m = tTAdConfig;
        vv(context, f8700m);
        return true;
    }

    @Deprecated
    public static boolean isInitSuccess() {
        vv vvVar = vv;
        if (vvVar != null) {
            return vvVar.vv();
        }
        return false;
    }

    public static boolean isOnePointFiveAdType(TTNativeExpressAd tTNativeExpressAd) {
        Map<String, Object> mediaExtraInfo;
        if (tTNativeExpressAd == null) {
            mediaExtraInfo = null;
        } else {
            try {
                mediaExtraInfo = tTNativeExpressAd.getMediaExtraInfo();
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        if (mediaExtraInfo == null || !mediaExtraInfo.containsKey("_tt_ad_type_onepointfive")) {
            return false;
        }
        return ((Boolean) mediaExtraInfo.get("_tt_ad_type_onepointfive")).booleanValue();
    }

    public static boolean isSdkReady() {
        vv vvVar = vv;
        if (vvVar != null) {
            return vvVar.vv();
        }
        return false;
    }

    public static void start(Callback callback) {
        vv(f8700m, "TTAdConfig is null, please exec TTAdSdk.init before TTAdSdk.start.");
        vv vvVar = vv;
        if (vvVar == null) {
            callback.fail(q.a.f63891d, "Load initializer failed");
        } else {
            vvVar.vv(TTAppContextHolder.getContext(), f8700m, callback);
        }
    }

    public static void updateAdConfig(TTAdConfig tTAdConfig) {
        vv.p m4;
        if (tTAdConfig == null || (m4 = vv.m()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(tTAdConfig.getData())) {
            bundle.putString("extra_data", tTAdConfig.getData());
        }
        if (!TextUtils.isEmpty(tTAdConfig.getKeywords())) {
            bundle.putString(SearchHintActivity_.S1, tTAdConfig.getKeywords());
        }
        if (bundle.keySet().isEmpty()) {
            return;
        }
        m4.getExtra(ValueSet.class, bundle);
    }

    public static void updateConfigAuth(TTAdConfig tTAdConfig) {
        Object obj;
        if (tTAdConfig == null) {
            return;
        }
        m.vv().vv(tTAdConfig.getInjectionAuth());
        Map<String, Object> initExtra = tTAdConfig.getInitExtra();
        if (initExtra == null || (obj = initExtra.get(TTAdConstant.KEY_INIT_FOR_LIVE)) == null || !(obj instanceof Map)) {
            return;
        }
        m.vv().vv((Map) obj);
    }

    public static void updatePaid(boolean z4) {
        vv.p m4 = vv.m();
        if (m4 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_paid", z4);
        if (bundle.keySet().isEmpty()) {
            return;
        }
        m4.getExtra(ValueSet.class, bundle);
    }

    private static void vv(Context context, TTAdConfig tTAdConfig) {
        if (tTAdConfig != null && tTAdConfig.isDebug()) {
            p.vv();
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            p.vv("Wrong Thread ! Please exec TTAdSdk.init in main thread.");
        }
        vv(context, "Context is null, please check.");
        vv(tTAdConfig, "TTAdConfig is null, please check.");
        TTAppContextHolder.setContext(context);
        updateConfigAuth(tTAdConfig);
    }

    private static void vv(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
