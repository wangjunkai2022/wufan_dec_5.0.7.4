package com.qq.e.ads.splash;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.adevent.ADEvent;
import com.qq.e.comm.adevent.ADListener;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.listeners.ADRewardListener;
import com.qq.e.comm.pi.IReward;
import com.qq.e.comm.pi.NSPVI;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.util.AdErrorConvertor;
import com.qq.e.comm.util.GDTLogger;
import java.util.HashMap;
/* loaded from: classes5.dex */
public final class SplashAD extends LiteAbstractAD<NSPVI> implements IReward {

    /* renamed from: g  reason: collision with root package name */
    private volatile ViewGroup f59793g;

    /* renamed from: h  reason: collision with root package name */
    private volatile SplashADListener f59794h;

    /* renamed from: i  reason: collision with root package name */
    private volatile ADRewardListener f59795i;

    /* renamed from: j  reason: collision with root package name */
    private volatile LoadAdParams f59796j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f59797k;

    /* renamed from: l  reason: collision with root package name */
    private volatile boolean f59798l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f59799m;

    /* renamed from: n  reason: collision with root package name */
    private volatile int f59800n;

    /* renamed from: o  reason: collision with root package name */
    private volatile byte[] f59801o;

    /* renamed from: p  reason: collision with root package name */
    private volatile ServerSideVerificationOptions f59802p;

    /* renamed from: q  reason: collision with root package name */
    private int f59803q;

    /* loaded from: classes5.dex */
    private class ADListenerAdapter implements ADListener {
        private ADListenerAdapter() {
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(ADEvent aDEvent) {
            String str;
            if (SplashAD.this.f59794h == null) {
                GDTLogger.d("SplashADListener == null");
                return;
            }
            int type = aDEvent.getType();
            if (type == 112) {
                Long l4 = (Long) aDEvent.getParam(Long.class);
                if (l4 != null) {
                    SplashAD.this.f59794h.onADTick(l4.longValue());
                    return;
                }
                return;
            }
            switch (type) {
                case 100:
                    Long l5 = (Long) aDEvent.getParam(Long.class);
                    if (l5 != null) {
                        SplashAD.this.f59794h.onADLoaded(l5.longValue());
                        return;
                    }
                    return;
                case 101:
                    Integer num = (Integer) aDEvent.getParam(Integer.class);
                    if (num != null) {
                        SplashAD.this.f59794h.onNoAD(AdErrorConvertor.formatErrorCode(num.intValue()));
                        return;
                    }
                    return;
                case 102:
                    SplashAD.this.f59794h.onADPresent();
                    return;
                case 103:
                    SplashAD.this.f59794h.onADExposure();
                    return;
                case 104:
                    if (SplashAD.this.f59795i == null || (str = (String) aDEvent.getParam(String.class)) == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("transId", str);
                    SplashAD.this.f59795i.onReward(hashMap);
                    return;
                case 105:
                    SplashAD.this.f59794h.onADClicked();
                    return;
                case 106:
                    SplashAD.this.f59794h.onADDismissed();
                    return;
                default:
                    return;
            }
        }
    }

    public SplashAD(Context context, String str, SplashADListener splashADListener) {
        this(context, str, splashADListener, 0);
    }

    public SplashAD(Context context, String str, SplashADListener splashADListener, int i4) {
        this.f59797k = false;
        this.f59794h = splashADListener;
        this.f59803q = i4;
        a(context, str);
    }

    public SplashAD(Context context, String str, SplashADListener splashADListener, int i4, String str2) {
        this.f59797k = false;
        this.f59794h = splashADListener;
        this.f59803q = i4;
        a(context, str, str2);
    }

    private void e(ViewGroup viewGroup, boolean z4) {
        if (viewGroup == null) {
            GDTLogger.e("传入参数有误：传入container参数为空");
            a(4001);
            return;
        }
        T t4 = this.f59652a;
        if (t4 == 0) {
            this.f59799m = z4;
            this.f59793g = viewGroup;
            return;
        }
        NSPVI nspvi = (NSPVI) t4;
        if (z4) {
            nspvi.fetchFullScreenAndShowIn(viewGroup);
        } else {
            nspvi.fetchAndShowIn(viewGroup);
        }
    }

    private void f(boolean z4) {
        if (a()) {
            if (!b()) {
                this.f59799m = z4;
                this.f59798l = true;
                return;
            }
            T t4 = this.f59652a;
            if (t4 == 0) {
                a("fetchAdInner");
                return;
            }
            NSPVI nspvi = (NSPVI) t4;
            if (z4) {
                nspvi.fetchFullScreenAdOnly();
            } else {
                nspvi.fetchAdOnly();
            }
        }
    }

    private void h(ViewGroup viewGroup, boolean z4) {
        if (viewGroup == null) {
            GDTLogger.e("传入参数错误，container参数为空");
            a(4001);
            return;
        }
        T t4 = this.f59652a;
        if (t4 == 0) {
            this.f59793g = viewGroup;
            return;
        }
        NSPVI nspvi = (NSPVI) t4;
        if (z4) {
            nspvi.showFullScreenAd(viewGroup);
        } else {
            nspvi.showAd(viewGroup);
        }
    }

    @Override // com.qq.e.ads.AbstractAD
    protected Object a(Context context, POFactory pOFactory, String str, String str2, String str3) {
        return pOFactory.getNativeSplashAdView(context, str, str2, str3);
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int i4) {
        if (this.f59794h != null) {
            this.f59794h.onNoAD(AdErrorConvertor.formatErrorCode(i4));
        }
    }

    public void fetchAdOnly() {
        f(false);
    }

    @Deprecated
    public void fetchAndShowIn(ViewGroup viewGroup) {
        e(viewGroup, false);
    }

    public void fetchFullScreenAdOnly() {
        f(true);
    }

    @Deprecated
    public void fetchFullScreenAndShowIn(ViewGroup viewGroup) {
        e(viewGroup, true);
    }

    public String getAdNetWorkName() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            return ((NSPVI) t4).getAdNetWorkName();
        }
        a("getAdNetWorkName");
        return null;
    }

