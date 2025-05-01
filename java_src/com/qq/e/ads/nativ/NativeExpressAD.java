package com.qq.e.ads.nativ;

import android.content.Context;
import com.qq.e.ads.NativeAbstractAD;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.adevent.ADEvent;
import com.qq.e.comm.adevent.ADListener;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.listeners.ADRewardListener;
import com.qq.e.comm.listeners.NegativeFeedbackListener;
import com.qq.e.comm.pi.IReward;
import com.qq.e.comm.pi.NEADI;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.util.AdErrorConvertor;
import com.qq.e.comm.util.GDTLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public class NativeExpressAD extends NativeAbstractAD<NEADI> implements IReward {

    /* renamed from: f  reason: collision with root package name */
    private volatile int f59740f;

    /* renamed from: g  reason: collision with root package name */
    private volatile int f59741g;

    /* renamed from: h  reason: collision with root package name */
    private List<Integer> f59742h = Collections.synchronizedList(new ArrayList());

    /* renamed from: i  reason: collision with root package name */
    private VideoOption f59743i;

    /* renamed from: j  reason: collision with root package name */
    private ADSize f59744j;

    /* renamed from: k  reason: collision with root package name */
    private NativeExpressADListener f59745k;

    /* renamed from: l  reason: collision with root package name */
    private final ADListenerAdapter f59746l;

    /* renamed from: m  reason: collision with root package name */
    private LoadAdParams f59747m;

    /* renamed from: n  reason: collision with root package name */
    private volatile ServerSideVerificationOptions f59748n;

    /* loaded from: classes5.dex */
    public static class ADListenerAdapter implements ADListener {

        /* renamed from: a  reason: collision with root package name */
        private NativeExpressADListener f59749a;

        /* renamed from: b  reason: collision with root package name */
        private NativeExpressMediaListener f59750b;

        /* renamed from: c  reason: collision with root package name */
        private NegativeFeedbackListener f59751c;

        /* renamed from: d  reason: collision with root package name */
        private ADRewardListener f59752d;

        public ADListenerAdapter(NativeExpressADListener nativeExpressADListener) {
            this.f59749a = nativeExpressADListener;
        }

        public ADListenerAdapter(NativeExpressMediaListener nativeExpressMediaListener) {
            this.f59750b = nativeExpressMediaListener;
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(ADEvent aDEvent) {
            if (NativeExpressAD.e(this.f59749a, aDEvent) || NativeExpressAD.f(this.f59750b, aDEvent) || NativeExpressAD.h(this.f59751c, aDEvent)) {
                return;
            }
            NativeExpressAD.g(this.f59752d, aDEvent);
        }

        public void setAdRewardListener(ADRewardListener aDRewardListener) {
            this.f59752d = aDRewardListener;
        }

        public void setMediaListener(NativeExpressMediaListener nativeExpressMediaListener) {
            this.f59750b = nativeExpressMediaListener;
        }

        public void setNegativeFeedbackListener(NegativeFeedbackListener negativeFeedbackListener) {
            this.f59751c = negativeFeedbackListener;
        }
    }

    /* loaded from: classes5.dex */
    public interface NativeExpressADListener extends NativeAbstractAD.BasicADListener {
        void onADClicked(NativeExpressADView nativeExpressADView);

        void onADClosed(NativeExpressADView nativeExpressADView);

        void onADExposure(NativeExpressADView nativeExpressADView);

        void onADLeftApplication(NativeExpressADView nativeExpressADView);

        void onADLoaded(List<NativeExpressADView> list);

        void onRenderFail(NativeExpressADView nativeExpressADView);

        void onRenderSuccess(NativeExpressADView nativeExpressADView);
    }

    public NativeExpressAD(Context context, ADSize aDSize, String str, NativeExpressADListener nativeExpressADListener) {
        this.f59745k = nativeExpressADListener;
        this.f59746l = new ADListenerAdapter(nativeExpressADListener);
        if (d(aDSize)) {
            return;
        }
        a(context, str);
    }

    public NativeExpressAD(Context context, ADSize aDSize, String str, NativeExpressADListener nativeExpressADListener, String str2) {
        this.f59745k = nativeExpressADListener;
        this.f59746l = new ADListenerAdapter(nativeExpressADListener);
        if (d(aDSize)) {
            return;
        }
        a(context, str, str2);
    }

    private boolean d(ADSize aDSize) {
        if (aDSize != null) {
            this.f59744j = aDSize;
            return false;
        }
        GDTLogger.e("初始化错误：参数adSize不能为空");
        a(2001);
        return true;
    }

    static boolean e(NativeExpressADListener nativeExpressADListener, ADEvent aDEvent) {
        if (nativeExpressADListener != null) {
            int type = aDEvent.getType();
            if (type == 100) {
                List<NativeExpressADView> list = (List) aDEvent.getParam(List.class);
                if (list != null) {
                    nativeExpressADListener.onADLoaded(list);
                }
            } else if (type == 101) {
                Integer num = (Integer) aDEvent.getParam(Integer.class);
                if (num != null) {
                    nativeExpressADListener.onNoAD(AdErrorConvertor.formatErrorCode(num.intValue()));
                }
            } else if (type == 103) {
                NativeExpressADView nativeExpressADView = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView != null) {
                    nativeExpressADListener.onADExposure(nativeExpressADView);
                }
            } else if (type == 303) {
                NativeExpressADView nativeExpressADView2 = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView2 != null) {
                    nativeExpressADListener.onADLeftApplication(nativeExpressADView2);
                }
            } else if (type == 105) {
                NativeExpressADView nativeExpressADView3 = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView3 != null) {
                    nativeExpressADListener.onADClicked(nativeExpressADView3);
                }
            } else if (type == 106) {
                NativeExpressADView nativeExpressADView4 = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView4 != null) {
                    nativeExpressADListener.onADClosed(nativeExpressADView4);
                    nativeExpressADView4.negativeFeedback();
                }
            } else if (type == 109) {
                NativeExpressADView nativeExpressADView5 = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView5 != null) {
                    nativeExpressADListener.onRenderSuccess(nativeExpressADView5);
                }
            } else if (type == 110) {
                NativeExpressADView nativeExpressADView6 = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class);
                if (nativeExpressADView6 != null) {
                    nativeExpressADListener.onRenderFail(nativeExpressADView6);
                }
            }
            return true;
        }
        return false;
    }

    static boolean f(NativeExpressMediaListener nativeExpressMediaListener, ADEvent aDEvent) {
        NativeExpressADView nativeExpressADView;
        if (nativeExpressMediaListener != null && (nativeExpressADView = (NativeExpressADView) aDEvent.getParam(NativeExpressADView.class)) != null) {
            int type = aDEvent.getType();
            if (type == 201) {
                nativeExpressMediaListener.onVideoCached(nativeExpressADView);
                return true;
            } else if (type == 202) {
                nativeExpressMediaListener.onVideoStart(nativeExpressADView);
                return true;
            } else if (type == 204) {
                nativeExpressMediaListener.onVideoPause(nativeExpressADView);
                return true;
            } else if (type == 206) {
                nativeExpressMediaListener.onVideoComplete(nativeExpressADView);
                return true;
            } else if (type == 207) {
                Integer num = (Integer) aDEvent.getParam(1, Integer.class);
                if (num != null) {
                    nativeExpressMediaListener.onVideoError(nativeExpressADView, AdErrorConvertor.formatErrorCode(num.intValue()));
                    return true;
                }
                return true;
            } else if (type == 301) {
                nativeExpressMediaListener.onVideoPageOpen(nativeExpressADView);
                return true;
            } else if (type == 302) {
                nativeExpressMediaListener.onVideoPageClose(nativeExpressADView);
                return true;
            } else {
                switch (type) {
                    case 209:
                        nativeExpressMediaListener.onVideoInit(nativeExpressADView);
                        return true;
                    case 210:
                        Integer num2 = (Integer) aDEvent.getParam(1, Integer.class);
                        if (num2 != null) {
                            nativeExpressMediaListener.onVideoReady(nativeExpressADView, num2.intValue());
                            return true;
                        }
                        return true;
                    case 211:
                        nativeExpressMediaListener.onVideoLoading(nativeExpressADView);
                        return true;
                }
            }
        }
        return false;
    }

    static boolean g(ADRewardListener aDRewardListener, ADEvent aDEvent) {
        if (aDRewardListener != null && aDEvent.getType() == 104) {
            String str = (String) aDEvent.getParam(String.class);
            if (str != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("transId", str);
                aDRewardListener.onReward(hashMap);
            }
            return true;
        }
        return false;
    }

    static boolean h(NegativeFeedbackListener negativeFeedbackListener, ADEvent aDEvent) {
        if (negativeFeedbackListener != null && aDEvent.getType() == 304) {
            negativeFeedbackListener.onComplainSuccess();
            return true;
        }
        return false;
    }

    @Override // com.qq.e.ads.AbstractAD
    protected Object a(Context context, POFactory pOFactory, String str, String str2, String str3) {
        return pOFactory.getNativeExpressADDelegate(context, this.f59744j, str, str2, str3, this.f59746l);
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int i4) {
        NativeExpressADListener nativeExpressADListener = this.f59745k;
        if (nativeExpressADListener != null) {
            nativeExpressADListener.onNoAD(AdErrorConvertor.formatErrorCode(i4));
        }
    }

    public String getAdNetWorkName() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            return ((NEADI) t4).getAdNetWorkName();
        }
        a("getAdNetWorkName");
        return null;
    }

    public void loadAD(int i4) {
        loadAD(i4, null);
    }

    public void loadAD(int i4, LoadAdParams loadAdParams) {
        if (a()) {
            if (loadAdParams != null) {
                setAdParams(loadAdParams);
            }
            if (!b()) {
                synchronized (this.f59742h) {
                    this.f59742h.add(Integer.valueOf(i4));
                }
                return;
            }
            T t4 = this.f59652a;
            if (t4 == 0) {
                a("loadAD");
                return;
            }
            LoadAdParams loadAdParams2 = this.f59747m;
            NEADI neadi = (NEADI) t4;
            if (loadAdParams2 != null) {
                neadi.loadAd(i4, loadAdParams2);
            } else {
                neadi.loadAd(i4);
            }
        }
    }

    public void setAdParams(LoadAdParams loadAdParams) {
        this.f59747m = loadAdParams;
    }

    public void setMaxVideoDuration(int i4) {
        this.f59741g = i4;
        if (this.f59741g > 0 && this.f59740f > this.f59741g) {
            GDTLogger.e("maxVideoDuration 设置值非法，不得小于minVideoDuration");
        }
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((NEADI) t4).setMaxVideoDuration(this.f59741g);
        }
    }

    public void setMinVideoDuration(int i4) {
        this.f59740f = i4;
        if (this.f59741g > 0 && this.f59740f > this.f59741g) {
            GDTLogger.e("minVideoDuration 设置值非法，不得大于maxVideoDuration");
        }
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((NEADI) t4).setMinVideoDuration(this.f59740f);
        }
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setRewardListener(ADRewardListener aDRewardListener) {
        this.f59746l.setAdRewardListener(aDRewardListener);
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.f59748n = serverSideVerificationOptions;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((NEADI) t4).setServerSideVerificationOptions(serverSideVerificationOptions);
        }
    }

    public void setVideoOption(VideoOption videoOption) {
        this.f59743i = videoOption;
        T t4 = this.f59652a;
        if (t4 == 0 || videoOption == null) {
            return;
        }
        ((NEADI) t4).setVideoOption(videoOption);
    }

    @Override // com.qq.e.ads.NativeAbstractAD, com.qq.e.ads.AbstractAD
    protected void a(Object obj) {
        NEADI neadi = (NEADI) obj;
        neadi.setMinVideoDuration(this.f59740f);
        neadi.setMaxVideoDuration(this.f59741g);
        ((NEADI) this.f59652a).setServerSideVerificationOptions(this.f59748n);
        VideoOption videoOption = this.f59743i;
        if (videoOption != null) {
            setVideoOption(videoOption);
        }
        synchronized (this.f59742h) {
            Iterator<Integer> it2 = this.f59742h.iterator();
            while (it2.hasNext()) {
                T t4 = this.f59652a;
                if (t4 != 0) {
                    if (this.f59747m != null) {
                        ((NEADI) t4).loadAd(it2.next().intValue(), this.f59747m);
                    } else {
                        ((NEADI) t4).loadAd(it2.next().intValue());
                    }
                }
            }
        }
    }
}
