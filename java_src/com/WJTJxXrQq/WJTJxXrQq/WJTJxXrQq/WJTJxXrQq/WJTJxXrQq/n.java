package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MApiIMediationViewBinderReversal;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import com.kwad.sdk.api.model.AdnName;
import java.util.Map;
/* loaded from: classes2.dex */
public class n {
    public static float a(Context context, float f5) {
        if (context == null) {
            return 0.0f;
        }
        return (f5 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int b(int i4) {
        if (i4 != 1) {
            return i4 != 2 ? -1 : 3;
        }
        return 4;
    }

    public static int c(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
    }

    public static long d(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("bidEcpm");
            if (obj instanceof Double) {
                return ((Double) obj).longValue();
            }
        }
        return 0L;
    }

    public static MediationViewBinder e(Bridge bridge) {
        MApiIMediationViewBinderReversal mApiIMediationViewBinderReversal = new MApiIMediationViewBinderReversal(bridge);
        return new MediationViewBinder.Builder(mApiIMediationViewBinderReversal.getLayoutId()).callToActionId(mApiIMediationViewBinderReversal.getCallToActionId()).addExtras(mApiIMediationViewBinderReversal.getExtras()).descriptionTextId(mApiIMediationViewBinderReversal.getDecriptionTextId()).groupImage1Id(mApiIMediationViewBinderReversal.getGroupImage1Id()).groupImage1Id(mApiIMediationViewBinderReversal.getGroupImage2Id()).groupImage1Id(mApiIMediationViewBinderReversal.getGroupImage3Id()).iconImageId(mApiIMediationViewBinderReversal.getIconImageId()).mainImageId(mApiIMediationViewBinderReversal.getMainImageId()).mediaViewIdId(mApiIMediationViewBinderReversal.getMediaViewId()).logoLayoutId(mApiIMediationViewBinderReversal.getLogoLayoutId()).shakeViewContainerId(mApiIMediationViewBinderReversal.getShakeViewContainerId()).titleId(mApiIMediationViewBinderReversal.getTitleId()).sourceId(mApiIMediationViewBinderReversal.getSourceId()).build();
    }

    public static String f() {
        try {
            return KsAdSDK.getSDKVersion();
        } catch (Throwable unused) {
            return "0.0";
        }
    }

    public static boolean g(MediationAdLoaderImpl mediationAdLoaderImpl, MediationAdSlotValueSet mediationAdSlotValueSet) {
        boolean z4;
        if (mediationAdLoaderImpl != null && mediationAdSlotValueSet != null) {
            boolean h4 = h(mediationAdSlotValueSet);
            boolean isClientBidding = mediationAdLoaderImpl.isClientBidding();
            boolean m4 = m(mediationAdSlotValueSet);
            if (mediationAdLoaderImpl.getBiddingType() == 0) {
                z4 = true;
                if ((!h4 && isClientBidding) || (m4 && z4)) {
                    return true;
                }
            }
            z4 = false;
            if (!h4) {
            }
        }
        return false;
    }

    private static boolean h(MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (mediationAdSlotValueSet.getExtraObject() != null) {
            Object obj = mediationAdSlotValueSet.getExtraObject().get("dynamic_adapter_type");
            return (obj instanceof Integer) && ((Integer) obj).intValue() == 1;
        }
        return false;
    }

    public static boolean i(Object obj) {
        Class cls = Long.TYPE;
        return j(obj, "setBidEcpm", cls, cls);
    }

    private static boolean j(Object obj, String str, Class<?>... clsArr) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                obj.getClass().getMethod(str, clsArr);
                return true;
            } catch (NoSuchMethodException e5) {
                MediationApiLog.i("-------ks_no_method --------- " + e5.getMessage());
            }
        }
        return false;
    }

    public static boolean k(String str) {
        String f5 = f();
        return (TextUtils.isEmpty(f5) || TextUtils.isEmpty(str) || f5.compareTo(str) < 0) ? false : true;
    }

    public static long l(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("lossBidEcpm");
            if (obj instanceof Double) {
                return ((Double) obj).longValue();
            }
        }
        return 0L;
    }

    private static boolean m(MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (mediationAdSlotValueSet.getExtraObject() != null) {
            Object obj = mediationAdSlotValueSet.getExtraObject().get("wf_dynamic_adapter_type");
            return (obj instanceof Integer) && ((Integer) obj).intValue() == 1;
        }
        return false;
    }

    public static boolean n(Object obj) {
        return j(obj, "reportAdExposureFailed", Integer.TYPE, AdExposureFailedReason.class);
    }

    public static int o(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("failureCode");
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return 0;
    }

    public static int p(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("bidEcpm");
            if (obj instanceof Double) {
                return ((Double) obj).intValue();
            }
        }
        return 0;
    }

    public static int q(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("adType");
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return 2;
    }

    public static String r(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(MediationConstant.KEY_ADN_NAME);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return AdnName.OTHER;
    }
}
