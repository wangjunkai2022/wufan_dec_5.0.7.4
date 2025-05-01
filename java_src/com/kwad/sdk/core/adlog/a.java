package com.kwad.sdk.core.adlog;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.ksad.json.annotation.KsJson;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.track.AdTrackLog;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.h;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.bh;
import com.kwad.sdk.utils.t;
import com.qq.e.comm.pi.IBidding;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class a extends com.kwad.sdk.core.network.b {
    int aqf;
    @NonNull
    private final com.kwad.sdk.core.adlog.c.a aqg;
    private final AdTemplate mAdTemplate;

    @KsJson
    /* renamed from: com.kwad.sdk.core.adlog.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0514a extends com.kwad.sdk.core.response.a.a {
        public String aqi;
        public int aqj;
        public int aqk;
        public int aql;
        public int aqm;
        public JSONObject aqn;
        public int aqo;
        public int aqp;
        @Nullable
        public AdTrackLog aqq;
        public String templateId;
        public int aqh = -1;
        public long duration = -1;
        public int showLiveStatus = -1;
        public int showLiveStyle = -1;

        public final AdTrackLog a(AdTemplate adTemplate, String str, String str2, com.kwad.sdk.f.a<AdTrackLog> aVar) {
            h hVar;
            if (adTemplate == null || (hVar = (h) ServiceProvider.get(h.class)) == null || !hVar.zz()) {
                return null;
            }
            AdTrackLog adTrackLog = new AdTrackLog(str, str2);
            this.aqq = adTrackLog;
            adTrackLog.bindABParams(adTemplate);
            if (aVar != null) {
                aVar.accept(this.aqq);
            }
            return this.aqq;
        }

        @Override // com.kwad.sdk.core.response.a.a
        public void afterToJson(JSONObject jSONObject) {
            super.afterToJson(jSONObject);
            int i4 = this.aqh;
            if (i4 != -1) {
                t.putValue(jSONObject, "shield_reason", i4);
            }
            long j4 = this.duration;
            if (j4 != -1) {
                t.putValue(jSONObject, "duration", j4);
            }
            int i5 = this.showLiveStatus;
            if (i5 != -1) {
                t.putValue(jSONObject, "show_live_status", i5);
            }
            int i6 = this.showLiveStyle;
            if (i6 != -1) {
                t.putValue(jSONObject, "show_live_style", i6);
            }
            AdTrackLog adTrackLog = this.aqq;
            if (adTrackLog != null) {
                t.putValue(jSONObject, "ad_track_log", adTrackLog.toJson().toString());
            }
            JSONObject jSONObject2 = this.aqn;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, this.aqn.get(next));
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public a(@NonNull com.kwad.sdk.core.adlog.c.a aVar) {
        this.aqg = aVar;
        this.mAdTemplate = aVar.adTemplate;
        this.aqf = aVar.apT;
    }

    private void BM() {
        JSONObject jSONObject = this.aqg.aqN;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        t.putValue(jSONObject, "clientTimestamp", System.currentTimeMillis());
        putBody("extData", jSONObject.toString());
    }

    private void a(String str, @Nullable com.kwad.sdk.core.adlog.c.a aVar) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        int i4 = aVar.arp;
        if (i4 >= 0) {
            putBody("adOrder", i4);
        }
        int i5 = aVar.Lg;
        if (i5 >= 0) {
            putBody("adInterstitialSource", i5);
        }
        if (!TextUtils.isEmpty(aVar.aqS)) {
            putBody("adRenderArea", aVar.aqS);
        }
        putBody("adxResult", aVar.adxResult);
        int i6 = aVar.art;
        if (i6 != 0) {
            putBody("fingerSwipeType", i6);
        }
        int i7 = aVar.aru;
        if (i7 != 0) {
            putBody("fingerSwipeDistance", i7);
        }
        int i8 = aVar.arm;
        if (i8 != -1) {
            putBody("installStatus", i8);
        }
        C0514a c0514a = aVar.Li;
        if (c0514a != null) {
            putBody("clientExtData", c0514a.toJson().toString());
        }
        String str2 = aVar.arw;
        if (str2 != null) {
            putBody("clientPkFailAdInfo", str2);
        }
        int i9 = aVar.Lk;
        if (i9 != -1) {
            putBody("triggerType", i9);
        }
        int i10 = aVar.Lj;
        if (i10 != 0) {
            putBody("photoSizeStyle", i10);
        }
    }

    private void b(String str, @Nullable com.kwad.sdk.core.adlog.c.a aVar) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        int i4 = aVar.kl;
        if (i4 != 0) {
            putBody("itemClickType", i4);
        }
        if (!TextUtils.isEmpty(aVar.Lh)) {
            putBody("payload", aVar.Lh);
        }
        int i5 = aVar.are;
        if (i5 != 0) {
            putBody("adAggPageSource", i5);
        }
        int i6 = aVar.arp;
        if (i6 >= 0) {
            putBody("adOrder", i6);
        }
        int i7 = aVar.Lg;
        if (i7 >= 0) {
            putBody("adInterstitialSource", i7);
        }
        int i8 = aVar.Lk;
        if (i8 != -1) {
            putBody("triggerType", i8);
        }
        int i9 = aVar.arv;
        if (i9 != 0) {
            putBody("cardCloseType", i9);
        }
        putBody("adxResult", aVar.adxResult);
        double d5 = aVar.ko;
        if (d5 > 0.0d) {
            putBody("splashShakeAcceleration", d5);
        }
        if (!TextUtils.isEmpty(aVar.arq)) {
            putBody("splashInteractionRotateAngle", aVar.arq);
        }
        int i10 = aVar.art;
        if (i10 != 0) {
            putBody("fingerSwipeType", i10);
        }
        int i11 = aVar.aru;
        if (i11 != 0) {
            putBody("fingerSwipeDistance", i11);
        }
        long j4 = aVar.vA;
        if (j4 > 0) {
            putBody("playedDuration", j4);
        }
        int i12 = aVar.aro;
        if (i12 > 0) {
            putBody("playedRate", i12);
        }
        String str2 = aVar.arw;
        if (str2 != null) {
            putBody("clientPkFailAdInfo", str2);
        }
        int i13 = aVar.aqW;
        if (i13 != -1) {
            putBody("retainCodeType", i13);
        }
        C0514a c0514a = aVar.Li;
        if (c0514a != null) {
            putBody("clientExtData", c0514a.toJson().toString());
        }
        int i14 = aVar.Lj;
        if (i14 != 0) {
            putBody("photoSizeStyle", i14);
        }
    }

    private void c(String str, @Nullable com.kwad.sdk.core.adlog.c.a aVar) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        int i4 = aVar.aqQ;
        if (i4 != 0) {
            putBody("itemCloseType", i4);
        }
        int i5 = aVar.aqO;
        if (i5 > 0) {
            putBody("photoPlaySecond", i5);
        }
        int i6 = aVar.aqP;
        if (i6 != 0) {
            putBody("awardReceiveStage", i6);
        }
        int i7 = aVar.aqR;
        if (i7 != 0) {
            putBody("elementType", i7);
        }
        if (!TextUtils.isEmpty(aVar.Lh)) {
            putBody("payload", aVar.Lh);
        }
        C0514a c0514a = aVar.Li;
        if (c0514a != null) {
            putBody("clientExtData", c0514a.toJson().toString());
        }
        int i8 = aVar.aqX;
        if (i8 > 0) {
            putBody("deeplinkType", i8);
        }
        if (!TextUtils.isEmpty(aVar.aqY)) {
            putBody("deeplinkAppName", aVar.aqY);
        }
        int i9 = aVar.aqZ;
        if (i9 != 0) {
            putBody("deeplinkFailedReason", i9);
        }
        int i10 = aVar.downloadSource;
        if (i10 > 0) {
            putBody("downloadSource", i10);
        }
        int i11 = aVar.arv;
        if (i11 != 0) {
            putBody("cardCloseType", i11);
        }
        int i12 = aVar.ara;
        if (i12 > 0) {
            putBody("isPackageChanged", i12);
        }
        putBody("installedFrom", aVar.arb);
        putBody("isChangedEndcard", aVar.ard);
        int i13 = aVar.are;
        if (i13 != 0) {
            putBody("adAggPageSource", i13);
        }
        String str2 = aVar.arc;
        if (str2 != null) {
            putBody("downloadFailedReason", str2);
        }
        if (!bh.isNullString(aVar.arg)) {
            putBody("installedPackageName", aVar.arg);
        }
        if (!bh.isNullString(aVar.arf)) {
            putBody("serverPackageName", aVar.arf);
        }
        int i14 = aVar.ari;
        if (i14 > 0) {
            putBody("closeButtonClickTime", i14);
        }
        int i15 = aVar.arh;
        if (i15 > 0) {
            putBody("closeButtonImpressionTime", i15);
        }
        int i16 = aVar.downloadStatus;
        if (i16 >= 0) {
            putBody("downloadStatus", i16);
        }
        long j4 = aVar.arj;
        if (j4 > 0) {
            putBody("landingPageLoadedDuration", j4);
        }
        long j5 = aVar.LJ;
        if (j5 > 0) {
            putBody("leaveTime", j5);
        }
        long j6 = aVar.ark;
        if (j6 > 0) {
            putBody("adItemClickBackDuration", j6);
        }
        int i17 = aVar.aqW;
        if (i17 != -1) {
            putBody("retainCodeType", i17);
        }
        long j7 = aVar.aqT;
        if (j7 > -1) {
            putBody(IBidding.HIGHEST_LOSS_PRICE, j7);
        }
        int i18 = aVar.aqU;
        if (i18 >= 0) {
            putBody("impFailReason", i18);
        }
        long j8 = aVar.aqV;
        if (j8 > -1) {
            putBody("winEcpm", j8);
        }
        int i19 = aVar.adnType;
        if (i19 > 0) {
            putBody("adnType", i19);
        }
        if (!TextUtils.isEmpty(aVar.adnName)) {
            putBody(MediationConstant.KEY_ADN_NAME, aVar.adnName);
        }
        putBody("downloadCardType", aVar.arn);
        putBody("landingPageType", aVar.OP);
        int i20 = aVar.Lg;
        if (i20 >= 0) {
            putBody("adInterstitialSource", i20);
        }
        int i21 = aVar.arr;
        if (i21 > 0) {
            putBody("downloadInstallType", i21);
        }
        int i22 = aVar.art;
        if (i22 != 0) {
            putBody("fingerSwipeType", i22);
        }
        int i23 = aVar.aru;
        if (i23 != 0) {
            putBody("fingerSwipeDistance", i23);
        }
        int i24 = aVar.ars;
        if (i24 > 0) {
            putBody("businessSceneType", i24);
        }
        long j9 = aVar.vA;
        if (j9 > 0) {
            putBody("playedDuration", j9);
        }
        int i25 = aVar.aro;
        if (i25 > 0) {
            putBody("playedRate", i25);
        }
        int i26 = aVar.arl;
        if (i26 != -1) {
            putBody("appStorePageType", i26);
        }
        int i27 = aVar.Lk;
        if (i27 != -1) {
            putBody("triggerType", i27);
        }
        int i28 = aVar.Lj;
        if (i28 != 0) {
            putBody("photoSizeStyle", i28);
        }
    }

    @Override // com.kwad.sdk.core.network.b
    public final void buildBaseBody() {
    }

    @Override // com.kwad.sdk.core.network.b
    public final void buildBaseHeader() {
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public final JSONObject getBody() {
        return this.mBodyParams;
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public final String getUrl() {
        String replaceFirst;
        String replaceFirst2;
        Context context = ServiceProvider.getContext();
        AdInfo dS = e.dS(this.mAdTemplate);
        int i4 = this.aqf;
        if (i4 == 1) {
            String str = dS.adBaseInfo.showUrl;
            if (this.mAdTemplate.mBidEcpm == 0 && ((h) ServiceProvider.get(h.class)).zo()) {
                replaceFirst2 = str.replaceFirst("__PR__", String.valueOf(com.kwad.sdk.core.response.b.a.aQ(e.dS(this.mAdTemplate))));
            } else {
                replaceFirst2 = str.replaceFirst("__PR__", String.valueOf(this.mAdTemplate.mBidEcpm));
            }
            replaceFirst = replaceFirst2.replaceFirst("__TYPE__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerType)).replaceFirst("__BEHAVIOR__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerBehavior));
            a(replaceFirst, this.aqg);
            a(replaceFirst, this.mAdTemplate, this.aqg);
        } else if (i4 == 2) {
            replaceFirst = ac.am(context, ac.a(dS.adBaseInfo.clickUrl, this.aqg.kn)).replaceFirst("__PR__", String.valueOf(this.mAdTemplate.mBidEcpm)).replaceFirst("__TYPE__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerType)).replaceFirst("__BEHAVIOR__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerBehavior));
            b(replaceFirst, this.aqg);
            a(replaceFirst, this.mAdTemplate, this.aqg);
        } else {
            replaceFirst = dS.adBaseInfo.convUrl.replaceFirst("__ACTION__", String.valueOf(i4)).replaceFirst("__PR__", String.valueOf(this.mAdTemplate.mBidEcpm)).replaceFirst("__TYPE__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerType)).replaceFirst("__BEHAVIOR__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerBehavior));
            c(replaceFirst, this.aqg);
        }
        BM();
        return replaceFirst;
    }

    private void a(String str, AdTemplate adTemplate, @Nullable com.kwad.sdk.core.adlog.c.a aVar) {
        if (TextUtils.isEmpty(str) || adTemplate == null) {
            return;
        }
        int i4 = adTemplate.mInitVoiceStatus;
        if (i4 != 0) {
            putBody("initVoiceStatus", i4);
        }
        if (this.mAdTemplate.mBidEcpm == 0) {
            putBody("ecpmType", 2);
        } else {
            putBody("ecpmType", 1);
        }
        if (aVar == null) {
            return;
        }
        int i5 = aVar.are;
        if (i5 != 0) {
            putBody("adAggPageSource", i5);
        }
        if (TextUtils.isEmpty(aVar.Lh)) {
            return;
        }
        putBody("payload", aVar.Lh);
    }
}
