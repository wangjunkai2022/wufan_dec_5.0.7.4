package com.bytedance.sdk.openadsdk.p.vv;

import android.util.Pair;
import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CSJAdError;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
import com.bytedance.sdk.openadsdk.ISplashCardListener;
import com.bytedance.sdk.openadsdk.ISplashClickEyeListener;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.TTSplashAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdClassLoader;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationSplashManager;
import com.bytedance.sdk.openadsdk.mediation.vv.vv.i;
import com.bytedance.sdk.openadsdk.mediation.vv.vv.o;
import com.bytedance.sdk.openadsdk.mediation.vv.vv.p;
import com.bytedance.sdk.openadsdk.n.vv.vv.vv.u;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class vv {

    /* renamed from: com.bytedance.sdk.openadsdk.p.vv.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0228vv implements TTAdNative {
        private final vv vv;

        protected C0228vv(vv vvVar) {
            this.vv = vvVar;
        }

        private ValueSet vv(AdSlot adSlot) {
            a k4 = a.k(com.bytedance.sdk.openadsdk.p.vv.p.m.m(adSlot));
            k4.h(8302, MediationAdClassLoader.getInstance());
            if (adSlot.getMediationAdSlot() != null) {
                k4.h(8260028, new o(adSlot.getMediationAdSlot()));
                k4.h(260027, adSlot.getMediationAdSlot());
            }
            return k4.a();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadBannerExpressAd(AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
            try {
                this.vv.wv(vv(adSlot), new com.bytedance.sdk.openadsdk.n.vv.vv.vv.o(nativeExpressAdListener));
            } catch (Exception e5) {
                if (nativeExpressAdListener != null) {
                    Pair<Integer, String> vv = this.vv.vv(e5);
                    nativeExpressAdListener.onError(((Integer) vv.first).intValue(), (String) vv.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadDrawFeedAd(AdSlot adSlot, TTAdNative.DrawFeedAdListener drawFeedAdListener) {
            try {
                this.vv.p(vv(adSlot), new com.bytedance.sdk.openadsdk.mediation.vv.vv.m(drawFeedAdListener));
            } catch (Exception e5) {
                if (drawFeedAdListener != null) {
                    Pair<Integer, String> vv = this.vv.vv(e5);
                    drawFeedAdListener.onError(((Integer) vv.first).intValue(), (String) vv.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadExpressDrawFeedAd(AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
            try {
                this.vv.qv(vv(adSlot), new com.bytedance.sdk.openadsdk.n.vv.vv.vv.o(nativeExpressAdListener));
            } catch (Exception e5) {
                if (nativeExpressAdListener != null) {
                    Pair<Integer, String> vv = this.vv.vv(e5);
                    nativeExpressAdListener.onError(((Integer) vv.first).intValue(), (String) vv.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadFeedAd(AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
            try {
                this.vv.vv(vv(adSlot), new p(feedAdListener));
            } catch (Exception e5) {
                if (feedAdListener != null) {
                    Pair<Integer, String> vv = this.vv.vv(e5);
                    feedAdListener.onError(((Integer) vv.first).intValue(), (String) vv.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadFullScreenVideoAd(AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
            try {
                this.vv.u(vv(adSlot), new i(fullScreenVideoAdListener));
            } catch (Exception e5) {
                if (fullScreenVideoAdListener != null) {
                    Pair<Integer, String> vv = this.vv.vv(e5);
                    fullScreenVideoAdListener.onError(((Integer) vv.first).intValue(), (String) vv.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadInteractionExpressAd(AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadNativeAd(AdSlot adSlot, TTAdNative.NativeAdListener nativeAdListener) {
            try {
                this.vv.i(vv(adSlot), new com.bytedance.sdk.openadsdk.n.vv.vv.vv.i(nativeAdListener));
            } catch (Exception e5) {
                if (nativeAdListener != null) {
                    Pair<Integer, String> vv = this.vv.vv(e5);
                    nativeAdListener.onError(((Integer) vv.first).intValue(), (String) vv.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadNativeExpressAd(AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
            try {
                this.vv.n(vv(adSlot), new com.bytedance.sdk.openadsdk.n.vv.vv.vv.o(nativeExpressAdListener));
            } catch (Exception e5) {
                if (nativeExpressAdListener != null) {
                    Pair<Integer, String> vv = this.vv.vv(e5);
                    nativeExpressAdListener.onError(((Integer) vv.first).intValue(), (String) vv.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadRewardVideoAd(AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
            try {
                this.vv.o(vv(adSlot), new u(rewardVideoAdListener));
            } catch (Exception e5) {
                if (rewardVideoAdListener != null) {
                    Pair<Integer, String> vv = this.vv.vv(e5);
                    rewardVideoAdListener.onError(((Integer) vv.first).intValue(), (String) vv.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadSplashAd(AdSlot adSlot, TTAdNative.SplashAdListener splashAdListener, int i4) {
            vv(adSlot, splashAdListener, i4);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadStream(AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
            try {
                this.vv.m(vv(adSlot), new p(feedAdListener));
            } catch (Exception e5) {
                if (feedAdListener != null) {
                    Pair<Integer, String> vv = this.vv.vv(e5);
                    feedAdListener.onError(((Integer) vv.first).intValue(), (String) vv.second);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadSplashAd(AdSlot adSlot, TTAdNative.CSJSplashAdListener cSJSplashAdListener, int i4) {
            try {
                this.vv.vv(vv(adSlot), new m(cSJSplashAdListener), i4);
            } catch (Exception e5) {
                if (cSJSplashAdListener != null) {
                    final Pair<Integer, String> vv = this.vv.vv(e5);
                    cSJSplashAdListener.onSplashLoadFail(new CSJAdError() { // from class: com.bytedance.sdk.openadsdk.p.vv.vv.vv.1
                        @Override // com.bytedance.sdk.openadsdk.CSJAdError
                        public int getCode() {
                            return ((Integer) vv.first).intValue();
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJAdError
                        public String getMsg() {
                            return (String) vv.second;
                        }
                    });
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadSplashAd(AdSlot adSlot, TTAdNative.SplashAdListener splashAdListener) {
            vv(adSlot, splashAdListener, -1);
        }

        private void vv(AdSlot adSlot, final TTAdNative.SplashAdListener splashAdListener, int i4) {
            loadSplashAd(adSlot, new TTAdNative.CSJSplashAdListener() { // from class: com.bytedance.sdk.openadsdk.p.vv.vv.vv.2
                @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
                public void onSplashLoadFail(CSJAdError cSJAdError) {
                    String str;
                    if (splashAdListener != null) {
                        int i5 = -1;
                        if (cSJAdError != null) {
                            i5 = cSJAdError.getCode();
                            str = cSJAdError.getMsg();
                        } else {
                            str = "splash load fail";
                        }
                        if (i5 == 23) {
                            splashAdListener.onTimeout();
                        } else {
                            splashAdListener.onError(i5, str);
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
                public void onSplashLoadSuccess(CSJSplashAd cSJSplashAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
                public void onSplashRenderFail(CSJSplashAd cSJSplashAd, CSJAdError cSJAdError) {
                    String str;
                    if (splashAdListener != null) {
                        int i5 = -1;
                        if (cSJAdError != null) {
                            i5 = cSJAdError.getCode();
                            str = cSJAdError.getMsg();
                        } else {
                            str = "splash render fail";
                        }
                        if (i5 == 23) {
                            splashAdListener.onTimeout();
                        } else {
                            splashAdListener.onError(i5, str);
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
                public void onSplashRenderSuccess(CSJSplashAd cSJSplashAd) {
                    if (splashAdListener == null) {
                        return;
                    }
                    splashAdListener.onSplashAdLoad(C0228vv.this.vv(cSJSplashAd));
                }
            }, i4);
        }

        public TTSplashAd vv(final CSJSplashAd cSJSplashAd) {
            if (cSJSplashAd == null) {
                return null;
            }
            final TTSplashAd.AdInteractionListener[] adInteractionListenerArr = new TTSplashAd.AdInteractionListener[1];
            return new TTSplashAd() { // from class: com.bytedance.sdk.openadsdk.p.vv.vv.vv.3
                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public int getInteractionType() {
                    CSJSplashAd cSJSplashAd2 = cSJSplashAd;
                    if (cSJSplashAd2 == null) {
                        return 0;
                    }
                    return cSJSplashAd2.getInteractionType();
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public Map<String, Object> getMediaExtraInfo() {
                    return cSJSplashAd.getMediaExtraInfo();
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public MediationSplashManager getMediationManager() {
                    return cSJSplashAd.getMediationManager();
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public int[] getSplashClickEyeSizeToDp() {
                    return cSJSplashAd.getSplashClickEyeSizeToDp();
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public View getSplashView() {
                    CSJSplashAd cSJSplashAd2 = cSJSplashAd;
                    if (cSJSplashAd2 == null) {
                        return null;
                    }
                    return cSJSplashAd2.getSplashView();
                }

                @Override // com.bytedance.sdk.openadsdk.TTClientBidding
                public void loss(Double d5, String str, String str2) {
                    cSJSplashAd.loss(d5, str, str2);
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public void renderExpressAd(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
                }

                @Override // com.bytedance.sdk.openadsdk.TTClientBidding
                public void setAdInteractionListener(TTAdInteractionListener tTAdInteractionListener) {
                    cSJSplashAd.setAdInteractionListener(tTAdInteractionListener);
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public void setDownloadListener(TTAppDownloadListener tTAppDownloadListener) {
                    if (tTAppDownloadListener == null) {
                        return;
                    }
                    cSJSplashAd.setDownloadListener(tTAppDownloadListener);
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public void setNotAllowSdkCountdown() {
                    cSJSplashAd.hideSkipButton();
                }

                @Override // com.bytedance.sdk.openadsdk.TTClientBidding
                public void setPrice(Double d5) {
                    cSJSplashAd.setPrice(d5);
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public void setSplashCardListener(final ISplashCardListener iSplashCardListener) {
                    if (iSplashCardListener == null) {
                        return;
                    }
                    cSJSplashAd.setSplashCardListener(new CSJSplashAd.SplashCardListener() { // from class: com.bytedance.sdk.openadsdk.p.vv.vv.vv.3.3
                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashCardListener
                        public void onSplashCardClick() {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            TTSplashAd.AdInteractionListener[] adInteractionListenerArr2 = adInteractionListenerArr;
                            if (adInteractionListenerArr2[0] != null) {
                                adInteractionListenerArr2[0].onAdClicked(cSJSplashAd.getSplashView(), cSJSplashAd.getInteractionType());
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashCardListener
                        public void onSplashCardClose() {
                            iSplashCardListener.onSplashClickEyeClose();
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashCardListener
                        public void onSplashCardReadyToShow(CSJSplashAd cSJSplashAd2) {
                            iSplashCardListener.setSupportSplashClickEye(true);
                            iSplashCardListener.onSplashEyeReady();
                        }
                    });
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public void setSplashClickEyeListener(final ISplashClickEyeListener iSplashClickEyeListener) {
                    if (iSplashClickEyeListener == null) {
                        return;
                    }
                    cSJSplashAd.setSplashClickEyeListener(new CSJSplashAd.SplashClickEyeListener() { // from class: com.bytedance.sdk.openadsdk.p.vv.vv.vv.3.2
                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
                        public void onSplashClickEyeClick() {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            TTSplashAd.AdInteractionListener[] adInteractionListenerArr2 = adInteractionListenerArr;
                            if (adInteractionListenerArr2[0] != null) {
                                adInteractionListenerArr2[0].onAdClicked(cSJSplashAd.getSplashView(), cSJSplashAd.getInteractionType());
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
                        public void onSplashClickEyeClose() {
                            iSplashClickEyeListener.onSplashClickEyeAnimationFinish();
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
                        public void onSplashClickEyeReadyToShow(CSJSplashAd cSJSplashAd2) {
                            iSplashClickEyeListener.isSupportSplashClickEye(true);
                            iSplashClickEyeListener.onSplashClickEyeAnimationStart();
                        }
                    });
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public void setSplashInteractionListener(final TTSplashAd.AdInteractionListener adInteractionListener) {
                    CSJSplashAd cSJSplashAd2;
                    if (adInteractionListener == null || (cSJSplashAd2 = cSJSplashAd) == null) {
                        return;
                    }
                    adInteractionListenerArr[0] = adInteractionListener;
                    cSJSplashAd2.setSplashAdListener(new CSJSplashAd.SplashAdListener() { // from class: com.bytedance.sdk.openadsdk.p.vv.vv.vv.3.1
                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                        public void onSplashAdClick(CSJSplashAd cSJSplashAd3) {
                            if (cSJSplashAd3 == null) {
                                adInteractionListener.onAdClicked(null, -1);
                            } else {
                                adInteractionListener.onAdClicked(cSJSplashAd3.getSplashView(), cSJSplashAd3.getInteractionType());
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                        public void onSplashAdClose(CSJSplashAd cSJSplashAd3, int i4) {
                            if (i4 == 1) {
                                adInteractionListener.onAdSkip();
                            } else if (i4 == 2 || i4 == 4) {
                                adInteractionListener.onAdTimeOver();
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                        public void onSplashAdShow(CSJSplashAd cSJSplashAd3) {
                            if (cSJSplashAd3 == null) {
                                adInteractionListener.onAdShow(null, -1);
                            } else {
                                adInteractionListener.onAdShow(cSJSplashAd3.getSplashView(), cSJSplashAd3.getInteractionType());
                            }
                        }
                    });
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public void splashClickEyeAnimationFinish() {
                    cSJSplashAd.showSplashClickEyeView(null);
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public void startClickEye(boolean z4) {
                    cSJSplashAd.startClickEye();
                }

                @Override // com.bytedance.sdk.openadsdk.TTClientBidding
                public void win(Double d5) {
                    cSJSplashAd.win(d5);
                }

                @Override // com.bytedance.sdk.openadsdk.TTSplashAd
                public void startClickEye() {
                    cSJSplashAd.startClickEye();
                }
            };
        }
    }

    public abstract void i(ValueSet valueSet, Bridge bridge);

    public abstract void m(ValueSet valueSet, Bridge bridge);

    public abstract void n(ValueSet valueSet, Bridge bridge);

    public abstract void o(ValueSet valueSet, Bridge bridge);

    public abstract void p(ValueSet valueSet, Bridge bridge);

    public abstract void qv(ValueSet valueSet, Bridge bridge);

    public abstract void u(ValueSet valueSet, Bridge bridge);

    public abstract Pair<Integer, String> vv(Exception exc);

    public TTAdNative vv() {
        return new C0228vv(this);
    }

    public abstract void vv(ValueSet valueSet, Bridge bridge);

    public abstract void vv(ValueSet valueSet, Bridge bridge, int i4);

    public abstract void wv(ValueSet valueSet, Bridge bridge);
}
