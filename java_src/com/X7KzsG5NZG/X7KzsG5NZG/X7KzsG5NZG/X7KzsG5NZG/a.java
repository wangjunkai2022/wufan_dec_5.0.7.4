package com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG;

import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MApiIMediationViewBinderReversal;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig;
import com.qq.e.comm.managers.status.SDKStatus;
import java.util.Map;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C0032a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1708a;

        static {
            int[] iArr = new int[MediationConstant.BiddingLossReason.values().length];
            f1708a = iArr;
            try {
                iArr[MediationConstant.BiddingLossReason.LOW_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1708a[MediationConstant.BiddingLossReason.TIME_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1708a[MediationConstant.BiddingLossReason.NO_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1708a[MediationConstant.BiddingLossReason.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int a(MediationConstant.BiddingLossReason biddingLossReason) {
        if (biddingLossReason == null) {
            return 10001;
        }
        try {
            int i4 = C0032a.f1708a[biddingLossReason.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    return i4 != 3 ? 10001 : 2;
                }
                return 101;
            }
            return 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return 10001;
        }
    }

    public static MediationViewBinder b(Bridge bridge) {
        MApiIMediationViewBinderReversal mApiIMediationViewBinderReversal = new MApiIMediationViewBinderReversal(bridge);
        return new MediationViewBinder.Builder(mApiIMediationViewBinderReversal.getLayoutId()).callToActionId(mApiIMediationViewBinderReversal.getCallToActionId()).addExtras(mApiIMediationViewBinderReversal.getExtras()).descriptionTextId(mApiIMediationViewBinderReversal.getDecriptionTextId()).groupImage1Id(mApiIMediationViewBinderReversal.getGroupImage1Id()).groupImage1Id(mApiIMediationViewBinderReversal.getGroupImage2Id()).groupImage1Id(mApiIMediationViewBinderReversal.getGroupImage3Id()).iconImageId(mApiIMediationViewBinderReversal.getIconImageId()).mainImageId(mApiIMediationViewBinderReversal.getMainImageId()).mediaViewIdId(mApiIMediationViewBinderReversal.getMediaViewId()).logoLayoutId(mApiIMediationViewBinderReversal.getLogoLayoutId()).shakeViewContainerId(mApiIMediationViewBinderReversal.getShakeViewContainerId()).titleId(mApiIMediationViewBinderReversal.getTitleId()).sourceId(mApiIMediationViewBinderReversal.getSourceId()).build();
    }

    private static String c() {
        try {
            return SDKStatus.getIntegrationSDKVersion();
        } catch (Throwable unused) {
            return "0.0";
        }
    }

    public static void d(MediationInitConfig mediationInitConfig) {
    }

    public static boolean e(MediationAdLoaderImpl mediationAdLoaderImpl, MediationAdSlotValueSet mediationAdSlotValueSet) {
        boolean z4;
        if (mediationAdLoaderImpl != null && mediationAdSlotValueSet != null) {
            boolean h4 = h(mediationAdSlotValueSet);
            boolean isClientBidding = mediationAdLoaderImpl.isClientBidding();
            boolean i4 = i(mediationAdSlotValueSet);
            if (mediationAdLoaderImpl.getBiddingType() == 0) {
                z4 = true;
                if ((!h4 && isClientBidding) || (i4 && z4)) {
                    return true;
                }
            }
            z4 = false;
            if (!h4) {
            }
        }
        return false;
    }

    public static boolean f(MediationAdSlotValueSet mediationAdSlotValueSet) {
        Map<String, Object> params = mediationAdSlotValueSet.getParams();
        if (params == null) {
            return false;
        }
        Object obj = params.get(MediationConstant.BANNER_AUTO_HEIGHT);
        try {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean g(String str) {
        String c5 = c();
        return (TextUtils.isEmpty(c5) || TextUtils.isEmpty(str) || c5.compareTo(str) < 0) ? false : true;
    }

    private static boolean h(MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (mediationAdSlotValueSet.getExtraObject() != null) {
            Object obj = mediationAdSlotValueSet.getExtraObject().get("dynamic_adapter_type");
            return (obj instanceof Integer) && ((Integer) obj).intValue() == 1;
        }
        return false;
    }

    private static boolean i(MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (mediationAdSlotValueSet.getExtraObject() != null) {
            Object obj = mediationAdSlotValueSet.getExtraObject().get("wf_dynamic_adapter_type");
            return (obj instanceof Integer) && ((Integer) obj).intValue() == 1;
        }
        return false;
    }
}
