package com.kwad.sdk.commercial.e;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.commercial.d;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.bo;
import com.tencent.cos.common.COSHttpResponseKey;
/* loaded from: classes5.dex */
public final class a {
    public static void a(@Nullable SceneImpl sceneImpl, long j4, String str) {
        if (sceneImpl == null) {
            return;
        }
        try {
            com.kwad.sdk.commercial.b.d(com.kwad.sdk.commercial.c.Br().cz(ILoggerReporter.Category.ERROR_LOG).i(0.01d).a(d.ca(sceneImpl.getAdStyle())).N("ad_sdk_ad_parse_performance", "default").t(c.Bw().cI(str).setPosId(sceneImpl.posId).setLlsid(j4)));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void bB(@NonNull AdTemplate adTemplate) {
        try {
            if (adTemplate.llsid == 0) {
                c(adTemplate, "llsid", "");
            }
            if (e.ec(adTemplate) == 0) {
                c(adTemplate, "create_id", "");
            }
            AdInfo dS = e.dS(adTemplate);
            int i4 = dS.adBaseInfo.adOperationType;
            if (i4 == 1) {
                String cP = com.kwad.sdk.core.response.b.a.cP(dS);
                if (bo.hk(cP)) {
                    c(adTemplate, COSHttpResponseKey.DOWNLOAD_URL, cP);
                }
            } else if (i4 == 2) {
                String aR = com.kwad.sdk.core.response.b.a.aR(dS);
                if (bo.hk(aR)) {
                    c(adTemplate, "h5_url", aR);
                }
            }
            AdInfo.AdMaterialInfo.MaterialFeature N = com.kwad.sdk.core.response.b.a.N(dS);
            int i5 = N.featureType;
            String str = N.materialUrl;
            if (i5 == 1) {
                if (bo.hk(str)) {
                    c(adTemplate, "video_url", str);
                }
            } else if (i5 == 2) {
                if (bo.hk(str)) {
                    c(adTemplate, "image_url", str);
                }
            } else if (i5 == 3) {
                long ch = com.kwad.sdk.core.response.b.a.ch(dS);
                String bf = com.kwad.sdk.core.response.b.a.bf(dS);
                if (ch == 0) {
                    c(adTemplate, "live_author_id", "");
                } else if (TextUtils.isEmpty(bf)) {
                    c(adTemplate, "live_stream_id", bf);
                }
            }
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void c(AdTemplate adTemplate, String str, String str2) {
        com.kwad.sdk.commercial.b.d(com.kwad.sdk.commercial.c.Br().cz(ILoggerReporter.Category.ERROR_LOG).i(0.01d).a(d.aT(adTemplate)).N("ad_sdk_ad_data_performance", "error_name").t(b.Bv().cG(str).cH(str2).setAdTemplate(adTemplate)));
    }

    public static void e(AdTemplate adTemplate, String str) {
        c(adTemplate, "tk_template_id", str);
    }

    public static void a(@Nullable SceneImpl sceneImpl, long j4, String str, String str2) {
        if (sceneImpl == null) {
            return;
        }
        try {
            com.kwad.sdk.commercial.b.d(com.kwad.sdk.commercial.c.Br().cz(ILoggerReporter.Category.ERROR_LOG).i(0.01d).a(d.ca(sceneImpl.getAdStyle())).N("ad_sdk_ad_parse_performance", "default").t(c.Bw().cI(str).cJ(str2).setErrorCode(100013).setPosId(sceneImpl.posId).setLlsid(j4)));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }
}