    @Deprecated
    public Bitmap getZoomOutBitmap() {
        GDTLogger.e("注意！开屏V+功能已废弃，调用不生效");
        return null;
    }

    public void preLoad() {
        if (a()) {
            if (!b()) {
                this.f59797k = true;
                return;
            }
            T t4 = this.f59652a;
            if (t4 != 0) {
                ((NSPVI) t4).preload();
            } else {
                a("preLoad");
            }
        }
    }

    @Deprecated
    public void setAdLogoMargin(int i4, int i5) {
    }

    public void setDeveloperLogo(int i4) {
        T t4 = this.f59652a;
        if (t4 == 0) {
            this.f59800n = i4;
        } else {
            ((NSPVI) t4).setDeveloperLogo(i4);
        }
    }

    public void setDeveloperLogo(byte[] bArr) {
        T t4 = this.f59652a;
        if (t4 == 0) {
            this.f59801o = bArr;
        } else {
            ((NSPVI) t4).setDeveloperLogo(bArr);
        }
    }

    public void setLoadAdParams(LoadAdParams loadAdParams) {
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((NSPVI) t4).setLoadAdParams(loadAdParams);
        } else {
            this.f59796j = loadAdParams;
        }
    }

    @Deprecated
    public void setPreloadView(View view) {
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setRewardListener(ADRewardListener aDRewardListener) {
        this.f59795i = aDRewardListener;
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.f59802p = serverSideVerificationOptions;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((NSPVI) t4).setServerSideVerificationOptions(serverSideVerificationOptions);
        }
    }

    public void showAd(ViewGroup viewGroup) {
        h(viewGroup, false);
    }

    public void showFullScreenAd(ViewGroup viewGroup) {
        h(viewGroup, true);
    }

    @Deprecated
    public void zoomOutAnimationFinish() {
        GDTLogger.e("注意！开屏V+功能已废弃，调用不生效");
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void a(Object obj) {
        NSPVI nspvi = (NSPVI) obj;
        if (this.f59796j != null) {
            nspvi.setLoadAdParams(this.f59796j);
        }
        if (this.f59800n != 0) {
            nspvi.setDeveloperLogo(this.f59800n);
        }
        if (this.f59801o != null) {
            nspvi.setDeveloperLogo(this.f59801o);
        }
        nspvi.setFetchDelay(this.f59803q);
        nspvi.setAdListener(new ADListenerAdapter());
        nspvi.setServerSideVerificationOptions(this.f59802p);
        if (this.f59793g != null) {
            if (this.f59799m) {
                fetchFullScreenAndShowIn(this.f59793g);
            } else {
                fetchAndShowIn(this.f59793g);
            }
        }
        if (this.f59797k) {
            nspvi.preload();
            this.f59797k = false;
        }
        if (this.f59798l) {
            if (this.f59799m) {
                nspvi.fetchFullScreenAdOnly();
            } else {
                nspvi.fetchAdOnly();
            }
            this.f59798l = false;
        }
    }
}
