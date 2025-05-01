package com.kwad.sdk.api;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.api.core.IKsAdSDK;
import com.kwad.sdk.api.core.KsAdSdkApi;
import com.kwad.sdk.api.loader.Loader;
import com.kwad.sdk.api.loader.Wrapper;
import com.kwad.sdk.api.loader.d;
import com.kwad.sdk.api.loader.u;
import com.kwad.sdk.api.proxy.app.AdSdkFileProvider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicBoolean;
@KsAdSdkApi
@Keep
/* loaded from: classes5.dex */
public class KsAdSDK {
    private static Context mOriginalAppContext;
    private static String sAppTag;
    public static final AtomicBoolean sHasInit = new AtomicBoolean(false);
    private static final AtomicBoolean sHasRest = new AtomicBoolean(false);
    @Keep
    private static IKsAdSDK sSdk;

    @Keep
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface KsThemeModeType {
        public static final int NIGHT = 1;
        public static final int NORMAL = 0;
    }

    @Keep
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SdkType {
        public static final int AD = 1;
        public static final int CAR = 5;
        public static final int CT = 2;
        public static final int CT_PURE = 4;
        public static final int EC = 3;
    }

    @KsAdSdkApi
    @Keep
    public static void deleteCache() {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            iKsAdSDK.deleteCache();
        }
    }

    @KsAdSdkApi
    @Keep
    public static String getAppId() {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            return iKsAdSDK.getAppId();
        }
        return null;
    }

    @KsAdSdkApi
    @Keep
    public static String getAppName() {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            return iKsAdSDK.getAppName();
        }
        return null;
    }

    @Nullable
    @KsAdSdkApi
    @Keep
    public static Context getContext() {
        return mOriginalAppContext;
    }

    @KsAdSdkApi
    @Keep
    public static String getDid() {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            return iKsAdSDK.getDid();
        }
        return null;
    }

    @KsAdSdkApi
    @Keep
    public static synchronized KsLoadManager getLoadManager() {
        synchronized (KsAdSDK.class) {
            if (sSdk != null && sHasInit.get()) {
                return sSdk.getAdManager();
            }
            return new b();
        }
    }

    @KsAdSdkApi
    @Keep
    public static int getSDKType() {
        return 1;
    }

    @KsAdSdkApi
    @Keep
    public static String getSDKVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @KsAdSdkApi
    @Keep
    public static String getSDKVersion(int i4) {
        return i4 != 1 ? "" : BuildConfig.VERSION_NAME;
    }

    public static boolean haseInit() {
        return sHasInit.get();
    }

    @KsAdSdkApi
    @Keep
    public static synchronized boolean init(Context context, SdkConfig sdkConfig) {
        Context context2;
        Throwable th;
        synchronized (KsAdSDK.class) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (context != null && sdkConfig != null) {
                    mOriginalAppContext = context;
                    try {
                        context2 = d.aK(context);
                        if (context2 != null) {
                            try {
                                IKsAdSDK init = Loader.get().init(context2, KsAdSDK.class.getClassLoader());
                                sSdk = init;
                                init.setApiVersion(BuildConfig.VERSION_NAME);
                                sSdk.setApiVersionCode(BuildConfig.VERSION_CODE);
                                sSdk.setLaunchTime(AdSdkFileProvider.sLaunchTime);
                                Context wrapContextIfNeed = Wrapper.wrapContextIfNeed(context2);
                                if (wrapContextIfNeed != null) {
                                    sSdk.setInitStartTime(elapsedRealtime);
                                    sSdk.init(wrapContextIfNeed, sdkConfig);
                                    sSdk.setAppTag(sAppTag);
                                    u.a(context2, sSdk);
                                    com.kwad.sdk.api.loader.b.a(context2, sdkConfig);
                                    c.nq();
                                    sHasInit.set(sSdk != null);
                                    return sHasInit.get();
                                }
                                throw new RuntimeException("init wrapContextIfNeed Exception");
                            } catch (Throwable th2) {
                                th = th2;
                                revertDynamic(th, context2, sdkConfig);
                                return false;
                            }
                        }
                        throw new RuntimeException("init wrapperApp Exception");
                    } catch (Throwable th3) {
                        context2 = context;
                        th = th3;
                    }
                } else {
                    throw new RuntimeException("init context or config is null");
                }
            }
        }
    }

    @KsAdSdkApi
    @Keep
    public static boolean isDebugLogEnable() {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            return iKsAdSDK.isDebugLogEnable();
        }
        return false;
    }

    @KsAdSdkApi
    @Keep
    public static void pauseCurrentPlayer() {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            iKsAdSDK.pauseCurrentPlayer();
        }
    }

    @KsAdSdkApi
    @Keep
    public static void resumeCurrentPlayer() {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            iKsAdSDK.resumeCurrentPlayer();
        }
    }

    private static void revertDynamic(Throwable th, Context context, SdkConfig sdkConfig) {
        AtomicBoolean atomicBoolean = sHasRest;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        u.aS(context);
        Loader.get().rest();
        new StringBuilder("init appId after reset:").append(sdkConfig.appId);
        init(context, sdkConfig);
        c.m(th);
    }

    @KsAdSdkApi
    @Keep
    public static void setAdxEnable(boolean z4) {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            iKsAdSDK.setAdxEnable(z4);
        }
    }

    @KsAdSdkApi
    @Keep
    public static void setAppTag(String str) {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            iKsAdSDK.setAppTag(str);
        } else {
            sAppTag = str;
        }
    }

    public static void setLoadingLottieAnimation(boolean z4, @RawRes int i4) {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            iKsAdSDK.setLoadingLottieAnimation(z4, i4);
        }
    }

    public static void setLoadingLottieAnimationColor(boolean z4, @ColorInt int i4) {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            iKsAdSDK.setLoadingLottieAnimationColor(z4, i4);
        }
    }

    @KsAdSdkApi
    @Keep
    public static void setPersonalRecommend(boolean z4) {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            iKsAdSDK.setPersonalRecommend(z4);
        }
    }

    @KsAdSdkApi
    @Keep
    public static void setProgrammaticRecommend(boolean z4) {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            iKsAdSDK.setProgrammaticRecommend(z4);
        }
    }

    public static void setThemeMode(int i4) {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            iKsAdSDK.setThemeMode(i4);
        }
    }

    @KsAdSdkApi
    @Keep
    public static synchronized void start() {
        synchronized (KsAdSDK.class) {
            sSdk.start();
        }
    }

    @KsAdSdkApi
    @Keep
    public static void unInit() {
        IKsAdSDK iKsAdSDK = sSdk;
        if (iKsAdSDK != null) {
            iKsAdSDK.unInit();
        }
        sSdk = null;
    }
}
