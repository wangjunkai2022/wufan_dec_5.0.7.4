package com.kwad.sdk.core.response.b;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.AdVideoPreCacheConfig;
import com.kwad.sdk.core.response.model.PhotoInfo;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.service.ServiceProvider;
import java.util.List;
/* loaded from: classes5.dex */
public final class e {
    public static boolean F(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return false;
        }
        AdInfo dS = dS(adTemplate);
        return (a.aE(dS) || a.cS(dS) || ea(adTemplate) != 3) ? false : true;
    }

    @Nullable
    private static g FR() {
        com.kwad.sdk.service.a.f fVar = (com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class);
        if (fVar != null) {
            return fVar.uh();
        }
        return null;
    }

    @Nullable
    public static AdTemplate a(List<AdTemplate> list, long j4, int i4) {
        if (j4 >= 0 && list != null) {
            for (AdTemplate adTemplate : list) {
                if (c(adTemplate, j4, i4)) {
                    return adTemplate;
                }
            }
        }
        return null;
    }

    public static boolean b(List<AdTemplate> list, long j4, int i4) {
        AdTemplate a5 = a(list, j4, i4);
        if (a5 == null) {
            return false;
        }
        long ec = ec(a5);
        int dM = dM(a5);
        if (i4 > 0) {
            if (ec != j4 || dM != i4) {
                return false;
            }
        } else if (ec != j4) {
            return false;
        }
        return true;
    }

    public static boolean c(AdTemplate adTemplate, long j4, int i4) {
        long ec = ec(adTemplate);
        int dM = dM(adTemplate);
        if (i4 > 0) {
            if (ec == j4 && dM == i4) {
                return true;
            }
        } else if (ec == j4) {
            return true;
        }
        return false;
    }

    public static boolean dK(@NonNull AdTemplate adTemplate) {
        return (adTemplate.realShowType != 2 || adTemplate.adInfoList.isEmpty() || adTemplate.adInfoList.get(0) == null) ? false : true;
    }

    public static long dL(@NonNull AdTemplate adTemplate) {
        return adTemplate.posId;
    }

    public static int dM(@NonNull AdTemplate adTemplate) {
        return adTemplate.adStyle;
    }

    @Deprecated
    public static int dN(AdTemplate adTemplate) {
        if (adTemplate != null) {
            SceneImpl sceneImpl = adTemplate.mAdScene;
            return (sceneImpl == null || sceneImpl.adStyle == 0) ? dM(adTemplate) : sceneImpl.getAdStyle();
        }
        return 0;
    }

    public static int dO(@NonNull AdTemplate adTemplate) {
        return adTemplate.contentType;
    }

    public static long dP(@NonNull AdTemplate adTemplate) {
        return adTemplate.llsid;
    }

    public static String dQ(@NonNull AdTemplate adTemplate) {
        return adTemplate.extra;
    }

    public static String dR(@NonNull AdTemplate adTemplate) {
        return adTemplate.impAdExtra;
    }

    @NonNull
    public static AdInfo dS(@NonNull AdTemplate adTemplate) {
        AdInfo adInfo = adTemplate.adInfoList.size() > 0 ? adTemplate.adInfoList.get(0) : null;
        if (adInfo == null) {
            com.kwad.sdk.core.e.c.e("AdTemplateHelper", "adInfo in null");
            return new AdInfo();
        }
        return adInfo;
    }

    @NonNull
    public static PhotoInfo dT(@NonNull AdTemplate adTemplate) {
        return adTemplate.photoInfo;
    }

    public static String dU(@NonNull AdTemplate adTemplate) {
        if (dK(adTemplate)) {
            return a.K(dS(adTemplate));
        }
        return h.a(dT(adTemplate));
    }

    public static String dV(@NonNull AdTemplate adTemplate) {
        return dS(adTemplate).adConversionInfo.appDownloadUrl;
    }

    public static String dW(@NonNull AdTemplate adTemplate) {
        g FR = FR();
        String FV = FR == null ? "" : FR.FV();
        return TextUtils.isEmpty(FV) ? FV : a.X(dS(adTemplate));
    }

    public static String dX(@NonNull AdTemplate adTemplate) {
        if (dK(adTemplate)) {
            return a.cg(dS(adTemplate));
        }
        g FR = FR();
        return FR == null ? "" : FR.FW();
    }

    public static long dY(@NonNull AdTemplate adTemplate) {
        if (dK(adTemplate)) {
            return a.aa(dS(adTemplate));
        }
        g FR = FR();
        return FR == null ? adTemplate.hashCode() : FR.FX();
    }

    public static int dZ(@NonNull AdTemplate adTemplate) {
        g FR = FR();
        if (FR == null) {
            return 0;
        }
        return FR.FY();
    }

    public static int ea(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return -1;
        }
        return dS(adTemplate).adBaseInfo.taskType;
    }

    public static String eb(@NonNull AdTemplate adTemplate) {
        if (dK(adTemplate)) {
            return a.cD(dS(adTemplate));
        }
        return h.c(dT(adTemplate));
    }

    public static long ec(@Nullable AdTemplate adTemplate) {
        if (adTemplate == null) {
            return 0L;
        }
        return dS(adTemplate).adBaseInfo.creativeId;
    }

    public static boolean ed(AdTemplate adTemplate) {
        return dS(adTemplate).adConversionInfo.blockCallbackIfSpam && adTemplate.mCheatingFlow;
    }

    public static boolean ee(@NonNull AdTemplate adTemplate) {
        int l4 = l(adTemplate, true);
        return l4 == 1 || l4 == 2;
    }

    public static boolean ef(@NonNull AdTemplate adTemplate) {
        int l4 = l(adTemplate, false);
        return l4 == 1 || l4 == 2;
    }

    public static int eg(@NonNull AdTemplate adTemplate) {
        return dS(adTemplate).adBaseInfo.ecpm;
    }

    public static boolean eh(@NonNull AdTemplate adTemplate) {
        AdInfo dS = dS(adTemplate);
        return dS.adStyleConfInfo.adPushDownloadJumpType == 0 && dM(adTemplate) == 17 && a.aE(dS);
    }

    public static int ei(@NonNull AdTemplate adTemplate) {
        AdVideoPreCacheConfig adVideoPreCacheConfig = adTemplate.adVideoPreCacheConfig;
        if (adVideoPreCacheConfig == null) {
            com.kwad.sdk.service.a.h hVar = (com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class);
            if (hVar != null) {
                return hVar.zA();
            }
            return 800;
        }
        return adVideoPreCacheConfig.adVideoPreCacheSize;
    }

    public static boolean k(AdTemplate adTemplate, boolean z4) {
        if (adTemplate == null) {
            return false;
        }
        AdInfo dS = dS(adTemplate);
        return a.aE(dS) && !a.cS(dS) && !z4 && ea(adTemplate) == 2;
    }

    public static int l(@NonNull AdTemplate adTemplate, boolean z4) {
        int i4;
        AdInfo dS = dS(adTemplate);
        if (dM(adTemplate) == 3) {
            if (z4) {
                i4 = dS.adMatrixInfo.adDataV2.actionBarInfo.cardType;
            } else {
                i4 = dS.adMatrixInfo.adDataV2.endCardInfo.cardType;
            }
            if (i4 == 5) {
                return 1;
            }
            return i4 == 6 ? 2 : -1;
        }
        return dS.adBaseInfo.mABParams.playableStyle;
    }
}
