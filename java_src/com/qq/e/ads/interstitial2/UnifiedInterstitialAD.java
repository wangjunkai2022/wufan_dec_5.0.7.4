package com.qq.e.ads.interstitial2;

import android.app.Activity;
import android.content.Context;
import com.join.mgps.service.CommonService_;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.listeners.NegativeFeedbackListener;
import com.qq.e.comm.pi.IReward;
import com.qq.e.comm.pi.NFBI;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.pi.UIADI;
import com.qq.e.comm.util.AdErrorConvertor;
import com.qq.e.comm.util.GDTLogger;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public class UnifiedInterstitialAD extends LiteAbstractAD<UIADI> implements NFBI, IReward {

    /* renamed from: g  reason: collision with root package name */
    private AtomicInteger f59729g;

    /* renamed from: h  reason: collision with root package name */
    private AtomicInteger f59730h;

    /* renamed from: i  reason: collision with root package name */
    private volatile VideoOption f59731i;

    /* renamed from: j  reason: collision with root package name */
    private volatile int f59732j;

    /* renamed from: k  reason: collision with root package name */
    private volatile int f59733k;

    /* renamed from: l  reason: collision with root package name */
    private volatile LoadAdParams f59734l;

    /* renamed from: m  reason: collision with root package name */
    private UnifiedInterstitialADListener f59735m;

    /* renamed from: n  reason: collision with root package name */
    private ServerSideVerificationOptions f59736n;

    /* renamed from: o  reason: collision with root package name */
    private final ADListenerAdapter f59737o;

    public UnifiedInterstitialAD(Activity activity, String str, UnifiedInterstitialADListener unifiedInterstitialADListener) {
        this(activity, str, unifiedInterstitialADListener, null);
    }

    public UnifiedInterstitialAD(Activity activity, String str, UnifiedInterstitialADListener unifiedInterstitialADListener, Map map) {
        this.f59729g = new AtomicInteger(0);
        this.f59730h = new AtomicInteger(0);
        this.f59735m = unifiedInterstitialADListener;
        this.f59737o = new ADListenerAdapter(unifiedInterstitialADListener);
        a(activity, str);
    }

    public UnifiedInterstitialAD(Activity activity, String str, UnifiedInterstitialADListener unifiedInterstitialADListener, Map map, String str2) {
        this.f59729g = new AtomicInteger(0);
        this.f59730h = new AtomicInteger(0);
        this.f59735m = unifiedInterstitialADListener;
        this.f59737o = new ADListenerAdapter(unifiedInterstitialADListener);
        a(activity, str, str2);
    }

    @Override // com.qq.e.ads.AbstractAD
    protected Object a(Context context, POFactory pOFactory, String str, String str2, String str3) {
        return pOFactory.getUnifiedInterstitialADDelegate((Activity) context, str, str2, str3, this.f59737o);
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ void a(Object obj) {
        UIADI uiadi = (UIADI) obj;
        c();
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int i4) {
        UnifiedInterstitialADListener unifiedInterstitialADListener = this.f59735m;
        if (unifiedInterstitialADListener != null) {
            unifiedInterstitialADListener.onNoAD(AdErrorConvertor.formatErrorCode(i4));
        }
    }

    protected void c() {
        setVideoOption(this.f59731i);
        setMinVideoDuration(this.f59732j);
        setMaxVideoDuration(this.f59733k);
        setLoadAdParams(this.f59734l);
        setServerSideVerificationOptions(this.f59736n);
        while (this.f59729g.getAndDecrement() > 0) {
            loadAD();
        }
        while (this.f59730h.getAndDecrement() > 0) {
            loadFullScreenAD();
        }
    }

    public void close() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UIADI) t4).close();
        }
    }

    public void destroy() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UIADI) t4).destroy();
        } else {
            a("destroy");
        }
    }

    public String getAdNetWorkName() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            return ((UIADI) t4).getAdNetWorkName();
        }
        a("getAdNetWorkName");
        return null;
    }

    public int getAdPatternType() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            return ((UIADI) t4).getAdPatternType();
        }
        a("getAdPatternType");
        return 0;
    }

    public int getVideoDuration() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            return ((UIADI) t4).getVideoDuration();
        }
        a("getVideoDuration");
        return 0;
    }

    public void loadAD() {
        if (a()) {
            if (!b()) {
                this.f59729g.incrementAndGet();
                return;
            }
            T t4 = this.f59652a;
            if (t4 != 0) {
                ((UIADI) t4).loadAd();
            } else {
                a("loadAD");
            }
        }
    }

    public void loadFullScreenAD() {
        if (a()) {
            if (!b()) {
                this.f59730h.incrementAndGet();
                return;
            }
            T t4 = this.f59652a;
            if (t4 != 0) {
                ((UIADI) t4).loadFullScreenAD();
            } else {
                a("loadFullScreenAD");
            }
        }
    }

    public void setLoadAdParams(LoadAdParams loadAdParams) {
        this.f59734l = loadAdParams;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UIADI) t4).setLoadAdParams(this.f59734l);
        }
    }

    public void setMaxVideoDuration(int i4) {
        this.f59733k = i4;
        if (this.f59733k > 0 && this.f59732j > this.f59733k) {
            GDTLogger.e("maxVideoDuration 设置值非法，不得小于minVideoDuration");
        }
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UIADI) t4).setMaxVideoDuration(i4);
        }
    }

    public void setMediaListener(UnifiedInterstitialMediaListener unifiedInterstitialMediaListener) {
        this.f59737o.setMediaListener(unifiedInterstitialMediaListener);
    }

    public void setMinVideoDuration(int i4) {
        this.f59732j = i4;
        if (this.f59733k > 0 && this.f59732j > this.f59733k) {
            GDTLogger.e("minVideoDuration 设置值非法，不得大于maxVideoDuration");
        }
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UIADI) t4).setMinVideoDuration(i4);
        }
    }

    @Override // com.qq.e.comm.pi.NFBI
    public void setNegativeFeedbackListener(NegativeFeedbackListener negativeFeedbackListener) {
        this.f59737o.setNegativeFeedbackListener(negativeFeedbackListener);
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setRewardListener(com.qq.e.comm.listeners.ADRewardListener aDRewardListener) {
        this.f59737o.setAdRewardListener(aDRewardListener);
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.f59736n = serverSideVerificationOptions;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UIADI) t4).setServerSideVerificationOptions(serverSideVerificationOptions);
        }
    }

    public void setVideoOption(VideoOption videoOption) {
        this.f59731i = videoOption;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UIADI) t4).setVideoOption(videoOption);
        }
    }

    public void show() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UIADI) t4).show();
        } else {
            a(CommonService_.i0.f54387c);
        }
    }

    public void show(Activity activity) {
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UIADI) t4).show(activity);
        } else {
            a(CommonService_.i0.f54387c);
        }
    }

    public void showFullScreenAD(Activity activity) {
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UIADI) t4).showFullScreenAD(activity);
        } else {
            a("showFullScreenAD");
        }
    }
}
