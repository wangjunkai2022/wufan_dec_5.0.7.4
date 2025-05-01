package com.qq.e.ads.banner2;

import android.app.Activity;
import android.content.Context;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.listeners.ADRewardListener;
import com.qq.e.comm.listeners.NegativeFeedbackListener;
import com.qq.e.comm.pi.IReward;
import com.qq.e.comm.pi.NFBI;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.pi.UBVI;
import com.qq.e.comm.util.AdErrorConvertor;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class UnifiedBannerAD extends LiteAbstractAD<UBVI> implements NFBI, IReward {

    /* renamed from: g  reason: collision with root package name */
    private UnifiedBannerADListener f59670g;

    /* renamed from: h  reason: collision with root package name */
    private AtomicInteger f59671h;

    /* renamed from: i  reason: collision with root package name */
    private int f59672i;

    /* renamed from: j  reason: collision with root package name */
    private LoadAdParams f59673j;

    /* renamed from: k  reason: collision with root package name */
    private UnifiedBannerView f59674k;

    /* renamed from: l  reason: collision with root package name */
    private final ADListenerAdapter f59675l;

    /* renamed from: m  reason: collision with root package name */
    private volatile ServerSideVerificationOptions f59676m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnifiedBannerAD(Activity activity, UnifiedBannerView unifiedBannerView, String str, UnifiedBannerADListener unifiedBannerADListener) {
        this(unifiedBannerView, unifiedBannerADListener);
        a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnifiedBannerAD(Activity activity, UnifiedBannerView unifiedBannerView, String str, String str2, UnifiedBannerADListener unifiedBannerADListener) {
        this(unifiedBannerView, unifiedBannerADListener);
        a(activity, str, str2);
    }

    private UnifiedBannerAD(UnifiedBannerView unifiedBannerView, UnifiedBannerADListener unifiedBannerADListener) {
        this.f59671h = new AtomicInteger(0);
        this.f59672i = 30;
        this.f59673j = null;
        this.f59670g = unifiedBannerADListener;
        this.f59674k = unifiedBannerView;
        this.f59675l = new ADListenerAdapter(unifiedBannerADListener);
    }

    @Override // com.qq.e.ads.AbstractAD
    protected Object a(Context context, POFactory pOFactory, String str, String str2, String str3) {
        return pOFactory.getUnifiedBannerViewDelegate(this.f59674k, (Activity) context, str, str2, str3, this.f59675l);
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int i4) {
        UnifiedBannerADListener unifiedBannerADListener = this.f59670g;
        if (unifiedBannerADListener != null) {
            unifiedBannerADListener.onNoAD(AdErrorConvertor.formatErrorCode(i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i4) {
        this.f59672i = i4;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UBVI) t4).setRefresh(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void destroy() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UBVI) t4).destroy();
        } else {
            a("destroy");
        }
    }

    public String getAdNetWorkName() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            return ((UBVI) t4).getAdNetWorkName();
        }
        a("getAdNetWorkName");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadAD() {
        if (a()) {
            if (!b()) {
                this.f59671h.incrementAndGet();
                return;
            }
            T t4 = this.f59652a;
            if (t4 != 0) {
                ((UBVI) t4).fetchAd();
            } else {
                a("loadAD");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onWindowFocusChanged(boolean z4) {
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UBVI) t4).onWindowFocusChanged(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLoadAdParams(LoadAdParams loadAdParams) {
        this.f59673j = loadAdParams;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UBVI) t4).setLoadAdParams(loadAdParams);
        }
    }

    @Override // com.qq.e.comm.pi.NFBI
    public void setNegativeFeedbackListener(NegativeFeedbackListener negativeFeedbackListener) {
        this.f59675l.setNegativeFeedbackListener(negativeFeedbackListener);
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setRewardListener(ADRewardListener aDRewardListener) {
        this.f59675l.setAdRewardListener(aDRewardListener);
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.f59676m = serverSideVerificationOptions;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UBVI) t4).setServerSideVerificationOptions(serverSideVerificationOptions);
        }
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void a(Object obj) {
        UBVI ubvi = (UBVI) obj;
        int i4 = this.f59672i;
        this.f59672i = i4;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((UBVI) t4).setRefresh(i4);
        }
        LoadAdParams loadAdParams = this.f59673j;
        this.f59673j = loadAdParams;
        T t5 = this.f59652a;
        if (t5 != 0) {
            ((UBVI) t5).setLoadAdParams(loadAdParams);
        }
        ubvi.setServerSideVerificationOptions(this.f59676m);
        while (this.f59671h.getAndDecrement() > 0) {
            loadAD();
        }
    }
}
