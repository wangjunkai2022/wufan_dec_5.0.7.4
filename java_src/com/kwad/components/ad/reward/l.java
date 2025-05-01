package com.kwad.components.ad.reward;

import androidx.annotation.NonNull;
import com.kwad.components.ad.reward.model.RewardCallBackRespInfo;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class l {
    public static void a(final int i4, final g gVar) {
        com.kwad.sdk.core.network.l<com.kwad.components.core.request.e, RewardCallBackRespInfo> lVar = new com.kwad.sdk.core.network.l<com.kwad.components.core.request.e, RewardCallBackRespInfo>() { // from class: com.kwad.components.ad.reward.l.1
            @NonNull
            private static RewardCallBackRespInfo D(String str) {
                JSONObject jSONObject = new JSONObject(str);
                RewardCallBackRespInfo rewardCallBackRespInfo = new RewardCallBackRespInfo();
                rewardCallBackRespInfo.parseJson(jSONObject);
                return rewardCallBackRespInfo;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            @NonNull
            /* renamed from: gm */
            public com.kwad.components.core.request.e createRequest() {
                return new com.kwad.components.core.request.e(i4, gVar.mAdTemplate);
            }

            @Override // com.kwad.sdk.core.network.l
            @NonNull
            public final /* synthetic */ RewardCallBackRespInfo parseData(String str) {
                return D(str);
            }
        };
        if (i4 == 1) {
            lVar.request(i(gVar));
        } else if (i4 == 2) {
            lVar.request(j(gVar));
        }
    }

    private static com.kwad.sdk.core.network.o<com.kwad.components.core.request.e, RewardCallBackRespInfo> i(final g gVar) {
        return new com.kwad.sdk.core.network.o<com.kwad.components.core.request.e, RewardCallBackRespInfo>() { // from class: com.kwad.components.ad.reward.l.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            /* renamed from: a */
            public void onStartRequest(@NonNull com.kwad.components.core.request.e eVar) {
                eVar.RY = System.currentTimeMillis();
                com.kwad.components.ad.reward.check.a.b(g.this.mAdTemplate, 1);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            /* renamed from: a */
            public void onSuccess(@NonNull com.kwad.components.core.request.e eVar, @NonNull final RewardCallBackRespInfo rewardCallBackRespInfo) {
                bo.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.l.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.mCheckExposureResult = rewardCallBackRespInfo.result == 1;
                    }
                });
                com.kwad.components.ad.reward.check.a.a(g.this.mAdTemplate, 1, System.currentTimeMillis() - eVar.RY, rewardCallBackRespInfo.result, rewardCallBackRespInfo.errorMsg);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            /* renamed from: a */
            public void onError(@NonNull com.kwad.components.core.request.e eVar, int i4, String str) {
                super.onError(eVar, i4, str);
                bo.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.l.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.mCheckExposureResult = false;
                    }
                });
                com.kwad.components.ad.reward.check.a.a(g.this.mAdTemplate, 1, System.currentTimeMillis() - eVar.RY, i4, str);
            }
        };
    }

    private static com.kwad.sdk.core.network.o<com.kwad.components.core.request.e, RewardCallBackRespInfo> j(final g gVar) {
        return new com.kwad.sdk.core.network.o<com.kwad.components.core.request.e, RewardCallBackRespInfo>() { // from class: com.kwad.components.ad.reward.l.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            /* renamed from: a */
            public void onStartRequest(@NonNull com.kwad.components.core.request.e eVar) {
                eVar.RY = System.currentTimeMillis();
                com.kwad.components.ad.reward.check.a.b(g.this.mAdTemplate, 2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            /* renamed from: a */
            public void onSuccess(@NonNull com.kwad.components.core.request.e eVar, @NonNull final RewardCallBackRespInfo rewardCallBackRespInfo) {
                bo.runOnUiThread(new az() { // from class: com.kwad.components.ad.reward.l.3.1
                    @Override // com.kwad.sdk.utils.az
                    public final void doTask() {
                        if (rewardCallBackRespInfo.result == 1) {
                            g.this.ph = 1;
                        } else {
                            g.this.ph = 2;
                        }
                        g.this.oJ.onRewardVerify();
                    }
                });
                com.kwad.components.ad.reward.check.a.a(g.this.mAdTemplate, 2, System.currentTimeMillis() - eVar.RY, rewardCallBackRespInfo.result, rewardCallBackRespInfo.errorMsg);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            /* renamed from: a */
            public void onError(@NonNull com.kwad.components.core.request.e eVar, int i4, String str) {
                super.onError(eVar, i4, str);
                bo.runOnUiThread(new az() { // from class: com.kwad.components.ad.reward.l.3.2
                    @Override // com.kwad.sdk.utils.az
                    public final void doTask() {
                        g.this.ph = 2;
                    }
                });
                com.kwad.components.ad.reward.check.a.a(g.this.mAdTemplate, 2, System.currentTimeMillis() - eVar.RY, i4, str);
            }
        };
    }

    private static boolean k(g gVar) {
        return !gVar.pi && com.kwad.sdk.core.response.b.a.db(com.kwad.sdk.core.response.b.e.dS(gVar.mAdTemplate));
    }

    public static void a(g gVar, long j4, long j5, long j6) {
        boolean k4 = k(gVar);
        long cZ = k4 ? com.kwad.sdk.core.response.b.a.cZ(com.kwad.sdk.core.response.b.e.dS(gVar.mAdTemplate)) : 0L;
        if (gVar.pi || !k4 || !gVar.mCheckExposureResult || j4 <= ((j5 - 800) - j6) - cZ || cZ <= 0) {
            return;
        }
        if (com.kwad.sdk.core.response.b.a.da(com.kwad.sdk.core.response.b.e.dS(gVar.mAdTemplate))) {
            gVar.ph = 1;
            a(2, gVar);
        } else {
            gVar.oJ.onRewardVerify();
        }
        gVar.pi = true;
    }
}
