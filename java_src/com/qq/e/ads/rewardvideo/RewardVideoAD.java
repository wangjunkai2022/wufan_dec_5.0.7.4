package com.qq.e.ads.rewardvideo;

import android.app.Activity;
import android.content.Context;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.comm.adevent.ADEvent;
import com.qq.e.comm.adevent.ADListener;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.listeners.NegativeFeedbackListener;
import com.qq.e.comm.pi.NFBI;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.pi.RVADI;
import com.qq.e.comm.util.AdErrorConvertor;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class RewardVideoAD extends LiteAbstractAD<RVADI> implements NFBI {
    public static final int REWARD_TYPE_PAGE = 1;
    public static final int REWARD_TYPE_VIDEO = 0;

    /* renamed from: g  reason: collision with root package name */
    private final RewardVideoADListener f59781g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f59782h;

    /* renamed from: i  reason: collision with root package name */
    private LoadAdParams f59783i;

    /* renamed from: j  reason: collision with root package name */
    private ServerSideVerificationOptions f59784j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f59785k;

    /* renamed from: l  reason: collision with root package name */
    private final ADListenerAdapter f59786l;

    /* loaded from: classes5.dex */
    public static class ADListenerAdapter implements ADListener {

        /* renamed from: a  reason: collision with root package name */
        private NegativeFeedbackListener f59787a;
        public RewardVideoADListener adListener;

        public ADListenerAdapter(RewardVideoADListener rewardVideoADListener) {
            this.adListener = rewardVideoADListener;
        }

        static void a(ADListenerAdapter aDListenerAdapter, NegativeFeedbackListener negativeFeedbackListener) {
            aDListenerAdapter.f59787a = negativeFeedbackListener;
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(ADEvent aDEvent) {
            int type = aDEvent.getType();
            if (type == 100) {
                this.adListener.onADLoad();
            } else if (type == 201) {
                this.adListener.onVideoCached();
            } else if (type == 206) {
                this.adListener.onVideoComplete();
            } else if (type == 304) {
                NegativeFeedbackListener negativeFeedbackListener = this.f59787a;
                if (negativeFeedbackListener != null) {
                    negativeFeedbackListener.onComplainSuccess();
                }
            } else {
                switch (type) {
                    case 102:
                        this.adListener.onADShow();
                        return;
                    case 103:
                        this.adListener.onADExpose();
                        return;
                    case 104:
                        String str = (String) aDEvent.getParam(String.class);
                        if (str != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("transId", str);
                            Integer num = (Integer) aDEvent.getParam(1, Integer.class);
                            if (num != null) {
                                hashMap.put(ServerSideVerificationOptions.ACTION, num);
                            }
                            this.adListener.onReward(hashMap);
                            return;
                        }
                        return;
                    case 105:
                        this.adListener.onADClick();
                        return;
                    case 106:
                        this.adListener.onADClose();
                        return;
                    case 107:
                        Integer num2 = (Integer) aDEvent.getParam(Integer.class);
                        if (num2 != null) {
                            this.adListener.onError(AdErrorConvertor.formatErrorCode(num2.intValue()));
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public RewardVideoAD(Context context, String str, RewardVideoADListener rewardVideoADListener) {
        this(context, str, rewardVideoADListener, true);
    }

    public RewardVideoAD(Context context, String str, RewardVideoADListener rewardVideoADListener, boolean z4) {
        this(rewardVideoADListener, z4);
        a(context, str);
    }

    public RewardVideoAD(Context context, String str, RewardVideoADListener rewardVideoADListener, boolean z4, String str2) {
        this(rewardVideoADListener, z4);
        a(context, str, str2);
    }

    private RewardVideoAD(RewardVideoADListener rewardVideoADListener, boolean z4) {
        this.f59783i = null;
        this.f59785k = z4;
        this.f59781g = rewardVideoADListener;
        this.f59786l = new ADListenerAdapter(rewardVideoADListener);
    }

    @Override // com.qq.e.ads.AbstractAD
    protected Object a(Context context, POFactory pOFactory, String str, String str2, String str3) {
        return pOFactory.getRewardVideoADDelegate(context, str, str2, str3, this.f59786l);
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int i4) {
        RewardVideoADListener rewardVideoADListener = this.f59781g;
        if (rewardVideoADListener != null) {
            rewardVideoADListener.onError(AdErrorConvertor.formatErrorCode(i4));
        }
    }

    public String getAdNetWorkName() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            return ((RVADI) t4).getAdNetWorkName();
        }
        a("getAdNetWorkName");
        return null;
    }

    public int getRewardAdType() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            return ((RVADI) t4).getRewardAdType();
        }
        a("getRewardAdType");
        return 0;
    }

    public int getVideoDuration() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            return ((RVADI) t4).getVideoDuration();
        }
        a("getVideoDuration");
        return 0;
    }

    public boolean hasShown() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            return ((RVADI) t4).hasShown();
        }
        a("hasShown");
        return false;
    }

    public void loadAD() {
        if (a()) {
            if (!b()) {
                this.f59782h = true;
                return;
            }
            T t4 = this.f59652a;
            if (t4 != 0) {
                ((RVADI) t4).loadAD();
            } else {
                a("loadAD");
            }
        }
    }

    public void setLoadAdParams(LoadAdParams loadAdParams) {
        this.f59783i = loadAdParams;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((RVADI) t4).setLoadAdParams(loadAdParams);
        }
    }

    @Override // com.qq.e.comm.pi.NFBI
    public void setNegativeFeedbackListener(NegativeFeedbackListener negativeFeedbackListener) {
        ADListenerAdapter.a(this.f59786l, negativeFeedbackListener);
    }

    public void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.f59784j = serverSideVerificationOptions;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((RVADI) t4).setServerSideVerificationOptions(serverSideVerificationOptions);
        }
    }

    public void showAD() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((RVADI) t4).showAD();
        } else {
            a("showAD");
        }
    }

    public void showAD(Activity activity) {
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((RVADI) t4).showAD(activity);
        } else {
            a("showAD");
        }
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void a(Object obj) {
        RVADI rvadi = (RVADI) obj;
        rvadi.setVolumeOn(this.f59785k);
        rvadi.setLoadAdParams(this.f59783i);
        rvadi.setServerSideVerificationOptions(this.f59784j);
        if (this.f59782h) {
            loadAD();
        }
    }
}
